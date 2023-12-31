package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import androidx.core.app.Person;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\u0010\rJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000fJ\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo47991d2 = {"Lcom/google/firebase/analytics/ktx/ParametersBuilder;", "", "()V", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "param", "", "key", "", "value", "", "(Ljava/lang/String;[Landroid/os/Bundle;)V", "", "", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_granule"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: com.google.firebase:firebase-analytics-ktx@@21.2.0 */
public final class ParametersBuilder {
    @NotNull
    public final Bundle zza = new Bundle();

    @NotNull
    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(@NotNull String str, double d) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        this.zza.putDouble(str, d);
    }

    public final void param(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        this.zza.putLong(str, j);
    }

    public final void param(@NotNull String str, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Intrinsics.checkNotNullParameter(bundle, "value");
        this.zza.putBundle(str, bundle);
    }

    public final void param(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Intrinsics.checkNotNullParameter(str2, "value");
        this.zza.putString(str, str2);
    }

    public final void param(@NotNull String str, @NotNull Bundle[] bundleArr) {
        Intrinsics.checkNotNullParameter(str, Person.KEY_KEY);
        Intrinsics.checkNotNullParameter(bundleArr, "value");
        this.zza.putParcelableArray(str, bundleArr);
    }
}
