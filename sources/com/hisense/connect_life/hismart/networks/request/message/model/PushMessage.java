package com.hisense.connect_life.hismart.networks.request.message.model;

import androidx.browser.browseractions.BrowserServiceFileProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/PushMessage;", "", "formatId", "", "content", "", "expireTime", "", "startTime", "msgId", "msgLevel", "msgTypeCode", "showType", "(ILjava/lang/String;JJLjava/lang/String;JLjava/lang/String;I)V", "getContent", "()Ljava/lang/String;", "getExpireTime", "()J", "getFormatId", "()I", "getMsgId", "getMsgLevel", "getMsgTypeCode", "getShowType", "getStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PushMessage.kt */
public final class PushMessage {
    @NotNull
    public final String content;
    public final long expireTime;
    public final int formatId;
    @NotNull
    public final String msgId;
    public final long msgLevel;
    @NotNull
    public final String msgTypeCode;
    public final int showType;
    public final long startTime;

    public PushMessage(int i, @NotNull String str, long j, long j2, @NotNull String str2, long j3, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, BrowserServiceFileProvider.CONTENT_SCHEME);
        Intrinsics.checkNotNullParameter(str2, "msgId");
        Intrinsics.checkNotNullParameter(str3, "msgTypeCode");
        this.formatId = i;
        this.content = str;
        this.expireTime = j;
        this.startTime = j2;
        this.msgId = str2;
        this.msgLevel = j3;
        this.msgTypeCode = str3;
        this.showType = i2;
    }

    public static /* synthetic */ PushMessage copy$default(PushMessage pushMessage, int i, String str, long j, long j2, String str2, long j3, String str3, int i2, int i3, Object obj) {
        PushMessage pushMessage2 = pushMessage;
        int i4 = i3;
        return pushMessage.copy((i4 & 1) != 0 ? pushMessage2.formatId : i, (i4 & 2) != 0 ? pushMessage2.content : str, (i4 & 4) != 0 ? pushMessage2.expireTime : j, (i4 & 8) != 0 ? pushMessage2.startTime : j2, (i4 & 16) != 0 ? pushMessage2.msgId : str2, (i4 & 32) != 0 ? pushMessage2.msgLevel : j3, (i4 & 64) != 0 ? pushMessage2.msgTypeCode : str3, (i4 & 128) != 0 ? pushMessage2.showType : i2);
    }

    public final int component1() {
        return this.formatId;
    }

    @NotNull
    public final String component2() {
        return this.content;
    }

    public final long component3() {
        return this.expireTime;
    }

    public final long component4() {
        return this.startTime;
    }

    @NotNull
    public final String component5() {
        return this.msgId;
    }

    public final long component6() {
        return this.msgLevel;
    }

    @NotNull
    public final String component7() {
        return this.msgTypeCode;
    }

    public final int component8() {
        return this.showType;
    }

    @NotNull
    public final PushMessage copy(int i, @NotNull String str, long j, long j2, @NotNull String str2, long j3, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, BrowserServiceFileProvider.CONTENT_SCHEME);
        String str4 = str2;
        Intrinsics.checkNotNullParameter(str4, "msgId");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "msgTypeCode");
        return new PushMessage(i, str, j, j2, str4, j3, str5, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushMessage)) {
            return false;
        }
        PushMessage pushMessage = (PushMessage) obj;
        return this.formatId == pushMessage.formatId && Intrinsics.areEqual((Object) this.content, (Object) pushMessage.content) && this.expireTime == pushMessage.expireTime && this.startTime == pushMessage.startTime && Intrinsics.areEqual((Object) this.msgId, (Object) pushMessage.msgId) && this.msgLevel == pushMessage.msgLevel && Intrinsics.areEqual((Object) this.msgTypeCode, (Object) pushMessage.msgTypeCode) && this.showType == pushMessage.showType;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final int getFormatId() {
        return this.formatId;
    }

    @NotNull
    public final String getMsgId() {
        return this.msgId;
    }

    public final long getMsgLevel() {
        return this.msgLevel;
    }

    @NotNull
    public final String getMsgTypeCode() {
        return this.msgTypeCode;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.formatId) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.expireTime)) * 31) + Long.hashCode(this.startTime)) * 31) + this.msgId.hashCode()) * 31) + Long.hashCode(this.msgLevel)) * 31) + this.msgTypeCode.hashCode()) * 31) + Integer.hashCode(this.showType);
    }

    @NotNull
    public String toString() {
        return "PushMessage(formatId=" + this.formatId + ", content=" + this.content + ", expireTime=" + this.expireTime + ", startTime=" + this.startTime + ", msgId=" + this.msgId + ", msgLevel=" + this.msgLevel + ", msgTypeCode=" + this.msgTypeCode + ", showType=" + this.showType + ')';
    }
}
