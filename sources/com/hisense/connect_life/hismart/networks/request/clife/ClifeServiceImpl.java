package com.hisense.connect_life.hismart.networks.request.clife;

import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.hismart.model.JuCustomResult;
import com.hisense.connect_life.hismart.networks.parameters.ParameterUtils;
import com.hisense.connect_life.hismart.networks.request.clife.model.DownloadUserDate;
import com.hisense.connect_life.hismart.networks.request.device.DeviceCache;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p429r.p430a.p439c.p440a.p441a.p444c.C7345a;
import p040c.p429r.p430a.p439c.p440a.p441a.p444c.C7346b;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/clife/ClifeServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/clife/IClifeService;", "domain", "", "(Ljava/lang/String;)V", "clifeApi", "Lcom/hisense/connect_life/hismart/networks/request/clife/ClifeApi;", "getUserData", "Lio/reactivex/disposables/Disposable;", "success", "Lkotlin/Function1;", "", "failure", "", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ClifeServiceImpl.kt */
public final class ClifeServiceImpl implements IClifeService {
    @NotNull
    public ClifeApi clifeApi;
    @NotNull
    public String domain;

    public ClifeServiceImpl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "domain");
        this.domain = str;
        Object b = RetrofitUtils.INSTANCE.getRetrofit(str).mo51323b(ClifeApi.class);
        Intrinsics.checkNotNullExpressionValue(b, "RetrofitUtils.getRetrofi…ate(ClifeApi::class.java)");
        this.clifeApi = (ClifeApi) b;
    }

    /* renamed from: getUserData$lambda-0  reason: not valid java name */
    public static final void m26983getUserData$lambda0(Function1 function1, JuCustomResult juCustomResult) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        String str = null;
        String.valueOf(juCustomResult == null ? null : juCustomResult.toString());
        DownloadUserDate downloadUserDate = (DownloadUserDate) juCustomResult.getResponse();
        if (downloadUserDate != null) {
            str = downloadUserDate.getUrl();
        }
        function1.invoke(str);
    }

    /* renamed from: getUserData$lambda-1  reason: not valid java name */
    public static final void m26984getUserData$lambda1(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$failure");
        DeviceCache.Companion.getInstance().removeAll();
        Intrinsics.checkNotNullExpressionValue(th, LanguageConstKt.f15954it);
        function1.invoke(th);
    }

    @NotNull
    public C9207b getUserData(@NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, BundleJUnitUtils.KEY_FAILURE);
        C9207b s = this.clifeApi.getUserData(ParameterUtils.Companion.createParamMap(MapsKt__MapsKt.emptyMap())).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7345a(function1), new C7346b(function12));
        Intrinsics.checkNotNullExpressionValue(s, "clifeApi.getUserData(par…re(it)\n                })");
        return s;
    }
}
