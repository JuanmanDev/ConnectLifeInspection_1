package com.example.conn_oven_atag;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\tH\u0016J\u001c\u0010\f\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/example/conn_oven_atag/ConnOvenAtagPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "binding", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "Companion", "conn_oven_atag_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnOvenAtagPlugin.kt */
public final class ConnOvenAtagPlugin implements C8944a, C9017j.C9021c {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public C9017j channel;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo47991d2 = {"Lcom/example/conn_oven_atag/ConnOvenAtagPlugin$Companion;", "", "()V", "registerWith", "", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "conn_oven_atag_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ConnOvenAtagPlugin.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void registerWith(@NotNull C9024l.C9027c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "registrar");
            new C9017j(cVar.mo46301f(), "conn_oven_atag").mo46575e(new ConnOvenAtagPlugin());
        }
    }

    @JvmStatic
    public static final void registerWith(@NotNull C9024l.C9027c cVar) {
        Companion.registerWith(cVar);
    }

    public void onAttachedToEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "flutterPluginBinding");
        C9017j jVar = new C9017j(bVar.mo46467d().mo46371h(), "conn_oven_atag");
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
