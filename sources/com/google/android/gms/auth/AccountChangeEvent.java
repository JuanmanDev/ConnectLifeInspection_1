package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.C3290b;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C3290b();

    /* renamed from: e */
    public final int f7967e;

    /* renamed from: l */
    public final long f7968l;

    /* renamed from: m */
    public final String f7969m;

    /* renamed from: n */
    public final int f7970n;

    /* renamed from: o */
    public final int f7971o;

    /* renamed from: p */
    public final String f7972p;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f7967e = i;
        this.f7968l = j;
        C3495o.m8908j(str);
        this.f7969m = str;
        this.f7970n = i2;
        this.f7971o = i3;
        this.f7972p = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.f7967e == accountChangeEvent.f7967e && this.f7968l == accountChangeEvent.f7968l && C3487m.m8886a(this.f7969m, accountChangeEvent.f7969m) && this.f7970n == accountChangeEvent.f7970n && this.f7971o == accountChangeEvent.f7971o && C3487m.m8886a(this.f7972p, accountChangeEvent.f7972p);
        }
    }

    public int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f7967e), Long.valueOf(this.f7968l), this.f7969m, Integer.valueOf(this.f7970n), Integer.valueOf(this.f7971o), this.f7972p);
    }

    public String toString() {
        int i = this.f7970n;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f7969m;
        String str3 = this.f7972p;
        int i2 = this.f7971o;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f7967e);
        C3514a.m8965n(parcel, 2, this.f7968l);
        C3514a.m8970s(parcel, 3, this.f7969m, false);
        C3514a.m8963l(parcel, 4, this.f7970n);
        C3514a.m8963l(parcel, 5, this.f7971o);
        C3514a.m8970s(parcel, 6, this.f7972p, false);
        C3514a.m8953b(parcel, a);
    }
}
