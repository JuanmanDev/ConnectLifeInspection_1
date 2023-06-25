package p040c.p200q.p201a.p264c.p340i.p342b;

import java.lang.Thread;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.i.b.n4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5576n4 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final String f10697a;

    /* renamed from: b */
    public final /* synthetic */ C5612q4 f10698b;

    public C5576n4(C5612q4 q4Var, String str) {
        this.f10698b = q4Var;
        C3495o.m8908j(str);
        this.f10697a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f10698b.f10699a.mo28487b().mo28339r().mo28260b(this.f10697a, th);
    }
}
