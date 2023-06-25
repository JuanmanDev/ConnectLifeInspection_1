package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.EmailAuthCredential;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4856vl;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzss */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzss extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzss> CREATOR = new C4856vl();

    /* renamed from: e */
    public final EmailAuthCredential f14705e;

    public zzss(EmailAuthCredential emailAuthCredential) {
        this.f14705e = emailAuthCredential;
    }

    /* renamed from: P */
    public final EmailAuthCredential mo33450P() {
        return this.f14705e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8968q(parcel, 1, this.f14705e, i, false);
        C3514a.m8953b(parcel, a);
    }
}
