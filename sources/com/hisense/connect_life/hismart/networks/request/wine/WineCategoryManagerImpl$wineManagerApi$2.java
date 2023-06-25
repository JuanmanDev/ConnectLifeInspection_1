package com.hisense.connect_life.hismart.networks.request.wine;

import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo47991d2 = {"<anonymous>", "Lcom/hisense/connect_life/hismart/networks/request/wine/WineManagerApi;", "kotlin.jvm.PlatformType", "invoke"}, mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineCategoryManagerImpl.kt */
public final class WineCategoryManagerImpl$wineManagerApi$2 extends Lambda implements Function0<WineManagerApi> {
    public static final WineCategoryManagerImpl$wineManagerApi$2 INSTANCE = new WineCategoryManagerImpl$wineManagerApi$2();

    public WineCategoryManagerImpl$wineManagerApi$2() {
        super(0);
    }

    public final WineManagerApi invoke() {
        return (WineManagerApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.WINE_MANAGER)).mo51323b(WineManagerApi.class);
    }
}
