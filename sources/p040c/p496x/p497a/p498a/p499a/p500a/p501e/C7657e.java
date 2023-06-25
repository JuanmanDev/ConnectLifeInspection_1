package p040c.p496x.p497a.p498a.p499a.p500a.p501e;

import com.p530ju.lib.datacommunication.network.http.core.HiRequest;
import java.util.HashMap;
import java.util.Map;
import p040c.p496x.p497a.p498a.p499a.p500a.p501e.C7657e;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7658a;

/* renamed from: c.x.a.a.a.a.e.e */
public abstract class C7657e<T extends C7657e<?>> extends C7654b<T> {

    /* renamed from: d */
    public Map<String, String> f14400d = new HashMap();

    public C7657e(C7658a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public void mo33102d(HiRequest.C8725b bVar) {
        bVar.mo44447k();
        bVar.mo44456t(this.f14398c, this.f14400d);
    }

    /* renamed from: g */
    public T mo33107g(Map<String, String> map) {
        this.f14400d.putAll(map);
        mo33098b();
        return this;
    }
}
