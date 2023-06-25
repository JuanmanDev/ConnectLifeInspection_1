package p040c.p200q.p406e.p416n.p417b;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p410l.p412m.C7045a;
import p040c.p200q.p406e.p410l.p412m.C7047c;

/* renamed from: c.q.e.n.b.c */
/* compiled from: Decoder */
public final class C7066c {

    /* renamed from: a */
    public final C7047c f13557a = new C7047c(C7045a.f13502o);

    /* renamed from: a */
    public final void mo32638a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i2 + i3;
        int i6 = i4 == 0 ? 1 : 2;
        int[] iArr = new int[(i5 / i6)];
        for (int i7 = 0; i7 < i5; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i6] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f13557a.mo32597a(iArr, i3 / i6);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i6];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: b */
    public C7035d mo32639b(C7033b bVar, Map<DecodeHintType, ?> map) {
        byte[] bArr;
        byte[] a = new C7064a(bVar).mo32637a();
        mo32638a(a, 0, 10, 10, 0);
        byte b = a[0] & 15;
        if (b == 2 || b == 3 || b == 4) {
            byte[] bArr2 = a;
            mo32638a(bArr2, 20, 84, 40, 1);
            mo32638a(bArr2, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (b == 5) {
            byte[] bArr3 = a;
            mo32638a(bArr3, 20, 68, 56, 1);
            mo32638a(bArr3, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.getFormatInstance();
        }
        System.arraycopy(a, 0, bArr, 0, 10);
        System.arraycopy(a, 20, bArr, 10, bArr.length - 10);
        return C7065b.m20970a(bArr, b);
    }
}
