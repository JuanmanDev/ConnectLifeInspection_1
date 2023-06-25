package com.hisense.connect_life.hismart.networks.exception;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo47991d2 = {"Lcom/hisense/connect_life/hismart/networks/exception/HostUrlException;", "Ljava/lang/Exception;", "msg", "", "(Ljava/lang/String;)V", "hismart_account_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HostUrlException.kt */
public final class HostUrlException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HostUrlException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
    }
}
