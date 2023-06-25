package p040c.p077d.p078a.p081k.p089k;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.v */
/* compiled from: UnitModelLoader */
public class C1778v<Model> implements C1756n<Model, Model> {

    /* renamed from: a */
    public static final C1778v<?> f1341a = new C1778v<>();

    /* renamed from: c.d.a.k.k.v$a */
    /* compiled from: UnitModelLoader */
    public static class C1779a<Model> implements C1758o<Model, Model> {

        /* renamed from: a */
        public static final C1779a<?> f1342a = new C1779a<>();

        /* renamed from: a */
        public static <T> C1779a<T> m1921a() {
            return f1342a;
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Model, Model> mo15978b(C1764r rVar) {
            return C1778v.m1918c();
        }
    }

    /* renamed from: c.d.a.k.k.v$b */
    /* compiled from: UnitModelLoader */
    public static class C1780b<Model> implements C1578d<Model> {

        /* renamed from: e */
        public final Model f1343e;

        public C1780b(Model model) {
            this.f1343e = model;
        }

        @NonNull
        /* renamed from: a */
        public Class<Model> mo15624a() {
            return this.f1343e.getClass();
        }

        /* renamed from: b */
        public void mo15629b() {
        }

        @NonNull
        /* renamed from: c */
        public DataSource mo15630c() {
            return DataSource.LOCAL;
        }

        public void cancel() {
        }

        /* renamed from: e */
        public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super Model> aVar) {
            aVar.mo15644f(this.f1343e);
        }
    }

    /* renamed from: c */
    public static <T> C1778v<T> m1918c() {
        return f1341a;
    }

    /* renamed from: a */
    public boolean mo15973a(@NonNull Model model) {
        return true;
    }

    /* renamed from: b */
    public C1756n.C1757a<Model> mo15974b(@NonNull Model model, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(model), new C1780b(model));
    }
}
