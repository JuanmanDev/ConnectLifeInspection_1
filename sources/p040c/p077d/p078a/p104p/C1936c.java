package p040c.p077d.p078a.p104p;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import p040c.p077d.p078a.p081k.C1567c;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.p.c */
/* compiled from: ObjectKey */
public final class C1936c implements C1567c {

    /* renamed from: b */
    public final Object f1615b;

    public C1936c(@NonNull Object obj) {
        C1949i.m2563d(obj);
        this.f1615b = obj;
    }

    /* renamed from: a */
    public void mo15606a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.f1615b.toString().getBytes(C1567c.f914a));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1936c) {
            return this.f1615b.equals(((C1936c) obj).f1615b);
        }
        return false;
    }

    public int hashCode() {
        return this.f1615b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f1615b + '}';
    }
}
