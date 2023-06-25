package p040c.p200q.p201a.p264c.p294g.p335i;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import p040c.p200q.p201a.p264c.p292e.C3585a;

/* renamed from: c.q.a.c.g.i.e1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public interface C5040e1 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C5088h1 h1Var);

    void getAppInstanceId(C5088h1 h1Var);

    void getCachedAppInstanceId(C5088h1 h1Var);

    void getConditionalUserProperties(String str, String str2, C5088h1 h1Var);

    void getCurrentScreenClass(C5088h1 h1Var);

    void getCurrentScreenName(C5088h1 h1Var);

    void getGmpAppId(C5088h1 h1Var);

    void getMaxUserProperties(String str, C5088h1 h1Var);

    void getSessionId(C5088h1 h1Var);

    void getTestFlag(C5088h1 h1Var, int i);

    void getUserProperties(String str, String str2, boolean z, C5088h1 h1Var);

    void initForTests(Map map);

    void initialize(C3585a aVar, zzcl zzcl, long j);

    void isDataCollectionEnabled(C5088h1 h1Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C5088h1 h1Var, long j);

    void logHealthData(int i, String str, C3585a aVar, C3585a aVar2, C3585a aVar3);

    void onActivityCreated(C3585a aVar, Bundle bundle, long j);

    void onActivityDestroyed(C3585a aVar, long j);

    void onActivityPaused(C3585a aVar, long j);

    void onActivityResumed(C3585a aVar, long j);

    void onActivitySaveInstanceState(C3585a aVar, C5088h1 h1Var, long j);

    void onActivityStarted(C3585a aVar, long j);

    void onActivityStopped(C3585a aVar, long j);

    void performAction(Bundle bundle, C5088h1 h1Var, long j);

    void registerOnMeasurementEventListener(C5136k1 k1Var);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(C3585a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C5136k1 k1Var);

    void setInstanceIdProvider(C5167m1 m1Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C3585a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C5136k1 k1Var);
}
