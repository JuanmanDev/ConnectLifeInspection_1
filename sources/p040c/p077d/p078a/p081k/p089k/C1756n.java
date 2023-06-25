package p040c.p077d.p078a.p081k.p089k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.k.n */
/* compiled from: ModelLoader */
public interface C1756n<Model, Data> {

    /* renamed from: c.d.a.k.k.n$a */
    /* compiled from: ModelLoader */
    public static class C1757a<Data> {

        /* renamed from: a */
        public final C1567c f1308a;

        /* renamed from: b */
        public final List<C1567c> f1309b;

        /* renamed from: c */
        public final C1578d<Data> f1310c;

        public C1757a(@NonNull C1567c cVar, @NonNull C1578d<Data> dVar) {
            this(cVar, Collections.emptyList(), dVar);
        }

        public C1757a(@NonNull C1567c cVar, @NonNull List<C1567c> list, @NonNull C1578d<Data> dVar) {
            C1949i.m2563d(cVar);
            this.f1308a = cVar;
            C1949i.m2563d(list);
            this.f1309b = list;
            C1949i.m2563d(dVar);
            this.f1310c = dVar;
        }
    }

    /* renamed from: a */
    boolean mo15973a(@NonNull Model model);

    @Nullable
    /* renamed from: b */
    C1757a<Data> mo15974b(@NonNull Model model, int i, int i2, @NonNull C1571e eVar);
}
