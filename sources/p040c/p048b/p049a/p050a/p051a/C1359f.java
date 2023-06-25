package p040c.p048b.p049a.p050a.p051a;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.f */
/* compiled from: ResponseManager */
public final class C1359f {

    /* renamed from: b */
    public static final String f389b = "c.b.a.a.a.f";

    /* renamed from: c */
    public static C1359f f390c;

    /* renamed from: a */
    public final Map<String, Uri> f391a = new LinkedHashMap();

    /* renamed from: a */
    public static synchronized C1359f m278a() {
        C1359f fVar;
        synchronized (C1359f.class) {
            if (f390c == null) {
                f390c = new C1359f();
            }
            fVar = f390c;
        }
        return fVar;
    }

    /* renamed from: b */
    public synchronized boolean mo15061b(String str) {
        return this.f391a.containsKey(str);
    }

    /* renamed from: c */
    public synchronized void mo15062c(String str, Uri uri) {
        if (str == null) {
            throw new IllegalArgumentException("requestId must be non-null");
        } else if (uri != null) {
            while (this.f391a.size() >= 10) {
                String next = this.f391a.keySet().iterator().next();
                String str2 = f389b;
                C1485a.m828a(str2, "Purging pending response for request ID " + next);
                this.f391a.remove(next);
            }
            String str3 = f389b;
            C1485a.m828a(str3, "Recording pending response for request ID " + str);
            this.f391a.put(str, uri);
        } else {
            throw new IllegalArgumentException("responseUri must be non-null");
        }
    }

    /* renamed from: d */
    public synchronized Uri mo15063d(String str) {
        String str2 = f389b;
        C1485a.m828a(str2, "Dequeuing pending response for request ID " + str);
        return this.f391a.remove(str);
    }

    /* renamed from: e */
    public int mo15064e() {
        return this.f391a.size();
    }
}
