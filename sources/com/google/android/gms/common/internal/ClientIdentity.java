package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.test.internal.runner.RunnerArgs;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.C3525w;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class ClientIdentity extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C3525w();

    /* renamed from: e */
    public final int f8240e;
    @Nullable

    /* renamed from: l */
    public final String f8241l;

    public ClientIdentity(int i, @Nullable String str) {
        this.f8240e = i;
        this.f8241l = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f8240e == this.f8240e && C3487m.m8886a(clientIdentity.f8241l, this.f8241l);
    }

    public final int hashCode() {
        return this.f8240e;
    }

    @NonNull
    public final String toString() {
        int i = this.f8240e;
        String str = this.f8241l;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(RunnerArgs.CLASSPATH_SEPARATOR);
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8240e);
        C3514a.m8970s(parcel, 2, this.f8241l, false);
        C3514a.m8953b(parcel, a);
    }
}
