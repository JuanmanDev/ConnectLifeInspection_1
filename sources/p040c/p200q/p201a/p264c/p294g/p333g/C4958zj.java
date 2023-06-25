package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.q.a.c.g.g.zj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4958zj {

    /* renamed from: b */
    public static final Logger f9779b = Logger.getLogger(C4958zj.class.getName());

    /* renamed from: c */
    public static final List f9780c;

    /* renamed from: d */
    public static final boolean f9781d;

    /* renamed from: e */
    public static final C4958zj f9782e = new C4958zj(new C4320bk());

    /* renamed from: f */
    public static final C4958zj f9783f = new C4958zj(new C4428fk());

    /* renamed from: g */
    public static final C4958zj f9784g = new C4958zj(new C4347ck());

    /* renamed from: h */
    public static final C4958zj f9785h = new C4958zj(new C4401ek());

    /* renamed from: i */
    public static final C4958zj f9786i = new C4958zj(new C4374dk());

    /* renamed from: a */
    public final C4455gk f9787a;

    static {
        if (C4816u7.m13228b()) {
            f9780c = m13736b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f9781d = false;
        } else if (C4725qk.m12939a()) {
            f9780c = m13736b("GmsCore_OpenSSL", "AndroidOpenSSL");
            f9781d = true;
        } else {
            f9780c = new ArrayList();
            f9781d = true;
        }
    }

    public C4958zj(C4455gk gkVar) {
        this.f9787a = gkVar;
    }

    /* renamed from: b */
    public static List m13736b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f9779b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final Object mo26891a(String str) {
        Exception exc = null;
        for (Provider a : f9780c) {
            try {
                return this.f9787a.mo25829a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (f9781d) {
            return this.f9787a.mo25829a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
