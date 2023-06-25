package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: P */
    public abstract int mo24650P();

    /* renamed from: Q */
    public abstract long mo24651Q();

    /* renamed from: R */
    public abstract long mo24652R();

    @NonNull
    /* renamed from: S */
    public abstract String mo24653S();

    @NonNull
    public final String toString() {
        long R = mo24652R();
        int P = mo24650P();
        long Q = mo24651Q();
        String S = mo24653S();
        return R + "\t" + P + "\t" + Q + S;
    }
}
