package com.hisense.juconnect.app_device.fragment;

import android.content.Context;
import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.extentions.JuConnectExtKt;
import com.hisense.connect_life.core.global.HtmlPaths;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.listener.IPredicate;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.SPUtils;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddWineAutoManualDialog.kt */
public final class AddWineAutoManualDialog$setListener$3 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ AddWineAutoManualDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddWineAutoManualDialog$setListener$3(AddWineAutoManualDialog addWineAutoManualDialog) {
        super(1);
        this.this$0 = addWineAutoManualDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        String str;
        Object obj = SPUtils.INSTANCE.get(KeyConst.KEY_WINE_INVENTORY_TYPE, 0);
        if (obj != null) {
            boolean z = ((Integer) obj).intValue() == 0;
            if (this.this$0.getContext() == null) {
                str = null;
            } else {
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                str = JuConnectExtKt.buildAssetUrl(HtmlPaths.PATH_ADD_WINE2, requireContext, LanguageConstKt.f15944en, MapsKt__MapsKt.mapOf(TuplesKt.m25743to("generic", Boolean.valueOf(z)), TuplesKt.m25743to("found", Boolean.FALSE), TuplesKt.m25743to("inventoryFlag", Boolean.FALSE)));
            }
            Postcard a = C1337a.m211c().mo15011a(Paths.App.TakePhotoWebViewActivity);
            a.withString(KeyConst.KEY_TARGET_URL, str);
            a.navigation();
            IPredicate manualCallback = this.this$0.getManualCallback();
            if (manualCallback != null) {
                manualCallback.accept();
            }
            this.this$0.dismiss();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }
}
