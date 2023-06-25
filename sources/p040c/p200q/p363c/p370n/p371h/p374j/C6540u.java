package p040c.p200q.p363c.p370n.p371h.p374j;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p040c.p200q.p363c.p370n.p371h.C6472c;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p381p.C6696i;

/* renamed from: c.q.c.n.h.j.u */
/* compiled from: CrashlyticsUncaughtExceptionHandler */
public class C6540u implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C6541a f12328a;

    /* renamed from: b */
    public final C6696i f12329b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f12330c;

    /* renamed from: d */
    public final C6472c f12331d;

    /* renamed from: e */
    public final AtomicBoolean f12332e = new AtomicBoolean(false);

    /* renamed from: c.q.c.n.h.j.u$a */
    /* compiled from: CrashlyticsUncaughtExceptionHandler */
    public interface C6541a {
        /* renamed from: a */
        void mo30736a(C6696i iVar, Thread thread, Throwable th);
    }

    public C6540u(C6541a aVar, C6696i iVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C6472c cVar) {
        this.f12328a = aVar;
        this.f12329b = iVar;
        this.f12330c = uncaughtExceptionHandler;
        this.f12331d = cVar;
    }

    /* renamed from: a */
    public boolean mo30803a() {
        return this.f12332e.get();
    }

    /* renamed from: b */
    public final boolean mo30804b(Thread thread, Throwable th) {
        if (thread == null) {
            C6479f.m18125f().mo30643d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            C6479f.m18125f().mo30643d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (!this.f12331d.mo30626b()) {
            return true;
        } else {
            C6479f.m18125f().mo30641b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        this.f12332e.set(true);
        try {
            if (mo30804b(thread, th)) {
                this.f12328a.mo30736a(this.f12329b, thread, th);
            } else {
                C6479f.m18125f().mo30641b("Uncaught exception will not be recorded by Crashlytics.");
            }
        } catch (Exception e) {
            C6479f.m18125f().mo30644e("An error occurred in the uncaught exception handler", e);
        } catch (Throwable th2) {
            C6479f.m18125f().mo30641b("Completed exception processing. Invoking default exception handler.");
            this.f12330c.uncaughtException(thread, th);
            this.f12332e.set(false);
            throw th2;
        }
        C6479f.m18125f().mo30641b("Completed exception processing. Invoking default exception handler.");
        this.f12330c.uncaughtException(thread, th);
        this.f12332e.set(false);
    }
}
