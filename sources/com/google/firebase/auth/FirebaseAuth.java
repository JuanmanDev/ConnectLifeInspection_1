package com.google.firebase.auth;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p333g.C4593ln;
import p040c.p200q.p201a.p264c.p294g.p333g.C4728qn;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.C6355a;
import p040c.p200q.p363c.p367l.C6356a0;
import p040c.p200q.p363c.p367l.C6358b0;
import p040c.p200q.p363c.p367l.C6360c0;
import p040c.p200q.p363c.p367l.C6362d0;
import p040c.p200q.p363c.p367l.C6421z;
import p040c.p200q.p363c.p367l.p368h.C6371b;
import p040c.p200q.p363c.p367l.p368h.C6390m;
import p040c.p200q.p363c.p367l.p368h.C6395r;
import p040c.p200q.p363c.p367l.p368h.C6397t;
import p040c.p200q.p363c.p367l.p368h.C6398u;
import p040c.p200q.p363c.p367l.p368h.C6401x;
import p040c.p200q.p363c.p367l.p368h.C6402y;
import p040c.p200q.p363c.p393u.C6757b;
import p040c.p200q.p363c.p399w.C6796b;

/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class FirebaseAuth implements C6371b {

    /* renamed from: a */
    public C6331h f15337a;

    /* renamed from: b */
    public final List f15338b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final List f15339c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public List f15340d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public C4593ln f15341e;
    @Nullable

    /* renamed from: f */
    public FirebaseUser f15342f;

    /* renamed from: g */
    public final Object f15343g = new Object();

    /* renamed from: h */
    public String f15344h;

    /* renamed from: i */
    public final Object f15345i = new Object();

    /* renamed from: j */
    public String f15346j;

    /* renamed from: k */
    public final C6395r f15347k;

    /* renamed from: l */
    public final C6401x f15348l;

    /* renamed from: m */
    public final C6757b f15349m;

    /* renamed from: n */
    public C6397t f15350n;

    /* renamed from: o */
    public C6398u f15351o = C6398u.m17941a();

    /* renamed from: com.google.firebase.auth.FirebaseAuth$a */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public interface C8248a {
        /* renamed from: a */
        void mo37341a(@NonNull FirebaseAuth firebaseAuth);
    }

    /* renamed from: com.google.firebase.auth.FirebaseAuth$b */
    /* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
    public interface C8249b {
        /* renamed from: a */
        void mo37342a(@NonNull FirebaseAuth firebaseAuth);
    }

    public FirebaseAuth(@NonNull C6331h hVar, @NonNull C6757b bVar) {
        zzzy b;
        C4593ln lnVar = new C4593ln(hVar);
        C6395r rVar = new C6395r(hVar.mo30404j(), hVar.mo30407p());
        C6401x a = C6401x.m17944a();
        C6402y a2 = C6402y.m17948a();
        C3495o.m8908j(hVar);
        this.f15337a = hVar;
        C3495o.m8908j(lnVar);
        this.f15341e = lnVar;
        C3495o.m8908j(rVar);
        this.f15347k = rVar;
        C3495o.m8908j(a);
        this.f15348l = a;
        C3495o.m8908j(a2);
        C6402y yVar = a2;
        this.f15349m = bVar;
        FirebaseUser a3 = this.f15347k.mo30491a();
        this.f15342f = a3;
        if (!(a3 == null || (b = this.f15347k.mo30492b(a3)) == null)) {
            m22624p(this, this.f15342f, b, false, false);
        }
        this.f15348l.mo30502c(this);
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) C6331h.m17785l().mo30402h(FirebaseAuth.class);
    }

    /* renamed from: n */
    public static void m22622n(@NonNull FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            "Notifying auth state listeners about user ( " + firebaseUser.mo37354S() + " ).";
        }
        firebaseAuth.f15351o.execute(new C6356a0(firebaseAuth));
    }

    /* renamed from: o */
    public static void m22623o(@NonNull FirebaseAuth firebaseAuth, @Nullable FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            "Notifying id token listeners about user ( " + firebaseUser.mo37354S() + " ).";
        }
        firebaseAuth.f15351o.execute(new C6421z(firebaseAuth, new C6796b(firebaseUser != null ? firebaseUser.mo37359X() : null)));
    }

    /* renamed from: p */
    public static void m22624p(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzzy zzzy, boolean z, boolean z2) {
        boolean z3;
        C3495o.m8908j(firebaseUser);
        C3495o.m8908j(zzzy);
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = firebaseAuth.f15342f != null && firebaseUser.mo37354S().equals(firebaseAuth.f15342f.mo37354S());
        if (z6 || !z2) {
            FirebaseUser firebaseUser2 = firebaseAuth.f15342f;
            if (firebaseUser2 == null) {
                z3 = true;
            } else {
                boolean z7 = !firebaseUser2.mo37358W().mo33499S().equals(zzzy.mo33499S());
                if (!z6 || z7) {
                    z4 = true;
                }
                z3 = true ^ z6;
                z5 = z4;
            }
            C3495o.m8908j(firebaseUser);
            FirebaseUser firebaseUser3 = firebaseAuth.f15342f;
            if (firebaseUser3 == null) {
                firebaseAuth.f15342f = firebaseUser;
            } else {
                firebaseUser3.mo37357V(firebaseUser.mo37352Q());
                if (!firebaseUser.mo37355T()) {
                    firebaseAuth.f15342f.mo37356U();
                }
                firebaseAuth.f15342f.mo37363b0(firebaseUser.mo37351P().mo30452a());
            }
            if (z) {
                firebaseAuth.f15347k.mo30494d(firebaseAuth.f15342f);
            }
            if (z5) {
                FirebaseUser firebaseUser4 = firebaseAuth.f15342f;
                if (firebaseUser4 != null) {
                    firebaseUser4.mo37362a0(zzzy);
                }
                m22623o(firebaseAuth, firebaseAuth.f15342f);
            }
            if (z3) {
                m22622n(firebaseAuth, firebaseAuth.f15342f);
            }
            if (z) {
                firebaseAuth.f15347k.mo30495e(firebaseUser, zzzy);
            }
            FirebaseUser firebaseUser5 = firebaseAuth.f15342f;
            if (firebaseUser5 != null) {
                m22625u(firebaseAuth).mo30498d(firebaseUser5.mo37358W());
            }
        }
    }

    /* renamed from: u */
    public static C6397t m22625u(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f15350n == null) {
            C6331h hVar = firebaseAuth.f15337a;
            C3495o.m8908j(hVar);
            firebaseAuth.f15350n = new C6397t(hVar);
        }
        return firebaseAuth.f15350n;
    }

    @NonNull
    /* renamed from: a */
    public final C5771j mo37326a(boolean z) {
        return mo37337r(this.f15342f, z);
    }

    @NonNull
    /* renamed from: b */
    public C6331h mo37327b() {
        return this.f15337a;
    }

    @Nullable
    /* renamed from: c */
    public FirebaseUser mo37328c() {
        return this.f15342f;
    }

    @Nullable
    /* renamed from: d */
    public String mo37329d() {
        String str;
        synchronized (this.f15343g) {
            str = this.f15344h;
        }
        return str;
    }

    @Nullable
    /* renamed from: e */
    public String mo37330e() {
        String str;
        synchronized (this.f15345i) {
            str = this.f15346j;
        }
        return str;
    }

    /* renamed from: f */
    public void mo37331f(@NonNull String str) {
        C3495o.m8904f(str);
        synchronized (this.f15345i) {
            this.f15346j = str;
        }
    }

    @NonNull
    /* renamed from: g */
    public C5771j<AuthResult> mo37332g(@NonNull AuthCredential authCredential) {
        C3495o.m8908j(authCredential);
        AuthCredential Q = authCredential.mo37315Q();
        if (Q instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) Q;
            if (!emailAuthCredential.mo37322X()) {
                C4593ln lnVar = this.f15341e;
                C6331h hVar = this.f15337a;
                String U = emailAuthCredential.mo37319U();
                String V = emailAuthCredential.mo37320V();
                C3495o.m8904f(V);
                return lnVar.mo26280b(hVar, U, V, this.f15346j, new C6360c0(this));
            }
            String W = emailAuthCredential.mo37321W();
            C3495o.m8904f(W);
            if (mo37336q(W)) {
                return C5777m.m16413e(C4728qn.m12942a(new Status(17072)));
            }
            return this.f15341e.mo26281c(this.f15337a, emailAuthCredential, new C6360c0(this));
        } else if (!(Q instanceof PhoneAuthCredential)) {
            return this.f15341e.mo26289l(this.f15337a, Q, this.f15346j, new C6360c0(this));
        } else {
            return this.f15341e.mo26282d(this.f15337a, (PhoneAuthCredential) Q, this.f15346j, new C6360c0(this));
        }
    }

    /* renamed from: h */
    public void mo37333h() {
        mo37334l();
        C6397t tVar = this.f15350n;
        if (tVar != null) {
            tVar.mo30497c();
        }
    }

    /* renamed from: l */
    public final void mo37334l() {
        C3495o.m8908j(this.f15347k);
        FirebaseUser firebaseUser = this.f15342f;
        if (firebaseUser != null) {
            C6395r rVar = this.f15347k;
            C3495o.m8908j(firebaseUser);
            rVar.mo30493c(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", new Object[]{firebaseUser.mo37354S()}));
            this.f15342f = null;
        }
        this.f15347k.mo30493c("com.google.firebase.auth.FIREBASE_USER");
        m22623o(this, (FirebaseUser) null);
        m22622n(this, (FirebaseUser) null);
    }

    /* renamed from: m */
    public final void mo37335m(FirebaseUser firebaseUser, zzzy zzzy, boolean z) {
        m22624p(this, firebaseUser, zzzy, true, false);
    }

    /* renamed from: q */
    public final boolean mo37336q(String str) {
        C6355a b = C6355a.m17871b(str);
        return b != null && !TextUtils.equals(this.f15346j, b.mo30446c());
    }

    @NonNull
    /* renamed from: r */
    public final C5771j mo37337r(@Nullable FirebaseUser firebaseUser, boolean z) {
        if (firebaseUser == null) {
            return C5777m.m16413e(C4728qn.m12942a(new Status(17495)));
        }
        zzzy W = firebaseUser.mo37358W();
        if (!W.mo33504X() || z) {
            return this.f15341e.mo26283f(this.f15337a, firebaseUser, W.mo33500T(), new C6358b0(this));
        }
        return C5777m.m16414f(C6390m.m17917a(W.mo33499S()));
    }

    @NonNull
    /* renamed from: s */
    public final C5771j mo37338s(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        C3495o.m8908j(authCredential);
        C3495o.m8908j(firebaseUser);
        return this.f15341e.mo26284g(this.f15337a, firebaseUser, authCredential.mo37315Q(), new C6362d0(this));
    }

    @NonNull
    /* renamed from: t */
    public final C5771j mo37339t(@NonNull FirebaseUser firebaseUser, @NonNull AuthCredential authCredential) {
        C3495o.m8908j(firebaseUser);
        C3495o.m8908j(authCredential);
        AuthCredential Q = authCredential.mo37315Q();
        if (Q instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) Q;
            if ("password".equals(emailAuthCredential.mo37316R())) {
                C4593ln lnVar = this.f15341e;
                C6331h hVar = this.f15337a;
                String U = emailAuthCredential.mo37319U();
                String V = emailAuthCredential.mo37320V();
                C3495o.m8904f(V);
                return lnVar.mo26287j(hVar, firebaseUser, U, V, firebaseUser.mo37353R(), new C6362d0(this));
            }
            String W = emailAuthCredential.mo37321W();
            C3495o.m8904f(W);
            if (mo37336q(W)) {
                return C5777m.m16413e(C4728qn.m12942a(new Status(17072)));
            }
            return this.f15341e.mo26286i(this.f15337a, firebaseUser, emailAuthCredential, new C6362d0(this));
        } else if (Q instanceof PhoneAuthCredential) {
            return this.f15341e.mo26288k(this.f15337a, firebaseUser, (PhoneAuthCredential) Q, this.f15346j, new C6362d0(this));
        } else {
            return this.f15341e.mo26285h(this.f15337a, firebaseUser, Q, firebaseUser.mo37353R(), new C6362d0(this));
        }
    }

    @NonNull
    /* renamed from: v */
    public final C6757b mo37340v() {
        return this.f15349m;
    }

    @NonNull
    @Keep
    public static FirebaseAuth getInstance(@NonNull C6331h hVar) {
        return (FirebaseAuth) hVar.mo30402h(FirebaseAuth.class);
    }
}
