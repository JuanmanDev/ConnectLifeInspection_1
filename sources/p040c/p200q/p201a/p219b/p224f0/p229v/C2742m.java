package p040c.p200q.p201a.p219b.p224f0.p229v;

import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

/* renamed from: c.q.a.b.f0.v.m */
/* compiled from: TrackEncryptionBox */
public final class C2742m {

    /* renamed from: a */
    public final boolean f3928a;
    @Nullable

    /* renamed from: b */
    public final String f3929b;

    /* renamed from: c */
    public final C2686q.C2687a f3930c;

    /* renamed from: d */
    public final int f3931d;

    /* renamed from: e */
    public final byte[] f3932e;

    public C2742m(boolean z, @Nullable String str, int i, byte[] bArr, int i2, int i3, @Nullable byte[] bArr2) {
        boolean z2 = true;
        C3151e.m7753a((bArr2 != null ? false : z2) ^ (i == 0));
        this.f3928a = z;
        this.f3929b = str;
        this.f3931d = i;
        this.f3932e = bArr2;
        this.f3930c = new C2686q.C2687a(m5604a(str), bArr, i2, i3);
    }

    /* renamed from: a */
    public static int m5604a(@Nullable String str) {
        if (str == null) {
            return 1;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 2;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 3;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 0;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        if (c == 2 || c == 3) {
            return 2;
        }
        C3163m.m7880f("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
        return 1;
    }
}
