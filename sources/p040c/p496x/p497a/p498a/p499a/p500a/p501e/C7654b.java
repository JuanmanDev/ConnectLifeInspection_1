package p040c.p496x.p497a.p498a.p499a.p500a.p501e;

import com.p530ju.lib.datacommunication.network.http.core.HiRequest;
import java.util.Map;
import p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7654b;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7658a;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7664d;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h.C7682b;

/* renamed from: c.x.a.a.a.a.e.b */
public abstract class C7654b<T extends C7654b<?>> {

    /* renamed from: a */
    public C7658a f14396a;

    /* renamed from: b */
    public final HiRequest.C8725b f14397b = new HiRequest.C8725b();

    /* renamed from: c */
    public String f14398c;

    public C7654b(C7658a aVar) {
        this.f14396a = aVar;
    }

    /* renamed from: a */
    public C7664d mo33100a() {
        mo33102d(this.f14397b);
        return this.f14396a.mo33108a(this.f14397b.mo44446j());
    }

    /* renamed from: b */
    public abstract T mo33098b();

    /* renamed from: c */
    public T mo33101c(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f14397b.mo44448l((String) next.getKey(), (String) next.getValue());
        }
        return mo33098b();
    }

    /* renamed from: d */
    public void mo33102d(HiRequest.C8725b bVar) {
        bVar.mo44455s(this.f14398c);
    }

    /* renamed from: e */
    public T mo33103e(C7682b bVar) {
        this.f14397b.mo44453q(bVar);
        return mo33098b();
    }

    /* renamed from: f */
    public T mo33104f(String str) {
        this.f14398c = str;
        return mo33098b();
    }
}
