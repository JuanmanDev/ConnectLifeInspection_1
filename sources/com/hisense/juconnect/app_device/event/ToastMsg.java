package com.hisense.juconnect.app_device.event;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/ToastMsg;", "", "toast", "", "(Ljava/lang/String;)V", "getToast", "()Ljava/lang/String;", "setToast", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ToastMsg.kt */
public final class ToastMsg {
    @NotNull
    public String toast;

    public ToastMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "toast");
        this.toast = str;
    }

    public static /* synthetic */ ToastMsg copy$default(ToastMsg toastMsg, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toastMsg.toast;
        }
        return toastMsg.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.toast;
    }

    @NotNull
    public final ToastMsg copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "toast");
        return new ToastMsg(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToastMsg) && Intrinsics.areEqual((Object) this.toast, (Object) ((ToastMsg) obj).toast);
    }

    @NotNull
    public final String getToast() {
        return this.toast;
    }

    public int hashCode() {
        return this.toast.hashCode();
    }

    public final void setToast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toast = str;
    }

    @NotNull
    public String toString() {
        return "ToastMsg(toast=" + this.toast + ')';
    }
}
