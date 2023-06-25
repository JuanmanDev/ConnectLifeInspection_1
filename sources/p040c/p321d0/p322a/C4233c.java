package p040c.p321d0.p322a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p321d0.p322a.p323e.C4247a;
import p040c.p321d0.p322a.p324f.C4250c;
import p040c.p321d0.p322a.p324f.C4252d;
import p040c.p321d0.p322a.p324f.C4253e;
import p040c.p321d0.p322a.p324f.C4255f;
import p040c.p321d0.p322a.p324f.C4257h;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

/* renamed from: c.d0.a.c */
/* compiled from: SqflitePlugin */
public class C4233c implements C8944a, C9017j.C9021c {

    /* renamed from: m */
    public static final Map<String, Integer> f9016m = new HashMap();

    /* renamed from: n */
    public static boolean f9017n = false;

    /* renamed from: o */
    public static int f9018o = 10;

    /* renamed from: p */
    public static int f9019p = 0;

    /* renamed from: q */
    public static final Object f9020q = new Object();

    /* renamed from: r */
    public static final Object f9021r = new Object();

    /* renamed from: s */
    public static String f9022s;

    /* renamed from: t */
    public static int f9023t = 0;

    /* renamed from: u */
    public static HandlerThread f9024u;

    /* renamed from: v */
    public static Handler f9025v;
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: w */
    public static final Map<Integer, C4230a> f9026w = new HashMap();

    /* renamed from: e */
    public Context f9027e;

    /* renamed from: l */
    public C9017j f9028l;

    /* renamed from: c.d0.a.c$a */
    /* compiled from: SqflitePlugin */
    public class C4234a implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f9029e;

        /* renamed from: l */
        public final /* synthetic */ C4242i f9030l;

        /* renamed from: m */
        public final /* synthetic */ C4230a f9031m;

        public C4234a(C9016i iVar, C4242i iVar2, C4230a aVar) {
            this.f9029e = iVar;
            this.f9030l = iVar2;
            this.f9031m = aVar;
        }

