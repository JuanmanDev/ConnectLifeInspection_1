package p040c.p200q.p201a.p264c.p276d.p281j;

import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.d.j.d1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3460d1 {
    @Nullable

    /* renamed from: a */
    public Object f6434a;

    /* renamed from: b */
    public boolean f6435b = false;

    /* renamed from: c */
    public final /* synthetic */ C3453d f6436c;

    public C3460d1(C3453d dVar, Object obj) {
        this.f6436c = dVar;
        this.f6434a = obj;
    }

    /* renamed from: a */
    public abstract void mo20691a(Object obj);

    /* renamed from: b */
    public abstract void mo20692b();

    /* renamed from: c */
    public final void mo20693c() {
        Object obj;
        synchronized (this) {
            obj = this.f6434a;
            if (this.f6435b) {
                "Callback proxy " + toString() + " being reused. This is not safe.";
            }
        }
        if (obj != null) {
            try {
                mo20691a(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.f6435b = true;
        }
        mo20695e();
    }

    /* renamed from: d */
    public final void mo20694d() {
        synchronized (this) {
            this.f6434a = null;
        }
    }

    /* renamed from: e */
    public final void mo20695e() {
        mo20694d();
        synchronized (this.f6436c.f6426v) {
            this.f6436c.f6426v.remove(this);
        }
    }
}
