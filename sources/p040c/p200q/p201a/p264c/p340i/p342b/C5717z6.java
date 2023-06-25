package p040c.p200q.p201a.p264c.p340i.p342b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlinx.coroutines.DebugKt;

@TargetApi(14)
@MainThread
/* renamed from: c.q.a.c.i.b.z6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5717z6 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e */
    public final /* synthetic */ C5423a7 f11196e;

    public /* synthetic */ C5717z6(C5423a7 a7Var, C5706y6 y6Var) {
        this.f11196e = a7Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C5648t4 t4Var;
        try {
            this.f11196e.f10699a.mo28487b().mo28343v().mo28259a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                t4Var = this.f11196e.f10699a;
            } else {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f11196e.f10699a.mo28629N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f11196e.f10699a.mo28486a().mo28540z(new C5695x6(this, z, data, str, queryParameter));
                        t4Var = this.f11196e.f10699a;
                    }
                }
                t4Var = this.f11196e.f10699a;
            }
        } catch (RuntimeException e) {
            this.f11196e.f10699a.mo28487b().mo28339r().mo28260b("Throwable caught in onActivityCreated", e);
            t4Var = this.f11196e.f10699a;
        } catch (Throwable th) {
            this.f11196e.f10699a.mo28626K().mo28554y(activity, bundle);
            throw th;
        }
        t4Var.mo28626K().mo28554y(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f11196e.f10699a.mo28626K().mo28555z(activity);
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f11196e.f10699a.mo28626K().mo28542A(activity);
        C5509h9 M = this.f11196e.f10699a.mo28628M();
        M.f10699a.mo28486a().mo28540z(new C5719z8(M, M.f10699a.mo28488c().mo20839b()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        C5509h9 M = this.f11196e.f10699a.mo28628M();
        M.f10699a.mo28486a().mo28540z(new C5708y8(M, M.f10699a.mo28488c().mo20839b()));
        this.f11196e.f10699a.mo28626K().mo28543B(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f11196e.f10699a.mo28626K().mo28544C(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
