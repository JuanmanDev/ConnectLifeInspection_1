package com.facebook.stetho.server;

import android.net.LocalSocket;

public class LazySocketHandler implements SocketHandler {
    public SocketHandler mSocketHandler;
    public final SocketHandlerFactory mSocketHandlerFactory;

    public LazySocketHandler(SocketHandlerFactory socketHandlerFactory) {
        this.mSocketHandlerFactory = socketHandlerFactory;
    }

    private synchronized SocketHandler getSocketHandler() {
        if (this.mSocketHandler == null) {
            this.mSocketHandler = this.mSocketHandlerFactory.create();
        }
        return this.mSocketHandler;
    }

    public void onAccepted(LocalSocket localSocket) {
        getSocketHandler().onAccepted(localSocket);
    }
}
