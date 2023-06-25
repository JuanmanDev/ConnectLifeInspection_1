package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3453d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3468g;
import p040c.p200q.p201a.p264c.p276d.p281j.C3474i;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.a.c.d.g.l.j */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3387j implements C3334a.C3342f, ServiceConnection {
    @Nullable

    /* renamed from: e */
    public final String f6315e;
    @Nullable

    /* renamed from: l */
    public final String f6316l;
    @Nullable

    /* renamed from: m */
    public final ComponentName f6317m;

    /* renamed from: n */
    public final Context f6318n;

    /* renamed from: o */
    public final C3372e f6319o;

    /* renamed from: p */
    public final Handler f6320p;

    /* renamed from: q */
    public final C3390k f6321q;
    @Nullable

    /* renamed from: r */
    public IBinder f6322r;

    /* renamed from: s */
    public boolean f6323s;
    @Nullable

    /* renamed from: t */
    public String f6324t;

    static {
        Class<C3387j> cls = C3387j.class;
    }

    @NonNull
    /* renamed from: a */
    public final Set<Scope> mo20421a() {
        return Collections.emptySet();
    }

    /* renamed from: b */
    public final void mo20422b(@Nullable C3474i iVar, @Nullable Set<Scope> set) {
    }

    @WorkerThread
    /* renamed from: c */
    public final void mo20423c(@NonNull String str) {
        mo20574q();
        this.f6324t = str;
        disconnect();
    }

    @WorkerThread
    /* renamed from: d */
    public final boolean mo20424d() {
        mo20574q();
        return this.f6323s;
    }

    @WorkerThread
    public final void disconnect() {
        mo20574q();
        mo20575r("Disconnect called.");
        try {
            this.f6318n.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f6323s = false;
        this.f6322r = null;
    }

    @NonNull
    /* renamed from: e */
    public final String mo20426e() {
        String str = this.f6315e;
        if (str != null) {
            return str;
        }
        C3495o.m8908j(this.f6317m);
        return this.f6317m.getPackageName();
    }

    @WorkerThread
    /* renamed from: f */
    public final void mo20427f(@NonNull C3453d.C3456c cVar) {
        mo20574q();
        mo20575r("Connect started.");
        if (isConnected()) {
            try {
                mo20423c("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f6317m;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f6315e).setAction(this.f6316l);
            }
            boolean bindService = this.f6318n.bindService(intent, this, C3468g.m8856a());
            this.f6323s = bindService;
            if (!bindService) {
                this.f6322r = null;
                this.f6321q.mo20511e(new ConnectionResult(16));
            }
            mo20575r("Finished connect.");
        } catch (SecurityException e) {
            this.f6323s = false;
            this.f6322r = null;
            throw e;
        }
    }

    /* renamed from: g */
    public final void mo20428g(@NonNull C3453d.C3458e eVar) {
    }

    /* renamed from: h */
    public final boolean mo20429h() {
        return false;
    }

    @WorkerThread
    public final boolean isConnected() {
        mo20574q();
        return this.f6322r != null;
    }

    /* renamed from: j */
    public final int mo20302j() {
        return 0;
    }

    @NonNull
    /* renamed from: k */
    public final Feature[] mo20431k() {
        return new Feature[0];
    }

    @Nullable
    /* renamed from: l */
    public final String mo20432l() {
        return this.f6324t;
    }

    /* renamed from: m */
    public final boolean mo20433m() {
        return false;
    }

    /* renamed from: n */
    public final /* synthetic */ void mo20569n() {
        this.f6323s = false;
        this.f6322r = null;
        mo20575r("Disconnected.");
        this.f6319o.mo20494d(1);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo20570o(IBinder iBinder) {
        this.f6323s = false;
        this.f6322r = iBinder;
        mo20575r("Connected.");
        this.f6319o.mo20495g(new Bundle());
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f6320p.post(new C3406p0(this, iBinder));
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f6320p.post(new C3403o0(this));
    }

    /* renamed from: p */
    public final void mo20573p(@Nullable String str) {
    }

    @WorkerThread
    /* renamed from: q */
    public final void mo20574q() {
        if (Thread.currentThread() != this.f6320p.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: r */
    public final void mo20575r(String str) {
        String.valueOf(String.valueOf(this.f6322r)).length();
    }
}
