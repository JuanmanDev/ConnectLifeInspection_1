package p040c.p200q.p405d;

import com.google.protobuf.GeneratedMessageLite;

/* renamed from: c.q.d.w */
/* compiled from: GeneratedMessageInfoFactory */
public class C6995w implements C6951l0 {

    /* renamed from: a */
    public static final C6995w f13388a = new C6995w();

    /* renamed from: c */
    public static C6995w m20689c() {
        return f13388a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p405d.C6947k0 mo31934a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<com.google.protobuf.GeneratedMessageLite> r0 = com.google.protobuf.GeneratedMessageLite.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 == 0) goto L_0x0033
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0017 }
            com.google.protobuf.GeneratedMessageLite r0 = com.google.protobuf.GeneratedMessageLite.m23233t(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r0 = r0.mo37968n()     // Catch:{ Exception -> 0x0017 }
            c.q.d.k0 r0 = (p040c.p200q.p405d.C6947k0) r0     // Catch:{ Exception -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to get message info for "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L_0x0033:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported message type: "
            r1.append(r2)
            java.lang.String r5 = r5.getName()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6995w.mo31934a(java.lang.Class):c.q.d.k0");
    }

    /* renamed from: b */
    public boolean mo31935b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
