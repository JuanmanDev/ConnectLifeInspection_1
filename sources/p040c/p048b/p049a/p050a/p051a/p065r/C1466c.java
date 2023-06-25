package p040c.p048b.p049a.p050a.p051a.p065r;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$FUTURE_TYPE;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p064q.C1462a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.r.c */
/* compiled from: MAPCallbackFuture */
public class C1466c implements Future<Bundle>, C1462a {

    /* renamed from: o */
    public static final String f640o = C1466c.class.getName();

    /* renamed from: e */
    public final C1412a f641e;

    /* renamed from: l */
    public final CountDownLatch f642l;

    /* renamed from: m */
    public Bundle f643m;

    /* renamed from: n */
    public AuthError f644n;

    public C1466c() {
        this((C1412a) null);
    }

    /* renamed from: b */
    public void mo15065a(AuthError authError) {
        this.f644n = authError;
        this.f642l.countDown();
        this.f641e.mo15067b(authError);
    }

    /* renamed from: c */
    public void onSuccess(Bundle bundle) {
        this.f643m = bundle;
        if (bundle == null) {
            C1485a.m838k(f640o, "Null Response");
            this.f643m = new Bundle();
        }
        this.f643m.putSerializable(AuthzConstants$BUNDLE_KEY.FUTURE.val, AuthzConstants$FUTURE_TYPE.SUCCESS);
        this.f642l.countDown();
        this.f641e.mo15068c(bundle);
    }

    public boolean cancel(boolean z) {
        return false;
    }

    /* renamed from: d */
    public Bundle get() {
        mo15335h();
        C1485a.m832e(f640o, "Running get on Future");
        this.f642l.await();
        return mo15329g();
    }

    /* renamed from: f */
    public Bundle get(long j, TimeUnit timeUnit) {
        mo15335h();
        String str = f640o;
        C1485a.m832e(str, "Running get on Future with timeout=" + j + "unit=" + timeUnit.name());
        this.f642l.await(j, timeUnit);
        return mo15329g();
    }

    /* renamed from: g */
    public Bundle mo15329g() {
        AuthError authError = this.f644n;
        if (authError == null) {
            return this.f643m;
        }
        Bundle errorBundle = AuthError.getErrorBundle(authError);
        errorBundle.putSerializable(AuthzConstants$BUNDLE_KEY.FUTURE.val, AuthzConstants$FUTURE_TYPE.ERROR);
        return errorBundle;
    }

    /* renamed from: h */
    public final void mo15335h() {
        if (C1467d.m792b()) {
            C1485a.m829b(f640o, "Cannot call get on the main thread, unless you want ANRs");
            throw new IllegalStateException("Cannot call get on the main thread, unless you want ANRs");
        }
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return this.f642l.getCount() == 0;
    }

    public C1466c(C1412a aVar) {
        this.f641e = aVar == null ? new C1465b() : aVar;
        this.f642l = new CountDownLatch(1);
    }
}
