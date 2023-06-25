package p040c.p200q.p201a.p264c.p276d.p281j;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import p040c.p200q.p201a.p264c.p276d.p277g.C3352f;
import p040c.p200q.p201a.p264c.p276d.p281j.C3491n;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.j.l0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3485l0 implements C3352f.C3353a {

    /* renamed from: a */
    public final /* synthetic */ C3352f f6474a;

    /* renamed from: b */
    public final /* synthetic */ C5773k f6475b;

    /* renamed from: c */
    public final /* synthetic */ C3491n.C3492a f6476c;

    public C3485l0(C3352f fVar, C5773k kVar, C3491n.C3492a aVar, C3493n0 n0Var) {
        this.f6474a = fVar;
        this.f6475b = kVar;
        this.f6476c = aVar;
    }

    /* renamed from: a */
    public final void mo20458a(Status status) {
        if (status.mo24536U()) {
            this.f6475b.mo28861c(this.f6476c.mo20749a(this.f6474a.mo20457b(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f6475b.mo28860b(C3447b.m8741a(status));
    }
}
