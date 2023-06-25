package p040c.p077d.p078a.p100n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import p040c.p077d.p078a.p081k.C1565a;

/* renamed from: c.d.a.n.a */
/* compiled from: EncoderRegistry */
public class C1898a {

    /* renamed from: a */
    public final List<C1899a<?>> f1507a = new ArrayList();

    /* renamed from: c.d.a.n.a$a */
    /* compiled from: EncoderRegistry */
    public static final class C1899a<T> {

        /* renamed from: a */
        public final Class<T> f1508a;

        /* renamed from: b */
        public final C1565a<T> f1509b;

        public C1899a(@NonNull Class<T> cls, @NonNull C1565a<T> aVar) {
            this.f1508a = cls;
            this.f1509b = aVar;
        }

        /* renamed from: a */
        public boolean mo16242a(@NonNull Class<?> cls) {
            return this.f1508a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void mo16240a(@NonNull Class<T> cls, @NonNull C1565a<T> aVar) {
        this.f1507a.add(new C1899a(cls, aVar));
    }

    @Nullable
    /* renamed from: b */
    public synchronized <T> C1565a<T> mo16241b(@NonNull Class<T> cls) {
        for (C1899a next : this.f1507a) {
            if (next.mo16242a(cls)) {
                return next.f1509b;
            }
        }
        return null;
    }
}
