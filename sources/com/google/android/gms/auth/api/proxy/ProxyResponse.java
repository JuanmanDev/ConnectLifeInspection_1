package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p272g.C3252c;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new C3252c();

    /* renamed from: e */
    public final int f8085e;

    /* renamed from: l */
    public final int f8086l;

    /* renamed from: m */
    public final PendingIntent f8087m;

    /* renamed from: n */
    public final int f8088n;

    /* renamed from: o */
    public final Bundle f8089o;

    /* renamed from: p */
    public final byte[] f8090p;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f8085e = i;
        this.f8086l = i2;
        this.f8088n = i3;
        this.f8089o = bundle;
        this.f8090p = bArr;
        this.f8087m = pendingIntent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8086l);
        C3514a.m8968q(parcel, 2, this.f8087m, i, false);
        C3514a.m8963l(parcel, 3, this.f8088n);
        C3514a.m8956e(parcel, 4, this.f8089o, false);
        C3514a.m8957f(parcel, 5, this.f8090p, false);
        C3514a.m8963l(parcel, 1000, this.f8085e);
        C3514a.m8953b(parcel, a);
    }
}
