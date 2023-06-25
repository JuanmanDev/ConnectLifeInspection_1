package com.gigya.android.sdk.encryption;

public class EncryptionException extends RuntimeException {
    public EncryptionException(String str, Throwable th) {
        super(str, th);
    }
}
