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
import p307cn.bingoogolapple.qrcode.core.QRCodeView;

/* renamed from: cn.bingoogolapple.qrcode.zxing.ZXingView */
public class ZXingView extends QRCodeView {

    /* renamed from: A */
    public C7018d f6859A;

    /* renamed from: B */
    public Map<DecodeHintType, Object> f6860B;

    public ZXingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: C */
    public final boolean mo21258C(BarcodeFormat barcodeFormat) {
        return mo21111i() && barcodeFormat == BarcodeFormat.QR_CODE;
    }

    /* renamed from: o */
    public C1332e mo21117o(Bitmap bitmap) {
        return new C1332e(C1333a.m204a(bitmap));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p034b.p035a.p036a.p037a.C1332e mo21120p(byte[] r15, int r16, int r17, boolean r18) {
        /*
            r14 = this;
            r1 = r14
            r2 = 0
            cn.bingoogolapple.qrcode.core.ScanBoxView r0 = r1.f6758m     // Catch:{ Exception -> 0x006b }
            r10 = r17
            android.graphics.Rect r12 = r0.mo21210h(r10)     // Catch:{ Exception -> 0x006b }
            if (r12 == 0) goto L_0x0027
            c.q.e.e r0 = new c.q.e.e     // Catch:{ Exception -> 0x0065 }
            int r7 = r12.left     // Catch:{ Exception -> 0x0065 }
            int r8 = r12.top     // Catch:{ Exception -> 0x0065 }
            int r9 = r12.width()     // Catch:{ Exception -> 0x0065 }
            int r11 = r12.height()     // Catch:{ Exception -> 0x0065 }
            r13 = 0
            r3 = r0
            r4 = r15
            r5 = r16
            r6 = r17
            r10 = r11
            r11 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0065 }
            goto L_0x0039
        L_0x0027:
            c.q.e.e r0 = new c.q.e.e     // Catch:{ Exception -> 0x0065 }
            r7 = 0
            r8 = 0
            r11 = 0
            r3 = r0
            r4 = r15
            r5 = r16
            r6 = r17
            r9 = r16
            r10 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0065 }
        L_0x0039:
            c.q.e.d r3 = r1.f6859A     // Catch:{ Exception -> 0x0065 }
            c.q.e.b r4 = new c.q.e.b     // Catch:{ Exception -> 0x0065 }
            c.q.e.l.g r5 = new c.q.e.l.g     // Catch:{ Exception -> 0x0065 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0065 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0065 }
            c.q.e.h r3 = r3.mo32474d(r4)     // Catch:{ Exception -> 0x0065 }
            if (r3 != 0) goto L_0x0071
            c.q.e.d r4 = r1.f6859A     // Catch:{ Exception -> 0x0063 }
            c.q.e.b r5 = new c.q.e.b     // Catch:{ Exception -> 0x0063 }
            c.q.e.l.i r6 = new c.q.e.l.i     // Catch:{ Exception -> 0x0063 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0063 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x0063 }
            c.q.e.h r3 = r4.mo32474d(r5)     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0071
            java.lang.String r0 = "GlobalHistogramBinarizer 没识别到，HybridBinarizer 能识别到"
            p034b.p035a.p036a.p037a.C1328a.m171e(r0)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0071
        L_0x0063:
            r0 = move-exception
            goto L_0x006e
        L_0x0065:
            r0 = move-exception
            r3 = r2
            goto L_0x006e
        L_0x0068:
            r0 = move-exception
            goto L_0x00dc
        L_0x006b:
            r0 = move-exception
            r3 = r2
            r12 = r3
        L_0x006e:
            r0.printStackTrace()     // Catch:{ all -> 0x0068 }
        L_0x0071:
            c.q.e.d r0 = r1.f6859A
            r0.mo32471a()
            if (r3 != 0) goto L_0x0079
            return r2
        L_0x0079:
            java.lang.String r0 = r3.mo32482f()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L_0x0084
            return r2
        L_0x0084:
            com.google.zxing.BarcodeFormat r4 = r3.mo32478b()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "格式为："
            r5.append(r6)
            java.lang.String r6 = r4.name()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            p034b.p035a.p036a.p037a.C1328a.m171e(r5)
            boolean r4 = r14.mo21258C(r4)
            boolean r5 = r14.mo21112j()
            if (r5 != 0) goto L_0x00ad
            if (r4 == 0) goto L_0x00d6
        L_0x00ad:
            c.q.e.i[] r3 = r3.mo32481e()
            int r5 = r3.length
            android.graphics.PointF[] r5 = new android.graphics.PointF[r5]
            int r6 = r3.length
            r7 = 0
            r8 = r7
        L_0x00b7:
            if (r7 >= r6) goto L_0x00cf
            r9 = r3[r7]
            android.graphics.PointF r10 = new android.graphics.PointF
            float r11 = r9.mo32486c()
            float r9 = r9.mo32487d()
            r10.<init>(r11, r9)
            r5[r8] = r10
            int r8 = r8 + 1
            int r7 = r7 + 1
            goto L_0x00b7
        L_0x00cf:
            boolean r3 = r14.mo21100B(r5, r12, r4, r0)
            if (r3 == 0) goto L_0x00d6
            return r2
        L_0x00d6:
            b.a.a.a.e r2 = new b.a.a.a.e
            r2.<init>(r0)
            return r2
        L_0x00dc:
            c.q.e.d r2 = r1.f6859A
            r2.mo32471a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p307cn.bingoogolapple.qrcode.zxing.ZXingView.mo21120p(byte[], int, int, boolean):b.a.a.a.e");
    }

    /* renamed from: r */
    public void mo21122r() {
        C7018d dVar = new C7018d();
        this.f6859A = dVar;
        BarcodeType barcodeType = this.f6765t;
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
            dVar.mo32475e(this.f6860B);
        } else {
            dVar.mo32475e(C1333a.f318a);
        }
    }

    public ZXingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
