package com.juconnect.connectlife.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b=\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f¢\u0006\u0002\u0010\u0016J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\t\u00107\u001a\u00020\u000fHÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000fHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u000bHÆ\u0003Jº\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000fHÆ\u0001¢\u0006\u0002\u0010GJ\u0013\u0010H\u001a\u00020\u000f2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0003HÖ\u0001J\t\u0010K\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0018\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u001a\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010#\"\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u001a\u0010\u0014\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001f\"\u0004\b-\u0010.R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0018¨\u0006L"}, mo47991d2 = {"Lcom/juconnect/connectlife/model/NotificationBean;", "", "select", "", "customerId", "", "deviceId", "formatId", "title", "content", "msgLevel", "", "msgType", "insertTime", "msgReadStatus", "", "startTime", "expireTime", "msgId", "msgTypeCode", "noid", "isSelected", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIJZJJLjava/lang/String;Ljava/lang/String;JZ)V", "getContent", "()Ljava/lang/String;", "getCustomerId", "setCustomerId", "(Ljava/lang/String;)V", "getDeviceId", "setDeviceId", "getExpireTime", "()J", "getFormatId", "()I", "getInsertTime", "()Z", "setSelected", "(Z)V", "getMsgId", "getMsgLevel", "getMsgReadStatus", "setMsgReadStatus", "getMsgType", "getMsgTypeCode", "getNoid", "setNoid", "(J)V", "getSelect", "()Ljava/lang/Integer;", "setSelect", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStartTime", "getTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIJZJJLjava/lang/String;Ljava/lang/String;JZ)Lcom/juconnect/connectlife/model/NotificationBean;", "equals", "other", "hashCode", "toString", "connectlife_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: NotificationBean.kt */
public final class NotificationBean {
    @Nullable
    public final String content;
    @Nullable
    public String customerId;
    @Nullable
    public String deviceId;
    public final long expireTime;
    public final int formatId;
    public final long insertTime;
    public boolean isSelected;
    @NotNull
    public final String msgId;
    public final long msgLevel;
    public boolean msgReadStatus;
    public final int msgType;
    @Nullable
    public final String msgTypeCode;
    public long noid;
    @Nullable
    public Integer select;
    public final long startTime;
    @Nullable
    public final String title;

    public NotificationBean(@Nullable Integer num, @Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4, long j, int i2, long j2, boolean z, long j3, long j4, @NotNull String str5, @Nullable String str6, long j5, boolean z2) {
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
        this.isSelected = z2;
    }

