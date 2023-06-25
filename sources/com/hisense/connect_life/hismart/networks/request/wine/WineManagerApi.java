package com.hisense.connect_life.hismart.networks.request.wine;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.AddWineCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.CategoryExistsResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryByNameResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.QueryCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.SearchCategoryResult;
import com.hisense.connect_life.hismart.networks.request.wine.model.WineFilterConditionResult;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9950f;
import p692o.p698x.C9955k;
import p692o.p698x.C9958n;
import p692o.p698x.C9960p;
import p692o.p698x.C9961q;
import p692o.p698x.C9964t;

@Metadata(mo47990d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J;\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0019\b\u0001\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\tH'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u000bH'J\u001e\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u000bH'J*\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u00032\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u000bH'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u000bH'J\u001e\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u000bH'J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u000bH'J;\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0019\b\u0001\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f0\tH'¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/wine/WineManagerApi;", "", "addWineCategory", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/AddWineCategoryResult;", "fileBody", "Lokhttp3/MultipartBody$Part;", "requestBodyMap", "", "", "Lokhttp3/RequestBody;", "Lkotlin/jvm/JvmSuppressWildcards;", "deleteWineCategory", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "categorys", "favoriteWineCategory", "body", "getFilterCondition", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/WineFilterConditionResult;", "getWineCategoryByName", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryByNameResult;", "queryCategory", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/QueryCategoryResult;", "queryCategoryExists", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/CategoryExistsResult;", "queryWineCategory", "Lcom/hisense/connect_life/hismart/networks/request/wine/model/SearchCategoryResult;", "updateWineCategory", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: WineManagerApi.kt */
public interface WineManagerApi {
    @C9958n("/wim/wine-user/category/save")
    @C9955k
    @NotNull
    C9185c<HiResult<AddWineCategoryResult>> addWineCategory(@C9960p @Nullable MultipartBody.Part part, @NotNull @C9961q Map<String, RequestBody> map);

    @NotNull
    @C9958n("/wim/wine-user/category/batchDelete")
    C9185c<HiResult<HiResponse>> deleteWineCategory(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/wim/wine-user/category/favorite")
    C9185c<HiResult<HiResponse>> favoriteWineCategory(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("/wim/wine-user/category/getFilterCondition")
    C9185c<HiResult<WineFilterConditionResult>> getFilterCondition(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("/wim/wine-user/category/getByName")
    C9185c<HiResult<QueryCategoryByNameResult>> getWineCategoryByName(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/wim/wine-user/category/query")
    C9185c<HiResult<QueryCategoryResult>> queryCategory(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9958n("/wim/wine-user/category/exists")
    C9185c<HiResult<CategoryExistsResult>> queryCategoryExists(@NotNull @C9945a RequestBody requestBody);

    @NotNull
    @C9950f("/category/query")
    C9185c<HiResult<SearchCategoryResult>> queryWineCategory(@NotNull @C9945a RequestBody requestBody);

    @C9958n("/wim/wine-user/category/update")
    @C9955k
    @NotNull
    C9185c<HiResult<AddWineCategoryResult>> updateWineCategory(@C9960p @Nullable MultipartBody.Part part, @NotNull @C9961q Map<String, RequestBody> map);
}
