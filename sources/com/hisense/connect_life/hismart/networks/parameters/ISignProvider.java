package com.hisense.connect_life.hismart.networks.parameters;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH&¨\u0006\n"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/ISignProvider;", "", "checkSign", "", "result", "", "signatureServerStr", "sign", "parameter", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ISignProvider.kt */
public interface ISignProvider {
    boolean checkSign(@NotNull String str, @NotNull String str2);

    @NotNull
    String sign(@NotNull Map<String, String> map);
}
