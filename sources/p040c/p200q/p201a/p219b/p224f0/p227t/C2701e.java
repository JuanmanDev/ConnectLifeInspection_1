package p040c.p200q.p201a.p219b.p224f0.p227t;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import androidx.core.util.TimeUtils;
import com.facebook.stetho.dumpapp.Framer;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p221c0.C2596g;
import p040c.p200q.p201a.p219b.p224f0.C2669b;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p224f0.C2681n;
import p040c.p200q.p201a.p219b.p224f0.C2682o;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3164n;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.t.e */
/* compiled from: MatroskaExtractor */
public final class C2701e implements C2674g {

    /* renamed from: Z */
    public static final byte[] f3513Z = {Framer.STDOUT_FRAME_PREFIX, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: a0 */
    public static final byte[] f3514a0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: b0 */
    public static final byte[] f3515b0 = C3152e0.m7773M("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: c0 */
    public static final byte[] f3516c0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: d0 */
    public static final byte[] f3517d0 = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};

    /* renamed from: e0 */
    public static final UUID f3518e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: A */
    public long f3519A;

    /* renamed from: B */
    public C3164n f3520B;

    /* renamed from: C */
    public C3164n f3521C;

    /* renamed from: D */
    public boolean f3522D;

    /* renamed from: E */
    public int f3523E;

    /* renamed from: F */
    public long f3524F;

    /* renamed from: G */
    public long f3525G;

    /* renamed from: H */
    public int f3526H;

    /* renamed from: I */
    public int f3527I;

    /* renamed from: J */
    public int[] f3528J;

    /* renamed from: K */
    public int f3529K;

    /* renamed from: L */
    public int f3530L;

    /* renamed from: M */
    public int f3531M;

    /* renamed from: N */
    public int f3532N;

    /* renamed from: O */
    public boolean f3533O;

    /* renamed from: P */
    public boolean f3534P;

    /* renamed from: Q */
    public boolean f3535Q;

    /* renamed from: R */
    public boolean f3536R;

    /* renamed from: S */
    public byte f3537S;

    /* renamed from: T */
    public int f3538T;

    /* renamed from: U */
    public int f3539U;

    /* renamed from: V */
    public int f3540V;

    /* renamed from: W */
    public boolean f3541W;

    /* renamed from: X */
    public boolean f3542X;

    /* renamed from: Y */
    public C2676i f3543Y;

    /* renamed from: a */
    public final C2699c f3544a;

    /* renamed from: b */
    public final C2707g f3545b;

    /* renamed from: c */
    public final SparseArray<C2704c> f3546c;

    /* renamed from: d */
    public final boolean f3547d;

    /* renamed from: e */
    public final C3173t f3548e;

    /* renamed from: f */
    public final C3173t f3549f;

    /* renamed from: g */
    public final C3173t f3550g;

    /* renamed from: h */
    public final C3173t f3551h;

    /* renamed from: i */
    public final C3173t f3552i;

    /* renamed from: j */
    public final C3173t f3553j;

    /* renamed from: k */
    public final C3173t f3554k;

    /* renamed from: l */
    public final C3173t f3555l;

    /* renamed from: m */
    public final C3173t f3556m;

    /* renamed from: n */
    public ByteBuffer f3557n;

    /* renamed from: o */
    public long f3558o;

    /* renamed from: p */
    public long f3559p;

    /* renamed from: q */
    public long f3560q;

    /* renamed from: r */
    public long f3561r;

    /* renamed from: s */
    public long f3562s;

    /* renamed from: t */
    public C2704c f3563t;

    /* renamed from: u */
    public boolean f3564u;

    /* renamed from: v */
    public int f3565v;

    /* renamed from: w */
    public long f3566w;

    /* renamed from: x */
    public boolean f3567x;

    /* renamed from: y */
    public long f3568y;

    /* renamed from: z */
    public long f3569z;

    /* renamed from: c.q.a.b.f0.t.e$b */
    /* compiled from: MatroskaExtractor */
    public final class C2703b implements C2700d {
        public C2703b() {
        }

        /* renamed from: a */
        public void mo18596a(int i) {
            C2701e.this.mo18609k(i);
        }

        /* renamed from: b */
        public int mo18597b(int i) {
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 30321:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /*225*/:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    return 5;
                default:
                    return 0;
            }
        }

        /* renamed from: c */
        public boolean mo18598c(int i) {
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        /* renamed from: d */
        public void mo18599d(int i, int i2, C2675h hVar) {
            C2701e.this.mo18605d(i, i2, hVar);
        }

        /* renamed from: e */
        public void mo18600e(int i, String str) {
            C2701e.this.mo18619y(i, str);
        }

        /* renamed from: f */
        public void mo18601f(int i, double d) {
            C2701e.this.mo18610m(i, d);
        }

        /* renamed from: g */
        public void mo18602g(int i, long j, long j2) {
            C2701e.this.mo18618x(i, j, j2);
        }

        /* renamed from: h */
        public void mo18603h(int i, long j) {
            C2701e.this.mo18611n(i, j);
        }
    }

    /* renamed from: c.q.a.b.f0.t.e$c */
    /* compiled from: MatroskaExtractor */
    public static final class C2704c {

        /* renamed from: A */
        public int f3571A;

        /* renamed from: B */
        public float f3572B;

        /* renamed from: C */
        public float f3573C;

        /* renamed from: D */
        public float f3574D;

        /* renamed from: E */
        public float f3575E;

        /* renamed from: F */
        public float f3576F;

        /* renamed from: G */
        public float f3577G;

        /* renamed from: H */
        public float f3578H;

        /* renamed from: I */
        public float f3579I;

        /* renamed from: J */
        public float f3580J;

        /* renamed from: K */
        public float f3581K;

        /* renamed from: L */
        public int f3582L;

        /* renamed from: M */
        public int f3583M;

        /* renamed from: N */
        public int f3584N;

        /* renamed from: O */
        public long f3585O;

        /* renamed from: P */
        public long f3586P;
        @Nullable

        /* renamed from: Q */
        public C2705d f3587Q;

        /* renamed from: R */
        public boolean f3588R;

        /* renamed from: S */
        public boolean f3589S;

        /* renamed from: T */
        public String f3590T;

        /* renamed from: U */
        public C2686q f3591U;

        /* renamed from: V */
        public int f3592V;

        /* renamed from: a */
        public String f3593a;

        /* renamed from: b */
        public String f3594b;

        /* renamed from: c */
        public int f3595c;

        /* renamed from: d */
        public int f3596d;

        /* renamed from: e */
        public int f3597e;

        /* renamed from: f */
        public boolean f3598f;

        /* renamed from: g */
        public byte[] f3599g;

        /* renamed from: h */
        public C2686q.C2687a f3600h;

        /* renamed from: i */
        public byte[] f3601i;

        /* renamed from: j */
        public DrmInitData f3602j;

        /* renamed from: k */
        public int f3603k;

        /* renamed from: l */
        public int f3604l;

        /* renamed from: m */
        public int f3605m;

        /* renamed from: n */
        public int f3606n;

        /* renamed from: o */
        public int f3607o;

        /* renamed from: p */
        public int f3608p;

        /* renamed from: q */
        public float f3609q;

        /* renamed from: r */
        public float f3610r;

        /* renamed from: s */
        public float f3611s;

        /* renamed from: t */
        public byte[] f3612t;

        /* renamed from: u */
        public int f3613u;

        /* renamed from: v */
        public boolean f3614v;

        /* renamed from: w */
        public int f3615w;

        /* renamed from: x */
        public int f3616x;

        /* renamed from: y */
        public int f3617y;

        /* renamed from: z */
        public int f3618z;

        public C2704c() {
            this.f3603k = -1;
            this.f3604l = -1;
            this.f3605m = -1;
            this.f3606n = -1;
            this.f3607o = 0;
            this.f3608p = -1;
            this.f3609q = 0.0f;
            this.f3610r = 0.0f;
            this.f3611s = 0.0f;
            this.f3612t = null;
            this.f3613u = -1;
            this.f3614v = false;
            this.f3615w = -1;
            this.f3616x = -1;
            this.f3617y = -1;
            this.f3618z = 1000;
            this.f3571A = 200;
            this.f3572B = -1.0f;
            this.f3573C = -1.0f;
            this.f3574D = -1.0f;
            this.f3575E = -1.0f;
            this.f3576F = -1.0f;
            this.f3577G = -1.0f;
            this.f3578H = -1.0f;
            this.f3579I = -1.0f;
            this.f3580J = -1.0f;
            this.f3581K = -1.0f;
            this.f3582L = 1;
            this.f3583M = -1;
            this.f3584N = VideoCapture.Defaults.DEFAULT_AUDIO_SAMPLE_RATE;
            this.f3585O = 0;
            this.f3586P = 0;
            this.f3589S = true;
            this.f3590T = "eng";
        }

        /* renamed from: e */
        public static Pair<String, List<byte[]>> m5405e(C3173t tVar) {
            try {
                tVar.mo20007M(16);
                long o = tVar.mo20022o();
                if (o == 1482049860) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (o == 826496599) {
                    byte[] bArr = tVar.f5877a;
                    for (int c = tVar.mo20010c() + 20; c < bArr.length - 4; c++) {
                        if (bArr[c] == 0 && bArr[c + 1] == 0 && bArr[c + 2] == 1 && bArr[c + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, c, bArr.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                C3163m.m7880f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        /* renamed from: f */
        public static boolean m5406f(C3173t tVar) {
            try {
                int q = tVar.mo20024q();
                if (q == 1) {
                    return true;
                }
                if (q != 65534) {
                    return false;
                }
                tVar.mo20006L(24);
                if (tVar.mo20025r() == C2701e.f3518e0.getMostSignificantBits() && tVar.mo20025r() == C2701e.f3518e0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }

        /* renamed from: g */
        public static List<byte[]> m5407g(byte[] bArr) {
            try {
                if (bArr[0] == 2) {
                    int i = 0;
                    int i2 = 1;
                    while (bArr[i2] == -1) {
                        i += 255;
                        i2++;
                    }
                    int i3 = i2 + 1;
                    int i4 = i + bArr[i2];
                    int i5 = 0;
                    while (bArr[i3] == -1) {
                        i5 += 255;
                        i3++;
                    }
                    int i6 = i3 + 1;
                    int i7 = i5 + bArr[i3];
                    if (bArr[i6] == 1) {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArr, i6, bArr2, 0, i4);
                        int i8 = i6 + i4;
                        if (bArr[i8] == 3) {
                            int i9 = i8 + i7;
                            if (bArr[i9] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i9)];
                                System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        throw new ParserException("Error parsing vorbis codec private");
                    }
                    throw new ParserException("Error parsing vorbis codec private");
                }
                throw new ParserException("Error parsing vorbis codec private");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        /* renamed from: b */
        public final byte[] mo18621b() {
            if (this.f3572B == -1.0f || this.f3573C == -1.0f || this.f3574D == -1.0f || this.f3575E == -1.0f || this.f3576F == -1.0f || this.f3577G == -1.0f || this.f3578H == -1.0f || this.f3579I == -1.0f || this.f3580J == -1.0f || this.f3581K == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put((byte) 0);
            wrap.putShort((short) ((int) ((this.f3572B * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f3573C * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f3574D * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f3575E * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f3576F * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f3577G * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f3578H * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) ((this.f3579I * 50000.0f) + 0.5f)));
            wrap.putShort((short) ((int) (this.f3580J + 0.5f)));
            wrap.putShort((short) ((int) (this.f3581K + 0.5f)));
            wrap.putShort((short) this.f3618z);
            wrap.putShort((short) this.f3571A);
            return bArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d2, code lost:
            r26 = r1;
            r4 = "audio/raw";
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x024b, code lost:
            r4 = r16;
            r31 = 4096;
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x02a9, code lost:
            r4 = r16;
            r31 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ad, code lost:
            r26 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f0, code lost:
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x02f1, code lost:
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x030a, code lost:
            r4 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x030c, code lost:
            r1 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x030e, code lost:
            r26 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0310, code lost:
            r31 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0312, code lost:
            r2 = r0.f3589S | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x0317, code lost:
            if (r0.f3588R == false) goto L_0x031b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x0319, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x031b, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x031c, code lost:
            r2 = r2 | r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0321, code lost:
            if (p040c.p200q.p201a.p219b.p261o0.C3166p.m7899k(r4) == false) goto L_0x0349;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0323, code lost:
            r1 = com.google.android.exoplayer2.Format.m10237k(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r31, r0.f3582L, r0.f3584N, r26, r1, r0.f3602j, r2, r0.f3590T);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x034d, code lost:
            if (p040c.p200q.p201a.p219b.p261o0.C3166p.m7901m(r4) == false) goto L_0x0446;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x0351, code lost:
            if (r0.f3607o != 0) goto L_0x0365;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0353, code lost:
            r2 = r0.f3605m;
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x0356, code lost:
            if (r2 != -1) goto L_0x035a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0358, code lost:
            r2 = r0.f3603k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x035a, code lost:
            r0.f3605m = r2;
            r2 = r0.f3606n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x035e, code lost:
            if (r2 != -1) goto L_0x0362;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0360, code lost:
            r2 = r0.f3604l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0362, code lost:
            r0.f3606n = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0365, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0366, code lost:
            r2 = -1.0f;
            r5 = r0.f3605m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x036a, code lost:
            if (r5 == r3) goto L_0x0379;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x036c, code lost:
            r8 = r0.f3606n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x036e, code lost:
            if (r8 == r3) goto L_0x0379;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0370, code lost:
            r2 = ((float) (r0.f3604l * r5)) / ((float) (r0.f3603k * r8));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0379, code lost:
            r37 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x037d, code lost:
            if (r0.f3614v == false) goto L_0x0391;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x037f, code lost:
            r40 = new com.google.android.exoplayer2.video.ColorInfo(r0.f3615w, r0.f3617y, r0.f3616x, mo18621b());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0391, code lost:
            r40 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x039f, code lost:
            if ("htc_video_rotA-000".equals(r0.f3593a) == false) goto L_0x03a3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a1, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ab, code lost:
            if ("htc_video_rotA-090".equals(r0.f3593a) == false) goto L_0x03af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x03ad, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03b7, code lost:
            if ("htc_video_rotA-180".equals(r0.f3593a) == false) goto L_0x03bb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03b9, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c3, code lost:
            if ("htc_video_rotA-270".equals(r0.f3593a) == false) goto L_0x03c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c5, code lost:
            r9 = com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment.ANGLE_UP;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c8, code lost:
            r9 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03cb, code lost:
            if (r0.f3608p != 0) goto L_0x041b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d4, code lost:
            if (java.lang.Float.compare(r0.f3609q, 0.0f) != 0) goto L_0x041b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03dc, code lost:
            if (java.lang.Float.compare(r0.f3610r, 0.0f) != 0) goto L_0x041b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:189:0x03e4, code lost:
            if (java.lang.Float.compare(r0.f3611s, 0.0f) != 0) goto L_0x03e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x03e6, code lost:
            r36 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x03f1, code lost:
            if (java.lang.Float.compare(r0.f3610r, 90.0f) != 0) goto L_0x03f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03f3, code lost:
            r36 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x03fe, code lost:
            if (java.lang.Float.compare(r0.f3610r, -180.0f) == 0) goto L_0x0418;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x0408, code lost:
            if (java.lang.Float.compare(r0.f3610r, 180.0f) != 0) goto L_0x040b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:199:0x0413, code lost:
            if (java.lang.Float.compare(r0.f3610r, -90.0f) != 0) goto L_0x041b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0415, code lost:
            r7 = com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment.ANGLE_UP;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:201:0x0418, code lost:
            r36 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x041b, code lost:
            r36 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x041d, code lost:
            r1 = com.google.android.exoplayer2.Format.m10251y(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r31, r0.f3603k, r0.f3604l, -1.0f, r1, r36, r37, r0.f3612t, r0.f3613u, r40, r0.f3602j);
            r5 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x044a, code lost:
            if ("application/x-subrip".equals(r4) == false) goto L_0x045b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x044c, code lost:
            r1 = com.google.android.exoplayer2.Format.m10246t(java.lang.Integer.toString(r44), r4, r2, r0.f3590T, r0.f3602j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0458, code lost:
            r5 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x045f, code lost:
            if ("text/x-ssa".equals(r4) == false) goto L_0x0494;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0461, code lost:
            r1 = new java.util.ArrayList(2);
            r1.add(p040c.p200q.p201a.p219b.p224f0.p227t.C2701e.m5369a());
            r1.add(r0.f3601i);
            r1 = com.google.android.exoplayer2.Format.m10247u(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r2, r0.f3590T, -1, r0.f3602j, Long.MAX_VALUE, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x0498, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x04af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x049e, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x04af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x04a4, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x04a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x04ae, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x04af, code lost:
            r1 = com.google.android.exoplayer2.Format.m10240n(java.lang.Integer.toString(r44), r4, (java.lang.String) null, -1, r2, r1, r0.f3590T, r0.f3602j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04ca, code lost:
            r2 = r43.mo18552a(r0.f3595c, r5);
            r0.f3591U = r2;
            r2.mo18546d(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x04d7, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo18622c(p040c.p200q.p201a.p219b.p224f0.C2676i r43, int r44) {
            /*
                r42 = this;
                r0 = r42
                java.lang.String r1 = r0.f3594b
                int r2 = r1.hashCode()
                r3 = 4
                r5 = 1
                r6 = 2
                r7 = 0
                r8 = 3
                switch(r2) {
                    case -2095576542: goto L_0x0153;
                    case -2095575984: goto L_0x0149;
                    case -1985379776: goto L_0x013e;
                    case -1784763192: goto L_0x0133;
                    case -1730367663: goto L_0x0128;
                    case -1482641358: goto L_0x011d;
                    case -1482641357: goto L_0x0112;
                    case -1373388978: goto L_0x0107;
                    case -933872740: goto L_0x00fc;
                    case -538363189: goto L_0x00f1;
                    case -538363109: goto L_0x00e6;
                    case -425012669: goto L_0x00da;
                    case -356037306: goto L_0x00ce;
                    case 62923557: goto L_0x00c2;
                    case 62923603: goto L_0x00b6;
                    case 62927045: goto L_0x00aa;
                    case 82338133: goto L_0x009f;
                    case 82338134: goto L_0x0094;
                    case 99146302: goto L_0x0088;
                    case 444813526: goto L_0x007c;
                    case 542569478: goto L_0x0070;
                    case 725957860: goto L_0x0064;
                    case 738597099: goto L_0x0058;
                    case 855502857: goto L_0x004d;
                    case 1422270023: goto L_0x0041;
                    case 1809237540: goto L_0x0036;
                    case 1950749482: goto L_0x002a;
                    case 1950789798: goto L_0x001e;
                    case 1951062397: goto L_0x0012;
                    default: goto L_0x0010;
                }
            L_0x0010:
                goto L_0x015d
            L_0x0012:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 11
                goto L_0x015e
            L_0x001e:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 21
                goto L_0x015e
            L_0x002a:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 16
                goto L_0x015e
            L_0x0036:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = r6
                goto L_0x015e
            L_0x0041:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 24
                goto L_0x015e
            L_0x004d:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 7
                goto L_0x015e
            L_0x0058:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 25
                goto L_0x015e
            L_0x0064:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 23
                goto L_0x015e
            L_0x0070:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 19
                goto L_0x015e
            L_0x007c:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 9
                goto L_0x015e
            L_0x0088:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 27
                goto L_0x015e
            L_0x0094:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = r5
                goto L_0x015e
            L_0x009f:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = r7
                goto L_0x015e
            L_0x00aa:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 18
                goto L_0x015e
            L_0x00b6:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 15
                goto L_0x015e
            L_0x00c2:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 12
                goto L_0x015e
            L_0x00ce:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 20
                goto L_0x015e
            L_0x00da:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 26
                goto L_0x015e
            L_0x00e6:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 6
                goto L_0x015e
            L_0x00f1:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = r3
                goto L_0x015e
            L_0x00fc:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 28
                goto L_0x015e
            L_0x0107:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 8
                goto L_0x015e
            L_0x0112:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 14
                goto L_0x015e
            L_0x011d:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 13
                goto L_0x015e
            L_0x0128:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 10
                goto L_0x015e
            L_0x0133:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 17
                goto L_0x015e
            L_0x013e:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 22
                goto L_0x015e
            L_0x0149:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = r8
                goto L_0x015e
            L_0x0153:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x015d
                r1 = 5
                goto L_0x015e
            L_0x015d:
                r1 = -1
            L_0x015e:
                java.lang.String r2 = ". Setting mimeType to "
                java.lang.String r10 = "Unsupported PCM bit depth: "
                java.lang.String r11 = "application/dvbsubs"
                java.lang.String r12 = "application/pgs"
                java.lang.String r13 = "application/vobsub"
                java.lang.String r14 = "text/x-ssa"
                java.lang.String r15 = "application/x-subrip"
                java.lang.String r16 = "audio/raw"
                r17 = 4096(0x1000, float:5.74E-42)
                java.lang.String r9 = "MatroskaExtractor"
                java.lang.String r4 = "audio/x-unknown"
                r18 = 0
                switch(r1) {
                    case 0: goto L_0x0308;
                    case 1: goto L_0x0305;
                    case 2: goto L_0x0302;
                    case 3: goto L_0x02f4;
                    case 4: goto L_0x02f4;
                    case 5: goto L_0x02f4;
                    case 6: goto L_0x02dd;
                    case 7: goto L_0x02c9;
                    case 8: goto L_0x02b3;
                    case 9: goto L_0x02b0;
                    case 10: goto L_0x029f;
                    case 11: goto L_0x025c;
                    case 12: goto L_0x0252;
                    case 13: goto L_0x0249;
                    case 14: goto L_0x0246;
                    case 15: goto L_0x0242;
                    case 16: goto L_0x023e;
                    case 17: goto L_0x0233;
                    case 18: goto L_0x022f;
                    case 19: goto L_0x022f;
                    case 20: goto L_0x022b;
                    case 21: goto L_0x0221;
                    case 22: goto L_0x01da;
                    case 23: goto L_0x01ae;
                    case 24: goto L_0x01ab;
                    case 25: goto L_0x01a8;
                    case 26: goto L_0x019f;
                    case 27: goto L_0x019c;
                    case 28: goto L_0x0181;
                    default: goto L_0x0179;
                }
            L_0x0179:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x0181:
                byte[] r1 = new byte[r3]
                byte[] r2 = r0.f3601i
                byte r3 = r2[r7]
                r1[r7] = r3
                byte r3 = r2[r5]
                r1[r5] = r3
                byte r3 = r2[r6]
                r1[r6] = r3
                byte r2 = r2[r8]
                r1[r8] = r2
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r4 = r11
                goto L_0x030e
            L_0x019c:
                r4 = r12
                goto L_0x030c
            L_0x019f:
                byte[] r1 = r0.f3601i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                r4 = r13
                goto L_0x030e
            L_0x01a8:
                r4 = r14
                goto L_0x030c
            L_0x01ab:
                r4 = r15
                goto L_0x030c
            L_0x01ae:
                int r1 = r0.f3583M
                int r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7769I(r1)
                if (r1 != 0) goto L_0x01d2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                int r3 = r0.f3583M
                r1.append(r3)
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r9, r1)
                goto L_0x030c
            L_0x01d2:
                r26 = r1
                r4 = r16
                r1 = r18
                goto L_0x0310
            L_0x01da:
                c.q.a.b.o0.t r1 = new c.q.a.b.o0.t
                byte[] r3 = r0.f3601i
                r1.<init>((byte[]) r3)
                boolean r1 = m5406f(r1)
                if (r1 == 0) goto L_0x020b
                int r1 = r0.f3583M
                int r1 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7769I(r1)
                if (r1 != 0) goto L_0x01d2
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                int r3 = r0.f3583M
                r1.append(r3)
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r9, r1)
                goto L_0x030c
            L_0x020b:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r9, r1)
                goto L_0x030c
            L_0x0221:
                byte[] r1 = r0.f3601i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x02f1
            L_0x022b:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x030a
            L_0x022f:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x030a
            L_0x0233:
                c.q.a.b.f0.t.e$d r1 = new c.q.a.b.f0.t.e$d
                r1.<init>()
                r0.f3587Q = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x030a
            L_0x023e:
                java.lang.String r16 = "audio/eac3"
                goto L_0x030a
            L_0x0242:
                java.lang.String r16 = "audio/ac3"
                goto L_0x030a
            L_0x0246:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x024b
            L_0x0249:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x024b:
                r4 = r16
                r31 = r17
                r1 = r18
                goto L_0x02ad
            L_0x0252:
                byte[] r1 = r0.f3601i
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x02f1
            L_0x025c:
                r17 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                byte[] r2 = r0.f3601i
                r1.add(r2)
                r2 = 8
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r9 = r0.f3585O
                java.nio.ByteBuffer r3 = r3.putLong(r9)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
                java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r2 = r2.order(r3)
                long r3 = r0.f3586P
                java.nio.ByteBuffer r2 = r2.putLong(r3)
                byte[] r2 = r2.array()
                r1.add(r2)
                java.lang.String r16 = "audio/opus"
                goto L_0x02a9
            L_0x029f:
                r17 = 8192(0x2000, float:1.14794E-41)
                byte[] r1 = r0.f3601i
                java.util.List r1 = m5407g(r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x02a9:
                r4 = r16
                r31 = r17
            L_0x02ad:
                r26 = -1
                goto L_0x0312
            L_0x02b0:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x030a
            L_0x02b3:
                c.q.a.b.o0.t r1 = new c.q.a.b.o0.t
                byte[] r2 = r0.f3601i
                r1.<init>((byte[]) r2)
                android.util.Pair r1 = m5405e(r1)
                java.lang.Object r2 = r1.first
                r16 = r2
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
                goto L_0x02f1
            L_0x02c9:
                c.q.a.b.o0.t r1 = new c.q.a.b.o0.t
                byte[] r2 = r0.f3601i
                r1.<init>((byte[]) r2)
                c.q.a.b.p0.i r1 = p040c.p200q.p201a.p219b.p262p0.C3191i.m8038a(r1)
                java.util.List<byte[]> r2 = r1.f5939a
                int r1 = r1.f5940b
                r0.f3592V = r1
                java.lang.String r16 = "video/hevc"
                goto L_0x02f0
            L_0x02dd:
                c.q.a.b.o0.t r1 = new c.q.a.b.o0.t
                byte[] r2 = r0.f3601i
                r1.<init>((byte[]) r2)
                c.q.a.b.p0.h r1 = p040c.p200q.p201a.p219b.p262p0.C3190h.m8037b(r1)
                java.util.List<byte[]> r2 = r1.f5934a
                int r1 = r1.f5935b
                r0.f3592V = r1
                java.lang.String r16 = "video/avc"
            L_0x02f0:
                r1 = r2
            L_0x02f1:
                r4 = r16
                goto L_0x030e
            L_0x02f4:
                byte[] r1 = r0.f3601i
                if (r1 != 0) goto L_0x02fb
                r1 = r18
                goto L_0x02ff
            L_0x02fb:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x02ff:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x02f1
            L_0x0302:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x030a
            L_0x0305:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x030a
            L_0x0308:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x030a:
                r4 = r16
            L_0x030c:
                r1 = r18
            L_0x030e:
                r26 = -1
            L_0x0310:
                r31 = -1
            L_0x0312:
                boolean r2 = r0.f3589S
                r2 = r2 | r7
                boolean r3 = r0.f3588R
                if (r3 == 0) goto L_0x031b
                r3 = r6
                goto L_0x031c
            L_0x031b:
                r3 = r7
            L_0x031c:
                r2 = r2 | r3
                boolean r3 = p040c.p200q.p201a.p219b.p261o0.C3166p.m7899k(r4)
                if (r3 == 0) goto L_0x0349
                java.lang.String r19 = java.lang.Integer.toString(r44)
                r21 = 0
                r22 = -1
                int r3 = r0.f3582L
                int r6 = r0.f3584N
                com.google.android.exoplayer2.drm.DrmInitData r7 = r0.f3602j
                java.lang.String r8 = r0.f3590T
                r20 = r4
                r23 = r31
                r24 = r3
                r25 = r6
                r27 = r1
                r28 = r7
                r29 = r2
                r30 = r8
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m10237k(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                goto L_0x04ca
            L_0x0349:
                boolean r3 = p040c.p200q.p201a.p219b.p261o0.C3166p.m7901m(r4)
                if (r3 == 0) goto L_0x0446
                int r2 = r0.f3607o
                if (r2 != 0) goto L_0x0365
                int r2 = r0.f3605m
                r3 = -1
                if (r2 != r3) goto L_0x035a
                int r2 = r0.f3603k
            L_0x035a:
                r0.f3605m = r2
                int r2 = r0.f3606n
                if (r2 != r3) goto L_0x0362
                int r2 = r0.f3604l
            L_0x0362:
                r0.f3606n = r2
                goto L_0x0366
            L_0x0365:
                r3 = -1
            L_0x0366:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = r0.f3605m
                if (r5 == r3) goto L_0x0379
                int r8 = r0.f3606n
                if (r8 == r3) goto L_0x0379
                int r2 = r0.f3604l
                int r2 = r2 * r5
                float r2 = (float) r2
                int r5 = r0.f3603k
                int r5 = r5 * r8
                float r5 = (float) r5
                float r2 = r2 / r5
            L_0x0379:
                r37 = r2
                boolean r2 = r0.f3614v
                if (r2 == 0) goto L_0x0391
                byte[] r2 = r42.mo18621b()
                com.google.android.exoplayer2.video.ColorInfo r5 = new com.google.android.exoplayer2.video.ColorInfo
                int r8 = r0.f3615w
                int r9 = r0.f3617y
                int r10 = r0.f3616x
                r5.<init>(r8, r9, r10, r2)
                r40 = r5
                goto L_0x0393
            L_0x0391:
                r40 = r18
            L_0x0393:
                java.lang.String r2 = r0.f3593a
                java.lang.String r5 = "htc_video_rotA-000"
                boolean r2 = r5.equals(r2)
                r5 = 180(0xb4, float:2.52E-43)
                r8 = 90
                if (r2 == 0) goto L_0x03a3
                r9 = r7
                goto L_0x03c9
            L_0x03a3:
                java.lang.String r2 = r0.f3593a
                java.lang.String r9 = "htc_video_rotA-090"
                boolean r2 = r9.equals(r2)
                if (r2 == 0) goto L_0x03af
                r9 = r8
                goto L_0x03c9
            L_0x03af:
                java.lang.String r2 = r0.f3593a
                java.lang.String r9 = "htc_video_rotA-180"
                boolean r2 = r9.equals(r2)
                if (r2 == 0) goto L_0x03bb
                r9 = r5
                goto L_0x03c9
            L_0x03bb:
                java.lang.String r2 = r0.f3593a
                java.lang.String r9 = "htc_video_rotA-270"
                boolean r2 = r9.equals(r2)
                if (r2 == 0) goto L_0x03c8
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x03c9
            L_0x03c8:
                r9 = r3
            L_0x03c9:
                int r2 = r0.f3608p
                if (r2 != 0) goto L_0x041b
                float r2 = r0.f3609q
                r3 = 0
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x041b
                float r2 = r0.f3610r
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x041b
                float r2 = r0.f3611s
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x03e9
            L_0x03e6:
                r36 = r7
                goto L_0x041d
            L_0x03e9:
                float r2 = r0.f3610r
                r3 = 1119092736(0x42b40000, float:90.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x03f6
                r36 = r8
                goto L_0x041d
            L_0x03f6:
                float r2 = r0.f3610r
                r3 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 == 0) goto L_0x0418
                float r2 = r0.f3610r
                r3 = 1127481344(0x43340000, float:180.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x040b
                goto L_0x0418
            L_0x040b:
                float r2 = r0.f3610r
                r3 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r2 = java.lang.Float.compare(r2, r3)
                if (r2 != 0) goto L_0x041b
                r7 = 270(0x10e, float:3.78E-43)
                goto L_0x03e6
            L_0x0418:
                r36 = r5
                goto L_0x041d
            L_0x041b:
                r36 = r9
            L_0x041d:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                int r2 = r0.f3603k
                int r3 = r0.f3604l
                r34 = -1082130432(0xffffffffbf800000, float:-1.0)
                byte[] r5 = r0.f3612t
                int r7 = r0.f3613u
                com.google.android.exoplayer2.drm.DrmInitData r8 = r0.f3602j
                r28 = r4
                r32 = r2
                r33 = r3
                r35 = r1
                r38 = r5
                r39 = r7
                r41 = r8
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m10251y(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
                r5 = r6
                goto L_0x04ca
            L_0x0446:
                boolean r3 = r15.equals(r4)
                if (r3 == 0) goto L_0x045b
                java.lang.String r1 = java.lang.Integer.toString(r44)
                java.lang.String r3 = r0.f3590T
                com.google.android.exoplayer2.drm.DrmInitData r5 = r0.f3602j
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m10246t(r1, r4, r2, r3, r5)
            L_0x0458:
                r5 = r8
                goto L_0x04ca
            L_0x045b:
                boolean r3 = r14.equals(r4)
                if (r3 == 0) goto L_0x0494
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r6)
                byte[] r3 = p040c.p200q.p201a.p219b.p224f0.p227t.C2701e.f3515b0
                r1.add(r3)
                byte[] r3 = r0.f3601i
                r1.add(r3)
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.f3590T
                r33 = -1
                com.google.android.exoplayer2.drm.DrmInitData r5 = r0.f3602j
                r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r28 = r4
                r31 = r2
                r32 = r3
                r34 = r5
                r37 = r1
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m10247u(r27, r28, r29, r30, r31, r32, r33, r34, r35, r37)
                goto L_0x0458
            L_0x0494:
                boolean r3 = r13.equals(r4)
                if (r3 != 0) goto L_0x04af
                boolean r3 = r12.equals(r4)
                if (r3 != 0) goto L_0x04af
                boolean r3 = r11.equals(r4)
                if (r3 == 0) goto L_0x04a7
                goto L_0x04af
            L_0x04a7:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>((java.lang.String) r2)
                throw r1
            L_0x04af:
                java.lang.String r27 = java.lang.Integer.toString(r44)
                r29 = 0
                r30 = -1
                java.lang.String r3 = r0.f3590T
                com.google.android.exoplayer2.drm.DrmInitData r5 = r0.f3602j
                r28 = r4
                r31 = r2
                r32 = r1
                r33 = r3
                r34 = r5
                com.google.android.exoplayer2.Format r1 = com.google.android.exoplayer2.Format.m10240n(r27, r28, r29, r30, r31, r32, r33, r34)
                goto L_0x0458
            L_0x04ca:
                int r2 = r0.f3595c
                r3 = r43
                c.q.a.b.f0.q r2 = r3.mo18552a(r2, r5)
                r0.f3591U = r2
                r2.mo18546d(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p227t.C2701e.C2704c.mo18622c(c.q.a.b.f0.i, int):void");
        }

        /* renamed from: d */
        public void mo18623d() {
            C2705d dVar = this.f3587Q;
            if (dVar != null) {
                dVar.mo18625a(this);
            }
        }

        /* renamed from: h */
        public void mo18624h() {
            C2705d dVar = this.f3587Q;
            if (dVar != null) {
                dVar.mo18626b();
            }
        }
    }

    /* renamed from: c.q.a.b.f0.t.e$d */
    /* compiled from: MatroskaExtractor */
    public static final class C2705d {

        /* renamed from: a */
        public final byte[] f3619a = new byte[10];

        /* renamed from: b */
        public boolean f3620b;

        /* renamed from: c */
        public int f3621c;

        /* renamed from: d */
        public int f3622d;

        /* renamed from: e */
        public long f3623e;

        /* renamed from: f */
        public int f3624f;

        /* renamed from: a */
        public void mo18625a(C2704c cVar) {
            if (this.f3620b && this.f3621c > 0) {
                cVar.f3591U.mo18545c(this.f3623e, this.f3624f, this.f3622d, 0, cVar.f3600h);
                this.f3621c = 0;
            }
        }

        /* renamed from: b */
        public void mo18626b() {
            this.f3620b = false;
        }

        /* renamed from: c */
        public void mo18627c(C2704c cVar, long j) {
            if (this.f3620b) {
                int i = this.f3621c;
                this.f3621c = i + 1;
                if (i == 0) {
                    this.f3623e = j;
                }
                if (this.f3621c >= 16) {
                    cVar.f3591U.mo18545c(this.f3623e, this.f3624f, this.f3622d, 0, cVar.f3600h);
                    this.f3621c = 0;
                }
            }
        }

        /* renamed from: d */
        public void mo18628d(C2675h hVar, int i, int i2) {
            if (!this.f3620b) {
                hVar.mo18531i(this.f3619a, 0, 10);
                hVar.mo18527f();
                if (C2596g.m4823j(this.f3619a) != 0) {
                    this.f3620b = true;
                    this.f3621c = 0;
                } else {
                    return;
                }
            }
            if (this.f3621c == 0) {
                this.f3624f = i;
                this.f3622d = 0;
            }
            this.f3622d += i2;
        }
    }

    static {
        C2695a aVar = C2695a.f3503a;
    }

    public C2701e() {
        this(0);
    }

    /* renamed from: l */
    public static int[] m5371l(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    /* renamed from: o */
    public static boolean m5372o(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    /* renamed from: p */
    public static /* synthetic */ C2674g[] m5373p() {
        return new C2674g[]{new C2701e()};
    }

    /* renamed from: w */
    public static void m5374w(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] bArr3;
        if (j == -9223372036854775807L) {
            bArr3 = bArr2;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - (((long) (i2 * TimeUtils.SECONDS_PER_HOUR)) * EventLoop_commonKt.MS_TO_NS);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - (((long) (i3 * 60)) * EventLoop_commonKt.MS_TO_NS);
            int i4 = (int) (j4 / EventLoop_commonKt.MS_TO_NS);
            bArr3 = C3152e0.m7773M(String.format(Locale.US, str, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j4 - (((long) i4) * EventLoop_commonKt.MS_TO_NS)) / j2))}));
        }
        System.arraycopy(bArr3, 0, bArr, i, bArr2.length);
    }

    /* renamed from: A */
    public final void mo18604A(C2675h hVar, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.f3554k.mo20009b() < length) {
            this.f3554k.f5877a = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.f3554k.f5877a, 0, bArr.length);
        }
        hVar.readFully(this.f3554k.f5877a, bArr.length, i);
        this.f3554k.mo20002H(length);
    }

    /* renamed from: b */
    public boolean mo18547b(C2675h hVar) {
        return new C2706f().mo18630b(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01f5, code lost:
        throw new com.google.android.exoplayer2.ParserException("EBML lacing sample size out of range.");
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x024b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18605d(int r22, int r23, p040c.p200q.p201a.p219b.p224f0.C2675h r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = 161(0xa1, float:2.26E-43)
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            if (r1 == r4) goto L_0x008e
            if (r1 == r5) goto L_0x008e
            r4 = 16981(0x4255, float:2.3795E-41)
            if (r1 == r4) goto L_0x0083
            r4 = 18402(0x47e2, float:2.5787E-41)
            if (r1 == r4) goto L_0x0073
            r4 = 21419(0x53ab, float:3.0014E-41)
            if (r1 == r4) goto L_0x0053
            r4 = 25506(0x63a2, float:3.5742E-41)
            if (r1 == r4) goto L_0x0048
            r4 = 30322(0x7672, float:4.249E-41)
            if (r1 != r4) goto L_0x0031
            c.q.a.b.f0.t.e$c r1 = r0.f3563t
            byte[] r4 = new byte[r2]
            r1.f3612t = r4
            r3.readFully(r4, r6, r2)
            goto L_0x02a8
        L_0x0031:
            com.google.android.exoplayer2.ParserException r2 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>((java.lang.String) r1)
            throw r2
        L_0x0048:
            c.q.a.b.f0.t.e$c r1 = r0.f3563t
            byte[] r4 = new byte[r2]
            r1.f3601i = r4
            r3.readFully(r4, r6, r2)
            goto L_0x02a8
        L_0x0053:
            c.q.a.b.o0.t r1 = r0.f3552i
            byte[] r1 = r1.f5877a
            java.util.Arrays.fill(r1, r6)
            c.q.a.b.o0.t r1 = r0.f3552i
            byte[] r1 = r1.f5877a
            int r4 = 4 - r2
            r3.readFully(r1, r4, r2)
            c.q.a.b.o0.t r1 = r0.f3552i
            r1.mo20006L(r6)
            c.q.a.b.o0.t r1 = r0.f3552i
            long r1 = r1.mo19995A()
            int r1 = (int) r1
            r0.f3565v = r1
            goto L_0x02a8
        L_0x0073:
            byte[] r1 = new byte[r2]
            r3.readFully(r1, r6, r2)
            c.q.a.b.f0.t.e$c r2 = r0.f3563t
            c.q.a.b.f0.q$a r3 = new c.q.a.b.f0.q$a
            r3.<init>(r7, r1, r6, r6)
            r2.f3600h = r3
            goto L_0x02a8
        L_0x0083:
            c.q.a.b.f0.t.e$c r1 = r0.f3563t
            byte[] r4 = new byte[r2]
            r1.f3599g = r4
            r3.readFully(r4, r6, r2)
            goto L_0x02a8
        L_0x008e:
            int r4 = r0.f3523E
            r8 = 8
            if (r4 != 0) goto L_0x00b3
            c.q.a.b.f0.t.g r4 = r0.f3545b
            long r9 = r4.mo18632d(r3, r6, r7, r8)
            int r4 = (int) r9
            r0.f3529K = r4
            c.q.a.b.f0.t.g r4 = r0.f3545b
            int r4 = r4.mo18631b()
            r0.f3530L = r4
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f3525G = r9
            r0.f3523E = r7
            c.q.a.b.o0.t r4 = r0.f3550g
            r4.mo20001G()
        L_0x00b3:
            android.util.SparseArray<c.q.a.b.f0.t.e$c> r4 = r0.f3546c
            int r9 = r0.f3529K
            java.lang.Object r4 = r4.get(r9)
            c.q.a.b.f0.t.e$c r4 = (p040c.p200q.p201a.p219b.p224f0.p227t.C2701e.C2704c) r4
            if (r4 != 0) goto L_0x00c9
            int r1 = r0.f3530L
            int r1 = r2 - r1
            r3.mo18528g(r1)
            r0.f3523E = r6
            return
        L_0x00c9:
            int r9 = r0.f3523E
            if (r9 != r7) goto L_0x0277
            r9 = 3
            r0.mo18613r(r3, r9)
            c.q.a.b.o0.t r10 = r0.f3550g
            byte[] r10 = r10.f5877a
            r11 = 2
            byte r10 = r10[r11]
            r10 = r10 & 6
            int r10 = r10 >> r7
            r12 = 255(0xff, float:3.57E-43)
            if (r10 != 0) goto L_0x00f2
            r0.f3527I = r7
            int[] r10 = r0.f3528J
            int[] r10 = m5371l(r10, r7)
            r0.f3528J = r10
            int r13 = r0.f3530L
            int r2 = r2 - r13
            int r2 = r2 - r9
            r10[r6] = r2
        L_0x00ef:
            r6 = r7
            goto L_0x0209
        L_0x00f2:
            if (r1 != r5) goto L_0x026f
            r13 = 4
            r0.mo18613r(r3, r13)
            c.q.a.b.o0.t r14 = r0.f3550g
            byte[] r14 = r14.f5877a
            byte r14 = r14[r9]
            r14 = r14 & r12
            int r14 = r14 + r7
            r0.f3527I = r14
            int[] r15 = r0.f3528J
            int[] r14 = m5371l(r15, r14)
            r0.f3528J = r14
            if (r10 != r11) goto L_0x0117
            int r9 = r0.f3530L
            int r2 = r2 - r9
            int r2 = r2 - r13
            int r9 = r0.f3527I
            int r2 = r2 / r9
            java.util.Arrays.fill(r14, r6, r9, r2)
            goto L_0x00ef
        L_0x0117:
            if (r10 != r7) goto L_0x014d
            r9 = r6
            r10 = r9
        L_0x011b:
            int r14 = r0.f3527I
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x0142
            int[] r14 = r0.f3528J
            r14[r9] = r6
        L_0x0125:
            int r13 = r13 + r7
            r0.mo18613r(r3, r13)
            c.q.a.b.o0.t r14 = r0.f3550g
            byte[] r14 = r14.f5877a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            r14 = r14 & r12
            int[] r15 = r0.f3528J
            r16 = r15[r9]
            int r16 = r16 + r14
            r15[r9] = r16
            if (r14 == r12) goto L_0x0125
            r14 = r15[r9]
            int r10 = r10 + r14
            int r9 = r9 + 1
            goto L_0x011b
        L_0x0142:
            int[] r9 = r0.f3528J
            int r14 = r14 - r7
            int r15 = r0.f3530L
            int r2 = r2 - r15
            int r2 = r2 - r13
            int r2 = r2 - r10
            r9[r14] = r2
            goto L_0x00ef
        L_0x014d:
            if (r10 != r9) goto L_0x0258
            r9 = r6
            r10 = r9
        L_0x0151:
            int r14 = r0.f3527I
            int r15 = r14 + -1
            if (r9 >= r15) goto L_0x01fe
            int[] r14 = r0.f3528J
            r14[r9] = r6
            int r13 = r13 + 1
            r0.mo18613r(r3, r13)
            c.q.a.b.o0.t r14 = r0.f3550g
            byte[] r14 = r14.f5877a
            int r15 = r13 + -1
            byte r14 = r14[r15]
            if (r14 == 0) goto L_0x01f6
            r16 = 0
            r14 = r6
        L_0x016d:
            if (r14 >= r8) goto L_0x01c1
            int r18 = 7 - r14
            int r5 = r7 << r18
            c.q.a.b.o0.t r11 = r0.f3550g
            byte[] r11 = r11.f5877a
            byte r11 = r11[r15]
            r11 = r11 & r5
            if (r11 == 0) goto L_0x01b7
            int r13 = r13 + r14
            r0.mo18613r(r3, r13)
            c.q.a.b.o0.t r11 = r0.f3550g
            byte[] r11 = r11.f5877a
            int r16 = r15 + 1
            byte r11 = r11[r15]
            r11 = r11 & r12
            int r5 = ~r5
            r5 = r5 & r11
            long r6 = (long) r5
            r5 = r16
            r16 = r6
        L_0x0190:
            if (r5 >= r13) goto L_0x01a9
            long r6 = r16 << r8
            c.q.a.b.o0.t r15 = r0.f3550g
            byte[] r15 = r15.f5877a
            int r16 = r5 + 1
            byte r5 = r15[r5]
            r5 = r5 & r12
            long r11 = (long) r5
            long r5 = r6 | r11
            r12 = 255(0xff, float:3.57E-43)
            r19 = r5
            r5 = r16
            r16 = r19
            goto L_0x0190
        L_0x01a9:
            if (r9 <= 0) goto L_0x01c1
            int r14 = r14 * 7
            int r14 = r14 + 6
            r5 = 1
            long r11 = r5 << r14
            long r11 = r11 - r5
            long r16 = r16 - r11
            goto L_0x01c1
        L_0x01b7:
            int r14 = r14 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x016d
        L_0x01c1:
            r5 = r16
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 < 0) goto L_0x01ee
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r7 > 0) goto L_0x01ee
            int r5 = (int) r5
            int[] r6 = r0.f3528J
            if (r9 != 0) goto L_0x01d7
            goto L_0x01dc
        L_0x01d7:
            int r7 = r9 + -1
            r7 = r6[r7]
            int r5 = r5 + r7
        L_0x01dc:
            r6[r9] = r5
            int[] r5 = r0.f3528J
            r5 = r5[r9]
            int r10 = r10 + r5
            int r9 = r9 + 1
            r5 = 163(0xa3, float:2.28E-43)
            r6 = 0
            r7 = 1
            r11 = 2
            r12 = 255(0xff, float:3.57E-43)
            goto L_0x0151
        L_0x01ee:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "EBML lacing sample size out of range."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01f6:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "No valid varint length mask found"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01fe:
            int[] r5 = r0.f3528J
            r6 = 1
            int r14 = r14 - r6
            int r7 = r0.f3530L
            int r2 = r2 - r7
            int r2 = r2 - r13
            int r2 = r2 - r10
            r5[r14] = r2
        L_0x0209:
            c.q.a.b.o0.t r2 = r0.f3550g
            byte[] r2 = r2.f5877a
            r5 = 0
            byte r7 = r2[r5]
            int r5 = r7 << 8
            byte r2 = r2[r6]
            r6 = 255(0xff, float:3.57E-43)
            r2 = r2 & r6
            r2 = r2 | r5
            long r5 = r0.f3519A
            long r9 = (long) r2
            long r9 = r0.mo18617v(r9)
            long r5 = r5 + r9
            r0.f3524F = r5
            c.q.a.b.o0.t r2 = r0.f3550g
            byte[] r2 = r2.f5877a
            r5 = 2
            byte r2 = r2[r5]
            r2 = r2 & r8
            if (r2 != r8) goto L_0x022e
            r2 = 1
            goto L_0x022f
        L_0x022e:
            r2 = 0
        L_0x022f:
            int r6 = r4.f3596d
            if (r6 == r5) goto L_0x0245
            r6 = 163(0xa3, float:2.28E-43)
            if (r1 != r6) goto L_0x0243
            c.q.a.b.o0.t r6 = r0.f3550g
            byte[] r6 = r6.f5877a
            byte r6 = r6[r5]
            r5 = 128(0x80, float:1.794E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x0243
            goto L_0x0245
        L_0x0243:
            r5 = 0
            goto L_0x0246
        L_0x0245:
            r5 = 1
        L_0x0246:
            if (r2 == 0) goto L_0x024b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x024c
        L_0x024b:
            r2 = 0
        L_0x024c:
            r2 = r2 | r5
            r0.f3531M = r2
            r2 = 2
            r0.f3523E = r2
            r2 = 0
            r0.f3526H = r2
            r2 = 163(0xa3, float:2.28E-43)
            goto L_0x0278
        L_0x0258:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected lacing value: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x026f:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Lacing only supported in SimpleBlocks."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0277:
            r2 = r5
        L_0x0278:
            if (r1 != r2) goto L_0x02a0
        L_0x027a:
            int r1 = r0.f3526H
            int r2 = r0.f3527I
            if (r1 >= r2) goto L_0x029c
            int[] r2 = r0.f3528J
            r1 = r2[r1]
            r0.mo18620z(r3, r4, r1)
            long r1 = r0.f3524F
            int r5 = r0.f3526H
            int r6 = r4.f3597e
            int r5 = r5 * r6
            int r5 = r5 / 1000
            long r5 = (long) r5
            long r1 = r1 + r5
            r0.mo18607i(r4, r1)
            int r1 = r0.f3526H
            r2 = 1
            int r1 = r1 + r2
            r0.f3526H = r1
            goto L_0x027a
        L_0x029c:
            r1 = 0
            r0.f3523E = r1
            goto L_0x02a8
        L_0x02a0:
            r1 = 0
            int[] r2 = r0.f3528J
            r1 = r2[r1]
            r0.mo18620z(r3, r4, r1)
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p227t.C2701e.mo18605d(int, int, c.q.a.b.f0.h):void");
    }

    /* renamed from: e */
    public int mo18548e(C2675h hVar, C2681n nVar) {
        this.f3541W = false;
        boolean z = true;
        while (z && !this.f3541W) {
            z = this.f3544a.mo18590b(hVar);
            if (z && mo18612q(nVar, hVar.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f3546c.size(); i++) {
            this.f3546c.valueAt(i).mo18623d();
        }
        return -1;
    }

    /* renamed from: f */
    public void mo18549f(C2676i iVar) {
        this.f3543Y = iVar;
    }

    /* renamed from: g */
    public void mo18550g(long j, long j2) {
        this.f3519A = -9223372036854775807L;
        this.f3523E = 0;
        this.f3544a.mo18589a();
        this.f3545b.mo18633e();
        mo18616u();
        for (int i = 0; i < this.f3546c.size(); i++) {
            this.f3546c.valueAt(i).mo18624h();
        }
    }

    /* renamed from: h */
    public final C2682o mo18606h() {
        C3164n nVar;
        C3164n nVar2;
        if (this.f3559p == -1 || this.f3562s == -9223372036854775807L || (nVar = this.f3520B) == null || nVar.mo19976c() == 0 || (nVar2 = this.f3521C) == null || nVar2.mo19976c() != this.f3520B.mo19976c()) {
            this.f3520B = null;
            this.f3521C = null;
            return new C2682o.C2684b(this.f3562s);
        }
        int c = this.f3520B.mo19976c();
        int[] iArr = new int[c];
        long[] jArr = new long[c];
        long[] jArr2 = new long[c];
        long[] jArr3 = new long[c];
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            jArr3[i2] = this.f3520B.mo19975b(i2);
            jArr[i2] = this.f3559p + this.f3521C.mo19975b(i2);
        }
        while (true) {
            int i3 = c - 1;
            if (i < i3) {
                int i4 = i + 1;
                iArr[i] = (int) (jArr[i4] - jArr[i]);
                jArr2[i] = jArr3[i4] - jArr3[i];
                i = i4;
            } else {
                iArr[i3] = (int) ((this.f3559p + this.f3558o) - jArr[i3]);
                jArr2[i3] = this.f3562s - jArr3[i3];
                this.f3520B = null;
                this.f3521C = null;
                return new C2669b(iArr, jArr, jArr2, jArr3);
            }
        }
    }

    /* renamed from: i */
    public final void mo18607i(C2704c cVar, long j) {
        C2704c cVar2 = cVar;
        C2705d dVar = cVar2.f3587Q;
        if (dVar != null) {
            dVar.mo18627c(cVar2, j);
        } else {
            long j2 = j;
            if ("S_TEXT/UTF8".equals(cVar2.f3594b)) {
                mo18608j(cVar, "%02d:%02d:%02d,%03d", 19, 1000, f3514a0);
            } else if ("S_TEXT/ASS".equals(cVar2.f3594b)) {
                mo18608j(cVar, "%01d:%02d:%02d:%02d", 21, 10000, f3517d0);
            }
            cVar2.f3591U.mo18545c(j, this.f3531M, this.f3540V, 0, cVar2.f3600h);
        }
        this.f3541W = true;
        mo18616u();
    }

    /* renamed from: j */
    public final void mo18608j(C2704c cVar, String str, int i, long j, byte[] bArr) {
        m5374w(this.f3554k.f5877a, this.f3525G, str, i, j, bArr);
        C2686q qVar = cVar.f3591U;
        C3173t tVar = this.f3554k;
        qVar.mo18544b(tVar, tVar.mo20011d());
        this.f3540V += this.f3554k.mo20011d();
    }

    /* renamed from: k */
    public void mo18609k(int i) {
        if (i != 160) {
            if (i == 174) {
                if (m5372o(this.f3563t.f3594b)) {
                    C2704c cVar = this.f3563t;
                    cVar.mo18622c(this.f3543Y, cVar.f3595c);
                    SparseArray<C2704c> sparseArray = this.f3546c;
                    C2704c cVar2 = this.f3563t;
                    sparseArray.put(cVar2.f3595c, cVar2);
                }
                this.f3563t = null;
            } else if (i == 19899) {
                int i2 = this.f3565v;
                if (i2 != -1) {
                    long j = this.f3566w;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.f3568y = j;
                            return;
                        }
                        return;
                    }
                }
                throw new ParserException("Mandatory element SeekID or SeekPosition not found");
            } else if (i == 25152) {
                C2704c cVar3 = this.f3563t;
                if (!cVar3.f3598f) {
                    return;
                }
                if (cVar3.f3600h != null) {
                    cVar3.f3602j = new DrmInitData(new DrmInitData.SchemeData(C2627d.f3279a, "video/webm", this.f3563t.f3600h.f3452b));
                    return;
                }
                throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
            } else if (i == 28032) {
                C2704c cVar4 = this.f3563t;
                if (cVar4.f3598f && cVar4.f3599g != null) {
                    throw new ParserException("Combining encryption and compression is not supported");
                }
            } else if (i == 357149030) {
                if (this.f3560q == -9223372036854775807L) {
                    this.f3560q = EventLoop_commonKt.MS_TO_NS;
                }
                long j2 = this.f3561r;
                if (j2 != -9223372036854775807L) {
                    this.f3562s = mo18617v(j2);
                }
            } else if (i != 374648427) {
                if (i == 475249515 && !this.f3564u) {
                    this.f3543Y.mo18553c(mo18606h());
                    this.f3564u = true;
                }
            } else if (this.f3546c.size() != 0) {
                this.f3543Y.mo18554o();
            } else {
                throw new ParserException("No valid tracks were found");
            }
        } else if (this.f3523E == 2) {
            if (!this.f3542X) {
                this.f3531M |= 1;
            }
            mo18607i(this.f3546c.get(this.f3529K), this.f3524F);
            this.f3523E = 0;
        }
    }

    /* renamed from: m */
    public void mo18610m(int i, double d) {
        if (i == 181) {
            this.f3563t.f3584N = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.f3563t.f3572B = (float) d;
                    return;
                case 21970:
                    this.f3563t.f3573C = (float) d;
                    return;
                case 21971:
                    this.f3563t.f3574D = (float) d;
                    return;
                case 21972:
                    this.f3563t.f3575E = (float) d;
                    return;
                case 21973:
                    this.f3563t.f3576F = (float) d;
                    return;
                case 21974:
                    this.f3563t.f3577G = (float) d;
                    return;
                case 21975:
                    this.f3563t.f3578H = (float) d;
                    return;
                case 21976:
                    this.f3563t.f3579I = (float) d;
                    return;
                case 21977:
                    this.f3563t.f3580J = (float) d;
                    return;
                case 21978:
                    this.f3563t.f3581K = (float) d;
                    return;
                default:
                    switch (i) {
                        case 30323:
                            this.f3563t.f3609q = (float) d;
                            return;
                        case 30324:
                            this.f3563t.f3610r = (float) d;
                            return;
                        case 30325:
                            this.f3563t.f3611s = (float) d;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.f3561r = (long) d;
        }
    }

    /* renamed from: n */
    public void mo18611n(int i, long j) {
        if (i != 20529) {
            if (i != 20530) {
                boolean z = false;
                switch (i) {
                    case 131:
                        this.f3563t.f3596d = (int) j;
                        return;
                    case 136:
                        C2704c cVar = this.f3563t;
                        if (j == 1) {
                            z = true;
                        }
                        cVar.f3589S = z;
                        return;
                    case 155:
                        this.f3525G = mo18617v(j);
                        return;
                    case 159:
                        this.f3563t.f3582L = (int) j;
                        return;
                    case 176:
                        this.f3563t.f3603k = (int) j;
                        return;
                    case 179:
                        this.f3520B.mo19974a(mo18617v(j));
                        return;
                    case 186:
                        this.f3563t.f3604l = (int) j;
                        return;
                    case 215:
                        this.f3563t.f3595c = (int) j;
                        return;
                    case 231:
                        this.f3519A = mo18617v(j);
                        return;
                    case 241:
                        if (!this.f3522D) {
                            this.f3521C.mo19974a(j);
                            this.f3522D = true;
                            return;
                        }
                        return;
                    case 251:
                        this.f3542X = true;
                        return;
                    case 16980:
                        if (j != 3) {
                            throw new ParserException("ContentCompAlgo " + j + " not supported");
                        }
                        return;
                    case 17029:
                        if (j < 1 || j > 2) {
                            throw new ParserException("DocTypeReadVersion " + j + " not supported");
                        }
                        return;
                    case 17143:
                        if (j != 1) {
                            throw new ParserException("EBMLReadVersion " + j + " not supported");
                        }
                        return;
                    case 18401:
                        if (j != 5) {
                            throw new ParserException("ContentEncAlgo " + j + " not supported");
                        }
                        return;
                    case 18408:
                        if (j != 1) {
                            throw new ParserException("AESSettingsCipherMode " + j + " not supported");
                        }
                        return;
                    case 21420:
                        this.f3566w = j + this.f3559p;
                        return;
                    case 21432:
                        int i2 = (int) j;
                        if (i2 == 0) {
                            this.f3563t.f3613u = 0;
                            return;
                        } else if (i2 == 1) {
                            this.f3563t.f3613u = 2;
                            return;
                        } else if (i2 == 3) {
                            this.f3563t.f3613u = 1;
                            return;
                        } else if (i2 == 15) {
                            this.f3563t.f3613u = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        this.f3563t.f3605m = (int) j;
                        return;
                    case 21682:
                        this.f3563t.f3607o = (int) j;
                        return;
                    case 21690:
                        this.f3563t.f3606n = (int) j;
                        return;
                    case 21930:
                        C2704c cVar2 = this.f3563t;
                        if (j == 1) {
                            z = true;
                        }
                        cVar2.f3588R = z;
                        return;
                    case 22186:
                        this.f3563t.f3585O = j;
                        return;
                    case 22203:
                        this.f3563t.f3586P = j;
                        return;
                    case 25188:
                        this.f3563t.f3583M = (int) j;
                        return;
                    case 30321:
                        int i3 = (int) j;
                        if (i3 == 0) {
                            this.f3563t.f3608p = 0;
                            return;
                        } else if (i3 == 1) {
                            this.f3563t.f3608p = 1;
                            return;
                        } else if (i3 == 2) {
                            this.f3563t.f3608p = 2;
                            return;
                        } else if (i3 == 3) {
                            this.f3563t.f3608p = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        this.f3563t.f3597e = (int) j;
                        return;
                    case 2807729:
                        this.f3560q = j;
                        return;
                    default:
                        switch (i) {
                            case 21945:
                                int i4 = (int) j;
                                if (i4 == 1) {
                                    this.f3563t.f3617y = 2;
                                    return;
                                } else if (i4 == 2) {
                                    this.f3563t.f3617y = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                int i5 = (int) j;
                                if (i5 != 1) {
                                    if (i5 == 16) {
                                        this.f3563t.f3616x = 6;
                                        return;
                                    } else if (i5 == 18) {
                                        this.f3563t.f3616x = 7;
                                        return;
                                    } else if (!(i5 == 6 || i5 == 7)) {
                                        return;
                                    }
                                }
                                this.f3563t.f3616x = 3;
                                return;
                            case 21947:
                                C2704c cVar3 = this.f3563t;
                                cVar3.f3614v = true;
                                int i6 = (int) j;
                                if (i6 == 1) {
                                    cVar3.f3615w = 1;
                                    return;
                                } else if (i6 == 9) {
                                    cVar3.f3615w = 6;
                                    return;
                                } else if (i6 == 4 || i6 == 5 || i6 == 6 || i6 == 7) {
                                    this.f3563t.f3615w = 2;
                                    return;
                                } else {
                                    return;
                                }
                            case 21948:
                                this.f3563t.f3618z = (int) j;
                                return;
                            case 21949:
                                this.f3563t.f3571A = (int) j;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j != 1) {
                throw new ParserException("ContentEncodingScope " + j + " not supported");
            }
        } else if (j != 0) {
            throw new ParserException("ContentEncodingOrder " + j + " not supported");
        }
    }

    /* renamed from: q */
    public final boolean mo18612q(C2681n nVar, long j) {
        if (this.f3567x) {
            this.f3569z = j;
            nVar.f3443a = this.f3568y;
            this.f3567x = false;
            return true;
        }
        if (this.f3564u) {
            long j2 = this.f3569z;
            if (j2 != -1) {
                nVar.f3443a = j2;
                this.f3569z = -1;
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public final void mo18613r(C2675h hVar, int i) {
        if (this.f3550g.mo20011d() < i) {
            if (this.f3550g.mo20009b() < i) {
                C3173t tVar = this.f3550g;
                byte[] bArr = tVar.f5877a;
                tVar.mo20004J(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f3550g.mo20011d());
            }
            C3173t tVar2 = this.f3550g;
            hVar.readFully(tVar2.f5877a, tVar2.mo20011d(), i - this.f3550g.mo20011d());
            this.f3550g.mo20005K(i);
        }
    }

    public void release() {
    }

    /* renamed from: s */
    public final int mo18614s(C2675h hVar, C2686q qVar, int i) {
        int i2;
        int a = this.f3553j.mo20008a();
        if (a > 0) {
            i2 = Math.min(i, a);
            qVar.mo18544b(this.f3553j, i2);
        } else {
            i2 = qVar.mo18543a(hVar, i, false);
        }
        this.f3532N += i2;
        this.f3540V += i2;
        return i2;
    }

    /* renamed from: t */
    public final void mo18615t(C2675h hVar, byte[] bArr, int i, int i2) {
        int min = Math.min(i2, this.f3553j.mo20008a());
        hVar.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.f3553j.mo20015h(bArr, i, min);
        }
        this.f3532N += i2;
    }

    /* renamed from: u */
    public final void mo18616u() {
        this.f3532N = 0;
        this.f3540V = 0;
        this.f3539U = 0;
        this.f3533O = false;
        this.f3534P = false;
        this.f3536R = false;
        this.f3538T = 0;
        this.f3537S = 0;
        this.f3535Q = false;
        this.f3553j.mo20001G();
    }

    /* renamed from: v */
    public final long mo18617v(long j) {
        long j2 = this.f3560q;
        if (j2 != -9223372036854775807L) {
            return C3152e0.m7792c0(j, j2, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    /* renamed from: x */
    public void mo18618x(int i, long j, long j2) {
        if (i == 160) {
            this.f3542X = false;
        } else if (i == 174) {
            this.f3563t = new C2704c();
        } else if (i == 187) {
            this.f3522D = false;
        } else if (i == 19899) {
            this.f3565v = -1;
            this.f3566w = -1;
        } else if (i == 20533) {
            this.f3563t.f3598f = true;
        } else if (i == 21968) {
            this.f3563t.f3614v = true;
        } else if (i == 408125543) {
            long j3 = this.f3559p;
            if (j3 == -1 || j3 == j) {
                this.f3559p = j;
                this.f3558o = j2;
                return;
            }
            throw new ParserException("Multiple Segment elements not supported");
        } else if (i == 475249515) {
            this.f3520B = new C3164n();
            this.f3521C = new C3164n();
        } else if (i != 524531317 || this.f3564u) {
        } else {
            if (!this.f3547d || this.f3568y == -1) {
                this.f3543Y.mo18553c(new C2682o.C2684b(this.f3562s));
                this.f3564u = true;
                return;
            }
            this.f3567x = true;
        }
    }

    /* renamed from: y */
    public void mo18619y(int i, String str) {
        if (i == 134) {
            this.f3563t.f3594b = str;
        } else if (i != 17026) {
            if (i == 21358) {
                this.f3563t.f3593a = str;
            } else if (i == 2274716) {
                String unused = this.f3563t.f3590T = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw new ParserException("DocType " + str + " not supported");
        }
    }

    /* renamed from: z */
    public final void mo18620z(C2675h hVar, C2704c cVar, int i) {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.f3594b)) {
            mo18604A(hVar, f3513Z, i);
        } else if ("S_TEXT/ASS".equals(cVar.f3594b)) {
            mo18604A(hVar, f3516c0, i);
        } else {
            C2686q qVar = cVar.f3591U;
            boolean z = true;
            if (!this.f3533O) {
                if (cVar.f3598f) {
                    this.f3531M &= -1073741825;
                    int i3 = 128;
                    if (!this.f3534P) {
                        hVar.readFully(this.f3550g.f5877a, 0, 1);
                        this.f3532N++;
                        byte[] bArr = this.f3550g.f5877a;
                        if ((bArr[0] & ByteCompanionObject.MIN_VALUE) != 128) {
                            this.f3537S = bArr[0];
                            this.f3534P = true;
                        } else {
                            throw new ParserException("Extension bit is set in signal byte");
                        }
                    }
                    if ((this.f3537S & 1) == 1) {
                        boolean z2 = (this.f3537S & 2) == 2;
                        this.f3531M |= 1073741824;
                        if (!this.f3535Q) {
                            hVar.readFully(this.f3555l.f5877a, 0, 8);
                            this.f3532N += 8;
                            this.f3535Q = true;
                            byte[] bArr2 = this.f3550g.f5877a;
                            if (!z2) {
                                i3 = 0;
                            }
                            bArr2[0] = (byte) (i3 | 8);
                            this.f3550g.mo20006L(0);
                            qVar.mo18544b(this.f3550g, 1);
                            this.f3540V++;
                            this.f3555l.mo20006L(0);
                            qVar.mo18544b(this.f3555l, 8);
                            this.f3540V += 8;
                        }
                        if (z2) {
                            if (!this.f3536R) {
                                hVar.readFully(this.f3550g.f5877a, 0, 1);
                                this.f3532N++;
                                this.f3550g.mo20006L(0);
                                this.f3538T = this.f3550g.mo20032y();
                                this.f3536R = true;
                            }
                            int i4 = this.f3538T * 4;
                            this.f3550g.mo20002H(i4);
                            hVar.readFully(this.f3550g.f5877a, 0, i4);
                            this.f3532N += i4;
                            short s = (short) ((this.f3538T / 2) + 1);
                            int i5 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f3557n;
                            if (byteBuffer == null || byteBuffer.capacity() < i5) {
                                this.f3557n = ByteBuffer.allocate(i5);
                            }
                            this.f3557n.position(0);
                            this.f3557n.putShort(s);
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                i2 = this.f3538T;
                                if (i6 >= i2) {
                                    break;
                                }
                                int C = this.f3550g.mo19997C();
                                if (i6 % 2 == 0) {
                                    this.f3557n.putShort((short) (C - i7));
                                } else {
                                    this.f3557n.putInt(C - i7);
                                }
                                i6++;
                                i7 = C;
                            }
                            int i8 = (i - this.f3532N) - i7;
                            if (i2 % 2 == 1) {
                                this.f3557n.putInt(i8);
                            } else {
                                this.f3557n.putShort((short) i8);
                                this.f3557n.putInt(0);
                            }
                            this.f3556m.mo20004J(this.f3557n.array(), i5);
                            qVar.mo18544b(this.f3556m, i5);
                            this.f3540V += i5;
                        }
                    }
                } else {
                    byte[] bArr3 = cVar.f3599g;
                    if (bArr3 != null) {
                        this.f3553j.mo20004J(bArr3, bArr3.length);
                    }
                }
                this.f3533O = true;
            }
            int d = i + this.f3553j.mo20011d();
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f3594b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f3594b)) {
                if (cVar.f3587Q != null) {
                    if (this.f3553j.mo20011d() != 0) {
                        z = false;
                    }
                    C3151e.m7759g(z);
                    cVar.f3587Q.mo18628d(hVar, this.f3531M, d);
                }
                while (true) {
                    int i9 = this.f3532N;
                    if (i9 >= d) {
                        break;
                    }
                    mo18614s(hVar, qVar, d - i9);
                }
            } else {
                byte[] bArr4 = this.f3549f.f5877a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i10 = cVar.f3592V;
                int i11 = 4 - i10;
                while (this.f3532N < d) {
                    int i12 = this.f3539U;
                    if (i12 == 0) {
                        mo18615t(hVar, bArr4, i11, i10);
                        this.f3549f.mo20006L(0);
                        this.f3539U = this.f3549f.mo19997C();
                        this.f3548e.mo20006L(0);
                        qVar.mo18544b(this.f3548e, 4);
                        this.f3540V += 4;
                    } else {
                        this.f3539U = i12 - mo18614s(hVar, qVar, i12);
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f3594b)) {
                this.f3551h.mo20006L(0);
                qVar.mo18544b(this.f3551h, 4);
                this.f3540V += 4;
            }
        }
    }

    public C2701e(int i) {
        this(new C2696b(), i);
    }

    public C2701e(C2699c cVar, int i) {
        this.f3559p = -1;
        this.f3560q = -9223372036854775807L;
        this.f3561r = -9223372036854775807L;
        this.f3562s = -9223372036854775807L;
        this.f3568y = -1;
        this.f3569z = -1;
        this.f3519A = -9223372036854775807L;
        this.f3544a = cVar;
        cVar.mo18591c(new C2703b());
        this.f3547d = (i & 1) != 0 ? false : true;
        this.f3545b = new C2707g();
        this.f3546c = new SparseArray<>();
        this.f3550g = new C3173t(4);
        this.f3551h = new C3173t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f3552i = new C3173t(4);
        this.f3548e = new C3173t(C3168q.f5853a);
        this.f3549f = new C3173t(4);
        this.f3553j = new C3173t();
        this.f3554k = new C3173t();
        this.f3555l = new C3173t(8);
        this.f3556m = new C3173t();
    }
}
