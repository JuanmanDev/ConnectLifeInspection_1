package com.hisense.connect_life.app_account;

import android.view.View;
import com.alibaba.android.arouter.facade.Postcard;
import com.hisense.connect_life.core.global.Paths;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p040c.p041a.p042a.p043a.p045b.C1337a;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: TestLoginSuccessActivity.kt */
public final class TestLoginSuccessActivity$setListeners$1 extends Lambda implements Function1<View, Unit> {
    public static final TestLoginSuccessActivity$setListeners$1 INSTANCE = new TestLoginSuccessActivity$setListeners$1();

    public TestLoginSuccessActivity$setListeners$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable View view) {
        Postcard a = C1337a.m211c().mo15011a(Paths.Account.UserProfileActivity);
        a.withString("photoUrl", "");
        a.withString("firstName", "");
        a.withString("lastName", "");
        a.navigation();
    }
}
