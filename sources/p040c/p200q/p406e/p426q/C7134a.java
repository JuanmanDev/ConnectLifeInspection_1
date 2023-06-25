package p040c.p200q.p406e.p426q;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.List;
import java.util.Map;
import p040c.p200q.p406e.C7016b;
import p040c.p200q.p406e.C7021g;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p410l.C7037f;
import p040c.p200q.p406e.p426q.p427b.C7147e;
import p040c.p200q.p406e.p426q.p427b.C7149g;
import p040c.p200q.p406e.p426q.p428c.C7155c;

/* renamed from: c.q.e.q.a */
/* compiled from: QRCodeReader */
public class C7134a implements C7021g {

    /* renamed from: b */
    public static final C7023i[] f13731b = new C7023i[0];

    /* renamed from: a */
    public final C7147e f13732a = new C7147e();

    /* renamed from: c */
    public static C7033b m21325c(C7033b bVar) {
        int[] j = bVar.mo32541j();
        int[] e = bVar.mo32535e();
        if (j == null || e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        float d = m21326d(j, bVar);
        int i = j[1];
        int i2 = e[1];
        int i3 = j[0];
        int i4 = e[0];
        if (i3 >= i4 || i >= i2) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i5 = i2 - i;
        if (i5 == i4 - i3 || (i4 = i3 + i5) < bVar.mo32542k()) {
            int round = Math.round(((float) ((i4 - i3) + 1)) / d);
            int round2 = Math.round(((float) (i5 + 1)) / d);
            if (round <= 0 || round2 <= 0) {
                throw NotFoundException.getNotFoundInstance();
            } else if (round2 == round) {
                int i6 = (int) (d / 2.0f);
                int i7 = i + i6;
                int i8 = i3 + i6;
                int i9 = (((int) (((float) (round - 1)) * d)) + i8) - i4;
                if (i9 > 0) {
                    if (i9 <= i6) {
                        i8 -= i9;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                int i10 = (((int) (((float) (round2 - 1)) * d)) + i7) - i2;
                if (i10 > 0) {
                    if (i10 <= i6) {
                        i7 -= i10;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                C7033b bVar2 = new C7033b(round, round2);
                for (int i11 = 0; i11 < round2; i11++) {
                    int i12 = ((int) (((float) i11) * d)) + i7;
                    for (int i13 = 0; i13 < round; i13++) {
                        if (bVar.mo32534d(((int) (((float) i13) * d)) + i8, i12)) {
                            bVar2.mo32544m(i13, i11);
                        }
                    }
                }
                return bVar2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } else {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    /* renamed from: d */
    public static float m21326d(int[] iArr, C7033b bVar) {
        int h = bVar.mo32538h();
        int k = bVar.mo32542k();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < k && i2 < h) {
            if (z != bVar.mo32534d(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != k && i2 != h) {
            return ((float) (i - iArr[0])) / 7.0f;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public void mo32471a() {
    }

    /* renamed from: b */
    public final C7022h mo32472b(C7016b bVar, Map<DecodeHintType, ?> map) {
        C7023i[] iVarArr;
        C7035d dVar;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C7037f e = new C7155c(bVar.mo32457a()).mo32884e(map);
            C7035d b = this.f13732a.mo32858b(e.mo32568a(), map);
            iVarArr = e.mo32569b();
            dVar = b;
        } else {
            dVar = this.f13732a.mo32858b(m21325c(bVar.mo32457a()), map);
            iVarArr = f13731b;
        }
        if (dVar.mo32556d() instanceof C7149g) {
            ((C7149g) dVar.mo32556d()).mo32864a(iVarArr);
        }
        C7022h hVar = new C7022h(dVar.mo32560h(), dVar.mo32557e(), iVarArr, BarcodeFormat.QR_CODE);
        List<byte[]> a = dVar.mo32553a();
        if (a != null) {
            hVar.mo32484h(ResultMetadataType.BYTE_SEGMENTS, a);
        }
        String b2 = dVar.mo32554b();
        if (b2 != null) {
            hVar.mo32484h(ResultMetadataType.ERROR_CORRECTION_LEVEL, b2);
        }
        if (dVar.mo32561i()) {
            hVar.mo32484h(ResultMetadataType.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(dVar.mo32559g()));
            hVar.mo32484h(ResultMetadataType.STRUCTURED_APPEND_PARITY, Integer.valueOf(dVar.mo32558f()));
        }
        return hVar;
    }
}
