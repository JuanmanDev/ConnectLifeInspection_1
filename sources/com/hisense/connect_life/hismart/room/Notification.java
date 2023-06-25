package com.hisense.connect_life.hismart.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.juconnect.connectlife.model.NotificationBean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b;\b\b\u0018\u0000 I2\u00020\u0001:\u0001IB\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b¢\u0006\u0002\u0010\u0015J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.J\t\u00105\u001a\u00020\u000fHÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\t\u00107\u001a\u00020\u000bHÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u000bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000bHÆ\u0003J°\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u000f2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u001e\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010,R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0017¨\u0006J"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/room/Notification;", "", "select", "", "customerId", "", "deviceId", "formatId", "title", "content", "msgLevel", "", "msgType", "insertTime", "msgReadStatus", "", "startTime", "expireTime", "msgId", "msgTypeCode", "noid", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIJZJJLjava/lang/String;Ljava/lang/String;J)V", "getContent", "()Ljava/lang/String;", "getCustomerId", "setCustomerId", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getExpireTime", "()J", "getFormatId", "()I", "getInsertTime", "getMsgId", "getMsgLevel", "getMsgReadStatus", "()Z", "setMsgReadStatus", "(Z)V", "getMsgType", "getMsgTypeCode", "getNoid", "setNoid", "(J)V", "getSelect", "()Ljava/lang/Integer;", "setSelect", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStartTime", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIJZJJLjava/lang/String;Ljava/lang/String;J)Lcom/hisense/connect_life/hismart/room/Notification;", "equals", "other", "hashCode", "toString", "Companion", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
@Entity(tableName = "notification")
/* compiled from: Notification.kt */
public final class Notification {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @ColumnInfo(name = "content")
    @Nullable
    public final String content;
    @ColumnInfo(name = "customer_id")
    @Nullable
    public String customerId;
    @ColumnInfo(name = "device_id")
    @Nullable
    public String deviceId;
    @ColumnInfo(name = "expire_time")
    public final long expireTime;
    @ColumnInfo(name = "format_id")
    public final int formatId;
    @ColumnInfo(name = "insert_time")
    public final long insertTime;
    @ColumnInfo(name = "msg_id")
    @NotNull
    @PrimaryKey(autoGenerate = false)
    public final String msgId;
    @ColumnInfo(name = "msg_level")
    public final long msgLevel;
    @ColumnInfo(name = "msg_read_status")
    public boolean msgReadStatus;
    @ColumnInfo(name = "msg_type")
    public final int msgType;
    @ColumnInfo(name = "msg_type_code")
    @Nullable
    public final String msgTypeCode;
    @ColumnInfo(name = "noid")
    public long noid;
    @ColumnInfo(name = "select")
    @Nullable
    public Integer select;
    @ColumnInfo(name = "start_time")
    public final long startTime;
    @ColumnInfo(name = "title")
    @Nullable
    public final String title;

