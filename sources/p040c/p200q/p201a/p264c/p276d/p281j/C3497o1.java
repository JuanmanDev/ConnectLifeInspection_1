package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p276d.p289n.C3562m;

/* renamed from: c.q.a.c.d.j.o1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3497o1 implements ServiceConnection, C3509s1 {

    /* renamed from: e */
    public final Map f6486e = new HashMap();

    /* renamed from: l */
    public int f6487l = 2;

    /* renamed from: m */
    public boolean f6488m;
    @Nullable

    /* renamed from: n */
    public IBinder f6489n;

    /* renamed from: o */
    public final C3494n1 f6490o;

    /* renamed from: p */
    public ComponentName f6491p;

    /* renamed from: q */
    public final /* synthetic */ C3506r1 f6492q;

    public C3497o1(C3506r1 r1Var, C3494n1 n1Var) {
        this.f6492q = r1Var;
        this.f6490o = n1Var;
    }

    /* renamed from: a */
    public final int mo20761a() {
        return this.f6487l;
    }

    /* renamed from: b */
    public final ComponentName mo20762b() {
        return this.f6491p;
    }

    @Nullable
    /* renamed from: c */
    public final IBinder mo20763c() {
        return this.f6489n;
    }

    /* renamed from: d */
    public final void mo20764d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f6486e.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void mo20765e(String str, @Nullable Executor executor) {
        this.f6487l = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C3562m.m9091l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C3506r1 r1Var = this.f6492q;
            boolean d = r1Var.f6504j.mo20834d(r1Var.f6501g, str, this.f6490o.mo20754c(r1Var.f6501g), this, this.f6490o.mo20752a(), executor);
            this.f6488m = d;
            if (d) {
                this.f6492q.f6502h.sendMessageDelayed(this.f6492q.f6502h.obtainMessage(1, this.f6490o), this.f6492q.f6506l);
            } else {
                this.f6487l = 2;
                try {
                    C3506r1 r1Var2 = this.f6492q;
                    r1Var2.f6504j.mo20833c(r1Var2.f6501g, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void mo20766f(ServiceConnection serviceConnection, String str) {
        this.f6486e.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void mo20767g(String str) {
        this.f6492q.f6502h.removeMessages(1, this.f6490o);
        C3506r1 r1Var = this.f6492q;
        r1Var.f6504j.mo20833c(r1Var.f6501g, this);
        this.f6488m = false;
        this.f6487l = 2;
    }

    /* renamed from: h */
    public final boolean mo20768h(ServiceConnection serviceConnection) {
        return this.f6486e.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean mo20769i() {
        return this.f6486e.isEmpty();
    }

    /* renamed from: j */
    public final boolean mo20770j() {
        return this.f6488m;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6492q.f6500f) {
            this.f6492q.f6502h.removeMessages(1, this.f6490o);
            this.f6489n = iBinder;
            this.f6491p = componentName;
            for (ServiceConnection onServiceConnected : this.f6486e.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f6487l = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6492q.f6500f) {
            this.f6492q.f6502h.removeMessages(1, this.f6490o);
            this.f6489n = null;
            this.f6491p = componentName;
            for (ServiceConnection onServiceDisconnected : this.f6486e.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f6487l = 2;
        }
    }
}
