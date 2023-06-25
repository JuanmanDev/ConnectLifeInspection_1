package com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p570e.p575e.C9057g;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u001a"}, mo47991d2 = {"Lcom/hisense/juconnect/connectLife/conn_qr_code_scanner/conn_qr_code_scanner/ConnQrCodeScannerPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "()V", "onAttachedToActivity", "", "activityPluginBinding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToEngine", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onAttachedToEngines", "platformViewRegistry", "Lio/flutter/plugin/platform/PlatformViewRegistry;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "activity", "Landroid/app/Activity;", "onAttachedToV1", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "onDetachedFromActivity", "onDetachedFromActivityForConfigChanges", "onDetachedFromEngine", "onReattachedToActivityForConfigChanges", "Companion", "conn_qr_code_scanner_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnQrCodeScannerPlugin.kt */
public final class ConnQrCodeScannerPlugin implements C8944a, C8948a {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/juconnect/connectLife/conn_qr_code_scanner/conn_qr_code_scanner/ConnQrCodeScannerPlugin$Companion;", "", "()V", "registerWith", "", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "conn_qr_code_scanner_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ConnQrCodeScannerPlugin.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void registerWith(@NotNull C9024l.C9027c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "registrar");
            new ConnQrCodeScannerPlugin().onAttachedToV1(cVar);
        }
    }

    private final void onAttachedToEngines(C9057g gVar, C9003c cVar, Activity activity) {
        if (activity != null) {
            Shared.INSTANCE.setActivity(activity);
        }
        gVar.mo46682a("conn_qr_code_scanner", new HisenseQRViewFactory(cVar));
    }

    /* access modifiers changed from: private */
    public final void onAttachedToV1(C9024l.C9027c cVar) {
        Shared.INSTANCE.setRegistrar(cVar);
        C9057g g = cVar.mo46302g();
        Intrinsics.checkNotNullExpressionValue(g, "registrar.platformViewRegistry()");
        C9003c f = cVar.mo46301f();
        Intrinsics.checkNotNullExpressionValue(f, "registrar.messenger()");
        onAttachedToEngines(g, f, cVar.mo46299d());
    }

    @JvmStatic
    public static final void registerWith(@NotNull C9024l.C9027c cVar) {
        Companion.registerWith(cVar);
    }

    public void onAttachedToActivity(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "activityPluginBinding");
        Shared.INSTANCE.setActivity(cVar.mo46419d());
        Shared.INSTANCE.setBinding(cVar);
    }

    public void onAttachedToEngine(@NotNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "binding");
        C9057g e = bVar.mo46468e();
        Intrinsics.checkNotNullExpressionValue(e, "binding.platformViewRegistry");
        C9003c b = bVar.mo46465b();
        Intrinsics.checkNotNullExpressionValue(b, "binding.binaryMessenger");
        onAttachedToEngines(e, b, Shared.INSTANCE.getActivity());
    }

    public void onDetachedFromActivity() {
        Shared.INSTANCE.setActivity((Activity) null);
        Shared.INSTANCE.setBinding((C8950c) null);
    }

    public void onDetachedFromActivityForConfigChanges() {
        Shared.INSTANCE.setActivity((Activity) null);
        Shared.INSTANCE.setBinding((C8950c) null);
    }

    public void onDetachedFromEngine(@NotNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "binding");
    }

    public void onReattachedToActivityForConfigChanges(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "activityPluginBinding");
        Shared.INSTANCE.setActivity(cVar.mo46419d());
        Shared.INSTANCE.setBinding(cVar);
    }
}
