package com.facebook.stetho.dumpapp;

public class UnexpectedFrameException extends DumpappFramingException {
    public UnexpectedFrameException(byte b, byte b2) {
        super("Expected '" + b + "', got: '" + b2 + "'");
    }
}
