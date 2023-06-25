package p704p.p705a.p706a;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.browser.browseractions.BrowserServiceFileProvider;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: p.a.a.a */
/* compiled from: Checker */
public enum C9986a {
    SINGLE;
    

    /* renamed from: m */
    public static List<String> f19433m;

    /* renamed from: e */
    public final byte[] f19435e;

    /* access modifiers changed from: public */
    static {
        ArrayList arrayList = new ArrayList();
        f19433m = arrayList;
        arrayList.add(".jpg");
        f19433m.add(".jpeg");
        f19433m.add(BrowserServiceFileProvider.FILE_EXTENSION);
        f19433m.add(".webp");
        f19433m.add(".gif");
    }

    /* renamed from: c */
    public String mo53706c(C9989d dVar) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(dVar.open(), (Rect) null, options);
            return options.outMimeType.replace("image/", MAPCookie.DOT);
        } catch (Exception unused) {
            return ".jpg";
        }
    }

    /* renamed from: d */
    public int mo53707d(InputStream inputStream) {
        return mo53708e(mo53713m(inputStream));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        r3 = 0;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0063, code lost:
        if (r3 <= 8) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0065, code lost:
        r2 = mo53712j(r11, r1, 4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006c, code lost:
        if (r2 == 1229531648) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0071, code lost:
        if (r2 == 1296891946) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0074, code lost:
        if (r2 != 1229531648) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0077, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0078, code lost:
        r2 = mo53712j(r11, r1 + 4, 4, r5) + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0081, code lost:
        if (r2 < 10) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0083, code lost:
        if (r2 <= r3) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0086, code lost:
        r1 = r1 + r2;
        r3 = r3 - r2;
        r2 = mo53712j(r11, r1 - 2, 2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008e, code lost:
        r4 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0090, code lost:
        if (r2 <= 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0094, code lost:
        if (r3 < 12) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009c, code lost:
        if (mo53712j(r11, r1, 2, r5) != 274) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009e, code lost:
        r11 = mo53712j(r11, r1 + 8, 2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a4, code lost:
        if (r11 == 3) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a7, code lost:
        if (r11 == 6) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a9, code lost:
        if (r11 == 8) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ab, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ac, code lost:
        return com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment.ANGLE_UP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00af, code lost:
        return 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b2, code lost:
        return 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b5, code lost:
        r1 = r1 + 12;
        r3 = r3 - 12;
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00bb, code lost:
        return 0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo53708e(byte[] r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = r0
        L_0x0005:
            int r2 = r1 + 3
            int r3 = r11.length
            r4 = 4
            r5 = 1
            r6 = 8
            r7 = 2
            if (r2 >= r3) goto L_0x0062
            int r2 = r1 + 1
            byte r1 = r11[r1]
            r3 = 255(0xff, float:3.57E-43)
            r1 = r1 & r3
            if (r1 != r3) goto L_0x005f
            byte r1 = r11[r2]
            r1 = r1 & r3
            if (r1 != r3) goto L_0x001e
            goto L_0x005d
        L_0x001e:
            int r2 = r2 + 1
            r3 = 216(0xd8, float:3.03E-43)
            if (r1 == r3) goto L_0x005d
            if (r1 != r5) goto L_0x0027
            goto L_0x005d
        L_0x0027:
            r3 = 217(0xd9, float:3.04E-43)
            if (r1 == r3) goto L_0x005f
            r3 = 218(0xda, float:3.05E-43)
            if (r1 != r3) goto L_0x0030
            goto L_0x005f
        L_0x0030:
            int r3 = r10.mo53712j(r11, r2, r7, r0)
            if (r3 < r7) goto L_0x005c
            int r8 = r2 + r3
            int r9 = r11.length
            if (r8 <= r9) goto L_0x003c
            goto L_0x005c
        L_0x003c:
            r9 = 225(0xe1, float:3.15E-43)
            if (r1 != r9) goto L_0x005a
            if (r3 < r6) goto L_0x005a
            int r1 = r2 + 2
            int r1 = r10.mo53712j(r11, r1, r4, r0)
            r9 = 1165519206(0x45786966, float:3974.5874)
            if (r1 != r9) goto L_0x005a
            int r1 = r2 + 6
            int r1 = r10.mo53712j(r11, r1, r7, r0)
            if (r1 != 0) goto L_0x005a
            int r1 = r2 + 8
            int r3 = r3 + -8
            goto L_0x0063
        L_0x005a:
            r1 = r8
            goto L_0x0005
        L_0x005c:
            return r0
        L_0x005d:
            r1 = r2
            goto L_0x0005
        L_0x005f:
            r3 = r0
            r1 = r2
            goto L_0x0063
        L_0x0062:
            r3 = r0
        L_0x0063:
            if (r3 <= r6) goto L_0x00bb
            int r2 = r10.mo53712j(r11, r1, r4, r0)
            r8 = 1229531648(0x49492a00, float:823968.0)
            if (r2 == r8) goto L_0x0074
            r9 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r2 == r9) goto L_0x0074
            return r0
        L_0x0074:
            if (r2 != r8) goto L_0x0077
            goto L_0x0078
        L_0x0077:
            r5 = r0
        L_0x0078:
            int r2 = r1 + 4
            int r2 = r10.mo53712j(r11, r2, r4, r5)
            int r2 = r2 + r7
            r4 = 10
            if (r2 < r4) goto L_0x00bb
            if (r2 <= r3) goto L_0x0086
            goto L_0x00bb
        L_0x0086:
            int r1 = r1 + r2
            int r3 = r3 - r2
            int r2 = r1 + -2
            int r2 = r10.mo53712j(r11, r2, r7, r5)
        L_0x008e:
            int r4 = r2 + -1
            if (r2 <= 0) goto L_0x00bb
            r2 = 12
            if (r3 < r2) goto L_0x00bb
            int r2 = r10.mo53712j(r11, r1, r7, r5)
            r8 = 274(0x112, float:3.84E-43)
            if (r2 != r8) goto L_0x00b5
            int r1 = r1 + r6
            int r11 = r10.mo53712j(r11, r1, r7, r5)
            r1 = 3
            if (r11 == r1) goto L_0x00b2
            r1 = 6
            if (r11 == r1) goto L_0x00af
            if (r11 == r6) goto L_0x00ac
            return r0
        L_0x00ac:
            r11 = 270(0x10e, float:3.78E-43)
            return r11
        L_0x00af:
            r11 = 90
            return r11
        L_0x00b2:
            r11 = 180(0xb4, float:2.52E-43)
            return r11
        L_0x00b5:
            int r1 = r1 + 12
            int r3 = r3 + -12
            r2 = r4
            goto L_0x008e
        L_0x00bb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p704p.p705a.p706a.C9986a.mo53708e(byte[]):int");
    }

    /* renamed from: g */
    public boolean mo53709g(InputStream inputStream) {
        return mo53710h(mo53713m(inputStream));
    }

    /* renamed from: h */
    public final boolean mo53710h(byte[] bArr) {
        if (bArr == null || bArr.length < 3) {
            return false;
        }
        return Arrays.equals(this.f19435e, new byte[]{bArr[0], bArr[1], bArr[2]});
    }

    /* renamed from: i */
    public boolean mo53711i(int i, String str) {
        if (i <= 0) {
            return true;
        }
        File file = new File(str);
        if (!file.exists() || file.length() <= ((long) (i << 10))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final int mo53712j(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i += i2 - 1;
            i3 = -1;
        } else {
            i3 = 1;
        }
        byte b = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 <= 0) {
                return b;
            }
            b = (bArr[i] & 255) | (b << 8);
            i += i3;
            i2 = i4;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        return new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        throw r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0024 */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo53713m(java.io.InputStream r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0006
            byte[] r7 = new byte[r0]
            return r7
        L_0x0006:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r2]
        L_0x000f:
            int r4 = r7.read(r3, r0, r2)     // Catch:{ Exception -> 0x0024 }
            r5 = -1
            if (r4 == r5) goto L_0x001a
            r1.write(r3, r0, r4)     // Catch:{ Exception -> 0x0024 }
            goto L_0x000f
        L_0x001a:
            r1.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            byte[] r7 = r1.toByteArray()
            return r7
        L_0x0022:
            r7 = move-exception
            goto L_0x002a
        L_0x0024:
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x0022 }
            r1.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r7
        L_0x002a:
            r1.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p704p.p705a.p706a.C9986a.mo53713m(java.io.InputStream):byte[]");
    }
}
