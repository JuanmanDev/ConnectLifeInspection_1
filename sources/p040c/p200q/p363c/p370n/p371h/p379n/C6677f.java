package p040c.p200q.p363c.p370n.p371h.p379n;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p363c.p370n.p371h.C6479f;

/* renamed from: c.q.c.n.h.n.f */
/* compiled from: FileStore */
public class C6677f {

    /* renamed from: a */
    public final File f12762a;

    /* renamed from: b */
    public final File f12763b;

    /* renamed from: c */
    public final File f12764c;

    /* renamed from: d */
    public final File f12765d;

    /* renamed from: e */
    public final File f12766e;

    /* renamed from: f */
    public final File f12767f;

    public C6677f(Context context) {
        String str;
        this.f12762a = context.getFilesDir();
        if (m18890v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m18889u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(this.f12762a, str);
        m18885q(file);
        this.f12763b = file;
        File file2 = new File(this.f12763b, "open-sessions");
        m18885q(file2);
        this.f12764c = file2;
        File file3 = new File(this.f12763b, "reports");
        m18885q(file3);
        this.f12765d = file3;
        File file4 = new File(this.f12763b, "priority-reports");
        m18885q(file4);
        this.f12766e = file4;
        File file5 = new File(this.f12763b, "native-reports");
        m18885q(file5);
        this.f12767f = file5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.io.File m18885q(java.io.File r4) {
        /*
            java.lang.Class<c.q.c.n.h.n.f> r0 = p040c.p200q.p363c.p370n.p371h.p379n.C6677f.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            c.q.c.n.h.f r1 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo30641b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            c.q.c.n.h.f r1 = p040c.p200q.p363c.p370n.p371h.C6479f.m18125f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo30643d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p363c.p370n.p371h.p379n.C6677f.m18885q(java.io.File):java.io.File");
    }

    /* renamed from: r */
    public static File m18886r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    public static boolean m18887s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File s : listFiles) {
                m18887s(s);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    public static <T> List<T> m18888t(@Nullable T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @VisibleForTesting
    /* renamed from: u */
    public static String m18889u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: v */
    public static boolean m18890v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: a */
    public final void mo31280a(File file) {
        if (file.exists() && m18887s(file)) {
            C6479f f = C6479f.m18125f();
            f.mo30641b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: b */
    public void mo31281b() {
        mo31280a(new File(this.f12762a, ".com.google.firebase.crashlytics"));
        mo31280a(new File(this.f12762a, ".com.google.firebase.crashlytics-ndk"));
        if (m18890v()) {
            mo31280a(new File(this.f12762a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean mo31282c(String str) {
        return m18887s(new File(this.f12764c, str));
    }

    /* renamed from: d */
    public List<String> mo31283d() {
        return m18888t(this.f12764c.list());
    }

    /* renamed from: e */
    public File mo31284e(String str) {
        return new File(this.f12763b, str);
    }

    /* renamed from: f */
    public List<File> mo31285f(FilenameFilter filenameFilter) {
        return m18888t(this.f12763b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File mo31286g(String str) {
        return new File(this.f12767f, str);
    }

    /* renamed from: h */
    public List<File> mo31287h() {
        return m18888t(this.f12767f.listFiles());
    }

    /* renamed from: i */
    public File mo31288i(String str) {
        File file = new File(mo31293n(str), "native");
        m18886r(file);
        return file;
    }

    /* renamed from: j */
    public File mo31289j(String str) {
        return new File(this.f12766e, str);
    }

    /* renamed from: k */
    public List<File> mo31290k() {
        return m18888t(this.f12766e.listFiles());
    }

    /* renamed from: l */
    public File mo31291l(String str) {
        return new File(this.f12765d, str);
    }

    /* renamed from: m */
    public List<File> mo31292m() {
        return m18888t(this.f12765d.listFiles());
    }

    /* renamed from: n */
    public final File mo31293n(String str) {
        File file = new File(this.f12764c, str);
        m18886r(file);
        return file;
    }

    /* renamed from: o */
    public File mo31294o(String str, String str2) {
        return new File(mo31293n(str), str2);
    }

    /* renamed from: p */
    public List<File> mo31295p(String str, FilenameFilter filenameFilter) {
        return m18888t(mo31293n(str).listFiles(filenameFilter));
    }
}
