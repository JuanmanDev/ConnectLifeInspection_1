package p040c.p200q.p201a.p219b.p222d0;

import androidx.annotation.Nullable;
import java.lang.Exception;
import java.util.ArrayDeque;
import p040c.p200q.p201a.p219b.p222d0.C2634e;
import p040c.p200q.p201a.p219b.p222d0.C2635f;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.d0.g */
/* compiled from: SimpleDecoder */
public abstract class C2636g<I extends C2634e, O extends C2635f, E extends Exception> implements C2632c<I, O, E> {

    /* renamed from: a */
    public final Thread f3312a;

    /* renamed from: b */
    public final Object f3313b = new Object();

    /* renamed from: c */
    public final ArrayDeque<I> f3314c = new ArrayDeque<>();

    /* renamed from: d */
    public final ArrayDeque<O> f3315d = new ArrayDeque<>();

    /* renamed from: e */
    public final I[] f3316e;

    /* renamed from: f */
    public final O[] f3317f;

    /* renamed from: g */
    public int f3318g;

    /* renamed from: h */
    public int f3319h;

    /* renamed from: i */
    public I f3320i;

    /* renamed from: j */
    public E f3321j;

    /* renamed from: k */
    public boolean f3322k;

    /* renamed from: l */
    public boolean f3323l;

    /* renamed from: m */
    public int f3324m;

    /* renamed from: c.q.a.b.d0.g$a */
    /* compiled from: SimpleDecoder */
    public class C2637a extends Thread {
        public C2637a() {
        }

        public void run() {
            C2636g.this.mo18424t();
        }
    }

    public C2636g(I[] iArr, O[] oArr) {
        this.f3316e = iArr;
        this.f3318g = iArr.length;
        for (int i = 0; i < this.f3318g; i++) {
            this.f3316e[i] = mo18411g();
        }
        this.f3317f = oArr;
        this.f3319h = oArr.length;
        for (int i2 = 0; i2 < this.f3319h; i2++) {
            this.f3317f[i2] = mo18412h();
        }
        C2637a aVar = new C2637a();
        this.f3312a = aVar;
        aVar.start();
    }

    /* renamed from: f */
    public final boolean mo18410f() {
        return !this.f3314c.isEmpty() && this.f3319h > 0;
    }

    public final void flush() {
        synchronized (this.f3313b) {
            this.f3322k = true;
            this.f3324m = 0;
            if (this.f3320i != null) {
                mo18421q(this.f3320i);
                this.f3320i = null;
            }
            while (!this.f3314c.isEmpty()) {
                mo18421q((C2634e) this.f3314c.removeFirst());
            }
            while (!this.f3315d.isEmpty()) {
                ((C2635f) this.f3315d.removeFirst()).mo18409r();
            }
        }
    }

    /* renamed from: g */
    public abstract I mo18411g();

    /* renamed from: h */
    public abstract O mo18412h();

    /* renamed from: i */
    public abstract E mo18413i(Throwable th);

