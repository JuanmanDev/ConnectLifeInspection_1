package com.hisense.connect_life.hismart.networks.request.message.model;

import com.hisense.connect_life.hismart.model.HiResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006%"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageResponse;", "Lcom/hisense/connect_life/hismart/model/HiResponse;", "pushChannels", "", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushChannel;", "msgList", "Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "pushServerIp", "", "pushServerPort", "hbInterval", "", "hbFailTimes", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JJ)V", "getHbFailTimes", "()J", "getHbInterval", "getMsgList", "()Ljava/util/List;", "getPushChannels", "getPushServerIp", "()Ljava/lang/String;", "getPushServerPort", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageResponse.kt */
public final class MessageResponse extends HiResponse {
    public final long hbFailTimes;
    public final long hbInterval;
    @NotNull
    public final List<PushMessage> msgList;
    @NotNull
    public final List<PushChannel> pushChannels;
    @NotNull
    public final String pushServerIp;
    @NotNull
    public final String pushServerPort;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageResponse(@NotNull List<PushChannel> list, @NotNull List<PushMessage> list2, @NotNull String str, @NotNull String str2, long j, long j2) {
        super(0, 0, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        String str3 = str;
        String str4 = str2;
        Intrinsics.checkNotNullParameter(list, "pushChannels");
        Intrinsics.checkNotNullParameter(list2, "msgList");
        Intrinsics.checkNotNullParameter(str3, "pushServerIp");
        Intrinsics.checkNotNullParameter(str4, "pushServerPort");
        this.pushChannels = list;
        this.msgList = list2;
        this.pushServerIp = str3;
        this.pushServerPort = str4;
        this.hbInterval = j;
        this.hbFailTimes = j2;
    }

    public static /* synthetic */ MessageResponse copy$default(MessageResponse messageResponse, List list, List list2, String str, String str2, long j, long j2, int i, Object obj) {
        MessageResponse messageResponse2 = messageResponse;
        return messageResponse.copy((i & 1) != 0 ? messageResponse2.pushChannels : list, (i & 2) != 0 ? messageResponse2.msgList : list2, (i & 4) != 0 ? messageResponse2.pushServerIp : str, (i & 8) != 0 ? messageResponse2.pushServerPort : str2, (i & 16) != 0 ? messageResponse2.hbInterval : j, (i & 32) != 0 ? messageResponse2.hbFailTimes : j2);
    }

    @NotNull
    public final List<PushChannel> component1() {
        return this.pushChannels;
    }

    @NotNull
    public final List<PushMessage> component2() {
        return this.msgList;
    }

    @NotNull
    public final String component3() {
        return this.pushServerIp;
    }

    @NotNull
    public final String component4() {
        return this.pushServerPort;
    }

    public final long component5() {
        return this.hbInterval;
    }

    public final long component6() {
        return this.hbFailTimes;
    }

    @NotNull
    public final MessageResponse copy(@NotNull List<PushChannel> list, @NotNull List<PushMessage> list2, @NotNull String str, @NotNull String str2, long j, long j2) {
        Intrinsics.checkNotNullParameter(list, "pushChannels");
        Intrinsics.checkNotNullParameter(list2, "msgList");
        Intrinsics.checkNotNullParameter(str, "pushServerIp");
        Intrinsics.checkNotNullParameter(str2, "pushServerPort");
        return new MessageResponse(list, list2, str, str2, j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageResponse)) {
            return false;
        }
        MessageResponse messageResponse = (MessageResponse) obj;
        return Intrinsics.areEqual((Object) this.pushChannels, (Object) messageResponse.pushChannels) && Intrinsics.areEqual((Object) this.msgList, (Object) messageResponse.msgList) && Intrinsics.areEqual((Object) this.pushServerIp, (Object) messageResponse.pushServerIp) && Intrinsics.areEqual((Object) this.pushServerPort, (Object) messageResponse.pushServerPort) && this.hbInterval == messageResponse.hbInterval && this.hbFailTimes == messageResponse.hbFailTimes;
    }

    public final long getHbFailTimes() {
        return this.hbFailTimes;
    }

    public final long getHbInterval() {
        return this.hbInterval;
    }

    @NotNull
    public final List<PushMessage> getMsgList() {
        return this.msgList;
    }

    @NotNull
    public final List<PushChannel> getPushChannels() {
        return this.pushChannels;
    }

    @NotNull
    public final String getPushServerIp() {
        return this.pushServerIp;
    }

    @NotNull
    public final String getPushServerPort() {
        return this.pushServerPort;
    }

    public int hashCode() {
        return (((((((((this.pushChannels.hashCode() * 31) + this.msgList.hashCode()) * 31) + this.pushServerIp.hashCode()) * 31) + this.pushServerPort.hashCode()) * 31) + Long.hashCode(this.hbInterval)) * 31) + Long.hashCode(this.hbFailTimes);
    }

    @NotNull
    public String toString() {
        return "MessageResponse(pushChannels=" + this.pushChannels + ", msgList=" + this.msgList + ", pushServerIp=" + this.pushServerIp + ", pushServerPort=" + this.pushServerPort + ", hbInterval=" + this.hbInterval + ", hbFailTimes=" + this.hbFailTimes + ')';
    }
}
