package com.google.firebase.auth;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p367l.C6366e0;
import p040c.p200q.p363c.p367l.p368h.C6371b;
import p040c.p200q.p363c.p367l.p368h.C6384h0;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6442p;
import p040c.p200q.p363c.p369m.C6456v;
import p040c.p200q.p363c.p390s.C6748i;
import p040c.p200q.p363c.p390s.C6750j;
import p040c.p200q.p363c.p403y.C6878h;

@Keep
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(C6442p pVar) {
        return new C6384h0((C6331h) pVar.mo30529a(C6331h.class), pVar.mo30530b(C6750j.class));
    }

    @NonNull
    @Keep
    public List<C6439o<?>> getComponents() {
        C6439o.C6441b<FirebaseAuth> b = C6439o.m17968b(FirebaseAuth.class, C6371b.class);
        b.mo30550b(C6456v.m18044j(C6331h.class));
        b.mo30550b(C6456v.m18045k(C6750j.class));
        b.mo30554f(C6366e0.f12041a);
        b.mo30553e();
        return Arrays.asList(new C6439o[]{b.mo30552d(), C6748i.m19096a(), C6878h.m19548a("fire-auth", "21.1.0")});
    }
}
