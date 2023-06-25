package com.hisense.juconnect.app_device.activity;

import com.hisense.juconnect.app_device.adapter.ManualListAdapter;
import com.juconnect.connectlife.model.ConlManual;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo47991d2 = {"com/hisense/juconnect/app_device/activity/ManualListActivity$initWidgets$2$1$onResponse$1$1", "Lcom/hisense/juconnect/app_device/adapter/ManualListAdapter$OnItemClickListener;", "onItemClick", "", "position", "", "data", "Lcom/juconnect/connectlife/model/ConlManual;", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ManualListActivity.kt */
public final class ManualListActivity$initWidgets$2$1$onResponse$1$1 implements ManualListAdapter.OnItemClickListener {
    public final /* synthetic */ ManualListActivity this$0;

    public ManualListActivity$initWidgets$2$1$onResponse$1$1(ManualListActivity manualListActivity) {
        this.this$0 = manualListActivity;
    }

    public void onItemClick(int i, @NotNull ConlManual conlManual) {
        Intrinsics.checkNotNullParameter(conlManual, "data");
        this.this$0.gotoNativeWebViewActivity(conlManual);
    }
}