    @Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/room/Notification$Companion;", "", "()V", "fromNotificationEntity", "Lcom/hisense/connect_life/hismart/room/Notification;", "bean", "Lcom/juconnect/connectlife/model/NotificationBean;", "toWineInventoryBean", "entity", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: Notification.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Notification fromNotificationEntity(@NotNull NotificationBean notificationBean) {
            Intrinsics.checkNotNullParameter(notificationBean, "bean");
            return new Notification(notificationBean.getSelect(), notificationBean.getCustomerId(), notificationBean.getDeviceId(), notificationBean.getFormatId(), notificationBean.getTitle(), notificationBean.getContent(), notificationBean.getMsgLevel(), notificationBean.getMsgType(), notificationBean.getInsertTime(), notificationBean.getMsgReadStatus(), notificationBean.getStartTime(), notificationBean.getExpireTime(), notificationBean.getMsgId(), notificationBean.getMsgTypeCode(), notificationBean.getNoid());
        }

        @NotNull
        public final NotificationBean toWineInventoryBean(@NotNull Notification notification) {
            Intrinsics.checkNotNullParameter(notification, "entity");
            return new NotificationBean(notification.getSelect(), notification.getCustomerId(), notification.getDeviceId(), notification.getFormatId(), notification.getTitle(), notification.getContent(), notification.getMsgLevel(), notification.getMsgType(), notification.getInsertTime(), notification.getMsgReadStatus(), notification.getStartTime(), notification.getExpireTime(), notification.getMsgId(), notification.getMsgTypeCode(), notification.getNoid(), false, 32768, (DefaultConstructorMarker) null);
        }
    }

    public Notification(@Nullable Integer num, @Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4, long j, int i2, long j2, boolean z, long j3, long j4, @NotNull String str5, @Nullable String str6, long j5) {
        String str7 = str5;
        Intrinsics.checkNotNullParameter(str7, "msgId");
        this.select = num;
        this.customerId = str;
        this.deviceId = str2;
        this.formatId = i;
        this.title = str3;
        this.content = str4;
        this.msgLevel = j;
        this.msgType = i2;
        this.insertTime = j2;
        this.msgReadStatus = z;
        this.startTime = j3;
        this.expireTime = j4;
        this.msgId = str7;
        this.msgTypeCode = str6;
        this.noid = j5;
    }

    public static /* synthetic */ Notification copy$default(Notification notification, Integer num, String str, String str2, int i, String str3, String str4, long j, int i2, long j2, boolean z, long j3, long j4, String str5, String str6, long j5, int i3, Object obj) {
        Notification notification2 = notification;
        int i4 = i3;
        return notification.copy((i4 & 1) != 0 ? notification2.select : num, (i4 & 2) != 0 ? notification2.customerId : str, (i4 & 4) != 0 ? notification2.deviceId : str2, (i4 & 8) != 0 ? notification2.formatId : i, (i4 & 16) != 0 ? notification2.title : str3, (i4 & 32) != 0 ? notification2.content : str4, (i4 & 64) != 0 ? notification2.msgLevel : j, (i4 & 128) != 0 ? notification2.msgType : i2, (i4 & 256) != 0 ? notification2.insertTime : j2, (i4 & 512) != 0 ? notification2.msgReadStatus : z, (i4 & 1024) != 0 ? notification2.startTime : j3, (i4 & 2048) != 0 ? notification2.expireTime : j4, (i4 & 4096) != 0 ? notification2.msgId : str5, (i4 & 8192) != 0 ? notification2.msgTypeCode : str6, (i4 & 16384) != 0 ? notification2.noid : j5);
    }

    @Nullable
    public final Integer component1() {
        return this.select;
    }

    public final boolean component10() {
        return this.msgReadStatus;
    }

    public final long component11() {
        return this.startTime;
    }

    public final long component12() {
        return this.expireTime;
    }

    @NotNull
    public final String component13() {
        return this.msgId;
    }

    @Nullable
    public final String component14() {
        return this.msgTypeCode;
    }

    public final long component15() {
        return this.noid;
    }

    @Nullable
    public final String component2() {
        return this.customerId;
    }

    @Nullable
    public final String component3() {
        return this.deviceId;
    }

    public final int component4() {
        return this.formatId;
    }

    @Nullable
    public final String component5() {
        return this.title;
    }

    @Nullable
    public final String component6() {
        return this.content;
    }

    public final long component7() {
        return this.msgLevel;
    }

    public final int component8() {
        return this.msgType;
    }

    public final long component9() {
        return this.insertTime;
    }

    @NotNull
    public final Notification copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4, long j, int i2, long j2, boolean z, long j3, long j4, @NotNull String str5, @Nullable String str6, long j5) {
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(str5, "msgId");
        return new Notification(num, str, str2, i, str3, str4, j, i2, j2, z, j3, j4, str5, str6, j5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        return Intrinsics.areEqual((Object) this.select, (Object) notification.select) && Intrinsics.areEqual((Object) this.customerId, (Object) notification.customerId) && Intrinsics.areEqual((Object) this.deviceId, (Object) notification.deviceId) && this.formatId == notification.formatId && Intrinsics.areEqual((Object) this.title, (Object) notification.title) && Intrinsics.areEqual((Object) this.content, (Object) notification.content) && this.msgLevel == notification.msgLevel && this.msgType == notification.msgType && this.insertTime == notification.insertTime && this.msgReadStatus == notification.msgReadStatus && this.startTime == notification.startTime && this.expireTime == notification.expireTime && Intrinsics.areEqual((Object) this.msgId, (Object) notification.msgId) && Intrinsics.areEqual((Object) this.msgTypeCode, (Object) notification.msgTypeCode) && this.noid == notification.noid;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final int getFormatId() {
        return this.formatId;
    }

    public final long getInsertTime() {
        return this.insertTime;
    }

    @NotNull
    public final String getMsgId() {
        return this.msgId;
    }

    public final long getMsgLevel() {
        return this.msgLevel;
    }

    public final boolean getMsgReadStatus() {
        return this.msgReadStatus;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    @Nullable
    public final String getMsgTypeCode() {
        return this.msgTypeCode;
    }

    public final long getNoid() {
        return this.noid;
    }

    @Nullable
    public final Integer getSelect() {
        return this.select;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.select;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.customerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.formatId)) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.content;
        int hashCode5 = (((((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Long.hashCode(this.msgLevel)) * 31) + Integer.hashCode(this.msgType)) * 31) + Long.hashCode(this.insertTime)) * 31;
        boolean z = this.msgReadStatus;
        if (z) {
            z = true;
        }
        int hashCode6 = (((((((hashCode5 + (z ? 1 : 0)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.expireTime)) * 31) + this.msgId.hashCode()) * 31;
        String str5 = this.msgTypeCode;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((hashCode6 + i) * 31) + Long.hashCode(this.noid);
    }

    public final void setCustomerId(@Nullable String str) {
        this.customerId = str;
    }

    public final void setDeviceId(@Nullable String str) {
        this.deviceId = str;
    }

    public final void setMsgReadStatus(boolean z) {
        this.msgReadStatus = z;
    }

    public final void setNoid(long j) {
        this.noid = j;
    }

    public final void setSelect(@Nullable Integer num) {
        this.select = num;
    }

    @NotNull
    public String toString() {
        return "Notification(select=" + this.select + ", customerId=" + this.customerId + ", deviceId=" + this.deviceId + ", formatId=" + this.formatId + ", title=" + this.title + ", content=" + this.content + ", msgLevel=" + this.msgLevel + ", msgType=" + this.msgType + ", insertTime=" + this.insertTime + ", msgReadStatus=" + this.msgReadStatus + ", startTime=" + this.startTime + ", expireTime=" + this.expireTime + ", msgId=" + this.msgId + ", msgTypeCode=" + this.msgTypeCode + ", noid=" + this.noid + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Notification(java.lang.Integer r24, java.lang.String r25, java.lang.String r26, int r27, java.lang.String r28, java.lang.String r29, long r30, int r32, long r33, boolean r35, long r36, long r38, java.lang.String r40, java.lang.String r41, long r42, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r14 = r1
            goto L_0x000b
        L_0x0009:
            r14 = r35
        L_0x000b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r15 = r2
            goto L_0x0015
        L_0x0013:
            r15 = r36
        L_0x0015:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x001c
            r17 = r2
            goto L_0x001e
        L_0x001c:
            r17 = r38
        L_0x001e:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0027
            java.lang.String r1 = ""
            r19 = r1
            goto L_0x0029
        L_0x0027:
            r19 = r40
        L_0x0029:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0030
            r21 = r2
            goto L_0x0032
        L_0x0030:
            r21 = r42
        L_0x0032:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r11 = r32
            r12 = r33
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12, r14, r15, r17, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.connect_life.hismart.room.Notification.<init>(java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, long, int, long, boolean, long, long, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
