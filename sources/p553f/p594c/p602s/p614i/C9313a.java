package p553f.p594c.p602s.p614i;

import p630io.reactivex.internal.util.NotificationLite;
import p648m.p683f.C9802b;

/* renamed from: f.c.s.i.a */
/* compiled from: AppendOnlyLinkedArrayList */
public class C9313a<T> {

    /* renamed from: a */
    public final int f18262a;

    /* renamed from: b */
    public final Object[] f18263b;

    /* renamed from: c */
    public Object[] f18264c;

    /* renamed from: d */
    public int f18265d;

    public C9313a(int i) {
        this.f18262a = i;
        Object[] objArr = new Object[(i + 1)];
        this.f18263b = objArr;
        this.f18264c = objArr;
    }

    /* renamed from: a */
    public <U> boolean mo47160a(C9802b<? super U> bVar) {
        Object[] objArr = this.f18263b;
        int i = this.f18262a;
        while (true) {
            int i2 = 0;
            if (objArr == null) {
                return false;
            }
            while (i2 < i) {
                Object[] objArr2 = objArr[i2];
                if (objArr2 == null) {
                    continue;
                    break;
                } else if (NotificationLite.acceptFull((Object) objArr2, bVar)) {
                    return true;
                } else {
                    i2++;
                }
            }
            objArr = objArr[i];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo47161b(T r4) {
        /*
            r3 = this;
            int r0 = r3.f18262a
            int r1 = r3.f18265d
            if (r1 != r0) goto L_0x0011
            int r1 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object[] r2 = r3.f18264c
            r2[r0] = r1
            r3.f18264c = r1
            r1 = 0
        L_0x0011:
            java.lang.Object[] r0 = r3.f18264c
            r0[r1] = r4
            int r1 = r1 + 1
            r3.f18265d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p594c.p602s.p614i.C9313a.mo47161b(java.lang.Object):void");
    }

    /* renamed from: c */
    public void mo47162c(T t) {
        this.f18263b[0] = t;
    }
}
