package com.hisense.juconnect.app_device.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/DeleteInvenMessage;", "", "()V", "info", "", "getInfo", "()Ljava/lang/String;", "setInfo", "(Ljava/lang/String;)V", "warning", "getWarning", "setWarning", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeleteInvenMessage.kt */
public final class DeleteInvenMessage {
    @NotNull
    public String info = "";
    @NotNull
    public String warning = "";

    @NotNull
    public final String getInfo() {
        return this.info;
    }

    @NotNull
    public final String getWarning() {
        return this.warning;
    }

    public final void setInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.info = str;
    }

    public final void setWarning(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.warning = str;
    }
}
