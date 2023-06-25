package org.java_websocket.exceptions;

public class InvalidDataException extends Exception {
    public static final long serialVersionUID = 3731842424390998726L;
    public final int closecode;

    public InvalidDataException(int i) {
        this.closecode = i;
    }

    public int getCloseCode() {
        return this.closecode;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.closecode = i;
    }

    public InvalidDataException(int i, Throwable th) {
        super(th);
        this.closecode = i;
    }

    public InvalidDataException(int i, String str, Throwable th) {
        super(str, th);
        this.closecode = i;
    }
}
