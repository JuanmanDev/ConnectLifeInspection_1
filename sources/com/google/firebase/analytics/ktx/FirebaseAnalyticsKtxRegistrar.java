package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import org.jetbrains.annotations.NotNull;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p403y.C6878h;

@Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, mo47991d2 = {"Lcom/google/firebase/analytics/ktx/FirebaseAnalyticsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", "", "Lcom/google/firebase/components/Component;", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: com.google.firebase:firebase-analytics-ktx@@21.2.0 */
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @NotNull
    public final List<C6439o<?>> getComponents() {
        return CollectionsKt__CollectionsJVMKt.listOf(C6878h.m19548a(AnalyticsKt.LIBRARY_NAME, "21.2.0"));
    }
}
