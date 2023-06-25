package p040c.p126i.p127a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sqlcipher.SQLException;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p126i.p127a.p128e.C2023a;
import p040c.p126i.p127a.p129f.C2026c;
import p040c.p126i.p127a.p129f.C2028d;
import p040c.p126i.p127a.p129f.C2029e;
import p040c.p126i.p127a.p129f.C2031f;
import p040c.p126i.p127a.p129f.C2033h;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: c.i.a.c */
/* compiled from: SqfliteSqlCipherPlugin */
public class C2009c implements C8944a, C9017j.C9021c {

    /* renamed from: m */
    public static final Map<String, Integer> f1694m = new HashMap();

    /* renamed from: n */
    public static boolean f1695n = false;

    /* renamed from: o */
    public static int f1696o = 10;

    /* renamed from: p */
    public static int f1697p = 0;

    /* renamed from: q */
    public static final Object f1698q = new Object();

    /* renamed from: r */
    public static final Object f1699r = new Object();

    /* renamed from: s */
    public static String f1700s;

    /* renamed from: t */
    public static int f1701t = 0;

    /* renamed from: u */
    public static HandlerThread f1702u;

    /* renamed from: v */
    public static Handler f1703v;
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: w */
    public static final Map<Integer, C2005a> f1704w = new HashMap();

    /* renamed from: e */
    public Context f1705e;

    /* renamed from: l */
    public C9017j f1706l;

    /* renamed from: c.i.a.c$a */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2010a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f1707e;

        /* renamed from: l */
        public final /* synthetic */ C2018i f1708l;

        /* renamed from: m */
        public final /* synthetic */ C2005a f1709m;

        public C2010a(C9016i iVar, C2018i iVar2, C2005a aVar) {
            this.f1707e = iVar;
            this.f1708l = iVar2;
            this.f1709m = aVar;
        }

