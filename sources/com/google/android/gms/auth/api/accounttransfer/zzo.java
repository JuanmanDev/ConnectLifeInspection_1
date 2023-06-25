package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p264c.p267b.p268a.p269d.C3231b;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class zzo extends zzaz {
    public static final Parcelable.Creator<zzo> CREATOR = new C3231b();

    /* renamed from: q */
    public static final ArrayMap<String, FastJsonResponse.Field<?, ?>> f7996q;

    /* renamed from: e */
    public final int f7997e;

    /* renamed from: l */
    public List<String> f7998l;

    /* renamed from: m */
    public List<String> f7999m;

    /* renamed from: n */
    public List<String> f8000n;

    /* renamed from: o */
    public List<String> f8001o;

    /* renamed from: p */
    public List<String> f8002p;

    static {
        ArrayMap<String, FastJsonResponse.Field<?, ?>> arrayMap = new ArrayMap<>();
        f7996q = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.m10995U("registered", 2));
        f7996q.put("in_progress", FastJsonResponse.Field.m10995U("in_progress", 3));
        f7996q.put("success", FastJsonResponse.Field.m10995U("success", 4));
        f7996q.put("failed", FastJsonResponse.Field.m10995U("failed", 5));
        f7996q.put("escrowed", FastJsonResponse.Field.m10995U("escrowed", 6));
    }

    public zzo() {
        this.f7997e = 1;
    }

    /* renamed from: a */
    public Map<String, FastJsonResponse.Field<?, ?>> mo24326a() {
        return f7996q;
    }

    /* renamed from: b */
    public Object mo24327b(FastJsonResponse.Field field) {
        switch (field.mo24628V()) {
            case 1:
                return Integer.valueOf(this.f7997e);
            case 2:
                return this.f7998l;
            case 3:
                return this.f7999m;
            case 4:
                return this.f8000n;
            case 5:
                return this.f8001o;
            case 6:
                return this.f8002p;
            default:
                int V = field.mo24628V();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(V);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: d */
    public boolean mo24328d(FastJsonResponse.Field field) {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f7997e);
        C3514a.m8972u(parcel, 2, this.f7998l, false);
        C3514a.m8972u(parcel, 3, this.f7999m, false);
        C3514a.m8972u(parcel, 4, this.f8000n, false);
        C3514a.m8972u(parcel, 5, this.f8001o, false);
        C3514a.m8972u(parcel, 6, this.f8002p, false);
        C3514a.m8953b(parcel, a);
    }

    public zzo(int i, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable List<String> list5) {
        this.f7997e = i;
        this.f7998l = list;
        this.f7999m = list2;
        this.f8000n = list3;
        this.f8001o = list4;
        this.f8002p = list5;
    }
}
