package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;

/* renamed from: c.q.a.c.g.i.a9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C4984a9 {

    /* renamed from: a */
    public volatile C5295u9 f9800a;

    /* renamed from: b */
    public volatile zzje f9801b;

    static {
        C5079g8 g8Var = C5079g8.f9907c;
    }

    /* renamed from: a */
    public final int mo26938a() {
        if (this.f9801b != null) {
            return ((C5263s7) this.f9801b).f10136e.length;
        }
        if (this.f9800a != null) {
            return this.f9800a.mo27715d();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzje mo26939b() {
        if (this.f9801b != null) {
            return this.f9801b;
        }
        synchronized (this) {
            if (this.f9801b != null) {
                zzje zzje = this.f9801b;
                return zzje;
            }
            if (this.f9800a == null) {
                this.f9801b = zzje.zzb;
            } else {
                this.f9801b = this.f9800a.mo27188a();
            }
            zzje zzje2 = this.f9801b;
            return zzje2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26940c(p040c.p200q.p201a.p264c.p294g.p335i.C5295u9 r2) {
        /*
            r1 = this;
            c.q.a.c.g.i.u9 r0 = r1.f9800a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            c.q.a.c.g.i.u9 r0 = r1.f9800a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f9800a = r2     // Catch:{ zzkp -> 0x0011 }
            com.google.android.gms.internal.measurement.zzje r0 = com.google.android.gms.internal.measurement.zzje.zzb     // Catch:{ zzkp -> 0x0011 }
            r1.f9801b = r0     // Catch:{ zzkp -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f9800a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.zzje r2 = com.google.android.gms.internal.measurement.zzje.zzb     // Catch:{ all -> 0x001b }
            r1.f9801b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C4984a9.mo26940c(c.q.a.c.g.i.u9):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4984a9)) {
            return false;
        }
        C4984a9 a9Var = (C4984a9) obj;
        C5295u9 u9Var = this.f9800a;
        C5295u9 u9Var2 = a9Var.f9800a;
        if (u9Var == null && u9Var2 == null) {
            return mo26939b().equals(a9Var.mo26939b());
        }
        if (u9Var != null && u9Var2 != null) {
            return u9Var.equals(u9Var2);
        }
        if (u9Var != null) {
            a9Var.mo26940c(u9Var.mo27517e());
            return u9Var.equals(a9Var.f9800a);
        }
        mo26940c(u9Var2.mo27517e());
        return this.f9800a.equals(u9Var2);
    }

    public int hashCode() {
        return 1;
    }
}
