package com.fasterxml.jackson.core;

public class JsonGenerationException extends JsonProcessingException {
    public static final long serialVersionUID = 123;

    public JsonGenerationException(Throwable th) {
        super(th);
    }

    public JsonGenerationException(String str) {
        super(str, (JsonLocation) null);
    }

    public JsonGenerationException(String str, Throwable th) {
        super(str, (JsonLocation) null, th);
    }
}
