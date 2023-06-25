package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new C3995a();

    /* renamed from: A */
    public final int f7548A;
    @Nullable

    /* renamed from: B */
    public final byte[] f7549B;
    @Nullable

    /* renamed from: C */
    public final ColorInfo f7550C;

    /* renamed from: D */
    public final int f7551D;

    /* renamed from: E */
    public final int f7552E;

    /* renamed from: F */
    public final int f7553F;

    /* renamed from: G */
    public final int f7554G;

    /* renamed from: H */
    public final int f7555H;

    /* renamed from: I */
    public final int f7556I;
    @Nullable

    /* renamed from: J */
    public final String f7557J;

    /* renamed from: K */
    public final int f7558K;

    /* renamed from: L */
    public int f7559L;
    @Nullable

    /* renamed from: e */
    public final String f7560e;
    @Nullable

    /* renamed from: l */
    public final String f7561l;

    /* renamed from: m */
    public final int f7562m;
    @Nullable

    /* renamed from: n */
    public final String f7563n;
    @Nullable

    /* renamed from: o */
    public final Metadata f7564o;
    @Nullable

    /* renamed from: p */
    public final String f7565p;
    @Nullable

    /* renamed from: q */
    public final String f7566q;

    /* renamed from: r */
    public final int f7567r;

    /* renamed from: s */
    public final List<byte[]> f7568s;
    @Nullable

    /* renamed from: t */
    public final DrmInitData f7569t;

    /* renamed from: u */
    public final long f7570u;

    /* renamed from: v */
    public final int f7571v;

    /* renamed from: w */
    public final int f7572w;

    /* renamed from: x */
    public final float f7573x;

    /* renamed from: y */
    public final int f7574y;

    /* renamed from: z */
    public final float f7575z;

    /* renamed from: com.google.android.exoplayer2.Format$a */
    public static class C3995a implements Parcelable.Creator<Format> {
        /* renamed from: a */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* renamed from: b */
        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    public Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, int i4, float f, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str6, int i13, long j, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        this.f7560e = str;
        this.f7561l = str2;
        this.f7565p = str3;
        this.f7566q = str4;
        this.f7563n = str5;
        this.f7562m = i;
        this.f7567r = i2;
        this.f7571v = i3;
        this.f7572w = i4;
        this.f7573x = f;
        int i14 = i5;
        this.f7574y = i14 == -1 ? 0 : i14;
        this.f7575z = f2 == -1.0f ? 1.0f : f2;
        this.f7549B = bArr;
        this.f7548A = i6;
        this.f7550C = colorInfo;
        this.f7551D = i7;
        this.f7552E = i8;
        this.f7553F = i9;
        int i15 = i10;
        this.f7554G = i15 == -1 ? 0 : i15;
        int i16 = i11;
        this.f7555H = i16 == -1 ? 0 : i16;
        this.f7556I = i12;
        this.f7557J = str6;
        this.f7558K = i13;
        this.f7570u = j;
        this.f7568s = list == null ? Collections.emptyList() : list;
        this.f7569t = drmInitData;
        this.f7564o = metadata;
    }

    /* renamed from: i */
    public static Format m10235i(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, int i3, @Nullable List<byte[]> list, int i4, @Nullable String str6) {
        return new Format(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i2, i3, -1, -1, -1, i4, str6, -1, Long.MAX_VALUE, list, (DrmInitData) null, (Metadata) null);
    }

    /* renamed from: j */
    public static Format m10236j(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i8, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, (String) null, (String) null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    /* renamed from: k */
    public static Format m10237k(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return m10236j(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, (Metadata) null);
    }

    /* renamed from: l */
    public static Format m10238l(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i5, @Nullable String str4) {
        return m10237k(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    /* renamed from: m */
    public static Format m10239m(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, @Nullable String str6) {
        return new Format(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str6, -1, Long.MAX_VALUE, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    /* renamed from: n */
    public static Format m10240n(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, (String) null, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str4, -1, Long.MAX_VALUE, list, drmInitData, (Metadata) null);
    }

    /* renamed from: o */
    public static Format m10241o(@Nullable String str, @Nullable String str2, long j) {
        return new Format(str, (String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, (String) null, -1, j, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    /* renamed from: p */
    public static Format m10242p(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable DrmInitData drmInitData) {
        return new Format(str, (String) null, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, drmInitData, (Metadata) null);
    }

    /* renamed from: q */
    public static Format m10243q(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, @Nullable String str6) {
        return m10244r(str, str2, str3, str4, str5, i, i2, str6, -1);
    }

    /* renamed from: r */
    public static Format m10244r(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i, int i2, @Nullable String str6, int i3) {
        return new Format(str, str2, str3, str4, str5, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str6, i3, Long.MAX_VALUE, (List<byte[]>) null, (DrmInitData) null, (Metadata) null);
    }

    /* renamed from: s */
    public static Format m10245s(@Nullable String str, String str2, int i, @Nullable String str3) {
        return m10246t(str, str2, i, str3, (DrmInitData) null);
    }

    /* renamed from: t */
    public static Format m10246t(@Nullable String str, String str2, int i, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return m10247u(str, str2, (String) null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: u */
    public static Format m10247u(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, (String) null, (String) null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, (Metadata) null);
    }

    /* renamed from: v */
    public static Format m10248v(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, @Nullable DrmInitData drmInitData, long j) {
        return m10247u(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.emptyList());
    }

    /* renamed from: w */
    public static Format m10249w(@Nullable String str, @Nullable String str2, @Nullable String str3, String str4, String str5, int i, int i2, int i3, float f, @Nullable List<byte[]> list, int i4) {
        return new Format(str, str2, str3, str4, str5, i, -1, i2, i3, f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, i4, (String) null, -1, Long.MAX_VALUE, list, (DrmInitData) null, (Metadata) null);
    }

    /* renamed from: x */
    public static Format m10250x(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, int i5, float f2, @Nullable DrmInitData drmInitData) {
        return m10251y(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (ColorInfo) null, drmInitData);
    }

    /* renamed from: y */
    public static Format m10251y(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, @Nullable List<byte[]> list, int i5, float f2, byte[] bArr, int i6, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, (String) null, (String) null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, drmInitData, (Metadata) null);
    }

    /* renamed from: A */
    public boolean mo23912A(Format format) {
        if (this.f7568s.size() != format.f7568s.size()) {
            return false;
        }
        for (int i = 0; i < this.f7568s.size(); i++) {
            if (!Arrays.equals(this.f7568s.get(i), format.f7568s.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public Format mo23913a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, @Nullable String str5) {
        return new Format(str, str2, this.f7565p, str3, str4, i, this.f7567r, i2, i3, this.f7573x, this.f7574y, this.f7575z, this.f7549B, this.f7548A, this.f7550C, this.f7551D, this.f7552E, this.f7553F, this.f7554G, this.f7555H, i4, str5, this.f7558K, this.f7570u, this.f7568s, this.f7569t, this.f7564o);
    }

    /* renamed from: b */
    public Format mo23914b(@Nullable DrmInitData drmInitData) {
        String str = this.f7560e;
        return new Format(str, this.f7561l, this.f7565p, this.f7566q, this.f7563n, this.f7562m, this.f7567r, this.f7571v, this.f7572w, this.f7573x, this.f7574y, this.f7575z, this.f7549B, this.f7548A, this.f7550C, this.f7551D, this.f7552E, this.f7553F, this.f7554G, this.f7555H, this.f7556I, this.f7557J, this.f7558K, this.f7570u, this.f7568s, drmInitData, this.f7564o);
    }

    /* renamed from: c */
    public Format mo23915c(float f) {
        String str = this.f7560e;
        return new Format(str, this.f7561l, this.f7565p, this.f7566q, this.f7563n, this.f7562m, this.f7567r, this.f7571v, this.f7572w, f, this.f7574y, this.f7575z, this.f7549B, this.f7548A, this.f7550C, this.f7551D, this.f7552E, this.f7553F, this.f7554G, this.f7555H, this.f7556I, this.f7557J, this.f7558K, this.f7570u, this.f7568s, this.f7569t, this.f7564o);
    }

    /* renamed from: d */
    public Format mo23916d(int i, int i2) {
        String str = this.f7560e;
        return new Format(str, this.f7561l, this.f7565p, this.f7566q, this.f7563n, this.f7562m, this.f7567r, this.f7571v, this.f7572w, this.f7573x, this.f7574y, this.f7575z, this.f7549B, this.f7548A, this.f7550C, this.f7551D, this.f7552E, this.f7553F, i, i2, this.f7556I, this.f7557J, this.f7558K, this.f7570u, this.f7568s, this.f7569t, this.f7564o);
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r6 = r1.f7557J;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.Format mo23918e(com.google.android.exoplayer2.Format r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            if (r0 != r1) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r2 = r0.f7566q
            int r2 = p040c.p200q.p201a.p219b.p261o0.C3166p.m7895g(r2)
            java.lang.String r4 = r1.f7560e
            java.lang.String r3 = r1.f7561l
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            java.lang.String r3 = r0.f7561l
        L_0x0016:
            r5 = r3
            java.lang.String r3 = r0.f7557J
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x001f
            if (r2 != r7) goto L_0x0026
        L_0x001f:
            java.lang.String r6 = r1.f7557J
            if (r6 == 0) goto L_0x0026
            r25 = r6
            goto L_0x0028
        L_0x0026:
            r25 = r3
        L_0x0028:
            int r3 = r0.f7562m
            r6 = -1
            if (r3 != r6) goto L_0x002f
            int r3 = r1.f7562m
        L_0x002f:
            r9 = r3
            java.lang.String r3 = r0.f7563n
            if (r3 != 0) goto L_0x0043
            java.lang.String r6 = r1.f7563n
            java.lang.String r6 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7826z(r6, r2)
            java.lang.String[] r8 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7802h0(r6)
            int r8 = r8.length
            if (r8 != r7) goto L_0x0043
            r8 = r6
            goto L_0x0044
        L_0x0043:
            r8 = r3
        L_0x0044:
            float r3 = r0.f7573x
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0053
            r6 = 2
            if (r2 != r6) goto L_0x0053
            float r2 = r1.f7573x
            r13 = r2
            goto L_0x0054
        L_0x0053:
            r13 = r3
        L_0x0054:
            int r2 = r0.f7556I
            int r3 = r1.f7556I
            r24 = r2 | r3
            com.google.android.exoplayer2.drm.DrmInitData r1 = r1.f7569t
            com.google.android.exoplayer2.drm.DrmInitData r2 = r0.f7569t
            com.google.android.exoplayer2.drm.DrmInitData r30 = com.google.android.exoplayer2.drm.DrmInitData.m10369d(r1, r2)
            com.google.android.exoplayer2.Format r1 = new com.google.android.exoplayer2.Format
            r3 = r1
            java.lang.String r6 = r0.f7565p
            java.lang.String r7 = r0.f7566q
            int r10 = r0.f7567r
            int r11 = r0.f7571v
            int r12 = r0.f7572w
            int r14 = r0.f7574y
            float r15 = r0.f7575z
            byte[] r2 = r0.f7549B
            r16 = r2
            int r2 = r0.f7548A
            r17 = r2
            com.google.android.exoplayer2.video.ColorInfo r2 = r0.f7550C
            r18 = r2
            int r2 = r0.f7551D
            r19 = r2
            int r2 = r0.f7552E
            r20 = r2
            int r2 = r0.f7553F
            r21 = r2
            int r2 = r0.f7554G
            r22 = r2
            int r2 = r0.f7555H
            r23 = r2
            int r2 = r0.f7558K
            r26 = r2
            r33 = r1
            long r1 = r0.f7570u
            r27 = r1
            java.util.List<byte[]> r1 = r0.f7568s
            r29 = r1
            com.google.android.exoplayer2.metadata.Metadata r1 = r0.f7564o
            r31 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r31)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Format.mo23918e(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.Format");
    }

    public boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f7559L;
        if (i2 != 0 && (i = format.f7559L) != 0 && i2 != i) {
            return false;
        }
        if (this.f7562m == format.f7562m && this.f7567r == format.f7567r && this.f7571v == format.f7571v && this.f7572w == format.f7572w && Float.compare(this.f7573x, format.f7573x) == 0 && this.f7574y == format.f7574y && Float.compare(this.f7575z, format.f7575z) == 0 && this.f7548A == format.f7548A && this.f7551D == format.f7551D && this.f7552E == format.f7552E && this.f7553F == format.f7553F && this.f7554G == format.f7554G && this.f7555H == format.f7555H && this.f7570u == format.f7570u && this.f7556I == format.f7556I && C3152e0.m7789b(this.f7560e, format.f7560e) && C3152e0.m7789b(this.f7561l, format.f7561l) && C3152e0.m7789b(this.f7557J, format.f7557J) && this.f7558K == format.f7558K && C3152e0.m7789b(this.f7565p, format.f7565p) && C3152e0.m7789b(this.f7566q, format.f7566q) && C3152e0.m7789b(this.f7563n, format.f7563n) && C3152e0.m7789b(this.f7569t, format.f7569t) && C3152e0.m7789b(this.f7564o, format.f7564o) && C3152e0.m7789b(this.f7550C, format.f7550C) && Arrays.equals(this.f7549B, format.f7549B) && mo23912A(format)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Format mo23920f(int i) {
        String str = this.f7560e;
        return new Format(str, this.f7561l, this.f7565p, this.f7566q, this.f7563n, this.f7562m, i, this.f7571v, this.f7572w, this.f7573x, this.f7574y, this.f7575z, this.f7549B, this.f7548A, this.f7550C, this.f7551D, this.f7552E, this.f7553F, this.f7554G, this.f7555H, this.f7556I, this.f7557J, this.f7558K, this.f7570u, this.f7568s, this.f7569t, this.f7564o);
    }

    /* renamed from: g */
    public Format mo23921g(@Nullable Metadata metadata) {
        String str = this.f7560e;
        return new Format(str, this.f7561l, this.f7565p, this.f7566q, this.f7563n, this.f7562m, this.f7567r, this.f7571v, this.f7572w, this.f7573x, this.f7574y, this.f7575z, this.f7549B, this.f7548A, this.f7550C, this.f7551D, this.f7552E, this.f7553F, this.f7554G, this.f7555H, this.f7556I, this.f7557J, this.f7558K, this.f7570u, this.f7568s, this.f7569t, metadata);
    }

    /* renamed from: h */
    public Format mo23922h(long j) {
        return new Format(this.f7560e, this.f7561l, this.f7565p, this.f7566q, this.f7563n, this.f7562m, this.f7567r, this.f7571v, this.f7572w, this.f7573x, this.f7574y, this.f7575z, this.f7549B, this.f7548A, this.f7550C, this.f7551D, this.f7552E, this.f7553F, this.f7554G, this.f7555H, this.f7556I, this.f7557J, this.f7558K, j, this.f7568s, this.f7569t, this.f7564o);
    }

    public int hashCode() {
        if (this.f7559L == 0) {
            String str = this.f7560e;
            int i = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f7565p;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f7566q;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f7563n;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f7562m) * 31) + this.f7571v) * 31) + this.f7572w) * 31) + this.f7551D) * 31) + this.f7552E) * 31;
            String str5 = this.f7557J;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f7558K) * 31;
            DrmInitData drmInitData = this.f7569t;
            int hashCode6 = (hashCode5 + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.f7564o;
            int hashCode7 = (hashCode6 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str6 = this.f7561l;
            if (str6 != null) {
                i = str6.hashCode();
            }
            this.f7559L = ((((((((((((((((((((hashCode7 + i) * 31) + this.f7567r) * 31) + ((int) this.f7570u)) * 31) + Float.floatToIntBits(this.f7573x)) * 31) + Float.floatToIntBits(this.f7575z)) * 31) + this.f7574y) * 31) + this.f7548A) * 31) + this.f7553F) * 31) + this.f7554G) * 31) + this.f7555H) * 31) + this.f7556I;
        }
        return this.f7559L;
    }

    public String toString() {
        return "Format(" + this.f7560e + ", " + this.f7561l + ", " + this.f7565p + ", " + this.f7566q + ", " + this.f7563n + ", " + this.f7562m + ", " + this.f7557J + ", [" + this.f7571v + ", " + this.f7572w + ", " + this.f7573x + "], [" + this.f7551D + ", " + this.f7552E + "])";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7560e);
        parcel.writeString(this.f7561l);
        parcel.writeString(this.f7565p);
        parcel.writeString(this.f7566q);
        parcel.writeString(this.f7563n);
        parcel.writeInt(this.f7562m);
        parcel.writeInt(this.f7567r);
        parcel.writeInt(this.f7571v);
        parcel.writeInt(this.f7572w);
        parcel.writeFloat(this.f7573x);
        parcel.writeInt(this.f7574y);
        parcel.writeFloat(this.f7575z);
        C3152e0.m7814n0(parcel, this.f7549B != null);
        byte[] bArr = this.f7549B;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f7548A);
        parcel.writeParcelable(this.f7550C, i);
        parcel.writeInt(this.f7551D);
        parcel.writeInt(this.f7552E);
        parcel.writeInt(this.f7553F);
        parcel.writeInt(this.f7554G);
        parcel.writeInt(this.f7555H);
        parcel.writeInt(this.f7556I);
        parcel.writeString(this.f7557J);
        parcel.writeInt(this.f7558K);
        parcel.writeLong(this.f7570u);
        int size = this.f7568s.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f7568s.get(i2));
        }
        parcel.writeParcelable(this.f7569t, 0);
        parcel.writeParcelable(this.f7564o, 0);
    }

    /* renamed from: z */
    public int mo23926z() {
        int i;
        int i2 = this.f7571v;
        if (i2 == -1 || (i = this.f7572w) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public Format(Parcel parcel) {
        this.f7560e = parcel.readString();
        this.f7561l = parcel.readString();
        this.f7565p = parcel.readString();
        this.f7566q = parcel.readString();
        this.f7563n = parcel.readString();
        this.f7562m = parcel.readInt();
        this.f7567r = parcel.readInt();
        this.f7571v = parcel.readInt();
        this.f7572w = parcel.readInt();
        this.f7573x = parcel.readFloat();
        this.f7574y = parcel.readInt();
        this.f7575z = parcel.readFloat();
        this.f7549B = C3152e0.m7786Z(parcel) ? parcel.createByteArray() : null;
        this.f7548A = parcel.readInt();
        this.f7550C = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f7551D = parcel.readInt();
        this.f7552E = parcel.readInt();
        this.f7553F = parcel.readInt();
        this.f7554G = parcel.readInt();
        this.f7555H = parcel.readInt();
        this.f7556I = parcel.readInt();
        this.f7557J = parcel.readString();
        this.f7558K = parcel.readInt();
        this.f7570u = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7568s = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f7568s.add(parcel.createByteArray());
        }
        this.f7569t = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f7564o = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }
}
