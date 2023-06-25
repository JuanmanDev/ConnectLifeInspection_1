package p040c.p472t.p473a;

import android.app.Activity;
import android.content.Context;
import androidx.core.view.InputDeviceCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.t.a.u */
/* compiled from: XXPermissions */
public final class C7585u {

    /* renamed from: e */
    public static C7566c f14278e;

    /* renamed from: f */
    public static Boolean f14279f;

    /* renamed from: a */
    public final Context f14280a;

    /* renamed from: b */
    public List<String> f14281b;

    /* renamed from: c */
    public C7566c f14282c;

    /* renamed from: d */
    public Boolean f14283d;

    /* renamed from: c.t.a.u$a */
    /* compiled from: XXPermissions */
    public static class C7586a implements C7566c {
    }

    public C7585u(Context context) {
        this.f14280a = context;
    }

    /* renamed from: a */
    public static C7566c m21553a() {
        if (f14278e == null) {
            f14278e = new C7586a();
        }
        return f14278e;
    }

    /* renamed from: c */
    public static boolean m21554c(Context context, List<String> list) {
        return C7571g.m21466g(context, list);
    }

    /* renamed from: d */
    public static boolean m21555d(Context context, String... strArr) {
        return m21554c(context, C7584t.m21532b(strArr));
    }

    /* renamed from: e */
    public static boolean m21556e(Activity activity, List<String> list) {
        return C7571g.m21468i(activity, list);
    }

    /* renamed from: i */
    public static void m21557i(Activity activity, List<String> list) {
        m21558j(activity, list, InputDeviceCompat.SOURCE_GAMEPAD);
    }

    /* renamed from: j */
    public static void m21558j(Activity activity, List<String> list, int i) {
        activity.startActivityForResult(C7584t.m21542l(activity, list), i);
    }

    /* renamed from: k */
    public static void m21559k(Activity activity, String... strArr) {
        m21557i(activity, C7584t.m21532b(strArr));
    }

    /* renamed from: l */
    public static C7585u m21560l(Context context) {
        return new C7585u(context);
    }

    /* renamed from: b */
    public final boolean mo33040b() {
        if (this.f14283d == null) {
            if (f14279f == null) {
                f14279f = Boolean.valueOf(C7584t.m21544n(this.f14280a));
            }
            this.f14283d = f14279f;
        }
        return this.f14283d.booleanValue();
    }

    /* renamed from: f */
    public C7585u mo33041f(List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (this.f14281b == null) {
                this.f14281b = new ArrayList(list);
                return this;
            }
            for (String next : list) {
                if (!C7584t.m21534d(this.f14281b, next)) {
                    this.f14281b.add(next);
                }
            }
        }
        return this;
    }

    /* renamed from: g */
    public C7585u mo33042g(String... strArr) {
        mo33041f(C7584t.m21532b(strArr));
        return this;
    }

    /* renamed from: h */
    public void mo33043h(C7567d dVar) {
        if (this.f14280a != null) {
            if (this.f14282c == null) {
                this.f14282c = m21553a();
            }
            ArrayList arrayList = new ArrayList(this.f14281b);
            boolean b = mo33040b();
            Activity f = C7584t.m21536f(this.f14280a);
            if (C7572h.m21470a(f, b) && C7572h.m21476g(arrayList, b)) {
                if (b) {
                    C7572h.m21475f(this.f14280a, arrayList);
                    C7572h.m21478i(this.f14280a, arrayList);
                    C7572h.m21471b(arrayList);
                    C7572h.m21472c(this.f14280a, arrayList);
                    C7572h.m21477h(this.f14280a, arrayList);
                    C7572h.m21479j(this.f14280a, arrayList);
                    C7572h.m21474e(this.f14280a, arrayList);
                }
                C7572h.m21480k(arrayList);
                if (!C7571g.m21466g(this.f14280a, arrayList)) {
                    this.f14282c.mo33032b(f, arrayList, dVar);
                } else if (dVar != null) {
                    this.f14282c.mo33033c(f, arrayList, arrayList, true, dVar);
                }
            }
        }
    }
}
