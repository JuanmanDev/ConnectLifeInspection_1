package p040c.p200q.p363c.p394v.p397r;

import androidx.annotation.GuardedBy;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p363c.p394v.C6777o;

/* renamed from: c.q.c.v.r.d */
/* compiled from: RequestLimiter */
public class C6792d {

    /* renamed from: d */
    public static final long f12988d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    public static final long f12989e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    public final C6777o f12990a = C6777o.m19174c();
    @GuardedBy("this")

    /* renamed from: b */
    public long f12991b;
    @GuardedBy("this")

    /* renamed from: c */
    public int f12992c;

    /* renamed from: c */
    public static boolean m19273c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    /* renamed from: d */
    public static boolean m19274d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    /* renamed from: a */
    public final synchronized long mo31556a(int i) {
        if (!m19273c(i)) {
            return f12988d;
        }
        return (long) Math.min(Math.pow(2.0d, (double) this.f12992c) + ((double) this.f12990a.mo31483e()), (double) f12989e);
    }

    /* renamed from: b */
    public synchronized boolean mo31557b() {
        return this.f12992c == 0 || this.f12990a.mo31481a() > this.f12991b;
    }

    /* renamed from: e */
    public final synchronized void mo31558e() {
        this.f12992c = 0;
    }

    /* renamed from: f */
    public synchronized void mo31559f(int i) {
        if (m19274d(i)) {
            mo31558e();
            return;
        }
        this.f12992c++;
        this.f12991b = this.f12990a.mo31481a() + mo31556a(i);
    }
}
