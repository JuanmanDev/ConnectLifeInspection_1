package p040c.p151o.p152a.p153a.p167p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import p040c.p151o.p152a.p153a.C2103f;
import p040c.p151o.p152a.p153a.p157k.C2130b;
import p040c.p151o.p152a.p153a.p166o.C2153a;
import p040c.p151o.p152a.p153a.p167p.p168c.C2157a;
import p040c.p151o.p152a.p153a.p167p.p168c.C2160b;
import p040c.p151o.p152a.p153a.p167p.p168c.C2163c;
import p040c.p151o.p152a.p153a.p167p.p168c.C2164d;
import p040c.p151o.p152a.p153a.p167p.p168c.C2168e;
import p040c.p151o.p152a.p153a.p167p.p168c.C2171f;
import p040c.p151o.p152a.p153a.p167p.p168c.C2172g;
import p040c.p151o.p152a.p153a.p167p.p168c.C2174h;
import p040c.p151o.p152a.p153a.p174u.C2203d;

/* renamed from: c.o.a.a.p.b */
/* compiled from: ProviderFactory */
public class C2156b implements C2155a {

    /* renamed from: a */
    public final C2130b f2122a;

    /* renamed from: b */
    public final Context f2123b;

    /* renamed from: c */
    public final C2203d f2124c;

    /* renamed from: d */
    public final C2153a f2125d;

    /* renamed from: e */
    public final String[] f2126e;

    /* renamed from: a */
    public void mo16976a() {
        ArrayList<C2163c> d = mo16979d();
        if (d.size() > 0) {
            Iterator<C2163c> it = d.iterator();
            while (it.hasNext()) {
                it.next().mo16980a();
            }
            this.f2125d.mo16963b();
        }
    }

    /* renamed from: b */
    public C2168e mo16977b(String str, C2171f fVar) {
        Class c = mo16978c(str);
        C2130b c2 = this.f2122a.clone();
        c2.mo16929b(C2171f.class, fVar);
        try {
            C2168e eVar = (C2168e) c2.mo16932d(c);
            this.f2122a.mo16929b(c, eVar);
            return eVar;
        } catch (Exception unused) {
            C2103f.m3057c("ProviderFactory", "Missing dependency for creating provider");
            return null;
        } finally {
            c2.mo16934f();
        }
    }

    /* renamed from: c */
    public final Class mo16978c(String str) {
        if (str == null) {
            return C2174h.class;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1534318765:
                if (str.equals("googleplus")) {
                    c = 2;
                    break;
                }
                break;
            case -1240244679:
                if (str.equals("google")) {
                    c = 1;
                    break;
                }
                break;
            case -791770330:
                if (str.equals("wechat")) {
                    c = 4;
                    break;
                }
                break;
            case 3321844:
                if (str.equals("line")) {
                    c = 3;
                    break;
                }
                break;
            case 497130182:
                if (str.equals("facebook")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c != 0) {
            if (c == 1 || c == 2) {
                if (C2160b.m3244o(this.f2123b)) {
                    return C2160b.class;
                }
                throw new RuntimeException("Google auth library implementation is a required dependency. Please make sure it is correctly implemented in your build.gradle file.\nhttps://sap.github.io/gigya-android-sdk/sdk-core/#google");
            } else if (c != 3) {
                if (c == 4 && C2172g.m3279o(this.f2123b, this.f2124c)) {
                    return C2172g.class;
                }
                return C2174h.class;
            } else if (C2164d.m3256l(this.f2124c)) {
                return C2164d.class;
            } else {
                return C2174h.class;
            }
        } else if (C2157a.m3234m(this.f2124c)) {
            return C2157a.class;
        } else {
            throw new RuntimeException("Facebook library implementation is a required dependency. Please make sure it is correctly implemented in your build.gradle file.\nhttps://sap.github.io/gigya-android-sdk/sdk-core/#facebook");
        }
    }

    /* renamed from: d */
    public final ArrayList<C2163c> mo16979d() {
        C2163c cVar;
        ArrayList<C2163c> arrayList = new ArrayList<>();
        for (String c : this.f2126e) {
            try {
                Class c2 = mo16978c(c);
                if (this.f2122a.mo16936h(c2) && (cVar = (C2163c) this.f2122a.mo16935g(c2)) != null) {
                    arrayList.add(cVar);
                }
            } catch (Exception e) {
                C2103f.m3057c("ProviderFactory", "getUsedSocialProviders: " + e.getLocalizedMessage());
            }
        }
        return arrayList;
    }
}
