package com.hisense.juconnect.app_device.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/model/AuidModel;", "", "()V", "mAudi", "", "getMAudi", "()Ljava/lang/String;", "setMAudi", "(Ljava/lang/String;)V", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AuidModel.kt */
public final class AuidModel {
    @NotNull
    public static final AuidModel INSTANCE = new AuidModel();
    @NotNull
    public static String mAudi = "";

    @NotNull
    public final String getMAudi() {
        return mAudi;
    }

    public final void setMAudi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        mAudi = str;
    }
}
