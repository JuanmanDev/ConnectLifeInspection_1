package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3461e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p344k.C5731a;
import p040c.p200q.p201a.p264c.p344k.C5744f;
import p040c.p200q.p201a.p264c.p344k.C5745g;
import p040c.p200q.p201a.p264c.p344k.p345b.C5734c;

/* renamed from: c.q.a.c.d.g.l.v0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3420v0 extends C5734c implements C3348d.C3349a, C3348d.C3350b {

    /* renamed from: r */
    public static final C3334a.C3335a<? extends C5745g, C5731a> f6375r = C5744f.f11221c;

    /* renamed from: e */
    public final Context f6376e;

    /* renamed from: l */
    public final Handler f6377l;

    /* renamed from: m */
    public final C3334a.C3335a<? extends C5745g, C5731a> f6378m;

    /* renamed from: n */
    public final Set<Scope> f6379n;

    /* renamed from: o */
    public final C3461e f6380o;

    /* renamed from: p */
    public C5745g f6381p;

    /* renamed from: q */
    public C3418u0 f6382q;

    @WorkerThread
    public C3420v0(Context context, Handler handler, @NonNull C3461e eVar) {
        C3334a.C3335a<? extends C5745g, C5731a> aVar = f6375r;
        this.f6376e = context;
        this.f6377l = handler;
        C3495o.m8909k(eVar, "ClientSettings must not be null");
        this.f6380o = eVar;
        this.f6379n = eVar.mo20702g();
        this.f6378m = aVar;
    }

    /* renamed from: Z */
    public static /* bridge */ /* synthetic */ void m8719Z(C3420v0 v0Var, zak zak) {
        ConnectionResult P = zak.mo33686P();
        if (P.mo24487T()) {
            zav Q = zak.mo33687Q();
            C3495o.m8908j(Q);
            zav zav = Q;
            ConnectionResult P2 = zav.mo24611P();
            if (!P2.mo24487T()) {
                String valueOf = String.valueOf(P2);
                String.valueOf(valueOf).length();
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                v0Var.f6382q.mo20565b(P2);
                v0Var.f6381p.disconnect();
                return;
            }
            v0Var.f6382q.mo20566c(zav.mo24612Q(), v0Var.f6379n);
        } else {
            v0Var.f6382q.mo20565b(P);
        }
        v0Var.f6381p.disconnect();
    }

    @BinderThread
    /* renamed from: A */
    public final void mo20619A(zak zak) {
        this.f6377l.post(new C3416t0(this, zak));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [c.q.a.c.k.g, c.q.a.c.d.g.a$f] */
    @WorkerThread
    /* renamed from: a0 */
    public final void mo20620a0(C3418u0 u0Var) {
        C5745g gVar = this.f6381p;
        if (gVar != null) {
            gVar.disconnect();
        }
        this.f6380o.mo20706k(Integer.valueOf(System.identityHashCode(this)));
        C3334a.C3335a aVar = this.f6378m;
        Context context = this.f6376e;
        Looper looper = this.f6377l.getLooper();
        C3461e eVar = this.f6380o;
        this.f6381p = aVar.mo20326a(context, looper, eVar, eVar.mo20703h(), this, this);
        this.f6382q = u0Var;
        Set<Scope> set = this.f6379n;
        if (set == null || set.isEmpty()) {
            this.f6377l.post(new C3414s0(this));
        } else {
            this.f6381p.mo28806n();
        }
    }

    /* renamed from: b0 */
    public final void mo20621b0() {
        C5745g gVar = this.f6381p;
        if (gVar != null) {
            gVar.disconnect();
        }
    }

    @WorkerThread
    /* renamed from: d */
    public final void mo20494d(int i) {
        this.f6381p.disconnect();
    }

    @WorkerThread
    /* renamed from: e */
    public final void mo20511e(@NonNull ConnectionResult connectionResult) {
        this.f6382q.mo20565b(connectionResult);
    }

    @WorkerThread
    /* renamed from: g */
    public final void mo20495g(@Nullable Bundle bundle) {
        this.f6381p.mo28805i(this);
    }
}
