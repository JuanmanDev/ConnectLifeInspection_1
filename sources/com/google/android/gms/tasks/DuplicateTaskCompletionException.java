package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import p040c.p200q.p201a.p264c.p347m.C5771j;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    public DuplicateTaskCompletionException(String str, @Nullable Throwable th) {
        super(str, th);
    }

    @NonNull
    /* renamed from: of */
    public static IllegalStateException m22041of(@NonNull C5771j<?> jVar) {
        String str;
        if (!jVar.mo28855p()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception l = jVar.mo28851l();
        if (l != null) {
            str = BundleJUnitUtils.KEY_FAILURE;
        } else if (jVar.mo28856q()) {
            str = "result ".concat(String.valueOf(String.valueOf(jVar.mo28852m())));
        } else {
            str = jVar.mo28854o() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException("Complete with: ".concat(str), l);
    }
}
