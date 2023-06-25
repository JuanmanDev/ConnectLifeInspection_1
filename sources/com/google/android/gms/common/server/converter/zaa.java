package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p276d.p285l.p286a.C3539a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C3539a();

    /* renamed from: e */
    public final int f8304e;

    /* renamed from: l */
    public final StringToIntConverter f8305l;

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.f8304e = i;
        this.f8305l = stringToIntConverter;
    }

    /* renamed from: P */
    public static zaa m10981P(FastJsonResponse.C4073a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zaa((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: Q */
    public final FastJsonResponse.C4073a<?, ?> mo24622Q() {
        StringToIntConverter stringToIntConverter = this.f8305l;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8304e);
        C3514a.m8968q(parcel, 2, this.f8305l, i, false);
        C3514a.m8953b(parcel, a);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f8304e = 1;
        this.f8305l = stringToIntConverter;
    }
}
