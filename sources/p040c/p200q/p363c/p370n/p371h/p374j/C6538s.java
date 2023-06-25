package p040c.p200q.p363c.p370n.p371h.p374j;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p040c.p200q.p363c.p370n.p371h.p376l.C6591a0;
import p040c.p200q.p363c.p370n.p371h.p382q.C6703d;
import p040c.p200q.p363c.p370n.p371h.p382q.C6704e;

/* renamed from: c.q.c.n.h.j.s */
/* compiled from: CrashlyticsReportDataCapture */
public class C6538s {

    /* renamed from: e */
    public static final Map<String, Integer> f12322e;

    /* renamed from: f */
    public static final String f12323f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.3.2"});

    /* renamed from: a */
    public final Context f12324a;

    /* renamed from: b */
    public final C6549z f12325b;

    /* renamed from: c */
    public final C6504h f12326c;

    /* renamed from: d */
    public final C6703d f12327d;

    static {
        HashMap hashMap = new HashMap();
        f12322e = hashMap;
        hashMap.put("armeabi", 5);
        f12322e.put("armeabi-v7a", 6);
        f12322e.put("arm64-v8a", 9);
        f12322e.put("x86", 0);
        f12322e.put("x86_64", 1);
    }

    public C6538s(Context context, C6549z zVar, C6504h hVar, C6703d dVar) {
        this.f12324a = context;
        this.f12325b = zVar;
        this.f12326c = hVar;
        this.f12327d = dVar;
    }

    /* renamed from: e */
    public static int m18354e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f12322e.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: a */
    public final CrashlyticsReport.C8253b mo30780a() {
        CrashlyticsReport.C8253b b = CrashlyticsReport.m22739b();
        b.mo30953h("18.3.2");
        b.mo30949d(this.f12326c.f12212a);
        b.mo30950e(this.f12325b.mo30654a());
        b.mo30947b(this.f12326c.f12216e);
        b.mo30948c(this.f12326c.f12217f);
        b.mo30952g(4);
        return b;
    }

    /* renamed from: b */
    public CrashlyticsReport.C8260e.C8267d mo30781b(CrashlyticsReport.C8251a aVar) {
        int i = this.f12324a.getResources().getConfiguration().orientation;
        CrashlyticsReport.C8260e.C8267d.C8282b a = CrashlyticsReport.C8260e.C8267d.m22862a();
        a.mo31109f("anr");
        a.mo31108e(aVar.mo30983h());
        a.mo31105b(mo30786h(i, aVar));
        a.mo31106c(mo30788j(i));
        return a.mo31104a();
    }

