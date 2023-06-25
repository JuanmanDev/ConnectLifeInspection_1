package p040c.p200q.p201a.p219b.p261o0;

import android.annotation.TargetApi;
import android.os.Trace;

/* renamed from: c.q.a.b.o0.c0 */
/* compiled from: TraceUtil */
public final class C3148c0 {
    /* renamed from: a */
    public static void m7745a(String str) {
        if (C3152e0.f5819a >= 18) {
            m7746b(str);
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    public static void m7746b(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: c */
    public static void m7747c() {
        if (C3152e0.f5819a >= 18) {
            m7748d();
        }
    }

    @TargetApi(18)
    /* renamed from: d */
    public static void m7748d() {
        Trace.endSection();
    }
}
