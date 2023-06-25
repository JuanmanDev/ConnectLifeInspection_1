package com.hisense.juconnect.app_socket.fbean;

import com.hisense.juconnect.app_socket.find.BcWifiMessage;
import com.hisense.juconnect.app_socket.find.DevData;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001c\u0010 \u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\nR\u001c\u0010#\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\nR\u001c\u0010&\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\b\"\u0004\b(\u0010\nR\u001c\u0010)\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\b\"\u0004\b+\u0010\nR\u001c\u0010,\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\b\"\u0004\b.\u0010\nR\u001c\u0010/\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\b\"\u0004\b1\u0010\n¨\u00062"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/ModuleList;", "", "bcWifiMessage", "Lcom/hisense/juconnect/app_socket/find/BcWifiMessage;", "(Lcom/hisense/juconnect/app_socket/find/BcWifiMessage;)V", "cInfo", "", "getCInfo", "()Ljava/lang/String;", "setCInfo", "(Ljava/lang/String;)V", "connPort", "getConnPort", "setConnPort", "devList", "Ljava/util/LinkedList;", "Lcom/hisense/juconnect/app_socket/fbean/DevData;", "getDevList", "()Ljava/util/LinkedList;", "setDevList", "(Ljava/util/LinkedList;)V", "devPData", "getDevPData", "()Lcom/hisense/juconnect/app_socket/fbean/DevData;", "setDevPData", "(Lcom/hisense/juconnect/app_socket/fbean/DevData;)V", "exID", "getExID", "setExID", "hCause", "getHCause", "setHCause", "hState", "getHState", "setHState", "hType", "getHType", "setHType", "pLVer", "getPLVer", "setPLVer", "rid", "getRid", "setRid", "uri", "getUri", "setUri", "wiFiId", "getWiFiId", "setWiFiId", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ModuleList.kt */
public final class ModuleList {
    @Nullable
    public String cInfo;
    @Nullable
    public String connPort;
    @Nullable
    public LinkedList<DevData> devList;
    @Nullable
    public DevData devPData;
    @Nullable
    public String exID;
    @Nullable
    public String hCause;
    @Nullable
    public String hState;
    @Nullable
    public String hType;
    @Nullable
    public String pLVer;
    @Nullable
    public String rid;
    @Nullable
    public String uri;
    @Nullable
    public String wiFiId;

    public ModuleList(@NotNull BcWifiMessage bcWifiMessage) {
        Intrinsics.checkNotNullParameter(bcWifiMessage, "bcWifiMessage");
        this.wiFiId = bcWifiMessage.getWiFiId();
        Integer rid2 = bcWifiMessage.getRID();
        String str = null;
        this.rid = rid2 == null ? null : rid2.toString();
        this.pLVer = bcWifiMessage.getPLVer();
        this.cInfo = bcWifiMessage.getCInfo();
        Integer hType2 = bcWifiMessage.getHType();
        this.hType = hType2 == null ? null : hType2.toString();
        Integer hState2 = bcWifiMessage.getHState();
        this.hState = hState2 == null ? null : hState2.toString();
        this.hCause = bcWifiMessage.getHCause();
        Integer connPort2 = bcWifiMessage.getConnPort();
        this.connPort = connPort2 == null ? null : connPort2.toString();
        this.uri = bcWifiMessage.getUri();
        Integer exID2 = bcWifiMessage.getExID();
        this.exID = exID2 != null ? exID2.toString() : str;
        this.devPData = new DevData(bcWifiMessage.getDevPData());
        this.devList = new LinkedList<>();
        List<DevData> devList2 = bcWifiMessage.getDevList();
        if (devList2 != null) {
            for (DevData devData : devList2) {
                DevData devData2 = new DevData(devData);
                LinkedList<DevData> devList3 = getDevList();
                if (devList3 != null) {
                    devList3.add(devData2);
                }
            }
        }
    }

    @Nullable
    public final String getCInfo() {
        return this.cInfo;
    }

    @Nullable
    public final String getConnPort() {
        return this.connPort;
    }

    @Nullable
    public final LinkedList<DevData> getDevList() {
        return this.devList;
    }

    @Nullable
    public final DevData getDevPData() {
        return this.devPData;
    }

    @Nullable
    public final String getExID() {
        return this.exID;
    }

    @Nullable
    public final String getHCause() {
        return this.hCause;
    }

    @Nullable
    public final String getHState() {
        return this.hState;
    }

    @Nullable
    public final String getHType() {
        return this.hType;
    }

    @Nullable
    public final String getPLVer() {
        return this.pLVer;
    }

    @Nullable
    public final String getRid() {
        return this.rid;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    public final String getWiFiId() {
        return this.wiFiId;
    }

    public final void setCInfo(@Nullable String str) {
        this.cInfo = str;
    }

    public final void setConnPort(@Nullable String str) {
        this.connPort = str;
    }

    public final void setDevList(@Nullable LinkedList<DevData> linkedList) {
        this.devList = linkedList;
    }

    public final void setDevPData(@Nullable DevData devData) {
        this.devPData = devData;
    }

    public final void setExID(@Nullable String str) {
        this.exID = str;
    }

    public final void setHCause(@Nullable String str) {
        this.hCause = str;
    }

    public final void setHState(@Nullable String str) {
        this.hState = str;
    }

    public final void setHType(@Nullable String str) {
        this.hType = str;
    }

    public final void setPLVer(@Nullable String str) {
        this.pLVer = str;
    }

    public final void setRid(@Nullable String str) {
        this.rid = str;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    public final void setWiFiId(@Nullable String str) {
        this.wiFiId = str;
    }
}
