package org.java_websocket.exceptions;

import java.io.IOException;
import p648m.p660d.C9645b;

public class WrappedIOException extends Exception {
    public final transient C9645b connection;
    public final IOException ioException;

    public WrappedIOException(C9645b bVar, IOException iOException) {
        this.connection = bVar;
        this.ioException = iOException;
    }

    public C9645b getConnection() {
        return this.connection;
    }

    public IOException getIOException() {
        return this.ioException;
    }
}
