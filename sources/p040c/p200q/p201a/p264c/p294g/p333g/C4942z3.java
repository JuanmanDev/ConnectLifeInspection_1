package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import okio.Utf8;

/* renamed from: c.q.a.c.g.g.z3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4942z3 {
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m13685a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m13689e(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m13689e(b3) || m13689e(b4)) {
            throw zzadn.zzd();
        }
        byte b5 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
        cArr[i] = (char) ((b5 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
        cArr[i + 1] = (char) ((b5 & 1023) + Utf8.LOG_SURROGATE_HEADER);
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m13686b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!m13689e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m13689e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
                return;
            }
        }
        throw zzadn.zzd();
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m13687c(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m13689e(b2)) {
            throw zzadn.zzd();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & Utf8.REPLACEMENT_BYTE));
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ boolean m13688d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    public static boolean m13689e(byte b) {
        return b > -65;
    }
}
