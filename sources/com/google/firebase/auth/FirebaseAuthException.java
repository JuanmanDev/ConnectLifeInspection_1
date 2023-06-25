package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class FirebaseAuthException extends FirebaseException {
    public final String zza;

    public FirebaseAuthException(@NonNull String str, @NonNull String str2) {
        super(str2);
        C3495o.m8904f(str);
        this.zza = str;
    }

    @NonNull
    public String getErrorCode() {
        return this.zza;
    }
}
