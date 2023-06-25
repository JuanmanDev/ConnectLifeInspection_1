package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzafm;
import p040c.p200q.p201a.p264c.p294g.p333g.C4463h1;
import p040c.p200q.p201a.p264c.p294g.p333g.C4544k1;

/* renamed from: c.q.a.c.g.g.h1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public class C4463h1<MessageType extends C4544k1<MessageType, BuilderType>, BuilderType extends C4463h1<MessageType, BuilderType>> extends C4756s<MessageType, BuilderType> {

    /* renamed from: e */
    public final C4544k1 f9258e;

    /* renamed from: l */
    public C4544k1 f9259l;

    public C4463h1(MessageType messagetype) {
        this.f9258e = messagetype;
        if (!messagetype.mo26157p()) {
            this.f9259l = this.f9258e.mo26148A();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: b */
    public static void m12075b(Object obj, Object obj2) {
        C4785t2.m13132a().mo26659b(obj.getClass()).mo26420f(obj, obj2);
    }

    /* renamed from: a */
    public final /* synthetic */ C4572l2 mo26048a() {
        throw null;
    }

    /* renamed from: c */
    public final C4463h1 clone() {
        C4463h1 h1Var = (C4463h1) this.f9258e.mo25825v(5, (Object) null, (Object) null);
        h1Var.f9259l = mo26054g();
        return h1Var;
    }

    /* renamed from: d */
    public final C4463h1 mo26051d(C4544k1 k1Var) {
        if (!this.f9258e.equals(k1Var)) {
            if (!this.f9259l.mo26157p()) {
                mo26056k();
            }
            m12075b(this.f9259l, k1Var);
        }
        return this;
    }

    /* renamed from: e */
    public final MessageType mo26052e() {
        MessageType f = mo26054g();
        if (f.mo26156o()) {
            return f;
        }
        throw new zzafm(f);
    }

    /* renamed from: f */
    public MessageType mo26054g() {
        if (!this.f9259l.mo26157p()) {
            return this.f9259l;
        }
        this.f9259l.mo26151h();
        return this.f9259l;
    }

    /* renamed from: h */
    public final void mo26055h() {
        if (!this.f9259l.mo26157p()) {
            mo26056k();
        }
    }

    /* renamed from: k */
    public void mo26056k() {
        C4544k1 A = this.f9258e.mo26148A();
        m12075b(A, this.f9259l);
        this.f9259l = A;
    }
}
