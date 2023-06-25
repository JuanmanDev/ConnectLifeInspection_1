package com.facebook.stetho.websocket;

import java.io.IOException;

public interface WriteCallback {
    void onFailure(IOException iOException);

    void onSuccess();
}
