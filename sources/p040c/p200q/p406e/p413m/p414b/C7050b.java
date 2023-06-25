package p040c.p200q.p406e.p413m.p414b;

import p040c.p200q.p406e.p413m.p414b.C7055e;

/* renamed from: c.q.e.m.b.b */
/* compiled from: DataBlock */
public final class C7050b {

    /* renamed from: a */
    public final int f13518a;

    /* renamed from: b */
    public final byte[] f13519b;

    public C7050b(int i, byte[] bArr) {
        this.f13518a = i;
        this.f13519b = bArr;
    }

    /* renamed from: b */
    public static C7050b[] m20927b(byte[] bArr, C7055e eVar) {
        C7055e.C7058c d = eVar.mo32616d();
        C7055e.C7057b[] a = d.mo32624a();
        int i = 0;
        for (C7055e.C7057b a2 : a) {
            i += a2.mo32622a();
        }
        C7050b[] bVarArr = new C7050b[i];
        int i2 = 0;
        for (C7055e.C7057b bVar : a) {
            int i3 = 0;
            while (i3 < bVar.mo32622a()) {
                int b = bVar.mo32623b();
                bVarArr[i2] = new C7050b(b, new byte[(d.mo32625b() + b)]);
                i3++;
                i2++;
            }
        }
        int length = bVarArr[0].f13519b.length - d.mo32625b();
        int i4 = length - 1;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = 0;
            while (i7 < i2) {
                bVarArr[i7].f13519b[i6] = bArr[i5];
                i7++;
                i5++;
            }
        }
        boolean z = eVar.mo32620i() == 24;
        int i8 = z ? 8 : i2;
        int i9 = 0;
        while (i9 < i8) {
            bVarArr[i9].f13519b[i4] = bArr[i5];
            i9++;
            i5++;
        }
        int length2 = bVarArr[0].f13519b.length;
        while (length < length2) {
            int i10 = 0;
            while (i10 < i2) {
                int i11 = z ? (i10 + 8) % i2 : i10;
                bVarArr[i11].f13519b[(!z || i11 <= 7) ? length : length - 1] = bArr[i5];
                i10++;
                i5++;
            }
            length++;
        }
        if (i5 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] mo32610a() {
        return this.f13519b;
    }

    /* renamed from: c */
    public int mo32611c() {
        return this.f13518a;
    }
}
