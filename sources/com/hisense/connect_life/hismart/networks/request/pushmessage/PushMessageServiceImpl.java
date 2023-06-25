package com.hisense.connect_life.hismart.networks.request.pushmessage;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.app_account.util.ThirdLoginForGoogleUtils;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.model.JuResponse;
import com.hisense.connect_life.hismart.model.JuResult;
import com.hisense.connect_life.hismart.networks.HiNetWorks;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.url.CloudService;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import com.hisense.connect_life.hismart.utils.LoggerUtil;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p429r.p430a.p439c.p440a.p441a.p449h.C7404a;
import p040c.p429r.p430a.p439c.p440a.p441a.p449h.C7405b;
import p040c.p429r.p430a.p439c.p440a.p441a.p449h.C7406c;
import p040c.p429r.p430a.p439c.p440a.p441a.p449h.C7407d;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J@\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\fH\u0016J8\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\fH\u0016R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/pushmessage/PushMessageServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/pushmessage/IPushMessageService;", "()V", "pushApi", "Lcom/hisense/connect_life/hismart/networks/request/pushmessage/PushMessageApi;", "kotlin.jvm.PlatformType", "subscribePush", "Lio/reactivex/disposables/Disposable;", "deviceToken", "", "deviceId", "success", "Lkotlin/Function1;", "", "", "failure", "", "unsubcribePush", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PushMessageServiceImpl.kt */
public final class PushMessageServiceImpl implements IPushMessageService {
    public final PushMessageApi pushApi = ((PushMessageApi) RetrofitUtils.INSTANCE.getRetrofit(HiNetWorks.Companion.getInstance().getHostUrl(CloudService.PUSH)).mo51323b(PushMessageApi.class));

    /* renamed from: subscribePush$lambda-0  reason: not valid java name */
    public static final void m27042subscribePush$lambda0(Function1 function1, JuResult juResult) {
        JuResponse response;
        Intrinsics.checkNotNullParameter(function1, "$success");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("subscribePush suc result: ", juResult));
        boolean z = false;
        if (!(juResult == null || (response = juResult.getResponse()) == null || response.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: subscribePush$lambda-1  reason: not valid java name */
    public static final void m27043subscribePush$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        LoggerUtil.Companion.mo41769e(Intrinsics.stringPlus("subscribePush fail: ", th.getMessage()));
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    /* renamed from: unsubcribePush$lambda-2  reason: not valid java name */
    public static final void m27044unsubcribePush$lambda2(Function1 function1, JuResult juResult) {
        JuResponse response;
        Intrinsics.checkNotNullParameter(function1, "$success");
        boolean z = false;
        if (!(juResult == null || (response = juResult.getResponse()) == null || response.getResultCode() != 0)) {
            z = true;
        }
        function1.invoke(Boolean.valueOf(z));
    }

    /* renamed from: unsubcribePush$lambda-3  reason: not valid java name */
    public static final void m27045unsubcribePush$lambda3(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b subscribePush(@NotNull String str, @NotNull String str2, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "deviceToken");
        Intrinsics.checkNotNullParameter(str2, "deviceId");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        PushMessageConst.Companion.setFCM_DEVICE_ID(str2);
        C9207b s = this.pushApi.registerDeviceToken(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceToken", str), TuplesKt.m25743to("deviceId", str2), TuplesKt.m25743to("deviceplatform", ThirdLoginForGoogleUtils.thirdType), TuplesKt.m25743to("phoneCode", PushMessageConst.Companion.getPHONECODE())))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7406c(function1), new C7404a(function12));
        Intrinsics.checkNotNullExpressionValue(s, "pushApi.registerDeviceTo…invoke(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b unsubcribePush(@NotNull String str, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "deviceToken");
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.pushApi.clearDeviceToken(ParameterUtils.Companion.createParamBody(MapsKt__MapsKt.mapOf(TuplesKt.m25743to("deviceToken", str), TuplesKt.m25743to("deviceId", PushMessageConst.Companion.getFCM_DEVICE_ID()), TuplesKt.m25743to("phoneCode", PushMessageConst.Companion.getPHONECODE())))).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7405b(function1), new C7407d(function12));
        Intrinsics.checkNotNullExpressionValue(s, "pushApi.clearDeviceToken…invoke(it)\n            })");
        return s;
    }
}