    /* renamed from: c */
    public CrashlyticsReport.C8260e.C8267d mo30782c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f12324a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        C6704e eVar = new C6704e(th, this.f12327d);
        CrashlyticsReport.C8260e.C8267d.C8282b a = CrashlyticsReport.C8260e.C8267d.m22862a();
        String str2 = str;
        a.mo31109f(str);
        long j2 = j;
        a.mo31108e(j);
        a.mo31105b(mo30787i(i3, eVar, thread, i, i2, z));
        a.mo31106c(mo30788j(i3));
        return a.mo31104a();
    }

    /* renamed from: d */
    public CrashlyticsReport mo30783d(String str, long j) {
        CrashlyticsReport.C8253b a = mo30780a();
        a.mo30954i(mo30796r(str, j));
        return a.mo30946a();
    }

    /* renamed from: f */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a mo30784f() {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.C8272a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a.m22888a();
        a.mo31147b(0);
        a.mo31149d(0);
        a.mo31148c(this.f12326c.f12215d);
        a.mo31150e(this.f12326c.f12213b);
        return a.mo31146a();
    }

    /* renamed from: g */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8271a> mo30785g() {
        return C6591a0.m18553f(mo30784f());
    }

    /* renamed from: h */
    public final CrashlyticsReport.C8260e.C8267d.C8268a mo30786h(int i, CrashlyticsReport.C8251a aVar) {
        boolean z = aVar.mo30976b() != 100;
        CrashlyticsReport.C8260e.C8267d.C8268a.C8269a a = CrashlyticsReport.C8260e.C8267d.C8268a.m22869a();
        a.mo31120b(Boolean.valueOf(z));
        a.mo31124f(i);
        a.mo31122d(mo30791m(aVar));
        return a.mo31119a();
    }

    /* renamed from: i */
    public final CrashlyticsReport.C8260e.C8267d.C8268a mo30787i(int i, C6704e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j = C6513n.m18232j(this.f12326c.f12215d, this.f12324a);
        if (j != null) {
            bool = Boolean.valueOf(j.importance != 100);
        } else {
            bool = null;
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8269a a = CrashlyticsReport.C8260e.C8267d.C8268a.m22869a();
        a.mo31120b(bool);
        a.mo31124f(i);
        a.mo31122d(mo30792n(eVar, thread, i2, i3, z));
        return a.mo31119a();
    }

    /* renamed from: j */
    public final CrashlyticsReport.C8260e.C8267d.C8283c mo30788j(int i) {
        C6510k a = C6510k.m18205a(this.f12324a);
        Float b = a.mo30690b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.mo30691c();
        boolean o = C6513n.m18237o(this.f12324a);
        long s = C6513n.m18241s() - C6513n.m18223a(this.f12324a);
        long b2 = C6513n.m18224b(Environment.getDataDirectory().getPath());
        CrashlyticsReport.C8260e.C8267d.C8283c.C8284a a2 = CrashlyticsReport.C8260e.C8267d.C8283c.m22952a();
        a2.mo31209b(valueOf);
        a2.mo31210c(c);
        a2.mo31213f(o);
        a2.mo31212e(i);
        a2.mo31214g(s);
        a2.mo31211d(b2);
        return a2.mo31208a();
    }

    /* renamed from: k */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c mo30789k(C6704e eVar, int i, int i2) {
        return mo30790l(eVar, i, i2, 0);
    }

    /* renamed from: l */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c mo30790l(C6704e eVar, int i, int i2, int i3) {
        String str = eVar.f12836b;
        String str2 = eVar.f12835a;
        StackTraceElement[] stackTraceElementArr = eVar.f12837c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C6704e eVar2 = eVar.f12838d;
        if (i3 >= i2) {
            C6704e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f12838d;
                i4++;
            }
        }
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.C8275a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8274c.m22906a();
        a.mo31164f(str);
        a.mo31163e(str2);
        a.mo31161c(C6591a0.m18552c(mo30794p(stackTraceElementArr, i)));
        a.mo31162d(i4);
        if (eVar2 != null && i4 == 0) {
            a.mo31160b(mo30790l(eVar2, i, i2, i3 + 1));
        }
        return a.mo31159a();
    }

    /* renamed from: m */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b mo30791m(CrashlyticsReport.C8251a aVar) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.m22882a();
        a.mo31134b(aVar);
        a.mo31137e(mo30799u());
        a.mo31135c(mo30785g());
        return a.mo31133a();
    }

    /* renamed from: n */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b mo30792n(C6704e eVar, Thread thread, int i, int i2, boolean z) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8273b a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.m22882a();
        a.mo31138f(mo30802x(eVar, thread, i, z));
        a.mo31136d(mo30789k(eVar, i, i2));
        a.mo31137e(mo30799u());
        a.mo31135c(mo30785g());
        return a.mo31133a();
    }

    /* renamed from: o */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b mo30793o(StackTraceElement stackTraceElement, CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a aVar) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + MAPCookie.DOT + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = (long) stackTraceElement.getLineNumber();
        }
        aVar.mo31197e(max);
        aVar.mo31198f(str);
        aVar.mo31194b(fileName);
        aVar.mo31196d(j);
        return aVar.mo31193a();
    }

    /* renamed from: p */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b> mo30794p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement o : stackTraceElementArr) {
            CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.C8281a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8280b.m22934a();
            a.mo31195c(i);
            arrayList.add(mo30793o(o, a));
        }
        return C6591a0.m18552c(arrayList);
    }

    /* renamed from: q */
    public final CrashlyticsReport.C8260e.C8261a mo30795q() {
        CrashlyticsReport.C8260e.C8261a.C8262a a = CrashlyticsReport.C8260e.C8261a.m22813a();
        a.mo31066e(this.f12325b.mo30818f());
        a.mo31068g(this.f12326c.f12216e);
        a.mo31065d(this.f12326c.f12217f);
        a.mo31067f(this.f12325b.mo30654a());
        a.mo31063b(this.f12326c.f12218g.mo30637d());
        a.mo31064c(this.f12326c.f12218g.mo30638e());
        return a.mo31062a();
    }

    /* renamed from: r */
    public final CrashlyticsReport.C8260e mo30796r(String str, long j) {
        CrashlyticsReport.C8260e.C8264b a = CrashlyticsReport.C8260e.m22797a();
        a.mo31050l(j);
        a.mo31048i(str);
        a.mo31046g(f12323f);
        a.mo31041b(mo30795q());
        a.mo31049k(mo30798t());
        a.mo31043d(mo30797s());
        a.mo31047h(3);
        return a.mo31040a();
    }

    /* renamed from: s */
    public final CrashlyticsReport.C8260e.C8265c mo30797s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e = m18354e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = C6513n.m18241s();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean y = C6513n.m18247y();
        int m = C6513n.m18235m();
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        CrashlyticsReport.C8260e.C8265c.C8266a a = CrashlyticsReport.C8260e.C8265c.m22842a();
        a.mo31086b(e);
        a.mo31090f(Build.MODEL);
        a.mo31087c(availableProcessors);
        a.mo31092h(s);
        a.mo31088d(blockCount);
        a.mo31093i(y);
        a.mo31094j(m);
        a.mo31089e(str);
        a.mo31091g(str2);
        return a.mo31085a();
    }

    /* renamed from: t */
    public final CrashlyticsReport.C8260e.C8287e mo30798t() {
        CrashlyticsReport.C8260e.C8287e.C8288a a = CrashlyticsReport.C8260e.C8287e.m22970a();
        a.mo31231d(3);
        a.mo31232e(Build.VERSION.RELEASE);
        a.mo31229b(Build.VERSION.CODENAME);
        a.mo31230c(C6513n.m18248z());
        return a.mo31228a();
    }

    /* renamed from: u */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d mo30799u() {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.C8277a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8276d.m22918a();
        a.mo31174d("0");
        a.mo31173c("0");
        a.mo31172b(0);
        return a.mo31171a();
    }

    /* renamed from: v */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e mo30800v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return mo30801w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    public final CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e mo30801w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.C8279a a = CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e.m22926a();
        a.mo31184d(thread.getName());
        a.mo31183c(i);
        a.mo31182b(C6591a0.m18552c(mo30794p(stackTraceElementArr, i)));
        return a.mo31181a();
    }

    /* renamed from: x */
    public final C6591a0<CrashlyticsReport.C8260e.C8267d.C8268a.C8270b.C8278e> mo30802x(C6704e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo30801w(thread, eVar.f12837c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(mo30800v(thread2, this.f12327d.mo31333a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return C6591a0.m18552c(arrayList);
    }
}
