package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: c.q.a.c.g.i.l8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5159l8 {

    /* renamed from: d */
    public static final C5159l8 f9990d = new C5159l8(true);

    /* renamed from: a */
    public final C5281ta f9991a = new C5129ja(16);

    /* renamed from: b */
    public boolean f9992b;

    /* renamed from: c */
    public boolean f9993c;

    public C5159l8() {
    }

    /* renamed from: a */
    public static C5159l8 m14438a() {
        throw null;
    }

    /* renamed from: d */
    public static final void m14439d(C5143k8 k8Var, Object obj) {
        boolean z;
        zzne a = k8Var.mo27358a();
        C5369z8.m15425e(obj);
        zzne zzne = zzne.DOUBLE;
        zznf zznf = zznf.INT;
        switch (a.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzje) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C5295u9) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(k8Var.zza()), k8Var.mo27358a().zza(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo27396b() {
        if (!this.f9992b) {
            for (int i = 0; i < this.f9991a.mo27728b(); i++) {
                Map.Entry g = this.f9991a.mo27735g(i);
                if (g.getValue() instanceof C5279t8) {
                    ((C5279t8) g.getValue()).mo27720s();
                }
            }
            this.f9991a.mo27352a();
            this.f9992b = true;
        }
    }

    /* renamed from: c */
    public final void mo27397c(C5143k8 k8Var, Object obj) {
        if (!k8Var.mo27359b()) {
            m14439d(k8Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m14439d(k8Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f9991a.put(k8Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C5159l8 l8Var = new C5159l8();
        for (int i = 0; i < this.f9991a.mo27728b(); i++) {
            Map.Entry g = this.f9991a.mo27735g(i);
            l8Var.mo27397c((C5143k8) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f9991a.mo27729c()) {
            l8Var.mo27397c((C5143k8) entry.getKey(), entry.getValue());
        }
        l8Var.f9993c = this.f9993c;
        return l8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5159l8)) {
            return false;
        }
        return this.f9991a.equals(((C5159l8) obj).f9991a);
    }

    public final int hashCode() {
        return this.f9991a.hashCode();
    }

    public C5159l8(boolean z) {
        mo27396b();
        mo27396b();
    }
}
