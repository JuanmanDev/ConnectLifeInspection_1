package com.google.firebase.auth;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class FirebaseAuthUserCollisionException extends FirebaseAuthException {
    @Nullable
    public AuthCredential zza;
    @Nullable
    public String zzb;
    @Nullable
    public String zzc;

    public FirebaseAuthUserCollisionException(@NonNull String str, @NonNull String str2) {
        super(str, str2);
    }

    @Nullable
    public String getEmail() {
        return this.zzb;
    }

    @Nullable
    public AuthCredential getUpdatedCredential() {
        return this.zza;
    }

    @NonNull
    public final FirebaseAuthUserCollisionException zza(@NonNull AuthCredential authCredential) {
        this.zza = authCredential;
        return this;
    }

    @NonNull
    public final FirebaseAuthUserCollisionException zzb(@NonNull String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    public final FirebaseAuthUserCollisionException zzc(@NonNull String str) {
        this.zzc = str;
        return this;
    }
}
