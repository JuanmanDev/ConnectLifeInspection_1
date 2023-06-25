package com.internationalwinecooler.p529ui.webview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.activity.WebConstant;
import com.hisense.juconnect.connectlife.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p482v.p483a.p492g.C7624d;
import p040c.p482v.p483a.p492g.C7634n;

@Metadata(mo47990d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u001b"}, mo47991d2 = {"Lcom/internationalwinecooler/ui/webview/AddWineWebViewActivity;", "Lcom/internationalwinecooler/ui/webview/BaseWineWebViewActivity;", "()V", "cId", "", "getCId", "()Ljava/lang/String;", "setCId", "(Ljava/lang/String;)V", "pathImage", "getPathImage", "setPathImage", "targetUrl", "getTargetUrl", "setTargetUrl", "getBitmapImage", "Landroid/graphics/Bitmap;", "getWineCoolerName", "deviceId", "handleImage", "", "handleNotification", "count", "", "nameNot", "initWidgets", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/app/addWineWebViewActivity")
/* renamed from: com.internationalwinecooler.ui.webview.AddWineWebViewActivity */
/* compiled from: AddWineWebViewActivity.kt */
public class AddWineWebViewActivity extends BaseWineWebViewActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "catory_id_")
    public String cId;
    @Autowired(name = "key_image_path")
    public String pathImage;
    @Autowired(name = "target_url")
    public String targetUrl;

    private final Bitmap getBitmapImage() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 8;
        Bitmap decodeFile = BitmapFactory.decodeFile(getPathImage(), options);
        Intrinsics.checkNotNullExpressionValue(decodeFile, "decodeFile(pathImage, options)");
        return decodeFile;
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

    private final void handleImage() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new AddWineWebViewActivity$handleImage$1(this, (Continuation<? super AddWineWebViewActivity$handleImage$1>) null), 2, (Object) null);
    }

    private final void handleNotification(String str, int i, String str2) {
        Job unused = BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), (CoroutineStart) null, new AddWineWebViewActivity$handleNotification$1(i, this, str, str2, (Continuation<? super AddWineWebViewActivity$handleNotification$1>) null), 2, (Object) null);
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27203setListeners$lambda1(AddWineWebViewActivity addWineWebViewActivity, Boolean bool) {
        Intrinsics.checkNotNullParameter(addWineWebViewActivity, "this$0");
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                addWineWebViewActivity.handleImage();
            }
            addWineWebViewActivity.getWineWebViewModel().getCompressImageLiveData().setValue(null);
        }
    }

    /* renamed from: setListeners$lambda-3  reason: not valid java name */
    public static final void m27204setListeners$lambda3(AddWineWebViewActivity addWineWebViewActivity, Triple triple) {
        Intrinsics.checkNotNullParameter(addWineWebViewActivity, "this$0");
        if (triple != null) {
            addWineWebViewActivity.handleNotification((String) triple.component1(), ((Number) triple.component2()).intValue(), (String) triple.component3());
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
    public final String getCId() {
        String str = this.cId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cId");
        return null;
    }

    @NotNull
    public final String getPathImage() {
        String str = this.pathImage;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pathImage");
        return null;
    }

    @NotNull
    public String getTargetUrl() {
        String str = this.targetUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
        return null;
    }

    public void initWidgets() {
        super.initWidgets();
        if (StringsKt__StringsKt.contains$default((CharSequence) getTargetUrl(), (CharSequence) "found=true", false, 2, (Object) null)) {
            WebConstant.Companion.setFromScan(true);
            WebConstant.Companion.setViviidCaid(getCId());
        } else {
            WebConstant.Companion.setFromScan(false);
        }
        loadUrl(getTargetUrl());
    }

    public final void setCId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cId = str;
    }

    public void setListeners() {
        super.setListeners();
        getWineWebViewModel().getCompressImageLiveData().observe(this, new C7624d(this));
        getWineWebViewModel().getAddWineSucLiveData().observe(this, new C7634n(this));
    }

    public final void setPathImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pathImage = str;
    }

    public void setTargetUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.targetUrl = str;
    }
}
