package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;

/* renamed from: c.q.a.c.g.g.r1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C4732r1 {

    /* renamed from: a */
    public volatile C4572l2 f9591a;

    /* renamed from: b */
    public volatile zzacc f9592b;

    static {
        C4913y0 y0Var = C4913y0.f9740b;
    }

    /* renamed from: a */
    public final int mo26591a() {
        if (this.f9592b != null) {
            return ((C4435g0) this.f9592b).f9240e.length;
        }
        if (this.f9591a != null) {
            return this.f9591a.mo26155n();
        }
        return 0;
    }

    /* renamed from: b */
    public final zzacc mo26592b() {
        if (this.f9592b != null) {
            return this.f9592b;
        }
        synchronized (this) {
            if (this.f9592b != null) {
                zzacc zzacc = this.f9592b;
                return zzacc;
            }
            if (this.f9591a == null) {
                this.f9592b = zzacc.zzb;
            } else {
                this.f9592b = this.f9591a.mo26232j();
            }
            zzacc zzacc2 = this.f9592b;
            return zzacc2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26593c(p040c.p200q.p201a.p264c.p294g.p333g.C4572l2 r2) {
        /*
            r1 = this;
            c.q.a.c.g.g.l2 r0 = r1.f9591a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            c.q.a.c.g.g.l2 r0 = r1.f9591a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f9591a = r2     // Catch:{ zzadn -> 0x0011 }
            com.google.android.gms.internal.firebase-auth-api.zzacc r0 = com.google.android.gms.internal.p527firebaseauthapi.zzacc.zzb     // Catch:{ zzadn -> 0x0011 }
            r1.f9592b = r0     // Catch:{ zzadn -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f9591a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.firebase-auth-api.zzacc r2 = com.google.android.gms.internal.p527firebaseauthapi.zzacc.zzb     // Catch:{ all -> 0x001b }
            r1.f9592b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4732r1.mo26593c(c.q.a.c.g.g.l2):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4732r1)) {
            return false;
        }
        C4732r1 r1Var = (C4732r1) obj;
        C4572l2 l2Var = this.f9591a;
        C4572l2 l2Var2 = r1Var.f9591a;
        if (l2Var == null && l2Var2 == null) {
            return mo26592b().equals(r1Var.mo26592b());
        }
        if (l2Var != null && l2Var2 != null) {
            return l2Var.equals(l2Var2);
        }
        if (l2Var != null) {
            r1Var.mo26593c(l2Var.mo26048a());
            return l2Var.equals(r1Var.f9591a);
        }
        mo26593c(l2Var2.mo26048a());
        return this.f9591a.equals(l2Var2);
    }

    public int hashCode() {
        return 1;
    }
}
