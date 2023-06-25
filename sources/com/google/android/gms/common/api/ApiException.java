package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class ApiException extends Exception {
    @NonNull
    @Deprecated
    public final Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ApiException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.mo24533R()
            java.lang.String r1 = r4.mo24534S()
            if (r1 == 0) goto L_0x000f
            java.lang.String r1 = r4.mo24534S()
            goto L_0x0011
        L_0x000f:
            java.lang.String r1 = ""
        L_0x0011:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.mStatus = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    @NonNull
    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.mo24533R();
    }

    @Deprecated
    @Nullable
    public String getStatusMessage() {
        return this.mStatus.mo24534S();
    }
}
