package com.hisense.juconnect.app_device.event;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\u000b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0012"}, mo47991d2 = {"Lcom/hisense/juconnect/app_device/event/AddTicket;", "", "msgId", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getMsgId", "()Ljava/util/ArrayList;", "setMsgId", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_device_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AddTicket.kt */
public final class AddTicket {
    @NotNull
    public ArrayList<String> msgId;

    public AddTicket(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "msgId");
        this.msgId = arrayList;
    }

    public static /* synthetic */ AddTicket copy$default(AddTicket addTicket, ArrayList<String> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = addTicket.msgId;
        }
        return addTicket.copy(arrayList);
    }

    @NotNull
    public final ArrayList<String> component1() {
        return this.msgId;
    }

    @NotNull
    public final AddTicket copy(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "msgId");
        return new AddTicket(arrayList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AddTicket) && Intrinsics.areEqual((Object) this.msgId, (Object) ((AddTicket) obj).msgId);
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
        return "AddTicket(msgId=" + this.msgId + ')';
    }
}
