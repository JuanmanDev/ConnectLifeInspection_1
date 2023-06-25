package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p264c.p267b.p268a.p270e.C3235a;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new C3235a();

    /* renamed from: e */
    public final String f8018e;
    @Nullable

    /* renamed from: l */
    public final String f8019l;
    @Nullable

    /* renamed from: m */
    public final Uri f8020m;

    /* renamed from: n */
    public final List<IdToken> f8021n;
    @Nullable

    /* renamed from: o */
    public final String f8022o;
    @Nullable

    /* renamed from: p */
    public final String f8023p;
    @Nullable

    /* renamed from: q */
    public final String f8024q;
    @Nullable

    /* renamed from: r */
    public final String f8025r;

    public Credential(String str, @Nullable String str2, @Nullable Uri uri, List<IdToken> list, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        List<IdToken> list2;
        C3495o.m8909k(str, "credential identifier cannot be null");
        String trim = str.trim();
        C3495o.m8905g(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f8019l = str2;
                this.f8020m = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f8021n = list2;
                this.f8018e = trim;
                this.f8022o = str3;
                this.f8023p = str4;
                this.f8024q = str5;
                this.f8025r = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    @Nullable
    /* renamed from: P */
    public String mo24333P() {
        return this.f8023p;
    }

    @Nullable
    /* renamed from: Q */
    public String mo24334Q() {
        return this.f8025r;
    }

    @Nullable
    /* renamed from: R */
    public String mo24335R() {
        return this.f8024q;
    }

    /* renamed from: S */
    public String mo24336S() {
        return this.f8018e;
    }

    /* renamed from: T */
    public List<IdToken> mo24337T() {
        return this.f8021n;
    }

    @Nullable
    /* renamed from: U */
    public String mo24338U() {
        return this.f8019l;
    }

    @Nullable
    /* renamed from: V */
    public String mo24339V() {
        return this.f8022o;
    }

    @Nullable
    /* renamed from: W */
    public Uri mo24340W() {
        return this.f8020m;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f8018e, credential.f8018e) && TextUtils.equals(this.f8019l, credential.f8019l) && C3487m.m8886a(this.f8020m, credential.f8020m) && TextUtils.equals(this.f8022o, credential.f8022o) && TextUtils.equals(this.f8023p, credential.f8023p);
    }

    public int hashCode() {
        return C3487m.m8887b(this.f8018e, this.f8019l, this.f8020m, this.f8022o, this.f8023p);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, mo24336S(), false);
        C3514a.m8970s(parcel, 2, mo24338U(), false);
        C3514a.m8968q(parcel, 3, mo24340W(), i, false);
        C3514a.m8974w(parcel, 4, mo24337T(), false);
        C3514a.m8970s(parcel, 5, mo24339V(), false);
        C3514a.m8970s(parcel, 6, mo24333P(), false);
        C3514a.m8970s(parcel, 9, mo24335R(), false);
        C3514a.m8970s(parcel, 10, mo24334Q(), false);
        C3514a.m8953b(parcel, a);
    }
}
