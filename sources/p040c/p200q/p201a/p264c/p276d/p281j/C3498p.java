package p040c.p200q.p201a.p264c.p276d.p281j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* renamed from: c.q.a.c.d.j.p */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3498p {
    @Nullable

    /* renamed from: b */
    public static C3498p f6493b;

    /* renamed from: c */
    public static final RootTelemetryConfiguration f6494c = new RootTelemetryConfiguration(0, false, false, 0, 0);
    @Nullable

    /* renamed from: a */
    public RootTelemetryConfiguration f6495a;

    @NonNull
    /* renamed from: b */
    public static synchronized C3498p m8924b() {
        C3498p pVar;
        synchronized (C3498p.class) {
            if (f6493b == null) {
                f6493b = new C3498p();
            }
            pVar = f6493b;
        }
        return pVar;
    }

    @Nullable
    /* renamed from: a */
    public RootTelemetryConfiguration mo20773a() {
        return this.f6495a;
    }

    /* renamed from: c */
    public final synchronized void mo20774c(@Nullable RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f6495a = f6494c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f6495a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.getVersion() < rootTelemetryConfiguration.getVersion()) {
            this.f6495a = rootTelemetryConfiguration;
        }
    }
}
