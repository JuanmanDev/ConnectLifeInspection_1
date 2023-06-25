package com.hisense.connect_life.hismart.networks.request.message.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageSwitchResponse;", "", "resultCode", "", "mainSwitch", "", "switchList", "", "Lcom/hisense/connect_life/hismart/networks/request/message/model/MessageSwitchListResponse;", "(ILjava/lang/String;Ljava/util/List;)V", "getMainSwitch", "()Ljava/lang/String;", "getResultCode", "()I", "getSwitchList", "()Ljava/util/List;", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: MessageSwitchResponse.kt */
public final class MessageSwitchResponse {
    @NotNull
    public final String mainSwitch;
    public final int resultCode;
    @NotNull
    public final List<MessageSwitchListResponse> switchList;

    public MessageSwitchResponse(int i, @NotNull String str, @NotNull List<MessageSwitchListResponse> list) {
        Intrinsics.checkNotNullParameter(str, "mainSwitch");
        Intrinsics.checkNotNullParameter(list, "switchList");
        this.resultCode = i;
        this.mainSwitch = str;
        this.switchList = list;
    }

    @NotNull
    public final String getMainSwitch() {
        return this.mainSwitch;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final List<MessageSwitchListResponse> getSwitchList() {
        return this.switchList;
    }
}
