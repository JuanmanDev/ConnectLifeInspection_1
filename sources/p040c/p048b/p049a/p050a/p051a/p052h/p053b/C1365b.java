package p040c.p048b.p049a.p050a.p051a.p052h.p053b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthCancellation;
import com.amazon.identity.auth.device.api.authorization.AuthorizeResult;
import com.amazon.identity.auth.device.api.authorization.User;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import p040c.p048b.p049a.p050a.p051a.p052h.C1361a;
import p040c.p048b.p049a.p050a.p051a.p056j.C1387f;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p062o.C1450d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.h.b.b */
/* compiled from: AuthorizeListener */
public abstract class C1365b implements C1450d<AuthorizeResult, AuthCancellation, AuthError> {

    /* renamed from: e */
    public static final String f397e = "c.b.a.a.a.h.b.b";

    /* renamed from: c.b.a.a.a.h.b.b$a */
    /* compiled from: AuthorizeListener */
    public class C1366a implements C1412a {

        /* renamed from: e */
        public final /* synthetic */ Context f398e;

        /* renamed from: l */
        public final /* synthetic */ boolean f399l;

        public C1366a(Context context, boolean z) {
            this.f398e = context;
            this.f399l = z;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            C1365b.this.mo15070a(authError);
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            C1365b.m306h(this.f398e, bundle, C1365b.this, this.f399l);
        }

        /* renamed from: e */
        public void mo15069e(Bundle bundle) {
            C1365b.this.onCancel(new AuthCancellation(bundle));
        }
    }

    /* renamed from: c.b.a.a.a.h.b.b$b */
    /* compiled from: AuthorizeListener */
    public static class C1367b implements C1361a<User, AuthError> {

        /* renamed from: e */
        public final /* synthetic */ C1450d f401e;

        /* renamed from: l */
        public final /* synthetic */ Bundle f402l;

        public C1367b(C1450d dVar, Bundle bundle) {
            this.f401e = dVar;
            this.f402l = bundle;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            this.f401e.mo15070a(authError);
        }

        /* renamed from: d */
        public void onSuccess(User user) {
            this.f401e.onSuccess(new AuthorizeResult(this.f402l, user));
        }
    }

    /* renamed from: g */
    public static void m305g(Context context, Bundle bundle, C1450d<AuthorizeResult, AuthCancellation, AuthError> dVar) {
        C1485a.m832e(f397e, "Fetching User as part of authorize request");
        User.m9453a(context, new C1367b(dVar, bundle));
    }

    /* renamed from: h */
    public static void m306h(Context context, Bundle bundle, C1450d<AuthorizeResult, AuthCancellation, AuthError> dVar, boolean z) {
        if (bundle.getString(AuthzConstants$BUNDLE_KEY.AUTHORIZATION_CODE.val) != null || !z) {
            dVar.onSuccess(new AuthorizeResult(bundle));
        } else {
            m305g(context, bundle, dVar);
        }
    }

    /* renamed from: b */
    public abstract void mo15070a(AuthError authError);

    /* renamed from: d */
    public final String mo15072d() {
        return "com.amazon.identity.auth.device.authorization.request.authorize";
    }

    /* renamed from: f */
    public final void mo15073f(Context context, InteractiveRequestRecord interactiveRequestRecord, Uri uri) {
        Bundle b = interactiveRequestRecord.mo21523b();
        C1387f.m384b(context, uri, b.getStringArray("requestedScopes"), true, new C1366a(context, b.getBoolean("shouldReturnUserData")));
    }

    /* renamed from: i */
    public abstract void onCancel(AuthCancellation authCancellation);

    /* renamed from: j */
    public abstract void onSuccess(AuthorizeResult authorizeResult);
}
