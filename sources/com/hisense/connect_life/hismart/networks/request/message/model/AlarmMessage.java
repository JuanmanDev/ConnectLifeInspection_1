package com.hisense.connect_life.hismart.networks.request.message.model;

import androidx.core.app.NotificationCompatJellybean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0002\u0010\u0011J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\nHÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\rHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\nHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0010\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0013\"\u0004\b&\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0013¨\u0006;"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/AlarmMessage;", "", "title", "", "wifiid", "deviceId", "deviceid", "warning", "msgTitle", "formatId", "", "msgId", "msgLevel", "", "msgTypeCode", "startTime", "expireTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;JJ)V", "getDeviceId", "()Ljava/lang/String;", "getDeviceid", "getExpireTime", "()J", "setExpireTime", "(J)V", "getFormatId", "()I", "getMsgId", "setMsgId", "(Ljava/lang/String;)V", "getMsgLevel", "setMsgLevel", "getMsgTitle", "getMsgTypeCode", "setMsgTypeCode", "getStartTime", "setStartTime", "getTitle", "setTitle", "getWarning", "getWifiid", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: AlarmMessage.kt */
public final class AlarmMessage {
    @NotNull
    public final String deviceId;
    @NotNull
    public final String deviceid;
    public long expireTime;
    public final int formatId;
    @NotNull
    public String msgId;
    public long msgLevel;
    @NotNull
    public final String msgTitle;
    @Nullable
    public String msgTypeCode;
    public long startTime;
    @NotNull
    public String title;
    @NotNull
    public final String warning;
    @Nullable
    public final String wifiid;

    public AlarmMessage(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, long j, @Nullable String str8, long j2, long j3) {
        String str9 = str7;
        Intrinsics.checkNotNullParameter(str, NotificationCompatJellybean.KEY_TITLE);
        Intrinsics.checkNotNullParameter(str3, "deviceId");
        Intrinsics.checkNotNullParameter(str4, "deviceid");
        Intrinsics.checkNotNullParameter(str5, "warning");
        Intrinsics.checkNotNullParameter(str6, "msgTitle");
        Intrinsics.checkNotNullParameter(str9, "msgId");
        this.title = str;
        this.wifiid = str2;
        this.deviceId = str3;
        this.deviceid = str4;
        this.warning = str5;
        this.msgTitle = str6;
        this.formatId = i;
        this.msgId = str9;
        this.msgLevel = j;
        this.msgTypeCode = str8;
        this.startTime = j2;
        this.expireTime = j3;
    }

    public static /* synthetic */ AlarmMessage copy$default(AlarmMessage alarmMessage, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, long j, String str8, long j2, long j3, int i2, Object obj) {
        AlarmMessage alarmMessage2 = alarmMessage;
        int i3 = i2;
        return alarmMessage.copy((i3 & 1) != 0 ? alarmMessage2.title : str, (i3 & 2) != 0 ? alarmMessage2.wifiid : str2, (i3 & 4) != 0 ? alarmMessage2.deviceId : str3, (i3 & 8) != 0 ? alarmMessage2.deviceid : str4, (i3 & 16) != 0 ? alarmMessage2.warning : str5, (i3 & 32) != 0 ? alarmMessage2.msgTitle : str6, (i3 & 64) != 0 ? alarmMessage2.formatId : i, (i3 & 128) != 0 ? alarmMessage2.msgId : str7, (i3 & 256) != 0 ? alarmMessage2.msgLevel : j, (i3 & 512) != 0 ? alarmMessage2.msgTypeCode : str8, (i3 & 1024) != 0 ? alarmMessage2.startTime : j2, (i3 & 2048) != 0 ? alarmMessage2.expireTime : j3);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final String component10() {
        return this.msgTypeCode;
    }

    public final long component11() {
        return this.startTime;
    }

    public final long component12() {
        return this.expireTime;
    }

    @Nullable
    public final String component2() {
        return this.wifiid;
    }

    @NotNull
    public final String component3() {
        return this.deviceId;
    }

    @NotNull
    public final String component4() {
        return this.deviceid;
    }

    @NotNull
    public final String component5() {
        return this.warning;
    }

    @NotNull
    public final String component6() {
        return this.msgTitle;
    }

    public final int component7() {
        return this.formatId;
    }

    @NotNull
    public final String component8() {
        return this.msgId;
    }

    public final long component9() {
        return this.msgLevel;
    }

    @NotNull
    public final AlarmMessage copy(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i, @NotNull String str7, long j, @Nullable String str8, long j2, long j3) {
        String str9 = str;
        Intrinsics.checkNotNullParameter(str9, NotificationCompatJellybean.KEY_TITLE);
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "deviceId");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "deviceid");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "warning");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "msgTitle");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, "msgId");
        return new AlarmMessage(str9, str2, str10, str11, str12, str13, i, str14, j, str8, j2, j3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlarmMessage)) {
            return false;
        }
        AlarmMessage alarmMessage = (AlarmMessage) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) alarmMessage.title) && Intrinsics.areEqual((Object) this.wifiid, (Object) alarmMessage.wifiid) && Intrinsics.areEqual((Object) this.deviceId, (Object) alarmMessage.deviceId) && Intrinsics.areEqual((Object) this.deviceid, (Object) alarmMessage.deviceid) && Intrinsics.areEqual((Object) this.warning, (Object) alarmMessage.warning) && Intrinsics.areEqual((Object) this.msgTitle, (Object) alarmMessage.msgTitle) && this.formatId == alarmMessage.formatId && Intrinsics.areEqual((Object) this.msgId, (Object) alarmMessage.msgId) && this.msgLevel == alarmMessage.msgLevel && Intrinsics.areEqual((Object) this.msgTypeCode, (Object) alarmMessage.msgTypeCode) && this.startTime == alarmMessage.startTime && this.expireTime == alarmMessage.expireTime;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceid() {
        return this.deviceid;
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
    public final String getMsgTitle() {
        return this.msgTitle;
    }

    @Nullable
    public final String getMsgTypeCode() {
        return this.msgTypeCode;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getWarning() {
        return this.warning;
    }

    @Nullable
    public final String getWifiid() {
        return this.wifiid;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.wifiid;
        int i = 0;
        int hashCode2 = (((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.deviceId.hashCode()) * 31) + this.deviceid.hashCode()) * 31) + this.warning.hashCode()) * 31) + this.msgTitle.hashCode()) * 31) + Integer.hashCode(this.formatId)) * 31) + this.msgId.hashCode()) * 31) + Long.hashCode(this.msgLevel)) * 31;
        String str2 = this.msgTypeCode;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode2 + i) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.expireTime);
    }

    public final void setExpireTime(long j) {
        this.expireTime = j;
    }

    public final void setMsgId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.msgId = str;
    }

    public final void setMsgLevel(long j) {
        this.msgLevel = j;
    }

    public final void setMsgTypeCode(@Nullable String str) {
        this.msgTypeCode = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "AlarmMessage(title=" + this.title + ", wifiid=" + this.wifiid + ", deviceId=" + this.deviceId + ", deviceid=" + this.deviceid + ", warning=" + this.warning + ", msgTitle=" + this.msgTitle + ", formatId=" + this.formatId + ", msgId=" + this.msgId + ", msgLevel=" + this.msgLevel + ", msgTypeCode=" + this.msgTypeCode + ", startTime=" + this.startTime + ", expireTime=" + this.expireTime + ')';
    }
}
