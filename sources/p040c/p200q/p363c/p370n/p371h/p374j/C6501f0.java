package p040c.p200q.p363c.p370n.p371h.p374j;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.facebook.stetho.dumpapp.plugins.CrashDumperPlugin;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p375k.C6554e;
import p040c.p200q.p363c.p370n.p371h.p375k.C6567i;
import p040c.p200q.p363c.p370n.p371h.p376l.C6591a0;
import p040c.p200q.p363c.p370n.p371h.p379n.C6676e;
import p040c.p200q.p363c.p370n.p371h.p379n.C6677f;
import p040c.p200q.p363c.p370n.p371h.p380o.C6681d;
import p040c.p200q.p363c.p370n.p371h.p381p.C6696i;
import p040c.p200q.p363c.p370n.p371h.p382q.C6703d;

/* renamed from: c.q.c.n.h.j.f0 */
/* compiled from: SessionReportingCoordinator */
public class C6501f0 {

    /* renamed from: a */
    public final C6538s f12206a;

    /* renamed from: b */
    public final C6676e f12207b;

    /* renamed from: c */
    public final C6681d f12208c;

    /* renamed from: d */
    public final C6554e f12209d;

    /* renamed from: e */
    public final C6567i f12210e;

    public C6501f0(C6538s sVar, C6676e eVar, C6681d dVar, C6554e eVar2, C6567i iVar) {
        this.f12206a = sVar;
        this.f12207b = eVar;
        this.f12208c = dVar;
        this.f12209d = eVar2;
        this.f12210e = iVar;
    }

