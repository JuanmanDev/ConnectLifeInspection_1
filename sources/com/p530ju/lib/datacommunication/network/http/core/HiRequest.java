package com.p530ju.lib.datacommunication.network.http.core;

import android.net.Uri;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7659b;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7663c;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7672f;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7682b;

/* renamed from: com.ju.lib.datacommunication.network.http.core.HiRequest */
public class HiRequest {

    /* renamed from: k */
    public static final AtomicInteger f16458k = new AtomicInteger(0);

    /* renamed from: a */
    public final int f16459a;

    /* renamed from: b */
    public final Object f16460b;

    /* renamed from: c */
    public final int f16461c;

    /* renamed from: d */
    public final String f16462d;

    /* renamed from: e */
    public final Method f16463e;

    /* renamed from: f */
    public final C7659b f16464f;

    /* renamed from: g */
    public final C8724a f16465g;

    /* renamed from: h */
    public final C8726c f16466h;

    /* renamed from: i */
    public final C7682b f16467i;

    /* renamed from: j */
    public C7672f.C7674b f16468j;

    /* renamed from: com.ju.lib.datacommunication.network.http.core.HiRequest$Method */
    public enum Method {
        GET,
        HEAD,
        PUT,
        DELETE,
        POST,
        PATCH
    }

    /* renamed from: com.ju.lib.datacommunication.network.http.core.HiRequest$a */
    public static abstract class C8724a {
        /* renamed from: a */
        public long mo44445a() {
            return -1;
        }

        /* renamed from: b */
        public abstract String mo33184b();

        /* renamed from: c */
        public abstract void mo33185c(OutputStream outputStream);
    }

    /* renamed from: com.ju.lib.datacommunication.network.http.core.HiRequest$b */
    public static class C8725b {

        /* renamed from: a */
        public String f16469a;

        /* renamed from: b */
        public Method f16470b = Method.GET;

        /* renamed from: c */
        public C7659b.C7661b f16471c = new C7659b.C7661b();

        /* renamed from: d */
        public C8724a f16472d;

        /* renamed from: e */
        public int f16473e;

        /* renamed from: f */
        public Object f16474f;

        /* renamed from: g */
        public C8726c f16475g;

        /* renamed from: h */
        public int f16476h;

        /* renamed from: i */
        public C7682b f16477i;

        /* renamed from: j */
        public HiRequest mo44446j() {
            if (this.f16469a != null) {
                return new HiRequest(this, (C7663c) null);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: k */
        public C8725b mo44447k() {
            mo44449m(Method.GET, (C8724a) null);
            return this;
        }

        /* renamed from: l */
        public C8725b mo44448l(String str, String str2) {
            C7659b.C7661b bVar = this.f16471c;
            if (str2 == null) {
                str2 = "";
            }
            bVar.mo33118f(str, str2);
            return this;
        }

        /* renamed from: m */
        public C8725b mo44449m(Method method, C8724a aVar) {
            if (method == null) {
                throw new NullPointerException("method == null");
            } else if (aVar != null && !mo44450n(method)) {
                throw new IllegalArgumentException("method " + method + " must not have a request body.");
            } else if (aVar != null || !mo44452p(method)) {
                this.f16470b = method;
                this.f16472d = aVar;
                return this;
            } else {
                throw new IllegalArgumentException("method " + method + " must have a request body.");
            }
        }

        /* renamed from: n */
        public final boolean mo44450n(Method method) {
            return mo44452p(method) || method.equals(Method.DELETE);
        }

        /* renamed from: o */
        public C8725b mo44451o(C8724a aVar) {
            mo44449m(Method.POST, aVar);
            return this;
        }

        /* renamed from: p */
        public final boolean mo44452p(Method method) {
            return method.equals(Method.POST) || method.equals(Method.PUT) || method.equals(Method.PATCH);
        }

        /* renamed from: q */
        public C8725b mo44453q(C7682b bVar) {
            this.f16477i = bVar;
            return this;
        }

        /* renamed from: r */
        public C8725b mo44454r(Uri uri) {
            if (uri == null) {
                return this;
            }
            this.f16469a = uri.toString();
            return this;
        }

        /* renamed from: s */
        public C8725b mo44455s(String str) {
            if (str == null) {
                return this;
            }
            mo44454r(Uri.parse(str));
            return this;
        }

        /* renamed from: t */
        public C8725b mo44456t(String str, Map<String, String> map) {
            if (str == null) {
                return this;
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            if (map == null) {
                mo44454r(buildUpon.build());
                return this;
            }
            for (Map.Entry next : map.entrySet()) {
                buildUpon.appendQueryParameter((String) next.getKey(), next.getValue() == null ? "" : (String) next.getValue());
            }
            mo44454r(buildUpon.build());
            return this;
        }
    }

    /* renamed from: com.ju.lib.datacommunication.network.http.core.HiRequest$c */
    public static class C8726c {

        /* renamed from: a */
        public final String f16478a;

        /* renamed from: b */
        public final String f16479b;
    }

    public /* synthetic */ HiRequest(C8725b bVar, C7663c cVar) {
        this(bVar);
    }

    /* renamed from: a */
    public C8724a mo44435a() {
        return this.f16465g;
    }

    /* renamed from: b */
    public C7672f.C7674b mo44436b() {
        return this.f16468j;
    }

    /* renamed from: c */
    public C7659b mo44437c() {
        return this.f16464f;
    }

    /* renamed from: d */
    public int mo44438d() {
        return this.f16459a;
    }

    /* renamed from: e */
    public Method mo44439e() {
        return this.f16463e;
    }

    /* renamed from: f */
    public C8726c mo44440f() {
        return this.f16466h;
    }

    /* renamed from: g */
    public int mo44441g() {
        return this.f16461c;
    }

    /* renamed from: h */
    public C7682b mo44442h() {
        return this.f16467i;
    }

    /* renamed from: i */
    public String mo44443i() {
        return this.f16462d;
    }

    /* renamed from: j */
    public void mo44444j(C7672f.C7674b bVar) {
        this.f16468j = bVar;
    }

    public HiRequest(C8725b bVar) {
        this.f16459a = f16458k.getAndIncrement();
        this.f16462d = bVar.f16469a;
        this.f16463e = bVar.f16470b;
        this.f16464f = bVar.f16471c.mo33115c();
        this.f16465g = bVar.f16472d;
        int unused = bVar.f16473e;
        this.f16460b = bVar.f16474f;
        this.f16461c = bVar.f16476h;
        this.f16466h = bVar.f16475g;
        this.f16467i = bVar.f16477i;
    }
}
