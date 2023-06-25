package com.hisense.connect_life.hismart.networks.request.account;

import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p692o.C9855b;
import p692o.p698x.C9945a;
import p692o.p698x.C9958n;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/account/AccountApi;", "", "getAuthCode", "Lretrofit2/Call;", "", "body", "Lokhttp3/RequestBody;", "register", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AccountApi.kt */
public interface AccountApi {
    @NotNull
    @C9958n("/account/acc/get_mailbox_code")
    C9855b<String> getAuthCode(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/account/acc/mailbox_regist")
    C9855b<String> register(@NotNull @C9945a RequestBody requestBody);
}
