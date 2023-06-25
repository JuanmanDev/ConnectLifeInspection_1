package p040c.p077d.p078a.p079i;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: c.d.a.i.a */
/* compiled from: DiskLruCache */
public final class C1550a implements Closeable {

    /* renamed from: e */
    public final File f829e;

    /* renamed from: l */
    public final File f830l;

    /* renamed from: m */
    public final File f831m;

    /* renamed from: n */
    public final File f832n;

    /* renamed from: o */
    public final int f833o;

    /* renamed from: p */
    public long f834p;

    /* renamed from: q */
    public final int f835q;

    /* renamed from: r */
    public long f836r = 0;

    /* renamed from: s */
    public Writer f837s;

    /* renamed from: t */
    public final LinkedHashMap<String, C1554d> f838t = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: u */
    public int f839u;

    /* renamed from: v */
    public long f840v = 0;

    /* renamed from: w */
    public final ThreadPoolExecutor f841w = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C1552b((C1551a) null));

    /* renamed from: x */
    public final Callable<Void> f842x = new C1551a();

    /* renamed from: c.d.a.i.a$a */
    /* compiled from: DiskLruCache */
    public class C1551a implements Callable<Void> {
        public C1551a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() {
            /*
                r4 = this;
                c.d.a.i.a r0 = p040c.p077d.p078a.p079i.C1550a.this
                monitor-enter(r0)
                c.d.a.i.a r1 = p040c.p077d.p078a.p079i.C1550a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f837s     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                c.d.a.i.a r1 = p040c.p077d.p078a.p079i.C1550a.this     // Catch:{ all -> 0x0028 }
                r1.mo15526C()     // Catch:{ all -> 0x0028 }
                c.d.a.i.a r1 = p040c.p077d.p078a.p079i.C1550a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.mo15534s()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                c.d.a.i.a r1 = p040c.p077d.p078a.p079i.C1550a.this     // Catch:{ all -> 0x0028 }
                r1.mo15538z()     // Catch:{ all -> 0x0028 }
                c.d.a.i.a r1 = p040c.p077d.p078a.p079i.C1550a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                int unused = r1.f839u = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p079i.C1550a.C1551a.call():java.lang.Void");
        }
    }

    /* renamed from: c.d.a.i.a$b */
    /* compiled from: DiskLruCache */
    public static final class C1552b implements ThreadFactory {
        public C1552b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ C1552b(C1551a aVar) {
            this();
        }
    }

    /* renamed from: c.d.a.i.a$c */
    /* compiled from: DiskLruCache */
    public final class C1553c {

        /* renamed from: a */
        public final C1554d f844a;

        /* renamed from: b */
        public final boolean[] f845b;

        /* renamed from: c */
        public boolean f846c;

        public /* synthetic */ C1553c(C1550a aVar, C1554d dVar, C1551a aVar2) {
            this(dVar);
        }

        /* renamed from: a */
        public void mo15542a() {
            C1550a.this.mo15529j(this, false);
        }

        /* renamed from: b */
        public void mo15543b() {
            if (!this.f846c) {
                try {
                    mo15542a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: e */
        public void mo15544e() {
            C1550a.this.mo15529j(this, true);
            this.f846c = true;
        }

        /* renamed from: f */
        public File mo15545f(int i) {
            File k;
            synchronized (C1550a.this) {
                if (this.f844a.f853f == this) {
                    if (!this.f844a.f852e) {
                        this.f845b[i] = true;
                    }
                    k = this.f844a.mo15547k(i);
                    if (!C1550a.this.f829e.exists()) {
                        C1550a.this.f829e.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        public C1553c(C1554d dVar) {
            this.f844a = dVar;
            this.f845b = dVar.f852e ? null : new boolean[C1550a.this.f835q];
        }
    }

    /* renamed from: c.d.a.i.a$d */
    /* compiled from: DiskLruCache */
    public final class C1554d {

        /* renamed from: a */
        public final String f848a;

        /* renamed from: b */
        public final long[] f849b;

        /* renamed from: c */
        public File[] f850c;

        /* renamed from: d */
        public File[] f851d;

        /* renamed from: e */
        public boolean f852e;

        /* renamed from: f */
        public C1553c f853f;

        /* renamed from: g */
        public long f854g;

        public /* synthetic */ C1554d(C1550a aVar, String str, C1551a aVar2) {
            this(str);
        }

        /* renamed from: j */
        public File mo15546j(int i) {
            return this.f850c[i];
        }

        /* renamed from: k */
        public File mo15547k(int i) {
            return this.f851d[i];
        }

        /* renamed from: l */
        public String mo15548l() {
            StringBuilder sb = new StringBuilder();
            for (long append : this.f849b) {
                sb.append(' ');
                sb.append(append);
            }
            return sb.toString();
        }

        /* renamed from: m */
        public final IOException mo15549m(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: n */
        public final void mo15550n(String[] strArr) {
            if (strArr.length == C1550a.this.f835q) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f849b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        mo15549m(strArr);
                        throw null;
                    }
                }
                return;
            }
            mo15549m(strArr);
            throw null;
        }

        public C1554d(String str) {
            this.f848a = str;
            this.f849b = new long[C1550a.this.f835q];
            this.f850c = new File[C1550a.this.f835q];
            this.f851d = new File[C1550a.this.f835q];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C1550a.this.f835q; i++) {
                sb.append(i);
                this.f850c[i] = new File(C1550a.this.f829e, sb.toString());
                sb.append(".tmp");
                this.f851d[i] = new File(C1550a.this.f829e, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* renamed from: c.d.a.i.a$e */
    /* compiled from: DiskLruCache */
    public final class C1555e {

        /* renamed from: a */
        public final File[] f856a;

        public /* synthetic */ C1555e(C1550a aVar, String str, long j, File[] fileArr, long[] jArr, C1551a aVar2) {
            this(str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo15551a(int i) {
            return this.f856a[i];
        }

        public C1555e(String str, long j, File[] fileArr, long[] jArr) {
            this.f856a = fileArr;
        }
    }

    public C1550a(File file, int i, int i2, long j) {
        File file2 = file;
        this.f829e = file2;
        this.f833o = i;
        this.f830l = new File(file2, DiskLruCache.JOURNAL_FILE);
        this.f831m = new File(file2, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f832n = new File(file2, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f835q = i2;
        this.f834p = j;
    }

    /* renamed from: B */
    public static void m1168B(File file, File file2, boolean z) {
        if (z) {
            m1177n(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: n */
    public static void m1177n(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: u */
    public static C1550a m1178u(File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m1168B(file2, file3, false);
                }
            }
            C1550a aVar = new C1550a(file, i, i2, j);
            if (aVar.f830l.exists()) {
                try {
                    aVar.mo15536x();
                    aVar.mo15535w();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    aVar.mo15530m();
                }
            }
            file.mkdirs();
            C1550a aVar2 = new C1550a(file, i, i2, j);
            aVar2.mo15538z();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo15525A(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.mo15528i()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c.d.a.i.a$d> r0 = r7.f838t     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            c.d.a.i.a$d r0 = (p040c.p077d.p078a.p079i.C1550a.C1554d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            c.d.a.i.a$c r2 = r0.f853f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f835q     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo15546j(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f836r     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f849b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f836r = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f849b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f839u     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f839u = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f837s     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f837s     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f837s     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f837s     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, c.d.a.i.a$d> r0 = r7.f838t     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.mo15534s()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f841w     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f842x     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p079i.C1550a.mo15525A(java.lang.String):boolean");
    }

    /* renamed from: C */
    public final void mo15526C() {
        while (this.f836r > this.f834p) {
            mo15525A((String) this.f838t.entrySet().iterator().next().getKey());
        }
    }

    public synchronized void close() {
        if (this.f837s != null) {
            Iterator it = new ArrayList(this.f838t.values()).iterator();
            while (it.hasNext()) {
                C1554d dVar = (C1554d) it.next();
                if (dVar.f853f != null) {
                    dVar.f853f.mo15542a();
                }
            }
            mo15526C();
            this.f837s.close();
            this.f837s = null;
        }
    }

    /* renamed from: i */
    public final void mo15528i() {
        if (this.f837s == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo15529j(p040c.p077d.p078a.p079i.C1550a.C1553c r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            c.d.a.i.a$d r0 = r10.f844a     // Catch:{ all -> 0x010e }
            c.d.a.i.a$c r1 = r0.f853f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f852e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = r1
        L_0x0015:
            int r3 = r9.f835q     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f845b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo15547k(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo15542a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo15542a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f835q     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo15547k(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo15546j(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f849b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f849b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f836r     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f836r = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m1177n(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f839u     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f839u = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            p040c.p077d.p078a.p079i.C1550a.C1553c unused = r0.f853f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f852e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            boolean unused = r0.f852e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f848a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo15548l()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f840v     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f840v = r1     // Catch:{ all -> 0x010e }
            long unused = r0.f854g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, c.d.a.i.a$d> r10 = r9.f838t     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f848a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f848a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f837s     // Catch:{ all -> 0x010e }
            r10.flush()     // Catch:{ all -> 0x010e }
            long r10 = r9.f836r     // Catch:{ all -> 0x010e }
            long r0 = r9.f834p     // Catch:{ all -> 0x010e }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00ff
            boolean r10 = r9.mo15534s()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f841w     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f842x     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p079i.C1550a.mo15529j(c.d.a.i.a$c, boolean):void");
    }

    /* renamed from: m */
    public void mo15530m() {
        close();
        C1558c.m1219b(this.f829e);
    }

    /* renamed from: o */
    public C1553c mo15531o(String str) {
        return mo15532q(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p040c.p077d.p078a.p079i.C1550a.C1553c mo15532q(java.lang.String r6, long r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo15528i()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c.d.a.i.a$d> r0 = r5.f838t     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            c.d.a.i.a$d r0 = (p040c.p077d.p078a.p079i.C1550a.C1554d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r3 = r0.f854g     // Catch:{ all -> 0x005d }
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r2
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            c.d.a.i.a$d r0 = new c.d.a.i.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r2)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, c.d.a.i.a$d> r7 = r5.f838t     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            c.d.a.i.a$c r7 = r0.f853f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r2
        L_0x0034:
            c.d.a.i.a$c r7 = new c.d.a.i.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r2)     // Catch:{ all -> 0x005d }
            p040c.p077d.p078a.p079i.C1550a.C1553c unused = r0.f853f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f837s     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f837s     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f837s     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f837s     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f837s     // Catch:{ all -> 0x005d }
            r6.flush()     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p079i.C1550a.mo15532q(java.lang.String, long):c.d.a.i.a$c");
    }

    /* renamed from: r */
    public synchronized C1555e mo15533r(String str) {
        mo15528i();
        C1554d dVar = this.f838t.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f852e) {
            return null;
        }
        for (File exists : dVar.f850c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f839u++;
        this.f837s.append(DiskLruCache.READ);
        this.f837s.append(' ');
        this.f837s.append(str);
        this.f837s.append(10);
        if (mo15534s()) {
            this.f841w.submit(this.f842x);
        }
        return new C1555e(this, str, dVar.f854g, dVar.f850c, dVar.f849b, (C1551a) null);
    }

    /* renamed from: s */
    public final boolean mo15534s() {
        int i = this.f839u;
        return i >= 2000 && i >= this.f838t.size();
    }

    /* renamed from: w */
    public final void mo15535w() {
        m1177n(this.f831m);
        Iterator<C1554d> it = this.f838t.values().iterator();
        while (it.hasNext()) {
            C1554d next = it.next();
            int i = 0;
            if (next.f853f == null) {
                while (i < this.f835q) {
                    this.f836r += next.f849b[i];
                    i++;
                }
            } else {
                C1553c unused = next.f853f = null;
                while (i < this.f835q) {
                    m1177n(next.mo15546j(i));
                    m1177n(next.mo15547k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f839u = r0 - r9.f838t.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo15553c() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        mo15538z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f837s = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f830l, true), p040c.p077d.p078a.p079i.C1558c.f864a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15536x() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            c.d.a.i.b r1 = new c.d.a.i.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f830l
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p040c.p077d.p078a.p079i.C1558c.f864a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo15555d()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo15555d()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo15555d()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo15555d()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo15555d()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f833o     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f835q     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo15555d()     // Catch:{ EOFException -> 0x005f }
            r9.mo15537y(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, c.d.a.i.a$d> r2 = r9.f838t     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f839u = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo15553c()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.mo15538z()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f830l     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = p040c.p077d.p078a.p079i.C1558c.f864a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f837s = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            p040c.p077d.p078a.p079i.C1558c.m1218a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            p040c.p077d.p078a.p079i.C1558c.m1218a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p079i.C1550a.mo15536x():void");
    }

    /* renamed from: y */
    public final void mo15537y(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith(DiskLruCache.REMOVE)) {
                    this.f838t.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C1554d dVar = this.f838t.get(str2);
            if (dVar == null) {
                dVar = new C1554d(this, str2, (C1551a) null);
                this.f838t.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(DiskLruCache.CLEAN)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                boolean unused = dVar.f852e = true;
                C1553c unused2 = dVar.f853f = null;
                dVar.mo15550n(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(DiskLruCache.DIRTY)) {
                C1553c unused3 = dVar.f853f = new C1553c(this, dVar, (C1551a) null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(DiskLruCache.READ)) {
                throw new IOException("unexpected journal line: " + str);
            }
        } else {
            throw new IOException("unexpected journal line: " + str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: z */
    public final synchronized void mo15538z() {
        if (this.f837s != null) {
            this.f837s.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f831m), C1558c.f864a));
        try {
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f833o));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f835q));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C1554d next : this.f838t.values()) {
                if (next.f853f != null) {
                    bufferedWriter.write("DIRTY " + next.f848a + 10);
                } else {
                    bufferedWriter.write("CLEAN " + next.f848a + next.mo15548l() + 10);
                }
            }
            bufferedWriter.close();
            if (this.f830l.exists()) {
                m1168B(this.f830l, this.f832n, true);
            }
            m1168B(this.f831m, this.f830l, false);
            this.f832n.delete();
            this.f837s = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f830l, true), C1558c.f864a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }
}
