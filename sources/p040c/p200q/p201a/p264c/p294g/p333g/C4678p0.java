package p040c.p200q.p201a.p264c.p294g.p333g;

/* renamed from: c.q.a.c.g.g.p0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4678p0 extends C4783t0 {

    /* renamed from: d */
    public final byte[] f9537d;

    /* renamed from: e */
    public final int f9538e;

    /* renamed from: f */
    public int f9539f;

    /* renamed from: g */
    public int f9540g;

    public C4678p0(int i) {
        super((C4757s0) null);
        if (i >= 0) {
            byte[] bArr = new byte[Math.max(i, 20)];
            this.f9537d = bArr;
            this.f9538e = bArr.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    /* renamed from: I */
    public final void mo26490I(byte b) {
        byte[] bArr = this.f9537d;
        int i = this.f9539f;
        this.f9539f = i + 1;
        bArr[i] = b;
        this.f9540g++;
    }

    /* renamed from: J */
    public final void mo26491J(int i) {
        byte[] bArr = this.f9537d;
        int i2 = this.f9539f;
        int i3 = i2 + 1;
        this.f9539f = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        this.f9539f = i4;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        this.f9539f = i5;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.f9539f = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
        this.f9540g += 4;
    }

    /* renamed from: K */
    public final void mo26492K(long j) {
        byte[] bArr = this.f9537d;
        int i = this.f9539f;
        int i2 = i + 1;
        this.f9539f = i2;
        bArr[i] = (byte) ((int) (j & 255));
        int i3 = i2 + 1;
        this.f9539f = i3;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        int i4 = i3 + 1;
        this.f9539f = i4;
        bArr[i3] = (byte) ((int) ((j >> 16) & 255));
        int i5 = i4 + 1;
        this.f9539f = i5;
        bArr[i4] = (byte) ((int) (255 & (j >> 24)));
        int i6 = i5 + 1;
        this.f9539f = i6;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        this.f9539f = i7;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        this.f9539f = i8;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.f9539f = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        this.f9540g += 8;
    }

    /* renamed from: L */
    public final void mo26493L(int i) {
        if (C4783t0.f9630c) {
            long j = (long) this.f9539f;
            while ((i & -128) != 0) {
                byte[] bArr = this.f9537d;
                int i2 = this.f9539f;
                this.f9539f = i2 + 1;
                C4916y3.m13563s(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.f9537d;
            int i3 = this.f9539f;
            this.f9539f = i3 + 1;
            C4916y3.m13563s(bArr2, (long) i3, (byte) i);
            this.f9540g += (int) (((long) this.f9539f) - j);
            return;
        }
        while ((i & -128) != 0) {
            byte[] bArr3 = this.f9537d;
            int i4 = this.f9539f;
            this.f9539f = i4 + 1;
            bArr3[i4] = (byte) ((i & 127) | 128);
            this.f9540g++;
            i >>>= 7;
        }
        byte[] bArr4 = this.f9537d;
        int i5 = this.f9539f;
        this.f9539f = i5 + 1;
        bArr4[i5] = (byte) i;
        this.f9540g++;
    }

    /* renamed from: M */
    public final void mo26494M(long j) {
        if (C4783t0.f9630c) {
            long j2 = (long) this.f9539f;
            while ((j & -128) != 0) {
                byte[] bArr = this.f9537d;
                int i = this.f9539f;
                this.f9539f = i + 1;
                C4916y3.m13563s(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.f9537d;
            int i2 = this.f9539f;
            this.f9539f = i2 + 1;
            C4916y3.m13563s(bArr2, (long) i2, (byte) ((int) j));
            this.f9540g += (int) (((long) this.f9539f) - j2);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f9537d;
            int i3 = this.f9539f;
            this.f9539f = i3 + 1;
            bArr3[i3] = (byte) ((((int) j) & 127) | 128);
            this.f9540g++;
            j >>>= 7;
        }
        byte[] bArr4 = this.f9537d;
        int i4 = this.f9539f;
        this.f9539f = i4 + 1;
        bArr4[i4] = (byte) ((int) j);
        this.f9540g++;
    }

    /* renamed from: q */
    public final int mo26495q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