    @RequiresApi(api = 30)
    /* renamed from: c */
    public static CrashlyticsReport.C8251a m18167c(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m18168d(traceInputStream);
            }
        } catch (IOException e) {
            C6479f f = C6479f.m18125f();
            f.mo30649k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        CrashlyticsReport.C8251a.C8252a a = CrashlyticsReport.C8251a.m22752a();
        a.mo30988b(applicationExitInfo.getImportance());
        a.mo30990d(applicationExitInfo.getProcessName());
        a.mo30992f(applicationExitInfo.getReason());
        a.mo30994h(applicationExitInfo.getTimestamp());
        a.mo30989c(applicationExitInfo.getPid());
        a.mo30991e(applicationExitInfo.getPss());
        a.mo30993g(applicationExitInfo.getRss());
        a.mo30995i(str);
        return a.mo30987a();
    }

    @RequiresApi(api = 19)
    @VisibleForTesting
    /* renamed from: d */
    public static String m18168d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: e */
    public static C6501f0 m18169e(Context context, C6549z zVar, C6677f fVar, C6504h hVar, C6554e eVar, C6567i iVar, C6703d dVar, C6696i iVar2, C6499e0 e0Var) {
        return new C6501f0(new C6538s(context, zVar, hVar, dVar), new C6676e(fVar, iVar2), C6681d.m18908a(context, iVar2, e0Var), eVar, iVar);
    }

    @NonNull
    /* renamed from: i */
    public static List<CrashlyticsReport.C8254c> m18170i(@NonNull Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            CrashlyticsReport.C8254c.C8255a a = CrashlyticsReport.C8254c.m22779a();
            a.mo31007b((String) next.getKey());
            a.mo31008c((String) next.getValue());
            arrayList.add(a.mo31006a());
        }
        Collections.sort(arrayList, C6494c.f12200e);
        return arrayList;
    }

    /* renamed from: a */
    public final CrashlyticsReport.C8260e.C8267d mo30663a(CrashlyticsReport.C8260e.C8267d dVar) {
        return mo30664b(dVar, this.f12209d, this.f12210e);
    }

    /* renamed from: b */
    public final CrashlyticsReport.C8260e.C8267d mo30664b(CrashlyticsReport.C8260e.C8267d dVar, C6554e eVar, C6567i iVar) {
        CrashlyticsReport.C8260e.C8267d.C8282b g = dVar.mo31101g();
        String c = eVar.mo30838c();
        if (c != null) {
            CrashlyticsReport.C8260e.C8267d.C8285d.C8286a a = CrashlyticsReport.C8260e.C8267d.C8285d.m22966a();
            a.mo31220b(c);
            g.mo31107d(a.mo31219a());
        } else {
            C6479f.m18125f().mo30647i("No log data to include with this event.");
        }
        List<CrashlyticsReport.C8254c> i = m18170i(iVar.mo30876d());
        List<CrashlyticsReport.C8254c> i2 = m18170i(iVar.mo30877e());
        if (!i.isEmpty() || !i2.isEmpty()) {
            CrashlyticsReport.C8260e.C8267d.C8268a.C8269a g2 = dVar.mo31095b().mo31116g();
            g2.mo31121c(C6591a0.m18552c(i));
            g2.mo31123e(C6591a0.m18552c(i2));
            g.mo31105b(g2.mo31119a());
        }
        return g.mo31104a();
    }

    /* renamed from: f */
    public void mo30665f(@NonNull String str, @NonNull List<C6495c0> list) {
        C6479f.m18125f().mo30641b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (C6495c0 b : list) {
            CrashlyticsReport.C8256d.C8258b b2 = b.mo30658b();
            if (b2 != null) {
                arrayList.add(b2);
            }
        }
        C6676e eVar = this.f12207b;
        CrashlyticsReport.C8256d.C8257a a = CrashlyticsReport.C8256d.m22785a();
        a.mo31015b(C6591a0.m18552c(arrayList));
        eVar.mo31269h(str, a.mo31014a());
    }

    /* renamed from: g */
    public void mo30666g(long j, @Nullable String str) {
        this.f12207b.mo31268g(str, j);
    }

    @RequiresApi(api = 30)
    @Nullable
    /* renamed from: h */
    public final ApplicationExitInfo mo30667h(String str, List<ApplicationExitInfo> list) {
        long m = this.f12207b.mo31272m(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < m) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo30668j() {
        return this.f12207b.mo31273n();
    }

    /* renamed from: l */
    public SortedSet<String> mo30669l() {
        return this.f12207b.mo31271l();
    }

    /* renamed from: m */
    public void mo30670m(@NonNull String str, long j) {
        this.f12207b.mo31276v(this.f12206a.mo30783d(str, j));
    }

    /* renamed from: n */
    public final boolean mo30671n(@NonNull C5771j<C6539t> jVar) {
        if (jVar.mo28856q()) {
            C6539t m = jVar.mo28852m();
            C6479f f = C6479f.m18125f();
            f.mo30641b("Crashlytics report successfully enqueued to DataTransport: " + m.mo30684d());
            File c = m.mo30683c();
            if (c.delete()) {
                C6479f f2 = C6479f.m18125f();
                f2.mo30641b("Deleted report file: " + c.getPath());
                return true;
            }
            C6479f f3 = C6479f.m18125f();
            f3.mo30649k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        C6479f.m18125f().mo30650l("Crashlytics report could not be enqueued to DataTransport", jVar.mo28851l());
        return false;
    }

    /* renamed from: o */
    public final void mo30672o(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, @NonNull String str2, long j, boolean z) {
        boolean equals = str2.equals(CrashDumperPlugin.NAME);
        CrashlyticsReport.C8260e.C8267d c = this.f12206a.mo30782c(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f12207b.mo31275u(mo30663a(c), str, equals);
    }

    /* renamed from: p */
    public void mo30673p(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        C6479f f = C6479f.m18125f();
        f.mo30647i("Persisting fatal event for session " + str);
        mo30672o(th, thread, str, CrashDumperPlugin.NAME, j, true);
    }

    /* renamed from: q */
    public void mo30674q(@NonNull Throwable th, @NonNull Thread thread, @NonNull String str, long j) {
        C6479f f = C6479f.m18125f();
        f.mo30647i("Persisting non-fatal event for session " + str);
        mo30672o(th, thread, str, "error", j, false);
    }

    @RequiresApi(api = 30)
    /* renamed from: r */
    public void mo30675r(String str, List<ApplicationExitInfo> list, C6554e eVar, C6567i iVar) {
        ApplicationExitInfo h = mo30667h(str, list);
        if (h == null) {
            C6479f f = C6479f.m18125f();
            f.mo30647i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        CrashlyticsReport.C8260e.C8267d b = this.f12206a.mo30781b(m18167c(h));
        C6479f f2 = C6479f.m18125f();
        f2.mo30641b("Persisting anr for session " + str);
        this.f12207b.mo31275u(mo30664b(b, eVar, iVar), str, true);
    }

    /* renamed from: s */
    public void mo30676s() {
        this.f12207b.mo31266e();
    }

    /* renamed from: t */
    public C5771j<Void> mo30677t(@NonNull Executor executor) {
        return mo30678u(executor, (String) null);
    }

    /* renamed from: u */
    public C5771j<Void> mo30678u(@NonNull Executor executor, @Nullable String str) {
        List<C6539t> s = this.f12207b.mo31274s();
        ArrayList arrayList = new ArrayList();
        for (C6539t next : s) {
            if (str == null || str.equals(next.mo30684d())) {
                arrayList.add(this.f12208c.mo31297b(next, str != null).mo28849j(executor, new C6502g(this)));
            }
        }
        return C5777m.m16415g(arrayList);
    }
}
