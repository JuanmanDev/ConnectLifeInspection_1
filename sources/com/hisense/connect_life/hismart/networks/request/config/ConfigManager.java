package com.hisense.connect_life.hismart.networks.request.config;

import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0012R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/config/ConfigManager;", "", "()V", "accountApi", "Lcom/hisense/connect_life/hismart/networks/request/config/JuConfigApi;", "getAccountApi", "()Lcom/hisense/connect_life/hismart/networks/request/config/JuConfigApi;", "accountApi$delegate", "Lkotlin/Lazy;", "accountUrl", "", "getAccountUrl", "()Ljava/lang/String;", "accountUrl$delegate", "configService", "Lcom/hisense/connect_life/hismart/networks/request/config/IConfigService;", "signIn", "params", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigManager.kt */
public final class ConfigManager {
    @NotNull
    public final Lazy accountApi$delegate = LazyKt__LazyJVMKt.lazy(new ConfigManager$accountApi$2(this));
    @NotNull
    public final Lazy accountUrl$delegate = LazyKt__LazyJVMKt.lazy(ConfigManager$accountUrl$2.INSTANCE);
    @Nullable
    public IConfigService configService;

    /* access modifiers changed from: private */
    public final String getAccountUrl() {
        return (String) this.accountUrl$delegate.getValue();
    }

    @NotNull
    public final JuConfigApi getAccountApi() {
        Object value = this.accountApi$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-accountApi>(...)");
        return (JuConfigApi) value;
    }

    @NotNull
    public final String signIn(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "params");
        Map<String, String> createParamMap = ParameterUtils.Companion.createParamMap(map);
        return "accountUrl: " + getAccountUrl() + ", parameter: " + createParamMap;
    }
}
