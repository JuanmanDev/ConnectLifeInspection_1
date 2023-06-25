package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p292e.C3587b;
import p040c.p200q.p201a.p264c.p294g.p335i.C5024d1;
import p040c.p200q.p201a.p264c.p294g.p335i.C5088h1;
import p040c.p200q.p201a.p264c.p294g.p335i.C5136k1;
import p040c.p200q.p201a.p264c.p294g.p335i.C5167m1;
import p040c.p200q.p201a.p264c.p340i.p342b.C5422a6;
import p040c.p200q.p201a.p264c.p340i.p342b.C5423a7;
import p040c.p200q.p201a.p264c.p340i.p342b.C5459d7;
import p040c.p200q.p201a.p264c.p340i.p342b.C5460d8;
import p040c.p200q.p201a.p264c.p340i.p342b.C5470e6;
import p040c.p200q.p201a.p264c.p340i.p342b.C5473e9;
import p040c.p200q.p201a.p264c.p340i.p342b.C5474ea;
import p040c.p200q.p201a.p264c.p340i.p342b.C5498ga;
import p040c.p200q.p201a.p264c.p340i.p342b.C5507h7;
import p040c.p200q.p201a.p264c.p340i.p342b.C5510ha;
import p040c.p200q.p201a.p264c.p340i.p342b.C5522ia;
import p040c.p200q.p201a.p264c.p340i.p342b.C5534ja;
import p040c.p200q.p201a.p264c.p340i.p342b.C5546ka;
import p040c.p200q.p201a.p264c.p340i.p342b.C5578n6;
import p040c.p200q.p201a.p264c.p340i.p342b.C5648t4;
import p040c.p200q.p201a.p264c.p340i.p342b.C5672v5;
import p040c.p200q.p201a.p264c.p340i.p342b.C5684w6;
import p040c.p200q.p201a.p264c.p340i.p342b.C5705y5;
import p040c.p200q.p201a.p264c.p340i.p342b.C5716z5;
import p040c.p200q.p201a.p264c.p340i.p342b.C5717z6;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
public class AppMeasurementDynamiteService extends C5024d1 {

    /* renamed from: e */
    public C5648t4 f14885e = null;
    @GuardedBy("listenerMap")

    /* renamed from: l */
    public final Map f14886l = new ArrayMap();

