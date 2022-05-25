package org.vaadin.addons.searchbox.event;

import java.lang.reflect.Method;

import com.vaadin.event.ConnectorEventListener;

/**
 * Search listener for handling search events.
 * <p>
 * Attach a listener to the search box to handle search events that are fired on
 * search action or periodically.
 *
 * @param <T>
 *         type of the suggestion items if applicable
 * @see SearchEvent
 * @see org.vaadin.addons.searchbox.SearchBox#addSearchListener(SearchListener)
 */
@FunctionalInterface
public interface SearchListener<T> extends ConnectorEventListener {

    Method SEARCH_METHOD = SearchListener.class.getDeclaredMethods()[0];

    /**
     * Search method that is executed when a search event is fired.
     *
     * @param event
     *         the search event
     */
    void search(SearchEvent<T> event);
}
