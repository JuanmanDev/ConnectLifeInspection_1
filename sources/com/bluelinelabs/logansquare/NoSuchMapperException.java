package com.bluelinelabs.logansquare;

public class NoSuchMapperException extends RuntimeException {
    public NoSuchMapperException(Class cls) {
        super("Class " + cls.getCanonicalName() + " could not be mapped to a JSON object. Perhaps it hasn't been annotated with @JsonObject?");
    }
}
