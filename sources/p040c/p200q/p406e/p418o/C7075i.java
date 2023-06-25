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
import p040c.p200q.p406e.p418o.p419r.C7088e;
import p040c.p200q.p406e.p418o.p419r.p420g.C7093d;

/* renamed from: c.q.e.o.i */
/* compiled from: MultiFormatOneDReader */
public final class C7075i extends C7077k {

    /* renamed from: a */
    public final C7077k[] f13586a;

    public C7075i(Map<DecodeHintType, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        boolean z = (map == null || map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new C7076j(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new C7069c(z));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new C7070d());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new C7068b());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new C7074h());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new C7067a());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new C7088e());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new C7093d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C7076j(map));
            arrayList.add(new C7069c());
            arrayList.add(new C7067a());
            arrayList.add(new C7070d());
            arrayList.add(new C7068b());
            arrayList.add(new C7074h());
            arrayList.add(new C7088e());
            arrayList.add(new C7093d());
        }
        this.f13586a = (C7077k[]) arrayList.toArray(new C7077k[arrayList.size()]);
    }

    /* renamed from: a */
    public void mo32471a() {
        for (C7077k a : this.f13586a) {
            a.mo32471a();
        }
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        C7077k[] kVarArr = this.f13586a;
        int i2 = 0;
        while (i2 < kVarArr.length) {
            try {
                return kVarArr[i2].mo32640c(i, aVar, map);
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
