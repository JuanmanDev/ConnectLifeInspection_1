package com.hisense.connect_life.hismart.networks.request.account;

import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u0012R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/AccountManager;", "", "()V", "accountApi", "Lcom/hisense/connect_life/hismart/networks/request/account/AccountApi;", "getAccountApi", "()Lcom/hisense/connect_life/hismart/networks/request/account/AccountApi;", "accountApi$delegate", "Lkotlin/Lazy;", "accountService", "Lcom/hisense/connect_life/hismart/networks/request/account/IAccountService;", "accountUrl", "", "getAccountUrl", "()Ljava/lang/String;", "accountUrl$delegate", "signIn", "params", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AccountManager.kt */
public final class AccountManager {
    @NotNull
    public final Lazy accountApi$delegate = LazyKt__LazyJVMKt.lazy(new AccountManager$accountApi$2(this));
    @Nullable
    public IAccountService accountService;
    @NotNull
    public final Lazy accountUrl$delegate = LazyKt__LazyJVMKt.lazy(AccountManager$accountUrl$2.INSTANCE);

    /* access modifiers changed from: private */
    public final String getAccountUrl() {
        return (String) this.accountUrl$delegate.getValue();
    }

    @NotNull
    public final AccountApi getAccountApi() {
        Object value = this.accountApi$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-accountApi>(...)");
        return (AccountApi) value;
    }

    @NotNull
    public final String signIn(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "params");
        Map<String, String> createParamMap = ParameterUtils.Companion.createParamMap(map);
        return "accountUrl: " + getAccountUrl() + ", parameter: " + createParamMap;
    }
}
