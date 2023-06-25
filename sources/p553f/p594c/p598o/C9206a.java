package p553f.p594c.p598o;

import java.util.ArrayList;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p602s.p603a.C9220a;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p614i.C9315c;
import p553f.p594c.p602s.p614i.C9318e;
import p630io.reactivex.exceptions.CompositeException;

/* renamed from: f.c.o.a */
/* compiled from: CompositeDisposable */
public final class C9206a implements C9207b, C9220a {

    /* renamed from: e */
    public C9318e<C9207b> f18001e;

    /* renamed from: l */
    public volatile boolean f18002l;

    /* renamed from: a */
    public boolean mo47026a(C9207b bVar) {
        if (!mo47028c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    /* renamed from: b */
    public boolean mo47027b(C9207b bVar) {
        C9227b.m24985d(bVar, "disposable is null");
        if (!this.f18002l) {
            synchronized (this) {
                if (!this.f18002l) {
                    C9318e<C9207b> eVar = this.f18001e;
                    if (eVar == null) {
                        eVar = new C9318e<>();
                        this.f18001e = eVar;
                    }
                    eVar.mo47164a(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo47028c(p553f.p594c.p598o.C9207b r3) {
        /*
            r2 = this;
            java.lang.String r0 = "disposables is null"
            p553f.p594c.p602s.p604b.C9227b.m24985d(r3, r0)
            boolean r0 = r2.f18002l
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f18002l     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            f.c.s.i.e<f.c.o.b> r0 = r2.f18001e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.mo47167e(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p594c.p598o.C9206a.mo47028c(f.c.o.b):boolean");
    }

    /* renamed from: d */
    public void mo47029d() {
        if (!this.f18002l) {
            synchronized (this) {
                if (!this.f18002l) {
                    C9318e<C9207b> eVar = this.f18001e;
                    this.f18001e = null;
                    mo47030e(eVar);
                }
            }
        }
    }

    public void dispose() {
        if (!this.f18002l) {
            synchronized (this) {
                if (!this.f18002l) {
                    this.f18002l = true;
                    C9318e<C9207b> eVar = this.f18001e;
                    this.f18001e = null;
                    mo47030e(eVar);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo47030e(C9318e<C9207b> eVar) {
        if (eVar != null) {
            ArrayList arrayList = null;
            for (Object obj : eVar.mo47165b()) {
                if (obj instanceof C9207b) {
                    try {
                        ((C9207b) obj).dispose();
                    } catch (Throwable th) {
                        C9211a.m24971b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C9315c.m25141d((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }

    /* renamed from: f */
    public boolean mo47031f() {
        return this.f18002l;
    }
}
