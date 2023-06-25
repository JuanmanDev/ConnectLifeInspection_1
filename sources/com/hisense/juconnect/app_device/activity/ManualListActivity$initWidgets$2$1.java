package com.hisense.juconnect.app_device.activity;

import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.hisense.connect_life.core.utils.DialogManager;
import com.hisense.juconnect.app_device.R$id;
import com.hisense.juconnect.app_device.adapter.ManualListAdapter;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1502i;
import p040c.p077d.p078a.p080j.C1564e;
import p040c.p429r.p460b.p461a.p462a.C7506m;

@Metadata(mo47990d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/ManualListActivity$initWidgets$2$1", "Lokhttp3/Callback;", "onFailure", "", "call", "Lokhttp3/Call;", "e", "Ljava/io/IOException;", "onResponse", "response", "Lokhttp3/Response;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ManualListActivity.kt */
public final class ManualListActivity$initWidgets$2$1 implements Callback {
    public final /* synthetic */ ManualListActivity this$0;

    public ManualListActivity$initWidgets$2$1(ManualListActivity manualListActivity) {
        this.this$0 = manualListActivity;
    }

    /* renamed from: onResponse$lambda-0  reason: not valid java name */
    public static final void m27119onResponse$lambda0(ManualListActivity manualListActivity, String str) {
        Intrinsics.checkNotNullParameter(manualListActivity, "this$0");
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = manualListActivity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.dismissDialog(supportFragmentManager, "tag_loading_aty");
        Object e = C1502i.m925e(str, new ManualListActivity$initWidgets$2$1$onResponse$1$itemType$1().getType());
        Intrinsics.checkNotNullExpressionValue(e, "fromJson(body, itemType)");
        List list = (List) e;
        if (list.isEmpty()) {
            ((TextView) manualListActivity._$_findCachedViewById(R$id.tv_empty)).setVisibility(0);
            return;
        }
        ((RecyclerView) manualListActivity._$_findCachedViewById(R$id.rv_manual)).setVisibility(0);
        ManualListAdapter manualListAdapter = new ManualListAdapter(list);
        manualListAdapter.setName(manualListActivity.getDeviceName());
        ((RecyclerView) manualListActivity._$_findCachedViewById(R$id.rv_manual)).setAdapter(manualListAdapter);
        ((RecyclerView) manualListActivity._$_findCachedViewById(R$id.rv_manual)).setLayoutManager(new LinearLayoutManager(manualListActivity.getBaseContext()));
        manualListAdapter.setOnItemClickListener(new ManualListActivity$initWidgets$2$1$onResponse$1$1(manualListActivity));
    }

    public void onFailure(@NotNull Call call, @NotNull IOException iOException) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(iOException, C1564e.f893u);
        DialogManager dialogManager = DialogManager.INSTANCE;
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        dialogManager.dismissDialog(supportFragmentManager, "tag_loading_aty");
    }

    public void onResponse(@NotNull Call call, @NotNull Response response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        ResponseBody body = response.body();
        String string = body == null ? null : body.string();
        String.valueOf(string);
        ManualListActivity manualListActivity = this.this$0;
        manualListActivity.runOnUiThread(new C7506m(manualListActivity, string));
    }
}
