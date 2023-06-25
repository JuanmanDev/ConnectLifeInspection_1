package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p364k.p365a.C6341a;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6442p;
import p040c.p200q.p363c.p369m.C6456v;
import p040c.p200q.p363c.p370n.C6464d;
import p040c.p200q.p363c.p370n.C6467g;
import p040c.p200q.p363c.p370n.p371h.C6472c;
import p040c.p200q.p363c.p394v.C6770i;
import p040c.p200q.p363c.p403y.C6878h;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* renamed from: a */
    public final C6467g mo37422a(C6442p pVar) {
        return C6467g.m18086e((C6331h) pVar.mo30529a(C6331h.class), (C6770i) pVar.mo30529a(C6770i.class), pVar.mo30533e(C6472c.class), pVar.mo30533e(C6341a.class));
    }

    public List<C6439o<?>> getComponents() {
        C6439o.C6441b<C6467g> a = C6439o.m17967a(C6467g.class);
        a.mo30556h("fire-cls");
        a.mo30550b(C6456v.m18044j(C6331h.class));
        a.mo30550b(C6456v.m18044j(C6770i.class));
        a.mo30550b(C6456v.m18040a(C6472c.class));
        a.mo30550b(C6456v.m18040a(C6341a.class));
        a.mo30554f(new C6464d(this));
        a.mo30553e();
        return Arrays.asList(new C6439o[]{a.mo30552d(), C6878h.m19548a("fire-cls", "18.3.2")});
    }
}
