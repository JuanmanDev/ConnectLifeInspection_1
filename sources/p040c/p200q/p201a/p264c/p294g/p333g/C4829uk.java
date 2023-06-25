package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.uk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4829uk {

    /* renamed from: a */
    public final byte[] f9683a;

    public C4829uk(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.f9683a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    /* renamed from: b */
    public static C4829uk m13256b(byte[] bArr) {
        if (bArr != null) {
            return new C4829uk(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    /* renamed from: a */
    public final int mo26736a() {
        return this.f9683a.length;
    }

    /* renamed from: c */
    public final byte[] mo26737c() {
        byte[] bArr = this.f9683a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4829uk)) {
            return false;
        }
        return Arrays.equals(((C4829uk) obj).f9683a, this.f9683a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9683a);
    }

    public final String toString() {
        String a = C4509ik.m12176a(this.f9683a);
        return "Bytes(" + a + ")";
    }
}
