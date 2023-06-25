package p040c.p200q.p201a.p219b.p250l0.p252l;

import java.util.List;
import p040c.p200q.p201a.p219b.p250l0.C3032b;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.l0.l.a */
/* compiled from: DvbDecoder */
public final class C3056a extends C3032b {

    /* renamed from: n */
    public final C3057b f5443n;

    public C3056a(List<byte[]> list) {
        super("DvbDecoder");
        C3173t tVar = new C3173t(list.get(0));
        this.f5443n = new C3057b(tVar.mo19999E(), tVar.mo19999E());
    }

    /* renamed from: B */
    public C3066c mo19616y(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f5443n.mo19702r();
        }
        return new C3066c(this.f5443n.mo19701b(bArr, i));
    }
}
