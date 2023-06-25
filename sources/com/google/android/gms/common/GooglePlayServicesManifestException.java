package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import p040c.p200q.p201a.p264c.p276d.C3326c;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GooglePlayServicesManifestException extends IllegalStateException {
    public final int zza;

    public GooglePlayServicesManifestException(int i, @NonNull String str) {
        super(str);
        this.zza = i;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return C3326c.f6203a;
    }
}
