package com.hisense.hi_appliance;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\tH\u0016J\u001c\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/hi_appliance/HiAppliancePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "hi_appliance_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiAppliancePlugin.kt */
public final class HiAppliancePlugin implements C8944a, C9017j.C9021c {
    public C9017j channel;

    public void onAttachedToEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "flutterPluginBinding");
        C9017j jVar = new C9017j(bVar.mo46465b(), "hi_appliance");
        this.channel = jVar;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            jVar = null;
        }
        jVar.mo46575e(this);
    }

    public void onDetachedFromEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "binding");
        C9017j jVar = this.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            jVar = null;
        }
        jVar.mo46575e((C9017j.C9021c) null);
    }

    public void onMethodCall(@NotNull @NonNull C9016i iVar, @NotNull @NonNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "getPlatformVersion")) {
            dVar.success(Intrinsics.stringPlus("Android ", Build.VERSION.RELEASE));
        } else {
            dVar.notImplemented();
        }
    }
}
