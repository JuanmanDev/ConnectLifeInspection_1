package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzkp;
import java.io.IOException;
import p040c.p200q.p201a.p264c.p294g.p335i.C5234q8;
import p040c.p200q.p201a.p264c.p294g.p335i.C5279t8;

/* renamed from: c.q.a.c.g.i.q8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public class C5234q8<MessageType extends C5279t8<MessageType, BuilderType>, BuilderType extends C5234q8<MessageType, BuilderType>> extends C5030d7<MessageType, BuilderType> {

    /* renamed from: e */
    public final C5279t8 f10096e;

    /* renamed from: l */
    public C5279t8 f10097l;

    public C5234q8(MessageType messagetype) {
        this.f10096e = messagetype;
        if (!messagetype.mo27724w()) {
            this.f10097l = this.f10096e.mo27719j();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: i */
    public static void m14675i(Object obj, Object obj2) {
        C5017ca.m13951a().mo27133b(obj.getClass()).mo27242f(obj, obj2);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C5295u9 mo27517e() {
        throw null;
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C5030d7 mo27149f(byte[] bArr, int i, int i2) {
        mo27519k(bArr, 0, i2, C5079g8.f9907c);
        return this;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C5030d7 mo27150h(byte[] bArr, int i, int i2, C5079g8 g8Var) {
        mo27519k(bArr, 0, i2, g8Var);
        return this;
    }

    /* renamed from: j */
    public final C5234q8 mo27518j(C5279t8 t8Var) {
        if (!this.f10096e.equals(t8Var)) {
            if (!this.f10097l.mo27724w()) {
                mo27524p();
            }
            m14675i(this.f10097l, t8Var);
        }
        return this;
    }

    /* renamed from: k */
    public final C5234q8 mo27519k(byte[] bArr, int i, int i2, C5079g8 g8Var) {
        if (!this.f10097l.mo27724w()) {
            mo27524p();
        }
        try {
            C5017ca.m13951a().mo27133b(this.f10097l.getClass()).mo27245i(this.f10097l, bArr, 0, i2, new C5094h7(g8Var));
            return this;
        } catch (zzkp e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw zzkp.zzf();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo27520l() {
        /*
            r5 = this;
            c.q.a.c.g.i.t8 r0 = r5.mo27523o()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo26916C(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            c.q.a.c.g.i.ca r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5017ca.m13951a()
            java.lang.Class r4 = r0.getClass()
            c.q.a.c.g.i.fa r3 = r3.mo27133b(r4)
            boolean r3 = r3.mo27239c(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo26916C(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            com.google.android.gms.internal.measurement.zzmn r1 = new com.google.android.gms.internal.measurement.zzmn
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5234q8.mo27520l():c.q.a.c.g.i.t8");
    }

    /* renamed from: m */
    public MessageType mo27523o() {
        if (!this.f10097l.mo27724w()) {
            return this.f10097l;
        }
        this.f10097l.mo27720s();
        return this.f10097l;
    }

    /* renamed from: n */
    public final void mo27522n() {
        if (!this.f10097l.mo27724w()) {
            mo27524p();
        }
    }

    /* renamed from: p */
    public void mo27524p() {
        C5279t8 j = this.f10096e.mo27719j();
        m14675i(j, this.f10097l);
        this.f10097l = j;
    }

    /* renamed from: q */
    public final C5234q8 clone() {
        C5234q8 q8Var = (C5234q8) this.f10096e.mo26916C(5, (Object) null, (Object) null);
        q8Var.f10097l = mo27523o();
        return q8Var;
    }
}
