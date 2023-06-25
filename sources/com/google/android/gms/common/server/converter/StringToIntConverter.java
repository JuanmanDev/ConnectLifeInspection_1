package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p286a.C3540b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class StringToIntConverter extends AbstractSafeParcelable implements FastJsonResponse.C4073a<String, Integer> {
    @NonNull
    public static final Parcelable.Creator<StringToIntConverter> CREATOR = new C3540b();

    /* renamed from: e */
    public final int f8301e;

    /* renamed from: l */
    public final HashMap<String, Integer> f8302l;

    /* renamed from: m */
    public final SparseArray<String> f8303m;

    public StringToIntConverter() {
        this.f8301e = 1;
        this.f8302l = new HashMap<>();
        this.f8303m = new SparseArray<>();
    }

    @NonNull
    /* renamed from: P */
    public StringToIntConverter mo24619P(@NonNull String str, int i) {
        this.f8302l.put(str, Integer.valueOf(i));
        this.f8303m.put(i, str);
        return this;
    }

    @NonNull
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ Object mo24620s(@NonNull Object obj) {
        String str = this.f8303m.get(((Integer) obj).intValue());
        if (str != null || !this.f8302l.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8301e);
        ArrayList arrayList = new ArrayList();
        for (String next : this.f8302l.keySet()) {
            arrayList.add(new zac(next, this.f8302l.get(next).intValue()));
        }
        C3514a.m8974w(parcel, 2, arrayList, false);
        C3514a.m8953b(parcel, a);
    }

    public StringToIntConverter(int i, ArrayList<zac> arrayList) {
        this.f8301e = i;
        this.f8302l = new HashMap<>();
        this.f8303m = new SparseArray<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zac zac = arrayList.get(i2);
            mo24619P(zac.f8307l, zac.f8308m);
        }
    }
}
