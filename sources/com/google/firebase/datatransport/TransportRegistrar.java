package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p201a.p202a.C2354f;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6456v;
import p040c.p200q.p363c.p383o.C6705a;
import p040c.p200q.p363c.p403y.C6878h;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    public static final String LIBRARY_NAME = "fire-transport";

    public List<C6439o<?>> getComponents() {
        C6439o.C6441b<C2354f> a = C6439o.m17967a(C2354f.class);
        a.mo30556h(LIBRARY_NAME);
        a.mo30550b(C6456v.m18044j(Context.class));
        a.mo30554f(C6705a.f12839a);
        return Arrays.asList(new C6439o[]{a.mo30552d(), C6878h.m19548a(LIBRARY_NAME, "18.1.7")});
    }
}
