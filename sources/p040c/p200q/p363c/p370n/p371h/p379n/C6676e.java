package p040c.p200q.p363c.p370n.p371h.p379n;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6539t;
import p040c.p200q.p363c.p370n.p371h.p375k.C6567i;
import p040c.p200q.p363c.p370n.p371h.p376l.C6591a0;
import p040c.p200q.p363c.p370n.p371h.p376l.p377c0.C6608g;
import p040c.p200q.p363c.p370n.p371h.p381p.C6696i;

/* renamed from: c.q.c.n.h.n.e */
/* compiled from: CrashlyticsReportPersistence */
public class C6676e {

    /* renamed from: d */
    public static final Charset f12754d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final int f12755e = 15;

    /* renamed from: f */
    public static final C6608g f12756f = new C6608g();

    /* renamed from: g */
    public static final Comparator<? super File> f12757g = C6674c.f12752e;

    /* renamed from: h */
    public static final FilenameFilter f12758h = C6675d.f12753a;

    /* renamed from: a */
    public final AtomicInteger f12759a = new AtomicInteger(0);

    /* renamed from: b */
    public final C6677f f12760b;
    @NonNull

    /* renamed from: c */
    public final C6696i f12761c;

    public C6676e(C6677f fVar, C6696i iVar) {
        this.f12760b = fVar;
        this.f12761c = iVar;
    }