    public void beginAdUnitExposure(@NonNull String str, long j) {
        mo33654e();
        this.f14885e.mo28648y().mo28768l(str, j);
    }

    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        mo33654e();
        this.f14885e.mo28624I().mo28062o(str, str2, bundle);
    }

    public void clearMeasurementEnabled(long j) {
        mo33654e();
        this.f14885e.mo28624I().mo28041I((Boolean) null);
    }

    @EnsuresNonNull({"scion"})
    /* renamed from: e */
    public final void mo33654e() {
        if (this.f14885e == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void endAdUnitExposure(@NonNull String str, long j) {
        mo33654e();
        this.f14885e.mo28648y().mo28769m(str, j);
    }

    /* renamed from: g */
    public final void mo33655g(C5088h1 h1Var, String str) {
        mo33654e();
        this.f14885e.mo28629N().mo28279J(h1Var, str);
    }

    public void generateEventId(C5088h1 h1Var) {
        mo33654e();
        long r0 = this.f14885e.mo28629N().mo28308r0();
        mo33654e();
        this.f14885e.mo28629N().mo28278I(h1Var, r0);
    }

    public void getAppInstanceId(C5088h1 h1Var) {
        mo33654e();
        this.f14885e.mo28486a().mo28540z(new C5459d7(this, h1Var));
    }

    public void getCachedAppInstanceId(C5088h1 h1Var) {
        mo33654e();
        mo33655g(h1Var, this.f14885e.mo28624I().mo28054V());
    }

    public void getConditionalUserProperties(String str, String str2, C5088h1 h1Var) {
        mo33654e();
        this.f14885e.mo28486a().mo28540z(new C5510ha(this, h1Var, str, str2));
    }

    public void getCurrentScreenClass(C5088h1 h1Var) {
        mo33654e();
        mo33655g(h1Var, this.f14885e.mo28624I().mo28055W());
    }

    public void getCurrentScreenName(C5088h1 h1Var) {
        mo33654e();
        mo33655g(h1Var, this.f14885e.mo28624I().mo28056X());
    }

    public void getGmpAppId(C5088h1 h1Var) {
        String str;
        mo33654e();
        C5423a7 I = this.f14885e.mo28624I();
        if (I.f10699a.mo28630O() != null) {
            str = I.f10699a.mo28630O();
        } else {
            try {
                str = C5507h7.m15764b(I.f10699a.mo28490f(), "google_app_id", I.f10699a.mo28633R());
            } catch (IllegalStateException e) {
                I.f10699a.mo28487b().mo28339r().mo28260b("getGoogleAppId failed with exception", e);
                str = null;
            }
        }
        mo33655g(h1Var, str);
    }

    public void getMaxUserProperties(String str, C5088h1 h1Var) {
        mo33654e();
        this.f14885e.mo28624I().mo28049Q(str);
        mo33654e();
        this.f14885e.mo28629N().mo28277H(h1Var, 25);
    }

    public void getSessionId(C5088h1 h1Var) {
        mo33654e();
        C5423a7 I = this.f14885e.mo28624I();
        I.f10699a.mo28486a().mo28540z(new C5578n6(I, h1Var));
    }

    public void getTestFlag(C5088h1 h1Var, int i) {
        mo33654e();
        if (i == 0) {
            this.f14885e.mo28629N().mo28279J(h1Var, this.f14885e.mo28624I().mo28057Y());
        } else if (i == 1) {
            this.f14885e.mo28629N().mo28278I(h1Var, this.f14885e.mo28624I().mo28053U().longValue());
        } else if (i == 2) {
            C5498ga N = this.f14885e.mo28629N();
            double doubleValue = this.f14885e.mo28624I().mo28051S().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", doubleValue);
            try {
                h1Var.mo26910D(bundle);
            } catch (RemoteException e) {
                N.f10699a.mo28487b().mo28344w().mo28260b("Error returning double value to wrapper", e);
            }
        } else if (i == 3) {
            this.f14885e.mo28629N().mo28277H(h1Var, this.f14885e.mo28624I().mo28052T().intValue());
        } else if (i == 4) {
            this.f14885e.mo28629N().mo28273D(h1Var, this.f14885e.mo28624I().mo28050R().booleanValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C5088h1 h1Var) {
        mo33654e();
        this.f14885e.mo28486a().mo28540z(new C5473e9(this, h1Var, str, str2, z));
    }

    public void initForTests(@NonNull Map map) {
        mo33654e();
    }

    public void initialize(C3585a aVar, zzcl zzcl, long j) {
        C5648t4 t4Var = this.f14885e;
        if (t4Var == null) {
            Context context = (Context) C3587b.m9123g(aVar);
            C3495o.m8908j(context);
            this.f14885e = C5648t4.m16090H(context, zzcl, Long.valueOf(j));
            return;
        }
        t4Var.mo28487b().mo28344w().mo28259a("Attempting to initialize multiple times");
    }

    public void isDataCollectionEnabled(C5088h1 h1Var) {
        mo33654e();
        this.f14885e.mo28486a().mo28540z(new C5522ia(this, h1Var));
    }

    public void logEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, boolean z, boolean z2, long j) {
        mo33654e();
        this.f14885e.mo28624I().mo28066s(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C5088h1 h1Var, long j) {
        Bundle bundle2;
        mo33654e();
        C3495o.m8904f(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f14885e.mo28486a().mo28540z(new C5460d8(this, h1Var, new zzaw(str2, new zzau(bundle), "app", j), str));
    }

    public void logHealthData(int i, @NonNull String str, @NonNull C3585a aVar, @NonNull C3585a aVar2, @NonNull C3585a aVar3) {
        Object obj;
        Object obj2;
        mo33654e();
        Object obj3 = null;
        if (aVar == null) {
            obj = null;
        } else {
            obj = C3587b.m9123g(aVar);
        }
        if (aVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C3587b.m9123g(aVar2);
        }
        if (aVar3 != null) {
            obj3 = C3587b.m9123g(aVar3);
        }
        this.f14885e.mo28487b().mo28337F(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(@NonNull C3585a aVar, @NonNull Bundle bundle, long j) {
        mo33654e();
        C5717z6 z6Var = this.f14885e.mo28624I().f10322c;
        if (z6Var != null) {
            this.f14885e.mo28624I().mo28063p();
            z6Var.onActivityCreated((Activity) C3587b.m9123g(aVar), bundle);
        }
    }

    public void onActivityDestroyed(@NonNull C3585a aVar, long j) {
        mo33654e();
        C5717z6 z6Var = this.f14885e.mo28624I().f10322c;
        if (z6Var != null) {
            this.f14885e.mo28624I().mo28063p();
            z6Var.onActivityDestroyed((Activity) C3587b.m9123g(aVar));
        }
    }

    public void onActivityPaused(@NonNull C3585a aVar, long j) {
        mo33654e();
        C5717z6 z6Var = this.f14885e.mo28624I().f10322c;
        if (z6Var != null) {
            this.f14885e.mo28624I().mo28063p();
            z6Var.onActivityPaused((Activity) C3587b.m9123g(aVar));
        }
    }

    public void onActivityResumed(@NonNull C3585a aVar, long j) {
        mo33654e();
        C5717z6 z6Var = this.f14885e.mo28624I().f10322c;
        if (z6Var != null) {
            this.f14885e.mo28624I().mo28063p();
            z6Var.onActivityResumed((Activity) C3587b.m9123g(aVar));
        }
    }

    public void onActivitySaveInstanceState(C3585a aVar, C5088h1 h1Var, long j) {
        mo33654e();
        C5717z6 z6Var = this.f14885e.mo28624I().f10322c;
        Bundle bundle = new Bundle();
        if (z6Var != null) {
            this.f14885e.mo28624I().mo28063p();
            z6Var.onActivitySaveInstanceState((Activity) C3587b.m9123g(aVar), bundle);
        }
        try {
            h1Var.mo26910D(bundle);
        } catch (RemoteException e) {
            this.f14885e.mo28487b().mo28344w().mo28260b("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(@NonNull C3585a aVar, long j) {
        mo33654e();
        if (this.f14885e.mo28624I().f10322c != null) {
            this.f14885e.mo28624I().mo28063p();
            Activity activity = (Activity) C3587b.m9123g(aVar);
        }
    }

    public void onActivityStopped(@NonNull C3585a aVar, long j) {
        mo33654e();
        if (this.f14885e.mo28624I().f10322c != null) {
            this.f14885e.mo28624I().mo28063p();
            Activity activity = (Activity) C3587b.m9123g(aVar);
        }
    }

    public void performAction(Bundle bundle, C5088h1 h1Var, long j) {
        mo33654e();
        h1Var.mo26910D((Bundle) null);
    }

    public void registerOnMeasurementEventListener(C5136k1 k1Var) {
        C5672v5 v5Var;
        mo33654e();
        synchronized (this.f14886l) {
            v5Var = (C5672v5) this.f14886l.get(Integer.valueOf(k1Var.mo27312c()));
            if (v5Var == null) {
                v5Var = new C5546ka(this, k1Var);
                this.f14886l.put(Integer.valueOf(k1Var.mo27312c()), v5Var);
            }
        }
        this.f14885e.mo28624I().mo28071x(v5Var);
    }

    public void resetAnalyticsData(long j) {
        mo33654e();
        this.f14885e.mo28624I().mo28072y(j);
    }

    public void setConditionalUserProperty(@NonNull Bundle bundle, long j) {
        mo33654e();
        if (bundle == null) {
            this.f14885e.mo28487b().mo28339r().mo28259a("Conditional user property must not be null");
        } else {
            this.f14885e.mo28624I().mo28037E(bundle, j);
        }
    }

    public void setConsent(@NonNull Bundle bundle, long j) {
        mo33654e();
        C5423a7 I = this.f14885e.mo28624I();
        I.f10699a.mo28486a().mo28533A(new C5705y5(I, bundle, j));
    }

    public void setConsentThirdParty(@NonNull Bundle bundle, long j) {
        mo33654e();
        this.f14885e.mo28624I().mo28038F(bundle, -20, j);
    }

    public void setCurrentScreen(@NonNull C3585a aVar, @NonNull String str, @NonNull String str2, long j) {
        mo33654e();
        this.f14885e.mo28626K().mo28545D((Activity) C3587b.m9123g(aVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) {
        mo33654e();
        C5423a7 I = this.f14885e.mo28624I();
        I.mo28106i();
        I.f10699a.mo28486a().mo28540z(new C5684w6(I, z));
    }

    public void setDefaultEventParameters(@NonNull Bundle bundle) {
        Bundle bundle2;
        mo33654e();
        C5423a7 I = this.f14885e.mo28624I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        I.f10699a.mo28486a().mo28540z(new C5716z5(I, bundle2));
    }

    public void setEventInterceptor(C5136k1 k1Var) {
        mo33654e();
        C5534ja jaVar = new C5534ja(this, k1Var);
        if (this.f14885e.mo28486a().mo28534C()) {
            this.f14885e.mo28624I().mo28040H(jaVar);
        } else {
            this.f14885e.mo28486a().mo28540z(new C5474ea(this, jaVar));
        }
    }

    public void setInstanceIdProvider(C5167m1 m1Var) {
        mo33654e();
    }

    public void setMeasurementEnabled(boolean z, long j) {
        mo33654e();
        this.f14885e.mo28624I().mo28041I(Boolean.valueOf(z));
    }

    public void setMinimumSessionDuration(long j) {
        mo33654e();
    }

    public void setSessionTimeoutDuration(long j) {
        mo33654e();
        C5423a7 I = this.f14885e.mo28624I();
        I.f10699a.mo28486a().mo28540z(new C5470e6(I, j));
    }

    public void setUserId(@NonNull String str, long j) {
        mo33654e();
        C5423a7 I = this.f14885e.mo28624I();
        if (str == null || !TextUtils.isEmpty(str)) {
            I.f10699a.mo28486a().mo28540z(new C5422a6(I, str));
            I.mo28044L((String) null, "_id", str, true, j);
            return;
        }
        I.f10699a.mo28487b().mo28344w().mo28259a("User ID must be non-empty or null");
    }

    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull C3585a aVar, boolean z, long j) {
        mo33654e();
        this.f14885e.mo28624I().mo28044L(str, str2, C3587b.m9123g(aVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C5136k1 k1Var) {
        C5672v5 v5Var;
        mo33654e();
        synchronized (this.f14886l) {
            v5Var = (C5672v5) this.f14886l.remove(Integer.valueOf(k1Var.mo27312c()));
        }
        if (v5Var == null) {
            v5Var = new C5546ka(this, k1Var);
        }
        this.f14885e.mo28624I().mo28046N(v5Var);
    }
}
