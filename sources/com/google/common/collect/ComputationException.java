package com.google.common.collect;

public class ComputationException extends RuntimeException {
    public static final long serialVersionUID = 0;

    public ComputationException(Throwable th) {
        super(th);
    }
}
