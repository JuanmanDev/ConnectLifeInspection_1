package com.amazon.identity.auth.device.datastore;

public class EncryptionException extends Exception {
    public EncryptionException(Throwable th) {
        super(th);
    }

    public EncryptionException(String str) {
        super(str);
    }
}
