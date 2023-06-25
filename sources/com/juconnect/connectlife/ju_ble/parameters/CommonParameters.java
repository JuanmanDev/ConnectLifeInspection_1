package com.juconnect.connectlife.ju_ble.parameters;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/parameters/CommonParameters;", "", "()V", "sequenceIndex", "", "getHeadParameter", "", "", "getRandStr", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: CommonParameters.kt */
public final class CommonParameters {
    @NotNull
    public static final CommonParameters INSTANCE = new CommonParameters();
    public static int sequenceIndex;

    private final String getRandStr() {
        if (sequenceIndex > 9999) {
            sequenceIndex = 0;
        }
        int i = sequenceIndex;
        sequenceIndex = i + 1;
        String stringPlus = Intrinsics.stringPlus("000", Integer.valueOf(i));
        String substring = stringPlus.substring(stringPlus.length() - 4, stringPlus.length());
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @NotNull
    public final Map<String, String> getHeadParameter() {
        String displayName = TimeZone.getDefault().getDisplayName(false, 0);
        Intrinsics.checkNotNullExpressionValue(displayName, "getDefault().getDisplayName(false, TimeZone.SHORT)");
        return MapsKt__MapsKt.mapOf(TuplesKt.m25743to("version", "1.0"), TuplesKt.m25743to("timeStamp", String.valueOf(System.currentTimeMillis() / ((long) 1000))), TuplesKt.m25743to("languageId", "1"), TuplesKt.m25743to("timezone", StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(displayName, (String) MAPCookie.GMT, "", false, 4, (Object) null), ":00", "", false, 4, (Object) null)), TuplesKt.m25743to("randStr", getRandStr()));
    }
}
