package com.hisense.juconnect.app_device.fragment;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import com.contrarywind.view.WheelView;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.hismart.networks.request.device.model.DeviceInfo;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$style;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p464c.C7542h;

@Metadata(mo47990d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u001a\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\"\u001a\u00020\u0013H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006$"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/TicketDialog;", "Landroidx/fragment/app/DialogFragment;", "devicelist", "", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "currentItem", "", "(Ljava/util/List;I)V", "deviceInfo", "layout", "Landroid/view/View;", "list", "ticketPosition", "ticketResult", "Lcom/hisense/juconnect/app_device/fragment/TicketDialog$TicketResult;", "getDeviceNickName", "", "index", "initSelecter", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onStart", "onViewCreated", "view", "setListener", "TicketResult", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TicketDialog.kt */
public final class TicketDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    public int currentItem;
    @Nullable
    public DeviceInfo deviceInfo;
    public View layout;
    @NotNull
    public List<DeviceInfo> list;
    public int ticketPosition;
    public TicketResult ticketResult;

    @Metadata(mo47990d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/TicketDialog$TicketResult;", "", "ticketResult", "", "deviceInfo", "Lcom/hisense/connect_life/hismart/networks/request/device/model/DeviceInfo;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: TicketDialog.kt */
    public interface TicketResult {
        void ticketResult(@NotNull DeviceInfo deviceInfo);
    }

    public TicketDialog(@NotNull List<DeviceInfo> list2, int i) {
        Intrinsics.checkNotNullParameter(list2, "devicelist");
        this.list = list2;
        this.currentItem = i;
    }

    /* access modifiers changed from: private */
    public final String getDeviceNickName(int i) {
        String deviceNickName = this.list.get(i).getDeviceNickName();
        if (deviceNickName.length() <= 18) {
            return deviceNickName;
        }
        String substring = deviceNickName.substring(0, 18);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return Intrinsics.stringPlus(substring, "...");
    }

    private final void initSelecter() {
        TicketDialog$initSelecter$1 ticketDialog$initSelecter$1 = new TicketDialog$initSelecter$1(this);
        View view = this.layout;
        View view2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view = null;
        }
        ((WheelView) view.findViewById(R$id.wheelview_ticket)).setCyclic(false);
        View view3 = this.layout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view3 = null;
        }
        ((WheelView) view3.findViewById(R$id.wheelview_ticket)).setAdapter(ticketDialog$initSelecter$1);
        View view4 = this.layout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view4 = null;
        }
        ((WheelView) view4.findViewById(R$id.wheelview_ticket)).setCurrentItem(this.currentItem);
        View view5 = this.layout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
        } else {
            view2 = view5;
        }
        ((WheelView) view2.findViewById(R$id.wheelview_ticket)).setOnItemSelectedListener(new C7542h(this));
    }

    /* renamed from: initSelecter$lambda-1  reason: not valid java name */
    public static final void m27168initSelecter$lambda1(TicketDialog ticketDialog, int i) {
        Intrinsics.checkNotNullParameter(ticketDialog, "this$0");
        int i2 = 0;
        for (T next : ticketDialog.list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            DeviceInfo deviceInfo2 = (DeviceInfo) next;
            ticketDialog.ticketPosition = i;
            i2 = i3;
        }
    }

    private final void setListener() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.ticket_cancel);
        Intrinsics.checkNotNullExpressionValue(textView, "ticket_cancel");
        JuConnectExtKt.singleClickListener(textView, new TicketDialog$setListener$1(this));
        TextView textView2 = (TextView) _$_findCachedViewById(R$id.ticket_confirm);
        Intrinsics.checkNotNullExpressionValue(textView2, "ticket_confirm");
        JuConnectExtKt.singleClickListener(textView2, new TicketDialog$setListener$2(this));
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

    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.ticketResult = (TicketResult) context;
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R$layout.pop_ticket, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…ticket, container, false)");
        this.layout = inflate;
        if (inflate != null) {
            return inflate;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layout");
        return null;
    }

    public void onDestroy() {
        DeviceInfo deviceInfo2 = this.deviceInfo;
        if (deviceInfo2 != null) {
            TicketResult ticketResult2 = this.ticketResult;
            if (ticketResult2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ticketResult");
                ticketResult2 = null;
            }
            ticketResult2.ticketResult(deviceInfo2);
        }
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setWindowAnimations(R$style.animate_bottom_dialog);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            attributes.gravity = 80;
            attributes.width = -1;
            window.setAttributes(attributes);
            Context context = getContext();
            Intrinsics.checkNotNull(context);
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(context, 17170445)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        initSelecter();
        setListener();
    }
}
