package com.juconnect.connectlife.ju_ble.utils;

import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_ble/utils/SdkVersionUtils;", "", "()V", "checkedAndroidLowThenP", "", "checkedAndroid_Q", "checkedAndroid_R", "ju_ble_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: SdkVersionUtils.kt */
public final class SdkVersionUtils {
    @NotNull
    public static final SdkVersionUtils INSTANCE = new SdkVersionUtils();

    public final boolean checkedAndroidLowThenP() {
        return Build.VERSION.SDK_INT <= 28;
    }

    public final boolean checkedAndroid_Q() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public final boolean checkedAndroid_R() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
