package p040c.p200q.p201a.p264c.p340i.p342b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;
import p040c.p200q.p201a.p264c.p294g.p335i.C5181n0;
import p040c.p200q.p201a.p264c.p294g.p335i.C5211p0;

/* renamed from: c.q.a.c.i.b.v2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C5669v2 extends C5181n0 implements C5691x2 {
    public C5669v2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: B */
    public final List mo28447B(String str, String str2, String str3) {
        Parcel d = mo27444d();
        d.writeString((String) null);
        d.writeString(str2);
        d.writeString(str3);
        Parcel e = mo27445e(17, d);
        ArrayList<zzac> createTypedArrayList = e.createTypedArrayList(zzac.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: H */
    public final void mo28448H(zzaw zzaw, zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzaw);
        C5211p0.m14619e(d, zzq);
        mo27446g(1, d);
    }

    /* renamed from: I */
    public final void mo28449I(zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzq);
        mo27446g(4, d);
    }

    /* renamed from: J */
    public final List mo28450J(String str, String str2, zzq zzq) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14619e(d, zzq);
        Parcel e = mo27445e(16, d);
        ArrayList<zzac> createTypedArrayList = e.createTypedArrayList(zzac.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: L */
    public final void mo28451L(long j, String str, String str2, String str3) {
        Parcel d = mo27444d();
        d.writeLong(j);
        d.writeString(str);
        d.writeString(str2);
        d.writeString(str3);
        mo27446g(10, d);
    }

    /* renamed from: O */
    public final void mo28452O(zzaw zzaw, String str, String str2) {
        throw null;
    }

    /* renamed from: P */
    public final void mo28453P(zzkw zzkw, zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzkw);
        C5211p0.m14619e(d, zzq);
        mo27446g(2, d);
    }

    /* renamed from: S */
    public final void mo28454S(zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzq);
        mo27446g(20, d);
    }

    /* renamed from: T */
    public final List mo28455T(String str, String str2, boolean z, zzq zzq) {
        Parcel d = mo27444d();
        d.writeString(str);
        d.writeString(str2);
        C5211p0.m14618d(d, z);
        C5211p0.m14619e(d, zzq);
        Parcel e = mo27445e(14, d);
        ArrayList<zzkw> createTypedArrayList = e.createTypedArrayList(zzkw.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: V */
    public final void mo28456V(zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzq);
        mo27446g(18, d);
    }

    /* renamed from: W */
    public final void mo28457W(zzac zzac, zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzac);
        C5211p0.m14619e(d, zzq);
        mo27446g(12, d);
    }

    /* renamed from: l */
    public final void mo28464l(zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzq);
        mo27446g(6, d);
    }

    /* renamed from: n */
    public final void mo28465n(Bundle bundle, zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, bundle);
        C5211p0.m14619e(d, zzq);
        mo27446g(19, d);
    }

    /* renamed from: p */
    public final List mo28466p(String str, String str2, String str3, boolean z) {
        Parcel d = mo27444d();
        d.writeString((String) null);
        d.writeString(str2);
        d.writeString(str3);
        C5211p0.m14618d(d, z);
        Parcel e = mo27445e(15, d);
        ArrayList<zzkw> createTypedArrayList = e.createTypedArrayList(zzkw.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: q */
    public final void mo28467q(zzac zzac) {
        throw null;
    }

    /* renamed from: s */
    public final List mo28468s(zzq zzq, boolean z) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzq);
        C5211p0.m14618d(d, z);
        Parcel e = mo27445e(7, d);
        ArrayList<zzkw> createTypedArrayList = e.createTypedArrayList(zzkw.CREATOR);
        e.recycle();
        return createTypedArrayList;
    }

    /* renamed from: u */
    public final byte[] mo28469u(zzaw zzaw, String str) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzaw);
        d.writeString(str);
        Parcel e = mo27445e(9, d);
        byte[] createByteArray = e.createByteArray();
        e.recycle();
        return createByteArray;
    }

    /* renamed from: y */
    public final String mo28471y(zzq zzq) {
        Parcel d = mo27444d();
        C5211p0.m14619e(d, zzq);
        Parcel e = mo27445e(11, d);
        String readString = e.readString();
        e.recycle();
        return readString;
    }
}
