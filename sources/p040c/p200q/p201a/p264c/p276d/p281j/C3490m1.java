package p040c.p200q.p201a.p264c.p276d.p281j;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* renamed from: c.q.a.c.d.j.m1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3490m1 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m8891a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, getServiceRequest.f8250e);
        C3514a.m8963l(parcel, 2, getServiceRequest.f8251l);
        C3514a.m8963l(parcel, 3, getServiceRequest.f8252m);
        C3514a.m8970s(parcel, 4, getServiceRequest.f8253n, false);
        C3514a.m8962k(parcel, 5, getServiceRequest.f8254o, false);
        C3514a.m8973v(parcel, 6, getServiceRequest.f8255p, i, false);
        C3514a.m8956e(parcel, 7, getServiceRequest.f8256q, false);
        C3514a.m8968q(parcel, 8, getServiceRequest.f8257r, i, false);
        C3514a.m8973v(parcel, 10, getServiceRequest.f8258s, i, false);
        C3514a.m8973v(parcel, 11, getServiceRequest.f8259t, i, false);
        C3514a.m8954c(parcel, 12, getServiceRequest.f8260u);
        C3514a.m8963l(parcel, 13, getServiceRequest.f8261v);
        C3514a.m8954c(parcel, 14, getServiceRequest.f8262w);
        C3514a.m8970s(parcel, 15, getServiceRequest.zza(), false);
        C3514a.m8953b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int J = SafeParcelReader.m10946J(parcel);
        Scope[] scopeArr = GetServiceRequest.f8248y;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f8249z;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < J) {
            int B = SafeParcelReader.m10938B(parcel);
            switch (SafeParcelReader.m10969u(B)) {
                case 1:
                    i = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 2:
                    i2 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 3:
                    i3 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 4:
                    str = SafeParcelReader.m10963o(parcel2, B);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m10939C(parcel2, B);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m10966r(parcel2, B, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m10954f(parcel2, B);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m10962n(parcel2, B, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m10966r(parcel2, B, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m10966r(parcel2, B, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 13:
                    i4 = SafeParcelReader.m10940D(parcel2, B);
                    break;
                case 14:
                    z2 = SafeParcelReader.m10970v(parcel2, B);
                    break;
                case 15:
                    str2 = SafeParcelReader.m10963o(parcel2, B);
                    break;
                default:
                    SafeParcelReader.m10945I(parcel2, B);
                    break;
            }
        }
        SafeParcelReader.m10968t(parcel2, J);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
