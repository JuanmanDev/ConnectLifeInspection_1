package com.hisense.connect_life.hismart.networks.request.config;

import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J7\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH&J/\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH&J/\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001d\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH&¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/config/IConfigService;", "", "cfgPars", "Lio/reactivex/disposables/Disposable;", "cmd", "Lcom/hisense/connect_life/hismart/networks/request/config/model/ConfigParsCom;", "mac", "", "hiSmartCallback", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/HiSmartCallback;", "", "Lkotlin/ExtensionFunctionType;", "getMac", "getNetStatus", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IConfigService.kt */
public interface IConfigService {
    @NotNull
    C9207b cfgPars(@NotNull ConfigParsCom configParsCom, @NotNull String str, @NotNull Function1<? super HiSmartCallback<ConfigParsCom>, Unit> function1);

    @NotNull
    C9207b getMac(@NotNull ConfigParsCom configParsCom, @NotNull Function1<? super HiSmartCallback<ConfigParsCom>, Unit> function1);

    @NotNull
    C9207b getNetStatus(@NotNull ConfigParsCom configParsCom, @NotNull Function1<? super HiSmartCallback<ConfigParsCom>, Unit> function1);
}
