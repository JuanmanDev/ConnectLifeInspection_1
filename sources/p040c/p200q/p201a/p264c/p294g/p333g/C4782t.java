package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import java.io.IOException;
import java.io.OutputStream;
import p040c.p200q.p201a.p264c.p294g.p333g.C4756s;
import p040c.p200q.p201a.p264c.p294g.p333g.C4782t;

/* renamed from: c.q.a.c.g.g.t */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C4782t<MessageType extends C4782t<MessageType, BuilderType>, BuilderType extends C4756s<MessageType, BuilderType>> implements C4572l2 {
    public int zza = 0;

    /* renamed from: b */
    public int mo26149b(C4889x2 x2Var) {
        throw null;
    }

    /* renamed from: c */
    public final void mo26656c(OutputStream outputStream) {
        C4783t0 i = C4783t0.m13106i(outputStream, C4783t0.m13100c(mo26155n()));
        mo26160s(i);
        i.mo26554m();
    }

    /* renamed from: i */
    public final byte[] mo26231i() {
        try {
            byte[] bArr = new byte[mo26155n()];
            C4783t0 h = C4783t0.m13105h(bArr);
            mo26160s(h);
            h.mo26657j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: j */
    public final zzacc mo26232j() {
        try {
            int n = mo26155n();
            zzacc zzacc = zzacc.zzb;
            byte[] bArr = new byte[n];
            C4783t0 h = C4783t0.m13105h(bArr);
            mo26160s(h);
            h.mo26657j();
            return new C4435g0(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
