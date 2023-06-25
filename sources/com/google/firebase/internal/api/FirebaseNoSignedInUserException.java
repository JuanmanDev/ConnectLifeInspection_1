package com.google.firebase.internal.api;

import androidx.annotation.NonNull;
import com.google.firebase.FirebaseException;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class FirebaseNoSignedInUserException extends FirebaseException {
    public FirebaseNoSignedInUserException(@NonNull String str) {
        super(str);
    }
}
