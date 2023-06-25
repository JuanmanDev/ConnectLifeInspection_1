package com.juconnect.connectlife.ju_dist;

import com.juconnect.connectlife.ju_dist.fbean.FindModule;
import com.juconnect.connectlife.ju_dist.find.BcWifiMessage;
import com.juconnect.connectlife.ju_dist.find.FindCallBack;
import com.juconnect.connectlife.ju_dist.utils.FindUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p077d.p078a.p080j.C1564e;
import p040c.p301y.p302b.p305b.C3709c;
import p040c.p301y.p302b.p305b.C3711e;
import p040c.p301y.p302b.p305b.C3712f;
import p040c.p301y.p302b.p305b.C3714h;

@Metadata(mo47990d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0014\u0010\n\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, mo47991d2 = {"com/juconnect/connectlife/ju_dist/JuDistPlugin$findDevice$2", "Lcom/juconnect/connectlife/ju_dist/find/FindCallBack;", "onListenError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onListenSuccess", "reply", "Lcom/juconnect/connectlife/ju_dist/find/BcWifiMessage;", "onSendError", "onSendSuccess", "message", "", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuDistPlugin.kt */
public final class JuDistPlugin$findDevice$2 implements FindCallBack {
    public final /* synthetic */ JuDistPlugin this$0;

    public JuDistPlugin$findDevice$2(JuDistPlugin juDistPlugin) {
        this.this$0 = juDistPlugin;
    }

    /* renamed from: onListenError$lambda-0  reason: not valid java name */
    public static final void m26794onListenError$lambda0(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "$e");
        Intrinsics.stringPlus("ERROR：", exc.getMessage());
    }

    /* renamed from: onListenSuccess$lambda-1  reason: not valid java name */
    public static final void m26795onListenSuccess$lambda1(BcWifiMessage bcWifiMessage, JuDistPlugin juDistPlugin) {
        Intrinsics.checkNotNullParameter(bcWifiMessage, "$reply");
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        Intrinsics.stringPlus("receive wifi", bcWifiMessage.getWiFiId());
        bcWifiMessage.formatMessage();
        juDistPlugin.findDeviceSucess(new FindModule(bcWifiMessage).toJson());
        FindUtils access$getFindUtils$p = juDistPlugin.findUtils;
        if (access$getFindUtils$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("findUtils");
            access$getFindUtils$p = null;
        }
        access$getFindUtils$p.close();
    }

    /* renamed from: onSendError$lambda-2  reason: not valid java name */
    public static final void m26796onSendError$lambda2() {
    }

    /* renamed from: onSendSuccess$lambda-3  reason: not valid java name */
    public static final void m26797onSendSuccess$lambda3() {
    }

    public void onListenError(@NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, C1564e.f893u);
        this.this$0.threadUtils.mainRun(new C3711e(exc));
    }

    public void onListenSuccess(@NotNull BcWifiMessage bcWifiMessage) {
        Intrinsics.checkNotNullParameter(bcWifiMessage, "reply");
        this.this$0.threadUtils.mainRun(new C3712f(bcWifiMessage, this.this$0));
    }

    public void onSendError(@NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, C1564e.f893u);
        this.this$0.threadUtils.mainRun(C3714h.f6729e);
    }

    public void onSendSuccess(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        this.this$0.threadUtils.mainRun(C3709c.f6722e);
    }
}
