package com.juconnect.connectlife.ju_dist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p302b.p305b.C3721o;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuDistPlugin.kt */
public final class JuDistPlugin$checkAndReconnectSocket$1 extends Lambda implements Function1<String, Unit> {
    public final /* synthetic */ JuDistPlugin this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JuDistPlugin$checkAndReconnectSocket$1(JuDistPlugin juDistPlugin) {
        super(1);
        this.this$0 = juDistPlugin;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m26793invoke$lambda0(JuDistPlugin juDistPlugin, String str) {
        Intrinsics.checkNotNullParameter(juDistPlugin, "this$0");
        C9017j channel = JuDistPlugin.Companion.getChannel();
        if (channel != null) {
            channel.mo46573c("getWiFiListCallback", juDistPlugin.getErrorJson("1103", String.valueOf(str), "1"));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable String str) {
        this.this$0.threadUtils.mainRun(new C3721o(this.this$0, str));
    }
}
