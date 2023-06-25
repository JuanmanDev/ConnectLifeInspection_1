package com.hisense.juconnect.app_device.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompatJellybean;
import androidx.test.internal.runner.RunnerArgs;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.widget.IconFontView;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.R$layout;
import com.hisense.juconnect.app_device.R$string;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p460b.p461a.p462a.C7527w0;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/activity/TicketDetailActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "bindLayout", "", "getRepairDate", "", "dateString", "initWidgets", "", "setListeners", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Route(path = "/device/TicketDetailActivity")
/* compiled from: TicketDetailActivity.kt */
public final class TicketDetailActivity extends BaseActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Autowired(name = "ticket_detail")
    public Bundle bundle;

    private final String getRepairDate(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String substring = str.substring(0, 10);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String format = new SimpleDateFormat("dd/MM/yyyy").format(simpleDateFormat.parse(substring));
        Intrinsics.checkNotNullExpressionValue(format, "format2.format(date)");
        return format;
    }

    /* renamed from: initWidgets$lambda-0  reason: not valid java name */
    public static final void m27140initWidgets$lambda0(TicketDetailActivity ticketDetailActivity, View view) {
        Intrinsics.checkNotNullParameter(ticketDetailActivity, "this$0");
        ticketDetailActivity.finish();
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
        return R$layout.activity_ticket_detail;
    }

    @NotNull
    public final Bundle getBundle() {
        Bundle bundle2 = this.bundle;
        if (bundle2 != null) {
            return bundle2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("bundle");
        return null;
    }

    public void initWidgets() {
        String str;
        ((IconFontView) _$_findCachedViewById(R$id.top_back)).setText(getString(R$string.btn_main_close));
        ((TextView) _$_findCachedViewById(R$id.top_title)).setText(getString(R$string.service_tickets));
        ((TextView) _$_findCachedViewById(R$id.add_ticket_confirm)).setOnClickListener(new C7527w0(this));
        if (getBundle().get("claim_id") != null) {
            ((TextView) _$_findCachedViewById(R$id.ticket_number)).setText(Intrinsics.stringPlus(": ", getBundle().get("claim_id")));
        }
        if (getBundle().get(NotificationCompatJellybean.KEY_TITLE) != null) {
            ((TextView) _$_findCachedViewById(R$id.ticket_option)).setText(String.valueOf(getBundle().get(NotificationCompatJellybean.KEY_TITLE)));
        }
        if (getBundle().get(BundleJUnitUtils.KEY_DESCRIPTION) != null) {
            ((TextView) _$_findCachedViewById(R$id.ticket_issue)).setText(String.valueOf(getBundle().get(BundleJUnitUtils.KEY_DESCRIPTION)));
        }
        if (getBundle().get("deviceName") == null || TextUtils.isEmpty(String.valueOf(getBundle().get("deviceName")))) {
            if (getBundle().get("deviceId") != null) {
                ((TextView) _$_findCachedViewById(R$id.ticket_name)).setText(String.valueOf(getBundle().get("deviceId")));
            }
        } else if (getBundle().get("deviceName") != null) {
            ((TextView) _$_findCachedViewById(R$id.ticket_name)).setText(String.valueOf(getBundle().get("deviceName")));
        }
        Object obj = getBundle().get("service_order_id");
        String str2 = null;
        String obj2 = obj == null ? null : obj.toString();
        Object obj3 = getBundle().get("sag_claim_id");
        String obj4 = obj3 == null ? null : obj3.toString();
        Object obj5 = getBundle().get("dateClaim");
        String obj6 = obj5 == null ? null : obj5.toString();
        Object obj7 = getBundle().get("dateRepair");
        if (obj7 != null) {
            str2 = obj7.toString();
        }
        TextView textView = (TextView) _$_findCachedViewById(R$id.ticket_status);
        if (Intrinsics.areEqual(getBundle().get(NotificationCompat.CATEGORY_STATUS), (Object) KeyConst.CLAIM_FINISHED)) {
            str = Intrinsics.stringPlus(": ", getRepairDate(str2 == null ? "" : str2));
        } else {
            str = ": PENDING";
        }
        textView.setText(str);
        if (TextUtils.isEmpty(obj2)) {
            ((LinearLayout) _$_findCachedViewById(R$id.service_order_id_layout)).setVisibility(8);
        } else {
            ((LinearLayout) _$_findCachedViewById(R$id.service_order_id_layout)).setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.service_order_id_text)).setText(Intrinsics.stringPlus(": ", obj2));
        }
        if (TextUtils.isEmpty(obj4)) {
            ((LinearLayout) _$_findCachedViewById(R$id.claim_id_layout)).setVisibility(8);
        } else {
            ((LinearLayout) _$_findCachedViewById(R$id.claim_id_layout)).setVisibility(0);
            ((TextView) _$_findCachedViewById(R$id.claim_id_text)).setText(Intrinsics.stringPlus(": ", obj4));
        }
        if (!TextUtils.isEmpty(obj6)) {
            Intrinsics.checkNotNull(obj6);
            ((TextView) _$_findCachedViewById(R$id.ticket_opened_time)).setText(Intrinsics.stringPlus(": ", getRepairDate(obj6)));
        }
        if (TextUtils.isEmpty(str2)) {
            ((TextView) _$_findCachedViewById(R$id.ticket_closed_time)).setText(RunnerArgs.CLASSPATH_SEPARATOR);
            return;
        }
        Intrinsics.checkNotNull(str2);
        ((TextView) _$_findCachedViewById(R$id.ticket_closed_time)).setText(Intrinsics.stringPlus(": ", getRepairDate(str2)));
    }

    public final void setBundle(@NotNull Bundle bundle2) {
        Intrinsics.checkNotNullParameter(bundle2, "<set-?>");
        this.bundle = bundle2;
    }

    public void setListeners() {
        IconFontView iconFontView = (IconFontView) _$_findCachedViewById(R$id.top_back);
        Intrinsics.checkNotNullExpressionValue(iconFontView, "top_back");
        JuConnectExtKt.singleClickListener(iconFontView, new TicketDetailActivity$setListeners$1(this));
    }
}
