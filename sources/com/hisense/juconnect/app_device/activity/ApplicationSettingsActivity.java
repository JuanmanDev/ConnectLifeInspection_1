package com.hisense.juconnect.app_device.activity;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.app_account.widget.MultiLanguageDialog;
import com.hisense.connect_life.core.base.BaseVmActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.SPManagerKt;
import com.hisense.connect_life.core.multilingual.LanguageListManager;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.connect_life.hismart.networks.request.message.JuWebSocket;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import com.hisense.juconnect.app_device.viewmodel.MessageViewModel;
import com.suke.widget.SwitchButton;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7481a;
import p040c.p429r.p460b.p461a.p462a.C7512p;
import p040c.p429r.p460b.p461a.p462a.C7514q;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/ApplicationSettingsActivity;", "Lcom/hisense/connect_life/core/base/BaseVmActivity;", "Lcom/hisense/juconnect/app_device/viewmodel/MessageViewModel;", "()V", "languageCurrentItem", "", "bindLayout", "initViewModelClz", "Ljava/lang/Class;", "initWidgets", "", "onResume", "selectLanguge", "setListeners", "subscribeObservable", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/ApplicationSettingsActivity")
/* compiled from: ApplicationSettingsActivity.kt */
public final class ApplicationSettingsActivity extends BaseVmActivity<MessageViewModel> {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int languageCurrentItem;

    /* access modifiers changed from: private */
    public final void selectLanguge() {
        int i = 0;
        for (T next : LanguageListManager.INSTANCE.getLanguageNameList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual((Object) (String) next, (Object) LanguageListManager.INSTANCE.getLanguageName())) {
                this.languageCurrentItem = i;
            }
            i = i2;
        }
        MultiLanguageDialog multiLanguageDialog = new MultiLanguageDialog(600);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(multiLanguageDialog, supportFragmentManager);
        multiLanguageDialog.setCurrentItem(this.languageCurrentItem);
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27100setListeners$lambda0(ApplicationSettingsActivity applicationSettingsActivity, SwitchButton switchButton, boolean z) {
        Intrinsics.checkNotNullParameter(applicationSettingsActivity, "this$0");
        applicationSettingsActivity.showLoading();
        if (z) {
            LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("subscribeFireBase isChecked: ", Boolean.valueOf(z)));
            ((MessageViewModel) applicationSettingsActivity.getMViewModel()).subscribeFireBase();
            return;
        }
        ((MessageViewModel) applicationSettingsActivity.getMViewModel()).unsubscribeFireBase();
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("unsubscribeFireBase isChecked: ", Boolean.valueOf(z)));
    }

    /* renamed from: subscribeObservable$lambda-2  reason: not valid java name */
    public static final void m27101subscribeObservable$lambda2(ApplicationSettingsActivity applicationSettingsActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(applicationSettingsActivity, "this$0");
        applicationSettingsActivity.hideLoading();
        if (bool.booleanValue()) {
            String string = applicationSettingsActivity.getString(R$string.success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.success)");
            applicationSettingsActivity.showString(string);
            SPManagerKt.setPushSwitch(KeyConst.KEY_PUSH_SWITCH, true);
            JuWebSocket.Companion.setPushSwitch(true);
        }
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("subscribePushLiveData pushSwitch: ", Boolean.valueOf(SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH))));
    }

    /* renamed from: subscribeObservable$lambda-3  reason: not valid java name */
    public static final void m27102subscribeObservable$lambda3(ApplicationSettingsActivity applicationSettingsActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(applicationSettingsActivity, "this$0");
        applicationSettingsActivity.hideLoading();
        if (bool.booleanValue()) {
            String string = applicationSettingsActivity.getString(R$string.success);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.success)");
            applicationSettingsActivity.showString(string);
            SPManagerKt.setPushSwitch(KeyConst.KEY_PUSH_SWITCH, false);
            JuWebSocket.Companion.setPushSwitch(false);
        }
        LogUtilsShen.Companion.mo39138e(Intrinsics.stringPlus("unsubscribeLiveData pushSwitch: ", Boolean.valueOf(SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH))));
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.activity_application_settings;
    }

    @NotNull
    public Class<MessageViewModel> initViewModelClz() {
        return MessageViewModel.class;
    }

    public void initWidgets() {
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getResources().getText(R$string.application_settings));
        ((TextView) _$_findCachedViewById(R$id.setting_language)).setText(LanguageListManager.INSTANCE.getLanguageName());
        ((SwitchButton) _$_findCachedViewById(R$id.switch_button_cloud)).setChecked(SPManagerKt.getPushSwitch(KeyConst.KEY_PUSH_SWITCH));
    }

    public void onResume() {
        super.onResume();
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } else if (((Integer) obj).intValue() == 0) {
            ((TextView) _$_findCachedViewById(R$id.inventory_mode_content)).setText(getString(R$string.inventory_type_generic));
        } else {
            ((TextView) _$_findCachedViewById(R$id.inventory_mode_content)).setText(getString(R$string.inventory_type_exact_position));
        }
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new ApplicationSettingsActivity$setListeners$1(this));
        ((SwitchButton) _$_findCachedViewById(R$id.switch_button_cloud)).setOnCheckedChangeListener(new C7512p(this));
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R$id.ll_language);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "ll_language");
        JuConnectExtKt.singleClickListener(linearLayout, new ApplicationSettingsActivity$setListeners$3(this));
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R$id.ll_about);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "ll_about");
        JuConnectExtKt.singleClickListener(linearLayout2, ApplicationSettingsActivity$setListeners$4.INSTANCE);
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R$id.inventory_mode_layout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "inventory_mode_layout");
        JuConnectExtKt.singleClickListener(relativeLayout, ApplicationSettingsActivity$setListeners$5.INSTANCE);
    }

    public void subscribeObservable() {
        super.subscribeObservable();
        ((MessageViewModel) getMViewModel()).getSubscribePushLiveData().observe(this, new C7481a(this));
        ((MessageViewModel) getMViewModel()).getUnsubscribeLiveData().observe(this, new C7514q(this));
    }
}
