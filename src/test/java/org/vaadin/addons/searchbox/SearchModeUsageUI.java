package org.vaadin.addons.searchbox;

import java.util.ArrayList;
import java.util.List;

import org.vaadin.addonhelpers.AbstractTest;

import com.vaadin.ui.Component;
import com.vaadin.ui.Layout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.VerticalLayout;

public class SearchModeUsageUI extends AbstractTest {

    @Override
    public Component getTestComponent() {
        Layout layout = new VerticalLayout();

        SearchBox searchBox1 = new SearchBox("Eager", SearchBox.ButtonPosition.RIGHT);
        searchBox1.setSuggestionGenerator(this::suggest);
        searchBox1.setSearchMode(SearchBox.SearchMode.EAGER);
        searchBox1.addSearchListener(event -> Notification.show(event.getSearchTerm()));
        layout.addComponent(searchBox1);

        SearchBox searchBox2 = new SearchBox("Debounce", SearchBox.ButtonPosition.RIGHT);
        searchBox2.setSuggestionGenerator(this::suggest);
        searchBox2.setSearchMode(SearchBox.SearchMode.DEBOUNCE);
        searchBox2.addSearchListener(event -> Notification.show(event.getSearchTerm()));
        layout.addComponent(searchBox2);

        SearchBox searchBox3 = new SearchBox("Explicit", SearchBox.ButtonPosition.RIGHT);
        searchBox3.setSuggestionGenerator(this::suggest);
        searchBox3.setSearchMode(SearchBox.SearchMode.EXPLICIT);
        searchBox3.addSearchListener(event -> Notification.show(event.getSearchTerm()));
        layout.addComponent(searchBox3);

        return layout;
    }

    private List<String> suggest(String query, int limit) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < limit; i++) {
            list.add(query + i);
        }
        return list;
    }

}
