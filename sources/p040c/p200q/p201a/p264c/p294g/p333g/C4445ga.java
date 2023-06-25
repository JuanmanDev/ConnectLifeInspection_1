package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;

/* renamed from: c.q.a.c.g.g.ga */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4445ga extends C4521j5 {

    /* renamed from: a */
    public final String f9245a;

    /* renamed from: b */
    public final zzoy f9246b;

    public /* synthetic */ C4445ga(String str, zzoy zzoy, C4418fa faVar) {
        this.f9245a = str;
        this.f9246b = zzoy;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.f9245a;
        zzoy zzoy = this.f9246b;
        zznr zznr = zznr.UNKNOWN_KEYMATERIAL;
        zzoy zzoy2 = zzoy.UNKNOWN_PREFIX;
        int ordinal = zzoy.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
