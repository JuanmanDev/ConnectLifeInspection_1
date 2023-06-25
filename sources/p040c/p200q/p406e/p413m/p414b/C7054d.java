package p040c.p200q.p406e.p413m.p414b;

import com.google.zxing.ChecksumException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p410l.p412m.C7045a;
import p040c.p200q.p406e.p410l.p412m.C7047c;

/* renamed from: c.q.e.m.b.d */
/* compiled from: Decoder */
public final class C7054d {

    /* renamed from: a */
    public final C7047c f13534a = new C7047c(C7045a.f13500m);

    /* renamed from: a */
    public final void mo32612a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f13534a.mo32597a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: b */
    public C7035d mo32613b(C7033b bVar) {
        C7049a aVar = new C7049a(bVar);
        C7050b[] b = C7050b.m20927b(aVar.mo32603c(), aVar.mo32602b());
        int i = 0;
        for (C7050b c : b) {
            i += c.mo32611c();
        }
        byte[] bArr = new byte[i];
        int length = b.length;
        for (int i2 = 0; i2 < length; i2++) {
            C7050b bVar2 = b[i2];
            byte[] a = bVar2.mo32610a();
            int c2 = bVar2.mo32611c();
            mo32612a(a, c2);
            for (int i3 = 0; i3 < c2; i3++) {
                bArr[(i3 * length) + i2] = a[i3];
            }
        }
        return C7051c.m20930a(bArr);
    }
}