    @Nullable
    /* renamed from: j */
    public abstract E mo18414j(I i, O o, boolean z);

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.mo18390n() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.mo18385h(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.mo18389m() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.mo18385h(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.f3321j = mo18414j(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r6.f3321j = mo18413i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r6.f3321j = mo18413i(r0);
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo18415k() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f3313b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r6.f3323l     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r6.mo18410f()     // Catch:{ all -> 0x0096 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r6.f3313b     // Catch:{ all -> 0x0096 }
            r1.wait()     // Catch:{ all -> 0x0096 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r6.f3323l     // Catch:{ all -> 0x0096 }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            return r2
        L_0x001a:
            java.util.ArrayDeque<I> r1 = r6.f3314c     // Catch:{ all -> 0x0096 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0096 }
            c.q.a.b.d0.e r1 = (p040c.p200q.p201a.p219b.p222d0.C2634e) r1     // Catch:{ all -> 0x0096 }
            O[] r3 = r6.f3317f     // Catch:{ all -> 0x0096 }
            int r4 = r6.f3319h     // Catch:{ all -> 0x0096 }
            r5 = 1
            int r4 = r4 - r5
            r6.f3319h = r4     // Catch:{ all -> 0x0096 }
            r3 = r3[r4]     // Catch:{ all -> 0x0096 }
            boolean r4 = r6.f3322k     // Catch:{ all -> 0x0096 }
            r6.f3322k = r2     // Catch:{ all -> 0x0096 }
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            boolean r0 = r1.mo18390n()
            if (r0 == 0) goto L_0x003c
            r0 = 4
            r3.mo18385h(r0)
            goto L_0x0069
        L_0x003c:
            boolean r0 = r1.mo18389m()
            if (r0 == 0) goto L_0x0047
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo18385h(r0)
        L_0x0047:
            java.lang.Exception r0 = r6.mo18414j(r1, r3, r4)     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            r6.f3321j = r0     // Catch:{ RuntimeException -> 0x0056, OutOfMemoryError -> 0x004e }
            goto L_0x005d
        L_0x004e:
            r0 = move-exception
            java.lang.Exception r0 = r6.mo18413i(r0)
            r6.f3321j = r0
            goto L_0x005d
        L_0x0056:
            r0 = move-exception
            java.lang.Exception r0 = r6.mo18413i(r0)
            r6.f3321j = r0
        L_0x005d:
            E r0 = r6.f3321j
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r6.f3313b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            return r2
        L_0x0066:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0066 }
            throw r1
        L_0x0069:
            java.lang.Object r4 = r6.f3313b
            monitor-enter(r4)
            boolean r0 = r6.f3322k     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0074
            r3.mo18409r()     // Catch:{ all -> 0x0093 }
            goto L_0x008e
        L_0x0074:
            boolean r0 = r3.mo18389m()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0083
            int r0 = r6.f3324m     // Catch:{ all -> 0x0093 }
            int r0 = r0 + r5
            r6.f3324m = r0     // Catch:{ all -> 0x0093 }
            r3.mo18409r()     // Catch:{ all -> 0x0093 }
            goto L_0x008e
        L_0x0083:
            int r0 = r6.f3324m     // Catch:{ all -> 0x0093 }
            r3.f3311m = r0     // Catch:{ all -> 0x0093 }
            r6.f3324m = r2     // Catch:{ all -> 0x0093 }
            java.util.ArrayDeque<O> r0 = r6.f3315d     // Catch:{ all -> 0x0093 }
            r0.addLast(r3)     // Catch:{ all -> 0x0093 }
        L_0x008e:
            r6.mo18421q(r1)     // Catch:{ all -> 0x0093 }
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            return r5
        L_0x0093:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0093 }
            throw r0
        L_0x0096:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0096 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p222d0.C2636g.mo18415k():boolean");
    }

    /* renamed from: l */
    public final I mo18399c() {
        I i;
        synchronized (this.f3313b) {
            mo18419o();
            C3151e.m7759g(this.f3320i == null);
            if (this.f3318g == 0) {
                i = null;
            } else {
                I[] iArr = this.f3316e;
                int i2 = this.f3318g - 1;
                this.f3318g = i2;
                i = iArr[i2];
            }
            this.f3320i = i;
        }
        return i;
    }

    /* renamed from: m */
    public final O mo18398b() {
        synchronized (this.f3313b) {
            mo18419o();
            if (this.f3315d.isEmpty()) {
                return null;
            }
            O o = (C2635f) this.f3315d.removeFirst();
            return o;
        }
    }

    /* renamed from: n */
    public final void mo18418n() {
        if (mo18410f()) {
            this.f3313b.notify();
        }
    }

    /* renamed from: o */
    public final void mo18419o() {
        E e = this.f3321j;
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: p */
    public final void mo18400d(I i) {
        synchronized (this.f3313b) {
            mo18419o();
            C3151e.m7753a(i == this.f3320i);
            this.f3314c.addLast(i);
            mo18418n();
            this.f3320i = null;
        }
    }

    /* renamed from: q */
    public final void mo18421q(I i) {
        i.mo18386i();
        I[] iArr = this.f3316e;
        int i2 = this.f3318g;
        this.f3318g = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: r */
    public void mo18422r(O o) {
        synchronized (this.f3313b) {
            mo18423s(o);
            mo18418n();
        }
    }

    public void release() {
        synchronized (this.f3313b) {
            this.f3323l = true;
            this.f3313b.notify();
        }
        try {
            this.f3312a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: s */
    public final void mo18423s(O o) {
        o.mo18386i();
        O[] oArr = this.f3317f;
        int i = this.f3319h;
        this.f3319h = i + 1;
        oArr[i] = o;
    }

    /* renamed from: t */
    public final void mo18424t() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (mo18415k());
    }

    /* renamed from: u */
    public final void mo18425u(int i) {
        C3151e.m7759g(this.f3318g == this.f3316e.length);
        for (I t : this.f3316e) {
            t.mo18405t(i);
        }
    }
}
