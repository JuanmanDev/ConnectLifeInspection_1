package com.hisense.connect_life.hismart.networks.request.wine;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategory;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.CategoryExistsResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryByName;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryCondition;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryOneCategory;
import com.hisense.connect_life.hismart.networks.request.wine.model.SearchCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineCategoryInfo;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineFilterConditionResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.p598o.C9207b;

@Metadata(mo47990d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&JL\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&JB\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J@\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000e\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J2\u0010\u0019\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J:\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J:\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&JB\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&J:\u0010(\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\t0\u0007H&¨\u0006)"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/IWineCategoryManager;", "", "addWineCategory", "Lio/reactivex/disposables/Disposable;", "wineBean", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategory;", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategoryResult;", "", "error", "", "deleteWineCategories", "categoryIdList", "", "", "deviceId", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "favoriteWineCategory", "categoryId", "isFavorite", "getCategoryByName", "queryCategoryByName", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryByName;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineCategoryInfo;", "getFilterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineFilterConditionResult;", "queryCategory", "queryCategoryCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryCondition;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "queryCategoryExist", "queryOneCategory", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryOneCategory;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/CategoryExistsResult;", "searchCategory", "categoryName", "isRemoved", "", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/SearchCategoryResult;", "updateWineCategory", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: IWineCategoryManager.kt */
public interface IWineCategoryManager {

    @Metadata(mo47992k = 3, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: IWineCategoryManager.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ C9207b deleteWineCategories$default(IWineCategoryManager iWineCategoryManager, List list, String str, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                return iWineCategoryManager.deleteWineCategories(list, str, function1, function12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteWineCategories");
        }
    }

    @NotNull
    C9207b addWineCategory(@NotNull AddWineCategory addWineCategory, @NotNull Function1<? super AddWineCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b deleteWineCategories(@NotNull List<String> list, @Nullable String str, @NotNull Function1<? super HiResponse, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b favoriteWineCategory(@NotNull String str, @NotNull String str2, @NotNull Function1<? super HiResponse, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getCategoryByName(@NotNull QueryCategoryByName queryCategoryByName, @NotNull Function1<? super List<WineCategoryInfo>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b getFilterCondition(@NotNull Function1<? super WineFilterConditionResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryCategory(@NotNull QueryCategoryCondition queryCategoryCondition, @NotNull Function1<? super QueryCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b queryCategoryExist(@NotNull QueryOneCategory queryOneCategory, @NotNull Function1<? super CategoryExistsResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b searchCategory(@NotNull String str, int i, @NotNull Function1<? super SearchCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    @NotNull
    C9207b updateWineCategory(@NotNull AddWineCategory addWineCategory, @NotNull Function1<? super AddWineCategoryResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);
}
