package p040c.p200q.p353b.p356c;

import java.io.Serializable;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.c.e */
/* compiled from: HashCode */
public abstract class C6216e {

    /* renamed from: e */
    public static final char[] f11830e = "0123456789abcdef".toCharArray();

    /* renamed from: c.q.b.c.e$a */
    /* compiled from: HashCode */
    public static final class C6217a extends C6216e implements Serializable {
        public static final long serialVersionUID = 0;

        /* renamed from: l */
        public final byte[] f11831l;

        public C6217a(byte[] bArr) {
            C5850m.m16594o(bArr);
            this.f11831l = bArr;
        }

        /* renamed from: a */
        public byte[] mo30193a() {
            return (byte[]) this.f11831l.clone();
        }

        /* renamed from: b */
        public int mo30194b() {
            C5850m.m16602w(this.f11831l.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.f11831l.length);
            byte[] bArr = this.f11831l;
            return ((bArr[3] & 255) << 24) | ((bArr[1] & 255) << 8) | (bArr[0] & 255) | ((bArr[2] & 255) << 16);
        }

        /* renamed from: c */
        public long mo30195c() {
            C5850m.m16602w(this.f11831l.length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", this.f11831l.length);
            return mo30202h();
        }

        /* renamed from: d */
        public int mo30196d() {
            return this.f11831l.length * 8;
        }

        /* renamed from: e */
        public boolean mo30197e(C6216e eVar) {
            if (this.f11831l.length != eVar.mo30199g().length) {
                return false;
            }
            boolean z = true;
            int i = 0;
            while (true) {
                byte[] bArr = this.f11831l;
                if (i >= bArr.length) {
                    return z;
                }
                z &= bArr[i] == eVar.mo30199g()[i];
                i++;
            }
        }

        /* renamed from: g */
        public byte[] mo30199g() {
            return this.f11831l;
        }

        /* renamed from: h */
        public long mo30202h() {
            long j = (long) (this.f11831l[0] & 255);
            for (int i = 1; i < Math.min(this.f11831l.length, 8); i++) {
                j |= (((long) this.f11831l[i]) & 255) << (i * 8);
            }
            return j;
        }
    }

    /* renamed from: f */
    public static C6216e m17488f(byte[] bArr) {
        return new C6217a(bArr);
    }

    /* renamed from: a */
    public abstract byte[] mo30193a();

    /* renamed from: b */
    public abstract int mo30194b();

    /* renamed from: c */
    public abstract long mo30195c();

    /* renamed from: d */
    public abstract int mo30196d();

    /* renamed from: e */
    public abstract boolean mo30197e(C6216e eVar);

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6216e)) {
            return false;
        }
        C6216e eVar = (C6216e) obj;
        if (mo30196d() != eVar.mo30196d() || !mo30197e(eVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public byte[] mo30199g() {
        return mo30193a();
    }

    public final int hashCode() {
        if (mo30196d() >= 32) {
            return mo30194b();
        }
        byte[] g = mo30199g();
        byte b = g[0] & 255;
        for (int i = 1; i < g.length; i++) {
            b |= (g[i] & 255) << (i * 8);
        }
        return b;
    }

    public final String toString() {
        byte[] g = mo30199g();
        StringBuilder sb = new StringBuilder(g.length * 2);
        for (byte b : g) {
            sb.append(f11830e[(b >> 4) & 15]);
            sb.append(f11830e[b & 15]);
        }
        return sb.toString();
    }
}
