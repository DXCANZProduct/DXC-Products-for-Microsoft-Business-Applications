package org.vaadin.addons.searchbox.event;

import java.util.Optional;

import org.vaadin.addons.searchbox.SearchBox;

import com.vaadin.ui.Component;

/**
 * Search event that is fired when a search is executed.
 * <p>
 * Depending on the search mode, the search is executed either automatically on
 * the user typing in the search field or explicitly by a search action (e.g. by
 * pressing the search button or the ENTER key).
 * <p>
 * Listen for search events by attaching a {@link SearchListener} to the search
 * box.
 *
 * @param <T>
 *         type of the suggestion items if applicable
 * @see org.vaadin.addons.searchbox.SearchBox.SearchMode
 * @see SearchBox#addSearchListener(SearchListener)
 */
public class SearchEvent<T> extends Component.Event {

    private final String query;
    private final T selectedItem;

    /**
     * Creates a search event.
     *
     * @param source
     *         search box component that initiated the event
     * @param query
     *         the search term
     */
    public SearchEvent(SearchBox source, String query) {
        this(source, query, null);
    }

    /**
     * Creates a search event.
     *
     * @param source
     *         search box component that initiated the event
     * @param query
     *         the search term
     * @param selectedItem
     *         the selected item from the suggestion list if a suggestion was
     *         selected
     */
    public SearchEvent(SearchBox source, String query, T selectedItem) {
        super(source);

        this.query = query;
        this.selectedItem = selectedItem;
    }

    /**
     * Gets the search term.
     *
     * @return search term queried by the user
     */
    public String getSearchTerm() {
        return this.query;
    }

    /**
     * Gets the item selected by from the suggestion list.
     *
     * @return the item selected from the suggestion list, or empty Optional
     */
    public Optional<T> getSelectedItem() {
        return Optional.ofNullable(selectedItem);
    }
}
