package p040c.p048b.p049a.p050a.p051a.p056j;

import android.content.Context;
import android.os.Bundle;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.api.authorization.AuthorizeRequest;
import com.amazon.identity.auth.device.api.authorization.Region;
import com.amazon.identity.auth.device.authorization.api.AuthzConstants$BUNDLE_KEY;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import java.util.Arrays;
import java.util.concurrent.Future;
import p040c.p048b.p049a.p050a.p051a.C1360g;
import p040c.p048b.p049a.p050a.p051a.p052h.p053b.C1362a;
import p040c.p048b.p049a.p050a.p051a.p055i.C1378d;
import p040c.p048b.p049a.p050a.p051a.p056j.p057q.C1412a;
import p040c.p048b.p049a.p050a.p051a.p060m.C1443r;
import p040c.p048b.p049a.p050a.p051a.p061n.C1445b;
import p040c.p048b.p049a.p050a.p051a.p064q.C1462a;
import p040c.p048b.p049a.p050a.p051a.p065r.C1463a;
import p040c.p048b.p049a.p050a.p051a.p065r.C1467d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.j.h */
/* compiled from: InternalAuthManager */
public class C1390h {

    /* renamed from: c */
    public static final String f442c = "c.b.a.a.a.j.h";

    /* renamed from: d */
    public static final C1378d f443d = new C1378d();

    /* renamed from: e */
    public static final C1443r f444e = new C1443r();

    /* renamed from: f */
    public static C1390h f445f;

    /* renamed from: a */
    public String f446a;

    /* renamed from: b */
    public AppInfo f447b;

    /* renamed from: c.b.a.a.a.j.h$a */
    /* compiled from: InternalAuthManager */
    public class C1391a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Context f448e;

        /* renamed from: l */
        public final /* synthetic */ C1412a f449l;

        /* renamed from: m */
        public final /* synthetic */ Bundle f450m;

        /* renamed from: n */
        public final /* synthetic */ AuthorizeRequest f451n;

        /* renamed from: o */
        public final /* synthetic */ String[] f452o;

        public C1391a(Context context, C1412a aVar, Bundle bundle, AuthorizeRequest authorizeRequest, String[] strArr) {
            this.f448e = context;
            this.f449l = aVar;
            this.f450m = bundle;
            this.f451n = authorizeRequest;
            this.f452o = strArr;
        }

