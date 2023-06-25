package com.hisense.juconnect.app_socket.fbean;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n¨\u0006#"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/DevData;", "", "data", "Lcom/hisense/juconnect/app_socket/find/DevData;", "(Lcom/hisense/juconnect/app_socket/find/DevData;)V", "barcode", "", "getBarcode", "()Ljava/lang/String;", "setBarcode", "(Ljava/lang/String;)V", "connPort", "getConnPort", "setConnPort", "dState", "getDState", "setDState", "devId", "getDevId", "setDevId", "devProductType", "getDevProductType", "setDevProductType", "devType", "getDevType", "setDevType", "extData", "getExtData", "setExtData", "pDVer", "getPDVer", "setPDVer", "uri", "getUri", "setUri", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DevData.kt */
public final class DevData {
    @Nullable
    public String barcode;
    @Nullable
    public String connPort;
    @Nullable
    public String dState;
    @Nullable
    public String devId;
    @Nullable
    public String devProductType;
    @Nullable
    public String devType;
    @Nullable
    public String extData;
    @Nullable
    public String pDVer;
    @Nullable
    public String uri;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002d A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003c A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003e A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0048 A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0059 A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0068 A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x006a A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0072 A[Catch:{ JSONException -> 0x007a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0073 A[Catch:{ JSONException -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DevData(@org.jetbrains.annotations.Nullable com.hisense.juconnect.app_socket.find.DevData r3) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r3 != 0) goto L_0x0008
            r1 = r0
            goto L_0x000c
        L_0x0008:
            java.lang.String r1 = r3.getDevId()     // Catch:{ JSONException -> 0x007a }
        L_0x000c:
            r2.devId = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x0012
            r1 = r0
            goto L_0x0016
        L_0x0012:
            java.lang.String r1 = r3.getBarcode()     // Catch:{ JSONException -> 0x007a }
        L_0x0016:
            r2.barcode = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x001c
        L_0x001a:
            r1 = r0
            goto L_0x0027
        L_0x001c:
            java.lang.Integer r1 = r3.getDevType()     // Catch:{ JSONException -> 0x007a }
            if (r1 != 0) goto L_0x0023
            goto L_0x001a
        L_0x0023:
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x007a }
        L_0x0027:
            r2.devType = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x002d
        L_0x002b:
            r1 = r0
            goto L_0x0038
        L_0x002d:
            java.lang.Integer r1 = r3.getDState()     // Catch:{ JSONException -> 0x007a }
            if (r1 != 0) goto L_0x0034
            goto L_0x002b
        L_0x0034:
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x007a }
        L_0x0038:
            r2.dState = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x003e
            r1 = r0
            goto L_0x0042
        L_0x003e:
            java.lang.String r1 = r3.getPDVer()     // Catch:{ JSONException -> 0x007a }
        L_0x0042:
            r2.pDVer = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x0048
        L_0x0046:
            r1 = r0
            goto L_0x0053
        L_0x0048:
            java.lang.Integer r1 = r3.getExtData()     // Catch:{ JSONException -> 0x007a }
            if (r1 != 0) goto L_0x004f
            goto L_0x0046
        L_0x004f:
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x007a }
        L_0x0053:
            r2.extData = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x0059
        L_0x0057:
            r1 = r0
            goto L_0x0064
        L_0x0059:
            java.lang.Integer r1 = r3.getConnPort()     // Catch:{ JSONException -> 0x007a }
            if (r1 != 0) goto L_0x0060
            goto L_0x0057
        L_0x0060:
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x007a }
        L_0x0064:
            r2.connPort = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x006a
            r1 = r0
            goto L_0x006e
        L_0x006a:
            java.lang.String r1 = r3.getUri()     // Catch:{ JSONException -> 0x007a }
        L_0x006e:
            r2.uri = r1     // Catch:{ JSONException -> 0x007a }
            if (r3 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            java.lang.String r0 = r3.getDevProductType()     // Catch:{ JSONException -> 0x007a }
        L_0x0077:
            r2.devProductType = r0     // Catch:{ JSONException -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r3 = move-exception
            r3.printStackTrace()
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hisense.juconnect.app_socket.fbean.DevData.<init>(com.hisense.juconnect.app_socket.find.DevData):void");
    }

    @Nullable
    public final String getBarcode() {
        return this.barcode;
    }

    @Nullable
    public final String getConnPort() {
        return this.connPort;
    }

    @Nullable
    public final String getDState() {
        return this.dState;
    }

    @Nullable
    public final String getDevId() {
        return this.devId;
    }

    @Nullable
    public final String getDevProductType() {
        return this.devProductType;
    }

    @Nullable
    public final String getDevType() {
        return this.devType;
    }

    @Nullable
    public final String getExtData() {
        return this.extData;
    }

    @Nullable
    public final String getPDVer() {
        return this.pDVer;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public final void setBarcode(@Nullable String str) {
        this.barcode = str;
    }

    public final void setConnPort(@Nullable String str) {
        this.connPort = str;
    }

    public final void setDState(@Nullable String str) {
        this.dState = str;
    }

    public final void setDevId(@Nullable String str) {
        this.devId = str;
    }

    public final void setDevProductType(@Nullable String str) {
        this.devProductType = str;
    }

    public final void setDevType(@Nullable String str) {
        this.devType = str;
    }

    public final void setExtData(@Nullable String str) {
        this.extData = str;
    }

    public final void setPDVer(@Nullable String str) {
        this.pDVer = str;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }
}
