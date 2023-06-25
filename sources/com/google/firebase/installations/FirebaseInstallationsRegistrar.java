package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6442p;
import p040c.p200q.p363c.p369m.C6456v;
import p040c.p200q.p363c.p390s.C6748i;
import p040c.p200q.p363c.p390s.C6750j;
import p040c.p200q.p363c.p394v.C6762e;
import p040c.p200q.p363c.p394v.C6767h;
import p040c.p200q.p363c.p394v.C6770i;
import p040c.p200q.p363c.p403y.C6878h;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static final String LIBRARY_NAME = "fire-installations";

    /* renamed from: a */
    public static /* synthetic */ C6770i m22989a(C6442p pVar) {
        return new C6767h((C6331h) pVar.mo30529a(C6331h.class), pVar.mo30530b(C6750j.class));
    }

    public List<C6439o<?>> getComponents() {
        C6439o.C6441b<C6770i> a = C6439o.m17967a(C6770i.class);
        a.mo30556h(LIBRARY_NAME);
        a.mo30550b(C6456v.m18044j(C6331h.class));
        a.mo30550b(C6456v.m18043i(C6750j.class));
        a.mo30554f(C6762e.f12915a);
        return Arrays.asList(new C6439o[]{a.mo30552d(), C6748i.m19096a(), C6878h.m19548a(LIBRARY_NAME, "17.1.0")});
    }
}
