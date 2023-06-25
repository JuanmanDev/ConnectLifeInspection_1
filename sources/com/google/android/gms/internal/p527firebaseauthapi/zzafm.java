package com.google.android.gms.internal.p527firebaseauthapi;

import p040c.p200q.p201a.p264c.p294g.p333g.C4572l2;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzafm extends RuntimeException {
    public zzafm(C4572l2 l2Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzadn zza() {
        return new zzadn(getMessage());
    }
}
