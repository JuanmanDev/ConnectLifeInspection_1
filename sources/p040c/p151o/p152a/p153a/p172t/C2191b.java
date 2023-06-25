package p040c.p151o.p152a.p153a.p172t;

import android.util.SparseArray;
import com.gigya.android.sdk.p309ui.HostActivity;
import com.gigya.android.sdk.p309ui.WebLoginActivity;
import p040c.p151o.p152a.p153a.p154i.p155d.C2109a;

/* renamed from: c.o.a.a.t.b */
/* compiled from: Presenter */
public class C2191b<A extends C2109a> implements C2190a<A> {

    /* renamed from: a */
    public static SparseArray<HostActivity.C3954a> f2176a = new SparseArray<>();

    /* renamed from: b */
    public static SparseArray<WebLoginActivity.C3957b> f2177b = new SparseArray<>();

    /* renamed from: a */
    public static int m3322a(HostActivity.C3954a aVar) {
        int hashCode = aVar.hashCode();
        f2176a.append(hashCode, aVar);
        return hashCode;
    }

    /* renamed from: b */
    public static int m3323b(WebLoginActivity.C3957b bVar) {
        int hashCode = bVar.hashCode();
        f2177b.append(hashCode, bVar);
        return hashCode;
    }

    /* renamed from: c */
    public static void m3324c(int i) {
        f2176a.remove(i);
    }

    /* renamed from: d */
    public static void m3325d(int i) {
        f2177b.remove(i);
    }

    /* renamed from: e */
    public static HostActivity.C3954a m3326e(int i) {
        return f2176a.get(i);
    }

    /* renamed from: f */
    public static WebLoginActivity.C3957b m3327f(int i) {
        return f2177b.get(i);
    }
}
