package p040c.p077d.p078a;

import p040c.p077d.p078a.C1549h;
import p040c.p077d.p078a.p101o.p103k.C1929a;
import p040c.p077d.p078a.p101o.p103k.C1933c;

/* renamed from: c.d.a.h */
/* compiled from: TransitionOptions */
public abstract class C1549h<CHILD extends C1549h<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: e */
    public C1933c<? super TranscodeType> f828e = C1929a.m2521b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (C1549h) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final C1933c<? super TranscodeType> mo15523b() {
        return this.f828e;
    }
}
