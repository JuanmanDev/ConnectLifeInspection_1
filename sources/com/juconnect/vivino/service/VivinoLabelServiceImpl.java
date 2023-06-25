package com.juconnect.vivino.service;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.juconnect.vivino.Vivino;
import com.juconnect.vivino.api.VivinoLabelApi;
import com.juconnect.vivino.global.UrlConstKt;
import com.juconnect.vivino.model.AccessTokenBean;
import com.juconnect.vivino.model.HiVintage;
import com.juconnect.vivino.model.LabelScanBean;
import com.juconnect.vivino.model.MatchStatusBean;
import com.juconnect.vivino.retrofit.RetrofitUtils;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1523s;
import p040c.p072c.p073a.p074a.C1524t;
import p040c.p301y.p523c.p524a.C7804a;
import p040c.p301y.p523c.p524a.C7805b;
import p040c.p301y.p523c.p524a.C7806c;
import p040c.p301y.p523c.p524a.C7807d;
import p040c.p301y.p523c.p524a.C7808e;
import p040c.p301y.p523c.p524a.C7809f;
import p040c.p301y.p523c.p524a.C7810g;
import p040c.p301y.p523c.p524a.C7811h;
import p040c.p301y.p523c.p524a.C7812i;
import p040c.p301y.p523c.p524a.C7813j;
import p040c.p301y.p523c.p524a.C7814k;
import p553f.p594c.C9185c;
import p553f.p594c.p595n.p597b.C9200a;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p618w.C9324a;
import p648m.p683f.C9801a;

