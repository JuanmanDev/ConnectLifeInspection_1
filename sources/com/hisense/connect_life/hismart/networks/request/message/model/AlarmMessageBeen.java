package com.hisense.connect_life.hismart.networks.request.message.model;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006)"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessageBeen;", "", "msg", "", "data", "", "Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessage;", "success", "", "hasMore", "count", "", "(Ljava/lang/String;Ljava/util/List;ZZI)V", "getCount", "()I", "setCount", "(I)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "getSuccess", "setSuccess", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AlarmMessageBeen.kt */
public final class AlarmMessageBeen {
    public int count;
    @NotNull
    public List<AlarmMessage> data;
    public boolean hasMore;
    @NotNull
    public String msg;
    public boolean success;

    public AlarmMessageBeen(@NotNull String str, @NotNull List<AlarmMessage> list, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        Intrinsics.checkNotNullParameter(list, "data");
        this.msg = str;
        this.data = list;
        this.success = z;
        this.hasMore = z2;
        this.count = i;
    }

    public static /* synthetic */ AlarmMessageBeen copy$default(AlarmMessageBeen alarmMessageBeen, String str, List<AlarmMessage> list, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = alarmMessageBeen.msg;
        }
        if ((i2 & 2) != 0) {
            list = alarmMessageBeen.data;
        }
        List<AlarmMessage> list2 = list;
        if ((i2 & 4) != 0) {
            z = alarmMessageBeen.success;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = alarmMessageBeen.hasMore;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i = alarmMessageBeen.count;
        }
        return alarmMessageBeen.copy(str, list2, z3, z4, i);
    }

    @NotNull
    public final String component1() {
        return this.msg;
    }

    @NotNull
    public final List<AlarmMessage> component2() {
        return this.data;
    }

    public final boolean component3() {
        return this.success;
    }

    public final boolean component4() {
        return this.hasMore;
    }

    public final int component5() {
        return this.count;
    }

    @NotNull
    public final AlarmMessageBeen copy(@NotNull String str, @NotNull List<AlarmMessage> list, boolean z, boolean z2, int i) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        Intrinsics.checkNotNullParameter(list, "data");
        return new AlarmMessageBeen(str, list, z, z2, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlarmMessageBeen)) {
            return false;
        }
        AlarmMessageBeen alarmMessageBeen = (AlarmMessageBeen) obj;
        return Intrinsics.areEqual((Object) this.msg, (Object) alarmMessageBeen.msg) && Intrinsics.areEqual((Object) this.data, (Object) alarmMessageBeen.data) && this.success == alarmMessageBeen.success && this.hasMore == alarmMessageBeen.hasMore && this.count == alarmMessageBeen.count;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final List<AlarmMessage> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int hashCode = ((this.msg.hashCode() * 31) + this.data.hashCode()) * 31;
        boolean z = this.success;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.hasMore;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + Integer.hashCode(this.count);
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final void setData(@NotNull List<AlarmMessage> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.data = list;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msg = str;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    @NotNull
    public String toString() {
        return "AlarmMessageBeen(msg=" + this.msg + ", data=" + this.data + ", success=" + this.success + ", hasMore=" + this.hasMore + ", count=" + this.count + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AlarmMessageBeen(String str, List list, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, list, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? 0 : i);
    }
}
