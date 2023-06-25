package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3444a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3474i;
import p040c.p200q.p201a.p264c.p276d.p281j.C3490m1;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class GetServiceRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new C3490m1();

    /* renamed from: y */
    public static final Scope[] f8248y = new Scope[0];

    /* renamed from: z */
    public static final Feature[] f8249z = new Feature[0];

    /* renamed from: e */
    public final int f8250e;

    /* renamed from: l */
    public final int f8251l;

    /* renamed from: m */
    public int f8252m;

    /* renamed from: n */
    public String f8253n;
    @Nullable

    /* renamed from: o */
    public IBinder f8254o;

    /* renamed from: p */
    public Scope[] f8255p;

    /* renamed from: q */
    public Bundle f8256q;
    @Nullable

    /* renamed from: r */
    public Account f8257r;

    /* renamed from: s */
    public Feature[] f8258s;

    /* renamed from: t */
    public Feature[] f8259t;

    /* renamed from: u */
    public boolean f8260u;

    /* renamed from: v */
    public int f8261v;

    /* renamed from: w */
    public boolean f8262w;
    @Nullable

    /* renamed from: x */
    public String f8263x;

    public GetServiceRequest(int i, int i2, int i3, String str, @Nullable IBinder iBinder, Scope[] scopeArr, Bundle bundle, @Nullable Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4, boolean z2, @Nullable String str2) {
        scopeArr = scopeArr == null ? f8248y : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f8249z : featureArr;
        featureArr2 = featureArr2 == null ? f8249z : featureArr2;
        this.f8250e = i;
        this.f8251l = i2;
        this.f8252m = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f8253n = "com.google.android.gms";
        } else {
            this.f8253n = str;
        }
        if (i < 2) {
            this.f8257r = iBinder != null ? C3444a.m8740g(C3474i.C3475a.m8877e(iBinder)) : null;
        } else {
            this.f8254o = iBinder;
            this.f8257r = account;
        }
        this.f8255p = scopeArr;
        this.f8256q = bundle;
        this.f8258s = featureArr;
        this.f8259t = featureArr2;
        this.f8260u = z;
        this.f8261v = i4;
        this.f8262w = z2;
        this.f8263x = str2;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        C3490m1.m8891a(this, parcel, i);
    }

    @Nullable
    public final String zza() {
        return this.f8263x;
    }
}
