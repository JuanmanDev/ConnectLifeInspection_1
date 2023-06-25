package p040c.p200q.p406e.p418o;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.h */
/* compiled from: ITFReader */
public final class C7074h extends C7077k {

    /* renamed from: b */
    public static final int[] f13581b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    public static final int[] f13582c = {1, 1, 1, 1};

    /* renamed from: d */
    public static final int[] f13583d = {1, 1, 3};

    /* renamed from: e */
    public static final int[][] f13584e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    public int f13585a = -1;

    /* renamed from: h */
    public static int m21011h(int[] iArr) {
        int length = f13584e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float e = C7077k.m21023e(iArr, f13584e[i2], 0.78f);
            if (e < f) {
                i = i2;
                f = e;
            }
        }
        if (i >= 0) {
            return i;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: j */
    public static void m21012j(C7032a aVar, int i, int i2, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            C7077k.m21024f(aVar, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb.append((char) (m21011h(iArr2) + 48));
            sb.append((char) (m21011h(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: l */
    public static int[] m21013l(C7032a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int h = aVar.mo32523h();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < h) {
            if (aVar.mo32517c(i) ^ z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                int i4 = length - 1;
                if (i3 != i4) {
                    i3++;
                } else if (C7077k.m21023e(iArr2, iArr, 0.78f) < 0.38f) {
                    return new int[]{i2, i};
                } else {
                    i2 += iArr2[0] + iArr2[1];
                    int i5 = length - 2;
                    System.arraycopy(iArr2, 2, iArr2, 0, i5);
                    iArr2[i5] = 0;
                    iArr2[i4] = 0;
                    i3--;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: m */
    public static int m21014m(C7032a aVar) {
        int h = aVar.mo32523h();
        int e = aVar.mo32520e(0);
        if (e != h) {
            return e;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: c */
    public C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map) {
        boolean z;
        int[] k = mo32653k(aVar);
        int[] i2 = mo32652i(aVar);
        StringBuilder sb = new StringBuilder(20);
        m21012j(aVar, k[1], i2[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f13581b;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= length2) {
                z = false;
                break;
            }
            int i5 = iArr[i3];
            if (length == i5) {
                z = true;
                break;
            }
            if (i5 > i4) {
                i4 = i5;
            }
            i3++;
        }
        if (!z && length > i4) {
            z = true;
        }
        if (z) {
            float f = (float) i;
            return new C7022h(sb2, (byte[]) null, new C7023i[]{new C7023i((float) k[1], f), new C7023i((float) i2[0], f)}, BarcodeFormat.ITF);
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: i */
    public final int[] mo32652i(C7032a aVar) {
        aVar.mo32526k();
        try {
            int[] l = m21013l(aVar, m21014m(aVar), f13583d);
            mo32654n(aVar, l[0]);
            int i = l[0];
            l[0] = aVar.mo32523h() - l[1];
            l[1] = aVar.mo32523h() - i;
            return l;
        } finally {
            aVar.mo32526k();
        }
    }

    /* renamed from: k */
    public final int[] mo32653k(C7032a aVar) {
        int[] l = m21013l(aVar, m21014m(aVar), f13582c);
        this.f13585a = (l[1] - l[0]) / 4;
        mo32654n(aVar, l[0]);
        return l;
    }

    /* renamed from: n */
    public final void mo32654n(C7032a aVar, int i) {
        int i2 = this.f13585a * 10;
        if (i2 >= i) {
            i2 = i;
        }
        int i3 = i - 1;
        while (i2 > 0 && i3 >= 0 && !aVar.mo32517c(i3)) {
            i2--;
            i3--;
        }
        if (i2 != 0) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
