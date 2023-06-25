package p040c.p200q.p406e.p426q.p427b;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p410l.p412m.C7045a;
import p040c.p200q.p406e.p410l.p412m.C7047c;

/* renamed from: c.q.e.q.b.e */
/* compiled from: Decoder */
public final class C7147e {

    /* renamed from: a */
    public final C7047c f13749a = new C7047c(C7045a.f13499l);

    /* renamed from: a */
    public final void mo32857a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f13749a.mo32597a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: b */
    public C7035d mo32858b(C7033b bVar, Map<DecodeHintType, ?> map) {
        ChecksumException e;
        C7135a aVar = new C7135a(bVar);
        FormatException formatException = null;
        try {
            return mo32859c(aVar, map);
        } catch (FormatException e2) {
            FormatException formatException2 = e2;
            e = null;
            formatException = formatException2;
            try {
                aVar.mo32851f();
                aVar.mo32852g(true);
                aVar.mo32850e();
                aVar.mo32849d();
                aVar.mo32847b();
                C7035d c = mo32859c(aVar, map);
                c.mo32565m(new C7149g(true));
                return c;
            } catch (ChecksumException | FormatException e3) {
                if (formatException != null) {
                    throw formatException;
                } else if (e != null) {
                    throw e;
                } else {
                    throw e3;
                }
            }
        } catch (ChecksumException e4) {
            e = e4;
            aVar.mo32851f();
            aVar.mo32852g(true);
            aVar.mo32850e();
            aVar.mo32849d();
            aVar.mo32847b();
            C7035d c2 = mo32859c(aVar, map);
            c2.mo32565m(new C7149g(true));
            return c2;
        }
    }

    /* renamed from: c */
    public final C7035d mo32859c(C7135a aVar, Map<DecodeHintType, ?> map) {
        C7150h e = aVar.mo32850e();
        ErrorCorrectionLevel d = aVar.mo32849d().mo32861d();
        C7136b[] b = C7136b.m21336b(aVar.mo32848c(), e, d);
        int i = 0;
        for (C7136b c : b) {
            i += c.mo32854c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (C7136b bVar : b) {
            byte[] a = bVar.mo32853a();
            int c2 = bVar.mo32854c();
            mo32857a(a, c2);
            int i3 = 0;
            while (i3 < c2) {
                bArr[i2] = a[i3];
                i3++;
                i2++;
            }
        }
        return C7146d.m21349a(bArr, e, d, map);
    }
}
