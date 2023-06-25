package com.github.mikephil.charting.data;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import p040c.p175p.p184b.p185a.p189d.C2261c;

public class Entry extends C2261c implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new C3988a();

    /* renamed from: n */
    public float f7534n = 0.0f;

    /* renamed from: com.github.mikephil.charting.data.Entry$a */
    public static class C3988a implements Parcelable.Creator<Entry> {
        /* renamed from: a */
        public Entry createFromParcel(Parcel parcel) {
            return new Entry(parcel);
        }

        /* renamed from: b */
        public Entry[] newArray(int i) {
            return new Entry[i];
        }
    }

    public Entry() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public float mo23876f() {
        return this.f7534n;
    }

    public String toString() {
        return "Entry, x: " + this.f7534n + " y: " + mo17271c();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7534n);
        parcel.writeFloat(mo17271c());
        if (mo17269a() == null) {
            parcel.writeInt(0);
        } else if (mo17269a() instanceof Parcelable) {
            parcel.writeInt(1);
            parcel.writeParcelable((Parcelable) mo17269a(), i);
        } else {
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
    }

    public Entry(Parcel parcel) {
        this.f7534n = parcel.readFloat();
        mo17273e(parcel.readFloat());
        if (parcel.readInt() == 1) {
            mo17272d(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
