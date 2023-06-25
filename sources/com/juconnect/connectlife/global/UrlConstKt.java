package com.juconnect.connectlife.global;

import com.juconnect.connectlife.ConnectLife;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u0011\u0010\f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u000e\u0010\u000f\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"ACTION_FAVORITE_PUT", "", "ACTION_GET_MANUAL", "ACTION_INVENTORY_DEL", "ACTION_INVENTORY_DEL_BULK", "ACTION_INVENTORY_POST", "ACTION_INVENTORY_PUT", "ACTION_INVENTORY_QUERY", "ACTION_LAST_CHANGE", "ACTION_SUPPORT_TICKET", "ACTION_UPDATE_INVENTORY_IMAGE", "ACTION_VIVINO_LOG", "URL_CONNECT_LIFE", "getURL_CONNECT_LIFE", "()Ljava/lang/String;", "URL_CONNECT_LIFE_OAUTH", "URL_CONNECT_LIFE_TOKEN", "VERSION_CONNECT_LIFE_API", "connectlife_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UrlConst.kt */
public final class UrlConstKt {
    @NotNull
    public static final String ACTION_FAVORITE_PUT = "/api/v{version}/wine-cooler/inventory/favorite/bulk";
    @NotNull
    public static final String ACTION_GET_MANUAL = "/api/v1/manuals/{auids}/{lang}";
    @NotNull
    public static final String ACTION_INVENTORY_DEL = "/api/v{version}/wine-cooler/inventory/{inventoryID}";
    @NotNull
    public static final String ACTION_INVENTORY_DEL_BULK = "/api/v{version}/wine-cooler/inventory/delete/bulk";
    @NotNull
    public static final String ACTION_INVENTORY_POST = "/api/v{version}/wine-cooler/inventory/bulk";
    @NotNull
    public static final String ACTION_INVENTORY_PUT = "/api/v{version}/wine-cooler/inventory/bulk";
    @NotNull
    public static final String ACTION_INVENTORY_QUERY = "/api/v{version}/wine-cooler/inventory";
    @NotNull
    public static final String ACTION_LAST_CHANGE = "/api/v{version}/wine-cooler/inventory/lastchange";
    @NotNull
    public static final String ACTION_SUPPORT_TICKET = "/api/v{version}/ticket";
    @NotNull
    public static final String ACTION_UPDATE_INVENTORY_IMAGE = "/api/v{version}/wine-cooler/inventory/{inventoryID}/image";
    @NotNull
    public static final String ACTION_VIVINO_LOG = "/api/v{version}/wine-cooler/vivino/log";
    @NotNull
    public static final String URL_CONNECT_LIFE = (Intrinsics.areEqual((Object) ConnectLife.Companion.getEnv$connectlife_release(), (Object) "testing") ? "https://api-test.connectlife.io" : "https://clife-api.juhaolian.cn");
    @NotNull
    public static final String URL_CONNECT_LIFE_OAUTH = "https://ggda-hybris-oidc-proxy.azurewebsites.net//connect/authorize";
    @NotNull
    public static final String URL_CONNECT_LIFE_TOKEN = "https://clife-api.juhaolian.cn/token";
    @NotNull
    public static final String VERSION_CONNECT_LIFE_API = "1.0";

    @NotNull
    public static final String getURL_CONNECT_LIFE() {
        return URL_CONNECT_LIFE;
    }
}
