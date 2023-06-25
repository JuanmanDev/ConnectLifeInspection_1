package p553f.p594c.p602s.p603a;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p599p.C9211a;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p602s.p614i.C9315c;
import p630io.reactivex.exceptions.CompositeException;

/* renamed from: f.c.s.a.b */
/* compiled from: ListCompositeDisposable */
public final class C9221b implements C9207b, C9220a {

    /* renamed from: e */
    public List<C9207b> f18004e;

    /* renamed from: l */
    public volatile boolean f18005l;

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
        C9227b.m24985d(bVar, "d is null");
        if (!this.f18005l) {
            synchronized (this) {
                if (!this.f18005l) {
                    List list = this.f18004e;
                    if (list == null) {
                        list = new LinkedList();
                        this.f18004e = list;
                    }
                    list.add(bVar);
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
            java.lang.String r0 = "Disposable item is null"
            p553f.p594c.p602s.p604b.C9227b.m24985d(r3, r0)
            boolean r0 = r2.f18005l
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.f18005l     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r1
        L_0x0012:
            java.util.List<f.c.o.b> r0 = r2.f18004e     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
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
        throw new UnsupportedOperationException("Method not decompiled: p553f.p594c.p602s.p603a.C9221b.mo47028c(f.c.o.b):boolean");
    }

    /* renamed from: d */
    public void mo47041d(List<C9207b> list) {
        if (list != null) {
            ArrayList arrayList = null;
            for (C9207b dispose : list) {
                try {
                    dispose.dispose();
                } catch (Throwable th) {
                    C9211a.m24971b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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

    public void dispose() {
        if (!this.f18005l) {
            synchronized (this) {
                if (!this.f18005l) {
                    this.f18005l = true;
                    List<C9207b> list = this.f18004e;
                    this.f18004e = null;
                    mo47041d(list);
                }
            }
        }
    }
}
