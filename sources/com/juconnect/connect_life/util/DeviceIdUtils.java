package com.juconnect.connect_life.util;

import com.amazon.identity.auth.map.device.AccountManagerConstants$LOCALE;
import com.hisense.connect_life.core.global.AppConfig;
import com.hisense.connect_life.core.global.KeyConst;
import com.hisense.connect_life.hismart.core.HiSmart;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import p040c.p072c.p073a.p074a.C1524t;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/DeviceIdUtils;", "", "()V", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeviceIdUtils.kt */
public final class DeviceIdUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/DeviceIdUtils$Companion;", "", "()V", "createDeviceId", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: DeviceIdUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String createDeviceId() {
            String i = C1524t.m1042f(AppConfig.SP_NAME_APP).mo15419i(KeyConst.KEY_JHK_DEV_SERIAL);
            if (!(i == null || i.length() == 0)) {
                Intrinsics.checkNotNullExpressionValue(i, "string");
                return i;
            }
            StringBuilder sb = new StringBuilder();
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
            sb.append(StringsKt__StringsJVMKt.replace$default(uuid, AccountManagerConstants$LOCALE.LOCALE_SEPERATOR, "", false, 4, (Object) null));
            sb.append(String.valueOf(System.currentTimeMillis()));
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
            C1524t.m1042f(AppConfig.SP_NAME_APP).mo15423n(KeyConst.KEY_JHK_DEV_SERIAL, sb2);
            String str = AppConfig.Jhl_CLIENT_ID + sb2;
            Intrinsics.checkNotNullExpressionValue(str, "StringBuilder().apply(builderAction).toString()");
            C1524t.m1042f(AppConfig.SP_NAME_APP).mo15423n(KeyConst.KEY_JHK_DEVICE_ID, str);
            AppConfig.Companion.setJhlDevSerial(sb2);
            AppConfig.Companion.setJhkDeviceId(str);
            HiSmart.Companion.getInstance().updateJhkSerial(sb2);
            return str;
        }
    }
}
