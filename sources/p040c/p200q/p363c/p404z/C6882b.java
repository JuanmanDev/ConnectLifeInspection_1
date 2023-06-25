package p040c.p200q.p363c.p404z;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p369m.C6442p;
import p040c.p200q.p363c.p369m.C6448s;

/* renamed from: c.q.c.z.b */
/* compiled from: ComponentMonitor */
public class C6882b implements C6448s {
    /* renamed from: b */
    public static /* synthetic */ Object m19554b(String str, C6439o oVar, C6442p pVar) {
        try {
            C6883c.m19557b(str);
            return oVar.mo30541d().mo30442a(pVar);
        } finally {
            C6883c.m19556a();
        }
    }

    /* renamed from: a */
    public List<C6439o<?>> mo30539a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C6439o next : componentRegistrar.getComponents()) {
            String e = next.mo30542e();
            if (e != null) {
                next = next.mo30548p(new C6881a(e, next));
            }
            arrayList.add(next);
        }
        return arrayList;
    }
}
