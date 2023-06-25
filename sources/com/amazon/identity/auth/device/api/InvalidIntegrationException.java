package com.amazon.identity.auth.device.api;

public class InvalidIntegrationException extends RuntimeException {
    public static final long serialVersionUID = -1241308386328434475L;

    public InvalidIntegrationException() {
    }

    public InvalidIntegrationException(String str) {
        super(str);
    }

    public InvalidIntegrationException(String str, Throwable th) {
        super(str, th);
    }
}
