package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C4040a();

    /* renamed from: e */
    public final int f7826e;

    /* renamed from: l */
    public final Format[] f7827l;

    /* renamed from: m */
    public int f7828m;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroup$a */
    public static class C4040a implements Parcelable.Creator<TrackGroup> {
        /* renamed from: a */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        /* renamed from: b */
        public TrackGroup[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        C3151e.m7759g(formatArr.length > 0);
        this.f7827l = formatArr;
        this.f7826e = formatArr.length;
    }

    /* renamed from: a */
    public Format mo24200a(int i) {
        return this.f7827l[i];
    }

    /* renamed from: b */
    public int mo24201b(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f7827l;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.f7826e != trackGroup.f7826e || !Arrays.equals(this.f7827l, trackGroup.f7827l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f7828m == 0) {
            this.f7828m = 527 + Arrays.hashCode(this.f7827l);
        }
        return this.f7828m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7826e);
        for (int i2 = 0; i2 < this.f7826e; i2++) {
            parcel.writeParcelable(this.f7827l[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f7826e = readInt;
        this.f7827l = new Format[readInt];
        for (int i = 0; i < this.f7826e; i++) {
            this.f7827l[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
