package com.google.android.gms.internal.p527firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.zze;
import java.util.List;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;
import p040c.p200q.p201a.p264c.p294g.p333g.C4457gm;
import p040c.p200q.p363c.p367l.p368h.C6392o;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zztm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zztm> CREATOR = new C4457gm();

    /* renamed from: e */
    public final String f14740e;

    /* renamed from: l */
    public final List f14741l;

    /* renamed from: m */
    public final zze f14742m;

    public zztm(String str, List list, @Nullable zze zze) {
        this.f14740e = str;
        this.f14741l = list;
        this.f14742m = zze;
    }

    /* renamed from: P */
    public final zze mo33466P() {
        return this.f14742m;
    }

    /* renamed from: Q */
    public final String mo33467Q() {
        return this.f14740e;
    }

    /* renamed from: R */
    public final List mo33468R() {
        return C6392o.m17923b(this.f14741l);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8970s(parcel, 1, this.f14740e, false);
        C3514a.m8974w(parcel, 2, this.f14741l, false);
        C3514a.m8968q(parcel, 3, this.f14742m, i, false);
        C3514a.m8953b(parcel, a);
    }
}
