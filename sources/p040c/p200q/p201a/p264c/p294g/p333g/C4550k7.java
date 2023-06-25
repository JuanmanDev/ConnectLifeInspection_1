package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.k7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4550k7 extends C4577l7 {
    public C4550k7(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo26167a() {
        return 12;
    }

    /* renamed from: b */
    public final int[] mo26168b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            C4469h7.m12090b(iArr2, this.f9381a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
