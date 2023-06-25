package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.C3333f0;
import p040c.p200q.p201a.p264c.p276d.C3583y;
import p040c.p200q.p201a.p264c.p276d.C3584z;
import p040c.p200q.p201a.p264c.p276d.p281j.C3530x1;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p292e.C3587b;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C3333f0();

    /* renamed from: e */
    public final String f8361e;

    /* renamed from: l */
    public final C3583y f8362l;

    /* renamed from: m */
    public final boolean f8363m;

    /* renamed from: n */
    public final boolean f8364n;

    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.f8361e = str;
        C3584z zVar = null;
        if (iBinder != null) {
            try {
                C3585a c = C3530x1.m9011e(iBinder).mo20801c();
                if (c == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C3587b.m9123g(c);
                }
                if (bArr != null) {
                    zVar = new C3584z(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f8362l = zVar;
        this.f8363m = z;
        this.f8364n = z2;
    }

    public zzs(String str, C3583y yVar, boolean z, boolean z2) {
        this.f8361e = str;
        this.f8362l = yVar;
        this.f8363m = z;
        this.f8364n = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f8361e, false);
        C3583y yVar = this.f8362l;
        if (yVar == null) {
            yVar = null;
        }
        C3514a.m8962k(parcel, 2, yVar, false);
        C3514a.m8954c(parcel, 3, this.f8363m);
        C3514a.m8954c(parcel, 4, this.f8364n);
        C3514a.m8953b(parcel, a);
    }
}