@Metadata(mo47990d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J<\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J<\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00130\u0011H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00172\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0007H\u0002J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00172\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J*\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u00172\u0006\u0010 \u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0007H\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, mo47991d2 = {"Lcom/juconnect/vivino/service/VivinoLabelServiceImpl;", "Lcom/juconnect/vivino/service/IVivinoLabelService;", "()V", "vivinoLabelApi", "Lcom/juconnect/vivino/api/VivinoLabelApi;", "kotlin.jvm.PlatformType", "buildOauth", "", "tokenType", "accessToken", "convertToBody", "Lokhttp3/RequestBody;", "value", "getVivinoInfoByVivinoId", "Lio/reactivex/disposables/Disposable;", "vivinoId", "success", "Lkotlin/Function1;", "Lcom/juconnect/vivino/model/HiVintage;", "", "error", "", "oauthToken", "Lio/reactivex/Flowable;", "Lcom/juconnect/vivino/model/AccessTokenBean;", "clientId", "clientSecret", "scanLabel", "file", "Ljava/io/File;", "scanStatus", "Lcom/juconnect/vivino/model/MatchStatusBean;", "oauth", "processingId", "scanUpload", "Lcom/juconnect/vivino/model/LabelScanBean;", "scanVintage", "vintageId", "labelId", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: VivinoLabelServiceImpl.kt */
public final class VivinoLabelServiceImpl implements IVivinoLabelService {
    public final VivinoLabelApi vivinoLabelApi = ((VivinoLabelApi) RetrofitUtils.INSTANCE.getRetrofit(Vivino.Companion.shareUrlHost$vivino_release()).mo51323b(VivinoLabelApi.class));

    private final String buildOauth(String str, String str2) {
        String str3 = str + " " + str2;
        Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
        return str3;
    }

    private final RequestBody convertToBody(String str) {
        return RequestBody.Companion.create(MediaType.Companion.parse(ShareTarget.ENCODING_TYPE_MULTIPART), str);
    }

    /* renamed from: getVivinoInfoByVivinoId$lambda-8  reason: not valid java name */
    public static final void m27284getVivinoInfoByVivinoId$lambda8(Function1 function1, HiVintage hiVintage) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiVintage);
    }

    /* renamed from: getVivinoInfoByVivinoId$lambda-9  reason: not valid java name */
    public static final void m27285getVivinoInfoByVivinoId$lambda9(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    private final C9185c<AccessTokenBean> oauthToken(String str, String str2) {
        C9185c<AccessTokenBean> f = this.vivinoLabelApi.oauthToken(str, str2, UrlConstKt.TYPE_GRANT).mo46979f(C7812i.f14594e);
        Intrinsics.checkNotNullExpressionValue(f, "vivinoLabelApi.oauthToke…token_type)\n            }");
        return f;
    }

    /* renamed from: oauthToken$lambda-11  reason: not valid java name */
    public static final void m27286oauthToken$lambda11(AccessTokenBean accessTokenBean) {
        C1523s.m1040j(C1524t.m1042f(Vivino.SP_NAME));
        C1523s.m1038h(Vivino.SP_ACCESS_TOKEN, accessTokenBean.getAccess_token());
        C1523s.m1036f(Vivino.SP_EXPIRES, accessTokenBean.getExpires());
        C1523s.m1036f(Vivino.SP_EXPIRES_IN, accessTokenBean.getExpires_in());
        C1523s.m1038h(Vivino.SP_TOKEN_TYPE, accessTokenBean.getToken_type());
    }

    /* renamed from: scanLabel$lambda-1  reason: not valid java name */
    public static final C9801a m27287scanLabel$lambda1(VivinoLabelServiceImpl vivinoLabelServiceImpl, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(vivinoLabelServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(str, "$tokenType");
        Intrinsics.checkNotNullParameter(str2, "$accessToken");
        Intrinsics.checkNotNullParameter(bool, "enable");
        if (bool.booleanValue()) {
            return C9185c.m24907j(vivinoLabelServiceImpl.buildOauth(str, str2));
        }
        return vivinoLabelServiceImpl.oauthToken(Vivino.Companion.shareClientId$vivino_release(), Vivino.Companion.shareClientSecret$vivino_release()).mo46982k(new C7809f(vivinoLabelServiceImpl));
    }

    /* renamed from: scanLabel$lambda-1$lambda-0  reason: not valid java name */
    public static final String m27288scanLabel$lambda1$lambda0(VivinoLabelServiceImpl vivinoLabelServiceImpl, AccessTokenBean accessTokenBean) {
        Intrinsics.checkNotNullParameter(vivinoLabelServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(accessTokenBean, "accessTokenBean");
        return vivinoLabelServiceImpl.buildOauth(accessTokenBean.getToken_type(), accessTokenBean.getAccess_token());
    }

    /* renamed from: scanLabel$lambda-2  reason: not valid java name */
    public static final C9801a m27289scanLabel$lambda2(Ref.LongRef longRef, Ref.ObjectRef objectRef, VivinoLabelServiceImpl vivinoLabelServiceImpl, File file, String str) {
        Intrinsics.checkNotNullParameter(longRef, "$time3");
        Intrinsics.checkNotNullParameter(objectRef, "$currentOauth");
        Intrinsics.checkNotNullParameter(vivinoLabelServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(file, "$file");
        Intrinsics.checkNotNullParameter(str, LanguageConstKt.f15954it);
        longRef.element = System.currentTimeMillis();
        objectRef.element = str;
        return vivinoLabelServiceImpl.scanUpload(str, file);
    }

    /* renamed from: scanLabel$lambda-3  reason: not valid java name */
    public static final C9801a m27290scanLabel$lambda3(Ref.LongRef longRef, LabelScanBean labelScanBean) {
        Intrinsics.checkNotNullParameter(longRef, "$time4");
        Intrinsics.checkNotNullParameter(labelScanBean, LanguageConstKt.f15954it);
        longRef.element = System.currentTimeMillis();
        return C9185c.m24907j(labelScanBean).mo46976c(labelScanBean.getMatches_after_msec(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: scanLabel$lambda-4  reason: not valid java name */
    public static final C9801a m27291scanLabel$lambda4(VivinoLabelServiceImpl vivinoLabelServiceImpl, Ref.ObjectRef objectRef, LabelScanBean labelScanBean) {
        Intrinsics.checkNotNullParameter(vivinoLabelServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(objectRef, "$currentOauth");
        Intrinsics.checkNotNullParameter(labelScanBean, LanguageConstKt.f15954it);
        return vivinoLabelServiceImpl.scanStatus((String) objectRef.element, labelScanBean.getProcessing_id());
    }

    /* renamed from: scanLabel$lambda-5  reason: not valid java name */
    public static final C9801a m27292scanLabel$lambda5(VivinoLabelServiceImpl vivinoLabelServiceImpl, Ref.ObjectRef objectRef, MatchStatusBean matchStatusBean) {
        Intrinsics.checkNotNullParameter(vivinoLabelServiceImpl, "this$0");
        Intrinsics.checkNotNullParameter(objectRef, "$currentOauth");
        Intrinsics.checkNotNullParameter(matchStatusBean, LanguageConstKt.f15954it);
        return vivinoLabelServiceImpl.scanVintage((String) objectRef.element, matchStatusBean.getVintage_id(), matchStatusBean.getProcessing_id());
    }

    /* renamed from: scanLabel$lambda-6  reason: not valid java name */
    public static final void m27293scanLabel$lambda6(Function1 function1, HiVintage hiVintage) {
        Intrinsics.checkNotNullParameter(function1, "$success");
        function1.invoke(hiVintage);
    }

    /* renamed from: scanLabel$lambda-7  reason: not valid java name */
    public static final void m27294scanLabel$lambda7(Function1 function1, Throwable th) {
        Intrinsics.checkNotNullParameter(function1, "$error");
        function1.invoke(th);
    }

    private final C9185c<MatchStatusBean> scanStatus(String str, String str2) {
        return this.vivinoLabelApi.scanStatus(str, str2, UrlConstKt.APP_VERSION, UrlConstKt.APP_PLATFORM);
    }

    private final C9185c<LabelScanBean> scanUpload(String str, File file) {
        return this.vivinoLabelApi.scanUpload(str, MultipartBody.Part.Companion.createFormData("image", file.getName(), RequestBody.Companion.create(MediaType.Companion.parse(UrlConstKt.MULTIPART_TYPE_IMAGE), file)), convertToBody(UrlConstKt.IMAGE_TYPE), convertToBody(UrlConstKt.APP_VERSION), convertToBody(UrlConstKt.APP_PLATFORM));
    }

    private final C9185c<HiVintage> scanVintage(String str, String str2, String str3) {
        return this.vivinoLabelApi.scanVintage(str, str2, str3, UrlConstKt.APP_VERSION, UrlConstKt.APP_PLATFORM);
    }

    @NotNull
    public C9207b getVivinoInfoByVivinoId(@NotNull String str, @NotNull Function1<? super HiVintage, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_VIVINO_ID);
        Intrinsics.checkNotNullParameter(function1, "success");
        Intrinsics.checkNotNullParameter(function12, "error");
        C9207b s = this.vivinoLabelApi.getVivinoInfoByVivinoId(str).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7810g(function1), new C7811h(function12));
        Intrinsics.checkNotNullExpressionValue(s, "vivinoLabelApi.getVivino… error(it)\n            })");
        return s;
    }

    @NotNull
    public C9207b scanLabel(@NotNull File file, @NotNull Function1<? super HiVintage, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        boolean z;
        File file2 = file;
        Function1<? super HiVintage, Unit> function13 = function1;
        Function1<? super Throwable, Unit> function14 = function12;
        Intrinsics.checkNotNullParameter(file2, "file");
        Intrinsics.checkNotNullParameter(function13, "success");
        Intrinsics.checkNotNullParameter(function14, "error");
        C1523s.m1040j(C1524t.m1042f(Vivino.SP_NAME));
        String d = C1523s.m1034d(Vivino.SP_ACCESS_TOKEN);
        if (d == null) {
            d = "";
        }
        String d2 = C1523s.m1034d(Vivino.SP_TOKEN_TYPE);
        if (d2 == null) {
            d2 = "";
        }
        long b = C1523s.m1032b(Vivino.SP_EXPIRES, -1);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = System.currentTimeMillis();
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        if (!TextUtils.isEmpty(d) && System.currentTimeMillis() / ((long) 1000) < b) {
            z = true;
        } else {
            z = false;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        C9207b s = C9185c.m24907j(Boolean.valueOf(z)).mo46980h(new C7807d(this, d2, d)).mo46980h(new C7804a(longRef, objectRef, this, file2)).mo46980h(new C7806c(longRef2)).mo46983l(C9324a.m25177b()).mo46980h(new C7805b(this, objectRef)).mo46980h(new C7814k(this, objectRef)).mo46994w(C9324a.m25177b()).mo46983l(C9200a.m24953a()).mo46990s(new C7813j(function13), new C7808e(function14));
        Intrinsics.checkNotNullExpressionValue(s, "just(tokenEnable)\n      … error(it)\n            })");
        return s;
    }
}
