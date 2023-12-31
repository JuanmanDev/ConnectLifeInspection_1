package com.google.android.gms.internal.p527firebaseauthapi;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzack */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzack extends IOException {
    public zzack() {
        super(CodedOutputStream.OutOfSpaceException.MESSAGE);
    }

    public zzack(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzack(Throwable th) {
        super(CodedOutputStream.OutOfSpaceException.MESSAGE, th);
    }
}
