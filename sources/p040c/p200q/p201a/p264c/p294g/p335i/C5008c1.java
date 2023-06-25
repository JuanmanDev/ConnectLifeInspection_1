package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import p040c.p200q.p201a.p264c.p292e.C3585a;

/* renamed from: c.q.a.c.g.i.c1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5008c1 extends C5181n0 implements C5040e1 {
    public C5008c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeLong(j);
        mo27446g(23, d);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14619e(d, bundle);
        mo27446g(9, d);
    }

    public final void clearMeasurementEnabled(long j) {
        Parcel d = mo27444d();
        d.writeLong(j);
        mo27446g(43, d);
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeLong(j);
        mo27446g(24, d);
    }

    public final void generateEventId(C5088h1 h1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        mo27446g(22, d);
    }

    public final void getAppInstanceId(C5088h1 h1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        mo27446g(20, d);
    }

    public final void getCachedAppInstanceId(C5088h1 h1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        mo27446g(19, d);
    }

    public final void getConditionalUserProperties(String str, String str2, C5088h1 h1Var) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14620f(d, h1Var);
        mo27446g(10, d);
    }

    public final void getCurrentScreenClass(C5088h1 h1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        mo27446g(17, d);
    }

    public final void getCurrentScreenName(C5088h1 h1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        mo27446g(16, d);
    }

    public final void getGmpAppId(C5088h1 h1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        mo27446g(21, d);
    }

    public final void getMaxUserProperties(String str, C5088h1 h1Var) {
        Parcel d = mo27444d();
        d.writeString(str);
        C5211p0.m14620f(d, h1Var);
        mo27446g(6, d);
    }

    public final void getSessionId(C5088h1 h1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        mo27446g(46, d);
    }

    public final void getTestFlag(C5088h1 h1Var, int i) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, h1Var);
        d.writeInt(i);
        mo27446g(38, d);
    }

    public final void getUserProperties(String str, String str2, boolean z, C5088h1 h1Var) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14618d(d, z);
        C5211p0.m14620f(d, h1Var);
        mo27446g(5, d);
    }

    public final void initForTests(Map map) {
        throw null;
    }

    public final void initialize(C3585a aVar, zzcl zzcl, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        C5211p0.m14619e(d, zzcl);
        d.writeLong(j);
        mo27446g(1, d);
    }

    public final void isDataCollectionEnabled(C5088h1 h1Var) {
        throw null;
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14619e(d, bundle);
        C5211p0.m14618d(d, z);
        C5211p0.m14618d(d, z2);
        d.writeLong(j);
        mo27446g(2, d);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C5088h1 h1Var, long j) {
        throw null;
    }

    public final void logHealthData(int i, String str, C3585a aVar, C3585a aVar2, C3585a aVar3) {
        Parcel d = mo27444d();
        d.writeInt(5);
        d.writeString(str);
        C5211p0.m14620f(d, aVar);
        C5211p0.m14620f(d, aVar2);
        C5211p0.m14620f(d, aVar3);
        mo27446g(33, d);
    }

    public final void onActivityCreated(C3585a aVar, Bundle bundle, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        C5211p0.m14619e(d, bundle);
        d.writeLong(j);
        mo27446g(27, d);
    }

    public final void onActivityDestroyed(C3585a aVar, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        d.writeLong(j);
        mo27446g(28, d);
    }

    public final void onActivityPaused(C3585a aVar, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        d.writeLong(j);
        mo27446g(29, d);
    }

    public final void onActivityResumed(C3585a aVar, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        d.writeLong(j);
        mo27446g(30, d);
    }

    public final void onActivitySaveInstanceState(C3585a aVar, C5088h1 h1Var, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        C5211p0.m14620f(d, h1Var);
        d.writeLong(j);
        mo27446g(31, d);
    }

    public final void onActivityStarted(C3585a aVar, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        d.writeLong(j);
        mo27446g(25, d);
    }

    public final void onActivityStopped(C3585a aVar, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        d.writeLong(j);
        mo27446g(26, d);
    }

    public final void performAction(Bundle bundle, C5088h1 h1Var, long j) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, bundle);
        C5211p0.m14620f(d, h1Var);
        d.writeLong(j);
        mo27446g(32, d);
    }

    public final void registerOnMeasurementEventListener(C5136k1 k1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, k1Var);
        mo27446g(35, d);
    }

    public final void resetAnalyticsData(long j) {
        Parcel d = mo27444d();
        d.writeLong(j);
        mo27446g(12, d);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, bundle);
        d.writeLong(j);
        mo27446g(8, d);
    }

    public final void setConsent(Bundle bundle, long j) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, bundle);
        d.writeLong(j);
        mo27446g(44, d);
    }

    public final void setConsentThirdParty(Bundle bundle, long j) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, bundle);
        d.writeLong(j);
        mo27446g(45, d);
    }

    public final void setCurrentScreen(C3585a aVar, String str, String str2, long j) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, aVar);
        d.writeString(str);
        d.writeString(str2);
        d.writeLong(j);
        mo27446g(15, d);
    }

    public final void setDataCollectionEnabled(boolean z) {
        Parcel d = mo27444d();
        C5211p0.m14618d(d, z);
        mo27446g(39, d);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, bundle);
        mo27446g(42, d);
    }

    public final void setEventInterceptor(C5136k1 k1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, k1Var);
        mo27446g(34, d);
    }

    public final void setInstanceIdProvider(C5167m1 m1Var) {
        throw null;
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel d = mo27444d();
        C5211p0.m14618d(d, z);
        d.writeLong(j);
        mo27446g(11, d);
    }

    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    public final void setSessionTimeoutDuration(long j) {
        Parcel d = mo27444d();
        d.writeLong(j);
        mo27446g(14, d);
    }

    public final void setUserId(String str, long j) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeLong(j);
        mo27446g(7, d);
    }

    public final void setUserProperty(String str, String str2, C3585a aVar, boolean z, long j) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14620f(d, aVar);
        C5211p0.m14618d(d, z);
        d.writeLong(j);
        mo27446g(4, d);
    }

    public final void unregisterOnMeasurementEventListener(C5136k1 k1Var) {
        Parcel d = mo27444d();
        C5211p0.m14620f(d, k1Var);
        mo27446g(36, d);
    }
}
