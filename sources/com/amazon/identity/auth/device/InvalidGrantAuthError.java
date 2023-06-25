package com.amazon.identity.auth.device;

import android.annotation.SuppressLint;
import com.amazon.identity.auth.device.AuthError;

@SuppressLint({"ParcelCreator"})
public class InvalidGrantAuthError extends AuthError {
    public static final long serialVersionUID = 1;

    public InvalidGrantAuthError(String str) {
        super(str, AuthError.ERROR_TYPE.ERROR_INVALID_GRANT);
    }
}
