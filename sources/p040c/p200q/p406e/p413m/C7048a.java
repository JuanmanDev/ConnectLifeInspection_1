package p040c.p200q.p406e.p413m;

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
import p040c.p200q.p406e.p413m.p414b.C7054d;
import p040c.p200q.p406e.p413m.p415c.C7059a;

/* renamed from: c.q.e.m.a */
/* compiled from: DataMatrixReader */
public final class C7048a implements C7021g {

    /* renamed from: b */
    public static final C7023i[] f13513b = new C7023i[0];

    /* renamed from: a */
    public final C7054d f13514a = new C7054d();

    /* renamed from: c */
    public static C7033b m20913c(C7033b bVar) {
        int[] j = bVar.mo32541j();
        int[] e = bVar.mo32535e();
        if (j == null || e == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        int d = m20914d(j, bVar);
        int i = j[1];
        int i2 = e[1];
        int i3 = j[0];
        int i4 = ((e[0] - i3) + 1) / d;
        int i5 = ((i2 - i) + 1) / d;
        if (i4 <= 0 || i5 <= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = d / 2;
        int i7 = i + i6;
        int i8 = i3 + i6;
        C7033b bVar2 = new C7033b(i4, i5);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = (i9 * d) + i7;
            for (int i11 = 0; i11 < i4; i11++) {
                if (bVar.mo32534d((i11 * d) + i8, i10)) {
                    bVar2.mo32544m(i11, i9);
                }
            }
        }
        return bVar2;
    }

    /* renamed from: d */
    public static int m20914d(int[] iArr, C7033b bVar) {
        int k = bVar.mo32542k();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < k && bVar.mo32534d(i, i2)) {
            i++;
        }
        if (i != k) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public void mo32471a() {
    }

    /* renamed from: b */
    public C7022h mo32472b(C7016b bVar, Map<DecodeHintType, ?> map) {
        C7023i[] iVarArr;
        C7035d dVar;
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            C7037f c = new C7059a(bVar.mo32457a()).mo32628c();
            C7035d b = this.f13514a.mo32613b(c.mo32568a());
            iVarArr = c.mo32569b();
            dVar = b;
        } else {
            dVar = this.f13514a.mo32613b(m20913c(bVar.mo32457a()));
            iVarArr = f13513b;
        }
        C7022h hVar = new C7022h(dVar.mo32560h(), dVar.mo32557e(), iVarArr, BarcodeFormat.DATA_MATRIX);
        List<byte[]> a = dVar.mo32553a();
        if (a != null) {
            hVar.mo32484h(ResultMetadataType.BYTE_SEGMENTS, a);
        }
        String b2 = dVar.mo32554b();
        if (b2 != null) {
            hVar.mo32484h(ResultMetadataType.ERROR_CORRECTION_LEVEL, b2);
        }
        return hVar;
    }
}