        public void run() {
            boolean unused = C4233c.this.mo25675M(this.f9031m, new C4253e(this.f9029e, this.f9030l));
        }
    }

    /* renamed from: c.d0.a.c$b */
    /* compiled from: SqflitePlugin */
    public class C4235b implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f9033e;

        /* renamed from: l */
        public final /* synthetic */ C4242i f9034l;

        /* renamed from: m */
        public final /* synthetic */ C4230a f9035m;

        public C4235b(C9016i iVar, C4242i iVar2, C4230a aVar) {
            this.f9033e = iVar;
            this.f9034l = iVar2;
            this.f9035m = aVar;
        }

        public void run() {
            C4253e eVar = new C4253e(this.f9033e, this.f9034l);
            boolean c = eVar.mo25713c();
            boolean f = eVar.mo25716f();
            ArrayList arrayList = new ArrayList();
            for (Map cVar : (List) this.f9033e.mo46571a("operations")) {
                C4250c cVar2 = new C4250c(cVar, c);
                String j = cVar2.mo25720j();
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
                                this.f9034l.error("bad_param", "Batch method '" + j + "' not supported", (Object) null);
                                return;
                            } else if (C4233c.this.mo25676P(this.f9035m, cVar2)) {
                                cVar2.mo25725o(arrayList);
                            } else if (f) {
                                cVar2.mo25724n(arrayList);
                            } else {
                                cVar2.mo25723m(this.f9034l);
                                return;
                            }
                        } else if (C4233c.this.mo25675M(this.f9035m, cVar2)) {
                            cVar2.mo25725o(arrayList);
                        } else if (f) {
                            cVar2.mo25724n(arrayList);
                        } else {
                            cVar2.mo25723m(this.f9034l);
                            return;
                        }
                    } else if (C4233c.this.mo25685w(this.f9035m, cVar2)) {
                        cVar2.mo25725o(arrayList);
                    } else if (f) {
                        cVar2.mo25724n(arrayList);
                    } else {
                        cVar2.mo25723m(this.f9034l);
                        return;
                    }
                } else if (C4233c.this.mo25678o(this.f9035m, cVar2)) {
                    cVar2.mo25725o(arrayList);
                } else if (f) {
                    cVar2.mo25724n(arrayList);
                } else {
                    cVar2.mo25723m(this.f9034l);
                    return;
                }
            }
            if (c) {
                this.f9034l.success((Object) null);
            } else {
                this.f9034l.success(arrayList);
            }
        }
    }

    /* renamed from: c.d0.a.c$c */
    /* compiled from: SqflitePlugin */
    public class C4236c implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f9037e;

        /* renamed from: l */
        public final /* synthetic */ C4242i f9038l;

        /* renamed from: m */
        public final /* synthetic */ C4230a f9039m;

        public C4236c(C9016i iVar, C4242i iVar2, C4230a aVar) {
            this.f9037e = iVar;
            this.f9038l = iVar2;
            this.f9039m = aVar;
        }

        public void run() {
            boolean unused = C4233c.this.mo25685w(this.f9039m, new C4253e(this.f9037e, this.f9038l));
        }
    }

    /* renamed from: c.d0.a.c$d */
    /* compiled from: SqflitePlugin */
    public class C4237d implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C4230a f9041e;

        /* renamed from: l */
        public final /* synthetic */ C9016i f9042l;

        /* renamed from: m */
        public final /* synthetic */ C4242i f9043m;

        public C4237d(C4230a aVar, C9016i iVar, C4242i iVar2) {
            this.f9041e = aVar;
            this.f9042l = iVar;
            this.f9043m = iVar2;
        }

        public void run() {
            if (C4233c.this.mo25679p(this.f9041e, this.f9042l, this.f9043m) != null) {
                this.f9043m.success((Object) null);
            }
        }
    }

    /* renamed from: c.d0.a.c$e */
    /* compiled from: SqflitePlugin */
    public class C4238e implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C9016i f9045e;

        /* renamed from: l */
        public final /* synthetic */ C4242i f9046l;

        /* renamed from: m */
        public final /* synthetic */ C4230a f9047m;

        public C4238e(C9016i iVar, C4242i iVar2, C4230a aVar) {
            this.f9045e = iVar;
            this.f9046l = iVar2;
            this.f9047m = aVar;
        }

        public void run() {
            boolean unused = C4233c.this.mo25676P(this.f9047m, new C4253e(this.f9045e, this.f9046l));
        }
    }

    /* renamed from: c.d0.a.c$f */
    /* compiled from: SqflitePlugin */
    public class C4239f implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ boolean f9049e;

        /* renamed from: l */
        public final /* synthetic */ String f9050l;

        /* renamed from: m */
        public final /* synthetic */ C4242i f9051m;

        /* renamed from: n */
        public final /* synthetic */ Boolean f9052n;

        /* renamed from: o */
        public final /* synthetic */ C4230a f9053o;

        /* renamed from: p */
        public final /* synthetic */ C9016i f9054p;

        /* renamed from: q */
        public final /* synthetic */ boolean f9055q;

        /* renamed from: r */
        public final /* synthetic */ int f9056r;

        public C4239f(boolean z, String str, C4242i iVar, Boolean bool, C4230a aVar, C9016i iVar2, boolean z2, int i) {
            this.f9049e = z;
            this.f9050l = str;
            this.f9051m = iVar;
            this.f9052n = bool;
            this.f9053o = aVar;
            this.f9054p = iVar2;
            this.f9055q = z2;
            this.f9056r = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
            r5.f9051m.success(p040c.p321d0.p322a.C4233c.m11537y(r5.f9056r, false, false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
            p040c.p321d0.p322a.C4233c.m11529h(r5.f9057s, r1, new p040c.p321d0.p322a.p324f.C4253e(r5.f9054p, r5.f9051m), r5.f9053o);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                java.lang.Object r0 = p040c.p321d0.p322a.C4233c.f9021r
                monitor-enter(r0)
                boolean r1 = r5.f9049e     // Catch:{ all -> 0x00d4 }
                if (r1 != 0) goto L_0x0048
                java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r5.f9050l     // Catch:{ all -> 0x00d4 }
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
                c.d0.a.c$i r1 = r5.f9051m     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = "sqlite_error"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
                r3.<init>()     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = "open_failed "
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r4 = r5.f9050l     // Catch:{ all -> 0x00d4 }
                r3.append(r4)     // Catch:{ all -> 0x00d4 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d4 }
                r4 = 0
                r1.error(r2, r3, r4)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                return
            L_0x0048:
                java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00c1 }
                java.lang.Boolean r2 = r5.f9052n     // Catch:{ Exception -> 0x00c1 }
                boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x00c1 }
                if (r1 == 0) goto L_0x0058
                c.d0.a.a r1 = r5.f9053o     // Catch:{ Exception -> 0x00c1 }
                r1.mo25661h()     // Catch:{ Exception -> 0x00c1 }
                goto L_0x005d
            L_0x0058:
                c.d0.a.a r1 = r5.f9053o     // Catch:{ Exception -> 0x00c1 }
                r1.mo25660g()     // Catch:{ Exception -> 0x00c1 }
            L_0x005d:
                java.lang.Object r1 = p040c.p321d0.p322a.C4233c.f9020q     // Catch:{ all -> 0x00d4 }
                monitor-enter(r1)     // Catch:{ all -> 0x00d4 }
                boolean r2 = r5.f9055q     // Catch:{ all -> 0x00be }
                if (r2 == 0) goto L_0x0073
                java.util.Map<java.lang.String, java.lang.Integer> r2 = p040c.p321d0.p322a.C4233c.f9016m     // Catch:{ all -> 0x00be }
                java.lang.String r3 = r5.f9050l     // Catch:{ all -> 0x00be }
                int r4 = r5.f9056r     // Catch:{ all -> 0x00be }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00be }
                r2.put(r3, r4)     // Catch:{ all -> 0x00be }
            L_0x0073:
                java.util.Map<java.lang.Integer, c.d0.a.a> r2 = p040c.p321d0.p322a.C4233c.f9026w     // Catch:{ all -> 0x00be }
                int r3 = r5.f9056r     // Catch:{ all -> 0x00be }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00be }
                c.d0.a.a r4 = r5.f9053o     // Catch:{ all -> 0x00be }
                r2.put(r3, r4)     // Catch:{ all -> 0x00be }
                monitor-exit(r1)     // Catch:{ all -> 0x00be }
                c.d0.a.a r1 = r5.f9053o     // Catch:{ all -> 0x00d4 }
                int r1 = r1.f9013d     // Catch:{ all -> 0x00d4 }
                boolean r1 = p040c.p321d0.p322a.C4232b.m11518b(r1)     // Catch:{ all -> 0x00d4 }
                if (r1 == 0) goto L_0x00b0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d4 }
                r1.<init>()     // Catch:{ all -> 0x00d4 }
                c.d0.a.a r2 = r5.f9053o     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r2.mo25657d()     // Catch:{ all -> 0x00d4 }
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = "opened "
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                int r2 = r5.f9056r     // Catch:{ all -> 0x00d4 }
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = " "
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                java.lang.String r2 = r5.f9050l     // Catch:{ all -> 0x00d4 }
                r1.append(r2)     // Catch:{ all -> 0x00d4 }
                r1.toString()     // Catch:{ all -> 0x00d4 }
            L_0x00b0:
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                c.d0.a.c$i r0 = r5.f9051m
                int r1 = r5.f9056r
                r2 = 0
                java.util.Map r1 = p040c.p321d0.p322a.C4233c.m11537y(r1, r2, r2)
                r0.success(r1)
                return
            L_0x00be:
                r2 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00be }
                throw r2     // Catch:{ all -> 0x00d4 }
            L_0x00c1:
                r1 = move-exception
                c.d0.a.f.e r2 = new c.d0.a.f.e     // Catch:{ all -> 0x00d4 }
                f.a.e.a.i r3 = r5.f9054p     // Catch:{ all -> 0x00d4 }
                c.d0.a.c$i r4 = r5.f9051m     // Catch:{ all -> 0x00d4 }
                r2.<init>(r3, r4)     // Catch:{ all -> 0x00d4 }
                c.d0.a.c r3 = p040c.p321d0.p322a.C4233c.this     // Catch:{ all -> 0x00d4 }
                c.d0.a.a r4 = r5.f9053o     // Catch:{ all -> 0x00d4 }
                r3.mo25684v(r1, r2, r4)     // Catch:{ all -> 0x00d4 }
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                return
            L_0x00d4:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00d4 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p321d0.p322a.C4233c.C4239f.run():void");
        }
    }

    /* renamed from: c.d0.a.c$g */
    /* compiled from: SqflitePlugin */
    public class C4240g implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C4230a f9058e;

        /* renamed from: l */
        public final /* synthetic */ C4242i f9059l;

        public C4240g(C4230a aVar, C4242i iVar) {
            this.f9058e = aVar;
            this.f9059l = iVar;
        }

        public void run() {
            synchronized (C4233c.f9021r) {
                C4233c.this.mo25677k(this.f9058e);
            }
            this.f9059l.success((Object) null);
        }
    }

    /* renamed from: c.d0.a.c$h */
    /* compiled from: SqflitePlugin */
    public class C4241h implements Runnable {

        /* renamed from: e */
        public final /* synthetic */ C4230a f9061e;

        /* renamed from: l */
        public final /* synthetic */ String f9062l;

        /* renamed from: m */
        public final /* synthetic */ C4242i f9063m;

        public C4241h(C4230a aVar, String str, C4242i iVar) {
            this.f9061e = aVar;
            this.f9062l = str;
            this.f9063m = iVar;
        }

        public void run() {
            synchronized (C4233c.f9021r) {
                if (this.f9061e != null) {
                    C4233c.this.mo25677k(this.f9061e);
                }
                try {
                    if (C4232b.m11519c(C4233c.f9019p)) {
                        "delete database " + this.f9062l;
                    }
                    C4230a.m11509b(this.f9062l);
                } catch (Exception e) {
                    "error " + e + " while closing database " + C4233c.f9023t;
                }
            }
            this.f9063m.success((Object) null);
        }
    }

    /* renamed from: c.d0.a.c$i */
    /* compiled from: SqflitePlugin */
    public class C4242i implements C9017j.C9022d {

        /* renamed from: a */
        public final Handler f9065a;

        /* renamed from: b */
        public final C9017j.C9022d f9066b;

        /* renamed from: c.d0.a.c$i$a */
        /* compiled from: SqflitePlugin */
        public class C4243a implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ Object f9067e;

            public C4243a(Object obj) {
                this.f9067e = obj;
            }

            public void run() {
                C4242i.this.f9066b.success(this.f9067e);
            }
        }

        /* renamed from: c.d0.a.c$i$b */
        /* compiled from: SqflitePlugin */
        public class C4244b implements Runnable {

            /* renamed from: e */
            public final /* synthetic */ String f9069e;

            /* renamed from: l */
            public final /* synthetic */ String f9070l;

            /* renamed from: m */
            public final /* synthetic */ Object f9071m;

            public C4244b(String str, String str2, Object obj) {
                this.f9069e = str;
                this.f9070l = str2;
                this.f9071m = obj;
            }

            public void run() {
                C4242i.this.f9066b.error(this.f9069e, this.f9070l, this.f9071m);
            }
        }

        /* renamed from: c.d0.a.c$i$c */
        /* compiled from: SqflitePlugin */
        public class C4245c implements Runnable {
            public C4245c() {
            }

            public void run() {
                C4242i.this.f9066b.notImplemented();
            }
        }

        public /* synthetic */ C4242i(C4233c cVar, C9017j.C9022d dVar, C4234a aVar) {
            this(cVar, dVar);
        }

        public void error(String str, String str2, Object obj) {
            this.f9065a.post(new C4244b(str, str2, obj));
        }

        public void notImplemented() {
            this.f9065a.post(new C4245c());
        }

        public void success(Object obj) {
            this.f9065a.post(new C4243a(obj));
        }

        public C4242i(C4233c cVar, C9017j.C9022d dVar) {
            this.f9065a = new Handler(Looper.getMainLooper());
            this.f9066b = dVar;
        }
    }

    /* renamed from: N */
    public static void m11520N(C9024l.C9027c cVar) {
        new C4233c().mo25686z(cVar.mo46298c(), cVar.mo46301f());
    }

    /* renamed from: O */
    public static String m11521O(Object obj) {
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
            return m11535r((Map) obj).toString();
        } else {
            return obj.toString();
        }
    }

    /* renamed from: l */
    public static List<Object> m11532l(Cursor cursor, int i) {
        String str;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            Object n = m11534n(cursor, i2);
            if (C4247a.f9078c) {
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
    public static Map<String, Object> m11533m(Cursor cursor) {
        HashMap hashMap = new HashMap();
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            if (C4247a.f9078c) {
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
    public static Object m11534n(Cursor cursor, int i) {
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
    public static Map<String, Object> m11535r(Map<Object, Object> map) {
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value instanceof Map) {
                obj = m11535r((Map) value);
            } else {
                obj = m11521O(value);
            }
            hashMap.put(m11521O(next.getKey()), obj);
        }
        return hashMap;
    }

    /* renamed from: x */
    public static boolean m11536x(String str) {
        return str == null || str.equals(SQLiteDatabase.MEMORY);
    }

    /* renamed from: y */
    public static Map m11537y(int i, boolean z, boolean z2) {
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
    public final void mo25663A(C9016i iVar, C9017j.C9022d dVar) {
        C4230a t = mo25682t(iVar, dVar);
        if (t != null) {
            f9025v.post(new C4235b(iVar, new C4242i(this, dVar, (C4234a) null), t));
        }
    }

    /* renamed from: B */
    public final void mo25664B(C9016i iVar, C9017j.C9022d dVar) {
        int intValue = ((Integer) iVar.mo46571a("id")).intValue();
        C4230a t = mo25682t(iVar, dVar);
        if (t != null) {
            if (C4232b.m11518b(t.f9013d)) {
                t.mo25657d() + "closing " + intValue + " " + t.f9011b;
            }
            String str = t.f9011b;
            synchronized (f9020q) {
                f9026w.remove(Integer.valueOf(intValue));
                if (t.f9010a) {
                    f9016m.remove(str);
                }
            }
            f9025v.post(new C4240g(t, new C4242i(this, dVar, (C4234a) null)));
        }
    }

    /* renamed from: C */
    public final void mo25665C(C9016i iVar, C9017j.C9022d dVar) {
        HashMap hashMap = new HashMap();
        if ("get".equals((String) iVar.mo46571a("cmd"))) {
            int i = f9019p;
            if (i > 0) {
                hashMap.put("logLevel", Integer.valueOf(i));
            }
            if (!f9026w.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry next : f9026w.entrySet()) {
                    C4230a aVar = (C4230a) next.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("path", aVar.f9011b);
                    hashMap3.put("singleInstance", Boolean.valueOf(aVar.f9010a));
                    int i2 = aVar.f9013d;
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
    public final void mo25666D(C9016i iVar, C9017j.C9022d dVar) {
        C4247a.f9076a = Boolean.TRUE.equals(iVar.mo46572b());
        C4247a.f9078c = C4247a.f9077b && C4247a.f9076a;
        if (!C4247a.f9076a) {
            f9019p = 0;
        } else if (C4247a.f9078c) {
            f9019p = 2;
        } else if (C4247a.f9076a) {
            f9019p = 1;
        }
        dVar.success((Object) null);
    }

    /* renamed from: E */
    public final void mo25667E(C9016i iVar, C9017j.C9022d dVar) {
        C4230a aVar;
        String str = (String) iVar.mo46571a("path");
        synchronized (f9020q) {
            if (C4232b.m11519c(f9019p)) {
                "Look for " + str + " in " + f9016m.keySet();
            }
            Integer num = f9016m.get(str);
            if (num == null || (aVar = f9026w.get(num)) == null || !aVar.f9014e.isOpen()) {
                aVar = null;
            } else {
                if (C4232b.m11519c(f9019p)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(aVar.mo25657d());
                    sb.append("found single instance ");
                    sb.append(aVar.f9015f ? "(in transaction) " : "");
                    sb.append(num);
                    sb.append(" ");
                    sb.append(str);
                    sb.toString();
                }
                f9026w.remove(num);
                f9016m.remove(str);
            }
        }
        C4241h hVar = new C4241h(aVar, str, new C4242i(this, dVar, (C4234a) null));
        Handler handler = f9025v;
        if (handler != null) {
            handler.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* renamed from: F */
    public final void mo25668F(C9016i iVar, C9017j.C9022d dVar) {
        C4230a t = mo25682t(iVar, dVar);
        if (t != null) {
            f9025v.post(new C4237d(t, iVar, new C4242i(this, dVar, (C4234a) null)));
        }
    }

    /* renamed from: G */
    public void mo25669G(C9016i iVar, C9017j.C9022d dVar) {
        if (f9022s == null) {
            f9022s = this.f9027e.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        dVar.success(f9022s);
    }

    /* renamed from: H */
    public final void mo25670H(C9016i iVar, C9017j.C9022d dVar) {
        C4230a t = mo25682t(iVar, dVar);
        if (t != null) {
            f9025v.post(new C4236c(iVar, new C4242i(this, dVar, (C4234a) null), t));
        }
    }

    /* renamed from: I */
    public final void mo25671I(C9016i iVar, C9017j.C9022d dVar) {
        int i;
        C4230a aVar;
        String str = (String) iVar.mo46571a("path");
        Boolean bool = (Boolean) iVar.mo46571a("readOnly");
        boolean x = m11536x(str);
        boolean z = !Boolean.FALSE.equals(iVar.mo46571a("singleInstance")) && !x;
        if (z) {
            synchronized (f9020q) {
                if (C4232b.m11519c(f9019p)) {
                    "Look for " + str + " in " + f9016m.keySet();
                }
                Integer num = f9016m.get(str);
                if (!(num == null || (aVar = f9026w.get(num)) == null)) {
                    if (aVar.f9014e.isOpen()) {
                        if (C4232b.m11519c(f9019p)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(aVar.mo25657d());
                            sb.append("re-opened single instance ");
                            sb.append(aVar.f9015f ? "(in transaction) " : "");
                            sb.append(num);
                            sb.append(" ");
                            sb.append(str);
                            sb.toString();
                        }
                        dVar.success(m11537y(num.intValue(), true, aVar.f9015f));
                        return;
                    } else if (C4232b.m11519c(f9019p)) {
                        aVar.mo25657d() + "single instance database of " + str + " not opened";
                    }
                }
            }
        }
        synchronized (f9020q) {
            i = f9023t + 1;
            f9023t = i;
        }
        C4230a aVar2 = new C4230a(str, i, z, f9019p);
        C4242i iVar2 = new C4242i(this, dVar, (C4234a) null);
        synchronized (f9020q) {
            if (f9025v == null) {
                HandlerThread handlerThread = new HandlerThread("Sqflite", f9018o);
                f9024u = handlerThread;
                handlerThread.start();
                f9025v = new Handler(f9024u.getLooper());
                if (C4232b.m11518b(aVar2.f9013d)) {
                    aVar2.mo25657d() + "starting thread" + f9024u + " priority " + f9018o;
                }
            }
            if (C4232b.m11518b(aVar2.f9013d)) {
                aVar2.mo25657d() + "opened " + i + " " + str;
            }
            f9025v.post(new C4239f(x, str, iVar2, bool, aVar2, iVar, z, i));
        }
    }

    /* renamed from: J */
    public void mo25672J(C9016i iVar, C9017j.C9022d dVar) {
        Object a = iVar.mo46571a("queryAsMapList");
        if (a != null) {
            f9017n = Boolean.TRUE.equals(a);
        }
        Object a2 = iVar.mo46571a("androidThreadPriority");
        if (a2 != null) {
            f9018o = ((Integer) a2).intValue();
        }
        Integer a3 = C4232b.m11517a(iVar);
        if (a3 != null) {
            f9019p = a3.intValue();
        }
        dVar.success((Object) null);
    }

    /* renamed from: K */
    public final void mo25673K(C9016i iVar, C9017j.C9022d dVar) {
        C4230a t = mo25682t(iVar, dVar);
        if (t != null) {
            f9025v.post(new C4234a(iVar, new C4242i(this, dVar, (C4234a) null), t));
        }
    }

    /* renamed from: L */
    public final void mo25674L(C9016i iVar, C9017j.C9022d dVar) {
        C4230a t = mo25682t(iVar, dVar);
        if (t != null) {
            f9025v.post(new C4238e(iVar, new C4242i(this, dVar, (C4234a) null), t));
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
        r5.add(m11532l(r0, r6));
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
    public final boolean mo25675M(p040c.p321d0.p322a.C4230a r12, p040c.p321d0.p322a.p324f.C4255f r13) {
        /*
            r11 = this;
            c.d0.a.d r0 = r13.mo25712b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.f9013d
            boolean r2 = p040c.p321d0.p322a.C4232b.m11518b(r2)
            if (r2 == 0) goto L_0x0023
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.mo25657d()
            r2.append(r3)
            r2.append(r0)
            r2.toString()
        L_0x0023:
            boolean r2 = f9017n
            r3 = 0
            r4 = 0
            c.d0.a.d r0 = r0.mo25707i()     // Catch:{ Exception -> 0x00b7 }
            android.database.sqlite.SQLiteDatabase r5 = r12.mo25656c()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String r6 = r0.mo25701e()     // Catch:{ Exception -> 0x00b7 }
            java.lang.String[] r0 = r0.mo25698b()     // Catch:{ Exception -> 0x00b7 }
            android.database.Cursor r0 = r5.rawQuery(r6, r0)     // Catch:{ Exception -> 0x00b7 }
            r6 = r3
            r5 = r4
        L_0x003d:
            boolean r7 = r0.moveToNext()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r7 == 0) goto L_0x0098
            if (r2 == 0) goto L_0x006b
            java.util.Map r7 = m11533m(r0)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            int r8 = r12.f9013d     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            boolean r8 = p040c.p321d0.p322a.C4232b.m11518b(r8)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            if (r8 == 0) goto L_0x0067
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r8.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r9 = r12.mo25657d()     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            r8.append(r9)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
            java.lang.String r9 = m11521O(r7)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
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
            java.util.List r7 = m11532l(r0, r6)     // Catch:{ Exception -> 0x00b2, all -> 0x00af }
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
            r11.mo25684v(r1, r13, r12)     // Catch:{ all -> 0x00b5 }
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p321d0.p322a.C4233c.mo25675M(c.d0.a.a, c.d0.a.f.f):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25676P(p040c.p321d0.p322a.C4230a r7, p040c.p321d0.p322a.p324f.C4255f r8) {
        /*
            r6 = this;
            boolean r0 = r6.mo25680q(r7, r8)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r8.mo25713c()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0014
            r8.success(r3)
            return r2
        L_0x0014:
            android.database.sqlite.SQLiteDatabase r0 = r7.mo25659f()     // Catch:{ Exception -> 0x0081 }
            java.lang.String r4 = "SELECT changes()"
            android.database.Cursor r0 = r0.rawQuery(r4, r3)     // Catch:{ Exception -> 0x0081 }
            if (r0 == 0) goto L_0x0062
            int r4 = r0.getCount()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r4 <= 0) goto L_0x0062
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r4 == 0) goto L_0x0062
            int r3 = r0.getInt(r1)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            int r4 = r7.f9013d     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            boolean r4 = p040c.p321d0.p322a.C4232b.m11518b(r4)     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            if (r4 == 0) goto L_0x004f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            r4.<init>()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
            java.lang.String r5 = r7.mo25657d()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
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
            java.lang.String r5 = r7.mo25657d()     // Catch:{ Exception -> 0x005f, all -> 0x005c }
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
            r6.mo25684v(r2, r8, r7)     // Catch:{ all -> 0x007f }
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p321d0.p322a.C4233c.mo25676P(c.d0.a.a, c.d0.a.f.f):boolean");
    }

    /* renamed from: k */
    public final void mo25677k(C4230a aVar) {
        try {
            if (C4232b.m11518b(aVar.f9013d)) {
                aVar.mo25657d() + "closing database " + f9024u;
            }
            aVar.mo25655a();
        } catch (Exception e) {
            "error " + e + " while closing database " + f9023t;
        }
        synchronized (f9020q) {
            if (f9026w.isEmpty() && f9025v != null) {
                if (C4232b.m11518b(aVar.f9013d)) {
                    aVar.mo25657d() + "stopping thread" + f9024u;
                }
                f9024u.quit();
                f9024u = null;
                f9025v = null;
            }
        }
    }

    /* renamed from: o */
    public final boolean mo25678o(C4230a aVar, C4255f fVar) {
        if (!mo25680q(aVar, fVar)) {
            return false;
        }
        fVar.success((Object) null);
        return true;
    }

    public void onAttachedToEngine(C8944a.C8946b bVar) {
        mo25686z(bVar.mo46464a(), bVar.mo46465b());
    }

    public void onDetachedFromEngine(C8944a.C8946b bVar) {
        this.f9027e = null;
        this.f9028l.mo46575e((C9017j.C9021c) null);
        this.f9028l = null;
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
            r2.mo25666D(r3, r4)
            goto L_0x00e3
        L_0x00a1:
            r2.mo25665C(r3, r4)
            goto L_0x00e3
        L_0x00a5:
            r2.mo25667E(r3, r4)
            goto L_0x00e3
        L_0x00a9:
            r2.mo25669G(r3, r4)
            goto L_0x00e3
        L_0x00ad:
            r2.mo25672J(r3, r4)
            goto L_0x00e3
        L_0x00b1:
            r2.mo25663A(r3, r4)
            goto L_0x00e3
        L_0x00b5:
            r2.mo25671I(r3, r4)
            goto L_0x00e3
        L_0x00b9:
            r2.mo25668F(r3, r4)
            goto L_0x00e3
        L_0x00bd:
            r2.mo25674L(r3, r4)
            goto L_0x00e3
        L_0x00c1:
            r2.mo25670H(r3, r4)
            goto L_0x00e3
        L_0x00c5:
            r2.mo25673K(r3, r4)
            goto L_0x00e3
        L_0x00c9:
            r2.mo25664B(r3, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p321d0.p322a.C4233c.onMethodCall(f.a.e.a.i, f.a.e.a.j$d):void");
    }

    /* renamed from: p */
    public final C4230a mo25679p(C4230a aVar, C9016i iVar, C9017j.C9022d dVar) {
        if (mo25680q(aVar, new C4252d(dVar, mo25683u(iVar), (Boolean) iVar.mo46571a("inTransaction")))) {
            return aVar;
        }
        return null;
    }

    /* renamed from: q */
    public final boolean mo25680q(C4230a aVar, C4255f fVar) {
        C4246d b = fVar.mo25712b();
        if (C4232b.m11518b(aVar.f9013d)) {
            aVar.mo25657d() + b;
        }
        Boolean d = fVar.mo25714d();
        try {
            aVar.mo25659f().execSQL(b.mo25701e(), b.mo25703f());
            if (Boolean.TRUE.equals(d)) {
                aVar.f9015f = true;
            }
            if (Boolean.FALSE.equals(d)) {
                aVar.f9015f = false;
            }
            return true;
        } catch (Exception e) {
            mo25684v(e, fVar, aVar);
            if (Boolean.FALSE.equals(d)) {
                aVar.f9015f = false;
            }
            return false;
        } catch (Throwable th) {
            if (Boolean.FALSE.equals(d)) {
                aVar.f9015f = false;
            }
            throw th;
        }
    }

    /* renamed from: s */
    public final C4230a mo25681s(int i) {
        return f9026w.get(Integer.valueOf(i));
    }

    /* renamed from: t */
    public final C4230a mo25682t(C9016i iVar, C9017j.C9022d dVar) {
        int intValue = ((Integer) iVar.mo46571a("id")).intValue();
        C4230a s = mo25681s(intValue);
        if (s != null) {
            return s;
        }
        dVar.error("sqlite_error", "database_closed " + intValue, (Object) null);
        return null;
    }

    /* renamed from: u */
    public final C4246d mo25683u(C9016i iVar) {
        return new C4246d((String) iVar.mo46571a("sql"), (List) iVar.mo46571a("arguments"));
    }

    /* renamed from: v */
    public final void mo25684v(Exception exc, C4255f fVar, C4230a aVar) {
        if (exc instanceof SQLiteCantOpenDatabaseException) {
            fVar.error("sqlite_error", "open_failed " + aVar.f9011b, (Object) null);
        } else if (exc instanceof SQLException) {
            fVar.error("sqlite_error", exc.getMessage(), C4257h.m11600a(fVar));
        } else {
            fVar.error("sqlite_error", exc.getMessage(), C4257h.m11600a(fVar));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c5  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25685w(p040c.p321d0.p322a.C4230a r9, p040c.p321d0.p322a.p324f.C4255f r10) {
        /*
            r8 = this;
            boolean r0 = r8.mo25680q(r9, r10)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r10.mo25713c()
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0014
            r10.success(r2)
            return r3
        L_0x0014:
            java.lang.String r0 = "SELECT changes(), last_insert_rowid()"
            android.database.sqlite.SQLiteDatabase r4 = r9.mo25659f()     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
            android.database.Cursor r0 = r4.rawQuery(r0, r2)     // Catch:{ Exception -> 0x00b4, all -> 0x00b2 }
            if (r0 == 0) goto L_0x0095
            int r4 = r0.getCount()     // Catch:{ Exception -> 0x0093 }
            if (r4 <= 0) goto L_0x0095
            boolean r4 = r0.moveToFirst()     // Catch:{ Exception -> 0x0093 }
            if (r4 == 0) goto L_0x0095
            int r4 = r0.getInt(r1)     // Catch:{ Exception -> 0x0093 }
            if (r4 != 0) goto L_0x0063
            int r4 = r9.f9013d     // Catch:{ Exception -> 0x0093 }
            boolean r4 = p040c.p321d0.p322a.C4232b.m11518b(r4)     // Catch:{ Exception -> 0x0093 }
            if (r4 == 0) goto L_0x005a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            r4.<init>()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = r9.mo25657d()     // Catch:{ Exception -> 0x0093 }
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
            int r2 = r9.f9013d     // Catch:{ Exception -> 0x0093 }
            boolean r2 = p040c.p321d0.p322a.C4232b.m11518b(r2)     // Catch:{ Exception -> 0x0093 }
            if (r2 == 0) goto L_0x0086
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            r2.<init>()     // Catch:{ Exception -> 0x0093 }
            java.lang.String r6 = r9.mo25657d()     // Catch:{ Exception -> 0x0093 }
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
            java.lang.String r5 = r9.mo25657d()     // Catch:{ Exception -> 0x0093 }
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
            r8.mo25684v(r2, r10, r9)     // Catch:{ all -> 0x00c1 }
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p321d0.p322a.C4233c.mo25685w(c.d0.a.a, c.d0.a.f.f):boolean");
    }

    /* renamed from: z */
    public final void mo25686z(Context context, C9003c cVar) {
        this.f9027e = context;
        C9017j jVar = new C9017j(cVar, "com.tekartik.sqflite");
        this.f9028l = jVar;
        jVar.mo46575e(this);
    }
}
