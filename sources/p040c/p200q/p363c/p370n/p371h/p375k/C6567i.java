package p040c.p200q.p363c.p370n.p371h.p375k;

import androidx.annotation.Nullable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;
import p040c.p200q.p363c.p370n.p371h.p374j.C6515o;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;

/* renamed from: c.q.c.n.h.k.i */
/* compiled from: UserMetadata */
public class C6567i {

    /* renamed from: a */
    public final C6557f f12394a;

    /* renamed from: b */
    public final C6515o f12395b;

    /* renamed from: c */
    public final String f12396c;

    /* renamed from: d */
    public final C6568a f12397d = new C6568a(false);

    /* renamed from: e */
    public final C6568a f12398e = new C6568a(true);

    /* renamed from: f */
    public final AtomicMarkableReference<String> f12399f = new AtomicMarkableReference<>((Object) null, false);

    /* renamed from: c.q.c.n.h.k.i$a */
    /* compiled from: UserMetadata */
    public class C6568a {

        /* renamed from: a */
        public final AtomicMarkableReference<C6553d> f12400a;

        /* renamed from: b */
        public final AtomicReference<Callable<Void>> f12401b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        public final boolean f12402c;

        public C6568a(boolean z) {
            this.f12402c = z;
            this.f12400a = new AtomicMarkableReference<>(new C6553d(64, z ? 8192 : 1024), false);
        }

        /* renamed from: a */
        public Map<String, String> mo30883a() {
            return this.f12400a.getReference().mo30832a();
        }

        /* renamed from: b */
        public /* synthetic */ Void mo30884b() {
            this.f12401b.set((Object) null);
            mo30886d();
            return null;
        }

        /* renamed from: c */
        public final void mo30885c() {
            C6550a aVar = new C6550a(this);
            if (this.f12401b.compareAndSet((Object) null, aVar)) {
                C6567i.this.f12395b.mo30704h(aVar);
            }
        }

        /* renamed from: d */
        public final void mo30886d() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f12400a.isMarked()) {
                    map = this.f12400a.getReference().mo30832a();
                    this.f12400a.set(this.f12400a.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C6567i.this.f12394a.mo30849l(C6567i.this.f12396c, map, this.f12402c);
            }
        }

        /* renamed from: e */
        public boolean mo30887e(String str, String str2) {
            synchronized (this) {
                if (!this.f12400a.getReference().mo30834d(str, str2)) {
                    return false;
                }
                this.f12400a.set(this.f12400a.getReference(), true);
                mo30885c();
                return true;
            }
        }
    }

    public C6567i(String str, C6677f fVar, C6515o oVar) {
        this.f12396c = str;
        this.f12394a = new C6557f(fVar);
        this.f12395b = oVar;
    }

    /* renamed from: h */
    public static C6567i m18495h(String str, C6677f fVar, C6515o oVar) {
        C6557f fVar2 = new C6557f(fVar);
        C6567i iVar = new C6567i(str, fVar, oVar);
        iVar.f12397d.f12400a.getReference().mo30835e(fVar2.mo30847g(str, false));
        iVar.f12398e.f12400a.getReference().mo30835e(fVar2.mo30847g(str, true));
        iVar.f12399f.set(fVar2.mo30848h(str), false);
        return iVar;
    }

    @Nullable
    /* renamed from: i */
    public static String m18496i(String str, C6677f fVar) {
        return new C6557f(fVar).mo30848h(str);
    }

    /* renamed from: d */
    public Map<String, String> mo30876d() {
        return this.f12397d.mo30883a();
    }

    /* renamed from: e */
    public Map<String, String> mo30877e() {
        return this.f12398e.mo30883a();
    }

    @Nullable
    /* renamed from: f */
    public String mo30878f() {
        return this.f12399f.getReference();
    }

    /* renamed from: g */
    public /* synthetic */ Object mo30879g() {
        mo30880j();
        return null;
    }

    /* renamed from: j */
    public final void mo30880j() {
        boolean z;
        String str;
        synchronized (this.f12399f) {
            z = false;
            if (this.f12399f.isMarked()) {
                str = mo30878f();
                this.f12399f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f12394a.mo30850m(this.f12396c, str);
        }
    }

    /* renamed from: k */
    public boolean mo30881k(String str, String str2) {
        return this.f12397d.mo30887e(str, str2);
    }

    /* renamed from: l */
    public void mo30882l(String str) {
        String c = C6553d.m18425c(str, 1024);
        synchronized (this.f12399f) {
            if (!C6513n.m18220A(c, this.f12399f.getReference())) {
                this.f12399f.set(c, true);
                this.f12395b.mo30704h(new C6551b(this));
            }
        }
    }
}
