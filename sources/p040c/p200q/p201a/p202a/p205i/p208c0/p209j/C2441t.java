package p040c.p200q.p201a.p202a.p205i.p208c0.p209j;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p202a.C2350b;
import p040c.p200q.p201a.p202a.p205i.C2526i;
import p040c.p200q.p201a.p202a.p205i.C2527j;
import p040c.p200q.p201a.p202a.p205i.C2538q;
import p040c.p200q.p201a.p202a.p205i.p206a0.C2396a;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2465i0;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2467j0;
import p040c.p200q.p201a.p202a.p205i.p208c0.p210k.C2485q0;
import p040c.p200q.p201a.p202a.p205i.p211d0.C2507a;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;
import p040c.p200q.p201a.p202a.p205i.p214x.C2553e;
import p040c.p200q.p201a.p202a.p205i.p214x.C2554f;
import p040c.p200q.p201a.p202a.p205i.p214x.C2562l;
import p040c.p200q.p201a.p202a.p205i.p217z.p218a.C2567a;

/* renamed from: c.q.a.a.i.c0.j.t */
/* compiled from: Uploader */
public class C2441t {

    /* renamed from: a */
    public final Context f2815a;

    /* renamed from: b */
    public final C2553e f2816b;

    /* renamed from: c */
    public final C2467j0 f2817c;

    /* renamed from: d */
    public final C2445x f2818d;

    /* renamed from: e */
    public final Executor f2819e;

    /* renamed from: f */
    public final C2507a f2820f;

    /* renamed from: g */
    public final C2512a f2821g;

    /* renamed from: h */
    public final C2512a f2822h;

    /* renamed from: i */
    public final C2465i0 f2823i;

    public C2441t(Context context, C2553e eVar, C2467j0 j0Var, C2445x xVar, Executor executor, C2507a aVar, C2512a aVar2, C2512a aVar3, C2465i0 i0Var) {
        this.f2815a = context;
        this.f2816b = eVar;
        this.f2817c = j0Var;
        this.f2818d = xVar;
        this.f2819e = executor;
        this.f2820f = aVar;
        this.f2821g = aVar2;
        this.f2822h = aVar3;
        this.f2823i = i0Var;
    }

    @VisibleForTesting
    /* renamed from: a */
    public C2527j mo17831a(C2562l lVar) {
        C2507a aVar = this.f2820f;
        C2465i0 i0Var = this.f2823i;
        Objects.requireNonNull(i0Var);
        C2527j.C2528a a = C2527j.m4486a();
        a.mo17796i(this.f2821g.mo17952a());
        a.mo17798k(this.f2822h.mo17952a());
        a.mo17797j("GDT_CLIENT_METRICS");
        a.mo17795h(new C2526i(C2350b.m4027b("proto"), ((C2567a) aVar.mo17899b(new C2420a(i0Var))).mo18021f()));
        return lVar.mo17673b(a.mo17791d());
    }

    /* renamed from: b */
    public boolean mo17832b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2815a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* renamed from: c */
    public /* synthetic */ Boolean mo17833c(C2538q qVar) {
        return Boolean.valueOf(this.f2817c.mo17877I(qVar));
    }

    /* renamed from: d */
    public /* synthetic */ Iterable mo17834d(C2538q qVar) {
        return this.f2817c.mo17881p(qVar);
    }

    /* renamed from: e */
    public /* synthetic */ Object mo17835e(Iterable iterable, C2538q qVar, long j) {
        this.f2817c.mo17878L(iterable);
        this.f2817c.mo17882t(qVar, this.f2821g.mo17952a() + j);
        return null;
    }

    /* renamed from: f */
    public /* synthetic */ Object mo17836f(Iterable iterable) {
        this.f2817c.mo17880l(iterable);
        return null;
    }

    /* renamed from: g */
    public /* synthetic */ Object mo17837g() {
        this.f2823i.mo17872a();
        return null;
    }

    /* renamed from: h */
    public /* synthetic */ Object mo17838h(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f2823i.mo17874d((long) ((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* renamed from: i */
    public /* synthetic */ Object mo17839i(C2538q qVar, long j) {
        this.f2817c.mo17882t(qVar, this.f2821g.mo17952a() + j);
        return null;
    }

    /* renamed from: j */
    public /* synthetic */ Object mo17840j(C2538q qVar, int i) {
        this.f2818d.mo17811a(qVar, i + 1);
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f2818d.mo17811a(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void mo17841k(p040c.p200q.p201a.p202a.p205i.C2538q r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            c.q.a.a.i.d0.a r0 = r3.f2820f     // Catch:{ SynchronizationException -> 0x0026 }
            c.q.a.a.i.c0.k.j0 r1 = r3.f2817c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            c.q.a.a.i.c0.j.b r2 = new c.q.a.a.i.c0.j.b     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo17899b(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.mo17832b()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            c.q.a.a.i.d0.a r0 = r3.f2820f     // Catch:{ SynchronizationException -> 0x0026 }
            c.q.a.a.i.c0.j.e r1 = new c.q.a.a.i.c0.j.e     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo17899b(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo17842l(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            c.q.a.a.i.c0.j.x r0 = r3.f2818d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo17811a(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p202a.p205i.p208c0.p209j.C2441t.mo17841k(c.q.a.a.i.q, int, java.lang.Runnable):void");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: l */
    public BackendResponse mo17842l(C2538q qVar, int i) {
        BackendResponse a;
        C2562l lVar = this.f2816b.get(qVar.mo17943b());
        long j = 0;
        BackendResponse e = BackendResponse.m10202e(0);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f2820f.mo17899b(new C2425f(this, qVar))).booleanValue()) {
                Iterable<C2485q0> iterable = (Iterable) this.f2820f.mo17899b(new C2432m(this, qVar));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (lVar == null) {
                    C2396a.m4208b("Uploader", "Unknown backend for %s, deleting event batch for it...", qVar);
                    a = BackendResponse.m10200a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (C2485q0 b : iterable) {
                        arrayList.add(b.mo17866b());
                    }
                    if (qVar.mo17979e()) {
                        arrayList.add(mo17831a(lVar));
                    }
                    C2554f.C2555a a2 = C2554f.m4571a();
                    a2.mo17995b(arrayList);
                    a2.mo17996c(qVar.mo17944c());
                    a = lVar.mo17672a(a2.mo17994a());
                }
                e = a;
                if (e.mo17998c() == BackendResponse.Status.TRANSIENT_ERROR) {
                    this.f2820f.mo17899b(new C2427h(this, iterable, qVar, j2));
                    this.f2818d.mo17812b(qVar, i + 1, true);
                    return e;
                }
                this.f2820f.mo17899b(new C2429j(this, iterable));
                if (e.mo17998c() == BackendResponse.Status.OK) {
                    j = Math.max(j2, e.mo17997b());
                    if (qVar.mo17979e()) {
                        this.f2820f.mo17899b(new C2431l(this));
                    }
                } else if (e.mo17998c() == BackendResponse.Status.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    for (C2485q0 b2 : iterable) {
                        String j3 = b2.mo17866b().mo17788j();
                        if (!hashMap.containsKey(j3)) {
                            hashMap.put(j3, 1);
                        } else {
                            hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                        }
                    }
                    this.f2820f.mo17899b(new C2426g(this, hashMap));
                }
            }
            this.f2820f.mo17899b(new C2428i(this, qVar, j2));
            return e;
        }
    }

    /* renamed from: m */
    public void mo17843m(C2538q qVar, int i, Runnable runnable) {
        this.f2819e.execute(new C2430k(this, qVar, i, runnable));
    }
}
