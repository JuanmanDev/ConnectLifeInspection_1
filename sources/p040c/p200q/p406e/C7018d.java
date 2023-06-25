package p040c.p200q.p406e;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p040c.p200q.p406e.p407k.C7026b;
import p040c.p200q.p406e.p413m.C7048a;
import p040c.p200q.p406e.p416n.C7063a;
import p040c.p200q.p406e.p418o.C7075i;
import p040c.p200q.p406e.p422p.C7115b;
import p040c.p200q.p406e.p426q.C7134a;

/* renamed from: c.q.e.d */
/* compiled from: MultiFormatReader */
public final class C7018d implements C7021g {

    /* renamed from: a */
    public Map<DecodeHintType, ?> f13408a;

    /* renamed from: b */
    public C7021g[] f13409b;

    /* renamed from: a */
    public void mo32471a() {
        C7021g[] gVarArr = this.f13409b;
        if (gVarArr != null) {
            for (C7021g a : gVarArr) {
                a.mo32471a();
            }
        }
    }

    /* renamed from: b */
    public C7022h mo32472b(C7016b bVar, Map<DecodeHintType, ?> map) {
        mo32475e(map);
        return mo32473c(bVar);
    }

    /* renamed from: c */
    public final C7022h mo32473c(C7016b bVar) {
        C7021g[] gVarArr = this.f13409b;
        if (gVarArr != null) {
            int length = gVarArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return gVarArr[i].mo32472b(bVar, this.f13408a);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public C7022h mo32474d(C7016b bVar) {
        if (this.f13409b == null) {
            mo32475e((Map<DecodeHintType, ?>) null);
        }
        return mo32473c(bVar);
    }

    /* renamed from: e */
    public void mo32475e(Map<DecodeHintType, ?> map) {
        Collection collection;
        this.f13408a = map;
        boolean z = true;
        boolean z2 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14) && !collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                z = false;
            }
            if (z && !z2) {
                arrayList.add(new C7075i(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new C7134a());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new C7048a());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new C7026b());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new C7115b());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new C7063a());
            }
            if (z && z2) {
                arrayList.add(new C7075i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C7075i(map));
            }
            arrayList.add(new C7134a());
            arrayList.add(new C7048a());
            arrayList.add(new C7026b());
            arrayList.add(new C7115b());
            arrayList.add(new C7063a());
            if (z2) {
                arrayList.add(new C7075i(map));
            }
        }
        this.f13409b = (C7021g[]) arrayList.toArray(new C7021g[arrayList.size()]);
    }
}
