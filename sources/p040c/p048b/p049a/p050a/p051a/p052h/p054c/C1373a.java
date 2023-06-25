package p040c.p048b.p049a.p050a.p051a.p052h.p054c;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.amazon.identity.auth.device.api.workflow.ListenerNotFoundException;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p040c.p048b.p049a.p050a.p051a.C1358e;
import p040c.p048b.p049a.p050a.p051a.p060m.C1441p;
import p040c.p048b.p049a.p050a.p051a.p062o.C1447a;
import p040c.p048b.p049a.p050a.p051a.p062o.C1449c;
import p040c.p048b.p049a.p050a.p051a.p062o.C1450d;
import p040c.p048b.p049a.p050a.p051a.p062o.C1451e;
import p040c.p048b.p049a.p050a.p051a.p062o.C1453f;
import p040c.p048b.p049a.p050a.p051a.p062o.C1454g;
import p040c.p048b.p049a.p050a.p051a.p062o.C1456i;
import p040c.p048b.p049a.p050a.p051a.p062o.C1457j;
import p040c.p048b.p049a.p050a.p051a.p062o.C1458k;
import p040c.p048b.p049a.p050a.p051a.p062o.C1459l;
import p040c.p048b.p049a.p050a.p051a.p062o.C1460m;
import p040c.p048b.p049a.p050a.p051a.p065r.C1467d;
import p040c.p048b.p049a.p050a.p068b.p069a.p071c.C1485a;

/* renamed from: c.b.a.a.a.h.c.a */
/* compiled from: RequestContext */
public final class C1373a {

    /* renamed from: d */
    public static final String f405d = "c.b.a.a.a.h.c.a";

    /* renamed from: a */
    public final UUID f406a;

    /* renamed from: b */
    public final C1457j f407b;

    /* renamed from: c */
    public final Map<String, Set<C1450d<?, ?, ?>>> f408c;

    /* renamed from: c.b.a.a.a.h.c.a$a */
    /* compiled from: RequestContext */
    public class C1374a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ Uri f409e;

        /* renamed from: l */
        public final /* synthetic */ Context f410l;

        /* renamed from: m */
        public final /* synthetic */ InteractiveRequestRecord f411m;

        public C1374a(Uri uri, Context context, InteractiveRequestRecord interactiveRequestRecord) {
            this.f409e = uri;
            this.f410l = context;
            this.f411m = interactiveRequestRecord;
        }

