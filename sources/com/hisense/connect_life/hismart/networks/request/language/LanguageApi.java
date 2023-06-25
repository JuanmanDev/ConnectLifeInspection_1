package com.hisense.connect_life.hismart.networks.request.language;

import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.language.model.LanguageId;
import com.hisense.connect_life.hismart.networks.request.language.model.RegionResult;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p553f.p594c.C9185c;
import p692o.p698x.C9945a;
import p692o.p698x.C9950f;
import p692o.p698x.C9958n;
import p692o.p698x.C9964t;

@Metadata(mo47990d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'J*\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u001e\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\rH'¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/language/LanguageApi;", "", "getDefaultLanguage", "Lio/reactivex/Flowable;", "Lcom/hisense/connect_life/hismart/networks/request/HiResult;", "Lcom/hisense/connect_life/hismart/networks/request/language/model/LanguageId;", "params", "", "", "getRegionByLang", "Lcom/hisense/connect_life/hismart/networks/request/language/model/RegionResult;", "setDefaultLanguage", "Lcom/hisense/connect_life/hismart/networks/request/HiResponse;", "Lokhttp3/RequestBody;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LanguageApi.kt */
public interface LanguageApi {
    @NotNull
    @C9950f("/lgs/get_default_language")
    C9185c<HiResult<LanguageId>> getDefaultLanguage(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9950f("/basic/getRegionByLang")
    C9185c<HiResult<RegionResult>> getRegionByLang(@NotNull @C9964t Map<String, String> map);

    @NotNull
    @C9958n("/lgs/set_default_language")
    C9185c<HiResult<HiResponse>> setDefaultLanguage(@NotNull @C9945a RequestBody requestBody);
}
