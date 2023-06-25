package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C4041a();

    /* renamed from: n */
    public static final TrackGroupArray f7829n = new TrackGroupArray(new TrackGroup[0]);

    /* renamed from: e */
    public final int f7830e;

    /* renamed from: l */
    public final TrackGroup[] f7831l;

    /* renamed from: m */
    public int f7832m;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$a */
    public static class C4041a implements Parcelable.Creator<TrackGroupArray> {
        /* renamed from: a */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        /* renamed from: b */
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f7831l = trackGroupArr;
        this.f7830e = trackGroupArr.length;
    }

    /* renamed from: a */
    public TrackGroup mo24210a(int i) {
        return this.f7831l[i];
    }

    /* renamed from: b */
    public int mo24211b(TrackGroup trackGroup) {
        for (int i = 0; i < this.f7830e; i++) {
            if (this.f7831l[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.f7830e != trackGroupArray.f7830e || !Arrays.equals(this.f7831l, trackGroupArray.f7831l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f7832m == 0) {
            this.f7832m = Arrays.hashCode(this.f7831l);
        }
        return this.f7832m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7830e);
        for (int i2 = 0; i2 < this.f7830e; i2++) {
            parcel.writeParcelable(this.f7831l[i2], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f7830e = readInt;
        this.f7831l = new TrackGroup[readInt];
        for (int i = 0; i < this.f7830e; i++) {
            this.f7831l[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
