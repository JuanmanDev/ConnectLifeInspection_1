package com.hisense.connect_life.hismart.networks.request.message.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/InventoryMessage;", "", "msgId", "", "(Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: InventoryMessage.kt */
public final class InventoryMessage {
    @NotNull
    public final String msgId;

    public InventoryMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "msgId");
        this.msgId = str;
    }

    public static /* synthetic */ InventoryMessage copy$default(InventoryMessage inventoryMessage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inventoryMessage.msgId;
        }
        return inventoryMessage.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.msgId;
    }

    @NotNull
    public final InventoryMessage copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "msgId");
        return new InventoryMessage(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InventoryMessage) && Intrinsics.areEqual((Object) this.msgId, (Object) ((InventoryMessage) obj).msgId);
    }

    @NotNull
    public final String getMsgId() {
        return this.msgId;
    }

    public int hashCode() {
        return this.msgId.hashCode();
    }

    @NotNull
    public String toString() {
        return "InventoryMessage(msgId=" + this.msgId + ')';
    }
}
