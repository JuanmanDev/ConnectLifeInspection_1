package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a;
import p040c.p200q.p201a.p264c.p276d.p277g.C3334a.C3336b;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.q */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3408q<A extends C3334a.C3336b, ResultT> {
    @Nullable

    /* renamed from: a */
    public final Feature[] f6351a;

    /* renamed from: b */
    public final boolean f6352b;

    /* renamed from: c */
    public final int f6353c;

    /* renamed from: c.q.a.c.d.g.l.q$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C3409a<A extends C3334a.C3336b, ResultT> {

        /* renamed from: a */
        public C3396m<A, C5773k<ResultT>> f6354a;

        /* renamed from: b */
        public boolean f6355b = true;

        /* renamed from: c */
        public Feature[] f6356c;

        /* renamed from: d */
        public int f6357d = 0;

        public /* synthetic */ C3409a(C3424x0 x0Var) {
        }

        @NonNull
        /* renamed from: a */
        public C3408q<A, ResultT> mo20603a() {
            C3495o.m8900b(this.f6354a != null, "execute parameter required");
            return new C3422w0(this, this.f6356c, this.f6355b, this.f6357d);
        }

        @NonNull
        /* renamed from: b */
        public C3409a<A, ResultT> mo20604b(@NonNull C3396m<A, C5773k<ResultT>> mVar) {
            this.f6354a = mVar;
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C3409a<A, ResultT> mo20605c(boolean z) {
            this.f6355b = z;
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C3409a<A, ResultT> mo20606d(@NonNull Feature... featureArr) {
            this.f6356c = featureArr;
            return this;
        }
    }

    public C3408q(@Nullable Feature[] featureArr, boolean z, int i) {
        this.f6351a = featureArr;
        boolean z2 = false;
        if (featureArr != null && z) {
            z2 = true;
        }
        this.f6352b = z2;
        this.f6353c = i;
    }

    @NonNull
    /* renamed from: a */
    public static <A extends C3334a.C3336b, ResultT> C3409a<A, ResultT> m8689a() {
        return new C3409a<>((C3424x0) null);
    }

    /* renamed from: b */
    public abstract void mo20599b(@NonNull A a, @NonNull C5773k<ResultT> kVar);

    /* renamed from: c */
    public boolean mo20600c() {
        return this.f6352b;
    }

    /* renamed from: d */
    public final int mo20601d() {
        return this.f6353c;
    }

    @Nullable
    /* renamed from: e */
    public final Feature[] mo20602e() {
        return this.f6351a;
    }
}
