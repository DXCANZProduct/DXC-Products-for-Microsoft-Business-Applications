package org.vaadin.addons.searchbox;

import java.util.ArrayList;
import java.util.List;

import org.vaadin.addonhelpers.AbstractTest;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Component;
import com.vaadin.ui.Layout;
import com.vaadin.ui.VerticalLayout;

public class BasicSearchBoxUsageUI extends AbstractTest {

    @Override
    public Component getTestComponent() {
        Layout layout = new VerticalLayout();

        SearchBox searchBox1 = new SearchBox("Search", SearchBox.ButtonPosition.RIGHT);
        searchBox1.setSuggestionGenerator(this::suggest);
        layout.addComponent(searchBox1);

        SearchBox searchBox2 = new SearchBox("Search", SearchBox.ButtonPosition.LEFT);
        searchBox2.setSuggestionGenerator(this::suggest);
        layout.addComponent(searchBox2);

        SearchBox searchBox3 = new SearchBox("Search", SearchBox.ButtonPosition.HIDDEN);
        searchBox3.setSuggestionGenerator(this::suggest);
        layout.addComponent(searchBox3);

        SearchBox searchBox4 = new SearchBox("Search", SearchBox.ButtonPosition.RIGHT);
        searchBox4.setWidth("400px");
        searchBox4.setSuggestionGenerator(this::suggest);
        layout.addComponent(searchBox4);

        SearchBox searchBox5 = new SearchBox("Search", SearchBox.ButtonPosition.LEFT);
        searchBox5.setWidth("400px");
        searchBox5.setSuggestionGenerator(this::suggest);
        layout.addComponent(searchBox5);

        SearchBox searchBox6 = new SearchBox("Search", SearchBox.ButtonPosition.HIDDEN);
        searchBox6.setWidth("400px");
        searchBox6.setSuggestionGenerator(this::suggest);
        layout.addComponent(searchBox6);

        SearchBox searchBox7 = new SearchBox("Search", SearchBox.ButtonPosition.RIGHT);
        searchBox7.setWidth("400px");
        layout.addComponent(searchBox7);

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
