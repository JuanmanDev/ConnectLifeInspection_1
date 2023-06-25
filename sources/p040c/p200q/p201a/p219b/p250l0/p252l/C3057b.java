package p040c.p200q.p201a.p219b.p250l0.p252l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3172s;

/* renamed from: c.q.a.b.l0.l.b */
/* compiled from: DvbParser */
public final class C3057b {

    /* renamed from: h */
    public static final byte[] f5444h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f5445i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f5446j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f5447a;

    /* renamed from: b */
    public final Paint f5448b;

    /* renamed from: c */
    public final Canvas f5449c = new Canvas();

    /* renamed from: d */
    public final C3059b f5450d = new C3059b(719, 575, 0, 719, 0, 575);

    /* renamed from: e */
    public final C3058a f5451e = new C3058a(0, m7303c(), m7304d(), m7305e());

    /* renamed from: f */
    public final C3065h f5452f;

    /* renamed from: g */
    public Bitmap f5453g;

    /* renamed from: c.q.a.b.l0.l.b$a */
    /* compiled from: DvbParser */
    public static final class C3058a {

        /* renamed from: a */
        public final int f5454a;

        /* renamed from: b */
        public final int[] f5455b;

        /* renamed from: c */
        public final int[] f5456c;

        /* renamed from: d */
        public final int[] f5457d;

