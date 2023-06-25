package com.hisense.juconnect.app_device.activity;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo47991d2 = {"<anonymous>", "Lcom/hisense/juconnect/app_device/activity/ConnectLifeViewModel;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineLabelPictureActivity.kt */
public final class WineLabelPictureActivity$connectLifeViewModel$2 extends Lambda implements Function0<ConnectLifeViewModel> {
    public final /* synthetic */ WineLabelPictureActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WineLabelPictureActivity$connectLifeViewModel$2(WineLabelPictureActivity wineLabelPictureActivity) {
        super(0);
        this.this$0 = wineLabelPictureActivity;
    }

    @NotNull
    public final ConnectLifeViewModel invoke() {
        ViewModel viewModel = ViewModelProviders.m97of((FragmentActivity) this.this$0).get(ConnectLifeViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "of(this).get(ConnectLifeViewModel::class.java)");
        return (ConnectLifeViewModel) viewModel;
    }
}
