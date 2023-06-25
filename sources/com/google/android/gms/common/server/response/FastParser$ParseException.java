package com.google.android.gms.common.server.response;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class FastParser$ParseException extends Exception {
    public FastParser$ParseException(@NonNull String str) {
        super(str);
    }

    public FastParser$ParseException(@NonNull String str, @NonNull Throwable th) {
        super("Error instantiating inner object", th);
    }

    public FastParser$ParseException(@NonNull Throwable th) {
        super(th);
    }
}
