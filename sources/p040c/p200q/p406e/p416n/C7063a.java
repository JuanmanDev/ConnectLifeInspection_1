package p040c.p200q.p406e.p416n;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;
import p040c.p200q.p406e.C7016b;
import p040c.p200q.p406e.C7021g;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p416n.p417b.C7066c;

/* renamed from: c.q.e.n.a */
/* compiled from: MaxiCodeReader */
public final class C7063a implements C7021g {

    /* renamed from: b */
    public static final C7023i[] f13552b = new C7023i[0];

    /* renamed from: a */
    public final C7066c f13553a = new C7066c();

    /* renamed from: c */
    public static C7033b m20966c(C7033b bVar) {
        int[] f = bVar.mo32537f();
        if (f != null) {
            int i = f[0];
            int i2 = f[1];
            int i3 = f[2];
            int i4 = f[3];
            C7033b bVar2 = new C7033b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (bVar.mo32534d(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        bVar2.mo32544m(i7, i5);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public void mo32471a() {
    }

    /* renamed from: b */
    public C7022h mo32472b(C7016b bVar, Map<DecodeHintType, ?> map) {
        if (map == null || !map.containsKey(DecodeHintType.PURE_BARCODE)) {
            throw NotFoundException.getNotFoundInstance();
        }
        C7035d b = this.f13553a.mo32639b(m20966c(bVar.mo32457a()), map);
        C7022h hVar = new C7022h(b.mo32560h(), b.mo32557e(), f13552b, BarcodeFormat.MAXICODE);
        String b2 = b.mo32554b();
        if (b2 != null) {
            hVar.mo32484h(ResultMetadataType.ERROR_CORRECTION_LEVEL, b2);
        }
        return hVar;
    }
}
