package com.hisense.juconnect.app_socket.fbean;

import com.google.gson.Gson;
import com.hisense.juconnect.app_socket.find.BcWifiMessage;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47990d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0018\u001a\u00020\rR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, mo47991d2 = {"Lcom/hisense/juconnect/app_socket/fbean/FindModule;", "", "bcWifiMessage", "Lcom/hisense/juconnect/app_socket/find/BcWifiMessage;", "(Lcom/hisense/juconnect/app_socket/find/BcWifiMessage;)V", "data", "Ljava/util/LinkedList;", "Lcom/hisense/juconnect/app_socket/fbean/ModuleList;", "getData", "()Ljava/util/LinkedList;", "setData", "(Ljava/util/LinkedList;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "errorDes", "getErrorDes", "setErrorDes", "resultCode", "getResultCode", "setResultCode", "toJson", "app_socket_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FindModule.kt */
public final class FindModule {
    @Nullable
    public LinkedList<ModuleList> data;
    @Nullable
    public String errorCode;
    @Nullable
    public String errorDes;
    @Nullable
    public String resultCode;

    public FindModule(@NotNull BcWifiMessage bcWifiMessage) {
        Intrinsics.checkNotNullParameter(bcWifiMessage, "bcWifiMessage");
        try {
            LinkedList<ModuleList> linkedList = new LinkedList<>();
            this.data = linkedList;
            if (linkedList != null) {
                linkedList.add(new ModuleList(bcWifiMessage));
            }
            this.errorCode = "0";
            this.errorDes = "no error";
            this.resultCode = "0";
        } catch (Exception unused) {
        }
    }

    @Nullable
    public final LinkedList<ModuleList> getData() {
        return this.data;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getErrorDes() {
        return this.errorDes;
    }

    @Nullable
    public final String getResultCode() {
        return this.resultCode;
    }

    public final void setData(@Nullable LinkedList<ModuleList> linkedList) {
        this.data = linkedList;
    }

    public final void setErrorCode(@Nullable String str) {
        this.errorCode = str;
    }

    public final void setErrorDes(@Nullable String str) {
        this.errorDes = str;
    }

    public final void setResultCode(@Nullable String str) {
        this.resultCode = str;
    }

    @NotNull
    public final String toJson() {
        String json = new Gson().toJson((Object) this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }
}
