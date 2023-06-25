package p040c.p200q.p363c.p367l;

import com.google.firebase.auth.FirebaseAuth;
import p040c.p200q.p363c.p367l.p368h.C6369a;
import p040c.p200q.p363c.p399w.C6796b;

/* renamed from: c.q.c.l.z */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6421z implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ FirebaseAuth f12082e;

    /* renamed from: l */
    public final /* synthetic */ C6796b f12083l;

    public C6421z(FirebaseAuth firebaseAuth, C6796b bVar) {
        this.f12082e = firebaseAuth;
        this.f12083l = bVar;
    }

    public final void run() {
        for (C6369a a : this.f12082e.f15339c) {
            a.mo30457a(this.f12083l);
        }
        for (FirebaseAuth.C8249b a2 : this.f12082e.f15338b) {
            a2.mo37342a(this.f12082e);
        }
    }
}
