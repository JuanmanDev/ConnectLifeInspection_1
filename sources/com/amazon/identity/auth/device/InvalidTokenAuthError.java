package com.amazon.identity.auth.device;

import android.annotation.SuppressLint;
import com.amazon.identity.auth.device.AuthError;

@SuppressLint({"ParcelCreator"})
public class InvalidTokenAuthError extends AuthError {
    public static final long serialVersionUID = 3252084163277945567L;

    public InvalidTokenAuthError(String str) {
        super(str, AuthError.ERROR_TYPE.ERROR_INVALID_TOKEN);
    }
}
