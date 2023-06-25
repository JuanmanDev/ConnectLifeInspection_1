package p040c.p200q.p201a.p219b;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import p040c.p200q.p201a.p219b.p261o0.C3153f;
import p040c.p200q.p201a.p219b.p261o0.C3165o;
import p040c.p200q.p201a.p219b.p261o0.C3179x;

/* renamed from: c.q.a.b.f */
/* compiled from: DefaultMediaClock */
public final class C2659f implements C3165o {

    /* renamed from: e */
    public final C3179x f3369e;

    /* renamed from: l */
    public final C2660a f3370l;
    @Nullable

    /* renamed from: m */
    public C3212u f3371m;
    @Nullable

    /* renamed from: n */
    public C3165o f3372n;

    /* renamed from: c.q.a.b.f$a */
    /* compiled from: DefaultMediaClock */
    public interface C2660a {
        /* renamed from: c */
        void mo18493c(C3206r rVar);
    }

    public C2659f(C2660a aVar, C3153f fVar) {
        this.f3370l = aVar;
        this.f3369e = new C3179x(fVar);
    }

    /* renamed from: a */
    public final void mo18485a() {
        this.f3369e.mo20050a(this.f3372n.mo18335m());
        C3206r f = this.f3372n.mo18333f();
        if (!f.equals(this.f3369e.mo18333f())) {
            this.f3369e.mo18334g(f);
            this.f3370l.mo18493c(f);
        }
    }

    /* renamed from: b */
    public final boolean mo18486b() {
        C3212u uVar = this.f3371m;
        return uVar != null && !uVar.mo18329b() && (this.f3371m.mo18330c() || !this.f3371m.mo18205i());
    }

    /* renamed from: c */
    public void mo18487c(C3212u uVar) {
        if (uVar == this.f3371m) {
            this.f3372n = null;
            this.f3371m = null;
        }
    }

    /* renamed from: d */
    public void mo18488d(C3212u uVar) {
        C3165o oVar;
        C3165o u = uVar.mo18217u();
        if (u != null && u != (oVar = this.f3372n)) {
            if (oVar == null) {
                this.f3372n = u;
                this.f3371m = uVar;
                u.mo18334g(this.f3369e.mo18333f());
                mo18485a();
                return;
            }
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    /* renamed from: e */
    public void mo18489e(long j) {
        this.f3369e.mo20050a(j);
    }

    /* renamed from: f */
    public C3206r mo18333f() {
        C3165o oVar = this.f3372n;
        if (oVar != null) {
            return oVar.mo18333f();
        }
        return this.f3369e.mo18333f();
    }

    /* renamed from: g */
    public C3206r mo18334g(C3206r rVar) {
        C3165o oVar = this.f3372n;
        if (oVar != null) {
            rVar = oVar.mo18334g(rVar);
        }
        this.f3369e.mo18334g(rVar);
        this.f3370l.mo18493c(rVar);
        return rVar;
    }

    /* renamed from: h */
    public void mo18490h() {
        this.f3369e.mo20051b();
    }

    /* renamed from: i */
    public void mo18491i() {
        this.f3369e.mo20052c();
    }

    /* renamed from: j */
    public long mo18492j() {
        if (!mo18486b()) {
            return this.f3369e.mo18335m();
        }
        mo18485a();
        return this.f3372n.mo18335m();
    }

    /* renamed from: m */
    public long mo18335m() {
        if (mo18486b()) {
            return this.f3372n.mo18335m();
        }
        return this.f3369e.mo18335m();
    }
}
