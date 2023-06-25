package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p201a.p264c.p276d.p277g.C3348d;
import p040c.p200q.p201a.p264c.p276d.p277g.C3352f;
import p040c.p200q.p201a.p264c.p276d.p277g.C3355h;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p277g.C3357j;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3361a1;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3395l1;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3398m1;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3401n1;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3428z0;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p294g.p298d.C3636f;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class BasePendingResult<R extends C3356i> extends C3352f<R> {

    /* renamed from: n */
    public static final ThreadLocal<Boolean> f8183n = new C3395l1();

    /* renamed from: o */
    public static final /* synthetic */ int f8184o = 0;

    /* renamed from: a */
    public final Object f8185a;
    @NonNull

    /* renamed from: b */
    public final C4071a<R> f8186b;

    /* renamed from: c */
    public final CountDownLatch f8187c;

    /* renamed from: d */
    public final ArrayList<C3352f.C3353a> f8188d;
    @Nullable

    /* renamed from: e */
    public C3357j<? super R> f8189e;

    /* renamed from: f */
    public final AtomicReference<C3361a1> f8190f;
    @Nullable

    /* renamed from: g */
    public R f8191g;

    /* renamed from: h */
    public Status f8192h;

    /* renamed from: i */
    public volatile boolean f8193i;

    /* renamed from: j */
    public boolean f8194j;

    /* renamed from: k */
    public boolean f8195k;

    /* renamed from: l */
    public volatile C3428z0<R> f8196l;

    /* renamed from: m */
    public boolean f8197m;
    @KeepName
    public C3401n1 mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C4071a<R extends C3356i> extends C3636f {
        public C4071a(@NonNull Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo24550a(@NonNull C3357j<? super R> jVar, @NonNull R r) {
            int i = BasePendingResult.f8184o;
            C3495o.m8908j(jVar);
            sendMessage(obtainMessage(1, new Pair(jVar, r)));
        }

        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C3357j jVar = (C3357j) pair.first;
                C3356i iVar = (C3356i) pair.second;
                try {
                    jVar.mo20460a(iVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m10873k(iVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo24544d(Status.f8176s);
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.f8185a = new Object();
        this.f8187c = new CountDownLatch(1);
        this.f8188d = new ArrayList<>();
        this.f8190f = new AtomicReference<>();
        this.f8197m = false;
        this.f8186b = new C4071a<>(Looper.getMainLooper());
        new WeakReference((Object) null);
    }

    /* renamed from: k */
    public static void m10873k(@Nullable C3356i iVar) {
        if (iVar instanceof C3355h) {
            try {
                ((C3355h) iVar).release();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(iVar);
                String.valueOf(valueOf).length();
                "Unable to release ".concat(String.valueOf(valueOf));
            }
        }
    }

    /* renamed from: a */
    public final void mo20456a(@NonNull C3352f.C3353a aVar) {
        C3495o.m8900b(aVar != null, "Callback cannot be null.");
        synchronized (this.f8185a) {
            if (mo24545e()) {
                aVar.mo20458a(this.f8192h);
            } else {
                this.f8188d.add(aVar);
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public final R mo20457b(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            C3495o.m8907i("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C3495o.m8912n(!this.f8193i, "Result has already been consumed.");
        if (this.f8196l != null) {
            z = false;
        }
        C3495o.m8912n(z, "Cannot await if then() has been called.");
        try {
            if (!this.f8187c.await(j, timeUnit)) {
                mo24544d(Status.f8176s);
            }
        } catch (InterruptedException unused) {
            mo24544d(Status.f8174q);
        }
        C3495o.m8912n(mo24545e(), "Result is not ready.");
        return mo24547g();
    }

    @NonNull
    /* renamed from: c */
    public abstract R mo20305c(@NonNull Status status);

    @Deprecated
    /* renamed from: d */
    public final void mo24544d(@NonNull Status status) {
        synchronized (this.f8185a) {
            if (!mo24545e()) {
                mo24546f(mo20305c(status));
                this.f8195k = true;
            }
        }
    }

    /* renamed from: e */
    public final boolean mo24545e() {
        return this.f8187c.getCount() == 0;
    }

    /* renamed from: f */
    public final void mo24546f(@NonNull R r) {
        synchronized (this.f8185a) {
            if (this.f8195k || this.f8194j) {
                m10873k(r);
                return;
            }
            mo24545e();
            C3495o.m8912n(!mo24545e(), "Results have already been set");
            C3495o.m8912n(!this.f8193i, "Result has already been consumed");
            mo24548h(r);
        }
    }

    /* renamed from: g */
    public final R mo24547g() {
        R r;
        synchronized (this.f8185a) {
            C3495o.m8912n(!this.f8193i, "Result has already been consumed.");
            C3495o.m8912n(mo24545e(), "Result is not ready.");
            r = this.f8191g;
            this.f8191g = null;
            this.f8189e = null;
            this.f8193i = true;
        }
        C3361a1 andSet = this.f8190f.getAndSet((Object) null);
        if (andSet != null) {
            andSet.f6238a.f6245a.remove(this);
        }
        C3495o.m8908j(r);
        return (C3356i) r;
    }

    /* renamed from: h */
    public final void mo24548h(R r) {
        this.f8191g = r;
        this.f8192h = r.mo20282F();
        this.f8187c.countDown();
        if (this.f8194j) {
            this.f8189e = null;
        } else {
            C3357j<? super R> jVar = this.f8189e;
            if (jVar != null) {
                this.f8186b.removeMessages(2);
                this.f8186b.mo24550a(jVar, mo24547g());
            } else if (this.f8191g instanceof C3355h) {
                this.mResultGuardian = new C3401n1(this, (C3398m1) null);
            }
        }
        ArrayList<C3352f.C3353a> arrayList = this.f8188d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo20458a(this.f8192h);
        }
        this.f8188d.clear();
    }

    /* renamed from: j */
    public final void mo24549j() {
        boolean z = true;
        if (!this.f8197m && !f8183n.get().booleanValue()) {
            z = false;
        }
        this.f8197m = z;
    }

    public BasePendingResult(@Nullable C3348d dVar) {
        this.f8185a = new Object();
        this.f8187c = new CountDownLatch(1);
        this.f8188d = new ArrayList<>();
        this.f8190f = new AtomicReference<>();
        this.f8197m = false;
        this.f8186b = new C4071a<>(dVar != null ? dVar.mo20451c() : Looper.getMainLooper());
        new WeakReference(dVar);
    }
}
