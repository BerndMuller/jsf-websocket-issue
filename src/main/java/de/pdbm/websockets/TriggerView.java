package de.pdbm.websockets;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class TriggerView {

    @Inject
    PushView pushView;

    public void send() {
        pushView.send();
    }
}
