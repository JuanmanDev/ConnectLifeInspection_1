package p040c.p496x.p497a.p498a.p499a.p500a.p505g;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e;
import p040c.p496x.p497a.p498a.p499a.p500a.p507i.C7708a;

/* renamed from: c.x.a.a.a.a.g.b */
public abstract class C7688b {

    /* renamed from: a */
    public static final String f14449a = ("HTTP1." + C7688b.class.getSimpleName());

    /* renamed from: b */
    public static final Object f14450b = new Object();

    /* renamed from: c */
    public static String[] f14451c;

    /* renamed from: c.x.a.a.a.a.g.b$b */
    public static final class C7690b extends C7688b {

        /* renamed from: d */
        public final File f14452d;

        /* renamed from: e */
        public C7669e f14453e;

        public C7690b(File file) {
            if (file == null) {
                throw new NullPointerException("Directory file is null! ");
            } else if (file.isDirectory()) {
                this.f14452d = file;
            } else {
                throw new IllegalArgumentException("Directory file is not a folder! ");
            }
        }

        /* renamed from: b */
        public C7669e mo33200b() {
            C7669e eVar = this.f14453e;
            return eVar != null ? eVar : mo33206j();
        }

        /* renamed from: g */
        public void mo33203g(C7669e eVar) {
            this.f14453e = eVar;
            mo33207k(eVar);
        }

        /* renamed from: h */
        public final String mo33204h(long j) {
            return "GSLB" + j;
        }

