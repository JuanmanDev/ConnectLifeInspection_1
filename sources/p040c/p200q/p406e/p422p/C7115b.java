package p040c.p200q.p406e.p422p;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;
import p040c.p200q.p406e.C7016b;
import p040c.p200q.p406e.C7021g;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7035d;
import p040c.p200q.p406e.p422p.p423d.C7128j;
import p040c.p200q.p406e.p422p.p425e.C7132a;
import p040c.p200q.p406e.p422p.p425e.C7133b;

/* renamed from: c.q.e.p.b */
/* compiled from: PDF417Reader */
public final class C7115b implements C7021g {
    /* renamed from: c */
    public static C7022h[] m21187c(C7016b bVar, Map<DecodeHintType, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C7133b b = C7132a.m21317b(bVar, map, z);
        for (C7023i[] next : b.mo32845b()) {
            C7035d i = C7128j.m21277i(b.mo32844a(), next[4], next[5], next[6], next[7], m21190f(next), m21188d(next));
            C7022h hVar = new C7022h(i.mo32560h(), i.mo32557e(), next, BarcodeFormat.PDF_417);
            hVar.mo32484h(ResultMetadataType.ERROR_CORRECTION_LEVEL, i.mo32554b());
            C7116c cVar = (C7116c) i.mo32556d();
            if (cVar != null) {
                hVar.mo32484h(ResultMetadataType.PDF417_EXTRA_METADATA, cVar);
            }
            arrayList.add(hVar);
        }
        return (C7022h[]) arrayList.toArray(new C7022h[arrayList.size()]);
    }

    /* renamed from: d */
    public static int m21188d(C7023i[] iVarArr) {
        return Math.max(Math.max(m21189e(iVarArr[0], iVarArr[4]), (m21189e(iVarArr[6], iVarArr[2]) * 17) / 18), Math.max(m21189e(iVarArr[1], iVarArr[5]), (m21189e(iVarArr[7], iVarArr[3]) * 17) / 18));
    }

    /* renamed from: e */
    public static int m21189e(C7023i iVar, C7023i iVar2) {
        if (iVar == null || iVar2 == null) {
            return 0;
        }
        return (int) Math.abs(iVar.mo32486c() - iVar2.mo32486c());
    }

    /* renamed from: f */
    public static int m21190f(C7023i[] iVarArr) {
        return Math.min(Math.min(m21191g(iVarArr[0], iVarArr[4]), (m21191g(iVarArr[6], iVarArr[2]) * 17) / 18), Math.min(m21191g(iVarArr[1], iVarArr[5]), (m21191g(iVarArr[7], iVarArr[3]) * 17) / 18));
    }

    /* renamed from: g */
    public static int m21191g(C7023i iVar, C7023i iVar2) {
        if (iVar == null || iVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(iVar.mo32486c() - iVar2.mo32486c());
    }

    /* renamed from: a */
    public void mo32471a() {
    }

    /* renamed from: b */
    public C7022h mo32472b(C7016b bVar, Map<DecodeHintType, ?> map) {
        C7022h[] c = m21187c(bVar, map, false);
        if (c != null && c.length != 0 && c[0] != null) {
            return c[0];
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
