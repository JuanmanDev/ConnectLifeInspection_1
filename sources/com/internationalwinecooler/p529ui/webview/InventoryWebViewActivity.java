package com.internationalwinecooler.p529ui.webview;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.activity.WebConstant;
import com.hisense.juconnect.app_device.activity.WineLabelScannerActivity;
import com.hisense.juconnect.app_device.fragment.AddWineAutoManualDialog;
import com.hisense.juconnect.app_device.model.LabelScannerType;
import com.hisense.juconnect.connectlife.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p492g.C7633m;
import p040c.p482v.p483a.p492g.C7637q;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0014J\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/InventoryWebViewActivity;", "Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "()V", "targetUrl", "", "getTargetUrl", "()Ljava/lang/String;", "setTargetUrl", "(Ljava/lang/String;)V", "displayAddWineDialog", "", "getWineCoolerName", "deviceId", "gotoAddWineActivity", "initWidgets", "onPermissionsDenied", "requestCode", "", "perms", "", "onPermissionsGranted", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/inventoryWineWebView")
/* renamed from: com.internationalwinecooler.ui.webview.InventoryWebViewActivity */
/* compiled from: InventoryWebViewActivity.kt */
public final class InventoryWebViewActivity extends BaseWineWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "target_url")
    public String targetUrl;

    private final void displayAddWineDialog() {
        LoggerUtil.Companion.mo39146e("displayAddWineDialog");
        AddWineAutoManualDialog addWineAutoManualDialog = new AddWineAutoManualDialog();
        addWineAutoManualDialog.setAddWineCallback(new InventoryWebViewActivity$displayAddWineDialog$1(this));
        addWineAutoManualDialog.setManualCallback(new InventoryWebViewActivity$displayAddWineDialog$2(this));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        JuConnectExtKt.displayDialog(addWineAutoManualDialog, supportFragmentManager);
    }

    /* access modifiers changed from: private */
    public final String getWineCoolerName(String str) {
        Boolean bool;
        if (str == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(DeviceCache.Companion.getInstance().getDevice(str) == null);
        }
        if (bool.booleanValue()) {
            return getString(R.string.device_deleted);
        }
        DeviceInfo device = DeviceCache.Companion.getInstance().getDevice(str);
        if (device == null) {
            return null;
        }
        return device.getDeviceNickName();
    }

    /* access modifiers changed from: private */
    public final void gotoAddWineActivity() {
        WineLabelScannerActivity.Companion.gotoWLabScanner(this, LabelScannerType.ADD_WINE.getType());
        finish();
    }

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27210setListeners$lambda0(InventoryWebViewActivity inventoryWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(inventoryWebViewActivity, "this$0");
        inventoryWebViewActivity.displayAddWineDialog();
    }

    /* renamed from: setListeners$lambda-2  reason: not valid java name */
    public static final void m27211setListeners$lambda2(InventoryWebViewActivity inventoryWebViewActivity, Pair pair) {
        Intrinsics.checkNotNullParameter(inventoryWebViewActivity, "this$0");
        if (pair != null) {
            Job unused = BuildersKt__Builders_commonKt.launch$default(inventoryWebViewActivity, Dispatchers.getIO(), (CoroutineStart) null, new InventoryWebViewActivity$setListeners$2$1$1(pair, inventoryWebViewActivity, (Continuation<? super InventoryWebViewActivity$setListeners$2$1$1>) null), 2, (Object) null);
        }
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

    @NotNull
    public final String getTargetUrl() {
        String str = this.targetUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
        return null;
    }

    public void initWidgets() {
        super.initWidgets();
        WebConstant.Companion.setFromScan(false);
        loadUrl(getTargetUrl());
    }

    public void onPermissionsDenied(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        showString((int) R.string.pt_camera);
    }

    public void onPermissionsGranted(int i, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "perms");
        gotoAddWineActivity();
    }

    public void setListeners() {
        super.setListeners();
        getWineWebViewModel().getGoAddWinePageLiveData().observe(this, new C7633m(this));
        getWineWebViewModel().getRemoveWineSucLiveData().observe(this, new C7637q(this));
    }

    public final void setTargetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUrl = str;
    }
}
