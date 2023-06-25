package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p335i.C5303v2;
import p040c.p200q.p201a.p264c.p340i.p342b.C5435b7;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p364k.C6354b;
import p040c.p200q.p363c.p394v.C6767h;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
public final class FirebaseAnalytics {

    /* renamed from: b */
    public static volatile FirebaseAnalytics f15312b;

    /* renamed from: a */
    public final C5303v2 f15313a;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE
    }

    public FirebaseAnalytics(C5303v2 v2Var) {
        C3495o.m8908j(v2Var);
        this.f15313a = v2Var;
    }

    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f15312b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f15312b == null) {
                    f15312b = new FirebaseAnalytics(C5303v2.m15090u(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f15312b;
    }

    @Keep
    @Nullable
    public static C5435b7 getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        C5303v2 u = C5303v2.m15090u(context, (String) null, (String) null, (String) null, bundle);
        if (u == null) {
            return null;
        }
        return new C6354b(u);
    }

    /* renamed from: a */
    public void mo37291a(@Size(max = 40, min = 1) @NonNull String str, @Nullable Bundle bundle) {
        this.f15313a.mo27794I(str, bundle);
    }

    /* renamed from: b */
    public void mo37292b(@NonNull Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", JuDistPlugin.PERMISSION_DENIED);
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", JuDistPlugin.PERMISSION_DENIED);
            }
        }
        this.f15313a.mo27799d(bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C5777m.m16410b(C6767h.m19128l().getId(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @MainThread
    @Deprecated
    @Keep
    public void setCurrentScreen(@NonNull Activity activity, @Size(max = 36, min = 1) @Nullable String str, @Size(max = 36, min = 1) @Nullable String str2) {
        this.f15313a.mo27800e(activity, str, str2);
    }
}
