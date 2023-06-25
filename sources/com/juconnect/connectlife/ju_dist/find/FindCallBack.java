package com.juconnect.connectlife.ju_dist.find;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/find/FindCallBack;", "", "onListenError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onListenSuccess", "reply", "Lcom/juconnect/connectlife/ju_dist/find/BcWifiMessage;", "onSendError", "onSendSuccess", "message", "", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: FindCallBack.kt */
public interface FindCallBack {
    void onListenError(@NotNull Exception exc);

    void onListenSuccess(@NotNull BcWifiMessage bcWifiMessage);

    void onSendError(@NotNull Exception exc);

    void onSendSuccess(@NotNull String str);
}
