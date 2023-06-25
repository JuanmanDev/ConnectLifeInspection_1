package p040c.p200q.p363c.p367l.p368h;

import android.text.TextUtils;
import com.google.android.gms.internal.p527firebaseauthapi.zzaac;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;

/* renamed from: c.q.c.l.h.o */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C6392o {
    /* renamed from: a */
    public static MultiFactorInfo m17922a(zzaac zzaac) {
        if (zzaac == null || TextUtils.isEmpty(zzaac.mo33343T())) {
            return null;
        }
        String S = zzaac.mo33342S();
        String R = zzaac.mo33341R();
        long P = zzaac.mo33340P();
        String T = zzaac.mo33343T();
        C3495o.m8904f(T);
        return new PhoneMultiFactorInfo(S, R, P, T);
    }

    /* renamed from: b */
    public static List m17923b(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiFactorInfo a = m17922a((zzaac) it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }
}
