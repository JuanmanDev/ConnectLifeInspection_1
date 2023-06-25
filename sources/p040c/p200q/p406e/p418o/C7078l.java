package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import java.util.Map;
import p040c.p200q.p406e.C7016b;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.l */
/* compiled from: UPCAReader */
public final class C7078l extends C7082p {

    /* renamed from: h */
    public final C7082p f13588h = new C7071e();

    /* renamed from: r */
    public static C7022h m21030r(C7022h hVar) {
        String f = hVar.mo32482f();
        if (f.charAt(0) == '0') {
            return new C7022h(f.substring(1), (byte[]) null, hVar.mo32481e(), BarcodeFormat.UPC_A);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: b */
    public C7022h mo32472b(C7016b bVar, Map<DecodeHintType, ?> map) {
        return m21030r(this.f13588h.mo32472b(bVar, map));
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        return m21030r(this.f13588h.mo32640c(i, aVar, map));
    }

    /* renamed from: l */
    public int mo32647l(C7032a aVar, int[] iArr, StringBuilder sb) {
        return this.f13588h.mo32647l(aVar, iArr, sb);
    }

    /* renamed from: m */
    public C7022h mo32656m(int i, C7032a aVar, int[] iArr, Map<DecodeHintType, ?> map) {
        return m21030r(this.f13588h.mo32656m(i, aVar, iArr, map));
    }

    /* renamed from: q */
    public BarcodeFormat mo32648q() {
        return BarcodeFormat.UPC_A;
    }
}