    /* renamed from: B */
    public static void m18856B(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f12754d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: C */
    public static void m18857C(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f12754d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m18859d(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public static int m18858b(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            C6677f.m18887s(next);
            size--;
        }
        return size;
    }

    /* renamed from: d */
    public static long m18859d(long j) {
        return j * 1000;
    }

    @NonNull
    /* renamed from: i */
    public static String m18860i(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        String str = z ? "_" : "";
        return NotificationCompat.CATEGORY_EVENT + format + str;
    }

    @NonNull
    /* renamed from: k */
    public static String m18861k(@NonNull String str) {
        return str.substring(0, f12755e);
    }

    /* renamed from: o */
    public static boolean m18862o(@NonNull String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && str.endsWith("_");
    }

    /* renamed from: p */
    public static boolean m18863p(@NonNull File file, @NonNull String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
    }

    /* renamed from: t */
    public static int m18866t(@NonNull File file, @NonNull File file2) {
        return m18861k(file.getName()).compareTo(m18861k(file2.getName()));
    }

    @NonNull
    /* renamed from: w */
    public static String m18867w(@NonNull File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f12754d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: A */
    public final int mo31263A(String str, int i) {
        List<File> p = this.f12760b.mo31295p(str, C6673b.f12751a);
        Collections.sort(p, C6672a.f12750e);
        return m18858b(p, i);
    }

    /* renamed from: a */
    public final SortedSet<String> mo31264a(@Nullable String str) {
        this.f12760b.mo31281b();
        SortedSet<String> l = mo31271l();
        if (str != null) {
            l.remove(str);
        }
        if (l.size() <= 8) {
            return l;
        }
        while (l.size() > 8) {
            String last = l.last();
            C6479f f = C6479f.m18125f();
            f.mo30641b("Removing session over cap: " + last);
            this.f12760b.mo31282c(last);
            l.remove(last);
        }
        return l;
    }

    /* renamed from: c */
    public final void mo31265c() {
        int i = this.f12761c.mo31323b().f12796a.f12805b;
        List<File> j = mo31270j();
        int size = j.size();
        if (size > i) {
            for (File delete : j.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: e */
    public void mo31266e() {
        mo31267f(this.f12760b.mo31292m());
        mo31267f(this.f12760b.mo31290k());
        mo31267f(this.f12760b.mo31287h());
    }

    /* renamed from: f */
    public final void mo31267f(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    /* renamed from: g */
    public void mo31268g(@Nullable String str, long j) {
        for (String next : mo31264a(str)) {
            C6479f f = C6479f.m18125f();
            f.mo30647i("Finalizing report for session " + next);
            mo31278y(next, j);
            this.f12760b.mo31282c(next);
        }
        mo31265c();
    }

    /* renamed from: h */
    public void mo31269h(String str, CrashlyticsReport.C8256d dVar) {
        File o = this.f12760b.mo31294o(str, "report");
        C6479f f = C6479f.m18125f();
        f.mo30641b("Writing native session report for " + str + " to file: " + o);
        mo31277x(o, dVar, str);
    }

    /* renamed from: j */
    public final List<File> mo31270j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f12760b.mo31290k());
        arrayList.addAll(this.f12760b.mo31287h());
        Collections.sort(arrayList, f12757g);
        List<File> m = this.f12760b.mo31292m();
        Collections.sort(m, f12757g);
        arrayList.addAll(m);
        return arrayList;
    }

    /* renamed from: l */
    public SortedSet<String> mo31271l() {
        return new TreeSet(this.f12760b.mo31283d()).descendingSet();
    }

    /* renamed from: m */
    public long mo31272m(String str) {
        return this.f12760b.mo31294o(str, "start-time").lastModified();
    }

    /* renamed from: n */
    public boolean mo31273n() {
        return !this.f12760b.mo31292m().isEmpty() || !this.f12760b.mo31290k().isEmpty() || !this.f12760b.mo31287h().isEmpty();
    }

    @NonNull
    /* renamed from: s */
    public List<C6539t> mo31274s() {
        List<File> j = mo31270j();
        ArrayList arrayList = new ArrayList();
        for (File next : j) {
            try {
                arrayList.add(C6539t.m18378a(f12756f.mo30999x(m18867w(next)), next.getName(), next));
            } catch (IOException e) {
                C6479f f = C6479f.m18125f();
                f.mo30650l("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: u */
    public void mo31275u(@NonNull CrashlyticsReport.C8260e.C8267d dVar, @NonNull String str, boolean z) {
        int i = this.f12761c.mo31323b().f12796a.f12804a;
        try {
            m18856B(this.f12760b.mo31294o(str, m18860i(this.f12759a.getAndIncrement(), z)), f12756f.mo30998b(dVar));
        } catch (IOException e) {
            C6479f f = C6479f.m18125f();
            f.mo30650l("Could not persist event for session " + str, e);
        }
        mo31263A(str, i);
    }

    /* renamed from: v */
    public void mo31276v(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.C8260e j = crashlyticsReport.mo30943j();
        if (j == null) {
            C6479f.m18125f().mo30641b("Could not get session for report");
            return;
        }
        String h = j.mo31032h();
        try {
            m18856B(this.f12760b.mo31294o(h, "report"), f12756f.mo31000y(crashlyticsReport));
            m18857C(this.f12760b.mo31294o(h, "start-time"), "", j.mo31035k());
        } catch (IOException e) {
            C6479f f = C6479f.m18125f();
            f.mo30642c("Could not persist report for session " + h, e);
        }
    }

    /* renamed from: x */
    public final void mo31277x(@NonNull File file, @NonNull CrashlyticsReport.C8256d dVar, @NonNull String str) {
        try {
            m18856B(this.f12760b.mo31286g(str), f12756f.mo31000y(f12756f.mo30999x(m18867w(file)).mo37426m(dVar)));
        } catch (IOException e) {
            C6479f f = C6479f.m18125f();
            f.mo30650l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: y */
    public final void mo31278y(String str, long j) {
        boolean z;
        List<File> p = this.f12760b.mo31295p(str, f12758h);
        if (p.isEmpty()) {
            C6479f.m18125f().mo30647i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = p.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f12756f.mo30997a(m18867w(next)));
                    if (z || m18862o(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    C6479f.m18125f().mo30650l("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C6479f.m18125f().mo30649k("Could not parse event files for session " + str);
            return;
        }
        mo31279z(this.f12760b.mo31294o(str, "report"), arrayList, j, z, C6567i.m18496i(str, this.f12760b));
    }

    /* renamed from: z */
    public final void mo31279z(@NonNull File file, @NonNull List<CrashlyticsReport.C8260e.C8267d> list, long j, boolean z, @Nullable String str) {
        File file2;
        try {
            CrashlyticsReport l = f12756f.mo30999x(m18867w(file)).mo37427n(j, z, str).mo37425l(C6591a0.m18552c(list));
            CrashlyticsReport.C8260e j2 = l.mo30943j();
            if (j2 != null) {
                if (z) {
                    file2 = this.f12760b.mo31289j(j2.mo31032h());
                } else {
                    file2 = this.f12760b.mo31291l(j2.mo31032h());
                }
                m18856B(file2, f12756f.mo31000y(l));
            }
        } catch (IOException e) {
            C6479f f = C6479f.m18125f();
            f.mo30650l("Could not synthesize final report file for " + file, e);
        }
    }
}
