package com.juconnect.connect_life;

import android.net.Network;
import android.os.Handler;
import com.hisense.connect_life.core.global.AppConfig;
import com.juconnect.connect_life.broadcast.NetMonitorListener;
import com.juconnect.connect_life.global.GeneralChannel;
import com.juconnect.connectlife.ju_dist.utils.WifiNameUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p508a.C7710b;
import p040c.p301y.p508a.C7721m;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, mo47991d2 = {"com/juconnect/connect_life/MainActivity$addNetMonitor$1", "Lcom/juconnect/connect_life/broadcast/NetMonitorListener;", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MainActivity.kt */
public final class MainActivity$addNetMonitor$1 implements NetMonitorListener {
    public final /* synthetic */ Handler $handler;
    public final /* synthetic */ MainActivity this$0;

    public MainActivity$addNetMonitor$1(MainActivity mainActivity, Handler handler) {
        this.this$0 = mainActivity;
        this.$handler = handler;
    }

    /* renamed from: onAvailable$lambda-0  reason: not valid java name */
    public static final void m27234onAvailable$lambda0(String str) {
        Intrinsics.checkNotNullParameter(str, "$netJson");
        AppConfig.Companion.setNetworkConnectStatus(true);
        C9017j methodChannel = GeneralChannel.Companion.getMethodChannel();
        if (methodChannel != null) {
            methodChannel.mo46573c("juNetworkEnableCallback", str);
        }
    }

    /* renamed from: onLost$lambda-1  reason: not valid java name */
    public static final void m27235onLost$lambda1(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "$tmp0");
        function0.invoke();
    }

    public void onAvailable(@Nullable Network network) {
        this.this$0.runOnUiThread(new C7721m(" {\"isEnable\": 0} "));
    }

    public void onLost() {
        String wifiName = WifiNameUtils.Companion.wifiName(this.this$0);
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
        String upperCase = wifiName.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = " {\"isEnable\": 1} ";
        if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "HIS-", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CONNECTLIFE", false, 2, (Object) null)) {
            objectRef.element = " {\"isEnable\": -1} ";
        }
        AppConfig.Companion.setNetworkConnectStatus(false);
        this.$handler.postDelayed(new C7710b(new MainActivity$addNetMonitor$1$onLost$runnable$1(this.this$0, objectRef)), 10000);
    }
}
