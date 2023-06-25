package com.hisense.connect_life.hismart.networks.request.wine.inventory.manager;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, mo47991d2 = {"ADD_WINE_INVENTORY", "", "CLEAN_UP_APPLICATION", "DELETE_WINE_INVENTORY", "GET_BY_CATEGORYID", "GET_BY_CATEGORYIDLIST", "GET_WINE_DETAILS", "QUERY_TICKET", "QUERY_WINE_INVENTORY", "SET_TICKET", "UPDATE_WINE_INVENTORY", "VIVINO_INVOKE", "hismart_account_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineInventoryAction.kt */
public final class WineInventoryActionKt {
    @NotNull
    public static final String ADD_WINE_INVENTORY = "wim/wine-user/inventory/save";
    @NotNull
    public static final String CLEAN_UP_APPLICATION = "wim/wine-user/inventory/cleanUpApplication";
    @NotNull
    public static final String DELETE_WINE_INVENTORY = "wim/wine-user/inventory/batchDelete";
    @NotNull
    public static final String GET_BY_CATEGORYID = "wim/wine-user/inventory/queryByCategoryId";
    @NotNull
    public static final String GET_BY_CATEGORYIDLIST = "wim/wine-user/inventory/queryByCategoryIdList";
    @NotNull
    public static final String GET_WINE_DETAILS = "wim/wine-user/inventory/get";
    @NotNull
    public static final String QUERY_TICKET = "clife-svc/query_service_ticket";
    @NotNull
    public static final String QUERY_WINE_INVENTORY = "wim/wine-user/inventory/queryByDevList";
    @NotNull
    public static final String SET_TICKET = "clife-svc/add_service_ticket";
    @NotNull
    public static final String UPDATE_WINE_INVENTORY = "wim/wine-user/inventory/batchUpdate";
    @NotNull
    public static final String VIVINO_INVOKE = "wim/wine-user/category/vivinoInvoke";
}
