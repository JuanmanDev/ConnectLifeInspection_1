package p040c.p200q.p201a.p219b.p261o0;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.camera.core.VideoCapture;
import java.util.ArrayList;

/* renamed from: c.q.a.b.o0.p */
/* compiled from: MimeTypes */
public final class C3166p {

    /* renamed from: a */
    public static final ArrayList<C3167a> f5849a = new ArrayList<>();

    /* renamed from: c.q.a.b.o0.p$a */
    /* compiled from: MimeTypes */
    public static final class C3167a {

        /* renamed from: a */
        public final String f5850a;

        /* renamed from: b */
        public final String f5851b;

        /* renamed from: c */
        public final int f5852c;
    }

    @Nullable
    /* renamed from: a */
    public static String m7889a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String d : C3152e0.m7802h0(str)) {
            String d2 = m7892d(d);
            if (d2 != null && m7899k(d2)) {
                return d2;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static String m7890b(String str) {
        int size = f5849a.size();
        for (int i = 0; i < size; i++) {
            C3167a aVar = f5849a.get(i);
            if (str.startsWith(aVar.f5851b)) {
                return aVar.f5850a;
            }
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7891c(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 5
            switch(r0) {
                case -2123537834: goto L_0x0040;
                case -1095064472: goto L_0x0036;
                case 187078296: goto L_0x002c;
                case 1504578661: goto L_0x0022;
                case 1505942594: goto L_0x0018;
                case 1556697186: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = r6
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = r2
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = r5
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = r1
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = r3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = r4
            goto L_0x004b
        L_0x004a:
            r7 = -1
        L_0x004b:
            if (r7 == 0) goto L_0x0062
            if (r7 == r5) goto L_0x0060
            if (r7 == r4) goto L_0x0060
            if (r7 == r3) goto L_0x005e
            if (r7 == r2) goto L_0x005b
            if (r7 == r6) goto L_0x0058
            return r1
        L_0x0058:
            r7 = 14
            return r7
        L_0x005b:
            r7 = 8
            return r7
        L_0x005e:
            r7 = 7
            return r7
        L_0x0060:
            r7 = 6
            return r7
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p261o0.C3166p.m7891c(java.lang.String):int");
    }

    @Nullable
    /* renamed from: d */
    public static String m7892d(@Nullable String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String l0 = C3152e0.m7810l0(str.trim());
        if (l0.startsWith("avc1") || l0.startsWith("avc3")) {
            return VideoCapture.VIDEO_MIME_TYPE;
        }
        if (l0.startsWith("hev1") || l0.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (l0.startsWith("vp9") || l0.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (l0.startsWith("vp8") || l0.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (l0.startsWith("mp4a")) {
            if (l0.startsWith("mp4a.")) {
                String substring = l0.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = m7893e(Integer.parseInt(C3152e0.m7812m0(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? VideoCapture.AUDIO_MIME_TYPE : str2;
        } else if (l0.startsWith("ac-3") || l0.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (l0.startsWith("ec-3") || l0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (l0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (l0.startsWith("dtsc") || l0.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (l0.startsWith("dtsh") || l0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (l0.startsWith("opus")) {
                return "audio/opus";
            }
            if (l0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (l0.startsWith("flac")) {
                return "audio/flac";
            }
            return m7890b(l0);
        }
    }

    @Nullable
    /* renamed from: e */
    public static String m7893e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return VideoCapture.VIDEO_MIME_TYPE;
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return VideoCapture.AUDIO_MIME_TYPE;
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return VideoCapture.AUDIO_MIME_TYPE;
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    default:
                        return null;
                }
        }
    }

    @Nullable
    /* renamed from: f */
    public static String m7894f(@Nullable String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    /* renamed from: g */
    public static int m7895g(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m7899k(str)) {
            return 1;
        }
        if (m7901m(str)) {
            return 2;
        }
        if (m7900l(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return m7896h(str);
    }

    /* renamed from: h */
    public static int m7896h(String str) {
        int size = f5849a.size();
        for (int i = 0; i < size; i++) {
            C3167a aVar = f5849a.get(i);
            if (str.equals(aVar.f5850a)) {
                return aVar.f5852c;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static int m7897i(String str) {
        return m7895g(m7892d(str));
    }

    @Nullable
    /* renamed from: j */
    public static String m7898j(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String d : C3152e0.m7802h0(str)) {
            String d2 = m7892d(d);
            if (d2 != null && m7901m(d2)) {
                return d2;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m7899k(@Nullable String str) {
        return "audio".equals(m7894f(str));
    }

    /* renamed from: l */
    public static boolean m7900l(@Nullable String str) {
        return "text".equals(m7894f(str));
    }

    /* renamed from: m */
    public static boolean m7901m(@Nullable String str) {
        return "video".equals(m7894f(str));
    }
}
