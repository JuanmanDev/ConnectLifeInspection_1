package p040c.p200q.p201a.p264c.p294g.p335i;

import androidx.test.internal.runner.RunnerArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: c.q.a.c.g.i.f */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C5054f implements Iterable, C5225q, C5165m {

    /* renamed from: e */
    public final SortedMap f9883e;

    /* renamed from: l */
    public final Map f9884l;

    public C5054f() {
        this.f9883e = new TreeMap();
        this.f9884l = new TreeMap();
    }

    /* renamed from: A */
    public final void mo27200A() {
        this.f9883e.clear();
    }

    /* renamed from: B */
    public final void mo27201B(int i, C5225q qVar) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= mo27219u()) {
            mo27203E(i, qVar);
        } else {
            for (int intValue = ((Integer) this.f9883e.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f9883e;
                Integer valueOf = Integer.valueOf(intValue);
                C5225q qVar2 = (C5225q) sortedMap.get(valueOf);
                if (qVar2 != null) {
                    mo27203E(intValue + 1, qVar2);
                    this.f9883e.remove(valueOf);
                }
            }
            mo27203E(i, qVar);
        }
    }

    /* renamed from: D */
    public final void mo27202D(int i) {
        int intValue = ((Integer) this.f9883e.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f9883e.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f9883e;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f9883e.put(valueOf, C5225q.f10068c);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f9883e.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f9883e;
                    Integer valueOf2 = Integer.valueOf(i);
                    C5225q qVar = (C5225q) sortedMap2.get(valueOf2);
                    if (qVar != null) {
                        this.f9883e.put(Integer.valueOf(i - 1), qVar);
                        this.f9883e.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* renamed from: E */
    public final void mo27203E(int i, C5225q qVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (qVar == null) {
            this.f9883e.remove(Integer.valueOf(i));
        } else {
            this.f9883e.put(Integer.valueOf(i), qVar);
        }
    }

    /* renamed from: F */
    public final boolean mo27204F(int i) {
        if (i >= 0 && i <= ((Integer) this.f9883e.lastKey()).intValue()) {
            return this.f9883e.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* renamed from: c */
    public final C5225q mo27205c() {
        C5054f fVar = new C5054f();
        for (Map.Entry entry : this.f9883e.entrySet()) {
            if (entry.getValue() instanceof C5165m) {
                fVar.f9883e.put((Integer) entry.getKey(), (C5225q) entry.getValue());
            } else {
                fVar.f9883e.put((Integer) entry.getKey(), ((C5225q) entry.getValue()).mo27205c());
            }
        }
        return fVar;
    }

    /* renamed from: e */
    public final Double mo27206e() {
        if (this.f9883e.size() == 1) {
            return mo27220v(0).mo27206e();
        }
        if (this.f9883e.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5054f)) {
            return false;
        }
        C5054f fVar = (C5054f) obj;
        if (mo27219u() != fVar.mo27219u()) {
            return false;
        }
        if (this.f9883e.isEmpty()) {
            return fVar.f9883e.isEmpty();
        }
        for (int intValue = ((Integer) this.f9883e.firstKey()).intValue(); intValue <= ((Integer) this.f9883e.lastKey()).intValue(); intValue++) {
            if (!mo27220v(intValue).equals(fVar.mo27220v(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo27208f() {
        return mo27221x(RunnerArgs.CLASS_SEPARATOR);
    }

    /* renamed from: g */
    public final boolean mo27209g(String str) {
        return "length".equals(str) || this.f9884l.containsKey(str);
    }

    public final int hashCode() {
        return this.f9883e.hashCode() * 31;
    }

    public final Iterator iterator() {
        return new C5038e(this);
    }

    /* renamed from: k */
    public final Boolean mo27212k() {
        return Boolean.TRUE;
    }

    /* renamed from: l */
    public final Iterator mo27213l() {
        return new C5022d(this, this.f9883e.keySet().iterator(), this.f9884l.keySet().iterator());
    }

    /* renamed from: o */
    public final void mo27214o(String str, C5225q qVar) {
        if (qVar == null) {
            this.f9884l.remove(str);
        } else {
            this.f9884l.put(str, qVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r2.f9884l.get(r3);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p294g.p335i.C5225q mo27215p(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            c.q.a.c.g.i.i r3 = new c.q.a.c.g.i.i
            int r0 = r2.mo27219u()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo27209g(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f9884l
            java.lang.Object r3 = r0.get(r3)
            c.q.a.c.g.i.q r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            c.q.a.c.g.i.q r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5054f.mo27215p(java.lang.String):c.q.a.c.g.i.q");
    }

    /* renamed from: s */
    public final C5225q mo27216s(String str, C5215p4 p4Var, List list) {
        if ("concat".equals(str) || "every".equals(str) || RunnerArgs.ARGUMENT_FILTER.equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return C5023d0.m13959a(str, this, p4Var, list);
        }
        return C5134k.m14393a(this, new C5285u(str), p4Var, list);
    }

    /* renamed from: t */
    public final int mo27217t() {
        return this.f9883e.size();
    }

    public final String toString() {
        return mo27221x(RunnerArgs.CLASS_SEPARATOR);
    }

    /* renamed from: u */
    public final int mo27219u() {
        if (this.f9883e.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f9883e.lastKey()).intValue() + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r1.f9883e.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040c.p200q.p201a.p264c.p294g.p335i.C5225q mo27220v(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo27219u()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo27204F(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f9883e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            c.q.a.c.g.i.q r2 = (p040c.p200q.p201a.p264c.p294g.p335i.C5225q) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            c.q.a.c.g.i.q r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5225q.f10068c
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5054f.mo27220v(int):c.q.a.c.g.i.q");
    }

    /* renamed from: x */
    public final String mo27221x(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f9883e.isEmpty()) {
            for (int i = 0; i < mo27219u(); i++) {
                C5225q v = mo27220v(i);
                sb.append(str);
                if (!(v instanceof C5300v) && !(v instanceof C5195o)) {
                    sb.append(v.mo27208f());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: y */
    public final Iterator mo27222y() {
        return this.f9883e.keySet().iterator();
    }

    /* renamed from: z */
    public final List mo27223z() {
        ArrayList arrayList = new ArrayList(mo27219u());
        for (int i = 0; i < mo27219u(); i++) {
            arrayList.add(mo27220v(i));
        }
        return arrayList;
    }

    public C5054f(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo27203E(i, (C5225q) list.get(i));
            }
        }
    }
}
