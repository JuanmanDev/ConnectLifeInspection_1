package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import android.widget.TextView;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.EventBusConstKt;
import com.hisense.connect_life.core.listener.IPredicate;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/FirmwareUpdateDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "applianceName", "", "(Ljava/lang/String;)V", "dismissCallback", "Lcom/hisense/connect_life/core/listener/IPredicate;", "getDismissCallback", "()Lcom/hisense/connect_life/core/listener/IPredicate;", "setDismissCallback", "(Lcom/hisense/connect_life/core/listener/IPredicate;)V", "bindLayout", "", "initSelecter", "", "onDestroy", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FirmwareUpdateDialog.kt */
public final class FirmwareUpdateDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public final String applianceName;
    @Nullable
    public IPredicate dismissCallback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirmwareUpdateDialog(@NotNull String str) {
        super(0, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.APPLIANCENAME);
        this.applianceName = str;
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R$layout.firmware_update_dialog_layout;
    }

    @Nullable
    public final IPredicate getDismissCallback() {
        return this.dismissCallback;
    }

    public void initSelecter() {
        setAnimResId(R$style.style_headpic_popupwindow);
        ((TextView) _$_findCachedViewById(R$id.tv_appliance_name)).setText(this.applianceName);
    }

    public void onDestroy() {
        super.onDestroy();
        IPredicate iPredicate = this.dismissCallback;
        if (iPredicate != null) {
            iPredicate.accept();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void setDismissCallback(@Nullable IPredicate iPredicate) {
        this.dismissCallback = iPredicate;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.update_close);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "update_close");
        JuConnectExtKt.singleClickListener(iconFontView, new FirmwareUpdateDialog$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.tv_firmware_update_close);
        Intrinsics.checkNotNullExpressionValue(textView, "tv_firmware_update_close");
        JuConnectExtKt.singleClickListener(textView, new FirmwareUpdateDialog$setListeners$2(this));
        View _$_findCachedViewById = _$_findCachedViewById(R$id.space_view);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "space_view");
        JuConnectExtKt.singleClickListener(_$_findCachedViewById, new FirmwareUpdateDialog$setListeners$3(this));
    }
}
