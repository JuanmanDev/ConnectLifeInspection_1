package com.hisense.connect_life.app_account.work;

import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LoggerUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "it", "", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UserProfileWork.kt */
public final class UserProfileWork$doWork$2 extends Lambda implements Function1<Throwable, Unit> {
    public static final UserProfileWork$doWork$2 INSTANCE = new UserProfileWork$doWork$2();

    public UserProfileWork$doWork$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, LanguageConstKt.f15954it);
        LoggerUtil.Companion.mo39146e(Intrinsics.stringPlus("UserProfileWork getUserProfile failure: ", th));
    }
}
