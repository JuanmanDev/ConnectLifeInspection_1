package org.java_websocket.exceptions;

public class IncompleteException extends Exception {
    public static final long serialVersionUID = 7330519489840500997L;
    public final int preferredSize;

    public IncompleteException(int i) {
        this.preferredSize = i;
    }

    public int getPreferredSize() {
        return this.preferredSize;
    }
}
