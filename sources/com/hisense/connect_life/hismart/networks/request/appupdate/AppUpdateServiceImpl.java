package com.hisense.connect_life.hismart.networks.request.appupdate;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import com.juconnect.vivino.global.UrlConstKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p429r.p430a.p439c.p440a.p441a.p443b.C7343a;
import p040c.p429r.p430a.p439c.p440a.p441a.p443b.C7344b;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JJ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\rH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/appupdate/AppUpdateServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/appupdate/IAppUpdateService;", "()V", "appUpdateApi", "Lcom/hisense/connect_life/hismart/networks/request/appupdate/AppUpdateApi;", "kotlin.jvm.PlatformType", "getAppPolicy", "Lio/reactivex/disposables/Disposable;", "versionCode", "", "appLanguage", "appId", "success", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/networks/request/appupdate/AppPolicyModel;", "", "failure", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AppUpdateServiceImpl.kt */
public final class AppUpdateServiceImpl implements IAppUpdateService {
    public final AppUpdateApi appUpdateApi = ((AppUpdateApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.BASICSERVICE)).mo51323b(AppUpdateApi.class));

    /* renamed from: getAppPolicy$lambda-0  reason: not valid java name */
    public static final void m26981getAppPolicy$lambda0(Function1 function1, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        Intrinsics.stringPlus("getAppPolicy success: ", juCustomResult.getResponse());
        if (((AppPolicyModel) juCustomResult.getResponse()).getResultCode() == 0) {
            function1.invoke(juCustomResult.getResponse());
        } else {
            function1.invoke(null);
        }
    }

    /* renamed from: getAppPolicy$lambda-1  reason: not valid java name */
    public static final void m26982getAppPolicy$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.stringPlus("getAppPolicy fail: ", th);
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b getAppPolicy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super AppPolicyModel, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "versionCode");
        Intrinsics.checkNotNullParameter(str2, "appLanguage");
        Intrinsics.checkNotNullParameter(str3, "appId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m25743to("versionCode", str), TuplesKt.m25743to("appLanguage", str2), TuplesKt.m25743to("appId", str3), TuplesKt.m25743to("appOs", UrlConstKt.APP_PLATFORM));
        Intrinsics.stringPlus("getAppPolicy params:", mapOf);
        C9207b s = this.appUpdateApi.getAppPolicy(ParameterUtils.Companion.createParamMap(mapOf)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7343a(function1), new C7344b(function12));
        Intrinsics.checkNotNullExpressionValue(s, "appUpdateApi.getAppPolic…re(it)\n                })");
        return s;
    }
}
