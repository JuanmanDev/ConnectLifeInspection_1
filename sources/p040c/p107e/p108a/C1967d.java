package p040c.p107e.p108a;

import androidx.test.internal.runner.RunnerArgs;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* renamed from: c.e.a.d */
/* compiled from: DefaultCacheKeyProvider */
public final class C1967d implements C1965b {
    /* renamed from: a */
    public String mo16457a(Request request) {
        HttpUrl url = request.url();
        if (url == null) {
            return null;
        }
        return url.scheme() + RunnerArgs.CLASSPATH_SEPARATOR + url.host() + RunnerArgs.CLASSPATH_SEPARATOR + url.port();
    }
}
