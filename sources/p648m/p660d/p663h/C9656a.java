package p648m.p660d.p663h;

import org.java_websocket.exceptions.InvalidFrameException;
import p648m.p660d.p664i.C9663f;

/* renamed from: m.d.h.a */
/* compiled from: DefaultExtension */
public class C9656a implements C9657b {
    /* renamed from: a */
    public void mo50460a() {
    }

    /* renamed from: b */
    public C9657b mo50461b() {
        return new C9656a();
    }

    /* renamed from: c */
    public boolean mo50462c(String str) {
        return true;
    }

    /* renamed from: d */
    public void mo50463d(C9663f fVar) {
    }

    /* renamed from: e */
    public boolean mo50464e(String str) {
        return true;
    }

    public boolean equals(Object obj) {
        return this == obj || (obj != null && C9656a.class == obj.getClass());
    }

    /* renamed from: f */
    public void mo50466f(C9663f fVar) {
    }

    /* renamed from: g */
    public void mo50467g(C9663f fVar) {
        if (fVar.mo50484a() || fVar.mo50485b() || fVar.mo50487d()) {
            throw new InvalidFrameException("bad rsv RSV1: " + fVar.mo50484a() + " RSV2: " + fVar.mo50485b() + " RSV3: " + fVar.mo50487d());
        }
    }

    /* renamed from: h */
    public String mo50468h() {
        return "";
    }

    public int hashCode() {
        return C9656a.class.hashCode();
    }

    /* renamed from: i */
    public String mo50470i() {
        return "";
    }

    public String toString() {
        return C9656a.class.getSimpleName();
    }
}
