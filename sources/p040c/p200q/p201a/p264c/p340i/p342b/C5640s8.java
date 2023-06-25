package p040c.p200q.p201a.p264c.p340i.p342b;

import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.measurement.internal.zzah;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p040c.p200q.p201a.p264c.p265a.p266a.C3220a;

/* renamed from: c.q.a.c.i.b.s8 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5640s8 extends C5569m9 {

    /* renamed from: d */
    public final Map f10858d = new HashMap();

    /* renamed from: e */
    public final C5647t3 f10859e;

    /* renamed from: f */
    public final C5647t3 f10860f;

    /* renamed from: g */
    public final C5647t3 f10861g;

    /* renamed from: h */
    public final C5647t3 f10862h;

    /* renamed from: i */
    public final C5647t3 f10863i;

    public C5640s8(C5709y9 y9Var) {
        super(y9Var);
        C5692x3 F = this.f10699a.mo28622F();
        F.getClass();
        this.f10859e = new C5647t3(F, "last_delete_stale", 0);
        C5692x3 F2 = this.f10699a.mo28622F();
        F2.getClass();
        this.f10860f = new C5647t3(F2, "backoff", 0);
        C5692x3 F3 = this.f10699a.mo28622F();
        F3.getClass();
        this.f10861g = new C5647t3(F3, "last_upload", 0);
        C5692x3 F4 = this.f10699a.mo28622F();
        F4.getClass();
        this.f10862h = new C5647t3(F4, "last_upload_attempt", 0);
        C5692x3 F5 = this.f10699a.mo28622F();
        F5.getClass();
        this.f10863i = new C5647t3(F5, "midnight_offset", 0);
    }

    /* renamed from: l */
    public final boolean mo28087l() {
        return false;
    }

    @WorkerThread
    @Deprecated
    /* renamed from: m */
    public final Pair mo28607m(String str) {
        C5628r8 r8Var;
        mo28029h();
        long b = this.f10699a.mo28488c().mo20839b();
        C5628r8 r8Var2 = (C5628r8) this.f10858d.get(str);
        if (r8Var2 != null && b < r8Var2.f10833c) {
            return new Pair(r8Var2.f10831a, Boolean.valueOf(r8Var2.f10832b));
        }
        C3220a.m8279b(true);
        long r = b + this.f10699a.mo28649z().mo28250r(str, C5658u2.f10965b);
        try {
            C3220a.C3221a a = C3220a.m8278a(this.f10699a.mo28490f());
            if (a == null) {
                return new Pair("", Boolean.FALSE);
            }
            String a2 = a.mo20225a();
            if (a2 != null) {
                r8Var = new C5628r8(a2, a.mo20226b(), r);
            } else {
                r8Var = new C5628r8("", a.mo20226b(), r);
            }
            this.f10858d.put(str, r8Var);
            C3220a.m8279b(false);
            return new Pair(r8Var.f10831a, Boolean.valueOf(r8Var.f10832b));
        } catch (Exception e) {
            this.f10699a.mo28487b().mo28338q().mo28260b("Unable to get advertising id", e);
            r8Var = new C5628r8("", false, r);
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final Pair mo28608n(String str, C5499h hVar) {
        if (hVar.mo28326i(zzah.AD_STORAGE)) {
            return mo28607m(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    /* renamed from: o */
    public final String mo28609o(String str, boolean z) {
        mo28029h();
        String str2 = z ? (String) mo28607m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest t = C5498ga.m15695t();
        if (t == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, t.digest(str2.getBytes()))});
    }
}
