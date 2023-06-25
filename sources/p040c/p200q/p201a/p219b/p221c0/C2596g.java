package p040c.p200q.p201a.p219b.p221c0;

import android.support.p025v4.media.session.MediaSessionCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.List;
import okio.Utf8;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.c0.g */
/* compiled from: Ac3Util */
public final class C2596g {

    /* renamed from: a */
    public static final int[] f3098a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f3099b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f3100c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f3101d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f3102e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP, 384, 448, 512, 576, 640};

    /* renamed from: f */
    public static final int[] f3103f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: c.q.a.b.c0.g$b */
    /* compiled from: Ac3Util */
    public static final class C2598b {

        /* renamed from: a */
        public final String f3104a;

        /* renamed from: b */
        public final int f3105b;

        /* renamed from: c */
        public final int f3106c;

        /* renamed from: d */
        public final int f3107d;

        /* renamed from: e */
        public final int f3108e;

        public C2598b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f3104a = str;
            this.f3106c = i2;
            this.f3105b = i3;
            this.f3107d = i4;
            this.f3108e = i5;
        }
    }

    /* renamed from: a */
    public static int m4814a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m4815b() {
        return 1536;
    }

    /* renamed from: c */
    public static int m4816c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f3099b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f3103f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f3102e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    /* renamed from: d */
    public static Format m4817d(C3173t tVar, String str, String str2, DrmInitData drmInitData) {
        int i = f3099b[(tVar.mo20032y() & 192) >> 6];
        int y = tVar.mo20032y();
        int i2 = f3101d[(y & 56) >> 3];
        if ((y & 4) != 0) {
            i2++;
        }
        return Format.m10238l(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, drmInitData, 0, str2);
    }

    /* renamed from: e */
    public static C2598b m4818e(C3172s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        C3172s sVar2 = sVar;
        int e = sVar.mo19982e();
        sVar2.mo19993p(40);
        boolean z = sVar2.mo19985h(5) == 16;
        sVar2.mo19991n(e);
        int i8 = -1;
        if (z) {
            sVar2.mo19993p(16);
            int h = sVar2.mo19985h(2);
            if (h == 0) {
                i8 = 0;
            } else if (h == 1) {
                i8 = 1;
            } else if (h == 2) {
                i8 = 2;
            }
            sVar2.mo19993p(3);
            i4 = (sVar2.mo19985h(11) + 1) * 2;
            int h2 = sVar2.mo19985h(2);
            if (h2 == 3) {
                i5 = 6;
                i3 = f3100c[sVar2.mo19985h(2)];
                i6 = 3;
            } else {
                i6 = sVar2.mo19985h(2);
                i5 = f3098a[i6];
                i3 = f3099b[h2];
            }
            i2 = i5 * 256;
            int h3 = sVar2.mo19985h(3);
            boolean g = sVar.mo19984g();
            i = f3101d[h3] + (g ? 1 : 0);
            sVar2.mo19993p(10);
            if (sVar.mo19984g()) {
                sVar2.mo19993p(8);
            }
            if (h3 == 0) {
                sVar2.mo19993p(5);
                if (sVar.mo19984g()) {
                    sVar2.mo19993p(8);
                }
            }
            if (i8 == 1 && sVar.mo19984g()) {
                sVar2.mo19993p(16);
            }
            if (sVar.mo19984g()) {
                if (h3 > 2) {
                    sVar2.mo19993p(2);
                }
                if ((h3 & 1) != 0 && h3 > 2) {
                    sVar2.mo19993p(6);
                }
                if ((h3 & 4) != 0) {
                    sVar2.mo19993p(6);
                }
                if (g && sVar.mo19984g()) {
                    sVar2.mo19993p(5);
                }
                if (i8 == 0) {
                    if (sVar.mo19984g()) {
                        sVar2.mo19993p(6);
                    }
                    if (h3 == 0 && sVar.mo19984g()) {
                        sVar2.mo19993p(6);
                    }
                    if (sVar.mo19984g()) {
                        sVar2.mo19993p(6);
                    }
                    int h4 = sVar2.mo19985h(2);
                    if (h4 == 1) {
                        sVar2.mo19993p(5);
                    } else if (h4 == 2) {
                        sVar2.mo19993p(12);
                    } else if (h4 == 3) {
                        int h5 = sVar2.mo19985h(5);
                        if (sVar.mo19984g()) {
                            sVar2.mo19993p(5);
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(4);
                            }
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(4);
                            }
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(4);
                            }
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(4);
                            }
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(4);
                            }
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(4);
                            }
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(4);
                            }
                            if (sVar.mo19984g()) {
                                if (sVar.mo19984g()) {
                                    sVar2.mo19993p(4);
                                }
                                if (sVar.mo19984g()) {
                                    sVar2.mo19993p(4);
                                }
                            }
                        }
                        if (sVar.mo19984g()) {
                            sVar2.mo19993p(5);
                            if (sVar.mo19984g()) {
                                sVar2.mo19993p(7);
                                if (sVar.mo19984g()) {
                                    sVar2.mo19993p(8);
                                }
                            }
                        }
                        sVar2.mo19993p((h5 + 2) * 8);
                        sVar.mo19980c();
                    }
                    if (h3 < 2) {
                        if (sVar.mo19984g()) {
                            sVar2.mo19993p(14);
                        }
                        if (h3 == 0 && sVar.mo19984g()) {
                            sVar2.mo19993p(14);
                        }
                    }
                    if (sVar.mo19984g()) {
                        if (i6 == 0) {
                            sVar2.mo19993p(5);
                        } else {
                            for (int i9 = 0; i9 < i5; i9++) {
                                if (sVar.mo19984g()) {
                                    sVar2.mo19993p(5);
                                }
                            }
                        }
                    }
                }
            }
            if (sVar.mo19984g()) {
                sVar2.mo19993p(5);
                if (h3 == 2) {
                    sVar2.mo19993p(4);
                }
                if (h3 >= 6) {
                    sVar2.mo19993p(2);
                }
                if (sVar.mo19984g()) {
                    sVar2.mo19993p(8);
                }
                if (h3 == 0 && sVar.mo19984g()) {
                    sVar2.mo19993p(8);
                }
                i7 = 3;
                if (h2 < 3) {
                    sVar.mo19992o();
                }
            } else {
                i7 = 3;
            }
            if (i8 == 0 && i6 != i7) {
                sVar.mo19992o();
            }
            if (i8 == 2 && (i6 == i7 || sVar.mo19984g())) {
                sVar2.mo19993p(6);
            }
            str = (sVar.mo19984g() && sVar2.mo19985h(6) == 1 && sVar2.mo19985h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
        } else {
            sVar2.mo19993p(32);
            int h6 = sVar2.mo19985h(2);
            i4 = m4816c(h6, sVar2.mo19985h(6));
            sVar2.mo19993p(8);
            int h7 = sVar2.mo19985h(3);
            if (!((h7 & 1) == 0 || h7 == 1)) {
                sVar2.mo19993p(2);
            }
            if ((h7 & 4) != 0) {
                sVar2.mo19993p(2);
            }
            if (h7 == 2) {
                sVar2.mo19993p(2);
            }
            i3 = f3099b[h6];
            i2 = 1536;
            i = f3101d[h7] + (sVar.mo19984g() ? 1 : 0);
            str = "audio/ac3";
        }
        return new C2598b(str, i8, i, i3, i4, i2);
    }

    /* renamed from: f */
    public static int m4819f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 255) >> 3) == 16)) {
            return m4816c((bArr[4] & ExifInterface.MARKER_SOF0) >> 6, bArr[4] & Utf8.REPLACEMENT_BYTE);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    /* renamed from: g */
    public static Format m4820g(C3173t tVar, String str, String str2, DrmInitData drmInitData) {
        C3173t tVar2 = tVar;
        tVar.mo20007M(2);
        int i = f3099b[(tVar.mo20032y() & 192) >> 6];
        int y = tVar.mo20032y();
        int i2 = f3101d[(y & 14) >> 1];
        if ((y & 1) != 0) {
            i2++;
        }
        if (((tVar.mo20032y() & 30) >> 1) > 0 && (2 & tVar.mo20032y()) != 0) {
            i2 += 2;
        }
        return Format.m10238l(str, (tVar.mo20008a() <= 0 || (tVar.mo20032y() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", (String) null, -1, -1, i2, i, (List<byte[]>) null, drmInitData, 0, str2);
    }

    /* renamed from: h */
    public static int m4821h(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & ExifInterface.MARKER_SOF0) >> 6) != 3) {
            i = f3098a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: i */
    public static int m4822i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: j */
    public static int m4823j(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & ExifInterface.MARKER_COM) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }
}
