package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c.q.a.c.g.g.oa */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4661oa {

    /* renamed from: b */
    public static final C4661oa f9520b = new C4661oa();

    /* renamed from: a */
    public final AtomicReference f9521a = new AtomicReference(new C4527jb(new C4365db(), (C4500ib) null));

    /* renamed from: b */
    public static C4661oa m12703b() {
        return f9520b;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        return new p040c.p200q.p201a.p264c.p294g.p333g.C4472ha(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        throw new com.google.android.gms.internal.p527firebaseauthapi.zzhi("Creating a LegacyProtoKey failed", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p294g.p333g.C4761s4 mo26463a(p040c.p200q.p201a.p264c.p294g.p333g.C4949za r2, p040c.p200q.p201a.p264c.p294g.p333g.C4892x5 r3) {
        /*
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.f9521a     // Catch:{ GeneralSecurityException -> 0x000d }
            java.lang.Object r0 = r0.get()     // Catch:{ GeneralSecurityException -> 0x000d }
            c.q.a.c.g.g.jb r0 = (p040c.p200q.p201a.p264c.p294g.p333g.C4527jb) r0     // Catch:{ GeneralSecurityException -> 0x000d }
            c.q.a.c.g.g.s4 r2 = r0.mo26134a(r2, r3)     // Catch:{ GeneralSecurityException -> 0x000d }
            return r2
        L_0x000d:
            c.q.a.c.g.g.ha r0 = new c.q.a.c.g.g.ha     // Catch:{ GeneralSecurityException -> 0x0013 }
            r0.<init>(r2, r3)     // Catch:{ GeneralSecurityException -> 0x0013 }
            return r0
        L_0x0013:
            r2 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzhi r3 = new com.google.android.gms.internal.firebase-auth-api.zzhi
            java.lang.String r0 = "Creating a LegacyProtoKey failed"
            r3.<init>(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4661oa.mo26463a(c.q.a.c.g.g.za, c.q.a.c.g.g.x5):c.q.a.c.g.g.s4");
    }

    /* renamed from: c */
    public final synchronized void mo26464c(C4844v9 v9Var) {
        C4365db dbVar = new C4365db((C4527jb) this.f9521a.get());
        dbVar.mo25896a(v9Var);
        this.f9521a.set(new C4527jb(dbVar, (C4500ib) null));
    }

    /* renamed from: d */
    public final synchronized void mo26465d(C4948z9 z9Var) {
        C4365db dbVar = new C4365db((C4527jb) this.f9521a.get());
        dbVar.mo25897b(z9Var);
        this.f9521a.set(new C4527jb(dbVar, (C4500ib) null));
    }

    /* renamed from: e */
    public final synchronized void mo26466e(C4767sa saVar) {
        C4365db dbVar = new C4365db((C4527jb) this.f9521a.get());
        dbVar.mo25898c(saVar);
        this.f9521a.set(new C4527jb(dbVar, (C4500ib) null));
    }

    /* renamed from: f */
    public final synchronized void mo26467f(C4871wa waVar) {
        C4365db dbVar = new C4365db((C4527jb) this.f9521a.get());
        dbVar.mo25899d(waVar);
        this.f9521a.set(new C4527jb(dbVar, (C4500ib) null));
    }
}
