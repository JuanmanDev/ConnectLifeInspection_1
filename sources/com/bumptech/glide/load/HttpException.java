package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    public static final long serialVersionUID = 1;
    public final int statusCode;

    public HttpException(int i) {
        this("Http request failed with status code: " + i, i);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public HttpException(String str) {
        this(str, -1);
    }

    public HttpException(String str, int i) {
        this(str, i, (Throwable) null);
    }

    public HttpException(String str, int i, @Nullable Throwable th) {
        super(str, th);
        this.statusCode = i;
    }
}
