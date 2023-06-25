package com.hisense.connect_life.core.global;

import androidx.core.app.Person;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hisense.connect_life.core.multilingual.LanguageConstKt;
import com.hisense.connect_life.core.utils.SPUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0018\u001a\u0006\u0010\u001d\u001a\u00020\u000e\u001a\u000e\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0001\u001a\u000e\u0010!\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000e\u001a\u000e\u0010%\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u000e\u0010&\u001a\u00020#2\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u000e\u0010'\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0001\u001a\u000e\u0010(\u001a\u00020#2\u0006\u0010)\u001a\u00020\u0001\u001a\u000e\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u000e\u001a\u000e\u0010,\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000e\u001a\u000e\u0010-\u001a\u00020#2\u0006\u0010+\u001a\u00020\u000e\u001a\u000e\u0010.\u001a\u00020#2\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u000e\u0010/\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0001\u001a\u000e\u00100\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u000e\u001a\u0016\u00101\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001\u001a\u000e\u00103\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020\u0001\u001a\u0016\u00104\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u000e\u001a\u000e\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\u000e\u001a\u000e\u00108\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0016\u00109\u001a\u00020#2\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u0001\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0011\u0010\u0006\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003\"\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f\"\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0011\u0010\u0015\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0003\"\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0003\"\u0011\u0010\u001b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0003¨\u0006;"}, mo47991d2 = {"auid", "", "getAuid", "()Ljava/lang/String;", "customerId", "getCustomerId", "deviceId", "getDeviceId", "email", "getEmail", "isSaved", "", "()Ljava/lang/Object;", "jPushAliasSuccess", "", "getJPushAliasSuccess", "()Z", "languageId", "", "getLanguageId", "()J", "languageType", "getLanguageType", "launch", "getLaunch", "psw", "getPsw", "token", "getToken", "getFlutterSettingLanguage", "getManualUrl", "key", "getPushSwitch", "getZone2Use", "sbAll", "", "no", "setCustomerId", "setDeviceAuid", "setDeviceId", "setEmail", "account", "setFlutterSettingLanguage", "flag", "setHasDevice", "setJpushAilasSuccess", "setLanguageId", "setLanguageType", "setLaunchFirst", "setManualUrl", "manualUrl", "setPsw", "setPushSwitch", "pushSwitchOn", "setSaved", "isLogin", "setToken", "setZone2Use", "Zone2Use", "core_release"}, mo47992k = 2, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SPManager.kt */
public final class SPManagerKt {
    @NotNull
    public static final String email = String.valueOf(SPUtils.INSTANCE.get("email", ""));
    @Nullable
    public static final Object isSaved = SPUtils.INSTANCE.get("isSaved", Boolean.FALSE);
    @Nullable
    public static final Object launch = SPUtils.INSTANCE.get("launch", Boolean.TRUE);
    @NotNull
    public static final String psw = String.valueOf(SPUtils.INSTANCE.get(EventBusConstKt.PSW, ""));
    @NotNull
    public static final String token = String.valueOf(SPUtils.INSTANCE.get(FirebaseMessagingService.EXTRA_TOKEN, ""));

    @NotNull
    public static final String getAuid() {
        Object obj = SPUtils.INSTANCE.get("deviceAuid", "");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @NotNull
    public static final String getCustomerId() {
        Object obj = SPUtils.INSTANCE.get("customerId", "");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @NotNull
    public static final String getDeviceId() {
        Object obj = SPUtils.INSTANCE.get("deviceId", "");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @NotNull
    public static final String getEmail() {
        return email;
    }

    public static final boolean getFlutterSettingLanguage() {
        Object obj = SPUtils.INSTANCE.get("m_flutter_setting_language", Boolean.FALSE);
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public static final boolean getJPushAliasSuccess() {
        Object obj = SPUtils.INSTANCE.get("set_jpush_alias_success", Boolean.FALSE);
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    public static final long getLanguageId() {
        Object obj = SPUtils.INSTANCE.get("languageId", 1L);
        if (obj != null) {
            return ((Long) obj).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    @NotNull
    public static final String getLanguageType() {
        Object obj = SPUtils.INSTANCE.get("languageType", "");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Nullable
    public static final Object getLaunch() {
        return launch;
    }

    @NotNull
    public static final String getManualUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Object obj = SPUtils.INSTANCE.get(str, "");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @NotNull
    public static final String getPsw() {
        return psw;
    }

    public static final boolean getPushSwitch(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Object obj = SPUtils.INSTANCE.get(str, Boolean.TRUE);
        if (obj != null) {
            return ((Boolean) obj).booleanValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
    }

    @NotNull
    public static final String getToken() {
        return token;
    }

    @NotNull
    public static final String getZone2Use(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        return String.valueOf(SPUtils.INSTANCE.get(str, "0"));
    }

    @Nullable
    public static final Object isSaved() {
        return isSaved;
    }

    public static final void sbAll(boolean z) {
        SPUtils.INSTANCE.put("switch_button_all", Boolean.valueOf(z));
    }

    public static final void setCustomerId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "customerId");
        SPUtils.INSTANCE.put("customerId", str);
    }

    public static final void setDeviceAuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        SPUtils.INSTANCE.put("deviceAuid", getCustomerId());
    }

    public static final void setDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        SPUtils.INSTANCE.put("deviceId", str);
    }

    public static final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "account");
        SPUtils.INSTANCE.put("email", str);
    }

    public static final void setFlutterSettingLanguage(boolean z) {
        SPUtils.INSTANCE.put("m_flutter_setting_language", Boolean.valueOf(z));
    }

    public static final void setHasDevice(boolean z) {
        SPUtils.INSTANCE.put(LanguageConstKt.f15962no, Boolean.valueOf(z));
    }

    public static final void setJpushAilasSuccess(boolean z) {
        SPUtils.INSTANCE.put("set_jpush_alias_success", Boolean.valueOf(z));
    }

    public static final void setLanguageId(long j) {
        SPUtils.INSTANCE.put("languageId", Long.valueOf(j));
    }

    public static final void setLanguageType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "languageType");
        SPUtils.INSTANCE.put("languageType", str);
    }

    public static final void setLaunchFirst(boolean z) {
        SPUtils.INSTANCE.put("launch", Boolean.valueOf(z));
    }

    public static final void setManualUrl(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Intrinsics.checkNotNullParameter(str2, "manualUrl");
        SPUtils.INSTANCE.put(str, str2);
    }

    public static final void setPsw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, EventBusConstKt.PSW);
        SPUtils.INSTANCE.put(EventBusConstKt.PSW, str);
    }

    public static final void setPushSwitch(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        SPUtils.INSTANCE.put(str, Boolean.valueOf(z));
    }

    public static final void setSaved(boolean z) {
        SPUtils.INSTANCE.put("isSaved", Boolean.valueOf(z));
    }

    public static final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FirebaseMessagingService.EXTRA_TOKEN);
        SPUtils.INSTANCE.put(FirebaseMessagingService.EXTRA_TOKEN, str);
    }

    public static final void setZone2Use(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, KeyConst.KEY_AUIT);
        Intrinsics.checkNotNullParameter(str2, "Zone2Use");
        SPUtils.INSTANCE.put(str, str2);
    }
}
