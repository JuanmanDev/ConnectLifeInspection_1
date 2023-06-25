package com.hisense.connect_life.hismart.networks.request.config;

import com.google.gson.Gson;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.LogUtilsShen;
import com.hisense.connect_life.hismart.HiSmartCallback;
import com.hisense.connect_life.hismart.model.FailureBean;
import com.hisense.connect_life.hismart.networks.request.config.model.ConfigParsCom;
import com.hisense.connect_life.hismart.networks.retrofit.RetrofitUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p429r.p430a.p439c.p440a.p441a.p445d.C7347a;
import p040c.p429r.p430a.p439c.p440a.p441a.p445d.C7348b;
import p040c.p429r.p430a.p439c.p440a.p441a.p445d.C7349c;
import p040c.p429r.p430a.p439c.p440a.p441a.p445d.C7350d;
import p040c.p429r.p430a.p439c.p440a.p441a.p445d.C7351e;
import p040c.p429r.p430a.p439c.p440a.p441a.p445d.C7352f;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;

@Metadata(mo47990d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J7\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0016J/\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0016J/\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u001d\u0010\r\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/config/ConfigServiceImpl;", "Lcom/hisense/connect_life/hismart/networks/request/config/IConfigService;", "()V", "JSON", "Lokhttp3/MediaType;", "TAG", "", "connectLifeUrl", "cfgPars", "Lio/reactivex/disposables/Disposable;", "cmd", "Lcom/hisense/connect_life/hismart/networks/request/config/model/ConfigParsCom;", "mac", "hiSmartCallback", "Lkotlin/Function1;", "Lcom/hisense/connect_life/hismart/HiSmartCallback;", "", "Lkotlin/ExtensionFunctionType;", "getMac", "getNetStatus", "log", "msg", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ConfigServiceImpl.kt */
public final class ConfigServiceImpl implements IConfigService {
    @Nullable
    public final MediaType JSON = MediaType.Companion.parse("application/json; charset=utf-8");
    @NotNull
    public final String TAG = LogUtilsShen.TAG_SHEN;
    @NotNull
    public final String connectLifeUrl = "https://192.168.1.1";

    /* renamed from: cfgPars$lambda-4  reason: not valid java name */
    public static final void m26985cfgPars$lambda4(ConfigServiceImpl configServiceImpl, HiSmartCallback hiSmartCallback, ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(configServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        configServiceImpl.log(Intrinsics.stringPlus("cfgPars success: ", configParsCom));
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            Intrinsics.checkNotNullExpressionValue(configParsCom, LanguageConstKt.f15954it);
            onSuccess$hismart_account_release.invoke(configParsCom);
        }
    }

    /* renamed from: cfgPars$lambda-5  reason: not valid java name */
    public static final void m26986cfgPars$lambda5(HiSmartCallback hiSmartCallback, ConfigServiceImpl configServiceImpl, Throwable th) {
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        Intrinsics.checkNotNullParameter(configServiceImpl, "this$0");
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, String.valueOf(th.getMessage())));
        }
        configServiceImpl.log(Intrinsics.stringPlus("cfgPars fail: ", th));
    }

    /* renamed from: getMac$lambda-0  reason: not valid java name */
    public static final void m26987getMac$lambda0(ConfigServiceImpl configServiceImpl, HiSmartCallback hiSmartCallback, ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(configServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        configServiceImpl.log(Intrinsics.stringPlus("获取mac成功：", configParsCom));
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            Intrinsics.checkNotNullExpressionValue(configParsCom, LanguageConstKt.f15954it);
            onSuccess$hismart_account_release.invoke(configParsCom);
        }
    }

    /* renamed from: getMac$lambda-1  reason: not valid java name */
    public static final void m26988getMac$lambda1(ConfigServiceImpl configServiceImpl, HiSmartCallback hiSmartCallback, Throwable th) {
        Intrinsics.checkNotNullParameter(configServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        configServiceImpl.log(Intrinsics.stringPlus("获取mac失败：", th));
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, String.valueOf(th.getMessage())));
        }
    }

    /* renamed from: getNetStatus$lambda-2  reason: not valid java name */
    public static final void m26989getNetStatus$lambda2(ConfigServiceImpl configServiceImpl, HiSmartCallback hiSmartCallback, ConfigParsCom configParsCom) {
        Intrinsics.checkNotNullParameter(configServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        configServiceImpl.log(Intrinsics.stringPlus("获取mac成功：", configParsCom));
        Function1 onSuccess$hismart_account_release = hiSmartCallback.getOnSuccess$hismart_account_release();
        if (onSuccess$hismart_account_release != null) {
            Intrinsics.checkNotNullExpressionValue(configParsCom, LanguageConstKt.f15954it);
            onSuccess$hismart_account_release.invoke(configParsCom);
        }
    }

    /* renamed from: getNetStatus$lambda-3  reason: not valid java name */
    public static final void m26990getNetStatus$lambda3(ConfigServiceImpl configServiceImpl, HiSmartCallback hiSmartCallback, Throwable th) {
        Intrinsics.checkNotNullParameter(configServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(hiSmartCallback, "$callback");
        configServiceImpl.log(Intrinsics.stringPlus("获取mac失败：", th));
        Function1<FailureBean, Unit> onFailure$hismart_account_release = hiSmartCallback.getOnFailure$hismart_account_release();
        if (onFailure$hismart_account_release != null) {
            onFailure$hismart_account_release.invoke(new FailureBean(-1, 0, String.valueOf(th.getMessage())));
        }
    }

    private final void log(String str) {
    }

    @NotNull
    public C9207b cfgPars(@NotNull ConfigParsCom configParsCom, @NotNull String str, @NotNull Function1<? super HiSmartCallback<ConfigParsCom>, Unit> function1) {
        Intrinsics.checkNotNullParameter(configParsCom, "cmd");
        Intrinsics.checkNotNullParameter(str, "mac");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = this.JSON;
        String json = new Gson().toJson((Object) configParsCom);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(cmd)");
        C9207b s = ((JuConfigApi) RetrofitUtils.INSTANCE.getRetrofit(this.connectLifeUrl, "ConnectLife", "ConnectLife").mo51323b(JuConfigApi.class)).cfgPars(companion.create(mediaType, json)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7350d(this, create), new C7351e(create, this));
        Intrinsics.checkNotNullExpressionValue(s, "juConfigApi.cfgPars(para… $it\")\n                })");
        return s;
    }

    @NotNull
    public C9207b getMac(@NotNull ConfigParsCom configParsCom, @NotNull Function1<? super HiSmartCallback<ConfigParsCom>, Unit> function1) {
        Intrinsics.checkNotNullParameter(configParsCom, "cmd");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = this.JSON;
        String json = new Gson().toJson((Object) configParsCom);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(cmd)");
        C9207b s = ((JuConfigApi) RetrofitUtils.INSTANCE.getRetrofit(this.connectLifeUrl, "ConnectLife", "ConnectLife").mo51323b(JuConfigApi.class)).getMac(companion.create(mediaType, json)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7352f(this, create), new C7349c(this, create));
        Intrinsics.checkNotNullExpressionValue(s, "juConfigApi.getMac(param…     )\n                })");
        return s;
    }

    @NotNull
    public C9207b getNetStatus(@NotNull ConfigParsCom configParsCom, @NotNull Function1<? super HiSmartCallback<ConfigParsCom>, Unit> function1) {
        Intrinsics.checkNotNullParameter(configParsCom, "cmd");
        Intrinsics.checkNotNullParameter(function1, "hiSmartCallback");
        HiSmartCallback<T> create = HiSmartCallback.Companion.create(function1);
        RequestBody.Companion companion = RequestBody.Companion;
        MediaType mediaType = this.JSON;
        String json = new Gson().toJson((Object) configParsCom);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(cmd)");
        C9207b s = ((JuConfigApi) RetrofitUtils.INSTANCE.getRetrofit(this.connectLifeUrl, "ConnectLife", "ConnectLife").mo51323b(JuConfigApi.class)).getMac(companion.create(mediaType, json)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7347a(this, create), new C7348b(this, create));
        Intrinsics.checkNotNullExpressionValue(s, "juConfigApi.getMac(param…     )\n                })");
        return s;
    }
}
