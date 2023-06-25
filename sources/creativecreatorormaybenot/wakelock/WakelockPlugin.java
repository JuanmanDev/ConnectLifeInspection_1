package creativecreatorormaybenot.wakelock;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

@Metadata(mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0012\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo47991d2 = {"Lcreativecreatorormaybenot/wakelock/WakelockPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "()V", "channel", "Lio/flutter/plugin/common/MethodChannel;", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "wakelock", "Lcreativecreatorormaybenot/wakelock/Wakelock;", "onAttachedToActivity", "", "binding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToEngine", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromActivity", "onDetachedFromActivityForConfigChanges", "onDetachedFromEngine", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "onReattachedToActivityForConfigChanges", "Companion", "wakelock_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WakelockPlugin.kt */
public final class WakelockPlugin implements C8944a, C9017j.C9021c, C8948a {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public C9017j channel;
    @Nullable
    public C9024l.C9027c registrar;
    @Nullable
    public Wakelock wakelock;

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo47991d2 = {"Lcreativecreatorormaybenot/wakelock/WakelockPlugin$Companion;", "", "()V", "registerWith", "", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "wakelock_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: WakelockPlugin.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void registerWith(@NotNull C9024l.C9027c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "registrar");
            C9017j jVar = new C9017j(cVar.mo46301f(), "wakelock");
            WakelockPlugin wakelockPlugin = new WakelockPlugin();
            wakelockPlugin.registrar = cVar;
            wakelockPlugin.wakelock = new Wakelock();
            jVar.mo46575e(wakelockPlugin);
        }
    }

    @JvmStatic
    public static final void registerWith(@NotNull C9024l.C9027c cVar) {
        Companion.registerWith(cVar);
    }

    public void onAttachedToActivity(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
        Wakelock wakelock2 = this.wakelock;
        if (wakelock2 != null) {
            wakelock2.setActivity(cVar.mo46419d());
        }
    }

    public void onAttachedToEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "flutterPluginBinding");
        C9017j jVar = new C9017j(bVar.mo46465b(), "wakelock");
        this.channel = jVar;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            jVar = null;
        }
        jVar.mo46575e(this);
        this.wakelock = new Wakelock();
    }

    public void onDetachedFromActivity() {
        Wakelock wakelock2 = this.wakelock;
        if (wakelock2 != null) {
            wakelock2.setActivity((Activity) null);
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "binding");
        C9017j jVar = this.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            jVar = null;
        }
        jVar.mo46575e((C9017j.C9021c) null);
        this.wakelock = null;
        this.registrar = null;
    }

    public void onMethodCall(@NotNull @NonNull C9016i iVar, @NotNull @NonNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        if (this.registrar != null) {
            Wakelock wakelock2 = this.wakelock;
            Intrinsics.checkNotNull(wakelock2);
            C9024l.C9027c cVar = this.registrar;
            Intrinsics.checkNotNull(cVar);
            wakelock2.setActivity(cVar.mo46299d());
        }
        String str = iVar.f17687a;
        if (Intrinsics.areEqual((Object) str, (Object) "toggle")) {
            Wakelock wakelock3 = this.wakelock;
            Intrinsics.checkNotNull(wakelock3);
            Object a = iVar.mo46571a("enable");
            Intrinsics.checkNotNull(a);
            Intrinsics.checkNotNullExpressionValue(a, "call.argument<Boolean>(\"enable\")!!");
            wakelock3.toggle(((Boolean) a).booleanValue(), dVar);
        } else if (Intrinsics.areEqual((Object) str, (Object) "isEnabled")) {
            Wakelock wakelock4 = this.wakelock;
            Intrinsics.checkNotNull(wakelock4);
            wakelock4.isEnabled(dVar);
        } else {
            dVar.notImplemented();
        }
        if (this.registrar != null) {
            Wakelock wakelock5 = this.wakelock;
            Intrinsics.checkNotNull(wakelock5);
            wakelock5.setActivity((Activity) null);
        }
    }

    public void onReattachedToActivityForConfigChanges(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
        onAttachedToActivity(cVar);
    }
}
