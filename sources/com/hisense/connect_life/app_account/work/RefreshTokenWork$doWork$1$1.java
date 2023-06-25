package com.hisense.connect_life.app_account.work;

import com.hisense.connect_life.app_account.util.AccountUtils;
import com.hisense.connect_life.core.global.AccountConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.account.model.LoginInfo;
import com.hisense.connect_life.hismart.networks.request.device.model.ClientLoginInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, mo47991d2 = {"<anonymous>", "", "Lcom/hisense/connect_life/hismart/HiSmartCallback;", "Lcom/hisense/connect_life/hismart/networks/request/device/model/ClientLoginInfo;", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RefreshTokenWork.kt */
public final class RefreshTokenWork$doWork$1$1 extends Lambda implements Function1<HiSmartCallback<ClientLoginInfo>, Unit> {
    public final /* synthetic */ LoginInfo $loginInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshTokenWork$doWork$1$1(LoginInfo loginInfo) {
        super(1);
        this.$loginInfo = loginInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((HiSmartCallback<ClientLoginInfo>) (HiSmartCallback) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull HiSmartCallback<ClientLoginInfo> hiSmartCallback) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$this$refreshToken");
        final LoginInfo loginInfo = this.$loginInfo;
        hiSmartCallback.success(new Function1<ClientLoginInfo, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ClientLoginInfo) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ClientLoginInfo clientLoginInfo) {
                Intrinsics.checkNotNullParameter(clientLoginInfo, LanguageConstKt.f15954it);
                AccountUtils.Companion.cacheLoginInfo(clientLoginInfo, loginInfo.getPassword(), loginInfo.getEmail(), loginInfo.getLoginSource(), loginInfo.getThirdPlatformId());
                AccountConst.Companion.setJhkToken(clientLoginInfo.getAccessToken());
                AccountUtils.Companion.updateRefreshToken(clientLoginInfo.getRefreshToken(), clientLoginInfo.getCustomerId());
            }
        });
        hiSmartCallback.failure(C85682.INSTANCE);
    }
}
