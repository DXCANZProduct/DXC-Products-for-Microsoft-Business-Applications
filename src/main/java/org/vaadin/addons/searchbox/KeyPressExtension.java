package org.vaadin.addons.searchbox;

import java.util.Optional;
import java.util.function.Consumer;

import org.vaadin.addons.searchbox.client.KeyPressExtensionServerRpc;

import com.vaadin.server.AbstractExtension;
import com.vaadin.ui.TextField;

public class KeyPressExtension extends AbstractExtension {

    private Consumer<String> keyPressConsumer;

    private KeyPressExtensionServerRpc rpc = new KeyPressExtensionServerRpc() {

        @Override
        public void enterPressed(String searchTerm) {
            Optional.ofNullable(keyPressConsumer)
                    .ifPresent(c -> c.accept(searchTerm));
        }
    };

    KeyPressExtension(TextField textField, Consumer<String> keyPressConsumer) {
        registerRpc(rpc);

        this.keyPressConsumer = keyPressConsumer;

        super.extend(textField);
    }

    @Override
    public void remove() {
        super.remove();

        keyPressConsumer = null;
    }
}
