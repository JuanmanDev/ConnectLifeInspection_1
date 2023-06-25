package p540d.p544b.p545a.p546a;

import com.hisense.connect_life.core.global.EventBusConstKt;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: d.b.a.a.c */
/* compiled from: ConnectivityMethodChannelHandler */
public class C8887c implements C9017j.C9021c {

    /* renamed from: e */
    public C8885a f17407e;

    public C8887c(C8885a aVar) {
        this.f17407e = aVar;
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        String str = iVar.f17687a;
        if (((str.hashCode() == 94627080 && str.equals(EventBusConstKt.CHECK)) ? (char) 0 : 65535) != 0) {
            dVar.notImplemented();
        } else {
            dVar.success(this.f17407e.mo46244a());
        }
    }
}
