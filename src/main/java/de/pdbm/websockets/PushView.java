package de.pdbm.websockets;

import jakarta.faces.push.Push;
import jakarta.faces.push.PushContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@ViewScoped
public class PushView implements Serializable {

    @Inject
    @Push(channel = "counter")
    private PushContext running;

    public void send() {
        running.send("some message");
    }

}
