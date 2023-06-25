package com.hisense.juconnect.app_device.fragment;

import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.global.Paths;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.SPUtils;
import com.hisense.juconnect.app_device.R$string;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MoreFragment.kt */
public final class MoreFragment$setListeners$6 extends Lambda implements Function1<View, Unit> {
    public final /* synthetic */ MoreFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreFragment$setListeners$6(MoreFragment moreFragment) {
        super(1);
        this.this$0 = moreFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        Object obj = SPUtils.INSTANCE.get(LanguageConstKt.f15962no, Boolean.FALSE);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        } else if (((Boolean) obj).booleanValue()) {
            Postcard a = C1337a.m211c().mo15011a(Paths.Device.FirmwareUpdateActivity);
            a.withSerializable("upgradeInfoList", new ArrayList());
            a.navigation();
        } else {
            MoreFragment moreFragment = this.this$0;
            String string = moreFragment.getString(R$string.bind_wine_cooler_first);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.bind_wine_cooler_first)");
            moreFragment.showString(string);
        }
    }
}
