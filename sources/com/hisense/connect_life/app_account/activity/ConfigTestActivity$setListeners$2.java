package com.hisense.connect_life.app_account.activity;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.hisense.connect_life.app_account.R$id;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigTestActivity.kt */
public final class ConfigTestActivity$setListeners$2 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ ConfigTestActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigTestActivity$setListeners$2(ConfigTestActivity configTestActivity) {
        super(1);
        this.this$0 = configTestActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("set");
        arrayList2.add("wlan");
        arrayList2.add("state");
        arrayList2.add("sta");
        arrayList2.add(DebugKt.DEBUG_PROPERTY_VALUE_ON);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("set");
        arrayList3.add("wlan");
        arrayList3.add("cfg");
        arrayList3.add("sta");
        arrayList3.add(((EditText) this.this$0._$_findCachedViewById(R$id.etOne)).getText().toString());
        arrayList3.add(((EditText) this.this$0._$_findCachedViewById(R$id.etTwo)).getText().toString());
        arrayList3.add("4");
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("set");
        arrayList4.add("net");
        arrayList4.add("cfg");
        arrayList4.add("sta");
        arrayList4.add(DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
        arrayList4.add("0.0.0.0");
        arrayList4.add("0.0.0.0");
        arrayList4.add("0.0.0.0");
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add("set");
        arrayList5.add("net");
        arrayList5.add("dnsserv");
        arrayList5.add("sta");
        arrayList5.add("0");
        arrayList5.add("0.0.0.0");
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(arrayList4);
        arrayList.add(arrayList5);
        ConfigParsCom configParsCom = new ConfigParsCom(arrayList, "cfgpars.json");
        this.this$0.showLoading();
        if (((CheckBox) this.this$0._$_findCachedViewById(R$id.checkbox)).isChecked()) {
            ConfigTestActivity configTestActivity = this.this$0;
            String upperCase = configTestActivity.getMConfigMac().toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
            configTestActivity.setMConfigMac(StringsKt__StringsJVMKt.replace$default(upperCase, " ", "", false, 4, (Object) null));
        }
        ConfigTestActivity.access$getMViewModel(this.this$0).cfgPars(configParsCom, this.this$0.getMConfigMac());
    }
}
