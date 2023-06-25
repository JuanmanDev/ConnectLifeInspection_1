package p040c.p200q.p201a.p264c.p294g.p333g;

import java.io.OutputStream;

/* renamed from: c.q.a.c.g.g.m4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4601m4 implements C4413f5 {

    /* renamed from: a */
    public final OutputStream f9418a;

    public C4601m4(OutputStream outputStream) {
        this.f9418a = outputStream;
    }

    /* renamed from: c */
    public static C4413f5 m12460c(OutputStream outputStream) {
        return new C4601m4(outputStream);
    }

    /* renamed from: a */
    public final void mo25973a(C4773sg sgVar) {
        throw null;
    }

    /* renamed from: b */
    public final void mo25974b(C4453gi giVar) {
        try {
            giVar.mo26656c(this.f9418a);
        } finally {
            this.f9418a.close();
        }
    }
}
