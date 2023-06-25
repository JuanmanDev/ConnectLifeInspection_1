package p034b.p035a.p036a.p038b;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: b.a.a.b.a */
/* compiled from: QRCodeDecoder */
public class C1333a {

    /* renamed from: a */
    public static final Map<DecodeHintType, Object> f318a = new EnumMap(DecodeHintType.class);

    /* renamed from: b */
    public static final Map<DecodeHintType, Object> f319b = new EnumMap(DecodeHintType.class);

    /* renamed from: c */
    public static final Map<DecodeHintType, Object> f320c = new EnumMap(DecodeHintType.class);

    /* renamed from: d */
    public static final Map<DecodeHintType, Object> f321d;

    /* renamed from: e */
    public static final Map<DecodeHintType, Object> f322e;

    /* renamed from: f */
    public static final Map<DecodeHintType, Object> f323f;

    /* renamed from: g */
    public static final Map<DecodeHintType, Object> f324g = new EnumMap(DecodeHintType.class);

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BarcodeFormat.AZTEC);
        arrayList.add(BarcodeFormat.CODABAR);
        arrayList.add(BarcodeFormat.CODE_39);
        arrayList.add(BarcodeFormat.CODE_93);
        arrayList.add(BarcodeFormat.CODE_128);
        arrayList.add(BarcodeFormat.DATA_MATRIX);
        arrayList.add(BarcodeFormat.EAN_8);
        arrayList.add(BarcodeFormat.EAN_13);
        arrayList.add(BarcodeFormat.ITF);
        arrayList.add(BarcodeFormat.MAXICODE);
        arrayList.add(BarcodeFormat.PDF_417);
        arrayList.add(BarcodeFormat.QR_CODE);
        arrayList.add(BarcodeFormat.RSS_14);
        arrayList.add(BarcodeFormat.RSS_EXPANDED);
        arrayList.add(BarcodeFormat.UPC_A);
        arrayList.add(BarcodeFormat.UPC_E);
        arrayList.add(BarcodeFormat.UPC_EAN_EXTENSION);
        f318a.put(DecodeHintType.POSSIBLE_FORMATS, arrayList);
        f318a.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        f318a.put(DecodeHintType.CHARACTER_SET, "utf-8");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(BarcodeFormat.CODABAR);
        arrayList2.add(BarcodeFormat.CODE_39);
        arrayList2.add(BarcodeFormat.CODE_93);
        arrayList2.add(BarcodeFormat.CODE_128);
        arrayList2.add(BarcodeFormat.EAN_8);
        arrayList2.add(BarcodeFormat.EAN_13);
        arrayList2.add(BarcodeFormat.ITF);
        arrayList2.add(BarcodeFormat.PDF_417);
        arrayList2.add(BarcodeFormat.RSS_14);
        arrayList2.add(BarcodeFormat.RSS_EXPANDED);
        arrayList2.add(BarcodeFormat.UPC_A);
        arrayList2.add(BarcodeFormat.UPC_E);
        arrayList2.add(BarcodeFormat.UPC_EAN_EXTENSION);
        f319b.put(DecodeHintType.POSSIBLE_FORMATS, arrayList2);
        f319b.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        f319b.put(DecodeHintType.CHARACTER_SET, "utf-8");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(BarcodeFormat.AZTEC);
        arrayList3.add(BarcodeFormat.DATA_MATRIX);
        arrayList3.add(BarcodeFormat.MAXICODE);
        arrayList3.add(BarcodeFormat.QR_CODE);
        f320c.put(DecodeHintType.POSSIBLE_FORMATS, arrayList3);
        f320c.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        f320c.put(DecodeHintType.CHARACTER_SET, "utf-8");
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        f321d = enumMap;
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, Collections.singletonList(BarcodeFormat.QR_CODE));
        f321d.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        f321d.put(DecodeHintType.CHARACTER_SET, "utf-8");
        EnumMap enumMap2 = new EnumMap(DecodeHintType.class);
        f322e = enumMap2;
        enumMap2.put(DecodeHintType.POSSIBLE_FORMATS, Collections.singletonList(BarcodeFormat.CODE_128));
        f322e.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        f322e.put(DecodeHintType.CHARACTER_SET, "utf-8");
        EnumMap enumMap3 = new EnumMap(DecodeHintType.class);
        f323f = enumMap3;
        enumMap3.put(DecodeHintType.POSSIBLE_FORMATS, Collections.singletonList(BarcodeFormat.EAN_13));
        f323f.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        f323f.put(DecodeHintType.CHARACTER_SET, "utf-8");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(BarcodeFormat.QR_CODE);
        arrayList4.add(BarcodeFormat.UPC_A);
        arrayList4.add(BarcodeFormat.EAN_13);
        arrayList4.add(BarcodeFormat.CODE_128);
        f324g.put(DecodeHintType.POSSIBLE_FORMATS, arrayList4);
        f324g.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        f324g.put(DecodeHintType.CHARACTER_SET, "utf-8");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040 A[SYNTHETIC, Splitter:B:11:0x0040] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m204a(android.graphics.Bitmap r12) {
        /*
            r0 = 0
            int r9 = r12.getWidth()     // Catch:{ Exception -> 0x0039 }
            int r10 = r12.getHeight()     // Catch:{ Exception -> 0x0039 }
            int r1 = r9 * r10
            int[] r11 = new int[r1]     // Catch:{ Exception -> 0x0039 }
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r12
            r2 = r11
            r4 = r9
            r7 = r9
            r8 = r10
            r1.getPixels(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0039 }
            c.q.e.f r12 = new c.q.e.f     // Catch:{ Exception -> 0x0039 }
            r12.<init>(r9, r10, r11)     // Catch:{ Exception -> 0x0039 }
            c.q.e.d r1 = new c.q.e.d     // Catch:{ Exception -> 0x0037 }
            r1.<init>()     // Catch:{ Exception -> 0x0037 }
            c.q.e.b r2 = new c.q.e.b     // Catch:{ Exception -> 0x0037 }
            c.q.e.l.i r3 = new c.q.e.l.i     // Catch:{ Exception -> 0x0037 }
            r3.<init>(r12)     // Catch:{ Exception -> 0x0037 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0037 }
            java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> r3 = f318a     // Catch:{ Exception -> 0x0037 }
            c.q.e.h r1 = r1.mo32472b(r2, r3)     // Catch:{ Exception -> 0x0037 }
            java.lang.String r12 = r1.mo32482f()     // Catch:{ Exception -> 0x0037 }
            return r12
        L_0x0037:
            r1 = move-exception
            goto L_0x003b
        L_0x0039:
            r1 = move-exception
            r12 = r0
        L_0x003b:
            r1.printStackTrace()
            if (r12 == 0) goto L_0x005e
            c.q.e.d r1 = new c.q.e.d     // Catch:{ all -> 0x005a }
            r1.<init>()     // Catch:{ all -> 0x005a }
            c.q.e.b r2 = new c.q.e.b     // Catch:{ all -> 0x005a }
            c.q.e.l.g r3 = new c.q.e.l.g     // Catch:{ all -> 0x005a }
            r3.<init>(r12)     // Catch:{ all -> 0x005a }
            r2.<init>(r3)     // Catch:{ all -> 0x005a }
            java.util.Map<com.google.zxing.DecodeHintType, java.lang.Object> r12 = f318a     // Catch:{ all -> 0x005a }
            c.q.e.h r12 = r1.mo32472b(r2, r12)     // Catch:{ all -> 0x005a }
            java.lang.String r12 = r12.mo32482f()     // Catch:{ all -> 0x005a }
            return r12
        L_0x005a:
            r12 = move-exception
            r12.printStackTrace()
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034b.p035a.p036a.p038b.C1333a.m204a(android.graphics.Bitmap):java.lang.String");
    }
}
