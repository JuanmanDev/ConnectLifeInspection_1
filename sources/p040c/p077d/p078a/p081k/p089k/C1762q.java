package p040c.p077d.p078a.p081k.p089k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.k.q */
/* compiled from: MultiModelLoader */
public class C1762q<Model, Data> implements C1756n<Model, Data> {

    /* renamed from: a */
    public final List<C1756n<Model, Data>> f1315a;

    /* renamed from: b */
    public final Pools.Pool<List<Throwable>> f1316b;

    /* renamed from: c.d.a.k.k.q$a */
    /* compiled from: MultiModelLoader */
    public static class C1763a<Data> implements C1578d<Data>, C1578d.C1579a<Data> {

        /* renamed from: e */
        public final List<C1578d<Data>> f1317e;

        /* renamed from: l */
        public final Pools.Pool<List<Throwable>> f1318l;

        /* renamed from: m */
        public int f1319m = 0;

        /* renamed from: n */
        public Priority f1320n;

        /* renamed from: o */
        public C1578d.C1579a<? super Data> f1321o;
        @Nullable

        /* renamed from: p */
        public List<Throwable> f1322p;

        /* renamed from: q */
        public boolean f1323q;

        public C1763a(@NonNull List<C1578d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f1318l = pool;
            C1949i.m2562c(list);
            this.f1317e = list;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo15624a() {
            return this.f1317e.get(0).mo15624a();
        }

        /* renamed from: b */
        public void mo15629b() {
            List<Throwable> list = this.f1322p;
            if (list != null) {
                this.f1318l.release(list);
            }
            this.f1322p = null;
            for (C1578d<Data> b : this.f1317e) {
                b.mo15629b();
            }
        }

        @NonNull
        /* renamed from: c */
        public DataSource mo15630c() {
            return this.f1317e.get(0).mo15630c();
        }

        public void cancel() {
            this.f1323q = true;
            for (C1578d<Data> cancel : this.f1317e) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public void mo15643d(@NonNull Exception exc) {
            List<Throwable> list = this.f1322p;
            C1949i.m2563d(list);
            list.add(exc);
            mo16038g();
        }

        /* renamed from: e */
        public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super Data> aVar) {
            this.f1320n = priority;
            this.f1321o = aVar;
            this.f1322p = this.f1318l.acquire();
            this.f1317e.get(this.f1319m).mo15633e(priority, this);
            if (this.f1323q) {
                cancel();
            }
        }

        /* renamed from: f */
        public void mo15644f(@Nullable Data data) {
            if (data != null) {
                this.f1321o.mo15644f(data);
            } else {
                mo16038g();
            }
        }

        /* renamed from: g */
        public final void mo16038g() {
            if (!this.f1323q) {
                if (this.f1319m < this.f1317e.size() - 1) {
                    this.f1319m++;
                    mo15633e(this.f1320n, this.f1321o);
                    return;
                }
                C1949i.m2563d(this.f1322p);
                this.f1321o.mo15643d(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f1322p)));
            }
        }
    }

    public C1762q(@NonNull List<C1756n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f1315a = list;
        this.f1316b = pool;
    }

    /* renamed from: a */
    public boolean mo15973a(@NonNull Model model) {
        for (C1756n<Model, Data> a : this.f1315a) {
            if (a.mo15973a(model)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C1756n.C1757a<Data> mo15974b(@NonNull Model model, int i, int i2, @NonNull C1571e eVar) {
        C1756n.C1757a b;
        int size = this.f1315a.size();
        ArrayList arrayList = new ArrayList(size);
        C1567c cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1756n nVar = this.f1315a.get(i3);
            if (nVar.mo15973a(model) && (b = nVar.mo15974b(model, i, i2, eVar)) != null) {
                cVar = b.f1308a;
                arrayList.add(b.f1310c);
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new C1756n.C1757a<>(cVar, new C1763a(arrayList, this.f1316b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f1315a.toArray()) + '}';
    }
}
