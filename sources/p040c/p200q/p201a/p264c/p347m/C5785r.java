package p040c.p200q.p201a.p264c.p347m;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutionException;

/* renamed from: c.q.a.c.m.r */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
public final class C5785r<T> implements C5784q<T> {

    /* renamed from: a */
    public final Object f11282a = new Object();

    /* renamed from: b */
    public final int f11283b;

    /* renamed from: c */
    public final C5780n0 f11284c;

    /* renamed from: d */
    public int f11285d;

    /* renamed from: e */
    public int f11286e;

    /* renamed from: f */
    public int f11287f;

    /* renamed from: g */
    public Exception f11288g;

    /* renamed from: h */
    public boolean f11289h;

    public C5785r(int i, C5780n0 n0Var) {
        this.f11283b = i;
        this.f11284c = n0Var;
    }

    /* renamed from: a */
    public final void mo28832a() {
        synchronized (this.f11282a) {
            this.f11287f++;
            this.f11289h = true;
            mo28879b();
        }
    }

    /* renamed from: b */
    public final void mo28879b() {
        if (this.f11285d + this.f11286e + this.f11287f != this.f11283b) {
            return;
        }
        if (this.f11288g != null) {
            C5780n0 n0Var = this.f11284c;
            int i = this.f11286e;
            int i2 = this.f11283b;
            n0Var.mo28869t(new ExecutionException(i + " out of " + i2 + " underlying tasks failed", this.f11288g));
        } else if (this.f11289h) {
            this.f11284c.mo28871v();
        } else {
            this.f11284c.mo28870u((Object) null);
        }
    }

    public final void onFailure(@NonNull Exception exc) {
        synchronized (this.f11282a) {
            this.f11286e++;
            this.f11288g = exc;
            mo28879b();
        }
    }

    public final void onSuccess(T t) {
        synchronized (this.f11282a) {
            this.f11285d++;
            mo28879b();
        }
    }
}
