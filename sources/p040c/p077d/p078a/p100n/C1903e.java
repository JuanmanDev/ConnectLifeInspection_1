package p040c.p077d.p078a.p100n;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p077d.p078a.p081k.C1572f;

/* renamed from: c.d.a.n.e */
/* compiled from: ResourceDecoderRegistry */
public class C1903e {

    /* renamed from: a */
    public final List<String> f1516a = new ArrayList();

    /* renamed from: b */
    public final Map<String, List<C1904a<?, ?>>> f1517b = new HashMap();

    /* renamed from: c.d.a.n.e$a */
    /* compiled from: ResourceDecoderRegistry */
    public static class C1904a<T, R> {

        /* renamed from: a */
        public final Class<T> f1518a;

        /* renamed from: b */
        public final Class<R> f1519b;

        /* renamed from: c */
        public final C1572f<T, R> f1520c;

        public C1904a(@NonNull Class<T> cls, @NonNull Class<R> cls2, C1572f<T, R> fVar) {
            this.f1518a = cls;
            this.f1519b = cls2;
            this.f1520c = fVar;
        }

        /* renamed from: a */
        public boolean mo16256a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f1518a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f1519b);
        }
    }

    /* renamed from: a */
    public synchronized <T, R> void mo16251a(@NonNull String str, @NonNull C1572f<T, R> fVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        mo16253c(str).add(new C1904a(cls, cls2, fVar));
    }

    @NonNull
    /* renamed from: b */
    public synchronized <T, R> List<C1572f<T, R>> mo16252b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f1516a) {
            List<C1904a> list = this.f1517b.get(str);
            if (list != null) {
                for (C1904a aVar : list) {
                    if (aVar.mo16256a(cls, cls2)) {
                        arrayList.add(aVar.f1520c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: c */
    public final synchronized List<C1904a<?, ?>> mo16253c(@NonNull String str) {
        List<C1904a<?, ?>> list;
        if (!this.f1516a.contains(str)) {
            this.f1516a.add(str);
        }
        list = this.f1517b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f1517b.put(str, list);
        }
        return list;
    }

    @NonNull
    /* renamed from: d */
    public synchronized <T, R> List<Class<R>> mo16254d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.f1516a) {
            List<C1904a> list = this.f1517b.get(str);
            if (list != null) {
                for (C1904a aVar : list) {
                    if (aVar.mo16256a(cls, cls2) && !arrayList.contains(aVar.f1519b)) {
                        arrayList.add(aVar.f1519b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public synchronized void mo16255e(@NonNull List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>(this.f1516a);
        this.f1516a.clear();
        this.f1516a.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f1516a.add(str);
            }
        }
    }
}
