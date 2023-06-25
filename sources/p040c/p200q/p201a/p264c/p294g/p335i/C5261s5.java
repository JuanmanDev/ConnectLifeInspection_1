package p040c.p200q.p201a.p264c.p294g.p335i;

import android.content.Context;

/* renamed from: c.q.a.c.g.i.s5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5261s5 extends C5217p6 {

    /* renamed from: a */
    public final Context f10124a;

    /* renamed from: b */
    public final C5352y6 f10125b;

    public C5261s5(Context context, C5352y6 y6Var) {
        if (context != null) {
            this.f10124a = context;
            this.f10125b = y6Var;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public final Context mo27503a() {
        return this.f10124a;
    }

    /* renamed from: b */
    public final C5352y6 mo27504b() {
        return this.f10125b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f10125b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof p040c.p200q.p201a.p264c.p294g.p335i.C5217p6
            r2 = 0
            if (r1 == 0) goto L_0x002e
            c.q.a.c.g.i.p6 r5 = (p040c.p200q.p201a.p264c.p294g.p335i.C5217p6) r5
            android.content.Context r1 = r4.f10124a
            android.content.Context r3 = r5.mo27503a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002e
            c.q.a.c.g.i.y6 r1 = r4.f10125b
            if (r1 != 0) goto L_0x0022
            c.q.a.c.g.i.y6 r5 = r5.mo27504b()
            if (r5 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0022:
            c.q.a.c.g.i.y6 r5 = r5.mo27504b()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5261s5.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f10124a.hashCode() ^ 1000003) * 1000003;
        C5352y6 y6Var = this.f10125b;
        if (y6Var == null) {
            i = 0;
        } else {
            i = y6Var.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.f10124a.toString();
        String valueOf = String.valueOf(this.f10125b);
        return "FlagsContext{context=" + obj + ", hermeticFileOverrides=" + valueOf + "}";
    }
}
