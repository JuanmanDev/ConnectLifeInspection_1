package com.amazon.identity.auth.device;

import android.annotation.SuppressLint;
import com.amazon.identity.auth.device.AuthError;

@SuppressLint({"ParcelCreator"})
public class InsufficientScopeAuthError extends AuthError {
    public static final long serialVersionUID = -6744534043432690103L;

    public InsufficientScopeAuthError(String str) {
        super(str, AuthError.ERROR_TYPE.ERROR_BAD_API_PARAM);
    }
}
