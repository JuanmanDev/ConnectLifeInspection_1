package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1580e;
import p040c.p077d.p078a.p081k.p084j.C1655i;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.j.s */
/* compiled from: LoadPath */
public class C1682s<Data, ResourceType, Transcode> {

    /* renamed from: a */
    public final Pools.Pool<List<Throwable>> f1185a;

    /* renamed from: b */
    public final List<? extends C1655i<Data, ResourceType, Transcode>> f1186b;

    /* renamed from: c */
    public final String f1187c;

    public C1682s(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1655i<Data, ResourceType, Transcode>> list, Pools.Pool<List<Throwable>> pool) {
        this.f1185a = pool;
        C1949i.m2562c(list);
        this.f1186b = list;
        this.f1187c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public C1685u<Transcode> mo15880a(C1580e<Data> eVar, @NonNull C1571e eVar2, int i, int i2, C1655i.C1656a<ResourceType> aVar) {
        List<Throwable> acquire = this.f1185a.acquire();
        C1949i.m2563d(acquire);
        List list = acquire;
        try {
            return mo15881b(eVar, eVar2, i, i2, aVar, list);
        } finally {
            this.f1185a.release(list);
        }
    }

    /* renamed from: b */
    public final C1685u<Transcode> mo15881b(C1580e<Data> eVar, @NonNull C1571e eVar2, int i, int i2, C1655i.C1656a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f1186b.size();
        C1685u<Transcode> uVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                uVar = ((C1655i) this.f1186b.get(i3)).mo15814a(eVar, i, i2, eVar2, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f1187c, (List<Throwable>) new ArrayList(list2));
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1186b.toArray()) + '}';
    }
}
