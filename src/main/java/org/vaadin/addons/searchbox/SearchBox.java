package org.vaadin.addons.searchbox;

import java.util.Optional;

import org.vaadin.addons.autocomplete.AutocompleteExtension;
import org.vaadin.addons.autocomplete.converter.SuggestionCaptionConverter;
import org.vaadin.addons.autocomplete.converter.SuggestionValueConverter;
import org.vaadin.addons.autocomplete.generator.SuggestionGenerator;
import org.vaadin.addons.searchbox.event.SearchEvent;
import org.vaadin.addons.searchbox.event.SearchListener;

import com.vaadin.server.Resource;
import com.vaadin.shared.Registration;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.themes.ValoTheme;

/**
 * Search Box component with autocomplete functionality.
 * <p>
 * The search box consists of a search field and an optional search button on
 * either the left or the right side of the field. By pressing the button or the
 * ENTER key, a {@link SearchEvent} is fired containing the text field's value
 * as the search term. The search event can be handled by attaching a {@link
 * SearchListener} to the search box component.
 * <p>
 * The search event is fired explicitly on search command (e.g. by pressing the
 * search button), or, depending on the search mode, possibly a short time after
 * the user stopped typing in the field or even after every key press.
 * <p>
 * For helping the user with the search, it is possible to show search
 * suggestions in a selectable drop down list. The suggestions are generated for
 * the current query by a {@link SuggestionGenerator}.
 * <p>
 * Search field and search button are customizable through special methods or by
 * accessing the components directly.
 *
 * @see SearchMode
 * @see ButtonPosition
 */
