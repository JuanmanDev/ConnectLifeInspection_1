package p040c.p048b.p049a.p050a.p051a.p060m;

import com.amazon.identity.auth.device.endpoint.BackoffException;
import java.net.URL;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import javax.net.ssl.HttpsURLConnection;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.m.g */
/* compiled from: ExponentialBackoffHelper */
public class C1432g {

    /* renamed from: f */
    public static final HashMap<String, C1431f> f576f = new HashMap<>();

    /* renamed from: g */
    public static final String f577g = C1432g.class.getSimpleName();

    /* renamed from: a */
    public final Random f578a = new SecureRandom();

    /* renamed from: b */
    public int f579b;

    /* renamed from: c */
    public int f580c;

    /* renamed from: d */
    public int f581d = 0;

    /* renamed from: e */
    public int f582e;

    public C1432g(int i, int i2) {
        this.f579b = i;
        this.f580c = i2;
        this.f582e = mo15254a(this.f581d);
        if (this.f579b <= 0) {
            this.f579b = 10;
            C1485a.m838k(f577g, String.format("ExponentialBackoffHelper: was constructed with a first retry interval value less than or equal to zero. It has been set to a default value (%d ms)", new Object[]{10}));
        }
    }

    /* renamed from: b */
    public static C1431f m635b(URL url) {
        C1431f fVar;
        String d = m637d(url);
        synchronized (f576f) {
            C1431f fVar2 = f576f.get(d);
            if (fVar2 == null) {
                fVar = new C1431f(url);
            } else {
                fVar = fVar2.mo15251c(url);
            }
            f576f.put(d, fVar);
        }
        return fVar;
    }

    /* renamed from: c */
    public static C1431f m636c(URL url) {
        C1431f fVar;
        synchronized (f576f) {
            fVar = f576f.get(m637d(url));
        }
        return fVar;
    }

    /* renamed from: d */
    public static String m637d(URL url) {
        return url.getHost() + url.getPath();
    }

    /* renamed from: e */
    public static int m638e(long j, Random random) {
        int min = (int) Math.min(2147483647L, (60 * j) / 100);
        if (min == 0) {
            return (int) j;
        }
        return (int) ((j - ((long) (min / 2))) + ((long) random.nextInt(min)));
    }

    /* renamed from: f */
    public static boolean m639f(URL url) {
        return m636c(url) != null;
    }

    /* renamed from: g */
    public static boolean m640g(int i) {
        return i == 429 || (i >= 500 && i <= 599);
    }

    /* renamed from: j */
    public static void m641j(URL url) {
        C1431f c = m636c(url);
        if (c != null && c.mo15253e()) {
            C1431f c2 = m636c(url);
            String d = m637d(url);
            C1485a.m828a(f577g, String.format(Locale.ENGLISH, "Host is %s not available and currently in backoff interval", new Object[]{d}));
            if (c2 != null) {
                throw new BackoffException(String.format(Locale.ENGLISH, "Service %s is unavailable and currently in backoff interval, please retry after %d ms.", new Object[]{url.getHost(), Long.valueOf(c2.mo15252d() - System.currentTimeMillis())}), c);
            }
            throw new BackoffException(String.format(Locale.ENGLISH, "Ran in to a rare race condition during backoff interval, this call is backed off but %s server is back to available after this point.", new Object[]{url.getHost()}), c);
        }
    }

    /* renamed from: k */
    public static int m642k(HttpsURLConnection httpsURLConnection) {
        int responseCode = httpsURLConnection.getResponseCode();
        m643l(responseCode, httpsURLConnection.getURL());
        return responseCode;
    }

    /* renamed from: l */
    public static C1431f m643l(int i, URL url) {
        if (m640g(i)) {
            C1485a.m829b(f577g, String.format(Locale.ENGLISH, "MAP received %d response from server, so updating the backoff info", new Object[]{Integer.valueOf(i)}));
            return m635b(url);
        }
        synchronized (f576f) {
            f576f.remove(m637d(url));
        }
        return null;
    }

    /* renamed from: a */
    public final int mo15254a(int i) {
        int i2 = 1;
        for (int i3 = 0; i3 < i && this.f579b * i2 * 2 <= this.f580c; i3++) {
            i2 *= 2;
        }
        return i2;
    }

    /* renamed from: h */
    public int mo15255h() {
        this.f581d++;
        int i = this.f579b;
        int i2 = this.f582e;
        int i3 = i * i2;
        if (i3 * 2 <= this.f580c) {
            this.f582e = i2 * 2;
        }
        return m638e((long) i3, this.f578a);
    }

    /* renamed from: i */
    public int mo15256i() {
        return this.f581d;
    }
}
