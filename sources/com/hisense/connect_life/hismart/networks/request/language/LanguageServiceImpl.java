package com.hisense.connect_life.hismart.networks.request.language;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.core.HiSmart;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.HiResponse;
import com.hisense.connect_life.hismart.networks.request.HiResult;
import com.hisense.connect_life.hismart.networks.request.language.model.LanguageId;
import com.hisense.connect_life.hismart.networks.request.language.model.RegionResult;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p429r.p430a.p439c.p440a.p441a.p447f.C7392a;
import p040c.p429r.p430a.p439c.p440a.p441a.p447f.C7393b;
import p040c.p429r.p430a.p439c.p440a.p441a.p447f.C7394c;
import p040c.p429r.p430a.p439c.p440a.p441a.p447f.C7395d;
import p040c.p429r.p430a.p439c.p440a.p441a.p447f.C7396e;
import p040c.p429r.p430a.p439c.p440a.p441a.p447f.C7397f;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0016J@\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0016J8\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\nH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/language/LanguageServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/language/ILanguageService;", "()V", "getRegionApi", "Lcom/hisense/connect_life/hismart/networks/request/language/LanguageApi;", "kotlin.jvm.PlatformType", "languageApi", "getDefaultLanguage", "Lio/reactivex/disposables/Disposable;", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/language/model/LanguageId;", "", "failure", "", "getRegionByLang", "languageId", "", "token", "Lcom/hisense/connect_life/hismart/networks/request/language/model/RegionResult;", "setDefaultLanguage", "defaultLanguageId", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: LanguageServiceImpl.kt */
public final class LanguageServiceImpl implements ILanguageService {
    public final LanguageApi getRegionApi;
    public final LanguageApi languageApi;

    public LanguageServiceImpl() {
        Class cls = LanguageApi.class;
        this.getRegionApi = (LanguageApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.PUSH)).mo51323b(cls);
        this.languageApi = (LanguageApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.LANGUAGE)).mo51323b(cls);
    }

    /* renamed from: getDefaultLanguage$lambda-4  reason: not valid java name */
    public static final void m27030getDefaultLanguage$lambda4(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: getDefaultLanguage$lambda-5  reason: not valid java name */
    public static final void m27031getDefaultLanguage$lambda5(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: getRegionByLang$lambda-0  reason: not valid java name */
    public static final void m27032getRegionByLang$lambda0(Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiResult.getResponse());
    }

    /* renamed from: getRegionByLang$lambda-1  reason: not valid java name */
    public static final void m27033getRegionByLang$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: setDefaultLanguage$lambda-2  reason: not valid java name */
    public static final void m27034setDefaultLanguage$lambda2(String str, Function1 function1, HiResult hiResult) {
        Intrinsics.checkNotNullParameter(str, "$defaultLanguageId");
        Intrinsics.checkNotNullParameter(function1, "$success");
        HiSmart.Companion.getInstance().setLanguageId(str);
        function1.invoke(Boolean.valueOf(((HiResponse) hiResult.getResponse()).getResultCode() == 0));
    }

    /* renamed from: setDefaultLanguage$lambda-3  reason: not valid java name */
    public static final void m27035setDefaultLanguage$lambda3(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b getDefaultLanguage(@NotNull Function1<? super LanguageId, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.languageApi.getDefaultLanguage(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7394c(function1), new C7392a(function12));
        Intrinsics.checkNotNullExpressionValue(s, "languageApi.getDefaultLa…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b getRegionByLang(@NotNull String str, @NotNull String str2, @NotNull Function1<? super RegionResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "languageId");
        Intrinsics.checkNotNullParameter(str2, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.getRegionApi.getRegionByLang(ParameterUtils.Companion.createParamMap(str2, (Map<String, String>) MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("languageId", str)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7396e(function1), new C7397f(function12));
        Intrinsics.checkNotNullExpressionValue(s, "getRegionApi.getRegionBy…ailure(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b setDefaultLanguage(@NotNull String str, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "defaultLanguageId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.languageApi.setDefaultLanguage(ParameterUtils.Companion.createParamBody(MapsKt__MapsJVMKt.mapOf(TuplesKt.m25743to("defaultLanguageId", str)))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7393b(str, function1), new C7395d(function12));
        Intrinsics.checkNotNullExpressionValue(s, "languageApi.setDefaultLa…ailure(it)\n            })");
        return s;
    }
}
