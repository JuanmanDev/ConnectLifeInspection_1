package p040c.p200q.p201a.p264c.p340i.p341a;

import android.os.Bundle;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p294g.p335i.C5303v2;
import p040c.p200q.p201a.p264c.p340i.p342b.C5672v5;

/* renamed from: c.q.a.c.i.a.a */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
public class C5413a {

    /* renamed from: a */
    public final C5303v2 f10308a;

    /* renamed from: c.q.a.c.i.a.a$a */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
    public interface C5414a extends C5672v5 {
    }

    public C5413a(C5303v2 v2Var) {
        this.f10308a = v2Var;
    }

    /* renamed from: a */
    public void mo28022a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f10308a.mo27795J(str, str2, bundle);
    }

    /* renamed from: b */
    public void mo28023b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f10308a.mo27802g(str, str2, obj, true);
    }

    /* renamed from: c */
    public final void mo28024c(boolean z) {
        this.f10308a.mo27801f(z);
    }

    public void registerOnMeasurementEventListener(@NonNull C5414a aVar) {
        this.f10308a.mo27797b(aVar);
    }

    public void unregisterOnMeasurementEventListener(@NonNull C5414a aVar) {
        this.f10308a.mo27803h(aVar);
    }
}
