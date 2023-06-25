package p040c.p175p.p176a.p177a;

import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import p040c.p175p.p176a.p177a.p180j.C2239b;
import p040c.p175p.p176a.p177a.p183m.C2243a;

/* renamed from: c.p.a.a.b */
/* compiled from: CacheManager */
public class C2212b {

    /* renamed from: a */
    public final PriorityQueue<C2239b> f2194a = new PriorityQueue<>(C2243a.C2244a.f2293a, this.f2198e);

    /* renamed from: b */
    public final PriorityQueue<C2239b> f2195b = new PriorityQueue<>(C2243a.C2244a.f2293a, this.f2198e);

    /* renamed from: c */
    public final List<C2239b> f2196c = new ArrayList();

    /* renamed from: d */
    public final Object f2197d = new Object();

    /* renamed from: e */
    public final C2213a f2198e = new C2213a(this);

    /* renamed from: c.p.a.a.b$a */
    /* compiled from: CacheManager */
    public class C2213a implements Comparator<C2239b> {
        public C2213a(C2212b bVar) {
        }

        /* renamed from: a */
        public int compare(C2239b bVar, C2239b bVar2) {
            if (bVar.mo17201a() == bVar2.mo17201a()) {
                return 0;
            }
            return bVar.mo17201a() > bVar2.mo17201a() ? 1 : -1;
        }
    }

    @Nullable
    /* renamed from: e */
    public static C2239b m3378e(PriorityQueue<C2239b> priorityQueue, C2239b bVar) {
        Iterator<C2239b> it = priorityQueue.iterator();
        while (it.hasNext()) {
            C2239b next = it.next();
            if (next.equals(bVar)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo17081a(Collection<C2239b> collection, C2239b bVar) {
        for (C2239b equals : collection) {
            if (equals.equals(bVar)) {
                bVar.mo17204d().recycle();
                return;
            }
        }
        collection.add(bVar);
    }

    /* renamed from: b */
    public void mo17082b(C2239b bVar) {
        synchronized (this.f2197d) {
            mo17087h();
            this.f2195b.offer(bVar);
        }
    }

    /* renamed from: c */
    public void mo17083c(C2239b bVar) {
        synchronized (this.f2196c) {
            while (this.f2196c.size() >= C2243a.C2244a.f2294b) {
                this.f2196c.remove(0).mo17204d().recycle();
            }
            mo17081a(this.f2196c, bVar);
        }
    }

    /* renamed from: d */
    public boolean mo17084d(int i, RectF rectF) {
        C2239b bVar = new C2239b(i, (Bitmap) null, rectF, true, 0);
        synchronized (this.f2196c) {
            for (C2239b equals : this.f2196c) {
                if (equals.equals(bVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: f */
    public List<C2239b> mo17085f() {
        ArrayList arrayList;
        synchronized (this.f2197d) {
            arrayList = new ArrayList(this.f2194a);
            arrayList.addAll(this.f2195b);
        }
        return arrayList;
    }

    /* renamed from: g */
    public List<C2239b> mo17086g() {
        List<C2239b> list;
        synchronized (this.f2196c) {
            list = this.f2196c;
        }
        return list;
    }

    /* renamed from: h */
    public final void mo17087h() {
        synchronized (this.f2197d) {
            while (this.f2195b.size() + this.f2194a.size() >= C2243a.C2244a.f2293a && !this.f2194a.isEmpty()) {
                this.f2194a.poll().mo17204d().recycle();
            }
            while (this.f2195b.size() + this.f2194a.size() >= C2243a.C2244a.f2293a && !this.f2195b.isEmpty()) {
                this.f2195b.poll().mo17204d().recycle();
            }
        }
    }

    /* renamed from: i */
    public void mo17088i() {
        synchronized (this.f2197d) {
            this.f2194a.addAll(this.f2195b);
            this.f2195b.clear();
        }
    }

    /* renamed from: j */
    public void mo17089j() {
        synchronized (this.f2197d) {
            Iterator<C2239b> it = this.f2194a.iterator();
            while (it.hasNext()) {
                it.next().mo17204d().recycle();
            }
            this.f2194a.clear();
            Iterator<C2239b> it2 = this.f2195b.iterator();
            while (it2.hasNext()) {
                it2.next().mo17204d().recycle();
            }
            this.f2195b.clear();
        }
        synchronized (this.f2196c) {
            for (C2239b d : this.f2196c) {
                d.mo17204d().recycle();
            }
            this.f2196c.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        return r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo17090k(int r8, android.graphics.RectF r9, int r10) {
        /*
            r7 = this;
            c.p.a.a.j.b r6 = new c.p.a.a.j.b
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r8 = r7.f2197d
            monitor-enter(r8)
            java.util.PriorityQueue<c.p.a.a.j.b> r9 = r7.f2194a     // Catch:{ all -> 0x0032 }
            c.p.a.a.j.b r9 = m3378e(r9, r6)     // Catch:{ all -> 0x0032 }
            r0 = 1
            if (r9 == 0) goto L_0x0026
            java.util.PriorityQueue<c.p.a.a.j.b> r1 = r7.f2194a     // Catch:{ all -> 0x0032 }
            r1.remove(r9)     // Catch:{ all -> 0x0032 }
            r9.mo17207f(r10)     // Catch:{ all -> 0x0032 }
            java.util.PriorityQueue<c.p.a.a.j.b> r10 = r7.f2195b     // Catch:{ all -> 0x0032 }
            r10.offer(r9)     // Catch:{ all -> 0x0032 }
            monitor-exit(r8)     // Catch:{ all -> 0x0032 }
            return r0
        L_0x0026:
            java.util.PriorityQueue<c.p.a.a.j.b> r9 = r7.f2195b     // Catch:{ all -> 0x0032 }
            c.p.a.a.j.b r9 = m3378e(r9, r6)     // Catch:{ all -> 0x0032 }
            if (r9 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            monitor-exit(r8)     // Catch:{ all -> 0x0032 }
            return r0
        L_0x0032:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0032 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p175p.p176a.p177a.C2212b.mo17090k(int, android.graphics.RectF, int):boolean");
    }
}
