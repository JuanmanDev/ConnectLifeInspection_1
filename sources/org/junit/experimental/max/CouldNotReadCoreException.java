package org.junit.experimental.max;

public class CouldNotReadCoreException extends Exception {
    public static final long serialVersionUID = 1;

    public CouldNotReadCoreException(Throwable th) {
        super(th);
    }
}
