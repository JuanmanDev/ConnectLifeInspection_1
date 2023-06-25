package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p267b.p268a.p269d.C3233d;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class zzt extends zzaz {
    public static final Parcelable.Creator<zzt> CREATOR = new C3233d();

    /* renamed from: r */
    public static final HashMap<String, FastJsonResponse.Field<?, ?>> f8010r;

    /* renamed from: e */
    public final Set<Integer> f8011e;

    /* renamed from: l */
    public final int f8012l;

    /* renamed from: m */
    public String f8013m;

    /* renamed from: n */
    public int f8014n;

    /* renamed from: o */
    public byte[] f8015o;

    /* renamed from: p */
    public PendingIntent f8016p;

    /* renamed from: q */
    public DeviceMetaData f8017q;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f8010r = hashMap;
        hashMap.put("accountType", FastJsonResponse.Field.m10994T("accountType", 2));
        f8010r.put(NotificationCompat.CATEGORY_STATUS, FastJsonResponse.Field.m10993S(NotificationCompat.CATEGORY_STATUS, 3));
        f8010r.put("transferBytes", FastJsonResponse.Field.m10990P("transferBytes", 4));
    }

    public zzt(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f8011e = set;
        this.f8012l = i;
        this.f8013m = str;
        this.f8014n = i2;
        this.f8015o = bArr;
        this.f8016p = pendingIntent;
        this.f8017q = deviceMetaData;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo24326a() {
        return f8010r;
    }

    /* renamed from: b */
    public Object mo24327b(FastJsonResponse.Field field) {
        int V = field.mo24628V();
        if (V == 1) {
            return Integer.valueOf(this.f8012l);
        }
        if (V == 2) {
            return this.f8013m;
        }
        if (V == 3) {
            return Integer.valueOf(this.f8014n);
        }
        if (V == 4) {
            return this.f8015o;
        }
        int V2 = field.mo24628V();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(V2);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public boolean mo24328d(FastJsonResponse.Field field) {
        return this.f8011e.contains(Integer.valueOf(field.mo24628V()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        Set<Integer> set = this.f8011e;
        if (set.contains(1)) {
            C3514a.m8963l(parcel, 1, this.f8012l);
        }
        if (set.contains(2)) {
            C3514a.m8970s(parcel, 2, this.f8013m, true);
        }
        if (set.contains(3)) {
            C3514a.m8963l(parcel, 3, this.f8014n);
        }
        if (set.contains(4)) {
            C3514a.m8957f(parcel, 4, this.f8015o, true);
        }
        if (set.contains(5)) {
            C3514a.m8968q(parcel, 5, this.f8016p, i, true);
        }
        if (set.contains(6)) {
            C3514a.m8968q(parcel, 6, this.f8017q, i, true);
        }
        C3514a.m8953b(parcel, a);
    }

    public zzt() {
        this.f8011e = new ArraySet(3);
        this.f8012l = 1;
    }
}
