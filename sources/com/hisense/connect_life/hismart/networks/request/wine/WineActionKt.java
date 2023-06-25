package com.hisense.connect_life.hismart.networks.request.wine;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\n"}, mo47991d2 = {"ACTION_Wine", "", "ADD_CATEGORY", "CATEGORY_FILTER_CONDITION", "CATEGORY_UPDATE", "DELETE_WINE_CATEGORY", "FAVORITE_WINE_CATEGORY", "QUERY_CATEGORY", "QUERY_CATEGORY_BY_NAME", "QUERY_CATEGORY_EXISTS", "hismart_account_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineAction.kt */
public final class WineActionKt {
    @NotNull
    public static final String ACTION_Wine = "/category/query";
    @NotNull
    public static final String ADD_CATEGORY = "/wim/wine-user/category/save";
    @NotNull
    public static final String CATEGORY_FILTER_CONDITION = "/wim/wine-user/category/getFilterCondition";
    @NotNull
    public static final String CATEGORY_UPDATE = "/wim/wine-user/category/update";
    @NotNull
    public static final String DELETE_WINE_CATEGORY = "/wim/wine-user/category/batchDelete";
    @NotNull
    public static final String FAVORITE_WINE_CATEGORY = "/wim/wine-user/category/favorite";
    @NotNull
    public static final String QUERY_CATEGORY = "/wim/wine-user/category/query";
    @NotNull
    public static final String QUERY_CATEGORY_BY_NAME = "/wim/wine-user/category/getByName";
    @NotNull
    public static final String QUERY_CATEGORY_EXISTS = "/wim/wine-user/category/exists";
}
