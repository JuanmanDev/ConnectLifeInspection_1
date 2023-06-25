package com.hisense.connect_life.hismart.networks;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.hismart.core.HiSystemParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001a\u0010$\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000e¨\u0006,"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiSystemSetting;", "", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "jhkAppKey", "", "getJhkAppKey", "()Ljava/lang/String;", "setJhkAppKey", "(Ljava/lang/String;)V", "jhkAppSecret", "getJhkAppSecret", "setJhkAppSecret", "jhkSerial", "getJhkSerial", "setJhkSerial", "jhlAppKey", "getJhlAppKey", "setJhlAppKey", "jhlAppSecret", "getJhlAppSecret", "setJhlAppSecret", "jhlClientId", "getJhlClientId", "setJhlClientId", "languageId", "getLanguageId", "setLanguageId", "serviceLocation", "getServiceLocation", "setServiceLocation", "serviceType", "getServiceType", "setServiceType", "token", "getToken", "setToken", "Builder", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HiSystemSetting.kt */
public final class HiSystemSetting {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
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
    public String serviceLocation;
    @NotNull
    public String serviceType;
    @NotNull
    public String token;

    @Metadata(mo47990d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000bJ\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiSystemSetting$Builder;", "", "()V", "setting", "Lcom/hisense/connect_life/hismart/networks/HiSystemSetting;", "build", "setContext", "context", "Landroid/content/Context;", "setJhkAppKey", "appKey", "", "setJhkAppSecret", "appSecret", "setJhkSerial", "jhkSerial", "setJhlAppKey", "setJhlAppSecret", "setJhlClientId", "jhlClientId", "setLanguageId", "languageId", "setServiceLocation", "serviceLocation", "setServiceType", "serviceType", "setToken", "token", "Companion", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HiSystemSetting.kt */
    public static final class Builder {
        @NotNull
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        @NotNull
        public final HiSystemSetting setting;

        @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J`\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiSystemSetting$Builder$Companion;", "", "()V", "initializeBuilder", "Lcom/hisense/connect_life/hismart/networks/HiSystemSetting$Builder;", "context", "Landroid/content/Context;", "serviceLocation", "", "serviceType", "token", "languageId", "jhkAppKey", "jhkAppSecret", "jhlAppKey", "jhlAppSecret", "jhkSerial", "jhlClientId", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
        /* compiled from: HiSystemSetting.kt */
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Builder initializeBuilder(@Nullable Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
                Intrinsics.checkNotNullParameter(str, "serviceLocation");
                Intrinsics.checkNotNullParameter(str2, "serviceType");
                Intrinsics.checkNotNullParameter(str3, FirebaseMessagingService.EXTRA_TOKEN);
                Intrinsics.checkNotNullParameter(str4, "languageId");
                Intrinsics.checkNotNullParameter(str5, "jhkAppKey");
                Intrinsics.checkNotNullParameter(str6, "jhkAppSecret");
                Intrinsics.checkNotNullParameter(str7, "jhlAppKey");
                Intrinsics.checkNotNullParameter(str8, "jhlAppSecret");
                Intrinsics.checkNotNullParameter(str9, "jhkSerial");
                Intrinsics.checkNotNullParameter(str10, "jhlClientId");
                Builder builder = new Builder();
                builder.setContext(context);
                builder.setServiceLocation(str);
                builder.setServiceType(str2);
                builder.setToken(str3);
                builder.setLanguageId(str4);
                builder.setJhkAppKey(str5);
                builder.setJhkAppSecret(str6);
                builder.setJhlAppKey(str7);
                builder.setJhlAppSecret(str8);
                builder.setJhkSerial(str9);
                builder.setJhlClientId(str10);
                return builder;
            }
        }

        public Builder() {
            HiSystemSetting hiSystemSetting = new HiSystemSetting((DefaultConstructorMarker) null);
            this.setting = hiSystemSetting;
            hiSystemSetting.setServiceLocation("");
            hiSystemSetting.setServiceType("");
            hiSystemSetting.setContext((Context) null);
        }

        @NotNull
        public final HiSystemSetting build() {
            return this.setting;
        }

        @NotNull
        public final Builder setContext(@Nullable Context context) {
            this.setting.setContext(context);
            return this;
        }

        @NotNull
        public final Builder setJhkAppKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "appKey");
            this.setting.setJhkAppKey(str);
            return this;
        }

        @NotNull
        public final Builder setJhkAppSecret(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "appSecret");
            this.setting.setJhkAppSecret(str);
            return this;
        }

        @NotNull
        public final Builder setJhkSerial(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "jhkSerial");
            this.setting.setJhkSerial(str);
            return this;
        }

        @NotNull
        public final Builder setJhlAppKey(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "appKey");
            this.setting.setJhlAppKey(str);
            return this;
        }

        @NotNull
        public final Builder setJhlAppSecret(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "appSecret");
            this.setting.setJhlAppSecret(str);
            return this;
        }

        @NotNull
        public final Builder setJhlClientId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "jhlClientId");
            this.setting.setJhlClientId(str);
            return this;
        }

        @NotNull
        public final Builder setLanguageId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "languageId");
            this.setting.setLanguageId(str);
            return this;
        }

        @NotNull
        public final Builder setServiceLocation(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "serviceLocation");
            this.setting.setServiceLocation(str);
            return this;
        }

        @NotNull
        public final Builder setServiceType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "serviceType");
            this.setting.setServiceType(str);
            return this;
        }

        @NotNull
        public final Builder setToken(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
            this.setting.setToken(str);
            return this;
        }
    }

    @Metadata(mo47990d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/HiSystemSetting$Companion;", "", "()V", "initialize", "Lcom/hisense/connect_life/hismart/networks/HiSystemSetting;", "hiSystemParameter", "Lcom/hisense/connect_life/hismart/core/HiSystemParameter;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: HiSystemSetting.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HiSystemSetting initialize(@NotNull HiSystemParameter hiSystemParameter) {
            Intrinsics.checkNotNullParameter(hiSystemParameter, "hiSystemParameter");
            return Builder.Companion.initializeBuilder(hiSystemParameter.getContext(), hiSystemParameter.getServiceLocation(), hiSystemParameter.getServiceType(), hiSystemParameter.getToken(), hiSystemParameter.getLanguageId(), hiSystemParameter.getJhkAppKey(), hiSystemParameter.getJhkAppSecret(), hiSystemParameter.getJhlAppKey(), hiSystemParameter.getJhlAppSecret(), hiSystemParameter.getJhkSerial(), hiSystemParameter.getJhlClientId()).build();
        }
    }

    public HiSystemSetting() {
        this.serviceLocation = "";
        this.serviceType = "";
        this.token = "";
        this.languageId = "";
        this.jhkAppKey = "";
        this.jhkAppSecret = "";
        this.jhlAppKey = "";
        this.jhlAppSecret = "";
        this.jhkSerial = "";
        this.jhlClientId = "";
    }

    public /* synthetic */ HiSystemSetting(DefaultConstructorMarker defaultConstructorMarker) {
        this();
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
}
