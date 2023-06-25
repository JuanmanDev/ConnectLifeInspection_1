package p040c.p077d.p078a.p105q;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.d.a.q.h */
/* compiled from: MultiClassKey */
public class C1948h {

    /* renamed from: a */
    public Class<?> f1634a;

    /* renamed from: b */
    public Class<?> f1635b;

    /* renamed from: c */
    public Class<?> f1636c;

    public C1948h() {
    }

    /* renamed from: a */
    public void mo16447a(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f1634a = cls;
        this.f1635b = cls2;
        this.f1636c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1948h.class != obj.getClass()) {
            return false;
        }
        C1948h hVar = (C1948h) obj;
        return this.f1634a.equals(hVar.f1634a) && this.f1635b.equals(hVar.f1635b) && C1950j.m2567c(this.f1636c, hVar.f1636c);
    }

    public int hashCode() {
        int hashCode = ((this.f1634a.hashCode() * 31) + this.f1635b.hashCode()) * 31;
        Class<?> cls = this.f1636c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f1634a + ", second=" + this.f1635b + '}';
    }

    public C1948h(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        mo16447a(cls, cls2, cls3);
    }
}
