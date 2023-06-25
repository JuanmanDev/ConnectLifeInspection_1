package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zztm;
import com.google.android.gms.internal.p527firebaseauthapi.zzzr;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.p368h.C6388k;

/* renamed from: c.q.a.c.g.g.lo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4594lo implements C4648no {

    /* renamed from: a */
    public final int f9400a;

    /* renamed from: b */
    public final C4486ho f9401b = new C4486ho(this);

    /* renamed from: c */
    public C6331h f9402c;

    /* renamed from: d */
    public FirebaseUser f9403d;

    /* renamed from: e */
    public Object f9404e;

    /* renamed from: f */
    public C6388k f9405f;

    /* renamed from: g */
    public final List f9406g = new ArrayList();

    /* renamed from: h */
    public Executor f9407h;

    /* renamed from: i */
    public zzzy f9408i;

    /* renamed from: j */
    public zzzr f9409j;

    /* renamed from: k */
    public AuthCredential f9410k;

    /* renamed from: l */
    public String f9411l;

    /* renamed from: m */
    public String f9412m;

    /* renamed from: n */
    public zztm f9413n;

    /* renamed from: o */
    public boolean f9414o;

    /* renamed from: p */
    public Object f9415p;

    /* renamed from: q */
    public Status f9416q;

    /* renamed from: r */
    public C4567ko f9417r;

    public C4594lo(int i) {
        this.f9400a = i;
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ void m12448h(C4594lo loVar) {
        loVar.mo25800b();
        C3495o.m8912n(loVar.f9414o, "no success or failure set on method implementation");
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ void m12449i(C4594lo loVar, Status status) {
        C6388k kVar = loVar.f9405f;
        if (kVar != null) {
            kVar.mo30449b(status);
        }
    }

    /* renamed from: b */
    public abstract void mo25800b();

    /* renamed from: c */
    public final C4594lo mo26290c(Object obj) {
        C3495o.m8909k(obj, "external callback cannot be null");
        this.f9404e = obj;
        return this;
    }

    /* renamed from: d */
    public final C4594lo mo26291d(C6388k kVar) {
        C3495o.m8909k(kVar, "external failure callback cannot be null");
        this.f9405f = kVar;
        return this;
    }

    /* renamed from: e */
    public final C4594lo mo26292e(C6331h hVar) {
        C3495o.m8909k(hVar, "firebaseApp cannot be null");
        this.f9402c = hVar;
        return this;
    }

    /* renamed from: f */
    public final C4594lo mo26293f(FirebaseUser firebaseUser) {
        C3495o.m8909k(firebaseUser, "firebaseUser cannot be null");
        this.f9403d = firebaseUser;
        return this;
    }

    /* renamed from: j */
    public final void mo26294j(Status status) {
        this.f9414o = true;
        this.f9416q = status;
        this.f9417r.mo26187a((Object) null, status);
    }

    /* renamed from: k */
    public final void mo26295k(Object obj) {
        this.f9414o = true;
        this.f9415p = obj;
        this.f9417r.mo26187a(obj, (Status) null);
    }
}
