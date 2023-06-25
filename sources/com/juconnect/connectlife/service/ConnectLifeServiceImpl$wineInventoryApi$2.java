package com.juconnect.connectlife.service;

import com.juconnect.connectlife.api.WineInventoryApi;
import com.juconnect.connectlife.global.UrlConstKt;
import com.juconnect.connectlife.retrofit.RetrofitUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo47991d2 = {"<anonymous>", "Lcom/juconnect/connectlife/api/WineInventoryApi;", "kotlin.jvm.PlatformType", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConnectLifeServiceImpl.kt */
public final class ConnectLifeServiceImpl$wineInventoryApi$2 extends Lambda implements Function0<WineInventoryApi> {
    public static final ConnectLifeServiceImpl$wineInventoryApi$2 INSTANCE = new ConnectLifeServiceImpl$wineInventoryApi$2();

    public ConnectLifeServiceImpl$wineInventoryApi$2() {
        super(0);
    }

    public final WineInventoryApi invoke() {
        return (WineInventoryApi) RetrofitUtils.INSTANCE.getRetrofit(UrlConstKt.getURL_CONNECT_LIFE()).mo51323b(WineInventoryApi.class);
    }
}
