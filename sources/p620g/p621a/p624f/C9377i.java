package p620g.p621a.p624f;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p620g.p621a.C9334a;
import p620g.p621a.C9336c;

/* renamed from: g.a.f.i */
/* compiled from: StreamOpFlag */
public enum C9377i {
    DISTINCT(0, r1),
    SORTED(1, r1),
    ORDERED(2, r1),
    SIZED(3, r1),
    SHORT_CIRCUIT(12, r1);
    

    /* renamed from: u */
    public static final int f18386u = 0;

    /* renamed from: v */
    public static final int f18387v = 0;

    /* renamed from: w */
    public static final int f18388w = 0;

    /* renamed from: x */
    public static final int f18389x = 0;

    /* renamed from: y */
    public static final int f18390y = 0;

    /* renamed from: e */
    public final Map<C9379b, Integer> f18392e;

    /* renamed from: l */
    public final int f18393l;

    /* renamed from: m */
    public final int f18394m;

    /* renamed from: n */
    public final int f18395n;

    /* renamed from: o */
    public final int f18396o;

    /* renamed from: g.a.f.i$a */
    /* compiled from: StreamOpFlag */
    public static class C9378a {

        /* renamed from: a */
        public final Map<C9379b, Integer> f18397a;

        public C9378a(Map<C9379b, Integer> map) {
            this.f18397a = map;
        }

        /* renamed from: a */
        public Map<C9379b, Integer> mo47280a() {
            Map<C9379b, Integer> map = this.f18397a;
            int i = 0;
            if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                C9379b[] values = C9379b.values();
                int length = values.length;
                while (i < length) {
                    concurrentMap.putIfAbsent(values[i], 0);
                    i++;
                }
                return concurrentMap;
            }
            C9379b[] values2 = C9379b.values();
            int length2 = values2.length;
            while (i < length2) {
                C9334a.m25183a(this.f18397a, values2[i], 0);
                i++;
            }
            return this.f18397a;
        }

        /* renamed from: b */
        public C9378a mo47281b(C9379b bVar) {
            mo47282c(bVar, 2);
            return this;
        }

        /* renamed from: c */
        public C9378a mo47282c(C9379b bVar, Integer num) {
            this.f18397a.put(bVar, num);
            return this;
        }

        /* renamed from: d */
        public C9378a mo47283d(C9379b bVar) {
            mo47282c(bVar, 1);
            return this;
        }

        /* renamed from: e */
        public C9378a mo47284e(C9379b bVar) {
            mo47282c(bVar, 3);
            return this;
        }
    }

    /* renamed from: g.a.f.i$b */
    /* compiled from: StreamOpFlag */
    public enum C9379b {
        SPLITERATOR,
        STREAM,
        OP,
        TERMINAL_OP,
        UPSTREAM_TERMINAL_OP
    }

    /* access modifiers changed from: public */
    static {
        f18386u = m25298d(C9379b.SPLITERATOR);
        f18387v = m25298d(C9379b.STREAM);
        m25298d(C9379b.OP);
        m25298d(C9379b.TERMINAL_OP);
        m25298d(C9379b.UPSTREAM_TERMINAL_OP);
        m25297c();
        int i = f18387v;
        f18388w = i;
        int i2 = i << 1;
        f18389x = i2;
        f18390y = i | i2;
        C9377i iVar = DISTINCT;
        int i3 = iVar.f18394m;
        int i4 = iVar.f18395n;
        C9377i iVar2 = SORTED;
        int i5 = iVar2.f18394m;
        int i6 = iVar2.f18395n;
        C9377i iVar3 = ORDERED;
        int i7 = iVar3.f18394m;
        int i8 = iVar3.f18395n;
        C9377i iVar4 = SIZED;
        int i9 = iVar4.f18394m;
        int i10 = iVar4.f18395n;
        int i11 = SHORT_CIRCUIT.f18394m;
    }

    /* access modifiers changed from: public */
    C9377i(int i, C9378a aVar) {
        this.f18392e = aVar.mo47280a();
        int i2 = i * 2;
        this.f18393l = i2;
        this.f18394m = 1 << i2;
        this.f18395n = 2 << i2;
        this.f18396o = 3 << i2;
    }

    /* renamed from: c */
    public static int m25297c() {
        int i = 0;
        for (C9377i iVar : values()) {
            i |= iVar.f18396o;
        }
        return i;
    }

    /* renamed from: d */
    public static int m25298d(C9379b bVar) {
        int i = 0;
        for (C9377i iVar : values()) {
            i |= iVar.f18392e.get(bVar).intValue() << iVar.f18393l;
        }
        return i;
    }

    /* renamed from: e */
    public static int m25299e(C9336c<?> cVar) {
        int b = cVar.mo47179b();
        if ((b & 4) == 0) {
            return f18386u & b;
        }
        cVar.mo47178a();
        throw null;
    }

    /* renamed from: g */
    public static C9378a m25300g(C9379b bVar) {
        C9378a aVar = new C9378a(new EnumMap(C9379b.class));
        aVar.mo47283d(bVar);
        return aVar;
    }
}