        public void run() {
            try {
                if (!C1358e.m270c().mo15060g(this.f409e, this.f410l, C1373a.this)) {
                    for (C1456i f : C1373a.this.mo15089k(new C1441p(this.f409e).mo15278a().get("InteractiveRequestType"), C1456i.class)) {
                        f.mo15073f(this.f410l, this.f411m, this.f409e);
                    }
                }
            } catch (Exception e) {
                String b = C1373a.f405d;
                C1485a.m830c(b, "RequestContext " + C1373a.this.f406a + ": Unable to handle activity result", e);
            }
        }
    }

    public C1373a(C1457j jVar) {
        if (jVar != null) {
            this.f407b = jVar;
            this.f406a = UUID.randomUUID();
            this.f408c = new HashMap();
            return;
        }
        throw new IllegalArgumentException("requestSource must be non-null");
    }

    @Deprecated
    /* renamed from: d */
    public static C1373a m329d(Activity activity) {
        return m332g(new C1458k(activity));
    }

    /* renamed from: e */
    public static C1373a m330e(Context context) {
        if (context instanceof FragmentActivity) {
            return m331f((FragmentActivity) context);
        }
        if (context instanceof Activity) {
            return m329d((Activity) context);
        }
        return m332g(new C1459l(context));
    }

    @Deprecated
    /* renamed from: f */
    public static C1373a m331f(FragmentActivity fragmentActivity) {
        return m332g(new C1460m(fragmentActivity));
    }

    /* renamed from: g */
    public static C1373a m332g(C1457j jVar) {
        Object b = jVar.mo15318b();
        C1373a b2 = C1453f.m744a().mo15311b(b);
        if (b2 == null) {
            C1373a aVar = new C1373a(jVar);
            C1453f.m744a().mo15312c(b, aVar);
            C1485a.m836i(f405d, "Created RequestContext " + aVar.f406a, "requestSource=" + jVar.mo15318b());
            return aVar;
        }
        C1485a.m836i(f405d, "Reusing RequestContext " + b2.f406a, "requestSource=" + jVar.mo15318b());
        return b2;
    }

    /* renamed from: h */
    public <T extends C1450d<S, U, V>, S, U, V> C1450d<S, U, V> mo15086h(C1451e<T, S, U, V> eVar) {
        return new C1447a(eVar.mo15072d(), mo15088j(eVar, eVar.mo15307i()));
    }

    /* renamed from: i */
    public Context mo15087i() {
        return this.f407b.getContext();
    }

    /* renamed from: j */
    public <T> Set<T> mo15088j(C1449c cVar, Class<T> cls) {
        if (cVar == null) {
            throw new IllegalArgumentException("api must be non-null");
        } else if (cls != null) {
            return mo15089k(cVar.mo15072d(), cls);
        } else {
            throw new IllegalArgumentException("listenerClass must be non-null");
        }
    }

    /* renamed from: k */
    public final <T> Set<T> mo15089k(String str, Class<T> cls) {
        Set<C1450d> set;
        if (str != null) {
            synchronized (this.f408c) {
                set = this.f408c.get(str);
            }
            if (set == null || set.isEmpty()) {
                throw new ListenerNotFoundException("No listeners were registered with type \"" + str + "\" for RequestContext " + this.f406a + ". Listener types present: " + this.f408c.keySet());
            } else if (cls == null) {
                return null;
            } else {
                HashSet hashSet = new HashSet(set.size());
                for (C1450d cast : set) {
                    try {
                        hashSet.add(cls.cast(cast));
                    } catch (ClassCastException e) {
                        throw new ListenerNotFoundException("Failed to retrieve listener of class type \"" + cls.toString() + "\" for request type \"" + str + "\"", e);
                    }
                }
                return hashSet;
            }
        } else {
            throw new IllegalArgumentException("requestType must be non-null");
        }
    }

    /* renamed from: l */
    public boolean mo15090l() {
        return this.f407b.mo15319c();
    }

    /* renamed from: m */
    public void mo15091m() {
        String str = f405d;
        C1485a.m828a(str, "RequestContext " + this.f406a + ": onResume");
        C1454g d = this.f407b.mo15320d();
        if (d != null) {
            d.mo15297a(this);
            return;
        }
        String str2 = f405d;
        C1485a.m829b(str2, "RequestContext " + this.f406a + ": could not retrieve interactive state to process pending responses");
    }

    /* renamed from: n */
    public void mo15092n(InteractiveRequestRecord interactiveRequestRecord) {
        if (interactiveRequestRecord != null) {
            String str = f405d;
            C1485a.m828a(str, "RequestContext " + this.f406a + ": onStartRequest for request ID " + interactiveRequestRecord.mo21524c());
            this.f407b.mo15317a(interactiveRequestRecord);
            return;
        }
        throw new IllegalArgumentException("request must be non-null");
    }

    /* renamed from: o */
    public void mo15093o(InteractiveRequestRecord interactiveRequestRecord, Uri uri) {
        if (interactiveRequestRecord == null) {
            throw new IllegalArgumentException("request must be non-null");
        } else if (uri != null) {
            C1485a.m836i(f405d, "RequestContext " + this.f406a + ": processing response", "uri=" + uri.toString());
            C1467d.f646b.execute(new C1374a(uri, this.f407b.getContext(), interactiveRequestRecord));
        } else {
            throw new IllegalArgumentException("uri must be non-null");
        }
    }

    /* renamed from: p */
    public void mo15094p(C1450d<?, ?, ?> dVar) {
        if (dVar != null) {
            String d = dVar.mo15072d();
            C1485a.m836i(f405d, "RequestContext " + this.f406a + ": registerListener for of request type " + d, "listener=" + dVar);
            synchronized (this.f408c) {
                Set set = this.f408c.get(d);
                if (set == null) {
                    set = new HashSet();
                    this.f408c.put(d, set);
                }
                set.add(dVar);
            }
            return;
        }
        throw new IllegalArgumentException("listener must be non-null");
    }
}
