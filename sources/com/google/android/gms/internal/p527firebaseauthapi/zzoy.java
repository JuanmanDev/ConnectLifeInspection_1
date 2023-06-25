package com.google.android.gms.internal.p527firebaseauthapi;

import p040c.p200q.p201a.p264c.p294g.p333g.C4598m1;
import p040c.p200q.p201a.p264c.p294g.p333g.C4625n1;
import p040c.p200q.p201a.p264c.p294g.p333g.C4931yi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum zzoy implements C4598m1 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public static final C4625n1 zzg = null;
    public final int zzi;

    /* access modifiers changed from: public */
    static {
        zzg = new C4931yi();
    }

    /* access modifiers changed from: public */
    zzoy(int i) {
        this.zzi = i;
    }

    public static zzoy zzb(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
