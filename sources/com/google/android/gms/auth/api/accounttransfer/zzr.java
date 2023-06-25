package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p040c.p200q.p201a.p264c.p267b.p268a.p269d.C3232c;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class zzr extends zzaz {
    public static final Parcelable.Creator<zzr> CREATOR = new C3232c();

    /* renamed from: q */
    public static final HashMap<String, FastJsonResponse.Field<?, ?>> f8003q;

    /* renamed from: e */
    public final Set<Integer> f8004e;

    /* renamed from: l */
    public final int f8005l;

    /* renamed from: m */
    public zzt f8006m;

    /* renamed from: n */
    public String f8007n;

    /* renamed from: o */
    public String f8008o;

    /* renamed from: p */
    public String f8009p;

    static {
        HashMap<String, FastJsonResponse.Field<?, ?>> hashMap = new HashMap<>();
        f8003q = hashMap;
        hashMap.put("authenticatorInfo", FastJsonResponse.Field.m10991Q("authenticatorInfo", 2, zzt.class));
        f8003q.put("signature", FastJsonResponse.Field.m10994T("signature", 3));
        f8003q.put(RunnerArgs.ARGUMENT_TEST_PACKAGE, FastJsonResponse.Field.m10994T(RunnerArgs.ARGUMENT_TEST_PACKAGE, 4));
    }

    public zzr() {
        this.f8004e = new HashSet(3);
        this.f8005l = 1;
    }

    /* renamed from: a */
    public /* synthetic */ Map mo24326a() {
        return f8003q;
    }

    /* renamed from: b */
    public Object mo24327b(FastJsonResponse.Field field) {
        int V = field.mo24628V();
        if (V == 1) {
            return Integer.valueOf(this.f8005l);
        }
        if (V == 2) {
            return this.f8006m;
        }
        if (V == 3) {
            return this.f8007n;
        }
        if (V == 4) {
            return this.f8008o;
        }
        int V2 = field.mo24628V();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(V2);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public boolean mo24328d(FastJsonResponse.Field field) {
        return this.f8004e.contains(Integer.valueOf(field.mo24628V()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        Set<Integer> set = this.f8004e;
        if (set.contains(1)) {
            C3514a.m8963l(parcel, 1, this.f8005l);
        }
        if (set.contains(2)) {
            C3514a.m8968q(parcel, 2, this.f8006m, i, true);
        }
        if (set.contains(3)) {
            C3514a.m8970s(parcel, 3, this.f8007n, true);
        }
        if (set.contains(4)) {
            C3514a.m8970s(parcel, 4, this.f8008o, true);
        }
        if (set.contains(5)) {
            C3514a.m8970s(parcel, 5, this.f8009p, true);
        }
        C3514a.m8953b(parcel, a);
    }

    public zzr(Set<Integer> set, int i, zzt zzt, String str, String str2, String str3) {
        this.f8004e = set;
        this.f8005l = i;
        this.f8006m = zzt;
        this.f8007n = str;
        this.f8008o = str2;
        this.f8009p = str3;
    }
}
