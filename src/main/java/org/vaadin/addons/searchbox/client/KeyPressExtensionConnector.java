package org.vaadin.addons.searchbox.client;

import org.vaadin.addons.searchbox.KeyPressExtension;

import com.vaadin.client.ServerConnector;
import com.vaadin.client.communication.RpcProxy;
import com.vaadin.client.extensions.AbstractExtensionConnector;
import com.vaadin.client.ui.VTextField;
import com.vaadin.client.ui.textfield.TextFieldConnector;
import com.vaadin.shared.ui.Connect;

import elemental.events.KeyboardEvent;

@Connect(KeyPressExtension.class)
public class KeyPressExtensionConnector extends AbstractExtensionConnector {

    private KeyPressExtensionServerRpc rpc = RpcProxy
            .create(KeyPressExtensionServerRpc.class, this);

    private VTextField textField;

    @Override
    protected void extend(ServerConnector serverConnector) {
        textField = ((TextFieldConnector) serverConnector).getWidget();

        textField.addKeyPressHandler(keyPress -> {
            if (keyPress.getCharCode() == KeyboardEvent.KeyCode.ENTER) {
                rpc.enterPressed(textField.getValue());
            }
        });
    }
}
