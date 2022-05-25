package org.vaadin.addons.searchbox.client;

import com.vaadin.shared.communication.ServerRpc;

public interface KeyPressExtensionServerRpc extends ServerRpc {

    void enterPressed(String searchTerm);
}
