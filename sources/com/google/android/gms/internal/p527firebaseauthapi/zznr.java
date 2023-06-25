package com.google.android.gms.internal.p527firebaseauthapi;

import p040c.p200q.p201a.p264c.p294g.p333g.C4598m1;
import p040c.p200q.p201a.p264c.p294g.p333g.C4625n1;
import p040c.p200q.p201a.p264c.p294g.p333g.C4800th;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznr */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public enum zznr implements C4598m1 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    public static final C4625n1 zzg = null;
    public final int zzi;

    /* access modifiers changed from: public */
    static {
        zzg = new C4800th();
    }

    /* access modifiers changed from: public */
    zznr(int i) {
        this.zzi = i;
    }

    public static zznr zzb(int i) {
        if (i == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return SYMMETRIC;
        }
        if (i == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i != 4) {
            return null;
        }
        return REMOTE;
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
