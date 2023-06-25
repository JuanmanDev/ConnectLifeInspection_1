package com.juconnect.connect_life;

import com.hisense.connect_life.core.global.AppConfig;
import com.juconnect.connect_life.global.GeneralChannel;
import com.juconnect.connectlife.ju_dist.utils.WifiNameUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import p040c.p301y.p508a.C7713e;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$addNetMonitor$1$onLost$runnable$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ Ref.ObjectRef<String> $netJson;
    public final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainActivity$addNetMonitor$1$onLost$runnable$1(MainActivity mainActivity, Ref.ObjectRef<String> objectRef) {
        super(0);
        this.this$0 = mainActivity;
        this.$netJson = objectRef;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m27236invoke$lambda0(MainActivity mainActivity, Ref.ObjectRef objectRef) {
        C9017j methodChannel;
        Intrinsics.checkNotNullParameter(mainActivity, "this$0");
        Intrinsics.checkNotNullParameter(objectRef, "$netJson");
        String wifiName = WifiNameUtils.Companion.wifiName(mainActivity);
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = wifiName.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (!StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "HIS-", false, 2, (Object) null) && !StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CONNECTLIFE", false, 2, (Object) null) && !AppConfig.Companion.getNetworkConnectStatus() && (methodChannel = GeneralChannel.Companion.getMethodChannel()) != null) {
            methodChannel.mo46573c("juNetworkEnableCallback", objectRef.element);
        }
    }

    public final void invoke() {
        MainActivity mainActivity = this.this$0;
        mainActivity.runOnUiThread(new C7713e(mainActivity, this.$netJson));
    }
}
