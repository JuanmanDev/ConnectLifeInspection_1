package com.internationalwinecooler;

import android.view.View;
import android.widget.TextView;
import com.hisense.connect_life.core.base.BaseDialogFragment;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.connectlife.R;
import com.juconnect.connect_life.R$id;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\b"}, mo47991d2 = {"Lcom/internationalwinecooler/NoApplianceDialog;", "Lcom/hisense/connect_life/core/base/BaseDialogFragment;", "()V", "bindLayout", "", "initSelecter", "", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NoApplianceDialog.kt */
public final class NoApplianceDialog extends BaseDialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    public NoApplianceDialog() {
        super(0, 1, (DefaultConstructorMarker) null);
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
        return R.layout.pop_no_appliance;
    }

    public void initSelecter() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.no_appliance_close);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "no_appliance_close");
        JuConnectExtKt.singleClickListener(iconFontView, new NoApplianceDialog$setListeners$1(this));
        TextView textView = (TextView) _$_findCachedViewById(R$id.no_appliance_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "no_appliance_cancel");
        JuConnectExtKt.singleClickListener(textView, new NoApplianceDialog$setListeners$2(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.no_appliance_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "no_appliance_confirm");
        JuConnectExtKt.singleClickListener(textView2, new NoApplianceDialog$setListeners$3(this));
    }
}
