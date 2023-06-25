package p040c.p048b.p049a.p050a.p051a.p060m;

import java.net.URL;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.f */
/* compiled from: BackoffInfo */
public class C1431f {

    /* renamed from: f */
    public static final long f568f = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: g */
    public static final long f569g = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: h */
    public static final long f570h = TimeUnit.SECONDS.toMillis(78);

    /* renamed from: a */
    public final URL f571a;

    /* renamed from: b */
    public final long f572b;

    /* renamed from: c */
    public final long f573c;

    /* renamed from: d */
    public final SecureRandom f574d;

    /* renamed from: e */
    public int f575e;

    public C1431f(URL url) {
        this(url, f568f);
    }

    /* renamed from: a */
    public final long mo15249a(long j) {
        if (j >= f568f) {
            return Math.min(j, f570h);
        }
        C1485a.m832e("BackoffInfo", String.format(Locale.ENGLISH, "Backoff interval cannot be less than %d ms, set interval to %d ms", new Object[]{Long.valueOf(f568f), Long.valueOf(f568f)}));
        return f568f;
    }

    /* renamed from: b */
    public long mo15250b() {
        long currentTimeMillis = this.f573c - System.currentTimeMillis();
        if (currentTimeMillis <= f570h) {
            return currentTimeMillis;
        }
        C1485a.m832e("BackoffInfo", "System clock is set to past, correcting backoff info...");
        long j = f570h;
        C1432g.m635b(this.f571a);
        return j;
    }

    /* renamed from: c */
    public C1431f mo15251c(URL url) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis < this.f573c;
        boolean z2 = this.f573c - currentTimeMillis < f570h;
        if (z && z2) {
            return this;
        }
        C1485a.m832e("BackoffInfo", String.format(Locale.ENGLISH, "Last backoff interval is %d ms, updating backoff info...", new Object[]{Long.valueOf(this.f572b)}));
        int i = this.f575e + 1;
        this.f575e = i;
        return new C1431f(i, url, (long) C1432g.m638e((long) ((int) Math.min(this.f572b * 2, f569g)), this.f574d));
    }

    /* renamed from: d */
    public long mo15252d() {
        return this.f573c;
    }

    /* renamed from: e */
    public boolean mo15253e() {
        return mo15250b() > 0;
    }

    public C1431f(URL url, long j) {
        this(1, url, j);
    }

    public C1431f(int i, URL url, long j) {
        this.f575e = 0;
        this.f571a = url;
        long a = mo15249a(j);
        this.f572b = a;
        this.f573c = a + System.currentTimeMillis();
        this.f574d = new SecureRandom();
        this.f575e = i;
    }
}
