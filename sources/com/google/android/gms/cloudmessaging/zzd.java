package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p275c.C3294a;
import p040c.p200q.p201a.p264c.p275c.C3300e;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new C3300e();

    /* renamed from: e */
    public Messenger f8150e;

    /* renamed from: l */
    public C3294a f8151l;

    public zzd(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8150e = new Messenger(iBinder);
        } else {
            this.f8151l = new C3294a.C3295a(iBinder);
        }
    }

    /* renamed from: a */
    public final IBinder mo24477a() {
        Messenger messenger = this.f8150e;
        return messenger != null ? messenger.getBinder() : this.f8151l.asBinder();
    }

    /* renamed from: b */
    public final void mo24478b(Message message) {
        Messenger messenger = this.f8150e;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f8151l.mo20335t(message);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return mo24477a().equals(((zzd) obj).mo24477a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return mo24477a().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f8150e;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f8151l.asBinder());
        }
    }
}
