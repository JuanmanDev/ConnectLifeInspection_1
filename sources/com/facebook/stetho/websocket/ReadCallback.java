package com.facebook.stetho.websocket;

public interface ReadCallback {
    void onCompleteFrame(byte b, byte[] bArr, int i);
}
