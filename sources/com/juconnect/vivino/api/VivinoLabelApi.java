package com.juconnect.vivino.api;

import com.juconnect.vivino.model.AccessTokenBean;
import com.juconnect.vivino.model.HiVintage;
import com.juconnect.vivino.model.LabelScanBean;
import com.juconnect.vivino.model.MatchStatusBean;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553f.p594c.C9185c;
import p692o.p698x.C9947c;
import p692o.p698x.C9949e;
import p692o.p698x.C9950f;
import p692o.p698x.C9953i;
import p692o.p698x.C9954j;
import p692o.p698x.C9955k;
import p692o.p698x.C9958n;
import p692o.p698x.C9960p;
import p692o.p698x.C9962r;
import p692o.p698x.C9963s;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006H'J@\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0010\u001a\u00020\u00172\b\b\u0001\u0010\u0011\u001a\u00020\u0017H'JD\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0006H'¨\u0006\u001a"}, mo47991d2 = {"Lcom/juconnect/vivino/api/VivinoLabelApi;", "", "getVivinoInfoByVivinoId", "Lio/reactivex/Flowable;", "Lcom/juconnect/vivino/model/HiVintage;", "vintageId", "", "oauthToken", "Lcom/juconnect/vivino/model/AccessTokenBean;", "clientId", "clientSecret", "grantType", "scanStatus", "Lcom/juconnect/vivino/model/MatchStatusBean;", "oauth", "processingId", "appVersion", "appPlatForm", "scanUpload", "Lcom/juconnect/vivino/model/LabelScanBean;", "part", "Lokhttp3/MultipartBody$Part;", "imageType", "Lokhttp3/RequestBody;", "scanVintage", "labelId", "vivino_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: VivinoLabelApi.kt */
public interface VivinoLabelApi {
    @NotNull
    @C9950f("vintages/{vintageId}")
    C9185c<HiVintage> getVivinoInfoByVivinoId(@NotNull @C9962r("vintageId") String str);

    @C9949e
    @C9958n("oauth/token")
    @NotNull
    C9185c<AccessTokenBean> oauthToken(@C9947c("client_id") @NotNull String str, @C9947c("client_secret") @NotNull String str2, @C9947c("grant_type") @NotNull String str3);

    @C9950f("scans/label/{processingId}")
    @NotNull
    @C9954j({"Content-Type: application/x-www-form-urlencoded"})
    C9185c<MatchStatusBean> scanStatus(@NotNull @C9953i("Authorization") String str, @NotNull @C9962r("processingId") String str2, @C9963s("app_version") @NotNull String str3, @C9963s("app_platform") @NotNull String str4);

    @C9958n("scans/label")
    @C9955k
    @NotNull
    C9185c<LabelScanBean> scanUpload(@NotNull @C9953i("Authorization") String str, @NotNull @C9960p MultipartBody.Part part, @NotNull @C9960p("image_type") RequestBody requestBody, @NotNull @C9960p("app_version") RequestBody requestBody2, @NotNull @C9960p("app_platform") RequestBody requestBody3);

    @NotNull
    @C9950f("vintages/{vintageId}")
    C9185c<HiVintage> scanVintage(@NotNull @C9953i("Authorization") String str, @Nullable @C9962r("vintageId") String str2, @C9963s("label_id") @Nullable String str3, @C9963s("app_version") @NotNull String str4, @C9963s("app_platform") @NotNull String str5);
}
