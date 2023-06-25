package p040c.p200q.p363c.p404z;

import android.os.Build;
import android.os.Trace;

/* renamed from: c.q.c.z.c */
/* compiled from: FirebaseTrace */
public final class C6883c {
    /* renamed from: a */
    public static void m19556a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public static void m19557b(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
