package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import com.google.android.material.internal.ManufacturerUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p040c.p200q.p201a.p219b.p234g0.C2823a;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class MediaCodecUtil {

    /* renamed from: a */
    public static final Pattern f7720a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap<C4009b, List<C2823a>> f7721b = new HashMap<>();

    /* renamed from: c */
    public static final SparseIntArray f7722c;

    /* renamed from: d */
    public static final SparseIntArray f7723d;

    /* renamed from: e */
    public static final Map<String, Integer> f7724e;

    /* renamed from: f */
    public static final SparseIntArray f7725f;

    /* renamed from: g */
    public static int f7726g = -1;

    public static class DecoderQueryException extends Exception {
        public DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    public static final class C4009b {

        /* renamed from: a */
        public final String f7727a;

        /* renamed from: b */
        public final boolean f7728b;

        public C4009b(String str, boolean z) {
            this.f7727a = str;
            this.f7728b = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C4009b.class) {
                return false;
            }
            C4009b bVar = (C4009b) obj;
            if (!TextUtils.equals(this.f7727a, bVar.f7727a) || this.f7728b != bVar.f7728b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f7727a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f7728b ? 1231 : 1237);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    public interface C4010c {
        /* renamed from: a */
        MediaCodecInfo mo24043a(int i);

        /* renamed from: b */
        boolean mo24044b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        int mo24045c();

        /* renamed from: d */
        boolean mo24046d();
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    public static final class C4011d implements C4010c {
        public C4011d() {
        }

        /* renamed from: a */
        public MediaCodecInfo mo24043a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public boolean mo24044b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return VideoCapture.VIDEO_MIME_TYPE.equals(str);
        }

        /* renamed from: c */
        public int mo24045c() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: d */
        public boolean mo24046d() {
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$e */
    public static final class C4012e implements C4010c {

        /* renamed from: a */
        public final int f7729a;

        /* renamed from: b */
        public MediaCodecInfo[] f7730b;

        public C4012e(boolean z) {
            this.f7729a = z ? 1 : 0;
        }

        /* renamed from: a */
        public MediaCodecInfo mo24043a(int i) {
            mo24047e();
            return this.f7730b[i];
        }

        /* renamed from: b */
        public boolean mo24044b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        /* renamed from: c */
        public int mo24045c() {
            mo24047e();
            return this.f7730b.length;
        }

        /* renamed from: d */
        public boolean mo24046d() {
            return true;
        }

        /* renamed from: e */
        public final void mo24047e() {
            if (this.f7730b == null) {
                this.f7730b = new MediaCodecList(this.f7729a).getCodecInfos();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$f */
    public static final class C4013f implements Comparator<C2823a> {
        public C4013f() {
        }

        /* renamed from: b */
        public static int m10477b(C2823a aVar) {
            return aVar.f4388a.startsWith("OMX.google") ? -1 : 0;
        }

        /* renamed from: a */
        public int compare(C2823a aVar, C2823a aVar2) {
            return m10477b(aVar) - m10477b(aVar2);
        }
    }

    /* renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$g */
    public static final class C4014g implements Comparator<C2823a> {
        public C4014g() {
        }

        /* renamed from: b */
        public static int m10479b(C2823a aVar) {
            String str = aVar.f4388a;
            if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                return -1;
            }
            return (C3152e0.f5819a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
        }

        /* renamed from: a */
        public int compare(C2823a aVar, C2823a aVar2) {
            return m10479b(aVar) - m10479b(aVar2);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7722c = sparseIntArray;
        sparseIntArray.put(66, 1);
        f7722c.put(77, 2);
        f7722c.put(88, 4);
        f7722c.put(100, 8);
        f7722c.put(110, 16);
        f7722c.put(122, 32);
        f7722c.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f7723d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        f7723d.put(11, 4);
        f7723d.put(12, 8);
        f7723d.put(13, 16);
        f7723d.put(20, 32);
        f7723d.put(21, 64);
        f7723d.put(22, 128);
        f7723d.put(30, 256);
        f7723d.put(31, 512);
        f7723d.put(32, 1024);
        f7723d.put(40, 2048);
        f7723d.put(41, 4096);
        f7723d.put(42, 8192);
        f7723d.put(50, 16384);
        f7723d.put(51, 32768);
        f7723d.put(52, 65536);
        HashMap hashMap = new HashMap();
        f7724e = hashMap;
        hashMap.put("L30", 1);
        f7724e.put("L60", 4);
        f7724e.put("L63", 16);
        f7724e.put("L90", 64);
        f7724e.put("L93", 256);
        f7724e.put("L120", 1024);
        f7724e.put("L123", 4096);
        f7724e.put("L150", 16384);
        f7724e.put("L153", 65536);
        f7724e.put("L156", 262144);
        f7724e.put("L180", 1048576);
        f7724e.put("L183", 4194304);
        f7724e.put("L186", 16777216);
        f7724e.put("H30", 2);
        f7724e.put("H60", 8);
        f7724e.put("H63", 32);
        f7724e.put("H90", 128);
        f7724e.put("H93", 512);
        f7724e.put("H120", 2048);
        f7724e.put("H123", 8192);
        f7724e.put("H150", 32768);
        f7724e.put("H153", 131072);
        f7724e.put("H156", 524288);
        f7724e.put("H180", 2097152);
        f7724e.put("H183", 8388608);
        f7724e.put("H186", 33554432);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f7725f = sparseIntArray3;
        sparseIntArray3.put(1, 1);
        f7725f.put(2, 2);
        f7725f.put(3, 3);
        f7725f.put(4, 4);
        f7725f.put(5, 5);
        f7725f.put(6, 6);
        f7725f.put(17, 17);
        f7725f.put(20, 20);
        f7725f.put(23, 23);
        f7725f.put(29, 29);
        f7725f.put(39, 39);
        f7725f.put(42, 42);
    }

    /* renamed from: a */
    public static void m10451a(String str, List<C2823a> list) {
        if ("audio/raw".equals(str)) {
            Collections.sort(list, new C4014g());
        } else if (C3152e0.f5819a < 21 && list.size() > 1) {
            String str2 = list.get(0).f4388a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(list, new C4013f());
            }
        }
    }

    /* renamed from: b */
    public static int m10452b(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* renamed from: c */
    public static boolean m10453c(String str) {
        return C3152e0.f5819a <= 22 && ("ODROID-XU3".equals(C3152e0.f5822d) || "Nexus 10".equals(C3152e0.f5822d)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str));
    }

    @Nullable
    /* renamed from: d */
    public static Pair<Integer, Integer> m10454d(String str, String[] strArr) {
        int i;
        if (strArr.length != 3) {
            C3163m.m7880f("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (VideoCapture.AUDIO_MIME_TYPE.equals(C3166p.m7893e(Integer.parseInt(strArr[1], 16))) && (i = f7725f.get(Integer.parseInt(strArr[2]), -1)) != -1) {
                return new Pair<>(Integer.valueOf(i), 0);
            }
        } catch (NumberFormatException unused) {
            C3163m.m7880f("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: e */
    public static Pair<Integer, Integer> m10455e(String str, String[] strArr) {
        Integer num;
        Integer num2;
        if (strArr.length < 2) {
            C3163m.m7880f("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                num = Integer.valueOf(Integer.parseInt(strArr[2]));
                num2 = valueOf;
            } else {
                C3163m.m7880f("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i = f7722c.get(num2.intValue(), -1);
            if (i == -1) {
                C3163m.m7880f("MediaCodecUtil", "Unknown AVC profile: " + num2);
                return null;
            }
            int i2 = f7723d.get(num.intValue(), -1);
            if (i2 != -1) {
                return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
            }
            C3163m.m7880f("MediaCodecUtil", "Unknown AVC level: " + num);
            return null;
        } catch (NumberFormatException unused) {
            C3163m.m7880f("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r3.equals("hev1") != false) goto L_0x004c;
     */
    @androidx.annotation.Nullable
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m10456f(java.lang.String r10) {
        /*
            r0 = 0
            if (r10 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r10.split(r1)
            r2 = 0
            r3 = r1[r2]
            r4 = -1
            int r5 = r3.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            switch(r5) {
                case 3006243: goto L_0x0041;
                case 3006244: goto L_0x0037;
                case 3199032: goto L_0x002e;
                case 3214780: goto L_0x0024;
                case 3356560: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x004b
        L_0x001a:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = r6
            goto L_0x004c
        L_0x0024:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = r9
            goto L_0x004c
        L_0x002e:
            java.lang.String r5 = "hev1"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x004b
            goto L_0x004c
        L_0x0037:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = r7
            goto L_0x004c
        L_0x0041:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004b
            r2 = r8
            goto L_0x004c
        L_0x004b:
            r2 = r4
        L_0x004c:
            if (r2 == 0) goto L_0x0061
            if (r2 == r9) goto L_0x0061
            if (r2 == r8) goto L_0x005c
            if (r2 == r7) goto L_0x005c
            if (r2 == r6) goto L_0x0057
            return r0
        L_0x0057:
            android.util.Pair r10 = m10454d(r10, r1)
            return r10
        L_0x005c:
            android.util.Pair r10 = m10455e(r10, r1)
            return r10
        L_0x0061:
            android.util.Pair r10 = m10460j(r10, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m10456f(java.lang.String):android.util.Pair");
    }

    @Nullable
    /* renamed from: g */
    public static C2823a m10457g(String str, boolean z) {
        List<C2823a> h = m10458h(str, z);
        if (h.isEmpty()) {
            return null;
        }
        return h.get(0);
    }

    /* renamed from: h */
    public static synchronized List<C2823a> m10458h(String str, boolean z) {
        synchronized (MediaCodecUtil.class) {
            C4009b bVar = new C4009b(str, z);
            List<C2823a> list = f7721b.get(bVar);
            if (list != null) {
                return list;
            }
            C4010c eVar = C3152e0.f5819a >= 21 ? new C4012e(z) : new C4011d();
            ArrayList<C2823a> i = m10459i(bVar, eVar, str);
            if (z && i.isEmpty() && 21 <= C3152e0.f5819a && C3152e0.f5819a <= 23) {
                eVar = new C4011d();
                i = m10459i(bVar, eVar, str);
                if (!i.isEmpty()) {
                    C3163m.m7880f("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + i.get(0).f4388a);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                i.addAll(m10459i(new C4009b("audio/eac3", bVar.f7728b), eVar, str));
            }
            m10451a(str, i);
            List<C2823a> unmodifiableList = Collections.unmodifiableList(i);
            f7721b.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[Catch:{ Exception -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[Catch:{ Exception -> 0x004d }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a A[SYNTHETIC, Splitter:B:38:0x008a] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<p040c.p200q.p201a.p219b.p234g0.C2823a> m10459i(com.google.android.exoplayer2.mediacodec.MediaCodecUtil.C4009b r17, com.google.android.exoplayer2.mediacodec.MediaCodecUtil.C4010c r18, java.lang.String r19) {
        /*
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e1 }
            r3.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r4 = r1.f7727a     // Catch:{ Exception -> 0x00e1 }
            int r5 = r18.mo24045c()     // Catch:{ Exception -> 0x00e1 }
            boolean r6 = r18.mo24046d()     // Catch:{ Exception -> 0x00e1 }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x00e0
            android.media.MediaCodecInfo r9 = r2.mo24043a(r8)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x00e1 }
            r11 = r19
            boolean r0 = m10462l(r9, r10, r6, r11)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x00e1 }
            int r13 = r12.length     // Catch:{ Exception -> 0x00e1 }
            r14 = 0
        L_0x002c:
            if (r14 >= r13) goto L_0x00d6
            r15 = r12[r14]     // Catch:{ Exception -> 0x00e1 }
            boolean r0 = r15.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x00e1 }
            if (r0 == 0) goto L_0x00cc
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x007f }
            boolean r7 = r2.mo24044b(r4, r0)     // Catch:{ Exception -> 0x007f }
            boolean r2 = m10453c(r10)     // Catch:{ Exception -> 0x007f }
            if (r6 == 0) goto L_0x004f
            r16 = r5
            boolean r5 = r1.f7728b     // Catch:{ Exception -> 0x004d }
            if (r5 == r7) goto L_0x004b
            goto L_0x0051
        L_0x004b:
            r5 = 0
            goto L_0x0058
        L_0x004d:
            r0 = move-exception
            goto L_0x0082
        L_0x004f:
            r16 = r5
        L_0x0051:
            if (r6 != 0) goto L_0x0060
            boolean r5 = r1.f7728b     // Catch:{ Exception -> 0x004d }
            if (r5 != 0) goto L_0x0060
            goto L_0x004b
        L_0x0058:
            c.q.a.b.g0.a r0 = p040c.p200q.p201a.p219b.p234g0.C2823a.m6011t(r10, r4, r0, r2, r5)     // Catch:{ Exception -> 0x004d }
            r3.add(r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x00ce
        L_0x0060:
            r5 = 0
            if (r6 != 0) goto L_0x00ce
            if (r7 == 0) goto L_0x00ce
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004d }
            r7.<init>()     // Catch:{ Exception -> 0x004d }
            r7.append(r10)     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = ".secure"
            r7.append(r5)     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x004d }
            r7 = 1
            c.q.a.b.g0.a r0 = p040c.p200q.p201a.p219b.p234g0.C2823a.m6011t(r5, r4, r0, r2, r7)     // Catch:{ Exception -> 0x004d }
            r3.add(r0)     // Catch:{ Exception -> 0x004d }
            return r3
        L_0x007f:
            r0 = move-exception
            r16 = r5
        L_0x0082:
            int r2 = p040c.p200q.p201a.p219b.p261o0.C3152e0.f5819a     // Catch:{ Exception -> 0x00e1 }
            r5 = 23
            java.lang.String r7 = "MediaCodecUtil"
            if (r2 > r5) goto L_0x00aa
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x00e1 }
            if (r2 != 0) goto L_0x00aa
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r0.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "Skipping codec "
            r0.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r0.append(r10)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = " (failed to query capabilities)"
            r0.append(r2)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e1 }
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7877c(r7, r0)     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00ce
        L_0x00aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1 }
            r1.<init>()     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = "Failed to query codec "
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r1.append(r10)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            r1.append(r15)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ Exception -> 0x00e1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00e1 }
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7877c(r7, r1)     // Catch:{ Exception -> 0x00e1 }
            throw r0     // Catch:{ Exception -> 0x00e1 }
        L_0x00cc:
            r16 = r5
        L_0x00ce:
            int r14 = r14 + 1
            r2 = r18
            r5 = r16
            goto L_0x002c
        L_0x00d6:
            r16 = r5
            int r8 = r8 + 1
            r2 = r18
            r5 = r16
            goto L_0x0014
        L_0x00e0:
            return r3
        L_0x00e1:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecUtil.m10459i(com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b, com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: j */
    public static Pair<Integer, Integer> m10460j(String str, String[] strArr) {
        int i;
        if (strArr.length < 4) {
            C3163m.m7880f("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        Matcher matcher = f7720a.matcher(strArr[1]);
        if (!matcher.matches()) {
            C3163m.m7880f("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = 2;
        } else {
            C3163m.m7880f("MediaCodecUtil", "Unknown HEVC profile string: " + group);
            return null;
        }
        Integer num = f7724e.get(strArr[3]);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        C3163m.m7880f("MediaCodecUtil", "Unknown HEVC level string: " + matcher.group(1));
        return null;
    }

    @Nullable
    /* renamed from: k */
    public static C2823a m10461k() {
        C2823a g = m10457g("audio/raw", false);
        if (g == null) {
            return null;
        }
        return C2823a.m6012u(g.f4388a);
    }

    /* renamed from: l */
    public static boolean m10462l(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (C3152e0.f5819a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (C3152e0.f5819a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(C3152e0.f5820b) || ("Xiaomi".equals(C3152e0.f5821c) && C3152e0.f5820b.startsWith("HM")))) {
            return false;
        }
        if (C3152e0.f5819a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(C3152e0.f5820b) || "protou".equals(C3152e0.f5820b) || "ville".equals(C3152e0.f5820b) || "villeplus".equals(C3152e0.f5820b) || "villec2".equals(C3152e0.f5820b) || C3152e0.f5820b.startsWith("gee") || "C6602".equals(C3152e0.f5820b) || "C6603".equals(C3152e0.f5820b) || "C6606".equals(C3152e0.f5820b) || "C6616".equals(C3152e0.f5820b) || "L36h".equals(C3152e0.f5820b) || "SO-02E".equals(C3152e0.f5820b))) {
            return false;
        }
        if (C3152e0.f5819a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(C3152e0.f5820b) || "C1505".equals(C3152e0.f5820b) || "C1604".equals(C3152e0.f5820b) || "C1605".equals(C3152e0.f5820b))) {
            return false;
        }
        if (C3152e0.f5819a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && ManufacturerUtils.SAMSUNG.equals(C3152e0.f5821c) && (C3152e0.f5820b.startsWith("zeroflte") || C3152e0.f5820b.startsWith("zerolte") || C3152e0.f5820b.startsWith("zenlte") || "SC-05G".equals(C3152e0.f5820b) || "marinelteatt".equals(C3152e0.f5820b) || "404SC".equals(C3152e0.f5820b) || "SC-04G".equals(C3152e0.f5820b) || "SCV31".equals(C3152e0.f5820b)))) {
            return false;
        }
        if (C3152e0.f5819a <= 19 && "OMX.SEC.vp8.dec".equals(str) && ManufacturerUtils.SAMSUNG.equals(C3152e0.f5821c) && (C3152e0.f5820b.startsWith("d2") || C3152e0.f5820b.startsWith("serrano") || C3152e0.f5820b.startsWith("jflte") || C3152e0.f5820b.startsWith("santos") || C3152e0.f5820b.startsWith("t0"))) {
            return false;
        }
        if (C3152e0.f5819a <= 19 && C3152e0.f5820b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (!"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static int m10463m() {
        if (f7726g == -1) {
            int i = 0;
            C2823a g = m10457g(VideoCapture.VIDEO_MIME_TYPE, false);
            if (g != null) {
                MediaCodecInfo.CodecProfileLevel[] d = g.mo18885d();
                int length = d.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m10452b(d[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C3152e0.f5819a >= 21 ? 345600 : 172800);
            }
            f7726g = i;
        }
        return f7726g;
    }
}