        public void run() {
            boolean unused = C2009c.this.mo16590M(this.f1709m, new C2029e(this.f1707e, this.f1708l));
        }
    }

    /* renamed from: c.i.a.c$b */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2011b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f1711e;

        /* renamed from: l */
        public final /* synthetic */ C2018i f1712l;

        /* renamed from: m */
        public final /* synthetic */ C2005a f1713m;

        public C2011b(C9016i iVar, C2018i iVar2, C2005a aVar) {
            this.f1711e = iVar;
            this.f1712l = iVar2;
            this.f1713m = aVar;
        }

        public void run() {
            C2029e eVar = new C2029e(this.f1711e, this.f1712l);
            boolean c = eVar.mo16631c();
            boolean f = eVar.mo16634f();
            ArrayList arrayList = new ArrayList();
            for (Map cVar : (List) this.f1711e.mo46571a("operations")) {
                C2026c cVar2 = new C2026c(cVar, c);
                String j = cVar2.mo16638j();
                char c2 = 65535;
                switch (j.hashCode()) {
                    case -1319569547:
                        if (j.equals("execute")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1183792455:
                        if (j.equals("insert")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -838846263:
                        if (j.equals("update")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 107944136:
                        if (j.equals("query")) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                this.f1712l.error("bad_param", "Batch method '" + j + "' not supported", (Object) null);
                                return;
                            } else if (C2009c.this.mo16591O(this.f1713m, cVar2)) {
                                cVar2.mo16643o(arrayList);
                            } else if (f) {
                                cVar2.mo16642n(arrayList);
                            } else {
                                cVar2.mo16641m(this.f1712l);
                                return;
                            }
                        } else if (C2009c.this.mo16590M(this.f1713m, cVar2)) {
                            cVar2.mo16643o(arrayList);
                        } else if (f) {
                            cVar2.mo16642n(arrayList);
                        } else {
                            cVar2.mo16641m(this.f1712l);
                            return;
                        }
                    } else if (C2009c.this.mo16600w(this.f1713m, cVar2)) {
                        cVar2.mo16643o(arrayList);
                    } else if (f) {
                        cVar2.mo16642n(arrayList);
                    } else {
                        cVar2.mo16641m(this.f1712l);
                        return;
                    }
                } else if (C2009c.this.mo16593o(this.f1713m, cVar2)) {
                    cVar2.mo16643o(arrayList);
                } else if (f) {
                    cVar2.mo16642n(arrayList);
                } else {
                    cVar2.mo16641m(this.f1712l);
                    return;
                }
            }
            if (c) {
                this.f1712l.success((Object) null);
            } else {
                this.f1712l.success(arrayList);
            }
        }
    }

    /* renamed from: c.i.a.c$c */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2012c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f1715e;

        /* renamed from: l */
        public final /* synthetic */ C2018i f1716l;

        /* renamed from: m */
        public final /* synthetic */ C2005a f1717m;

        public C2012c(C9016i iVar, C2018i iVar2, C2005a aVar) {
            this.f1715e = iVar;
            this.f1716l = iVar2;
            this.f1717m = aVar;
        }

        public void run() {
            boolean unused = C2009c.this.mo16600w(this.f1717m, new C2029e(this.f1715e, this.f1716l));
        }
    }

    /* renamed from: c.i.a.c$d */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2013d implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C2005a f1719e;

        /* renamed from: l */
        public final /* synthetic */ C9016i f1720l;

        /* renamed from: m */
        public final /* synthetic */ C2018i f1721m;

        public C2013d(C2005a aVar, C9016i iVar, C2018i iVar2) {
            this.f1719e = aVar;
            this.f1720l = iVar;
            this.f1721m = iVar2;
        }

        public void run() {
            if (C2009c.this.mo16594p(this.f1719e, this.f1720l, this.f1721m) != null) {
                this.f1721m.success((Object) null);
            }
        }
    }

    /* renamed from: c.i.a.c$e */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2014e implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f1723e;

        /* renamed from: l */
        public final /* synthetic */ C2018i f1724l;

        /* renamed from: m */
        public final /* synthetic */ C2005a f1725m;

        public C2014e(C9016i iVar, C2018i iVar2, C2005a aVar) {
            this.f1723e = iVar;
            this.f1724l = iVar2;
            this.f1725m = aVar;
        }

        public void run() {
            boolean unused = C2009c.this.mo16591O(this.f1725m, new C2029e(this.f1723e, this.f1724l));
        }
    }

    /* renamed from: c.i.a.c$f */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2015f implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ boolean f1727e;

        /* renamed from: l */
        public final /* synthetic */ String f1728l;

        /* renamed from: m */
        public final /* synthetic */ C2018i f1729m;

        /* renamed from: n */
        public final /* synthetic */ Boolean f1730n;

        /* renamed from: o */
        public final /* synthetic */ C2005a f1731o;

        /* renamed from: p */
        public final /* synthetic */ C9016i f1732p;

        /* renamed from: q */
        public final /* synthetic */ boolean f1733q;

        /* renamed from: r */
        public final /* synthetic */ int f1734r;

        public C2015f(boolean z, String str, C2018i iVar, Boolean bool, C2005a aVar, C9016i iVar2, boolean z2, int i) {
            this.f1727e = z;
            this.f1728l = str;
            this.f1729m = iVar;
            this.f1730n = bool;
            this.f1731o = aVar;
            this.f1732p = iVar2;
            this.f1733q = z2;
            this.f1734r = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
            r5.f1729m.success(p040c.p126i.p127a.C2009c.m2704y(r5.f1734r, false, false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
            p040c.p126i.p127a.C2009c.m2696h(r5.f1735s, r1, new p040c.p126i.p127a.p129f.C2029e(r5.f1732p, r5.f1729m), r5.f1731o);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.lang.Object r0 = p040c.p126i.p127a.C2009c.f1699r
                monitor-enter(r0)
                boolean r1 = r5.f1727e     // Catch:{ all -> 0x00d4 }
                if (r1 != 0) goto L_0x0048
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r5.f1728l     // Catch:{ all -> 0x00d4 }
                r1.<init>(r2)     // Catch:{ all -> 0x00d4 }
                java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00d4 }
                java.lang.String r1 = r1.getParent()     // Catch:{ all -> 0x00d4 }
                r2.<init>(r1)     // Catch:{ all -> 0x00d4 }
                boolean r1 = r2.exists()     // Catch:{ all -> 0x00d4 }
                if (r1 != 0) goto L_0x0048
                boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x00d4 }
                if (r1 != 0) goto L_0x0048
                boolean r1 = r2.exists()     // Catch:{ all -> 0x00d4 }
                if (r1 != 0) goto L_0x0048
                c.i.a.c$i r1 = r5.f1729m     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = "sqlite_error"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
                r3.<init>()     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = "open_failed "
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = r5.f1728l     // Catch:{ all -> 0x00d4 }
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d4 }
                r4 = 0
                r1.error(r2, r3, r4)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                return
            L_0x0048:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00c1 }
                java.lang.Boolean r2 = r5.f1730n     // Catch:{ Exception -> 0x00c1 }
                boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00c1 }
                if (r1 == 0) goto L_0x0058
                c.i.a.a r1 = r5.f1731o     // Catch:{ Exception -> 0x00c1 }
                r1.mo16572h()     // Catch:{ Exception -> 0x00c1 }
                goto L_0x005d
            L_0x0058:
                c.i.a.a r1 = r5.f1731o     // Catch:{ Exception -> 0x00c1 }
                r1.mo16571g()     // Catch:{ Exception -> 0x00c1 }
            L_0x005d:
                java.lang.Object r1 = p040c.p126i.p127a.C2009c.f1698q     // Catch:{ all -> 0x00d4 }
                monitor-enter(r1)     // Catch:{ all -> 0x00d4 }
                boolean r2 = r5.f1733q     // Catch:{ all -> 0x00be }
                if (r2 == 0) goto L_0x0073
                java.util.Map<java.lang.String, java.lang.Integer> r2 = p040c.p126i.p127a.C2009c.f1694m     // Catch:{ all -> 0x00be }
                java.lang.String r3 = r5.f1728l     // Catch:{ all -> 0x00be }
                int r4 = r5.f1734r     // Catch:{ all -> 0x00be }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00be }
                r2.put(r3, r4)     // Catch:{ all -> 0x00be }
            L_0x0073:
                java.util.Map<java.lang.Integer, c.i.a.a> r2 = p040c.p126i.p127a.C2009c.f1704w     // Catch:{ all -> 0x00be }
                int r3 = r5.f1734r     // Catch:{ all -> 0x00be }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00be }
                c.i.a.a r4 = r5.f1731o     // Catch:{ all -> 0x00be }
                r2.put(r3, r4)     // Catch:{ all -> 0x00be }
                monitor-exit(r1)     // Catch:{ all -> 0x00be }
                c.i.a.a r1 = r5.f1731o     // Catch:{ all -> 0x00d4 }
                int r1 = r1.f1691e     // Catch:{ all -> 0x00d4 }
                boolean r1 = p040c.p126i.p127a.C2008b.m2686b(r1)     // Catch:{ all -> 0x00d4 }
                if (r1 == 0) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
                r1.<init>()     // Catch:{ all -> 0x00d4 }
                c.i.a.a r2 = r5.f1731o     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r2.mo16568d()     // Catch:{ all -> 0x00d4 }
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = "opened "
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                int r2 = r5.f1734r     // Catch:{ all -> 0x00d4 }
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = " "
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r5.f1728l     // Catch:{ all -> 0x00d4 }
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                r1.toString()     // Catch:{ all -> 0x00d4 }
            L_0x00b0:
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                c.i.a.c$i r0 = r5.f1729m
                int r1 = r5.f1734r
                r2 = 0
                java.util.Map r1 = p040c.p126i.p127a.C2009c.m2704y(r1, r2, r2)
                r0.success(r1)
                return
            L_0x00be:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00be }
                throw r2     // Catch:{ all -> 0x00d4 }
            L_0x00c1:
                r1 = move-exception
                c.i.a.f.e r2 = new c.i.a.f.e     // Catch:{ all -> 0x00d4 }
                f.a.e.a.i r3 = r5.f1732p     // Catch:{ all -> 0x00d4 }
                c.i.a.c$i r4 = r5.f1729m     // Catch:{ all -> 0x00d4 }
                r2.<init>(r3, r4)     // Catch:{ all -> 0x00d4 }
                c.i.a.c r3 = p040c.p126i.p127a.C2009c.this     // Catch:{ all -> 0x00d4 }
                c.i.a.a r4 = r5.f1731o     // Catch:{ all -> 0x00d4 }
                r3.mo16599v(r1, r2, r4)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                return
            L_0x00d4:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p126i.p127a.C2009c.C2015f.run():void");
        }
    }

    /* renamed from: c.i.a.c$g */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2016g implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C2005a f1736e;

        /* renamed from: l */
        public final /* synthetic */ C2018i f1737l;

        public C2016g(C2005a aVar, C2018i iVar) {
            this.f1736e = aVar;
            this.f1737l = iVar;
        }

        public void run() {
            synchronized (C2009c.f1699r) {
                C2009c.this.mo16592k(this.f1736e);
            }
            this.f1737l.success((Object) null);
        }
    }

    /* renamed from: c.i.a.c$h */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2017h implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C2005a f1739e;

        /* renamed from: l */
        public final /* synthetic */ String f1740l;

        /* renamed from: m */
        public final /* synthetic */ C2018i f1741m;

        public C2017h(C2005a aVar, String str, C2018i iVar) {
            this.f1739e = aVar;
            this.f1740l = str;
            this.f1741m = iVar;
        }

        public void run() {
            synchronized (C2009c.f1699r) {
                if (this.f1739e != null) {
                    C2009c.this.mo16592k(this.f1739e);
                }
                try {
                    if (C2008b.m2687c(C2009c.f1697p)) {
                        "delete database " + this.f1740l;
                    }
                    C2005a.m2675b(this.f1740l);
                } catch (Exception e) {
                    "error " + e + " while closing database " + C2009c.f1701t;
                }
            }
            this.f1741m.success((Object) null);
        }
    }

    /* renamed from: c.i.a.c$i */
    /* compiled from: SqfliteSqlCipherPlugin */
    public class C2018i implements C9017j.C9022d {

        /* renamed from: a */
        public final Handler f1743a;

        /* renamed from: b */
        public final C9017j.C9022d f1744b;

        /* renamed from: c.i.a.c$i$a */
        /* compiled from: SqfliteSqlCipherPlugin */
        public class C2019a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ Object f1745e;

            public C2019a(Object obj) {
                this.f1745e = obj;
            }

            public void run() {
                C2018i.this.f1744b.success(this.f1745e);
            }
        }

        /* renamed from: c.i.a.c$i$b */
        /* compiled from: SqfliteSqlCipherPlugin */
        public class C2020b implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f1747e;

            /* renamed from: l */
            public final /* synthetic */ String f1748l;

            /* renamed from: m */
            public final /* synthetic */ Object f1749m;

            public C2020b(String str, String str2, Object obj) {
                this.f1747e = str;
                this.f1748l = str2;
                this.f1749m = obj;
            }

            public void run() {
                C2018i.this.f1744b.error(this.f1747e, this.f1748l, this.f1749m);
            }
        }

        /* renamed from: c.i.a.c$i$c */
        /* compiled from: SqfliteSqlCipherPlugin */
        public class C2021c implements Runnable {
            public C2021c() {
            }

            public void run() {
                C2018i.this.f1744b.notImplemented();
            }
        }

        public /* synthetic */ C2018i(C2009c cVar, C9017j.C9022d dVar, C2010a aVar) {
            this(cVar, dVar);
        }

        public void error(String str, String str2, Object obj) {
            this.f1743a.post(new C2020b(str, str2, obj));
        }

        public void notImplemented() {
            this.f1743a.post(new C2021c());
        }

        public void success(Object obj) {
            this.f1743a.post(new C2019a(obj));
        }

        public C2018i(C2009c cVar, C9017j.C9022d dVar) {
            this.f1743a = new Handler(Looper.getMainLooper());
            this.f1744b = dVar;
        }
    }

    /* renamed from: N */
    public static String m2688N(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            ArrayList arrayList = new ArrayList();
            for (byte valueOf : (byte[]) obj) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            return arrayList.toString();
        } else if (obj instanceof Map) {
            return m2702r((Map) obj).toString();
        } else {
            return obj.toString();
        }
    }

    /* renamed from: l */
    public static List<Object> m2699l(Cursor cursor, int i) {
        String str;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object n = m2701n(cursor, i2);
            if (C2023a.f1756c) {
                String str2 = null;
                if (n != null) {
                    if (n.getClass().isArray()) {
                        str2 = "array(" + n.getClass().getComponentType().getName() + ")";
                    } else {
                        str2 = n.getClass().getName();
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("column ");
                sb.append(i2);
                sb.append(" ");
                sb.append(cursor.getType(i2));
                sb.append(": ");
                sb.append(n);
                if (str2 == null) {
                    str = "";
                } else {
                    str = " (" + str2 + ")";
                }
                sb.append(str);
                sb.toString();
            }
            arrayList.add(n);
        }
        return arrayList;
    }

    /* renamed from: m */
    public static Map<String, Object> m2700m(Cursor cursor) {
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (C2023a.f1756c) {
                "column " + i + " " + cursor.getType(i);
            }
            int type = cursor.getType(i);
            if (type == 0) {
                hashMap.put(columnNames[i], (Object) null);
            } else if (type == 1) {
                hashMap.put(columnNames[i], Long.valueOf(cursor.getLong(i)));
            } else if (type == 2) {
                hashMap.put(columnNames[i], Double.valueOf(cursor.getDouble(i)));
            } else if (type == 3) {
                hashMap.put(columnNames[i], cursor.getString(i));
            } else if (type == 4) {
                hashMap.put(columnNames[i], cursor.getBlob(i));
            }
        }
        return hashMap;
    }

    /* renamed from: n */
    public static Object m2701n(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            return null;
        }
        return cursor.getBlob(i);
    }

    /* renamed from: r */
    public static Map<String, Object> m2702r(Map<Object, Object> map) {
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value instanceof Map) {
                obj = m2702r((Map) value);
            } else {
                obj = m2688N(value);
            }
            hashMap.put(m2688N(next.getKey()), obj);
        }
        return hashMap;
    }

    /* renamed from: x */
    public static boolean m2703x(String str) {
        return str == null || str.equals(SQLiteDatabase.MEMORY);
    }

    /* renamed from: y */
    public static Map m2704y(int i, boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i));
        if (z) {
            hashMap.put("recovered", Boolean.TRUE);
        }
        if (z2) {
            hashMap.put("recoveredInTransaction", Boolean.TRUE);
        }
        return hashMap;
    }

    /* renamed from: A */
    public final void mo16578A(C9016i iVar, C9017j.C9022d dVar) {
        C2005a t = mo16597t(iVar, dVar);
        if (t != null) {
            f1703v.post(new C2011b(iVar, new C2018i(this, dVar, (C2010a) null), t));
        }
    }

    /* renamed from: B */
    public final void mo16579B(C9016i iVar, C9017j.C9022d dVar) {
        int intValue = ((Integer) iVar.mo46571a("id")).intValue();
        C2005a t = mo16597t(iVar, dVar);
        if (t != null) {
            if (C2008b.m2686b(t.f1691e)) {
                t.mo16568d() + "closing " + intValue + " " + t.f1688b;
            }
            String str = t.f1688b;
            synchronized (f1698q) {
                f1704w.remove(Integer.valueOf(intValue));
                if (t.f1687a) {
                    f1694m.remove(str);
                }
            }
            f1703v.post(new C2016g(t, new C2018i(this, dVar, (C2010a) null)));
        }
    }

    /* renamed from: C */
    public final void mo16580C(C9016i iVar, C9017j.C9022d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) iVar.mo46571a("cmd"))) {
            int i = f1697p;
            if (i > 0) {
                hashMap.put("logLevel", Integer.valueOf(i));
            }
            if (!f1704w.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : f1704w.entrySet()) {
                    C2005a aVar = (C2005a) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", aVar.f1688b);
                    hashMap3.put("singleInstance", Boolean.valueOf(aVar.f1687a));
                    int i2 = aVar.f1691e;
                    if (i2 > 0) {
                        hashMap3.put("logLevel", Integer.valueOf(i2));
                    }
                    hashMap2.put(((Integer) next.getKey()).toString(), hashMap3);
                }
                hashMap.put("databases", hashMap2);
            }
        }
        dVar.success(hashMap);
    }

    /* renamed from: D */
    public final void mo16581D(C9016i iVar, C9017j.C9022d dVar) {
        C2023a.f1754a = Boolean.TRUE.equals(iVar.mo46572b());
        C2023a.f1756c = C2023a.f1755b && C2023a.f1754a;
        if (!C2023a.f1754a) {
            f1697p = 0;
        } else if (C2023a.f1756c) {
            f1697p = 2;
        } else if (C2023a.f1754a) {
            f1697p = 1;
        }
        dVar.success((Object) null);
    }

    /* renamed from: E */
    public final void mo16582E(C9016i iVar, C9017j.C9022d dVar) {
        C2005a aVar;
        String str = (String) iVar.mo46571a("path");
        synchronized (f1698q) {
            if (C2008b.m2687c(f1697p)) {
                "Look for " + str + " in " + f1694m.keySet();
            }
            Integer num = f1694m.get(str);
            if (num == null || (aVar = f1704w.get(num)) == null || !aVar.f1692f.isOpen()) {
                aVar = null;
            } else {
                if (C2008b.m2687c(f1697p)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.mo16568d());
                    sb.append("found single instance ");
                    sb.append(aVar.f1693g ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    sb.toString();
                }
                f1704w.remove(num);
                f1694m.remove(str);
            }
        }
        C2017h hVar = new C2017h(aVar, str, new C2018i(this, dVar, (C2010a) null));
        Handler handler = f1703v;
        if (handler != null) {
            handler.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* renamed from: F */
    public final void mo16583F(C9016i iVar, C9017j.C9022d dVar) {
        C2005a t = mo16597t(iVar, dVar);
        if (t != null) {
            f1703v.post(new C2013d(t, iVar, new C2018i(this, dVar, (C2010a) null)));
        }
    }

    /* renamed from: G */
    public void mo16584G(C9016i iVar, C9017j.C9022d dVar) {
        if (f1700s == null) {
            f1700s = this.f1705e.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.success(f1700s);
    }

    /* renamed from: H */
    public final void mo16585H(C9016i iVar, C9017j.C9022d dVar) {
        C2005a t = mo16597t(iVar, dVar);
        if (t != null) {
            f1703v.post(new C2012c(iVar, new C2018i(this, dVar, (C2010a) null), t));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019d, code lost:
        r0 = th;
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16586I(p553f.p554a.p570e.p571a.C9016i r18, p553f.p554a.p570e.p571a.C9017j.C9022d r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "path"
            java.lang.Object r2 = r0.mo46571a(r2)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r2 = "readOnly"
            java.lang.Object r2 = r0.mo46571a(r2)
            r10 = r2
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            java.lang.String r2 = "password"
            java.lang.Object r2 = r0.mo46571a(r2)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            boolean r11 = m2703x(r9)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "singleInstance"
            java.lang.Object r3 = r0.mo46571a(r3)
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 != 0) goto L_0x0036
            if (r11 != 0) goto L_0x0036
            r12 = r3
            goto L_0x0038
        L_0x0036:
            r2 = 0
            r12 = r2
        L_0x0038:
            if (r12 == 0) goto L_0x00eb
            java.lang.Object r2 = f1698q
            monitor-enter(r2)
            int r4 = f1697p     // Catch:{ all -> 0x00e8 }
            boolean r4 = p040c.p126i.p127a.C2008b.m2687c(r4)     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x0063
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            r4.<init>()     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "Look for "
            r4.append(r6)     // Catch:{ all -> 0x00e8 }
            r4.append(r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = " in "
            r4.append(r6)     // Catch:{ all -> 0x00e8 }
            java.util.Map<java.lang.String, java.lang.Integer> r6 = f1694m     // Catch:{ all -> 0x00e8 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x00e8 }
            r4.append(r6)     // Catch:{ all -> 0x00e8 }
            r4.toString()     // Catch:{ all -> 0x00e8 }
        L_0x0063:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = f1694m     // Catch:{ all -> 0x00e8 }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ all -> 0x00e8 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x00e6
            java.util.Map<java.lang.Integer, c.i.a.a> r6 = f1704w     // Catch:{ all -> 0x00e8 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x00e8 }
            c.i.a.a r6 = (p040c.p126i.p127a.C2005a) r6     // Catch:{ all -> 0x00e8 }
            if (r6 == 0) goto L_0x00e6
            net.sqlcipher.database.SQLiteDatabase r7 = r6.f1692f     // Catch:{ all -> 0x00e8 }
            boolean r7 = r7.isOpen()     // Catch:{ all -> 0x00e8 }
            if (r7 != 0) goto L_0x00a4
            int r4 = f1697p     // Catch:{ all -> 0x00e8 }
            boolean r4 = p040c.p126i.p127a.C2008b.m2687c(r4)     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x00e6
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            r4.<init>()     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = r6.mo16568d()     // Catch:{ all -> 0x00e8 }
            r4.append(r6)     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = "single instance database of "
            r4.append(r6)     // Catch:{ all -> 0x00e8 }
            r4.append(r9)     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = " not opened"
            r4.append(r6)     // Catch:{ all -> 0x00e8 }
            r4.toString()     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x00a4:
            int r0 = f1697p     // Catch:{ all -> 0x00e8 }
            boolean r0 = p040c.p126i.p127a.C2008b.m2687c(r0)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00d7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            r0.<init>()     // Catch:{ all -> 0x00e8 }
            java.lang.String r5 = r6.mo16568d()     // Catch:{ all -> 0x00e8 }
            r0.append(r5)     // Catch:{ all -> 0x00e8 }
            java.lang.String r5 = "re-opened single instance "
            r0.append(r5)     // Catch:{ all -> 0x00e8 }
            boolean r5 = r6.f1693g     // Catch:{ all -> 0x00e8 }
            if (r5 == 0) goto L_0x00c4
            java.lang.String r5 = "(in transaction) "
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r5 = ""
        L_0x00c6:
            r0.append(r5)     // Catch:{ all -> 0x00e8 }
            r0.append(r4)     // Catch:{ all -> 0x00e8 }
            java.lang.String r5 = " "
            r0.append(r5)     // Catch:{ all -> 0x00e8 }
            r0.append(r9)     // Catch:{ all -> 0x00e8 }
            r0.toString()     // Catch:{ all -> 0x00e8 }
        L_0x00d7:
            int r0 = r4.intValue()     // Catch:{ all -> 0x00e8 }
            boolean r4 = r6.f1693g     // Catch:{ all -> 0x00e8 }
            java.util.Map r0 = m2704y(r0, r3, r4)     // Catch:{ all -> 0x00e8 }
            r1.success(r0)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r2)     // Catch:{ all -> 0x00e8 }
            return
        L_0x00e6:
            monitor-exit(r2)     // Catch:{ all -> 0x00e8 }
            goto L_0x00eb
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00e8 }
            throw r0
        L_0x00eb:
            java.lang.Object r2 = f1698q
            monitor-enter(r2)
            int r4 = f1701t     // Catch:{ all -> 0x0198 }
            int r13 = r4 + 1
            f1701t = r13     // Catch:{ all -> 0x0198 }
            monitor-exit(r2)     // Catch:{ all -> 0x0198 }
            c.i.a.a r14 = new c.i.a.a
            int r8 = f1697p
            r3 = r14
            r4 = r9
            r6 = r13
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            c.i.a.c$i r5 = new c.i.a.c$i
            r2 = 0
            r15 = r17
            r5.<init>(r15, r1, r2)
            java.lang.Object r16 = f1698q
            monitor-enter(r16)
            android.os.Handler r1 = f1703v     // Catch:{ all -> 0x0195 }
            if (r1 != 0) goto L_0x0155
            android.os.HandlerThread r1 = new android.os.HandlerThread     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = "Sqflite"
            int r3 = f1696o     // Catch:{ all -> 0x0195 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0195 }
            f1702u = r1     // Catch:{ all -> 0x0195 }
            r1.start()     // Catch:{ all -> 0x0195 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ all -> 0x0195 }
            android.os.HandlerThread r2 = f1702u     // Catch:{ all -> 0x0195 }
            android.os.Looper r2 = r2.getLooper()     // Catch:{ all -> 0x0195 }
            r1.<init>(r2)     // Catch:{ all -> 0x0195 }
            f1703v = r1     // Catch:{ all -> 0x0195 }
            int r1 = r14.f1691e     // Catch:{ all -> 0x0195 }
            boolean r1 = p040c.p126i.p127a.C2008b.m2686b(r1)     // Catch:{ all -> 0x0195 }
            if (r1 == 0) goto L_0x0155
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0195 }
            r1.<init>()     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = r14.mo16568d()     // Catch:{ all -> 0x0195 }
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = "starting thread"
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            android.os.HandlerThread r2 = f1702u     // Catch:{ all -> 0x0195 }
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = " priority "
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            int r2 = f1696o     // Catch:{ all -> 0x0195 }
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            r1.toString()     // Catch:{ all -> 0x0195 }
        L_0x0155:
            int r1 = r14.f1691e     // Catch:{ all -> 0x0195 }
            boolean r1 = p040c.p126i.p127a.C2008b.m2686b(r1)     // Catch:{ all -> 0x0195 }
            if (r1 == 0) goto L_0x017c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0195 }
            r1.<init>()     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = r14.mo16568d()     // Catch:{ all -> 0x0195 }
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = "opened "
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            r1.append(r13)     // Catch:{ all -> 0x0195 }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ all -> 0x0195 }
            r1.append(r9)     // Catch:{ all -> 0x0195 }
            r1.toString()     // Catch:{ all -> 0x0195 }
        L_0x017c:
            android.os.Handler r8 = f1703v     // Catch:{ all -> 0x0195 }
            c.i.a.c$f r7 = new c.i.a.c$f     // Catch:{ all -> 0x0195 }
            r1 = r7
            r2 = r17
            r3 = r11
            r4 = r9
            r6 = r10
            r11 = r7
            r7 = r14
            r14 = r8
            r8 = r18
            r9 = r12
            r10 = r13
            r1.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0195 }
            r14.post(r11)     // Catch:{ all -> 0x0195 }
            monitor-exit(r16)     // Catch:{ all -> 0x0195 }
            return
        L_0x0195:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x0195 }
            throw r0
        L_0x0198:
            r0 = move-exception
            r15 = r17
        L_0x019b:
            monitor-exit(r2)     // Catch:{ all -> 0x019d }
            throw r0
        L_0x019d:
            r0 = move-exception
            goto L_0x019b
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p126i.p127a.C2009c.mo16586I(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    /* renamed from: J */
    public void mo16587J(C9016i iVar, C9017j.C9022d dVar) {
        Object a = iVar.mo46571a("queryAsMapList");
        if (a != null) {
            f1695n = Boolean.TRUE.equals(a);
        }
        Object a2 = iVar.mo46571a("androidThreadPriority");
        if (a2 != null) {
            f1696o = ((Integer) a2).intValue();
        }
        Integer a3 = C2008b.m2685a(iVar);
        if (a3 != null) {
            f1697p = a3.intValue();
        }
        dVar.success((Object) null);
    }

    /* renamed from: K */
    public final void mo16588K(C9016i iVar, C9017j.C9022d dVar) {
        C2005a t = mo16597t(iVar, dVar);
        if (t != null) {
            f1703v.post(new C2010a(iVar, new C2018i(this, dVar, (C2010a) null), t));
        }
    }

    /* renamed from: L */
    public final void mo16589L(C9016i iVar, C9017j.C9022d dVar) {
        C2005a t = mo16597t(iVar, dVar);
        if (t != null) {
            f1703v.post(new C2014e(iVar, new C2018i(this, dVar, (C2010a) null), t));
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.Map, java.util.HashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (r4 != null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        r4 = new java.util.ArrayList();
        r5 = new java.util.HashMap();
        r6 = r0.getColumnCount();
        r5.put("columns", java.util.Arrays.asList(r0.getColumnNames()));
        r5.put("rows", r4);
        r10 = r5;
        r5 = r4;
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0090, code lost:
        r5.add(m2699l(r0, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009e, code lost:
        if (r4 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a0, code lost:
        r4 = new java.util.HashMap();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a5, code lost:
        r13.success(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x003d, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16590M(p040c.p126i.p127a.C2005a r12, p040c.p126i.p127a.p129f.C2031f r13) {
        /*
            r11 = this;
            c.i.a.d r0 = r13.mo16630b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.f1691e
            boolean r2 = p040c.p126i.p127a.C2008b.m2686b(r2)
            if (r2 == 0) goto L_0x0023
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.mo16568d()
            r2.append(r3)
            r2.append(r0)
            r2.toString()
        L_0x0023:
            boolean r2 = f1695n
            r3 = 0
            r4 = 0
            c.i.a.d r0 = r0.mo16625i()     // Catch:{ Exception -> 0x00b7 }
            net.sqlcipher.database.SQLiteDatabase r5 = r12.mo16567c()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r6 = r0.mo16619e()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String[] r0 = r0.mo16616b()     // Catch:{ Exception -> 0x00b7 }
            net.sqlcipher.Cursor r0 = r5.rawQuery((java.lang.String) r6, (java.lang.String[]) r0)     // Catch:{ Exception -> 0x00b7 }
            r6 = r3
            r5 = r4
        L_0x003d:
            boolean r7 = r0.moveToNext()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r7 == 0) goto L_0x0098
            if (r2 == 0) goto L_0x006b
            java.util.Map r7 = m2700m(r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            int r8 = r12.f1691e     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            boolean r8 = p040c.p126i.p127a.C2008b.m2686b(r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r8 == 0) goto L_0x0067
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r8.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r9 = r12.mo16568d()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r8.append(r9)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r9 = m2688N(r7)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r8.append(r9)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r8.toString()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
        L_0x0067:
            r1.add(r7)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            goto L_0x003d
        L_0x006b:
            if (r4 != 0) goto L_0x0090
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r4.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r5.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            int r6 = r0.getColumnCount()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r7 = "columns"
            java.lang.String[] r8 = r0.getColumnNames()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r5.put(r7, r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r7 = "rows"
            r5.put(r7, r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r10 = r5
            r5 = r4
            r4 = r10
        L_0x0090:
            java.util.List r7 = m2699l(r0, r6)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r5.add(r7)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            goto L_0x003d
        L_0x0098:
            if (r2 == 0) goto L_0x009e
            r13.success(r1)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            goto L_0x00a8
        L_0x009e:
            if (r4 != 0) goto L_0x00a5
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r4.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
        L_0x00a5:
            r13.success(r4)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
        L_0x00a8:
            r12 = 1
            if (r0 == 0) goto L_0x00ae
            r0.close()
        L_0x00ae:
            return r12
        L_0x00af:
            r12 = move-exception
            r4 = r0
            goto L_0x00c1
        L_0x00b2:
            r1 = move-exception
            r4 = r0
            goto L_0x00b8
        L_0x00b5:
            r12 = move-exception
            goto L_0x00c1
        L_0x00b7:
            r1 = move-exception
        L_0x00b8:
            r11.mo16599v(r1, r13, r12)     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x00c0
            r4.close()
        L_0x00c0:
            return r3
        L_0x00c1:
            if (r4 == 0) goto L_0x00c6
            r4.close()
        L_0x00c6:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p126i.p127a.C2009c.mo16590M(c.i.a.a, c.i.a.f.f):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16591O(p040c.p126i.p127a.C2005a r7, p040c.p126i.p127a.p129f.C2031f r8) {
        /*
            r6 = this;
            boolean r0 = r6.mo16595q(r7, r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r8.mo16631c()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r8.success(r3)
            return r2
        L_0x0014:
            net.sqlcipher.database.SQLiteDatabase r0 = r7.mo16570f()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = "SELECT changes()"
            net.sqlcipher.Cursor r0 = r0.rawQuery((java.lang.String) r4, (java.lang.String[]) r3)     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x0062
            int r4 = r0.getCount()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r4 <= 0) goto L_0x0062
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r4 == 0) goto L_0x0062
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            int r4 = r7.f1691e     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            boolean r4 = p040c.p126i.p127a.C2008b.m2686b(r4)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r4 == 0) goto L_0x004f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.<init>()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r5 = r7.mo16568d()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.append(r5)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r5 = "changed "
            r4.append(r5)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.append(r3)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.toString()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
        L_0x004f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r8.success(r3)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r0 == 0) goto L_0x005b
            r0.close()
        L_0x005b:
            return r2
        L_0x005c:
            r7 = move-exception
            r3 = r0
            goto L_0x008b
        L_0x005f:
            r2 = move-exception
            r3 = r0
            goto L_0x0082
        L_0x0062:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.<init>()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r5 = r7.mo16568d()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.append(r5)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r5 = "fail to read changes for Update/Delete"
            r4.append(r5)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.toString()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r8.success(r3)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r0 == 0) goto L_0x007e
            r0.close()
        L_0x007e:
            return r2
        L_0x007f:
            r7 = move-exception
            goto L_0x008b
        L_0x0081:
            r2 = move-exception
        L_0x0082:
            r6.mo16599v(r2, r8, r7)     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x008a
            r3.close()
        L_0x008a:
            return r1
        L_0x008b:
            if (r3 == 0) goto L_0x0090
            r3.close()
        L_0x0090:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p126i.p127a.C2009c.mo16591O(c.i.a.a, c.i.a.f.f):boolean");
    }

    /* renamed from: k */
    public final void mo16592k(C2005a aVar) {
        try {
            if (C2008b.m2686b(aVar.f1691e)) {
                aVar.mo16568d() + "closing database " + f1702u;
            }
            aVar.mo16566a();
        } catch (Exception e) {
            "error " + e + " while closing database " + f1701t;
        }
        synchronized (f1698q) {
            if (f1704w.isEmpty() && f1703v != null) {
                if (C2008b.m2686b(aVar.f1691e)) {
                    aVar.mo16568d() + "stopping thread" + f1702u;
                }
                f1702u.quit();
                f1702u = null;
                f1703v = null;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo16593o(C2005a aVar, C2031f fVar) {
        if (!mo16595q(aVar, fVar)) {
            return false;
        }
        fVar.success((Object) null);
        return true;
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo16601z(bVar.mo46464a(), bVar.mo46465b());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        this.f1705e = null;
        this.f1706l.mo46575e((C9017j.C9021c) null);
        this.f1706l = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(p553f.p554a.p570e.p571a.C9016i r3, p553f.p554a.p570e.p571a.C9017j.C9022d r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.f17687a
            int r1 = r0.hashCode()
            switch(r1) {
                case -1319569547: goto L_0x008b;
                case -1253581933: goto L_0x0081;
                case -1249474914: goto L_0x0076;
                case -1183792455: goto L_0x006c;
                case -838846263: goto L_0x0062;
                case -263511994: goto L_0x0057;
                case -198450538: goto L_0x004c;
                case -17190427: goto L_0x0042;
                case 93509434: goto L_0x0038;
                case 95458899: goto L_0x002d;
                case 107944136: goto L_0x0022;
                case 1385449135: goto L_0x0017;
                case 1863829223: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0095
        L_0x000b:
            java.lang.String r1 = "getDatabasesPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 9
            goto L_0x0096
        L_0x0017:
            java.lang.String r1 = "getPlatformVersion"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 0
            goto L_0x0096
        L_0x0022:
            java.lang.String r1 = "query"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 2
            goto L_0x0096
        L_0x002d:
            java.lang.String r1 = "debug"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 11
            goto L_0x0096
        L_0x0038:
            java.lang.String r1 = "batch"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 7
            goto L_0x0096
        L_0x0042:
            java.lang.String r1 = "openDatabase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 6
            goto L_0x0096
        L_0x004c:
            java.lang.String r1 = "debugMode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 12
            goto L_0x0096
        L_0x0057:
            java.lang.String r1 = "deleteDatabase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 10
            goto L_0x0096
        L_0x0062:
            java.lang.String r1 = "update"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 4
            goto L_0x0096
        L_0x006c:
            java.lang.String r1 = "insert"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 3
            goto L_0x0096
        L_0x0076:
            java.lang.String r1 = "options"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 8
            goto L_0x0096
        L_0x0081:
            java.lang.String r1 = "closeDatabase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 1
            goto L_0x0096
        L_0x008b:
            java.lang.String r1 = "execute"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0095
            r0 = 5
            goto L_0x0096
        L_0x0095:
            r0 = -1
        L_0x0096:
            switch(r0) {
                case 0: goto L_0x00cd;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00c1;
                case 4: goto L_0x00bd;
                case 5: goto L_0x00b9;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00ad;
                case 9: goto L_0x00a9;
                case 10: goto L_0x00a5;
                case 11: goto L_0x00a1;
                case 12: goto L_0x009d;
                default: goto L_0x0099;
            }
        L_0x0099:
            r4.notImplemented()
            goto L_0x00e3
        L_0x009d:
            r2.mo16581D(r3, r4)
            goto L_0x00e3
        L_0x00a1:
            r2.mo16580C(r3, r4)
            goto L_0x00e3
        L_0x00a5:
            r2.mo16582E(r3, r4)
            goto L_0x00e3
        L_0x00a9:
            r2.mo16584G(r3, r4)
            goto L_0x00e3
        L_0x00ad:
            r2.mo16587J(r3, r4)
            goto L_0x00e3
        L_0x00b1:
            r2.mo16578A(r3, r4)
            goto L_0x00e3
        L_0x00b5:
            r2.mo16586I(r3, r4)
            goto L_0x00e3
        L_0x00b9:
            r2.mo16583F(r3, r4)
            goto L_0x00e3
        L_0x00bd:
            r2.mo16589L(r3, r4)
            goto L_0x00e3
        L_0x00c1:
            r2.mo16585H(r3, r4)
            goto L_0x00e3
        L_0x00c5:
            r2.mo16588K(r3, r4)
            goto L_0x00e3
        L_0x00c9:
            r2.mo16579B(r3, r4)
            goto L_0x00e3
        L_0x00cd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Android "
            r3.append(r0)
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4.success(r3)
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p126i.p127a.C2009c.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    /* renamed from: p */
    public final C2005a mo16594p(C2005a aVar, C9016i iVar, C9017j.C9022d dVar) {
        if (mo16595q(aVar, new C2028d(dVar, mo16598u(iVar), (Boolean) iVar.mo46571a("inTransaction")))) {
            return aVar;
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo16595q(C2005a aVar, C2031f fVar) {
        C2022d b = fVar.mo16630b();
        if (C2008b.m2686b(aVar.f1691e)) {
            aVar.mo16568d() + b;
        }
        Boolean d = fVar.mo16632d();
        try {
            aVar.mo16570f().execSQL(b.mo16619e(), b.mo16621f());
            if (Boolean.TRUE.equals(d)) {
                aVar.f1693g = true;
            }
            if (Boolean.FALSE.equals(d)) {
                aVar.f1693g = false;
            }
            return true;
        } catch (Exception e) {
            mo16599v(e, fVar, aVar);
            if (Boolean.FALSE.equals(d)) {
                aVar.f1693g = false;
            }
            return false;
        } catch (Throwable th) {
            if (Boolean.FALSE.equals(d)) {
                aVar.f1693g = false;
            }
            throw th;
        }
    }

    /* renamed from: s */
    public final C2005a mo16596s(int i) {
        return f1704w.get(Integer.valueOf(i));
    }

    /* renamed from: t */
    public final C2005a mo16597t(C9016i iVar, C9017j.C9022d dVar) {
        int intValue = ((Integer) iVar.mo46571a("id")).intValue();
        C2005a s = mo16596s(intValue);
        if (s != null) {
            return s;
        }
        dVar.error("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    /* renamed from: u */
    public final C2022d mo16598u(C9016i iVar) {
        return new C2022d((String) iVar.mo46571a("sql"), (List) iVar.mo46571a("arguments"));
    }

    /* renamed from: v */
    public final void mo16599v(Exception exc, C2031f fVar, C2005a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            fVar.error("sqlite_error", "open_failed " + aVar.f1688b, (Object) null);
        } else if (exc.getMessage().toLowerCase().contains("could not open database")) {
            fVar.error("sqlite_error", "open_failed " + aVar.f1688b, (Object) null);
        } else if (exc.getMessage().toLowerCase().contains("file is not a database")) {
            fVar.error("sqlite_error", "open_failed " + aVar.f1688b, (Object) null);
        } else if (exc instanceof SQLException) {
            fVar.error("sqlite_error", exc.getMessage(), C2033h.m2767a(fVar));
        } else {
            fVar.error("sqlite_error", exc.getMessage(), C2033h.m2767a(fVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c5  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo16600w(p040c.p126i.p127a.C2005a r9, p040c.p126i.p127a.p129f.C2031f r10) {
        /*
            r8 = this;
            boolean r0 = r8.mo16595q(r9, r10)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r10.mo16631c()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r10.success(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            net.sqlcipher.database.SQLiteDatabase r4 = r9.mo16570f()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
            net.sqlcipher.Cursor r0 = r4.rawQuery((java.lang.String) r0, (java.lang.String[]) r2)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
            if (r0 == 0) goto L_0x0095
            int r4 = r0.getCount()     // Catch:{ Exception -> 0x0093 }
            if (r4 <= 0) goto L_0x0095
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x0093 }
            if (r4 == 0) goto L_0x0095
            int r4 = r0.getInt(r1)     // Catch:{ Exception -> 0x0093 }
            if (r4 != 0) goto L_0x0063
            int r4 = r9.f1691e     // Catch:{ Exception -> 0x0093 }
            boolean r4 = p040c.p126i.p127a.C2008b.m2686b(r4)     // Catch:{ Exception -> 0x0093 }
            if (r4 == 0) goto L_0x005a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            r4.<init>()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = r9.mo16568d()     // Catch:{ Exception -> 0x0093 }
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = "no changes (id was "
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            long r5 = r0.getLong(r3)     // Catch:{ Exception -> 0x0093 }
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = ")"
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            r4.toString()     // Catch:{ Exception -> 0x0093 }
        L_0x005a:
            r10.success(r2)     // Catch:{ Exception -> 0x0093 }
            if (r0 == 0) goto L_0x0062
            r0.close()
        L_0x0062:
            return r3
        L_0x0063:
            long r4 = r0.getLong(r3)     // Catch:{ Exception -> 0x0093 }
            int r2 = r9.f1691e     // Catch:{ Exception -> 0x0093 }
            boolean r2 = p040c.p126i.p127a.C2008b.m2686b(r2)     // Catch:{ Exception -> 0x0093 }
            if (r2 == 0) goto L_0x0086
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            r2.<init>()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r6 = r9.mo16568d()     // Catch:{ Exception -> 0x0093 }
            r2.append(r6)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r6 = "inserted "
            r2.append(r6)     // Catch:{ Exception -> 0x0093 }
            r2.append(r4)     // Catch:{ Exception -> 0x0093 }
            r2.toString()     // Catch:{ Exception -> 0x0093 }
        L_0x0086:
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0093 }
            r10.success(r2)     // Catch:{ Exception -> 0x0093 }
            if (r0 == 0) goto L_0x0092
            r0.close()
        L_0x0092:
            return r3
        L_0x0093:
            r2 = move-exception
            goto L_0x00b8
        L_0x0095:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            r4.<init>()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = r9.mo16568d()     // Catch:{ Exception -> 0x0093 }
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = "fail to read changes for Insert"
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            r4.toString()     // Catch:{ Exception -> 0x0093 }
            r10.success(r2)     // Catch:{ Exception -> 0x0093 }
            if (r0 == 0) goto L_0x00b1
            r0.close()
        L_0x00b1:
            return r3
        L_0x00b2:
            r9 = move-exception
            goto L_0x00c3
        L_0x00b4:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x00b8:
            r8.mo16599v(r2, r10, r9)     // Catch:{ all -> 0x00c1 }
            if (r0 == 0) goto L_0x00c0
            r0.close()
        L_0x00c0:
            return r1
        L_0x00c1:
            r9 = move-exception
            r2 = r0
        L_0x00c3:
            if (r2 == 0) goto L_0x00c8
            r2.close()
        L_0x00c8:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p126i.p127a.C2009c.mo16600w(c.i.a.a, c.i.a.f.f):boolean");
    }

    /* renamed from: z */
    public final void mo16601z(Context context, C9003c cVar) {
        this.f1705e = context;
        SQLiteDatabase.loadLibs(context);
        C9017j jVar = new C9017j(cVar, "com.davidmartos96.sqflite_sqlcipher");
        this.f1706l = jVar;
        jVar.mo46575e(this);
    }
}
