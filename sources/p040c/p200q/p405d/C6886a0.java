package p040c.p200q.p405d;

import com.google.protobuf.ByteString;

/* renamed from: c.q.d.a0 */
/* compiled from: LazyFieldLite */
public class C6886a0 {

    /* renamed from: a */
    public ByteString f13174a;

    /* renamed from: b */
    public C6975p f13175b;

    /* renamed from: c */
    public volatile C6954m0 f13176c;

    /* renamed from: d */
    public volatile ByteString f13177d;

    static {
        C6975p.m20507b();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f13176c = r4;
        r3.f13177d = com.google.protobuf.ByteString.EMPTY;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31744a(p040c.p200q.p405d.C6954m0 r4) {
        /*
            r3 = this;
            c.q.d.m0 r0 = r3.f13176c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            c.q.d.m0 r0 = r3.f13176c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.protobuf.ByteString r0 = r3.f13174a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            c.q.d.w0 r0 = r4.mo32219i()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r1 = r3.f13174a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            c.q.d.p r2 = r3.f13175b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.mo31756a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            c.q.d.m0 r0 = (p040c.p200q.p405d.C6954m0) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f13176c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = r3.f13174a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f13177d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f13176c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f13177d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f13176c = r4     // Catch:{ all -> 0x0034 }
            com.google.protobuf.ByteString r4 = com.google.protobuf.ByteString.EMPTY     // Catch:{ all -> 0x0034 }
            r3.f13177d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6886a0.mo31744a(c.q.d.m0):void");
    }

    /* renamed from: b */
    public int mo31745b() {
        if (this.f13177d != null) {
            return this.f13177d.size();
        }
        ByteString byteString = this.f13174a;
        if (byteString != null) {
            return byteString.size();
        }
        if (this.f13176c != null) {
            return this.f13176c.mo32217e();
        }
        return 0;
    }

    /* renamed from: c */
    public C6954m0 mo31746c(C6954m0 m0Var) {
        mo31744a(m0Var);
        return this.f13176c;
    }

    /* renamed from: d */
    public C6954m0 mo31747d(C6954m0 m0Var) {
        C6954m0 m0Var2 = this.f13176c;
        this.f13174a = null;
        this.f13177d = null;
        this.f13176c = m0Var;
        return m0Var2;
    }

    /* renamed from: e */
    public ByteString mo31748e() {
        if (this.f13177d != null) {
            return this.f13177d;
        }
        ByteString byteString = this.f13174a;
        if (byteString != null) {
            return byteString;
        }
        synchronized (this) {
            if (this.f13177d != null) {
                ByteString byteString2 = this.f13177d;
                return byteString2;
            }
            if (this.f13176c == null) {
                this.f13177d = ByteString.EMPTY;
            } else {
                this.f13177d = this.f13176c.mo31731d();
            }
            ByteString byteString3 = this.f13177d;
            return byteString3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6886a0)) {
            return false;
        }
        C6886a0 a0Var = (C6886a0) obj;
        C6954m0 m0Var = this.f13176c;
        C6954m0 m0Var2 = a0Var.f13176c;
        if (m0Var == null && m0Var2 == null) {
            return mo31748e().equals(a0Var.mo31748e());
        }
        if (m0Var != null && m0Var2 != null) {
            return m0Var.equals(m0Var2);
        }
        if (m0Var != null) {
            return m0Var.equals(a0Var.mo31746c(m0Var.mo32244a()));
        }
        return mo31746c(m0Var2.mo32244a()).equals(m0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
