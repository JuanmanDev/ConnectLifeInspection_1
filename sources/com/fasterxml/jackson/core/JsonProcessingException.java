package com.fasterxml.jackson.core;

import java.io.IOException;

public class JsonProcessingException extends IOException {
    public static final long serialVersionUID = 123;
    public JsonLocation _location;

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str);
        if (th != null) {
            initCause(th);
        }
        this._location = jsonLocation;
    }

    public JsonLocation getLocation() {
        return this._location;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (messageSuffix != null) {
            sb.append(messageSuffix);
        }
        if (location != null) {
            sb.append(10);
            sb.append(" at ");
            sb.append(location.toString());
        }
        return sb.toString();
    }

    public String getMessageSuffix() {
        return null;
    }

    public String getOriginalMessage() {
        return super.getMessage();
    }

    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public JsonProcessingException(String str) {
        super(str);
    }

    public JsonProcessingException(String str, JsonLocation jsonLocation) {
        this(str, jsonLocation, (Throwable) null);
    }

    public JsonProcessingException(String str, Throwable th) {
        this(str, (JsonLocation) null, th);
    }

    public JsonProcessingException(Throwable th) {
        this((String) null, (JsonLocation) null, th);
    }
}
