package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p040c.p200q.p363c.C6331h;
import p040c.p200q.p363c.p364k.p365a.C6341a;
import p040c.p200q.p363c.p364k.p365a.p366c.C6346a;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6456v;
import p040c.p200q.p363c.p389r.C6739d;
import p040c.p200q.p363c.p403y.C6878h;

@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @SuppressLint({"MissingPermission"})
    @Keep
    @NonNull
    public List<C6439o<?>> getComponents() {
        C6439o.C6441b<C6341a> a = C6439o.m17967a(C6341a.class);
        a.mo30550b(C6456v.m18044j(C6331h.class));
        a.mo30550b(C6456v.m18044j(Context.class));
        a.mo30550b(C6456v.m18044j(C6739d.class));
        a.mo30554f(C6346a.f12007a);
        a.mo30553e();
        return Arrays.asList(new C6439o[]{a.mo30552d(), C6878h.m19548a("fire-analytics", "21.2.0")});
    }
}
