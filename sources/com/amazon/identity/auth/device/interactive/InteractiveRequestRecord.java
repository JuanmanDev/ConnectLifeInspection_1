package com.amazon.identity.auth.device.interactive;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class InteractiveRequestRecord implements Parcelable {
    public static final Parcelable.Creator<InteractiveRequestRecord> CREATOR = new C3806a();

    /* renamed from: e */
    public final String f6945e;

    /* renamed from: l */
    public final Bundle f6946l;

    /* renamed from: m */
    public Bundle f6947m;

    /* renamed from: com.amazon.identity.auth.device.interactive.InteractiveRequestRecord$a */
    public static class C3806a implements Parcelable.Creator<InteractiveRequestRecord> {
        /* renamed from: a */
        public InteractiveRequestRecord createFromParcel(Parcel parcel) {
            return new InteractiveRequestRecord(parcel, (C3806a) null);
        }

        /* renamed from: b */
        public InteractiveRequestRecord[] newArray(int i) {
            return new InteractiveRequestRecord[i];
        }
    }

    public /* synthetic */ InteractiveRequestRecord(Parcel parcel, C3806a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public Bundle mo21522a() {
        return this.f6947m;
    }

    /* renamed from: b */
    public Bundle mo21523b() {
        return this.f6946l;
    }

    /* renamed from: c */
    public String mo21524c() {
        return this.f6945e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InteractiveRequestRecord.class != obj.getClass()) {
            return false;
        }
        InteractiveRequestRecord interactiveRequestRecord = (InteractiveRequestRecord) obj;
        Bundle bundle = this.f6947m;
        if (bundle == null) {
            if (interactiveRequestRecord.f6947m != null) {
                return false;
            }
        } else if (!bundle.equals(interactiveRequestRecord.f6947m)) {
            return false;
        }
        Bundle bundle2 = this.f6946l;
        if (bundle2 == null) {
            if (interactiveRequestRecord.f6946l != null) {
                return false;
            }
        } else if (!bundle2.equals(interactiveRequestRecord.f6946l)) {
            return false;
        }
        String str = this.f6945e;
        if (str == null) {
            if (interactiveRequestRecord.f6945e != null) {
                return false;
            }
        } else if (!str.equals(interactiveRequestRecord.f6945e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Bundle bundle = this.f6947m;
        int i = 0;
        int hashCode = ((bundle == null ? 0 : bundle.hashCode()) + 31) * 31;
        Bundle bundle2 = this.f6946l;
        int hashCode2 = (hashCode + (bundle2 == null ? 0 : bundle2.hashCode())) * 31;
        String str = this.f6945e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" id=");
        sb.append(this.f6945e);
        sb.append(" hasFragment=");
        sb.append(this.f6947m != null);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6945e);
        parcel.writeBundle(this.f6946l);
        parcel.writeBundle(this.f6947m);
    }

    public InteractiveRequestRecord(String str, Bundle bundle) {
        this.f6945e = str;
        this.f6946l = bundle;
    }

    @SuppressLint({"ParcelClassLoader"})
    public InteractiveRequestRecord(Parcel parcel) {
        this.f6945e = parcel.readString();
        this.f6946l = parcel.readBundle();
        this.f6947m = parcel.readBundle();
    }
}
