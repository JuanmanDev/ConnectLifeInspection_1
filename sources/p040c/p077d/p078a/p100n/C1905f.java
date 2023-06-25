package p040c.p077d.p078a.p100n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p040c.p077d.p078a.p081k.C1573g;

/* renamed from: c.d.a.n.f */
/* compiled from: ResourceEncoderRegistry */
public class C1905f {

    /* renamed from: a */
    public final List<C1906a<?>> f1521a = new ArrayList();

    /* renamed from: c.d.a.n.f$a */
    /* compiled from: ResourceEncoderRegistry */
    public static final class C1906a<T> {

        /* renamed from: a */
        public final Class<T> f1522a;

        /* renamed from: b */
        public final C1573g<T> f1523b;

        public C1906a(@NonNull Class<T> cls, @NonNull C1573g<T> gVar) {
            this.f1522a = cls;
            this.f1523b = gVar;
        }

        /* renamed from: a */
        public boolean mo16259a(@NonNull Class<?> cls) {
            return this.f1522a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <Z> void mo16257a(@NonNull Class<Z> cls, @NonNull C1573g<Z> gVar) {
        this.f1521a.add(new C1906a(cls, gVar));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <Z> C1573g<Z> mo16258b(@NonNull Class<Z> cls) {
        int size = this.f1521a.size();
        for (int i = 0; i < size; i++) {
            C1906a aVar = this.f1521a.get(i);
            if (aVar.mo16259a(cls)) {
                return aVar.f1523b;
            }
        }
        return null;
    }
}
