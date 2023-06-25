package p040c.p200q.p353b.p356c;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p040c.p200q.p353b.p356c.C6230n;

/* renamed from: c.q.b.c.k */
/* compiled from: LongAdder */
public final class C6226k extends C6230n implements Serializable, C6221i {
    public static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f11847m = 0;
        this.f11845e = null;
        this.f11846l = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(mo30204a());
    }

    /* renamed from: a */
    public long mo30204a() {
        long j = this.f11846l;
        C6230n.C6232b[] bVarArr = this.f11845e;
        if (bVarArr != null) {
            for (C6230n.C6232b bVar : bVarArr) {
                if (bVar != null) {
                    j += bVar.f11850a;
                }
            }
        }
        return j;
    }

    public void add(long j) {
        int length;
        C6230n.C6232b bVar;
        C6230n.C6232b[] bVarArr = this.f11845e;
        if (bVarArr == null) {
            long j2 = this.f11846l;
            if (mo30219c(j2, j2 + j)) {
                return;
            }
        }
        int[] iArr = C6230n.f11839n.get();
        boolean z = true;
        if (!(iArr == null || bVarArr == null || (length = bVarArr.length) < 1 || (bVar = bVarArr[(length - 1) & iArr[0]]) == null)) {
            long j3 = bVar.f11850a;
            z = bVar.mo30224a(j3, j3 + j);
            if (z) {
                return;
            }
        }
        mo30221g(j, iArr, z);
    }

    public double doubleValue() {
        return (double) mo30204a();
    }

    /* renamed from: e */
    public final long mo30210e(long j, long j2) {
        return j + j2;
    }

    public float floatValue() {
        return (float) mo30204a();
    }

    public void increment() {
        add(1);
    }

    public int intValue() {
        return (int) mo30204a();
    }

    public long longValue() {
        return mo30204a();
    }

    public String toString() {
        return Long.toString(mo30204a());
    }
}