public class SearchBox extends CustomComponent implements
        Component.Focusable {

    private static final String STYLE_SEARCH_BOX_WRAPPER = "v-search-box-wrapper";
    private static final String STYLE_BUTTON_LEFT = "button-left";
    private static final String STYLE_BUTTON_RIGHT = "button-right";
    private static final String STYLE_BUTTON_JOINED = "button-joined";

    private final CssLayout searchBoxLayout = new CssLayout();

    private final TextField textField = new TextField();

    private final Button searchButton = new Button();
    private ButtonPosition buttonPosition;

    private SearchMode searchMode = SearchMode.EXPLICIT;

    private AutocompleteExtension autocomplete;

    private Registration suggestionSelectHandle;
    private Registration buttonClickHandle;
    private Registration valueChangeHandle;

    private int debounceTime = 300;

    /**
     * Creates a search box component.
     */
    private SearchBox() {
        init();
    }

    /**
     * Creates a search box component with specific search button caption and
     * position.
     *
     * @param caption
     *         caption to appear on the search button
     * @param position
     *         position of the search button
     */
    public SearchBox(String caption, ButtonPosition position) {
        this();
        setSearchButtonCaption(caption);
        setSearchButtonPosition(position);
    }

    /**
     * Creates a search box component with specific search button icon and
     * position.
     *
     * @param icon
     *         resource of the icon to appear on the search button
     * @param position
     *         position of the search button
     */
    public SearchBox(Resource icon, ButtonPosition position) {
        this();
        setSearchButtonIcon(icon);
        setSearchButtonPosition(position);
    }

    private void init() {
        doLayout();
        searchBoxLayout.addStyleName(STYLE_SEARCH_BOX_WRAPPER);

        textField.setWidth(100, Unit.PERCENTAGE);

        // Search on button click
        buttonClickHandle = searchButton.addClickListener(clickEvent -> {
            fireSearchEvent(textField.getValue());
        });

        // Search on enter key press
        new KeyPressExtension(textField, this::fireSearchEvent);

        setValueChangeListener();

        setWidthUndefined();
        setCompositionRoot(searchBoxLayout);
    }

    @Override
    public void detach() {
        super.detach();

        Optional.ofNullable(suggestionSelectHandle)
                .ifPresent(Registration::remove);
        Optional.ofNullable(buttonClickHandle).ifPresent(Registration::remove);
        Optional.ofNullable(valueChangeHandle).ifPresent(Registration::remove);
    }

    /**
     * Gets the search field.
     *
     * @return search field component of this search box
     */
    public TextField getSearchField() {
        return textField;
    }

    /**
     * Gets the search button.
     *
     * @return search button component of this search box
     */
    public Button getSearchButton() {
        return searchButton;
    }

    /**
     * Sets the placeholder text for the search field.
     *
     * @param placeholder
     *         the placeholder text to be set.
     * @see TextField#setPlaceholder(String)
     */
    public void setPlaceholder(String placeholder) {
        textField.setPlaceholder(placeholder);
    }

    /**
     * Gets the placeholder text of the search field.
     *
     * @return the placeholder text currently set for the search field
     * @see TextField#getPlaceholder()
     */
    public String getPlaceholder() {
        return textField.getPlaceholder();
    }

    /**
     * Sets the search button position relative to the search field.
     *
     * @param position
     *         position of the search button relative to the search field
     */
    public void setSearchButtonPosition(ButtonPosition position) {
        if (position == null) {
            throw new IllegalArgumentException(
                    "Button position cannot be null");
        }

        boolean needsRepaint = buttonPosition != position;

        buttonPosition = position;

        if (needsRepaint) {
            doLayout();
        }
    }

    /**
     * Gets the search button position relative to the search field.
     *
     * @return position of the search button relative to the search field
     */
    public ButtonPosition getSearchButtonPosition() {
        return buttonPosition;
    }

    /**
     * Sets the icon for the search button.
     *
     * @param icon
     *         the icon resource to be shown with the search button's caption
     * @see Button#setIcon(Resource)
     */
    public void setSearchButtonIcon(Resource icon) {
        searchButton.setIcon(icon);
    }

    /**
     * Sets the icon and alternate text for the search button. An alt text is
     * shown when an image could not be loaded and read by assistive devices.
     *
     * @param icon
     *         the icon resource to be shown with the search button's caption
     * @param iconAltText
     *         string to use as alternate text
     * @see Button#setIcon(Resource, String)
     */
    public void setSearchButtonIcon(Resource icon, String iconAltText) {
        searchButton.setIcon(icon, iconAltText);
    }

    /**
     * Gets the search button's icon.
     *
     * @return the resource of the search button's icon
     * @see Button#getIcon()
     */
    public Resource getSearchButtonIcon() {
        return searchButton.getIcon();
    }

    /**
     * Gets the search button's alternate text.
     *
     * @return the alternate text of the search button
     * @see Button#getIconAlternateText()
     */
    public String getSearchButtonAltText() {
        return searchButton.getIconAlternateText();
    }

    /**
     * Sets the caption for the search button.
     *
     * @param caption
     *         caption text to be set for the search button
     * @see Button#setCaption(String)
     */
    public void setSearchButtonCaption(String caption) {
        searchButton.setCaption(caption);
    }

    /**
     * Gets the search button's caption.
     *
     * @return caption text of the search button
     * @see Button#getCaption()
     */
    public String getSearchButtonCaption() {
        return searchButton.getCaption();
    }

    /**
     * Sets whether the search button should be joined together with the search
     * field or be a separate button.
     * <p>
     * This method currently adds the {@code button-joined} style name to the
     * search box wrapper.
     *
     * @param joined
     *         {@code true} if the search button should be joined with the
     *         search field, {@code false} if the search button should be a
     *         distinctive button.
     */
    public void setButtonJoined(boolean joined) {
        if (joined) {
            searchBoxLayout.addStyleName(STYLE_BUTTON_JOINED);
        } else {
            searchBoxLayout.removeStyleName(STYLE_BUTTON_JOINED);
        }
    }

    private void doLayout() {
        searchBoxLayout.removeAllComponents();
        searchBoxLayout.removeStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
        searchBoxLayout.removeStyleName(STYLE_BUTTON_LEFT);
        searchBoxLayout.removeStyleName(STYLE_BUTTON_RIGHT);

        if (ButtonPosition.LEFT == buttonPosition) {
            searchBoxLayout.addComponent(searchButton);
            searchBoxLayout.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
            searchBoxLayout.addStyleName(STYLE_BUTTON_LEFT);
        }

        searchBoxLayout.addComponent(textField);

        if (ButtonPosition.RIGHT == buttonPosition) {
            searchBoxLayout.addComponent(searchButton);
            searchBoxLayout.addStyleName(ValoTheme.LAYOUT_COMPONENT_GROUP);
            searchBoxLayout.addStyleName(STYLE_BUTTON_RIGHT);
        }
    }

    /**
     * Adds listener for search events. Search event is fired on user input with
     * frequency depending on search mode set for the component.
     *
     * @param listener
     *         search event listener
     * @param <T>
     *         type of the suggestion items if applicable
     * @return registration handle for removing the listener
     * @see SearchEvent
     * @see #setSearchMode(SearchMode)
     */
    public <T> Registration addSearchListener(SearchListener<T> listener) {
        return addListener(SearchEvent.class, listener,
                SearchListener.SEARCH_METHOD);
    }

    /**
     * Sets the search mode for the component. The frequency of search events is
     * dependent of the search mode set here. The default is {@link
     * SearchMode#EXPLICIT}.
     *
     * @param searchMode
     *         search mode to be set for the component
     */
    public void setSearchMode(SearchMode searchMode) {
        if (searchMode == null) {
            throw new IllegalArgumentException("Search mode cannot be null");
        }

        this.searchMode = searchMode;

        setValueChangeListener();
    }

    /**
     * Gets the search mode of the component.
     *
     * @return search mode currently set for the component
     */
    public SearchMode getSearchMode() {
        return this.searchMode;
    }

    private void setValueChangeListener() {

        // Remove previous listener
        Optional.ofNullable(valueChangeHandle).ifPresent(Registration::remove);

        switch (searchMode) {
        case EAGER:
            textField.setValueChangeMode(ValueChangeMode.EAGER);
            valueChangeHandle = textField.addValueChangeListener(
                    event -> fireSearchEvent(event.getValue()));
            break;
        case DEBOUNCE:
            textField.setValueChangeMode(ValueChangeMode.LAZY);
            valueChangeHandle = textField.addValueChangeListener(
                    event -> fireSearchEvent(event.getValue()));
            textField.setValueChangeTimeout(debounceTime);
            break;
        case EXPLICIT:
            textField.setValueChangeMode(ValueChangeMode.BLUR);
            break;
        }
    }

    /**
     * Sets the timeout that needs to pass between the last key press and the
     * search event. Set search mode to {@link SearchMode#DEBOUNCE} for this
     * parameter to have an effect.
     *
     * @param millis
     *         timeout in millis before search event is fired after last key
     *         press
     * @see #setSearchMode(SearchMode)
     * @see SearchMode#DEBOUNCE
     */
    public void setDebounceTime(int millis) {
        this.debounceTime = millis;

        // Reset value change timeout if necessary
        if (searchMode == SearchMode.DEBOUNCE) {
            setValueChangeListener();
        }
    }

    /**
     * Gets the timeout that needs to pass between the last key press and the
     * search event. This parameter has an effect if the search mode is set to
     * {@link SearchMode#DEBOUNCE}.
     *
     * @return timeout in millis before search event is fired after last key
     * press
     * @see #setSearchMode(SearchMode)
     */
    public int getDebounceTime() {
        return this.debounceTime;
    }

    /**
     * Sets the suggestion generator for the search field. The generator is used
     * for creating search suggestions for user input.
     *
     * @param generator
     *         generator to be set
     * @param <T>
     *         type of the data to be generated by the suggestion generator
     * @see AutocompleteExtension#setSuggestionGenerator(SuggestionGenerator)
     */
    public <T> void setSuggestionGenerator(SuggestionGenerator<T> generator) {
        setSuggestionGenerator(generator, null, null);
    }

    /**
     * Sets the suggestion generator and suggestion converters for the search
     * field. The generator is used for creating search suggestions for the user
     * input. The value converter and caption converter transform the suggestion
     * into the value to be set for the search field and into caption to be
     * displayed as suggestion, respectively.
     *
     * @param generator
     *         generator to be set
     * @param valueConverter
     *         converter to translate suggestion to value to be set as text
     *         value when suggestion is selected
     * @param captionConverter
     *         converter to translate suggestion to safe HTML caption to be
     *         displayed for the user
     * @param <T>
     *         type of the data to be generated by the suggestion generator
     * @see AutocompleteExtension#setSuggestionGenerator(SuggestionGenerator,
     * SuggestionValueConverter, SuggestionCaptionConverter)
     */
    @SuppressWarnings("unchecked")
    public <T> void setSuggestionGenerator(SuggestionGenerator<T> generator,
            SuggestionValueConverter<T> valueConverter,
            SuggestionCaptionConverter<T> captionConverter) {
        // Remove current generator if present
        removeSuggestionGenerator();

        // Add new generator
        if (generator != null) {
            autocomplete = new AutocompleteExtension<T>(textField);
            autocomplete.setSuggestionGenerator(generator, valueConverter,
                    captionConverter);

            // Fire search event on selecting suggestion
            suggestionSelectHandle = autocomplete.addSuggestionSelectListener(
                    event -> fireSearchEvent(event.getSelectedValue(),
                            event.getSelectedItem().orElse(null)));
        }
    }

    /**
     * Sets the maximum size of the suggestion list if a generator is present.
     *
     * @param size
     *         desired maximum size of the suggestion list
     * @see #setSuggestionGenerator(SuggestionGenerator)
     */
    public void setSuggestionListSize(int size) {
        if (autocomplete != null) {
            autocomplete.setSuggestionListSize(size);
        }
    }

    /**
     * Gets the maximum size of the suggestion list if a suggestion generator is
     * present.
     *
     * @return size of the suggestion list, or {@code -1} if generator is not
     * set
     */
    public int getSuggestionListSize() {
        return Optional.ofNullable(autocomplete)
                .map(AutocompleteExtension::getSuggestionListSize).orElse(-1);
    }

    /**
     * Sets the delay between the last typed character and the suggestion query.
     * Does not have effect when suggestion generator isn't set.
     *
     * @param delayInMillis
     *         delay in milliseconds
     * @see #setSuggestionGenerator(SuggestionGenerator)
     */
    public void setSuggestionDelay(int delayInMillis) {
        if (autocomplete != null) {
            autocomplete.setSuggestionDelay(delayInMillis);
        }
    }

    /**
     * Gets the delay between the last typed character and the suggestion query.
     *
     * @return delay in milliseconds, or {@code -1} if generator is not set
     */
    public int getSuggestionDelay() {
        return Optional.ofNullable(autocomplete)
                .map(AutocompleteExtension::getSuggestionDelay).orElse(-1);
    }

    /**
     * Removes suggestion generator and autocomplete functionality from the
     * search field.
     */
    public void removeSuggestionGenerator() {
        Optional.ofNullable(suggestionSelectHandle)
                .ifPresent(Registration::remove);
        Optional.ofNullable(autocomplete)
                .ifPresent(AutocompleteExtension::remove);
    }

    /**
     * Search command that fires a {@link SearchEvent} with the current search
     * field value.
     * <p>
     * Call this method to initiate search command programmatically.
     *
     * @see SearchListener
     */
    public void search() {
        fireSearchEvent(textField.getValue());
    }

    private void fireSearchEvent(String searchTerm) {
        fireEvent(new SearchEvent(this, searchTerm));
    }

    private <T> void fireSearchEvent(String searchTerm, T selectedItem) {
        fireEvent(new SearchEvent<>(this, searchTerm, selectedItem));
    }

    /**
     * Sets the focus on the search field.
     */
    @Override
    public void focus() {
        textField.focus();
    }

    /**
     * Gets the tabulator index of the search field.
     */
    @Override
    public int getTabIndex() {
        return textField.getTabIndex();
    }

    /**
     * Sets the tabulator index of the search field.
     */
    @Override
    public void setTabIndex(int tabIndex) {
        textField.setTabIndex(tabIndex);
    }

    /**
     * Search button positions.
     */
    public enum ButtonPosition {
        /**
         * Search button on the right hand side of the search field.
         */
        RIGHT,

        /**
         * Search button on the left hand side of the search field.
         */
        LEFT,

        /**
         * No button on either side of the search field.
         */
        HIDDEN
    }

    /**
     * Search mode that determines how often are search events fired while
     * typing in the search field.
     *
     * @see SearchEvent
     */
    public enum SearchMode {
        /**
         * Most frequent search mode. Search event is fired on every key press.
         * <p>
         * The frequency is equivalent to {@link ValueChangeMode#EAGER} on a
         * TextField.
         */
        EAGER,

        /**
         * Search event is fired after a certain time passed after the last key
         * press. The timeout can be changed using the {@link
         * #setDebounceTime(int)} method.
         * <p>
         * The frequency is equivalent to {@link ValueChangeMode#TIMEOUT} on a
         * TextField.
         */
        DEBOUNCE,

        /**
         * Search event is fired only on explicit command, for example when
         * pressing the search button.
         */
        EXPLICIT
    }
}
