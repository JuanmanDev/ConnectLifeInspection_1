package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.d.a.a.c.j */
/* compiled from: com.google.android.play:review@@2.0.1 */
public abstract class C5805j implements Runnable {
    @Nullable

    /* renamed from: e */
    public final C5773k f11310e;

    public C5805j() {
        this.f11310e = null;
    }

    public C5805j(@Nullable C5773k kVar) {
        this.f11310e = kVar;
    }

    /* renamed from: a */
    public abstract void mo28900a();

    @Nullable
    /* renamed from: b */
    public final C5773k mo28901b() {
        return this.f11310e;
    }

    /* renamed from: c */
    public final void mo28902c(Exception exc) {
        C5773k kVar = this.f11310e;
        if (kVar != null) {
            kVar.mo28862d(exc);
        }
    }

    public final void run() {
        try {
            mo28900a();
        } catch (Exception e) {
            mo28902c(e);
        }
    }
}
