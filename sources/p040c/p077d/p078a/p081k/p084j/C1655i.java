package p040c.p077d.p078a.p081k.p084j;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p082i.C1580e;
import p040c.p077d.p078a.p081k.p091l.p097h.C1870e;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.j.i */
/* compiled from: DecodePath */
public class C1655i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    public final Class<DataType> f1102a;

    /* renamed from: b */
    public final List<? extends C1572f<DataType, ResourceType>> f1103b;

    /* renamed from: c */
    public final C1870e<ResourceType, Transcode> f1104c;

    /* renamed from: d */
    public final Pools.Pool<List<Throwable>> f1105d;

    /* renamed from: e */
    public final String f1106e;

    /* renamed from: c.d.a.k.j.i$a */
    /* compiled from: DecodePath */
    public interface C1656a<ResourceType> {
        @NonNull
        /* renamed from: a */
        C1685u<ResourceType> mo15803a(@NonNull C1685u<ResourceType> uVar);
    }

    public C1655i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends C1572f<DataType, ResourceType>> list, C1870e<ResourceType, Transcode> eVar, Pools.Pool<List<Throwable>> pool) {
        this.f1102a = cls;
        this.f1103b = list;
        this.f1104c = eVar;
        this.f1105d = pool;
        this.f1106e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: a */
    public C1685u<Transcode> mo15814a(C1580e<DataType> eVar, int i, int i2, @NonNull C1571e eVar2, C1656a<ResourceType> aVar) {
        return this.f1104c.mo16189a(aVar.mo15803a(mo15815b(eVar, i, i2, eVar2)), eVar2);
    }

    @NonNull
    /* renamed from: b */
    public final C1685u<ResourceType> mo15815b(C1580e<DataType> eVar, int i, int i2, @NonNull C1571e eVar2) {
        List<Throwable> acquire = this.f1105d.acquire();
        C1949i.m2563d(acquire);
        List list = acquire;
        try {
            return mo15816c(eVar, i, i2, eVar2, list);
        } finally {
            this.f1105d.release(list);
        }
    }

    @NonNull
    /* renamed from: c */
    public final C1685u<ResourceType> mo15816c(C1580e<DataType> eVar, int i, int i2, @NonNull C1571e eVar2, List<Throwable> list) {
        int size = this.f1103b.size();
        C1685u<ResourceType> uVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C1572f fVar = (C1572f) this.f1103b.get(i3);
            try {
                if (fVar.mo15620a(eVar.mo15645a(), eVar2)) {
                    uVar = fVar.mo15621b(eVar.mo15645a(), i, i2, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    "Failed to decode data for " + fVar;
                }
                list.add(e);
            }
            if (uVar != null) {
                break;
            }
        }
        if (uVar != null) {
            return uVar;
        }
        throw new GlideException(this.f1106e, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f1102a + ", decoders=" + this.f1103b + ", transcoder=" + this.f1104c + '}';
    }
}
