package com.hisense.connect_life.hismart.networks.parameters;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\nH\u0016¨\u0006\u000b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/RsaSignProvider;", "Lcom/hisense/connect_life/hismart/networks/parameters/ISignProvider;", "()V", "checkSign", "", "result", "", "signatureServerStr", "sign", "parameter", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: RsaSignProvider.kt */
public final class RsaSignProvider implements ISignProvider {
    public boolean checkSign(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, BundleJUnitUtils.KEY_RESULT);
        Intrinsics.checkNotNullParameter(str2, "signatureServerStr");
        return RsaSignUtil.Companion.checkSignForServer(str2, str);
    }

    @NotNull
    public String sign(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "parameter");
        return RsaSignUtil.Companion.obtainSign(map);
    }
}
