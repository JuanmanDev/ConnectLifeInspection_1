package com.juconnect.connect_life.util;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "result", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WifiConnectUtils.kt */
public final class WifiConnectUtils$connectWifi$2 extends Lambda implements Function1<String, Unit> {
    public final /* synthetic */ WifiConnectUtils this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WifiConnectUtils$connectWifi$2(WifiConnectUtils wifiConnectUtils) {
        super(1);
        this.this$0 = wifiConnectUtils;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_RESULT);
        this.this$0.getTAG();
        Intrinsics.stringPlus("连接wifi结果", str);
        Function1<String, Unit> listen = this.this$0.getListen();
        if (listen != null) {
            listen.invoke(str);
        }
    }
}