        public C3058a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f5454a = i;
            this.f5455b = iArr;
            this.f5456c = iArr2;
            this.f5457d = iArr3;
        }
    }

    /* renamed from: c.q.a.b.l0.l.b$b */
    /* compiled from: DvbParser */
    public static final class C3059b {

        /* renamed from: a */
        public final int f5458a;

        /* renamed from: b */
        public final int f5459b;

        /* renamed from: c */
        public final int f5460c;

        /* renamed from: d */
        public final int f5461d;

        /* renamed from: e */
        public final int f5462e;

        /* renamed from: f */
        public final int f5463f;

        public C3059b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f5458a = i;
            this.f5459b = i2;
            this.f5460c = i3;
            this.f5461d = i4;
            this.f5462e = i5;
            this.f5463f = i6;
        }
    }

    /* renamed from: c.q.a.b.l0.l.b$c */
    /* compiled from: DvbParser */
    public static final class C3060c {

        /* renamed from: a */
        public final int f5464a;

        /* renamed from: b */
        public final boolean f5465b;

        /* renamed from: c */
        public final byte[] f5466c;

        /* renamed from: d */
        public final byte[] f5467d;

        public C3060c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f5464a = i;
            this.f5465b = z;
            this.f5466c = bArr;
            this.f5467d = bArr2;
        }
    }

    /* renamed from: c.q.a.b.l0.l.b$d */
    /* compiled from: DvbParser */
    public static final class C3061d {

        /* renamed from: a */
        public final int f5468a;

        /* renamed from: b */
        public final int f5469b;

        /* renamed from: c */
        public final SparseArray<C3062e> f5470c;

        public C3061d(int i, int i2, int i3, SparseArray<C3062e> sparseArray) {
            this.f5468a = i2;
            this.f5469b = i3;
            this.f5470c = sparseArray;
        }
    }

    /* renamed from: c.q.a.b.l0.l.b$e */
    /* compiled from: DvbParser */
    public static final class C3062e {

        /* renamed from: a */
        public final int f5471a;

        /* renamed from: b */
        public final int f5472b;

        public C3062e(int i, int i2) {
            this.f5471a = i;
            this.f5472b = i2;
        }
    }

    /* renamed from: c.q.a.b.l0.l.b$f */
    /* compiled from: DvbParser */
    public static final class C3063f {

        /* renamed from: a */
        public final int f5473a;

        /* renamed from: b */
        public final boolean f5474b;

        /* renamed from: c */
        public final int f5475c;

        /* renamed from: d */
        public final int f5476d;

        /* renamed from: e */
        public final int f5477e;

        /* renamed from: f */
        public final int f5478f;

        /* renamed from: g */
        public final int f5479g;

        /* renamed from: h */
        public final int f5480h;

        /* renamed from: i */
        public final int f5481i;

        /* renamed from: j */
        public final SparseArray<C3064g> f5482j;

        public C3063f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<C3064g> sparseArray) {
            this.f5473a = i;
            this.f5474b = z;
            this.f5475c = i2;
            this.f5476d = i3;
            this.f5477e = i5;
            this.f5478f = i6;
            this.f5479g = i7;
            this.f5480h = i8;
            this.f5481i = i9;
            this.f5482j = sparseArray;
        }

        /* renamed from: a */
        public void mo19703a(C3063f fVar) {
            if (fVar != null) {
                SparseArray<C3064g> sparseArray = fVar.f5482j;
                for (int i = 0; i < sparseArray.size(); i++) {
                    this.f5482j.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
                }
            }
        }
    }

    /* renamed from: c.q.a.b.l0.l.b$g */
    /* compiled from: DvbParser */
    public static final class C3064g {

        /* renamed from: a */
        public final int f5483a;

        /* renamed from: b */
        public final int f5484b;

        public C3064g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f5483a = i3;
            this.f5484b = i4;
        }
    }

    /* renamed from: c.q.a.b.l0.l.b$h */
    /* compiled from: DvbParser */
    public static final class C3065h {

        /* renamed from: a */
        public final int f5485a;

        /* renamed from: b */
        public final int f5486b;

        /* renamed from: c */
        public final SparseArray<C3063f> f5487c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C3058a> f5488d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C3060c> f5489e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C3058a> f5490f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C3060c> f5491g = new SparseArray<>();

        /* renamed from: h */
        public C3059b f5492h;

        /* renamed from: i */
        public C3061d f5493i;

        public C3065h(int i, int i2) {
            this.f5485a = i;
            this.f5486b = i2;
        }

        /* renamed from: a */
        public void mo19704a() {
            this.f5487c.clear();
            this.f5488d.clear();
            this.f5489e.clear();
            this.f5490f.clear();
            this.f5491g.clear();
            this.f5492h = null;
            this.f5493i = null;
        }
    }

    public C3057b(int i, int i2) {
        Paint paint = new Paint();
        this.f5447a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f5447a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.f5447a.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f5448b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5448b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        this.f5448b.setPathEffect((PathEffect) null);
        this.f5452f = new C3065h(i, i2);
    }

    /* renamed from: a */
    public static byte[] m7302a(int i, int i2, C3172s sVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) sVar.mo19985h(i2);
        }
        return bArr;
    }

    /* renamed from: c */
    public static int[] m7303c() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* renamed from: d */
    public static int[] m7304d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m7306f(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = 127;
                int i3 = (i & 1) != 0 ? 127 : 0;
                int i4 = (i & 2) != 0 ? 127 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m7306f(255, i3, i4, i2);
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public static int[] m7305e() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            int i2 = 255;
            if (i < 8) {
                int i3 = (i & 1) != 0 ? 255 : 0;
                int i4 = (i & 2) != 0 ? 255 : 0;
                if ((i & 4) == 0) {
                    i2 = 0;
                }
                iArr[i] = m7306f(63, i3, i4, i2);
            } else {
                int i5 = i & 136;
                int i6 = 170;
                int i7 = 85;
                if (i5 == 0) {
                    int i8 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i9 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m7306f(255, i8, i9, i7 + i6);
                } else if (i5 != 8) {
                    int i10 = 43;
                    if (i5 == 128) {
                        int i11 = ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0);
                        int i12 = ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        int i13 = i10 + 127;
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m7306f(255, i11, i12, i13 + i7);
                    } else if (i5 == 136) {
                        int i14 = ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0);
                        int i15 = ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0);
                        if ((i & 4) == 0) {
                            i10 = 0;
                        }
                        if ((i & 64) == 0) {
                            i7 = 0;
                        }
                        iArr[i] = m7306f(255, i14, i15, i10 + i7);
                    }
                } else {
                    int i16 = ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0);
                    int i17 = ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0);
                    if ((i & 4) == 0) {
                        i7 = 0;
                    }
                    if ((i & 64) == 0) {
                        i6 = 0;
                    }
                    iArr[i] = m7306f(127, i16, i17, i7 + i6);
                }
            }
        }
        return iArr;
    }

    /* renamed from: f */
    public static int m7306f(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7307g(p040c.p200q.p201a.p219b.p261o0.C3172s r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 2
            int r4 = r13.mo19985h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0014
            r11 = r2
            r12 = r5
            goto L_0x0060
        L_0x0014:
            boolean r4 = r13.mo19984g()
            r6 = 3
            if (r4 == 0) goto L_0x0028
            int r4 = r13.mo19985h(r6)
            int r4 = r4 + r6
            int r3 = r13.mo19985h(r3)
        L_0x0024:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L_0x0060
        L_0x0028:
            boolean r4 = r13.mo19984g()
            if (r4 == 0) goto L_0x0032
            r11 = r2
            r12 = r5
        L_0x0030:
            r4 = r9
            goto L_0x0060
        L_0x0032:
            int r4 = r13.mo19985h(r3)
            if (r4 == 0) goto L_0x005e
            if (r4 == r5) goto L_0x005b
            if (r4 == r3) goto L_0x004f
            if (r4 == r6) goto L_0x0042
            r11 = r2
        L_0x003f:
            r4 = r9
            r12 = r4
            goto L_0x0060
        L_0x0042:
            r4 = 8
            int r4 = r13.mo19985h(r4)
            int r4 = r4 + 29
            int r3 = r13.mo19985h(r3)
            goto L_0x0024
        L_0x004f:
            r4 = 4
            int r4 = r13.mo19985h(r4)
            int r4 = r4 + 12
            int r3 = r13.mo19985h(r3)
            goto L_0x0024
        L_0x005b:
            r11 = r2
            r12 = r3
            goto L_0x0030
        L_0x005e:
            r11 = r5
            goto L_0x003f
        L_0x0060:
            if (r12 == 0) goto L_0x007e
            if (r8 == 0) goto L_0x007e
            if (r15 == 0) goto L_0x0068
            byte r4 = r15[r4]
        L_0x0068:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x007e:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0082
            return r10
        L_0x0082:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p252l.C3057b.m7307g(c.q.a.b.o0.s, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7308h(p040c.p200q.p201a.p219b.p261o0.C3172s r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 4
            int r4 = r13.mo19985h(r3)
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0016
            r11 = r2
            r12 = r6
            goto L_0x0069
        L_0x0016:
            boolean r4 = r13.mo19984g()
            r7 = 3
            if (r4 != 0) goto L_0x002b
            int r3 = r13.mo19985h(r7)
            if (r3 == 0) goto L_0x0029
            int r5 = r3 + 2
        L_0x0025:
            r11 = r2
            r12 = r5
        L_0x0027:
            r4 = r9
            goto L_0x0069
        L_0x0029:
            r11 = r6
            goto L_0x004b
        L_0x002b:
            boolean r4 = r13.mo19984g()
            if (r4 != 0) goto L_0x003e
            int r4 = r13.mo19985h(r5)
            int r5 = r4 + 4
            int r4 = r13.mo19985h(r3)
        L_0x003b:
            r11 = r2
            r12 = r5
            goto L_0x0069
        L_0x003e:
            int r4 = r13.mo19985h(r5)
            if (r4 == 0) goto L_0x0066
            if (r4 == r6) goto L_0x0025
            if (r4 == r5) goto L_0x005b
            if (r4 == r7) goto L_0x004e
            r11 = r2
        L_0x004b:
            r4 = r9
            r12 = r4
            goto L_0x0069
        L_0x004e:
            r4 = 8
            int r4 = r13.mo19985h(r4)
            int r5 = r4 + 25
            int r4 = r13.mo19985h(r3)
            goto L_0x003b
        L_0x005b:
            int r4 = r13.mo19985h(r3)
            int r5 = r4 + 9
            int r4 = r13.mo19985h(r3)
            goto L_0x003b
        L_0x0066:
            r11 = r2
            r12 = r6
            goto L_0x0027
        L_0x0069:
            if (r12 == 0) goto L_0x0085
            if (r8 == 0) goto L_0x0085
            if (r15 == 0) goto L_0x0071
            byte r4 = r15[r4]
        L_0x0071:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r5 = (float) r2
            int r2 = r1 + 1
            float r6 = (float) r2
            r2 = r19
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0085:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0089
            return r10
        L_0x0089:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p252l.C3057b.m7308h(c.q.a.b.o0.s, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7309i(p040c.p200q.p201a.p219b.p261o0.C3172s r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = r9
        L_0x0009:
            r3 = 8
            int r4 = r13.mo19985h(r3)
            r5 = 1
            if (r4 == 0) goto L_0x0015
            r11 = r2
            r12 = r5
            goto L_0x0035
        L_0x0015:
            boolean r4 = r13.mo19984g()
            r6 = 7
            if (r4 != 0) goto L_0x002a
            int r3 = r13.mo19985h(r6)
            if (r3 == 0) goto L_0x0026
            r11 = r2
            r12 = r3
            r4 = r9
            goto L_0x0035
        L_0x0026:
            r11 = r5
            r4 = r9
            r12 = r4
            goto L_0x0035
        L_0x002a:
            int r4 = r13.mo19985h(r6)
            int r3 = r13.mo19985h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
        L_0x0035:
            if (r12 == 0) goto L_0x0053
            if (r8 == 0) goto L_0x0053
            if (r15 == 0) goto L_0x003d
            byte r4 = r15[r4]
        L_0x003d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L_0x0053:
            int r10 = r10 + r12
            if (r11 == 0) goto L_0x0057
            return r10
        L_0x0057:
            r2 = r11
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.p252l.C3057b.m7309i(c.q.a.b.o0.s, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* renamed from: j */
    public static void m7310j(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4 = i;
        byte[] bArr4 = bArr;
        C3172s sVar = new C3172s(bArr);
        int i5 = i2;
        int i6 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        while (sVar.mo19979b() != 0) {
            int h = sVar.mo19985h(8);
            if (h != 240) {
                switch (h) {
                    case 16:
                        if (i4 != 3) {
                            if (i4 != 2) {
                                bArr2 = null;
                                i5 = m7307g(sVar, iArr, bArr2, i5, i6, paint, canvas);
                                sVar.mo19980c();
                                break;
                            } else {
                                bArr3 = bArr6 == null ? f5444h : bArr6;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f5445i : bArr5;
                        }
                        bArr2 = bArr3;
                        i5 = m7307g(sVar, iArr, bArr2, i5, i6, paint, canvas);
                        sVar.mo19980c();
                    case 17:
                        i5 = m7308h(sVar, iArr, i4 == 3 ? f5446j : null, i5, i6, paint, canvas);
                        sVar.mo19980c();
                        break;
                    case 18:
                        i5 = m7309i(sVar, iArr, (byte[]) null, i5, i6, paint, canvas);
                        break;
                    default:
                        switch (h) {
                            case 32:
                                bArr6 = m7302a(4, 4, sVar);
                                break;
                            case 33:
                                bArr5 = m7302a(4, 8, sVar);
                                break;
                            case 34:
                                bArr5 = m7302a(16, 8, sVar);
                                break;
                        }
                }
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    /* renamed from: k */
    public static void m7311k(C3060c cVar, C3058a aVar, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = aVar.f5457d;
        } else if (i == 2) {
            iArr = aVar.f5456c;
        } else {
            iArr = aVar.f5455b;
        }
        int[] iArr2 = iArr;
        int i4 = i;
        int i5 = i2;
        Paint paint2 = paint;
        Canvas canvas2 = canvas;
        m7310j(cVar.f5466c, iArr2, i4, i5, i3, paint2, canvas2);
        m7310j(cVar.f5467d, iArr2, i4, i5, i3 + 1, paint2, canvas2);
    }

    /* renamed from: l */
    public static C3058a m7312l(C3172s sVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C3172s sVar2 = sVar;
        int i7 = 8;
        int h = sVar2.mo19985h(8);
        sVar2.mo19993p(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] c = m7303c();
        int[] d = m7304d();
        int[] e = m7305e();
        while (i9 > 0) {
            int h2 = sVar2.mo19985h(i7);
            int h3 = sVar2.mo19985h(i7);
            int i10 = i9 - 2;
            int[] iArr = (h3 & 128) != 0 ? c : (h3 & 64) != 0 ? d : e;
            if ((h3 & 1) != 0) {
                i5 = sVar2.mo19985h(i7);
                i4 = sVar2.mo19985h(i7);
                i3 = sVar2.mo19985h(i7);
                i2 = sVar2.mo19985h(i7);
                i6 = i10 - 4;
            } else {
                i3 = sVar2.mo19985h(4) << 4;
                i6 = i10 - 2;
                int h4 = sVar2.mo19985h(4) << 4;
                i2 = sVar2.mo19985h(i8) << 6;
                i5 = sVar2.mo19985h(6) << i8;
                i4 = h4;
            }
            if (i5 == 0) {
                i2 = 255;
                i4 = 0;
                i3 = 0;
            }
            double d2 = (double) i5;
            double d3 = (double) (i4 - 128);
            double d4 = (double) (i3 - 128);
            iArr[h2] = m7306f((byte) (255 - (i2 & 255)), C3152e0.m7813n((int) (d2 + (1.402d * d3)), 0, 255), C3152e0.m7813n((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), C3152e0.m7813n((int) (d2 + (d4 * 1.772d)), 0, 255));
            i9 = i6;
            h = h;
            i7 = 8;
            i8 = 2;
        }
        return new C3058a(h, c, d, e);
    }

    /* renamed from: m */
    public static C3059b m7313m(C3172s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        sVar.mo19993p(4);
        boolean g = sVar.mo19984g();
        sVar.mo19993p(3);
        int h = sVar.mo19985h(16);
        int h2 = sVar.mo19985h(16);
        if (g) {
            int h3 = sVar.mo19985h(16);
            int h4 = sVar.mo19985h(16);
            int h5 = sVar.mo19985h(16);
            i = sVar.mo19985h(16);
            i3 = h4;
            i2 = h5;
            i4 = h3;
        } else {
            i4 = 0;
            i2 = 0;
            i3 = h;
            i = h2;
        }
        return new C3059b(h, h2, i4, i3, i2, i);
    }

    /* renamed from: n */
    public static C3060c m7314n(C3172s sVar) {
        byte[] bArr;
        int h = sVar.mo19985h(16);
        sVar.mo19993p(4);
        int h2 = sVar.mo19985h(2);
        boolean g = sVar.mo19984g();
        sVar.mo19993p(1);
        byte[] bArr2 = null;
        if (h2 == 1) {
            sVar.mo19993p(sVar.mo19985h(8) * 16);
        } else if (h2 == 0) {
            int h3 = sVar.mo19985h(16);
            int h4 = sVar.mo19985h(16);
            if (h3 > 0) {
                bArr2 = new byte[h3];
                sVar.mo19987j(bArr2, 0, h3);
            }
            if (h4 > 0) {
                bArr = new byte[h4];
                sVar.mo19987j(bArr, 0, h4);
                return new C3060c(h, g, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C3060c(h, g, bArr2, bArr);
    }

    /* renamed from: o */
    public static C3061d m7315o(C3172s sVar, int i) {
        int h = sVar.mo19985h(8);
        int h2 = sVar.mo19985h(4);
        int h3 = sVar.mo19985h(2);
        sVar.mo19993p(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int h4 = sVar.mo19985h(8);
            sVar.mo19993p(8);
            i2 -= 6;
            sparseArray.put(h4, new C3062e(sVar.mo19985h(16), sVar.mo19985h(16)));
        }
        return new C3061d(h, h2, h3, sparseArray);
    }

    /* renamed from: p */
    public static C3063f m7316p(C3172s sVar, int i) {
        int i2;
        int i3;
        C3172s sVar2 = sVar;
        int h = sVar2.mo19985h(8);
        sVar2.mo19993p(4);
        boolean g = sVar.mo19984g();
        sVar2.mo19993p(3);
        int i4 = 16;
        int h2 = sVar2.mo19985h(16);
        int h3 = sVar2.mo19985h(16);
        int h4 = sVar2.mo19985h(3);
        int h5 = sVar2.mo19985h(3);
        int i5 = 2;
        sVar2.mo19993p(2);
        int h6 = sVar2.mo19985h(8);
        int h7 = sVar2.mo19985h(8);
        int h8 = sVar2.mo19985h(4);
        int h9 = sVar2.mo19985h(2);
        sVar2.mo19993p(2);
        int i6 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int h10 = sVar2.mo19985h(i4);
            int h11 = sVar2.mo19985h(i5);
            int h12 = sVar2.mo19985h(i5);
            int h13 = sVar2.mo19985h(12);
            int i7 = h9;
            sVar2.mo19993p(4);
            int h14 = sVar2.mo19985h(12);
            i6 -= 6;
            if (h11 == 1 || h11 == 2) {
                i6 -= 2;
                i3 = sVar2.mo19985h(8);
                i2 = sVar2.mo19985h(8);
            } else {
                i3 = 0;
                i2 = 0;
            }
            sparseArray.put(h10, new C3064g(h11, h12, h13, h14, i3, i2));
            h9 = i7;
            i5 = 2;
            i4 = 16;
        }
        return new C3063f(h, g, h2, h3, h4, h5, h6, h7, h8, h9, sparseArray);
    }

    /* renamed from: q */
    public static void m7317q(C3172s sVar, C3065h hVar) {
        int h = sVar.mo19985h(8);
        int h2 = sVar.mo19985h(16);
        int h3 = sVar.mo19985h(16);
        int d = sVar.mo19981d() + h3;
        if (h3 * 8 > sVar.mo19979b()) {
            C3163m.m7880f("DvbParser", "Data field length exceeds limit");
            sVar.mo19993p(sVar.mo19979b());
            return;
        }
        switch (h) {
            case 16:
                if (h2 == hVar.f5485a) {
                    C3061d dVar = hVar.f5493i;
                    C3061d o = m7315o(sVar, h3);
                    if (o.f5469b == 0) {
                        if (!(dVar == null || dVar.f5468a == o.f5468a)) {
                            hVar.f5493i = o;
                            break;
                        }
                    } else {
                        hVar.f5493i = o;
                        hVar.f5487c.clear();
                        hVar.f5488d.clear();
                        hVar.f5489e.clear();
                        break;
                    }
                }
                break;
            case 17:
                C3061d dVar2 = hVar.f5493i;
                if (h2 == hVar.f5485a && dVar2 != null) {
                    C3063f p = m7316p(sVar, h3);
                    if (dVar2.f5469b == 0) {
                        p.mo19703a(hVar.f5487c.get(p.f5473a));
                    }
                    hVar.f5487c.put(p.f5473a, p);
                    break;
                }
            case 18:
                if (h2 != hVar.f5485a) {
                    if (h2 == hVar.f5486b) {
                        C3058a l = m7312l(sVar, h3);
                        hVar.f5490f.put(l.f5454a, l);
                        break;
                    }
                } else {
                    C3058a l2 = m7312l(sVar, h3);
                    hVar.f5488d.put(l2.f5454a, l2);
                    break;
                }
                break;
            case 19:
                if (h2 != hVar.f5485a) {
                    if (h2 == hVar.f5486b) {
                        C3060c n = m7314n(sVar);
                        hVar.f5491g.put(n.f5464a, n);
                        break;
                    }
                } else {
                    C3060c n2 = m7314n(sVar);
                    hVar.f5489e.put(n2.f5464a, n2);
                    break;
                }
                break;
            case 20:
                if (h2 == hVar.f5485a) {
                    hVar.f5492h = m7313m(sVar);
                    break;
                }
                break;
        }
        sVar.mo19994q(d - sVar.mo19981d());
    }

    /* renamed from: b */
    public List<C3031a> mo19701b(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray<C3064g> sparseArray;
        C3172s sVar = new C3172s(bArr, i);
        while (sVar.mo19979b() >= 48 && sVar.mo19985h(8) == 15) {
            m7317q(sVar, this.f5452f);
        }
        C3065h hVar = this.f5452f;
        if (hVar.f5493i == null) {
            return Collections.emptyList();
        }
        C3059b bVar = hVar.f5492h;
        if (bVar == null) {
            bVar = this.f5450d;
        }
        Bitmap bitmap = this.f5453g;
        if (!(bitmap != null && bVar.f5458a + 1 == bitmap.getWidth() && bVar.f5459b + 1 == this.f5453g.getHeight())) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f5458a + 1, bVar.f5459b + 1, Bitmap.Config.ARGB_8888);
            this.f5453g = createBitmap;
            this.f5449c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C3062e> sparseArray2 = this.f5452f.f5493i.f5470c;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            C3062e valueAt = sparseArray2.valueAt(i4);
            C3063f fVar = this.f5452f.f5487c.get(sparseArray2.keyAt(i4));
            int i5 = valueAt.f5471a + bVar.f5460c;
            int i6 = valueAt.f5472b + bVar.f5462e;
            float f = (float) i5;
            float f2 = (float) i6;
            float f3 = f2;
            float f4 = f;
            this.f5449c.clipRect(f, f2, (float) Math.min(fVar.f5475c + i5, bVar.f5461d), (float) Math.min(fVar.f5476d + i6, bVar.f5463f), Region.Op.REPLACE);
            C3058a aVar = this.f5452f.f5488d.get(fVar.f5478f);
            if (aVar == null && (aVar = this.f5452f.f5490f.get(fVar.f5478f)) == null) {
                aVar = this.f5451e;
            }
            SparseArray<C3064g> sparseArray3 = fVar.f5482j;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C3064g valueAt2 = sparseArray3.valueAt(i7);
                C3060c cVar = this.f5452f.f5489e.get(keyAt);
                C3060c cVar2 = cVar == null ? this.f5452f.f5491g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m7311k(cVar2, aVar, fVar.f5477e, valueAt2.f5483a + i5, i6 + valueAt2.f5484b, cVar2.f5465b ? null : this.f5447a, this.f5449c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f5474b) {
                int i8 = fVar.f5477e;
                if (i8 == 3) {
                    i2 = aVar.f5457d[fVar.f5479g];
                } else if (i8 == 2) {
                    i2 = aVar.f5456c[fVar.f5480h];
                } else {
                    i2 = aVar.f5455b[fVar.f5481i];
                }
                this.f5448b.setColor(i2);
                this.f5449c.drawRect(f4, f3, (float) (fVar.f5475c + i5), (float) (fVar.f5476d + i6), this.f5448b);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f5453g, i5, i6, fVar.f5475c, fVar.f5476d);
            int i9 = bVar.f5458a;
            int i10 = bVar.f5459b;
            arrayList.add(new C3031a(createBitmap2, f4 / ((float) i9), 0, f3 / ((float) i10), 0, ((float) fVar.f5475c) / ((float) i9), ((float) fVar.f5476d) / ((float) i10)));
            this.f5449c.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    /* renamed from: r */
    public void mo19702r() {
        this.f5452f.mo19704a();
    }
}
