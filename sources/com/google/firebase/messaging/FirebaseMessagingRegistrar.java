package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p201a.p202a.C2354f;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6442p;
import p040c.p200q.p363c.p369m.C6456v;
import p040c.p200q.p363c.p389r.C6739d;
import p040c.p200q.p363c.p391t.p392a.C6753a;
import p040c.p200q.p363c.p394v.C6770i;
import p040c.p200q.p363c.p400x.C6844o;
import p040c.p200q.p363c.p403y.C6878h;
import p040c.p200q.p363c.p403y.C6880i;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    public static final String LIBRARY_NAME = "fire-fcm";

    /* renamed from: a */
    public static /* synthetic */ FirebaseMessaging m23046a(C6442p pVar) {
        return new FirebaseMessaging((C6331h) pVar.mo30529a(C6331h.class), (C6753a) pVar.mo30529a(C6753a.class), pVar.mo30530b(C6880i.class), pVar.mo30530b(HeartBeatInfo.class), (C6770i) pVar.mo30529a(C6770i.class), (C2354f) pVar.mo30529a(C2354f.class), (C6739d) pVar.mo30529a(C6739d.class));
    }

    @Keep
    public List<C6439o<?>> getComponents() {
        C6439o.C6441b<FirebaseMessaging> a = C6439o.m17967a(FirebaseMessaging.class);
        a.mo30556h(LIBRARY_NAME);
        a.mo30550b(C6456v.m18044j(C6331h.class));
        a.mo30550b(C6456v.m18042h(C6753a.class));
        a.mo30550b(C6456v.m18043i(C6880i.class));
        a.mo30550b(C6456v.m18043i(HeartBeatInfo.class));
        a.mo30550b(C6456v.m18042h(C2354f.class));
        a.mo30550b(C6456v.m18044j(C6770i.class));
        a.mo30550b(C6456v.m18044j(C6739d.class));
        a.mo30554f(C6844o.f13102a);
        a.mo30551c();
        return Arrays.asList(new C6439o[]{a.mo30552d(), C6878h.m19548a(LIBRARY_NAME, "23.1.0")});
    }
}
