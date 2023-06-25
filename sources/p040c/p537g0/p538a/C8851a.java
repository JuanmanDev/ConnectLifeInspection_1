package p040c.p537g0.p538a;

import androidx.annotation.NonNull;
import java.util.Map;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.g0.a.a */
/* compiled from: MethodCallHandlerImpl */
public class C8851a implements C9017j.C9021c {

    /* renamed from: e */
    public C8853c f17211e;

    public C8851a(C8853c cVar) {
        this.f17211e = cVar;
    }

    public void onMethodCall(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
        if (!"share".equals(iVar.f17687a)) {
            dVar.notImplemented();
        } else if (iVar.f17688b instanceof Map) {
            this.f17211e.mo46044d(iVar);
            dVar.success((Object) null);
        } else {
            throw new IllegalArgumentException("Map argument expected");
        }
    }
}
