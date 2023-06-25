package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zznr;
import com.google.android.gms.internal.p527firebaseauthapi.zzoy;
import java.security.GeneralSecurityException;

/* renamed from: c.q.a.c.g.g.za */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4949za implements C4338cb {

    /* renamed from: a */
    public final String f9771a;

    /* renamed from: b */
    public final C4829uk f9772b;

    /* renamed from: c */
    public final zzacc f9773c;

    /* renamed from: d */
    public final zznr f9774d;

    /* renamed from: e */
    public final zzoy f9775e;

    /* renamed from: f */
    public final Integer f9776f;

    public C4949za(String str, zzacc zzacc, zznr zznr, zzoy zzoy, Integer num) {
        this.f9771a = str;
        this.f9772b = C4554kb.m12282b(str);
        this.f9773c = zzacc;
        this.f9774d = zznr;
        this.f9775e = zzoy;
        this.f9776f = num;
    }

    /* renamed from: a */
    public static C4949za m13709a(String str, zzacc zzacc, zznr zznr, zzoy zzoy, Integer num) {
        if (zzoy == zzoy.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new C4949za(str, zzacc, zznr, zzoy, num);
    }

    /* renamed from: b */
    public final zznr mo26881b() {
        return this.f9774d;
    }

    /* renamed from: c */
    public final C4829uk mo25787c() {
        return this.f9772b;
    }

    /* renamed from: d */
    public final zzoy mo26882d() {
        return this.f9775e;
    }

    /* renamed from: e */
    public final zzacc mo26883e() {
        return this.f9773c;
    }

    /* renamed from: f */
    public final Integer mo26884f() {
        return this.f9776f;
    }

    /* renamed from: g */
    public final String mo26885g() {
        return this.f9771a;
    }
}
