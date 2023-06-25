package p040c.p075c0.p076b;

import android.os.Build;
import androidx.annotation.NonNull;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.c0.b.a */
/* compiled from: ConnectHoodPlugin */
public class C1538a implements C8944a, C9017j.C9021c {

    /* renamed from: e */
    public C9017j f760e;

    public void onAttachedToEngine(@NonNull C8944a.C8946b bVar) {
        C9017j jVar = new C9017j(bVar.mo46465b(), "connect_hood");
        this.f760e = jVar;
        jVar.mo46575e(this);
    }

    public void onDetachedFromEngine(@NonNull C8944a.C8946b bVar) {
        this.f760e.mo46575e((C9017j.C9021c) null);
    }

    public void onMethodCall(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
        if (iVar.f17687a.equals("getPlatformVersion")) {
            dVar.success("Android " + Build.VERSION.RELEASE);
            return;
        }
        dVar.notImplemented();
    }
}
