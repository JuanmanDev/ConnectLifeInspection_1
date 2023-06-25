package p040c.p200q.p363c.p367l;

import com.google.firebase.auth.FirebaseAuth;

/* renamed from: c.q.c.l.a0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6356a0 implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ FirebaseAuth f12028e;

    public C6356a0(FirebaseAuth firebaseAuth) {
        this.f12028e = firebaseAuth;
    }

    public final void run() {
        for (FirebaseAuth.C8248a a : this.f12028e.f15340d) {
            a.mo37341a(this.f12028e);
        }
    }
}
