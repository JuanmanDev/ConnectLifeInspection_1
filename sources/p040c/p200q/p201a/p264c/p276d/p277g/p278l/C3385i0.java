package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3474i;

/* renamed from: c.q.a.c.d.g.l.i0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3385i0 implements C3453d.C3456c, C3418u0 {

    /* renamed from: a */
    public final C3334a.C3342f f6307a;

    /* renamed from: b */
    public final C3362b<?> f6308b;
    @Nullable

    /* renamed from: c */
    public C3474i f6309c = null;
    @Nullable

    /* renamed from: d */
    public Set<Scope> f6310d = null;

    /* renamed from: e */
    public boolean f6311e = false;

    /* renamed from: f */
    public final /* synthetic */ C3375f f6312f;

    public C3385i0(C3375f fVar, C3334a.C3342f fVar2, C3362b<?> bVar) {
        this.f6312f = fVar;
        this.f6307a = fVar2;
        this.f6308b = bVar;
    }

    /* renamed from: a */
    public final void mo20564a(@NonNull ConnectionResult connectionResult) {
        this.f6312f.f6291z.post(new C3382h0(this, connectionResult));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo20565b(ConnectionResult connectionResult) {
        C3373e0 e0Var = (C3373e0) this.f6312f.f6287v.get(this.f6308b);
        if (e0Var != null) {
            e0Var.mo20501I(connectionResult);
        }
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo20566c(@Nullable C3474i iVar, @Nullable Set<Scope> set) {
        if (iVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            mo20565b(new ConnectionResult(4));
            return;
        }
        this.f6309c = iVar;
        this.f6310d = set;
        mo20567h();
    }

    @WorkerThread
    /* renamed from: h */
    public final void mo20567h() {
        C3474i iVar;
        if (this.f6311e && (iVar = this.f6309c) != null) {
            this.f6307a.mo20422b(iVar, this.f6310d);
        }
    }
}
