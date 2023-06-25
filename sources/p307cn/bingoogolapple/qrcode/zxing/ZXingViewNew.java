package p307cn.bingoogolapple.qrcode.zxing;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.Map;
import p034b.p035a.p036a.p037a.C1332e;
import p034b.p035a.p036a.p038b.C1333a;
import p040c.p200q.p406e.C7018d;
import p307cn.bingoogolapple.qrcode.core.BarcodeType;
import p307cn.bingoogolapple.qrcode.core.QRCodeViewNew;

/* renamed from: cn.bingoogolapple.qrcode.zxing.ZXingViewNew */
public class ZXingViewNew extends QRCodeViewNew {

    /* renamed from: E */
    public C7018d f6861E;

    /* renamed from: F */
    public Map<DecodeHintType, Object> f6862F;

    public ZXingViewNew(Context context) {
        super(context);
    }

    /* renamed from: J */
    public final boolean mo21259J(BarcodeFormat barcodeFormat) {
        return barcodeFormat == BarcodeFormat.QR_CODE;
    }

    /* renamed from: v */
    public C1332e mo21162v(Bitmap bitmap) {
        return new C1332e(C1333a.m204a(bitmap));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p034b.p035a.p036a.p037a.C1332e mo21163w(byte[] r11, int r12, int r13, boolean r14) {
        /*
            r10 = this;
            r14 = 0
            c.q.e.e r9 = new c.q.e.e     // Catch:{ Exception -> 0x003d }
            r4 = 0
            r5 = 0
            r8 = 0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x003d }
            c.q.e.d r11 = r10.f6861E     // Catch:{ Exception -> 0x003d }
            c.q.e.b r12 = new c.q.e.b     // Catch:{ Exception -> 0x003d }
            c.q.e.l.g r13 = new c.q.e.l.g     // Catch:{ Exception -> 0x003d }
            r13.<init>(r9)     // Catch:{ Exception -> 0x003d }
            r12.<init>(r13)     // Catch:{ Exception -> 0x003d }
            c.q.e.h r11 = r11.mo32474d(r12)     // Catch:{ Exception -> 0x003d }
            if (r11 != 0) goto L_0x0042
            c.q.e.d r12 = r10.f6861E     // Catch:{ Exception -> 0x0039 }
            c.q.e.b r13 = new c.q.e.b     // Catch:{ Exception -> 0x0039 }
            c.q.e.l.i r0 = new c.q.e.l.i     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0039 }
            r13.<init>(r0)     // Catch:{ Exception -> 0x0039 }
            c.q.e.h r11 = r12.mo32474d(r13)     // Catch:{ Exception -> 0x0039 }
            if (r11 == 0) goto L_0x0042
            java.lang.String r12 = "GlobalHistogramBinarizer 没识别到，HybridBinarizer 能识别到"
            p034b.p035a.p036a.p037a.C1328a.m171e(r12)     // Catch:{ Exception -> 0x0039 }
            goto L_0x0042
        L_0x0039:
            r12 = move-exception
            goto L_0x003f
        L_0x003b:
            r11 = move-exception
            goto L_0x00a7
        L_0x003d:
            r12 = move-exception
            r11 = r14
        L_0x003f:
            r12.printStackTrace()     // Catch:{ all -> 0x003b }
        L_0x0042:
            c.q.e.d r12 = r10.f6861E
            r12.mo32471a()
            if (r11 != 0) goto L_0x004a
            return r14
        L_0x004a:
            java.lang.String r12 = r11.mo32482f()
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L_0x0055
            return r14
        L_0x0055:
            com.google.zxing.BarcodeFormat r13 = r11.mo32478b()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "格式为："
            r0.append(r1)
            java.lang.String r1 = r13.name()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            p034b.p035a.p036a.p037a.C1328a.m171e(r0)
            boolean r13 = r10.mo21259J(r13)
            if (r13 == 0) goto L_0x00a1
            c.q.e.i[] r11 = r11.mo32481e()
            int r0 = r11.length
            android.graphics.PointF[] r0 = new android.graphics.PointF[r0]
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L_0x0082:
            if (r2 >= r1) goto L_0x009a
            r4 = r11[r2]
            android.graphics.PointF r5 = new android.graphics.PointF
            float r6 = r4.mo32486c()
            float r4 = r4.mo32487d()
            r5.<init>(r6, r4)
            r0[r3] = r5
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L_0x0082
        L_0x009a:
            boolean r11 = r10.mo21147I(r0, r14, r13, r12)
            if (r11 == 0) goto L_0x00a1
            return r14
        L_0x00a1:
            b.a.a.a.e r11 = new b.a.a.a.e
            r11.<init>(r12)
            return r11
        L_0x00a7:
            c.q.e.d r12 = r10.f6861E
            r12.mo32471a()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p307cn.bingoogolapple.qrcode.zxing.ZXingViewNew.mo21163w(byte[], int, int, boolean):b.a.a.a.e");
    }

    /* renamed from: y */
    public void mo21165y() {
        C7018d dVar = new C7018d();
        this.f6861E = dVar;
        BarcodeType barcodeType = this.f6791x;
        if (barcodeType == BarcodeType.ONE_DIMENSION) {
            dVar.mo32475e(C1333a.f319b);
        } else if (barcodeType == BarcodeType.TWO_DIMENSION) {
            dVar.mo32475e(C1333a.f320c);
        } else if (barcodeType == BarcodeType.ONLY_QR_CODE) {
            dVar.mo32475e(C1333a.f321d);
        } else if (barcodeType == BarcodeType.ONLY_CODE_128) {
            dVar.mo32475e(C1333a.f322e);
        } else if (barcodeType == BarcodeType.ONLY_EAN_13) {
            dVar.mo32475e(C1333a.f323f);
        } else if (barcodeType == BarcodeType.HIGH_FREQUENCY) {
            dVar.mo32475e(C1333a.f324g);
        } else if (barcodeType == BarcodeType.CUSTOM) {
            dVar.mo32475e(this.f6862F);
        } else {
            dVar.mo32475e(C1333a.f318a);
        }
    }

    public ZXingViewNew(Context context, AttributeSet attributeSet) {
        super(context);
    }

    public ZXingViewNew(Context context, AttributeSet attributeSet, int i) {
        super(context);
    }
}
