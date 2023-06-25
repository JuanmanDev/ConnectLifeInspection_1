package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.test.internal.runner.RunnerArgs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p040c.p200q.p363c.C6331h;

/* renamed from: c.q.a.c.g.g.cp */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4352cp {

    /* renamed from: a */
    public static final Map f9157a = new ArrayMap();

    /* renamed from: b */
    public static final Map f9158b = new ArrayMap();

    @NonNull
    /* renamed from: a */
    public static String m11804a(String str) {
        C4298ap apVar;
        synchronized (f9157a) {
            apVar = (C4298ap) f9157a.get(str);
        }
        if (apVar != null) {
            return m11810g(apVar.mo25804b(), apVar.mo25803a(), apVar.mo25804b().contains(RunnerArgs.CLASSPATH_SEPARATOR)).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    @NonNull
    /* renamed from: b */
    public static String m11805b(String str) {
        C4298ap apVar;
        synchronized (f9157a) {
            apVar = (C4298ap) f9157a.get(str);
        }
        return (apVar != null ? "".concat(m11810g(apVar.mo25804b(), apVar.mo25803a(), apVar.mo25804b().contains(RunnerArgs.CLASSPATH_SEPARATOR))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    @NonNull
    /* renamed from: c */
    public static String m11806c(String str) {
        C4298ap apVar;
        synchronized (f9157a) {
            apVar = (C4298ap) f9157a.get(str);
        }
        return (apVar != null ? "".concat(m11810g(apVar.mo25804b(), apVar.mo25803a(), apVar.mo25804b().contains(RunnerArgs.CLASSPATH_SEPARATOR))) : "https://").concat("identitytoolkit.googleapis.com/v2");
    }

    @NonNull
    /* renamed from: d */
    public static String m11807d(String str) {
        C4298ap apVar;
        synchronized (f9157a) {
            apVar = (C4298ap) f9157a.get(str);
        }
        return (apVar != null ? "".concat(m11810g(apVar.mo25804b(), apVar.mo25803a(), apVar.mo25804b().contains(RunnerArgs.CLASSPATH_SEPARATOR))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    /* renamed from: e */
    public static void m11808e(String str, C4325bp bpVar) {
        synchronized (f9158b) {
            if (f9158b.containsKey(str)) {
                ((List) f9158b.get(str)).add(new WeakReference(bpVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(bpVar));
                f9158b.put(str, arrayList);
            }
        }
    }

    /* renamed from: f */
    public static boolean m11809f(@NonNull C6331h hVar) {
        return f9157a.containsKey(hVar.mo30406o().mo30419b());
    }

    /* renamed from: g */
    public static String m11810g(String str, int i, boolean z) {
        if (z) {
            return "http://[" + str + "]:" + i + "/";
        }
        return "http://" + str + RunnerArgs.CLASSPATH_SEPARATOR + i + "/";
    }
}
