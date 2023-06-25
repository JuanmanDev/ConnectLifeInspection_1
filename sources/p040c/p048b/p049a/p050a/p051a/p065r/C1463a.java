package p040c.p048b.p049a.p050a.p051a.p065r;

import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$FUTURE_TYPE;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p064q.C1462a;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.r.a */
/* compiled from: AuthzCallbackFuture */
public class C1463a extends C1466c implements C1412a {

    /* renamed from: q */
    public static final String f636q = C1463a.class.getName();

    /* renamed from: p */
    public Bundle f637p;

    /* renamed from: c.b.a.a.a.r.a$a */
    /* compiled from: AuthzCallbackFuture */
    public class C1464a implements C1412a {

        /* renamed from: e */
        public final /* synthetic */ C1462a f638e;

        public C1464a(C1462a aVar) {
            this.f638e = aVar;
        }

        /* renamed from: b */
        public void mo15065a(AuthError authError) {
            C1462a aVar = this.f638e;
            if (aVar != null) {
                aVar.mo15067b(authError);
            }
        }

        /* renamed from: c */
        public void onSuccess(Bundle bundle) {
            C1462a aVar = this.f638e;
            if (aVar != null) {
                aVar.mo15068c(bundle);
            }
        }

        /* renamed from: e */
        public void mo15069e(Bundle bundle) {
            C1485a.m838k(C1463a.f636q, "onCancel called in for APIListener");
        }
    }

    public C1463a() {
        this((C1412a) null);
    }

    /* renamed from: e */
    public void mo15069e(Bundle bundle) {
        this.f637p = bundle;
        bundle.putSerializable(AuthzConstants$BUNDLE_KEY.FUTURE.val, AuthzConstants$FUTURE_TYPE.CANCEL);
        this.f642l.countDown();
        this.f641e.mo15069e(this.f637p);
    }

    /* renamed from: g */
    public Bundle mo15329g() {
        Bundle bundle = this.f637p;
        if (bundle != null) {
            return bundle;
        }
        return super.mo15329g();
    }

    public C1463a(C1412a aVar) {
        super(aVar);
    }

    public C1463a(C1462a aVar) {
        super(new C1464a(aVar));
    }
}
