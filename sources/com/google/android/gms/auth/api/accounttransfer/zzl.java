package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p267b.p268a.p269d.C3230a;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public final class zzl extends zzaz {
    public static final Parcelable.Creator<zzl> CREATOR = new C3230a();

    /* renamed from: p */
    public static final HashMap<String, FastJsonResponse.Field<?, ?>> f7990p;

    /* renamed from: e */
    public final Set<Integer> f7991e;

    /* renamed from: l */
    public final int f7992l;

    /* renamed from: m */
    public ArrayList<zzr> f7993m;

    /* renamed from: n */
    public int f7994n;

    /* renamed from: o */
    public zzo f7995o;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f7990p = hashMap;
        hashMap.put("authenticatorData", FastJsonResponse.Field.m10992R("authenticatorData", 2, zzr.class));
        f7990p.put(NotificationCompat.CATEGORY_PROGRESS, FastJsonResponse.Field.m10991Q(NotificationCompat.CATEGORY_PROGRESS, 4, zzo.class));
    }

    public zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzo) {
        this.f7991e = set;
        this.f7992l = i;
        this.f7993m = arrayList;
        this.f7994n = i2;
        this.f7995o = zzo;
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo24326a() {
        return f7990p;
    }

    /* renamed from: b */
    public final Object mo24327b(FastJsonResponse.Field field) {
        int V = field.mo24628V();
        if (V == 1) {
            return Integer.valueOf(this.f7992l);
        }
        if (V == 2) {
            return this.f7993m;
        }
        if (V == 4) {
            return this.f7995o;
        }
        int V2 = field.mo24628V();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(V2);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public final boolean mo24328d(FastJsonResponse.Field field) {
        return this.f7991e.contains(Integer.valueOf(field.mo24628V()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        Set<Integer> set = this.f7991e;
        if (set.contains(1)) {
            C3514a.m8963l(parcel, 1, this.f7992l);
        }
        if (set.contains(2)) {
            C3514a.m8974w(parcel, 2, this.f7993m, true);
        }
        if (set.contains(3)) {
            C3514a.m8963l(parcel, 3, this.f7994n);
        }
        if (set.contains(4)) {
            C3514a.m8968q(parcel, 4, this.f7995o, i, true);
        }
        C3514a.m8953b(parcel, a);
    }

    public zzl() {
        this.f7991e = new HashSet(1);
        this.f7992l = 1;
    }
}
