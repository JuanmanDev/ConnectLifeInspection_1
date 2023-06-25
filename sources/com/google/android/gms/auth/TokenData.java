package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p040c.p200q.p201a.p264c.p267b.C3293e;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new C3293e();

    /* renamed from: e */
    public final int f7979e;

    /* renamed from: l */
    public final String f7980l;

    /* renamed from: m */
    public final Long f7981m;

    /* renamed from: n */
    public final boolean f7982n;

    /* renamed from: o */
    public final boolean f7983o;

    /* renamed from: p */
    public final List<String> f7984p;

    /* renamed from: q */
    public final String f7985q;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.f7979e = i;
        C3495o.m8904f(str);
        this.f7980l = str;
        this.f7981m = l;
        this.f7982n = z;
        this.f7983o = z2;
        this.f7984p = list;
        this.f7985q = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f7980l, tokenData.f7980l) || !C3487m.m8886a(this.f7981m, tokenData.f7981m) || this.f7982n != tokenData.f7982n || this.f7983o != tokenData.f7983o || !C3487m.m8886a(this.f7984p, tokenData.f7984p) || !C3487m.m8886a(this.f7985q, tokenData.f7985q)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3487m.m8887b(this.f7980l, this.f7981m, Boolean.valueOf(this.f7982n), Boolean.valueOf(this.f7983o), this.f7984p, this.f7985q);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f7979e);
        C3514a.m8970s(parcel, 2, this.f7980l, false);
        C3514a.m8966o(parcel, 3, this.f7981m, false);
        C3514a.m8954c(parcel, 4, this.f7982n);
        C3514a.m8954c(parcel, 5, this.f7983o);
        C3514a.m8972u(parcel, 6, this.f7984p, false);
        C3514a.m8970s(parcel, 7, this.f7985q, false);
        C3514a.m8953b(parcel, a);
    }
}
