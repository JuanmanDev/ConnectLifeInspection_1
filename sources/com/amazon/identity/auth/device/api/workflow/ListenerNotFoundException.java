package com.amazon.identity.auth.device.api.workflow;

import com.amazon.identity.auth.device.api.InvalidIntegrationException;

public class ListenerNotFoundException extends InvalidIntegrationException {
    public static final long serialVersionUID = 3161216795426082455L;

    public ListenerNotFoundException() {
    }

    public ListenerNotFoundException(String str) {
        super(str);
    }

    public ListenerNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
