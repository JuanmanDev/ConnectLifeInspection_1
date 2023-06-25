package p040c.p200q.p363c.p370n.p371h;

import android.util.Log;

/* renamed from: c.q.c.n.h.f */
/* compiled from: Logger */
public class C6479f {

    /* renamed from: c */
    public static final C6479f f12187c = new C6479f("FirebaseCrashlytics");

    /* renamed from: a */
    public final String f12188a;

    /* renamed from: b */
    public int f12189b = 4;

    public C6479f(String str) {
        this.f12188a = str;
    }

    /* renamed from: f */
    public static C6479f m18125f() {
        return f12187c;
    }

    /* renamed from: a */
    public final boolean mo30640a(int i) {
        return this.f12189b <= i || Log.isLoggable(this.f12188a, i);
    }

    /* renamed from: b */
    public void mo30641b(String str) {
        mo30642c(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo30642c(String str, Throwable th) {
        boolean a = mo30640a(3);
    }

    /* renamed from: d */
    public void mo30643d(String str) {
        mo30644e(str, (Throwable) null);
    }

    /* renamed from: e */
    public void mo30644e(String str, Throwable th) {
        boolean a = mo30640a(6);
    }

    /* renamed from: g */
    public void mo30645g(String str) {
        mo30646h(str, (Throwable) null);
    }

    /* renamed from: h */
    public void mo30646h(String str, Throwable th) {
        boolean a = mo30640a(4);
    }

    /* renamed from: i */
    public void mo30647i(String str) {
        mo30648j(str, (Throwable) null);
    }

    /* renamed from: j */
    public void mo30648j(String str, Throwable th) {
        boolean a = mo30640a(2);
    }

    /* renamed from: k */
    public void mo30649k(String str) {
        mo30650l(str, (Throwable) null);
    }

    /* renamed from: l */
    public void mo30650l(String str, Throwable th) {
        boolean a = mo30640a(5);
    }
}
