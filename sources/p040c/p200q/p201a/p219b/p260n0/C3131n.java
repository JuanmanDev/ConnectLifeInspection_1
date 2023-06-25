package p040c.p200q.p201a.p219b.p260n0;

import android.content.Context;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p260n0.C3122h;

/* renamed from: c.q.a.b.n0.n */
/* compiled from: DefaultDataSourceFactory */
public final class C3131n implements C3122h.C3123a {

    /* renamed from: a */
    public final Context f5766a;
    @Nullable

    /* renamed from: b */
    public final C3141v f5767b;

    /* renamed from: c */
    public final C3122h.C3123a f5768c;

    public C3131n(Context context, String str) {
        this(context, str, (C3141v) null);
    }

    /* renamed from: b */
    public C3130m mo19884a() {
        C3130m mVar = new C3130m(this.f5766a, this.f5768c.mo19884a());
        C3141v vVar = this.f5767b;
        if (vVar != null) {
            mVar.mo19308b(vVar);
        }
        return mVar;
    }

    public C3131n(Context context, String str, @Nullable C3141v vVar) {
        this(context, vVar, (C3122h.C3123a) new C3133p(str, vVar));
    }

    public C3131n(Context context, @Nullable C3141v vVar, C3122h.C3123a aVar) {
        this.f5766a = context.getApplicationContext();
        this.f5767b = vVar;
        this.f5768c = aVar;
    }
}
