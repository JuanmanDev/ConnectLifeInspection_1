package com.hisense.connect_life.core.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hisense.connect_life.core.R$layout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo47991d2 = {"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LoadingDialog.kt */
public final class LoadingDialog$view$2 extends Lambda implements Function0<View> {
    public final /* synthetic */ LoadingDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingDialog$view$2(LoadingDialog loadingDialog) {
        super(0);
        this.this$0 = loadingDialog;
    }

    public final View invoke() {
        return LayoutInflater.from(this.this$0.getActivity()).inflate(R$layout.fragment_loading_dialog, (ViewGroup) null, false);
    }
}