        public void run() {
            if (!C1390h.this.mo15126j(this.f448e)) {
                this.f449l.mo15067b(new AuthError("APIKey is invalid", AuthError.ERROR_TYPE.ERROR_ACCESS_DENIED));
                return;
            }
            Bundle bundle = this.f450m == null ? new Bundle() : new Bundle(this.f450m);
            if (!bundle.containsKey(AuthzConstants$BUNDLE_KEY.SANDBOX.val)) {
                bundle.putBoolean(AuthzConstants$BUNDLE_KEY.SANDBOX.val, C1362a.m297e(this.f448e));
            }
            try {
                new C1401m().mo15136s(this.f451n, this.f448e, this.f448e.getPackageName(), C1390h.this.f446a, C1390h.this.mo15123g(this.f448e), this.f452o, true, C1390h.f444e, this.f449l, bundle);
            } catch (AuthError e) {
                this.f449l.mo15067b(e);
            }
        }
    }

    /* renamed from: c.b.a.a.a.j.h$b */
    /* compiled from: InternalAuthManager */
    public class C1392b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Context f454e;

        /* renamed from: l */
        public final /* synthetic */ C1463a f455l;

        /* renamed from: m */
        public final /* synthetic */ String[] f456m;

        /* renamed from: c.b.a.a.a.j.h$b$a */
        /* compiled from: InternalAuthManager */
        public class C1393a implements C1462a {
            public C1393a() {
            }

            /* renamed from: b */
            public void mo15065a(AuthError authError) {
                C1392b.this.f455l.mo15065a(authError);
            }

            /* renamed from: c */
            public void onSuccess(Bundle bundle) {
                C1392b.this.f455l.onSuccess(bundle);
            }
        }

        public C1392b(Context context, C1463a aVar, String[] strArr) {
            this.f454e = context;
            this.f455l = aVar;
            this.f456m = strArr;
        }

        public void run() {
            try {
                if (!C1390h.this.mo15126j(this.f454e)) {
                    this.f455l.mo15065a(new AuthError("APIKey is invalid", AuthError.ERROR_TYPE.ERROR_ACCESS_DENIED));
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean(AuthzConstants$BUNDLE_KEY.SANDBOX.val, C1362a.m297e(this.f454e));
                C1410p.m484b(this.f454e, this.f454e.getPackageName(), C1390h.this.f446a, this.f456m, new C1393a(), new C1378d(), bundle);
            } catch (AuthError e) {
                this.f455l.mo15065a(e);
            }
        }
    }

    /* renamed from: c.b.a.a.a.j.h$c */
    /* compiled from: InternalAuthManager */
    public class C1394c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Context f459e;

        /* renamed from: l */
        public final /* synthetic */ C1463a f460l;

        /* renamed from: m */
        public final /* synthetic */ Bundle f461m;

        /* renamed from: c.b.a.a.a.j.h$c$a */
        /* compiled from: InternalAuthManager */
        public class C1395a implements C1462a {
            public C1395a() {
            }

            /* renamed from: b */
            public void mo15065a(AuthError authError) {
                C1394c.this.f460l.mo15065a(authError);
            }

            /* renamed from: c */
            public void onSuccess(Bundle bundle) {
                C1394c.this.f460l.onSuccess(bundle);
            }
        }

        public C1394c(Context context, C1463a aVar, Bundle bundle) {
            this.f459e = context;
            this.f460l = aVar;
            this.f461m = bundle;
        }

        public void run() {
            if (!C1390h.this.mo15126j(this.f459e)) {
                this.f460l.mo15065a(new AuthError("APIKey is invalid", AuthError.ERROR_TYPE.ERROR_ACCESS_DENIED));
                return;
            }
            Bundle bundle = this.f461m == null ? new Bundle() : new Bundle(this.f461m);
            if (!bundle.containsKey(AuthzConstants$BUNDLE_KEY.SANDBOX.val)) {
                bundle.putBoolean(AuthzConstants$BUNDLE_KEY.SANDBOX.val, C1362a.m297e(this.f459e));
            }
            Context context = this.f459e;
            C1397j.m426k(context, context.getPackageName(), bundle, new C1395a());
        }
    }

    public C1390h(Context context) {
        AppInfo a = f443d.mo15096a(context.getPackageName(), context);
        this.f447b = a;
        if (a == null || a.mo21446o() == null) {
            throw new IllegalArgumentException("Invalid API Key");
        }
        this.f446a = this.f447b.mo21446o();
    }

    /* renamed from: e */
    public static C1390h m398e(Context context) {
        if (f445f == null) {
            synchronized (C1390h.class) {
                if (f445f == null) {
                    f445f = new C1390h(context);
                }
            }
        }
        return f445f;
    }

    /* renamed from: c */
    public Future<Bundle> mo15120c(AuthorizeRequest authorizeRequest, Context context, String[] strArr, Bundle bundle, C1412a aVar) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("scopes must not be null or empty!");
        }
        String str = f442c;
        C1485a.m832e(str, context.getPackageName() + " calling authorize: scopes=" + Arrays.toString(strArr));
        C1467d.f646b.execute(new C1391a(context, aVar, bundle, authorizeRequest, strArr));
        return null;
    }

    /* renamed from: d */
    public String mo15121d() {
        return this.f446a;
    }

    /* renamed from: f */
    public Future<Bundle> mo15122f(Context context, Bundle bundle, C1462a aVar) {
        String str = f442c;
        C1485a.m832e(str, context.getPackageName() + " calling getProfile");
        C1463a aVar2 = new C1463a(aVar);
        C1467d.f646b.execute(new C1394c(context, aVar2, bundle));
        return aVar2;
    }

    /* renamed from: g */
    public String mo15123g(Context context) {
        return f443d.mo15102g(context);
    }

    /* renamed from: h */
    public Region mo15124h(Context context) {
        Region c = C1360g.m285c(context);
        return Region.AUTO == c ? C1445b.m720a(context, this.f447b).mo15296h() : c;
    }

    /* renamed from: i */
    public Future<Bundle> mo15125i(Context context, String[] strArr, C1462a aVar) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("scopes must not be null or empty!");
        }
        String str = f442c;
        C1485a.m832e(str, context.getPackageName() + " calling getToken: scopes=" + Arrays.toString(strArr));
        C1463a aVar2 = new C1463a(aVar);
        C1467d.f646b.execute(new C1392b(context, aVar2, strArr));
        return aVar2;
    }

    /* renamed from: j */
    public boolean mo15126j(Context context) {
        return f443d.mo15100e(context) && this.f446a != null;
    }
}
