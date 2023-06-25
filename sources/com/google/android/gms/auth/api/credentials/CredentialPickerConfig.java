package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p040c.p200q.p201a.p264c.p267b.p268a.p270e.C3237c;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new C3237c();

    /* renamed from: e */
    public final int f8026e;

    /* renamed from: l */
    public final boolean f8027l;

    /* renamed from: m */
    public final boolean f8028m;

    /* renamed from: n */
    public final int f8029n;

    /* renamed from: com.google.android.gms.auth.api.credentials.CredentialPickerConfig$a */
    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class C4068a {

        /* renamed from: a */
        public boolean f8030a = false;

        /* renamed from: b */
        public boolean f8031b = true;

        /* renamed from: c */
        public int f8032c = 1;

        /* renamed from: a */
        public CredentialPickerConfig mo24348a() {
            return new CredentialPickerConfig(this);
        }
    }

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f8026e = i;
        this.f8027l = z;
        this.f8028m = z2;
        int i3 = 3;
        if (i < 2) {
            this.f8029n = !z3 ? 1 : i3;
        } else {
            this.f8029n = i2;
        }
    }

    @Deprecated
    /* renamed from: P */
    public final boolean mo24344P() {
        return this.f8029n == 3;
    }

    /* renamed from: Q */
    public final boolean mo24345Q() {
        return this.f8027l;
    }

    /* renamed from: R */
    public final boolean mo24346R() {
        return this.f8028m;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8954c(parcel, 1, mo24345Q());
        C3514a.m8954c(parcel, 2, mo24346R());
        C3514a.m8954c(parcel, 3, mo24344P());
        C3514a.m8963l(parcel, 4, this.f8029n);
        C3514a.m8963l(parcel, 1000, this.f8026e);
        C3514a.m8953b(parcel, a);
    }

    public CredentialPickerConfig(C4068a aVar) {
        this(2, aVar.f8030a, aVar.f8031b, false, aVar.f8032c);
    }
}
