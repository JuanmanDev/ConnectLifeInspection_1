package com.hisense.connect_life.hismart.core;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.hismart.networks.HiLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001Bw\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0000¢\u0006\u0002\u0010\u0013R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u001a\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001b¨\u00062"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/core/HiSystemParameter;", "", "context", "Landroid/content/Context;", "serviceLocation", "", "serviceType", "logLevel", "Lcom/hisense/connect_life/hismart/networks/HiLogger$LogLevel;", "token", "languageId", "jhkAppKey", "jhkAppSecret", "jhlAppKey", "jhlAppSecret", "jhlClientId", "jhkSerial", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/hisense/connect_life/hismart/networks/HiLogger$LogLevel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "hiSystemParameter", "(Lcom/hisense/connect_life/hismart/core/HiSystemParameter;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getJhkAppKey", "()Ljava/lang/String;", "setJhkAppKey", "(Ljava/lang/String;)V", "getJhkAppSecret", "setJhkAppSecret", "getJhkSerial", "setJhkSerial", "getJhlAppKey", "setJhlAppKey", "getJhlAppSecret", "setJhlAppSecret", "getJhlClientId", "setJhlClientId", "getLanguageId", "setLanguageId", "getLogLevel", "()Lcom/hisense/connect_life/hismart/networks/HiLogger$LogLevel;", "setLogLevel", "(Lcom/hisense/connect_life/hismart/networks/HiLogger$LogLevel;)V", "getServiceLocation", "setServiceLocation", "getServiceType", "setServiceType", "getToken", "setToken", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiSystemParameter.kt */
public final class HiSystemParameter {
    @Nullable
    public Context context;
    @NotNull
    public String jhkAppKey;
    @NotNull
    public String jhkAppSecret;
    @NotNull
    public String jhkSerial;
    @NotNull
    public String jhlAppKey;
    @NotNull
    public String jhlAppSecret;
    @NotNull
    public String jhlClientId;
    @NotNull
    public String languageId;
    @NotNull
    public HiLogger.LogLevel logLevel;
    @NotNull
    public String serviceLocation;
    @NotNull
    public String serviceType;
    @NotNull
    public String token;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HiSystemParameter(android.content.Context r17, java.lang.String r18, java.lang.String r19, com.hisense.connect_life.hismart.networks.HiLogger.LogLevel r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 16
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r8 = r2
            goto L_0x000c
        L_0x000a:
            r8 = r21
        L_0x000c:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0012
            r9 = r2
            goto L_0x0014
        L_0x0012:
            r9 = r22
        L_0x0014:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x001a
            r10 = r2
            goto L_0x001c
        L_0x001a:
            r10 = r23
        L_0x001c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0022
            r11 = r2
            goto L_0x0024
        L_0x0022:
            r11 = r24
        L_0x0024:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x002a
            r12 = r2
            goto L_0x002c
        L_0x002a:
            r12 = r25
        L_0x002c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0032
            r13 = r2
            goto L_0x0034
        L_0x0032:
            r13 = r26
        L_0x0034:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x003a
            r14 = r2
            goto L_0x003c
        L_0x003a:
            r14 = r27
        L_0x003c:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0042
            r15 = r2
            goto L_0x0044
        L_0x0042:
            r15 = r28
        L_0x0044:
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.core.HiSystemParameter.<init>(android.content.Context, java.lang.String, java.lang.String, com.hisense.connect_life.hismart.networks.HiLogger$LogLevel, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getJhkAppKey() {
        return this.jhkAppKey;
    }

    @NotNull
    public final String getJhkAppSecret() {
        return this.jhkAppSecret;
    }

    @NotNull
    public final String getJhkSerial() {
        return this.jhkSerial;
    }

    @NotNull
    public final String getJhlAppKey() {
        return this.jhlAppKey;
    }

    @NotNull
    public final String getJhlAppSecret() {
        return this.jhlAppSecret;
    }

    @NotNull
    public final String getJhlClientId() {
        return this.jhlClientId;
    }

    @NotNull
    public final String getLanguageId() {
        return this.languageId;
    }

    @NotNull
    public final HiLogger.LogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final String getServiceLocation() {
        return this.serviceLocation;
    }

    @NotNull
    public final String getServiceType() {
        return this.serviceType;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    public final void setContext(@Nullable Context context2) {
        this.context = context2;
    }

    public final void setJhkAppKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jhkAppKey = str;
    }

    public final void setJhkAppSecret(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jhkAppSecret = str;
    }

    public final void setJhkSerial(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jhkSerial = str;
    }

    public final void setJhlAppKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jhlAppKey = str;
    }

    public final void setJhlAppSecret(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jhlAppSecret = str;
    }

    public final void setJhlClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.jhlClientId = str;
    }