        /* renamed from: i */
        public final long mo33205i(String str) {
            try {
                if (str.startsWith("GSLB")) {
                    return Long.parseLong(str.substring(4));
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
            if (r0 != null) goto L_0x005c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0061, code lost:
            if (r0 != null) goto L_0x005c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0055 A[SYNTHETIC, Splitter:B:26:0x0055] */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e mo33206j() {
            /*
                r12 = this;
                java.io.File r0 = r12.f14452d
                java.io.File[] r0 = r0.listFiles()
                r1 = 0
                if (r0 == 0) goto L_0x0023
                int r2 = r0.length
                r3 = 0
                r4 = -1
                r6 = r1
            L_0x000e:
                if (r3 >= r2) goto L_0x0024
                r7 = r0[r3]
                java.lang.String r8 = r7.getName()
                long r8 = r12.mo33205i(r8)
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 <= 0) goto L_0x0020
                r6 = r7
                r4 = r8
            L_0x0020:
                int r3 = r3 + 1
                goto L_0x000e
            L_0x0023:
                r6 = r1
            L_0x0024:
                if (r6 == 0) goto L_0x0064
                java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0060, JSONException -> 0x0059, all -> 0x004f }
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ IOException -> 0x0060, JSONException -> 0x0059, all -> 0x004f }
                r2.<init>(r6)     // Catch:{ IOException -> 0x0060, JSONException -> 0x0059, all -> 0x004f }
                r0.<init>(r2)     // Catch:{ IOException -> 0x0060, JSONException -> 0x0059, all -> 0x004f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0061, JSONException -> 0x005a, all -> 0x004d }
                r2.<init>()     // Catch:{ IOException -> 0x0061, JSONException -> 0x005a, all -> 0x004d }
            L_0x0035:
                java.lang.String r3 = r0.readLine()     // Catch:{ IOException -> 0x0061, JSONException -> 0x005a, all -> 0x004d }
                if (r3 == 0) goto L_0x003f
                r2.append(r3)     // Catch:{ IOException -> 0x0061, JSONException -> 0x005a, all -> 0x004d }
                goto L_0x0035
            L_0x003f:
                java.lang.String r3 = "lbgs.hismarttv.com"
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x0061, JSONException -> 0x005a, all -> 0x004d }
                c.x.a.a.a.a.f.e r1 = p040c.p496x.p497a.p498a.p499a.p500a.p505g.C7694e.m21791b(r3, r2)     // Catch:{ IOException -> 0x0061, JSONException -> 0x005a, all -> 0x004d }
                r0.close()     // Catch:{ IOException -> 0x004c }
            L_0x004c:
                return r1
            L_0x004d:
                r1 = move-exception
                goto L_0x0053
            L_0x004f:
                r0 = move-exception
                r11 = r1
                r1 = r0
                r0 = r11
            L_0x0053:
                if (r0 == 0) goto L_0x0058
                r0.close()     // Catch:{ IOException -> 0x0058 }
            L_0x0058:
                throw r1
            L_0x0059:
                r0 = r1
            L_0x005a:
                if (r0 == 0) goto L_0x0064
            L_0x005c:
                r0.close()     // Catch:{ IOException -> 0x0064 }
                goto L_0x0064
            L_0x0060:
                r0 = r1
            L_0x0061:
                if (r0 == 0) goto L_0x0064
                goto L_0x005c
            L_0x0064:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p496x.p497a.p498a.p499a.p500a.p505g.C7688b.C7690b.mo33206j():c.x.a.a.a.a.f.e");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
            if (r4 != null) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
            if (r4 != null) goto L_0x0053;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x004d A[SYNTHETIC, Splitter:B:23:0x004d] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo33207k(p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7669e r10) {
            /*
                r9 = this;
                java.io.File r0 = r9.f14452d
                java.io.File[] r0 = r0.listFiles()
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L_0x0021
                int r4 = r0.length
                r5 = r1
            L_0x000d:
                if (r5 >= r4) goto L_0x0021
                r6 = r0[r5]
                java.lang.String r6 = r6.getName()
                long r6 = r9.mo33205i(r6)
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 <= 0) goto L_0x001e
                r2 = r6
            L_0x001e:
                int r5 = r5 + 1
                goto L_0x000d
            L_0x0021:
                r4 = 0
                java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0057, JSONException -> 0x0051, all -> 0x004a }
                java.io.File r6 = r9.f14452d     // Catch:{ IOException -> 0x0057, JSONException -> 0x0051, all -> 0x004a }
                r7 = 1
                long r2 = r2 + r7
                java.lang.String r2 = r9.mo33204h(r2)     // Catch:{ IOException -> 0x0057, JSONException -> 0x0051, all -> 0x004a }
                r5.<init>(r6, r2)     // Catch:{ IOException -> 0x0057, JSONException -> 0x0051, all -> 0x004a }
                java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x0057, JSONException -> 0x0051, all -> 0x004a }
                r2.<init>(r5)     // Catch:{ IOException -> 0x0057, JSONException -> 0x0051, all -> 0x004a }
                java.lang.String r10 = p040c.p496x.p497a.p498a.p499a.p500a.p505g.C7694e.m21794e(r10)     // Catch:{ IOException -> 0x0048, JSONException -> 0x0046, all -> 0x0043 }
                r2.write(r10)     // Catch:{ IOException -> 0x0048, JSONException -> 0x0046, all -> 0x0043 }
                r2.flush()     // Catch:{ IOException -> 0x0048, JSONException -> 0x0046, all -> 0x0043 }
                r2.close()     // Catch:{ IOException -> 0x005a }
                goto L_0x005a
            L_0x0043:
                r10 = move-exception
                r4 = r2
                goto L_0x004b
            L_0x0046:
                r4 = r2
                goto L_0x0051
            L_0x0048:
                r4 = r2
                goto L_0x0057
            L_0x004a:
                r10 = move-exception
            L_0x004b:
                if (r4 == 0) goto L_0x0050
                r4.close()     // Catch:{ IOException -> 0x0050 }
            L_0x0050:
                throw r10
            L_0x0051:
                if (r4 == 0) goto L_0x005a
            L_0x0053:
                r4.close()     // Catch:{ IOException -> 0x005a }
                goto L_0x005a
            L_0x0057:
                if (r4 == 0) goto L_0x005a
                goto L_0x0053
            L_0x005a:
                if (r0 == 0) goto L_0x0067
                int r10 = r0.length
            L_0x005d:
                if (r1 >= r10) goto L_0x0067
                r2 = r0[r1]
                r2.delete()
                int r1 = r1 + 1
                goto L_0x005d
            L_0x0067:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p496x.p497a.p498a.p499a.p500a.p505g.C7688b.C7690b.mo33207k(c.x.a.a.a.a.f.e):void");
        }
    }

    /* renamed from: c.x.a.a.a.a.g.b$c */
    public static final class C7691c extends C7688b {

        /* renamed from: d */
        public C7669e f14454d;

        public C7691c() {
        }

        /* renamed from: b */
        public C7669e mo33200b() {
            return this.f14454d;
        }

        /* renamed from: g */
        public void mo33203g(C7669e eVar) {
            this.f14454d = eVar;
        }
    }

    /* renamed from: a */
    public static List<String> m21766a() {
        if (f14451c == null) {
            String d = m21767d("log.tag.httpdns");
            String str = f14449a;
            C7708a.m21818b(str, "httpdns flag: " + d);
            if ("SIT".equals(d)) {
                f14451c = new String[]{"10.18.217.70", "10.18.217.71"};
            } else if ("UT".equals(d)) {
                f14451c = new String[]{"10.18.210.145", "10.18.210.156"};
            } else {
                f14451c = new String[]{"118.178.149.42", "139.217.11.211"};
            }
            String str2 = f14449a;
            C7708a.m21818b(str2, "Default gslb ips: " + Arrays.toString(f14451c));
        }
        return Arrays.asList(f14451c);
    }

    /* renamed from: d */
    public static final String m21767d(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        } catch (Exception e) {
            C7708a.m21821e(f14449a, e, "getProp");
            return "";
        }
    }

    /* renamed from: e */
    public static final C7688b m21768e(File file) {
        if (file != null && file.exists() && file.isDirectory()) {
            try {
                return new C7690b(file);
            } catch (Exception e) {
                C7708a.m21821e(f14449a, e, "create FileImpl error! ");
            }
        }
        return new C7691c();
    }

    /* renamed from: b */
    public abstract C7669e mo33200b();

    /* renamed from: c */
    public final List<String> mo33201c() {
        List<String> list;
        ArrayList arrayList;
        synchronized (f14450b) {
            C7669e b = mo33200b();
            if (b == null) {
                list = m21766a();
            } else {
                list = b.mo33147g();
                if (list.isEmpty()) {
                    list = m21766a();
                }
            }
            arrayList = new ArrayList(list.size() + 1);
            arrayList.addAll(list);
            arrayList.add("lbgs.hismarttv.com");
        }
        return arrayList;
    }

    /* renamed from: f */
    public final void mo33202f(C7669e eVar) {
        synchronized (f14450b) {
            mo33203g(eVar);
        }
    }

    /* renamed from: g */
    public abstract void mo33203g(C7669e eVar);
}
