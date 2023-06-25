package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p277g.C3344b;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p276d.p277g.C3432p;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Status extends AbstractSafeParcelable implements C3356i, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new C3432p();
    @NonNull

    /* renamed from: p */
    public static final Status f8173p = new Status(0);
    @NonNull

    /* renamed from: q */
    public static final Status f8174q = new Status(14);
    @NonNull

    /* renamed from: r */
    public static final Status f8175r = new Status(8);
    @NonNull

    /* renamed from: s */
    public static final Status f8176s = new Status(15);
    @NonNull

    /* renamed from: t */
    public static final Status f8177t = new Status(16);

    /* renamed from: e */
    public final int f8178e;

    /* renamed from: l */
    public final int f8179l;
    @Nullable

    /* renamed from: m */
    public final String f8180m;
    @Nullable

    /* renamed from: n */
    public final PendingIntent f8181n;
    @Nullable

    /* renamed from: o */
    public final ConnectionResult f8182o;

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent, @Nullable ConnectionResult connectionResult) {
        this.f8178e = i;
        this.f8179l = i2;
        this.f8180m = str;
        this.f8181n = pendingIntent;
        this.f8182o = connectionResult;
    }

    @NonNull
    /* renamed from: F */
    public Status mo20282F() {
        return this;
    }

    @Nullable
    /* renamed from: P */
    public ConnectionResult mo24531P() {
        return this.f8182o;
    }

    @Nullable
    /* renamed from: Q */
    public PendingIntent mo24532Q() {
        return this.f8181n;
    }

    /* renamed from: R */
    public int mo24533R() {
        return this.f8179l;
    }

    @Nullable
    /* renamed from: S */
    public String mo24534S() {
        return this.f8180m;
    }

    /* renamed from: T */
    public boolean mo24535T() {
        return this.f8181n != null;
    }

    /* renamed from: U */
    public boolean mo24536U() {
        return this.f8179l <= 0;
    }

    /* renamed from: V */
    public void mo24537V(@NonNull Activity activity, int i) {
        if (mo24535T()) {
            PendingIntent pendingIntent = this.f8181n;
            C3495o.m8908j(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f8178e != status.f8178e || this.f8179l != status.f8179l || !C3487m.m8886a(this.f8180m, status.f8180m) || !C3487m.m8886a(this.f8181n, status.f8181n) || !C3487m.m8886a(this.f8182o, status.f8182o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C3487m.m8887b(Integer.valueOf(this.f8178e), Integer.valueOf(this.f8179l), this.f8180m, this.f8181n, this.f8182o);
    }

    @NonNull
    public String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a("statusCode", zza());
        c.mo20747a("resolution", this.f8181n);
        return c.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, mo24533R());
        C3514a.m8970s(parcel, 2, mo24534S(), false);
        C3514a.m8968q(parcel, 3, this.f8181n, i, false);
        C3514a.m8968q(parcel, 4, mo24531P(), i, false);
        C3514a.m8963l(parcel, 1000, this.f8178e);
        C3514a.m8953b(parcel, a);
    }

    @NonNull
    public final String zza() {
        String str = this.f8180m;
        return str != null ? str : C3344b.m8479a(this.f8179l);
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null, (ConnectionResult) null);
    }

    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i) {
        this(1, i, str, connectionResult.mo24485R(), connectionResult);
    }
}
