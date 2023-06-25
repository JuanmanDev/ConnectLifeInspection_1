package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.Map;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p287b.C3545d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zal> CREATOR = new C3545d();

    /* renamed from: e */
    public final int f8327e;

    /* renamed from: l */
    public final String f8328l;
    @Nullable

    /* renamed from: m */
    public final ArrayList<zam> f8329m;

    public zal(int i, String str, ArrayList<zam> arrayList) {
        this.f8327e = i;
        this.f8328l = str;
        this.f8329m = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8327e);
        C3514a.m8970s(parcel, 2, this.f8328l, false);
        C3514a.m8974w(parcel, 3, this.f8329m, false);
        C3514a.m8953b(parcel, a);
    }

    public zal(String str, Map<String, FastJsonResponse.Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f8327e = 1;
        this.f8328l = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String next : map.keySet()) {
                arrayList.add(new zam(next, map.get(next)));
            }
        }
        this.f8329m = arrayList;
    }
}
