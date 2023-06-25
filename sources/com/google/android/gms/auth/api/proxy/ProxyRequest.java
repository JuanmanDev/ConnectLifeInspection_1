package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p272g.C3251b;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new C3251b();

    /* renamed from: e */
    public final int f8079e;

    /* renamed from: l */
    public final String f8080l;

    /* renamed from: m */
    public final int f8081m;

    /* renamed from: n */
    public final long f8082n;

    /* renamed from: o */
    public final byte[] f8083o;

    /* renamed from: p */
    public Bundle f8084p;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f8079e = i;
        this.f8080l = str;
        this.f8081m = i2;
        this.f8082n = j;
        this.f8083o = bArr;
        this.f8084p = bundle;
    }

    public String toString() {
        String str = this.f8080l;
        int i = this.f8081m;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f8080l, false);
        C3514a.m8963l(parcel, 2, this.f8081m);
        C3514a.m8965n(parcel, 3, this.f8082n);
        C3514a.m8957f(parcel, 4, this.f8083o, false);
        C3514a.m8956e(parcel, 5, this.f8084p, false);
        C3514a.m8963l(parcel, 1000, this.f8079e);
        C3514a.m8953b(parcel, a);
    }
}
