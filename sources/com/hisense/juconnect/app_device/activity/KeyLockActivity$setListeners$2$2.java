package com.hisense.juconnect.app_device.activity;

import com.blankj.utilcode.util.ToastUtils;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.juconnect.app_device.R$string;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: KeyLockActivity.kt */
public final class KeyLockActivity$setListeners$2$2 extends Lambda implements Function1<Throwable, Unit> {
    public final /* synthetic */ KeyLockActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyLockActivity$setListeners$2$2(KeyLockActivity keyLockActivity) {
        super(1);
        this.this$0 = keyLockActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
        this.this$0.dismissProgressDialog();
        ToastUtils.m9582A(this.this$0.getString(R$string.fail), new Object[0]);
    }
}
