package p040c.p200q.p201a.p219b.p221c0;

import net.sqlcipher.database.SQLiteDatabase;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.c0.y */
/* compiled from: WavUtil */
public final class C2626y {

    /* renamed from: a */
    public static final int f3276a = C3152e0.m7764D("RIFF");

    /* renamed from: b */
    public static final int f3277b = C3152e0.m7764D("WAVE");

    /* renamed from: c */
    public static final int f3278c = C3152e0.m7764D("fmt ");

    static {
        C3152e0.m7764D("data");
    }

    /* renamed from: a */
    public static int m5056a(int i, int i2) {
        if (i != 1) {
            if (i == 3) {
                return i2 == 32 ? 4 : 0;
            }
            if (i != 65534) {
                if (i == 6) {
                    return 536870912;
                }
                if (i != 7) {
                    return 0;
                }
                return SQLiteDatabase.CREATE_IF_NECESSARY;
            }
        }
        return C3152e0.m7769I(i2);
    }
}
