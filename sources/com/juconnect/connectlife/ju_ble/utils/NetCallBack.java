package com.juconnect.connectlife.ju_ble.utils;

import com.juconnect.connectlife.ju_ble.model.ConfigWifiResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/utils/NetCallBack;", "", "onException", "", "e", "Lcom/juconnect/connectlife/ju_ble/model/ConfigWifiResult;", "onFail", "errorCode", "onSuccess", "info", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NetCallBack.kt */
public interface NetCallBack {
    void onException(@NotNull ConfigWifiResult configWifiResult);

    void onFail(@NotNull ConfigWifiResult configWifiResult);

    void onSuccess(@NotNull ConfigWifiResult configWifiResult);
}
