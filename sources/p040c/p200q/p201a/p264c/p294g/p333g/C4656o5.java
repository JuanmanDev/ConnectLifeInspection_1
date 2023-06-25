package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.Arrays;

/* renamed from: c.q.a.c.g.g.o5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4656o5 implements Comparable {

    /* renamed from: e */
    public final byte[] f9512e;

    public /* synthetic */ C4656o5(byte[] bArr, C4629n5 n5Var) {
        this.f9512e = Arrays.copyOf(bArr, bArr.length);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C4656o5 o5Var = (C4656o5) obj;
        int length = this.f9512e.length;
        int length2 = o5Var.f9512e.length;
        if (length != length2) {
            return length - length2;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f9512e;
            if (i >= bArr.length) {
                return 0;
            }
            byte b = bArr[i];
            byte b2 = o5Var.f9512e[i];
            if (b != b2) {
                return b - b2;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4656o5)) {
            return false;
        }
        return Arrays.equals(this.f9512e, ((C4656o5) obj).f9512e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9512e);
    }

    public final String toString() {
        return C4509ik.m12176a(this.f9512e);
    }
}
