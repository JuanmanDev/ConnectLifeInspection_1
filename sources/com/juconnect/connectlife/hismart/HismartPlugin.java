package com.juconnect.connectlife.hismart;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, mo47991d2 = {"Lcom/juconnect/connectlife/hismart/HismartPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "()V", "onMethodCall", "", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "Companion", "hismart_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HismartPlugin.kt */
public final class HismartPlugin implements C9017j.C9021c {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connectlife/hismart/HismartPlugin$Companion;", "", "()V", "registerWith", "", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "hismart_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HismartPlugin.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void registerWith(@NotNull C9024l.C9027c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "registrar");
            new C9017j(cVar.mo46301f(), "hismart").mo46575e(new HismartPlugin());
        }
    }

    @JvmStatic
    public static final void registerWith(@NotNull C9024l.C9027c cVar) {
        Companion.registerWith(cVar);
    }

    public void onMethodCall(@NotNull C9016i iVar, @NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "getPlatformVersion")) {
            dVar.success(Intrinsics.stringPlus("Android ", Build.VERSION.RELEASE));
        } else {
            dVar.notImplemented();
        }
    }
}
