package org.java_websocket.exceptions;

public class IncompleteHandshakeException extends RuntimeException {
    public static final long serialVersionUID = 7906596804233893092L;
    public final int preferredSize;

    public IncompleteHandshakeException(int i) {
        this.preferredSize = i;
    }

    public int getPreferredSize() {
        return this.preferredSize;
    }

    public IncompleteHandshakeException() {
        this.preferredSize = 0;
    }
}