    public static /* synthetic */ NotificationBean copy$default(NotificationBean notificationBean, Integer num, String str, String str2, int i, String str3, String str4, long j, int i2, long j2, boolean z, long j3, long j4, String str5, String str6, long j5, boolean z2, int i3, Object obj) {
        NotificationBean notificationBean2 = notificationBean;
        int i4 = i3;
        return notificationBean.copy((i4 & 1) != 0 ? notificationBean2.select : num, (i4 & 2) != 0 ? notificationBean2.customerId : str, (i4 & 4) != 0 ? notificationBean2.deviceId : str2, (i4 & 8) != 0 ? notificationBean2.formatId : i, (i4 & 16) != 0 ? notificationBean2.title : str3, (i4 & 32) != 0 ? notificationBean2.content : str4, (i4 & 64) != 0 ? notificationBean2.msgLevel : j, (i4 & 128) != 0 ? notificationBean2.msgType : i2, (i4 & 256) != 0 ? notificationBean2.insertTime : j2, (i4 & 512) != 0 ? notificationBean2.msgReadStatus : z, (i4 & 1024) != 0 ? notificationBean2.startTime : j3, (i4 & 2048) != 0 ? notificationBean2.expireTime : j4, (i4 & 4096) != 0 ? notificationBean2.msgId : str5, (i4 & 8192) != 0 ? notificationBean2.msgTypeCode : str6, (i4 & 16384) != 0 ? notificationBean2.noid : j5, (i4 & 32768) != 0 ? notificationBean2.isSelected : z2);
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

    public final boolean component16() {
        return this.isSelected;
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
    public final NotificationBean copy(@Nullable Integer num, @Nullable String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4, long j, int i2, long j2, boolean z, long j3, long j4, @NotNull String str5, @Nullable String str6, long j5, boolean z2) {
        Integer num2 = num;
        Intrinsics.checkNotNullParameter(str5, "msgId");
        return new NotificationBean(num, str, str2, i, str3, str4, j, i2, j2, z, j3, j4, str5, str6, j5, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationBean)) {
            return false;
        }
        NotificationBean notificationBean = (NotificationBean) obj;
        return Intrinsics.areEqual((Object) this.select, (Object) notificationBean.select) && Intrinsics.areEqual((Object) this.customerId, (Object) notificationBean.customerId) && Intrinsics.areEqual((Object) this.deviceId, (Object) notificationBean.deviceId) && this.formatId == notificationBean.formatId && Intrinsics.areEqual((Object) this.title, (Object) notificationBean.title) && Intrinsics.areEqual((Object) this.content, (Object) notificationBean.content) && this.msgLevel == notificationBean.msgLevel && this.msgType == notificationBean.msgType && this.insertTime == notificationBean.insertTime && this.msgReadStatus == notificationBean.msgReadStatus && this.startTime == notificationBean.startTime && this.expireTime == notificationBean.expireTime && Intrinsics.areEqual((Object) this.msgId, (Object) notificationBean.msgId) && Intrinsics.areEqual((Object) this.msgTypeCode, (Object) notificationBean.msgTypeCode) && this.noid == notificationBean.noid && this.isSelected == notificationBean.isSelected;
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
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode6 = (((((((hashCode5 + (z ? 1 : 0)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.expireTime)) * 31) + this.msgId.hashCode()) * 31;
        String str5 = this.msgTypeCode;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int hashCode7 = (((hashCode6 + i) * 31) + Long.hashCode(this.noid)) * 31;
        boolean z3 = this.isSelected;
        if (!z3) {
            z2 = z3;
        }
        return hashCode7 + (z2 ? 1 : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
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

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @NotNull
    public String toString() {
        return "NotificationBean(select=" + this.select + ", customerId=" + this.customerId + ", deviceId=" + this.deviceId + ", formatId=" + this.formatId + ", title=" + this.title + ", content=" + this.content + ", msgLevel=" + this.msgLevel + ", msgType=" + this.msgType + ", insertTime=" + this.insertTime + ", msgReadStatus=" + this.msgReadStatus + ", startTime=" + this.startTime + ", expireTime=" + this.expireTime + ", msgId=" + this.msgId + ", msgTypeCode=" + this.msgTypeCode + ", noid=" + this.noid + ", isSelected=" + this.isSelected + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NotificationBean(java.lang.Integer r26, java.lang.String r27, java.lang.String r28, int r29, java.lang.String r30, java.lang.String r31, long r32, int r34, long r35, boolean r37, long r38, long r40, java.lang.String r42, java.lang.String r43, long r44, boolean r46, int r47, kotlin.jvm.internal.DefaultConstructorMarker r48) {
        /*
            r25 = this;
            r0 = r47
            r1 = r0 & 512(0x200, float:7.175E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r15 = r2
            goto L_0x000b
        L_0x0009:
            r15 = r37
        L_0x000b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r1 == 0) goto L_0x0014
            r16 = r3
            goto L_0x0016
        L_0x0014:
            r16 = r38
        L_0x0016:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x001d
            r18 = r3
            goto L_0x001f
        L_0x001d:
            r18 = r40
        L_0x001f:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = ""
            r20 = r1
            goto L_0x002a
        L_0x0028:
            r20 = r42
        L_0x002a:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0031
            r22 = r3
            goto L_0x0033
        L_0x0031:
            r22 = r44
        L_0x0033:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003c
            r24 = r2
            goto L_0x003e
        L_0x003c:
            r24 = r46
        L_0x003e:
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r12 = r34
            r13 = r35
            r21 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r15, r16, r18, r20, r21, r22, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.juconnect.connectlife.model.NotificationBean.<init>(java.lang.Integer, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, long, int, long, boolean, long, long, java.lang.String, java.lang.String, long, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
