package com.amazon.identity.auth.device.utils;

public enum HashAlgorithm {
    MD5("MD5"),
    SHA_256("SHA-256");
    
    public String algorithmName;

    /* access modifiers changed from: public */
    HashAlgorithm(String str) {
        this.algorithmName = str;
    }

    public String getAlgorithmName() {
        return this.algorithmName;
    }
}
