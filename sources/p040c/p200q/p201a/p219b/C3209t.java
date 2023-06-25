package p040c.p200q.p201a.p219b;

import android.os.Handler;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.t */
/* compiled from: PlayerMessage */
public final class C3209t {

    /* renamed from: a */
    public final C3211b f6033a;

    /* renamed from: b */
    public final C3210a f6034b;

    /* renamed from: c */
    public final C2578a0 f6035c;

    /* renamed from: d */
    public int f6036d;
    @Nullable

    /* renamed from: e */
    public Object f6037e;

    /* renamed from: f */
    public Handler f6038f;

    /* renamed from: g */
    public int f6039g;

    /* renamed from: h */
    public long f6040h = -9223372036854775807L;

    /* renamed from: i */
    public boolean f6041i = true;

    /* renamed from: j */
    public boolean f6042j;

    /* renamed from: k */
    public boolean f6043k;

    /* renamed from: l */
    public boolean f6044l;

    /* renamed from: m */
    public boolean f6045m;

    /* renamed from: c.q.a.b.t$a */
    /* compiled from: PlayerMessage */
    public interface C3210a {
        /* renamed from: b */
        void mo18982b(C3209t tVar);
    }

    /* renamed from: c.q.a.b.t$b */
    /* compiled from: PlayerMessage */
    public interface C3211b {
        /* renamed from: p */
        void mo18210p(int i, @Nullable Object obj);
    }

    public C3209t(C3210a aVar, C3211b bVar, C2578a0 a0Var, int i, Handler handler) {
        this.f6034b = aVar;
        this.f6033a = bVar;
        this.f6035c = a0Var;
        this.f6038f = handler;
        this.f6039g = i;
    }

    /* renamed from: a */
    public synchronized boolean mo20169a() {
        C3151e.m7759g(this.f6042j);
        C3151e.m7759g(this.f6038f.getLooper().getThread() != Thread.currentThread());
        while (!this.f6044l) {
            wait();
        }
        return this.f6043k;
    }

    /* renamed from: b */
    public boolean mo20170b() {
        return this.f6041i;
    }

    /* renamed from: c */
    public Handler mo20171c() {
        return this.f6038f;
    }

    @Nullable
    /* renamed from: d */
    public Object mo20172d() {
        return this.f6037e;
    }

    /* renamed from: e */
    public long mo20173e() {
        return this.f6040h;
    }

    /* renamed from: f */
    public C3211b mo20174f() {
        return this.f6033a;
    }

    /* renamed from: g */
    public C2578a0 mo20175g() {
        return this.f6035c;
    }

    /* renamed from: h */
    public int mo20176h() {
        return this.f6036d;
    }

    /* renamed from: i */
    public int mo20177i() {
        return this.f6039g;
    }

    /* renamed from: j */
    public synchronized boolean mo20178j() {
        return this.f6045m;
    }

    /* renamed from: k */
    public synchronized void mo20179k(boolean z) {
        this.f6043k = z | this.f6043k;
        this.f6044l = true;
        notifyAll();
    }

    /* renamed from: l */
    public C3209t mo20180l() {
        C3151e.m7759g(!this.f6042j);
        if (this.f6040h == -9223372036854775807L) {
            C3151e.m7753a(this.f6041i);
        }
        this.f6042j = true;
        this.f6034b.mo18982b(this);
        return this;
    }

    /* renamed from: m */
    public C3209t mo20181m(@Nullable Object obj) {
        C3151e.m7759g(!this.f6042j);
        this.f6037e = obj;
        return this;
    }

    /* renamed from: n */
    public C3209t mo20182n(int i) {
        C3151e.m7759g(!this.f6042j);
        this.f6036d = i;
        return this;
    }
}
