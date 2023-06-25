package p040c.p200q.p406e.p426q.p427b;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import p040c.p200q.p406e.p426q.p427b.C7150h;

/* renamed from: c.q.e.q.b.b */
/* compiled from: DataBlock */
public final class C7136b {

    /* renamed from: a */
    public final int f13737a;

    /* renamed from: b */
    public final byte[] f13738b;

    public C7136b(int i, byte[] bArr) {
        this.f13737a = i;
        this.f13738b = bArr;
    }

    /* renamed from: b */
    public static C7136b[] m21336b(byte[] bArr, C7150h hVar, ErrorCorrectionLevel errorCorrectionLevel) {
        if (bArr.length == hVar.mo32869h()) {
            C7150h.C7152b f = hVar.mo32868f(errorCorrectionLevel);
            C7150h.C7151a[] a = f.mo32874a();
            int i = 0;
            for (C7150h.C7151a a2 : a) {
                i += a2.mo32872a();
            }
            C7136b[] bVarArr = new C7136b[i];
            int i2 = 0;
            for (C7150h.C7151a aVar : a) {
                int i3 = 0;
                while (i3 < aVar.mo32872a()) {
                    int b = aVar.mo32873b();
                    bVarArr[i2] = new C7136b(b, new byte[(f.mo32875b() + b)]);
                    i3++;
                    i2++;
                }
            }
            int length = bVarArr[0].f13738b.length;
            int i4 = i - 1;
            while (i4 >= 0 && bVarArr[i4].f13738b.length != length) {
                i4--;
            }
            int i5 = i4 + 1;
            int b2 = length - f.mo32875b();
            int i6 = 0;
            for (int i7 = 0; i7 < b2; i7++) {
                int i8 = 0;
                while (i8 < i2) {
                    bVarArr[i8].f13738b[i7] = bArr[i6];
                    i8++;
                    i6++;
                }
            }
            int i9 = i5;
            while (i9 < i2) {
                bVarArr[i9].f13738b[b2] = bArr[i6];
                i9++;
                i6++;
            }
            int length2 = bVarArr[0].f13738b.length;
            while (b2 < length2) {
                int i10 = 0;
                while (i10 < i2) {
                    bVarArr[i10].f13738b[i10 < i5 ? b2 : b2 + 1] = bArr[i6];
                    i10++;
                    i6++;
                }
                b2++;
            }
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] mo32853a() {
        return this.f13738b;
    }

    /* renamed from: c */
    public int mo32854c() {
        return this.f13737a;
    }
}
