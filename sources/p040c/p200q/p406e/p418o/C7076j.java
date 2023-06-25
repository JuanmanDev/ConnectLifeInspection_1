package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.j */
/* compiled from: MultiFormatUPCEANReader */
public final class C7076j extends C7077k {

    /* renamed from: a */
    public final C7082p[] f13587a;

    public C7076j(Map<DecodeHintType, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new C7071e());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new C7078l());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new C7072f());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new C7083q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C7071e());
            arrayList.add(new C7072f());
            arrayList.add(new C7083q());
        }
        this.f13587a = (C7082p[]) arrayList.toArray(new C7082p[arrayList.size()]);
    }

    /* renamed from: a */
    public void mo32471a() {
        for (C7082p a : this.f13587a) {
            a.mo32471a();
        }
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        Collection collection;
        int[] p = C7082p.m21050p(aVar);
        C7082p[] pVarArr = this.f13587a;
        boolean z = false;
        int i2 = 0;
        while (i2 < pVarArr.length) {
            try {
                C7022h m = pVarArr[i2].mo32656m(i, aVar, p, map);
                boolean z2 = m.mo32478b() == BarcodeFormat.EAN_13 && m.mo32482f().charAt(0) == '0';
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                }
                if (collection == null || collection.contains(BarcodeFormat.UPC_A)) {
                    z = true;
                }
                if (!z2 || !z) {
                    return m;
                }
                C7022h hVar = new C7022h(m.mo32482f().substring(1), m.mo32479c(), m.mo32481e(), BarcodeFormat.UPC_A);
                hVar.mo32483g(m.mo32480d());
                return hVar;
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
