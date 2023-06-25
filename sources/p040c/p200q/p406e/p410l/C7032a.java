package p040c.p200q.p406e.p410l;

import java.util.Arrays;
import okhttp3.internal.p700ws.WebSocketProtocol;

/* renamed from: c.q.e.l.a */
/* compiled from: BitArray */
public final class C7032a implements Cloneable {

    /* renamed from: e */
    public int[] f13453e;

    /* renamed from: l */
    public int f13454l;

    public C7032a() {
        this.f13454l = 0;
        this.f13453e = new int[1];
    }

    /* renamed from: j */
    public static int[] m20815j(int i) {
        return new int[((i + 31) / 32)];
    }

    /* renamed from: a */
    public void mo32515a() {
        int length = this.f13453e.length;
        for (int i = 0; i < length; i++) {
            this.f13453e[i] = 0;
        }
    }

    /* renamed from: b */
    public C7032a clone() {
        return new C7032a((int[]) this.f13453e.clone(), this.f13454l);
    }

    /* renamed from: c */
    public boolean mo32517c(int i) {
        return ((1 << (i & 31)) & this.f13453e[i / 32]) != 0;
    }

    /* renamed from: d */
    public int[] mo32519d() {
        return this.f13453e;
    }

    /* renamed from: e */
    public int mo32520e(int i) {
        int i2 = this.f13454l;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & this.f13453e[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f13453e;
            if (i3 == iArr.length) {
                return this.f13454l;
            }
            i4 = iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f13454l;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7032a)) {
            return false;
        }
        C7032a aVar = (C7032a) obj;
        if (this.f13454l != aVar.f13454l || !Arrays.equals(this.f13453e, aVar.f13453e)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo32522f(int i) {
        int i2 = this.f13454l;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (~((1 << (i & 31)) - 1)) & (~this.f13453e[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f13453e;
            if (i3 == iArr.length) {
                return this.f13454l;
            }
            i4 = ~iArr[i3];
        }
        int numberOfTrailingZeros = (i3 << 5) + Integer.numberOfTrailingZeros(i4);
        int i5 = this.f13454l;
        return numberOfTrailingZeros > i5 ? i5 : numberOfTrailingZeros;
    }

    /* renamed from: h */
    public int mo32523h() {
        return this.f13454l;
    }

    public int hashCode() {
        return (this.f13454l * 31) + Arrays.hashCode(this.f13453e);
    }

    /* renamed from: i */
    public boolean mo32525i(int i, int i2, boolean z) {
        if (i2 < i || i < 0 || i2 > this.f13454l) {
            throw new IllegalArgumentException();
        } else if (i2 == i) {
            return true;
        } else {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                int i7 = 31;
                int i8 = i6 > i4 ? 0 : i & 31;
                if (i6 >= i5) {
                    i7 = 31 & i3;
                }
                int i9 = (2 << i7) - (1 << i8);
                int i10 = this.f13453e[i6] & i9;
                if (!z) {
                    i9 = 0;
                }
                if (i10 != i9) {
                    return false;
                }
                i6++;
            }
            return true;
        }
    }

    /* renamed from: k */
    public void mo32526k() {
        int[] iArr = new int[this.f13453e.length];
        int i = (this.f13454l - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = (long) this.f13453e[i3];
            long j2 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j3 = ((j2 & 858993459) << 2) | ((j2 >> 2) & 858993459);
            long j4 = ((j3 & 252645135) << 4) | ((j3 >> 4) & 252645135);
            long j5 = ((j4 & 16711935) << 8) | ((j4 >> 8) & 16711935);
            iArr[i - i3] = (int) (((j5 & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16) | ((j5 >> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
        }
        int i4 = this.f13454l;
        int i5 = i2 << 5;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i2 - 1] = i7;
        }
        this.f13453e = iArr;
    }

    /* renamed from: l */
    public void mo32527l(int i) {
        int[] iArr = this.f13453e;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: m */
    public void mo32528m(int i, int i2) {
        this.f13453e[i / 32] = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.f13454l);
        for (int i = 0; i < this.f13454l; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(mo32517c(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    public C7032a(int i) {
        this.f13454l = i;
        this.f13453e = m20815j(i);
    }

    public C7032a(int[] iArr, int i) {
        this.f13453e = iArr;
        this.f13454l = i;
    }
}
