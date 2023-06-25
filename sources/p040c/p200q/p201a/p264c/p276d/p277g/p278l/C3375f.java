package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArraySet;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p040c.p200q.p201a.p264c.p276d.C3324b;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3345c;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p281j.C3468g;
import p040c.p200q.p201a.p264c.p276d.p281j.C3472h0;
import p040c.p200q.p201a.p264c.p276d.p281j.C3498p;
import p040c.p200q.p201a.p264c.p276d.p281j.C3504r;
import p040c.p200q.p201a.p264c.p276d.p281j.C3507s;
import p040c.p200q.p201a.p264c.p276d.p289n.C3557h;
import p040c.p200q.p201a.p264c.p294g.p298d.C3636f;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.f */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3375f implements Handler.Callback {
    @NonNull

    /* renamed from: B */
    public static final Status f6271B = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: C */
    public static final Status f6272C = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: D */
    public static final Object f6273D = new Object();
    @Nullable

    /* renamed from: E */
    public static C3375f f6274E;

    /* renamed from: A */
    public volatile boolean f6275A = true;

    /* renamed from: e */
    public long f6276e = 5000;

    /* renamed from: l */
    public long f6277l = 120000;

    /* renamed from: m */
    public long f6278m = 10000;

    /* renamed from: n */
    public boolean f6279n = false;
    @Nullable

    /* renamed from: o */
    public TelemetryData f6280o;
    @Nullable

    /* renamed from: p */
    public C3507s f6281p;

    /* renamed from: q */
    public final Context f6282q;

    /* renamed from: r */
    public final C3324b f6283r;

    /* renamed from: s */
    public final C3472h0 f6284s;

    /* renamed from: t */
    public final AtomicInteger f6285t = new AtomicInteger(1);

    /* renamed from: u */
    public final AtomicInteger f6286u = new AtomicInteger(0);

    /* renamed from: v */
    public final Map<C3362b<?>, C3373e0<?>> f6287v = new ConcurrentHashMap(5, 0.75f, 1);
    @Nullable

    /* renamed from: w */
    public C3419v f6288w = null;

    /* renamed from: x */
    public final Set<C3362b<?>> f6289x = new ArraySet();

    /* renamed from: y */
    public final Set<C3362b<?>> f6290y = new ArraySet();
    @NotOnlyInitialized

    /* renamed from: z */
    public final Handler f6291z;

    public C3375f(Context context, Looper looper, C3324b bVar) {
        this.f6282q = context;
        this.f6291z = new C3636f(looper, this);
        this.f6283r = bVar;
        this.f6284s = new C3472h0(bVar);
        if (C3557h.m9068a(context)) {
            this.f6275A = false;
        }
        Handler handler = this.f6291z;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m8587a() {
        synchronized (f6273D) {
            C3375f fVar = f6274E;
            if (fVar != null) {
                fVar.f6286u.incrementAndGet();
                Handler handler = fVar.f6291z;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* renamed from: i */
    public static Status m8589i(C3362b<?> bVar, ConnectionResult connectionResult) {
        String b = bVar.mo20463b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    @NonNull
    /* renamed from: y */
    public static C3375f m8599y(@NonNull Context context) {
        C3375f fVar;
        synchronized (f6273D) {
            if (f6274E == null) {
                f6274E = new C3375f(context.getApplicationContext(), C3468g.m8858c().getLooper(), C3324b.m8405m());
            }
            fVar = f6274E;
        }
        return fVar;
    }

    /* renamed from: E */
    public final <O extends C3334a.C3338d> void mo20529E(@NonNull C3345c<O> cVar, int i, @NonNull C3369d<? extends C3356i, C3334a.C3336b> dVar) {
        C3368c1 c1Var = new C3368c1(i, dVar);
        Handler handler = this.f6291z;
        handler.sendMessage(handler.obtainMessage(4, new C3410q0(c1Var, this.f6286u.get(), cVar)));
    }

    /* renamed from: F */
    public final <O extends C3334a.C3338d, ResultT> void mo20530F(@NonNull C3345c<O> cVar, int i, @NonNull C3408q<C3334a.C3336b, ResultT> qVar, @NonNull C5773k<ResultT> kVar, @NonNull C3402o oVar) {
        mo20543m(kVar, qVar.mo20601d(), cVar);
        C3371d1 d1Var = new C3371d1(i, qVar, kVar, oVar);
        Handler handler = this.f6291z;
        handler.sendMessage(handler.obtainMessage(4, new C3410q0(d1Var, this.f6286u.get(), cVar)));
    }

    /* renamed from: G */
    public final void mo20531G(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f6291z;
        handler.sendMessage(handler.obtainMessage(18, new C3400n0(methodInvocation, i, j, i2)));
    }

    /* renamed from: H */
    public final void mo20532H(@NonNull ConnectionResult connectionResult, int i) {
        if (!mo20538h(connectionResult, i)) {
            Handler handler = this.f6291z;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* renamed from: b */
    public final void mo20533b() {
        Handler handler = this.f6291z;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void mo20534c(@NonNull C3345c<?> cVar) {
        Handler handler = this.f6291z;
        handler.sendMessage(handler.obtainMessage(7, cVar));
    }

    /* renamed from: d */
    public final void mo20535d(@NonNull C3419v vVar) {
        synchronized (f6273D) {
            if (this.f6288w != vVar) {
                this.f6288w = vVar;
                this.f6289x.clear();
            }
            this.f6289x.addAll(vVar.mo20617t());
        }
    }

    /* renamed from: e */
    public final void mo20536e(@NonNull C3419v vVar) {
        synchronized (f6273D) {
            if (this.f6288w == vVar) {
                this.f6288w = null;
                this.f6289x.clear();
            }
        }
    }

    @WorkerThread
    /* renamed from: g */
    public final boolean mo20537g() {
        if (this.f6279n) {
            return false;
        }
        RootTelemetryConfiguration a = C3498p.m8924b().mo20773a();
        if (a != null && !a.mo24600R()) {
            return false;
        }
        int a2 = this.f6284s.mo20732a(this.f6282q, 203400000);
        if (a2 == -1 || a2 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo20538h(ConnectionResult connectionResult, int i) {
        return this.f6283r.mo20402w(this.f6282q, connectionResult, i);
    }

    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        int i = message.what;
        long j = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        C3373e0 e0Var = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f6278m = j;
                this.f6291z.removeMessages(12);
                for (C3362b<?> obtainMessage : this.f6287v.keySet()) {
                    Handler handler = this.f6291z;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f6278m);
                }
                break;
            case 2:
                C3380g1 g1Var = (C3380g1) message.obj;
                Iterator<C3362b<?>> it = g1Var.mo20553a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C3362b next = it.next();
                        C3373e0 e0Var2 = this.f6287v.get(next);
                        if (e0Var2 == null) {
                            g1Var.mo20554b(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (e0Var2.mo20506O()) {
                            g1Var.mo20554b(next, ConnectionResult.f8152o, e0Var2.mo20526v().mo20426e());
                        } else {
                            ConnectionResult t = e0Var2.mo20525t();
                            if (t != null) {
                                g1Var.mo20554b(next, t, (String) null);
                            } else {
                                e0Var2.mo20502J(g1Var);
                                e0Var2.mo20497E();
                            }
                        }
                    }
                }
            case 3:
                for (C3373e0 next2 : this.f6287v.values()) {
                    next2.mo20496D();
                    next2.mo20497E();
                }
                break;
            case 4:
            case 8:
            case 13:
                C3410q0 q0Var = (C3410q0) message.obj;
                C3373e0<?> e0Var3 = this.f6287v.get(q0Var.f6360c.mo20434b());
                if (e0Var3 == null) {
                    e0Var3 = mo20540j(q0Var.f6360c);
                }
                if (e0Var3.mo20507P() && this.f6286u.get() != q0Var.f6359b) {
                    q0Var.f6358a.mo20483a(f6271B);
                    e0Var3.mo20504L();
                    break;
                } else {
                    e0Var3.mo20498F(q0Var.f6358a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C3373e0<?>> it2 = this.f6287v.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C3373e0 next3 = it2.next();
                        if (next3.mo20523r() == i2) {
                            e0Var = next3;
                        }
                    }
                }
                if (e0Var != null) {
                    if (connectionResult.mo24483P() != 13) {
                        e0Var.mo20512f(m8589i(e0Var.f6259m, connectionResult));
                        break;
                    } else {
                        String e = this.f6283r.mo20387e(connectionResult.mo24483P());
                        String Q = connectionResult.mo24484Q();
                        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 69 + String.valueOf(Q).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e);
                        sb.append(": ");
                        sb.append(Q);
                        e0Var.mo20512f(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f6282q.getApplicationContext() instanceof Application) {
                    C3365c.m8513d((Application) this.f6282q.getApplicationContext());
                    C3365c.m8512b().mo20467a(new C3427z(this));
                    if (!C3365c.m8512b().mo20469f(true)) {
                        this.f6278m = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
                        break;
                    }
                }
                break;
            case 7:
                mo20540j((C3345c) message.obj);
                break;
            case 9:
                if (this.f6287v.containsKey(message.obj)) {
                    this.f6287v.get(message.obj).mo20503K();
                    break;
                }
                break;
            case 10:
                for (C3362b<?> remove : this.f6290y) {
                    C3373e0 remove2 = this.f6287v.remove(remove);
                    if (remove2 != null) {
                        remove2.mo20504L();
                    }
                }
                this.f6290y.clear();
                break;
            case 11:
                if (this.f6287v.containsKey(message.obj)) {
                    this.f6287v.get(message.obj).mo20505M();
                    break;
                }
                break;
            case 12:
                if (this.f6287v.containsKey(message.obj)) {
                    this.f6287v.get(message.obj).mo20508a();
                    break;
                }
                break;
            case 14:
                C3421w wVar = (C3421w) message.obj;
                C3362b<?> a = wVar.mo20622a();
                if (this.f6287v.containsKey(a)) {
                    wVar.mo20623b().mo28861c(Boolean.valueOf(this.f6287v.get(a).mo20522q(false)));
                    break;
                } else {
                    wVar.mo20623b().mo28861c(Boolean.FALSE);
                    break;
                }
            case 15:
                C3379g0 g0Var = (C3379g0) message.obj;
                if (this.f6287v.containsKey(g0Var.f6294a)) {
                    C3373e0.m8538B(this.f6287v.get(g0Var.f6294a), g0Var);
                    break;
                }
                break;
            case 16:
                C3379g0 g0Var2 = (C3379g0) message.obj;
                if (this.f6287v.containsKey(g0Var2.f6294a)) {
                    C3373e0.m8539C(this.f6287v.get(g0Var2.f6294a), g0Var2);
                    break;
                }
                break;
            case 17:
                mo20542l();
                break;
            case 18:
                C3400n0 n0Var = (C3400n0) message.obj;
                if (n0Var.f6339c != 0) {
                    TelemetryData telemetryData = this.f6280o;
                    if (telemetryData != null) {
                        List<MethodInvocation> Q2 = telemetryData.mo24605Q();
                        if (telemetryData.mo24604P() != n0Var.f6338b || (Q2 != null && Q2.size() >= n0Var.f6340d)) {
                            this.f6291z.removeMessages(17);
                            mo20542l();
                        } else {
                            this.f6280o.mo24606R(n0Var.f6337a);
                        }
                    }
                    if (this.f6280o == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(n0Var.f6337a);
                        this.f6280o = new TelemetryData(n0Var.f6338b, arrayList);
                        Handler handler2 = this.f6291z;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), n0Var.f6339c);
                        break;
                    }
                } else {
                    mo20541k().mo20782a(new TelemetryData(n0Var.f6338b, Arrays.asList(new MethodInvocation[]{n0Var.f6337a})));
                    break;
                }
                break;
            case 19:
                this.f6279n = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                sb3.toString();
                return false;
        }
        return true;
    }

    @WorkerThread
    /* renamed from: j */
    public final C3373e0<?> mo20540j(C3345c<?> cVar) {
        C3362b<?> b = cVar.mo20434b();
        C3373e0<?> e0Var = this.f6287v.get(b);
        if (e0Var == null) {
            e0Var = new C3373e0<>(this, cVar);
            this.f6287v.put(b, e0Var);
        }
        if (e0Var.mo20507P()) {
            this.f6290y.add(b);
        }
        e0Var.mo20497E();
        return e0Var;
    }

    @WorkerThread
    /* renamed from: k */
    public final C3507s mo20541k() {
        if (this.f6281p == null) {
            this.f6281p = C3504r.m8928a(this.f6282q);
        }
        return this.f6281p;
    }

    @WorkerThread
    /* renamed from: l */
    public final void mo20542l() {
        TelemetryData telemetryData = this.f6280o;
        if (telemetryData != null) {
            if (telemetryData.mo24604P() > 0 || mo20537g()) {
                mo20541k().mo20782a(telemetryData);
            }
            this.f6280o = null;
        }
    }

    /* renamed from: m */
    public final <T> void mo20543m(C5773k<T> kVar, int i, C3345c cVar) {
        C3397m0 a;
        if (i != 0 && (a = C3397m0.m8685a(this, i, cVar.mo20434b())) != null) {
            C5771j<T> a2 = kVar.mo28859a();
            Handler handler = this.f6291z;
            handler.getClass();
            a2.mo28843d(new C3425y(handler), a);
        }
    }

    /* renamed from: n */
    public final int mo20544n() {
        return this.f6285t.getAndIncrement();
    }

    @Nullable
    /* renamed from: x */
    public final C3373e0 mo20545x(C3362b<?> bVar) {
        return this.f6287v.get(bVar);
    }
}
