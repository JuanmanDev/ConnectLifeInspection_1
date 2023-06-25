package org.java_websocket.exceptions;

import java.io.UnsupportedEncodingException;

public class InvalidEncodingException extends RuntimeException {
    public final UnsupportedEncodingException encodingException;

    public InvalidEncodingException(UnsupportedEncodingException unsupportedEncodingException) {
        if (unsupportedEncodingException != null) {
            this.encodingException = unsupportedEncodingException;
            return;
        }
        throw new IllegalArgumentException();
    }

    public UnsupportedEncodingException getEncodingException() {
        return this.encodingException;
    }
}
