package p040c.p472t.p473a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.t.a.g */
/* compiled from: PermissionApi */
public final class C7571g {

    /* renamed from: a */
    public static final C7573i f14272a;

    static {
        if (C7565b.m21448f()) {
            f14272a = new C7581q();
        } else if (C7565b.m21447e()) {
            f14272a = new C7580p();
        } else if (C7565b.m21446d()) {
            f14272a = new C7579o();
        } else if (C7565b.m21445c()) {
            f14272a = new C7578n();
        } else if (C7565b.m21454l()) {
            f14272a = new C7577m();
        } else if (C7565b.m21453k()) {
            f14272a = new C7576l();
        } else if (C7565b.m21452j()) {
            f14272a = new C7575k();
        } else {
            f14272a = new C7574j();
        }
    }

    /* renamed from: a */
    public static boolean m21460a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String j : list) {
                if (m21469j(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static List<String> m21461b(List<String> list, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == -1) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<String> m21462c(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (String next : list) {
            if (m21465f(context, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List<String> m21463d(List<String> list, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == 0) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static Intent m21464e(Context context, String str) {
        return f14272a.mo33037b(context, str);
    }

    /* renamed from: f */
    public static boolean m21465f(Context context, String str) {
        return f14272a.mo33038c(context, str);
    }

    /* renamed from: g */
    public static boolean m21466g(Context context, List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (String f : list) {
            if (!m21465f(context, f)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m21467h(Activity activity, String str) {
        return f14272a.mo33036a(activity, str);
    }

    /* renamed from: i */
    public static boolean m21468i(Activity activity, List<String> list) {
        for (String h : list) {
            if (m21467h(activity, h)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m21469j(String str) {
        return C7584t.m21546p(str);
    }
}
