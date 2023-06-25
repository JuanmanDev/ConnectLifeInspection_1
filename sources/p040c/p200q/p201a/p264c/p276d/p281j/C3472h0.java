package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Context;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p264c.p276d.C3326c;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;

/* renamed from: c.q.a.c.d.j.h0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3472h0 {

    /* renamed from: a */
    public final SparseIntArray f6468a = new SparseIntArray();

    /* renamed from: b */
    public C3326c f6469b;

    public C3472h0(@NonNull C3326c cVar) {
        C3495o.m8908j(cVar);
        this.f6469b = cVar;
    }

    /* renamed from: a */
    public final int mo20732a(Context context, int i) {
        return this.f6468a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo20733b(@NonNull Context context, @NonNull C3334a.C3342f fVar) {
        C3495o.m8908j(context);
        C3495o.m8908j(fVar);
        int i = 0;
        if (!fVar.mo20429h()) {
            return 0;
        }
        int j = fVar.mo20302j();
        int a = mo20732a(context, j);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f6468a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f6468a.keyAt(i2);
                if (keyAt > j && this.f6468a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            a = i == -1 ? this.f6469b.mo20389h(context, j) : i;
            this.f6468a.put(j, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo20734c() {
        this.f6468a.clear();
    }
}
