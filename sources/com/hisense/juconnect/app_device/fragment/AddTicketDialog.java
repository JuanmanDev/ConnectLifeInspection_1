package com.hisense.juconnect.app_device.fragment;

import android.app.Dialog;
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
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$style;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;
import p040c.p429r.p460b.p461a.p464c.C7535a;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u001e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/fragment/AddTicketDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "firstName", "", "lastName", "photoUrl", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onViewCreated", "view", "setListener", "setMessage", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddTicketDialog.kt */
public final class AddTicketDialog extends DialogFragment {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @NotNull
    public String firstName = "";
    @NotNull
    public String lastName = "";
    @NotNull
    public String photoUrl = "";

    private final void setListener() {
        TextView textView = (TextView) _$_findCachedViewById(R$id.close_text);
        Intrinsics.checkNotNullExpressionValue(textView, "close_text");
        JuConnectExtKt.singleClickListener(textView, new AddTicketDialog$setListener$1(this));
        ((TextView) _$_findCachedViewById(R$id.goto_text)).setOnClickListener(new C7535a(this));
    }

    /* renamed from: setListener$lambda-1  reason: not valid java name */
    public static final void m27147setListener$lambda1(AddTicketDialog addTicketDialog, View view) {
        Intrinsics.checkNotNullParameter(addTicketDialog, "this$0");
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.UserProfileActivity);
        a.withString("photoUrl", addTicketDialog.photoUrl);
        a.withString("firstName", addTicketDialog.firstName);
        a.withString("lastName", addTicketDialog.lastName);
        a.withBoolean("isShowAddressRequiredInputSign", true);
        a.navigation();
        addTicketDialog.dismiss();
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

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R$layout.fragment_add_ticket_dialog, viewGroup, false);
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
            window.setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(requireContext(), 17170445)));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        setListener();
    }

    public final void setMessage(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "photoUrl");
        Intrinsics.checkNotNullParameter(str2, "firstName");
        Intrinsics.checkNotNullParameter(str3, "lastName");
        this.firstName = str2;
        this.photoUrl = str;
        this.lastName = str3;
    }
}
