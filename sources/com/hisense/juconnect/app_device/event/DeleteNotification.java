package com.hisense.juconnect.app_device.event;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/DeleteNotification;", "", "msgId", "Ljava/util/ArrayList;", "", "(Ljava/util/ArrayList;)V", "getMsgId", "()Ljava/util/ArrayList;", "setMsgId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DeleteNotification.kt */
public final class DeleteNotification {
    @NotNull
    public ArrayList<String> msgId;

    public DeleteNotification(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "msgId");
        this.msgId = arrayList;
    }

    public static /* synthetic */ DeleteNotification copy$default(DeleteNotification deleteNotification, ArrayList<String> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = deleteNotification.msgId;
        }
        return deleteNotification.copy(arrayList);
    }

    @NotNull
    public final ArrayList<String> component1() {
        return this.msgId;
    }

    @NotNull
    public final DeleteNotification copy(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "msgId");
        return new DeleteNotification(arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteNotification) && Intrinsics.areEqual((Object) this.msgId, (Object) ((DeleteNotification) obj).msgId);
    }

    @NotNull
    public final ArrayList<String> getMsgId() {
        return this.msgId;
    }

    public int hashCode() {
        return this.msgId.hashCode();
    }

    public final void setMsgId(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.msgId = arrayList;
    }

    @NotNull
    public String toString() {
        return "DeleteNotification(msgId=" + this.msgId + ')';
    }
}
