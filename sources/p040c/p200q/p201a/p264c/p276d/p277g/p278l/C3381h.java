package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: c.q.a.c.d.g.l.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public interface C3381h {
    /* renamed from: e */
    void mo20555e(@NonNull String str, @NonNull LifecycleCallback lifecycleCallback);

    @Nullable
    /* renamed from: i */
    <T extends LifecycleCallback> T mo20556i(@NonNull String str, @NonNull Class<T> cls);

    @Nullable
    /* renamed from: j */
    Activity mo20557j();

    void startActivityForResult(@NonNull Intent intent, int i);
}
