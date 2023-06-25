package com.google.firebase.auth;

import androidx.annotation.NonNull;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class FirebaseAuthMultiFactorException extends FirebaseAuthException {
    public MultiFactorResolver zza;

    public FirebaseAuthMultiFactorException(@NonNull String str, @NonNull String str2, @NonNull MultiFactorResolver multiFactorResolver) {
        super(str, str2);
        this.zza = multiFactorResolver;
    }

    @NonNull
    public MultiFactorResolver getResolver() {
        return this.zza;
    }
}