    public final void setLanguageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.languageId = str;
    }

    public final void setLogLevel(@NotNull HiLogger.LogLevel logLevel2) {
        Intrinsics.checkNotNullParameter(logLevel2, "<set-?>");
        this.logLevel = logLevel2;
    }

    public final void setServiceLocation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceLocation = str;
    }

    public final void setServiceType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceType = str;
    }

    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public HiSystemParameter(@NotNull Context context2, @NotNull String str, @NotNull String str2, @NotNull HiLogger.LogLevel logLevel2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(str, "serviceLocation");
        Intrinsics.checkNotNullParameter(str2, "serviceType");
        Intrinsics.checkNotNullParameter(logLevel2, "logLevel");
        Intrinsics.checkNotNullParameter(str3, FirebaseMessagingService.EXTRA_TOKEN);
        Intrinsics.checkNotNullParameter(str4, "languageId");
        Intrinsics.checkNotNullParameter(str5, "jhkAppKey");
        Intrinsics.checkNotNullParameter(str6, "jhkAppSecret");
        Intrinsics.checkNotNullParameter(str7, "jhlAppKey");
        Intrinsics.checkNotNullParameter(str8, "jhlAppSecret");
        Intrinsics.checkNotNullParameter(str9, "jhlClientId");
        Intrinsics.checkNotNullParameter(str10, "jhkSerial");
        this.serviceLocation = "";
        this.serviceType = "";
        this.logLevel = HiLogger.LogLevel.Debug;
        this.token = "";
        this.languageId = "";
        this.jhkAppKey = "";
        this.jhkAppSecret = "";
        this.jhlAppKey = "";
        this.jhlAppSecret = "";
        this.jhkSerial = "";
        this.jhlClientId = "";
        this.context = context2;
        this.serviceLocation = str;
        this.serviceType = str2;
        this.logLevel = logLevel2;
        this.token = str3;
        this.languageId = str4;
        this.jhkAppKey = str5;
        this.jhkAppSecret = str6;
        this.jhlAppKey = str7;
        this.jhlAppSecret = str8;
        this.jhlClientId = str9;
        this.jhkSerial = str10;
    }

    public HiSystemParameter(@NotNull HiSystemParameter hiSystemParameter) {
        Intrinsics.checkNotNullParameter(hiSystemParameter, "hiSystemParameter");
        this.serviceLocation = "";
        this.serviceType = "";
        this.logLevel = HiLogger.LogLevel.Debug;
        this.token = "";
        this.languageId = "";
        this.jhkAppKey = "";
        this.jhkAppSecret = "";
        this.jhlAppKey = "";
        this.jhlAppSecret = "";
        this.jhkSerial = "";
        this.jhlClientId = "";
        this.context = hiSystemParameter.context;
        this.serviceLocation = hiSystemParameter.serviceLocation;
        this.serviceType = hiSystemParameter.serviceType;
        this.logLevel = hiSystemParameter.logLevel;
        this.token = hiSystemParameter.token;
        this.languageId = hiSystemParameter.languageId;
        this.jhkAppKey = hiSystemParameter.jhkAppKey;
        this.jhkAppSecret = hiSystemParameter.jhkAppSecret;
        this.jhlAppKey = hiSystemParameter.jhlAppKey;
        this.jhlAppSecret = hiSystemParameter.jhlAppSecret;
        this.jhlClientId = hiSystemParameter.jhlClientId;
        this.jhkSerial = hiSystemParameter.jhkSerial;
    }
}
