package com.hisense.connect_life.hismart.networks.parameters;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.hismart.core.HiSmart;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p648m.p649a.p650a.p652b.p653b.C9615c;

@Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\b"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/parameters/CommonParameters;", "", "()V", "getHeadParameter", "", "", "token", "getRandStr", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CommonParameters.kt */
public final class CommonParameters {
    @NotNull
    public static final CommonParameters INSTANCE = new CommonParameters();

    private final String getRandStr() {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        sb.append(System.currentTimeMillis());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply {\n…eMillis())\n\t\t}.toString()");
        Charset defaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(defaultCharset, "defaultCharset()");
        byte[] bytes = sb2.getBytes(defaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String a = C9615c.m25806a(bytes);
        Intrinsics.checkNotNullExpressionValue(a, "md5Crypt(s.toByteArray(Charset.defaultCharset()))");
        return a;
    }

    @NotNull
    public final Map<String, String> getHeadParameter() {
        String displayName = TimeZone.getDefault().getDisplayName(false, 0);
        Intrinsics.checkNotNullExpressionValue(displayName, "getDefault().getDisplayName(false, TimeZone.SHORT)");
        return MapsKt__MapsKt.mapOf(TuplesKt.m25743to("accessToken", HiSmart.Companion.getInstance().getToken()), TuplesKt.m25743to("version", "5.0"), TuplesKt.m25743to("timeStamp", String.valueOf(System.currentTimeMillis())), TuplesKt.m25743to("languageId", HiSmart.Companion.getInstance().getLaunguageId()), TuplesKt.m25743to("timezone", StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(displayName, (String) MAPCookie.GMT, "", false, 4, (Object) null), ":00", "", false, 4, (Object) null)), TuplesKt.m25743to("randStr", getRandStr()));
    }

    @NotNull
    public final Map<String, String> getHeadParameter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        String displayName = TimeZone.getDefault().getDisplayName(false, 0);
        Intrinsics.checkNotNullExpressionValue(displayName, "getDefault().getDisplayName(false, TimeZone.SHORT)");
        return MapsKt__MapsKt.mapOf(TuplesKt.m25743to("accessToken", str), TuplesKt.m25743to("version", "5.0"), TuplesKt.m25743to("timeStamp", String.valueOf(System.currentTimeMillis())), TuplesKt.m25743to("languageId", HiSmart.Companion.getInstance().getLaunguageId()), TuplesKt.m25743to("timezone", StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(displayName, (String) MAPCookie.GMT, "", false, 4, (Object) null), ":00", "", false, 4, (Object) null)), TuplesKt.m25743to("randStr", getRandStr()));
    }
}
