package p040c.p301y.p508a.p509s;

import com.juconnect.connect_life.application.MainApplication;
import java.lang.Thread;

/* renamed from: c.y.a.s.a */
/* compiled from: lambda */
public final /* synthetic */ class C7727a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f14501a;

    public /* synthetic */ C7727a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f14501a = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        MainApplication.m27238initCrashThird$lambda1(this.f14501a, thread, th);
    }
}
