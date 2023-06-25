package com.google.android.gms.measurement;

import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p340i.C5721c;
import p040c.p200q.p201a.p264c.p340i.C5722d;
import p040c.p200q.p201a.p264c.p340i.C5724f;
import p040c.p200q.p201a.p264c.p340i.p342b.C5435b7;
import p040c.p200q.p201a.p264c.p340i.p342b.C5613q5;
import p040c.p200q.p201a.p264c.p340i.p342b.C5648t4;
import p040c.p200q.p201a.p264c.p340i.p342b.C5672v5;

@Deprecated
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public class AppMeasurement {

    /* renamed from: b */
    public static volatile AppMeasurement f14880b;

    /* renamed from: a */
    public final C5724f f14881a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @NonNull
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @NonNull
        @Keep
        public String mExpiredEventName;
        @NonNull
        @Keep
        public Bundle mExpiredEventParams;
        @NonNull
        @Keep
        public String mName;
        @NonNull
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @NonNull
        @Keep
        public String mTimedOutEventName;
        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;
        @NonNull
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @NonNull
        @Keep
        public String mTriggeredEventName;
        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @NonNull
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(@NonNull Bundle bundle) {
            Class<Long> cls = Long.class;
            Class<String> cls2 = String.class;
            C3495o.m8908j(bundle);
            this.mAppId = (String) C5613q5.m15998a(bundle, "app_id", cls2, (Object) null);
            this.mOrigin = (String) C5613q5.m15998a(bundle, EventBusConstKt.ORIGIN, cls2, (Object) null);
            this.mName = (String) C5613q5.m15998a(bundle, "name", cls2, (Object) null);
            this.mValue = C5613q5.m15998a(bundle, "value", Object.class, (Object) null);
            this.mTriggerEventName = (String) C5613q5.m15998a(bundle, "trigger_event_name", cls2, (Object) null);
            this.mTriggerTimeout = ((Long) C5613q5.m15998a(bundle, "trigger_timeout", cls, 0L)).longValue();
            this.mTimedOutEventName = (String) C5613q5.m15998a(bundle, "timed_out_event_name", cls2, (Object) null);
            this.mTimedOutEventParams = (Bundle) C5613q5.m15998a(bundle, "timed_out_event_params", Bundle.class, (Object) null);
            this.mTriggeredEventName = (String) C5613q5.m15998a(bundle, "triggered_event_name", cls2, (Object) null);
            this.mTriggeredEventParams = (Bundle) C5613q5.m15998a(bundle, "triggered_event_params", Bundle.class, (Object) null);
            this.mTimeToLive = ((Long) C5613q5.m15998a(bundle, "time_to_live", cls, 0L)).longValue();
            this.mExpiredEventName = (String) C5613q5.m15998a(bundle, "expired_event_name", cls2, (Object) null);
            this.mExpiredEventParams = (Bundle) C5613q5.m15998a(bundle, "expired_event_params", Bundle.class, (Object) null);
            this.mActive = ((Boolean) C5613q5.m15998a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C5613q5.m15998a(bundle, "creation_timestamp", cls, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C5613q5.m15998a(bundle, "triggered_timestamp", cls, 0L)).longValue();
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
    public interface C7827a extends C5672v5 {
    }

    public AppMeasurement(C5648t4 t4Var) {
        this.f14881a = new C5721c(t4Var);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @androidx.annotation.Keep
    @androidx.annotation.RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @androidx.annotation.NonNull
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.measurement.AppMeasurement getInstance(@androidx.annotation.NonNull android.content.Context r14) {
        /*
            com.google.android.gms.measurement.AppMeasurement r0 = f14880b
            if (r0 != 0) goto L_0x005d
            java.lang.Class<com.google.android.gms.measurement.AppMeasurement> r0 = com.google.android.gms.measurement.AppMeasurement.class
            monitor-enter(r0)
            com.google.android.gms.measurement.AppMeasurement r1 = f14880b     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            r1 = 0
            java.lang.String r2 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x0032 }
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{  }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{  }
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            r7 = 1
            r4[r7] = r5     // Catch:{  }
            java.lang.String r5 = "getScionFrontendApiImplementation"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r4)     // Catch:{  }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{  }
            r3[r6] = r14     // Catch:{  }
            r3[r7] = r1     // Catch:{  }
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch:{  }
            c.q.a.c.i.b.b7 r2 = (p040c.p200q.p201a.p264c.p340i.p342b.C5435b7) r2     // Catch:{  }
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            if (r2 == 0) goto L_0x003d
            com.google.android.gms.measurement.AppMeasurement r14 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r14.<init>((p040c.p200q.p201a.p264c.p340i.p342b.C5435b7) r2)     // Catch:{ all -> 0x005a }
            f14880b = r14     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x003d:
            com.google.android.gms.internal.measurement.zzcl r13 = new com.google.android.gms.internal.measurement.zzcl     // Catch:{ all -> 0x005a }
            r3 = 0
            r5 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r13
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x005a }
            c.q.a.c.i.b.t4 r14 = p040c.p200q.p201a.p264c.p340i.p342b.C5648t4.m16090H(r14, r13, r1)     // Catch:{ all -> 0x005a }
            com.google.android.gms.measurement.AppMeasurement r1 = new com.google.android.gms.measurement.AppMeasurement     // Catch:{ all -> 0x005a }
            r1.<init>((p040c.p200q.p201a.p264c.p340i.p342b.C5648t4) r14)     // Catch:{ all -> 0x005a }
            f14880b = r1     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r14
        L_0x005d:
            com.google.android.gms.measurement.AppMeasurement r14 = f14880b
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurement.getInstance(android.content.Context):com.google.android.gms.measurement.AppMeasurement");
    }

    @Keep
    public void beginAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f14881a.mo28123k(str);
    }

    @Keep
    public void clearConditionalUserProperty(@Size(max = 24, min = 1) @NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f14881a.mo28124l(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(@Size(min = 1) @NonNull String str) {
        this.f14881a.mo28127o(str);
    }

    @Keep
    public long generateEventId() {
        return this.f14881a.mo28113a();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f14881a.mo28117e();
    }

    @WorkerThread
    @Keep
    @NonNull
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @Size(max = 23, min = 1) @NonNull String str2) {
        int i;
        List<Bundle> b = this.f14881a.mo28114b(str, str2);
        if (b == null) {
            i = 0;
        } else {
            i = b.size();
        }
        ArrayList arrayList = new ArrayList(i);
        for (Bundle conditionalUserProperty : b) {
            arrayList.add(new ConditionalUserProperty(conditionalUserProperty));
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f14881a.mo28118f();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f14881a.mo28125m();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f14881a.mo28119g();
    }

    @WorkerThread
    @Keep
    public int getMaxUserProperties(@Size(min = 1) @NonNull String str) {
        return this.f14881a.mo28115c(str);
    }

    @WorkerThread
    @Keep
    @NonNull
    public Map<String, Object> getUserProperties(@NonNull String str, @Size(max = 24, min = 1) @NonNull String str2, boolean z) {
        return this.f14881a.mo28116d(str, str2, z);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f14881a.mo28121i(str, str2, bundle);
    }

    public void registerOnMeasurementEventListener(@NonNull C7827a aVar) {
        this.f14881a.mo28126n(aVar);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        C3495o.m8908j(conditionalUserProperty);
        C5724f fVar = this.f14881a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString(EventBusConstKt.ORIGIN, str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C5613q5.m15999b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        fVar.mo28120h(bundle);
    }

    public void unregisterOnMeasurementEventListener(@NonNull C7827a aVar) {
        this.f14881a.mo28122j(aVar);
    }

    public AppMeasurement(C5435b7 b7Var) {
        this.f14881a = new C5722d(b7Var);
    }
}
