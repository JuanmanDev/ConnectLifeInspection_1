package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C4015a();

    /* renamed from: e */
    public final Entry[] f7731e;

    public interface Entry extends Parcelable {
    }

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    public static class C4015a implements Parcelable.Creator<Metadata> {
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* renamed from: b */
        public Metadata[] newArray(int i) {
            return new Metadata[0];
        }
    }

    public Metadata(Entry... entryArr) {
        this.f7731e = entryArr == null ? new Entry[0] : entryArr;
    }

    /* renamed from: a */
    public Entry mo24052a(int i) {
        return this.f7731e[i];
    }

    /* renamed from: b */
    public int mo24053b() {
        return this.f7731e.length;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7731e, ((Metadata) obj).f7731e);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7731e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7731e.length);
        for (Entry writeParcelable : this.f7731e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Metadata(List<? extends Entry> list) {
        if (list != null) {
            Entry[] entryArr = new Entry[list.size()];
            this.f7731e = entryArr;
            list.toArray(entryArr);
            return;
        }
        this.f7731e = new Entry[0];
    }

    public Metadata(Parcel parcel) {
        this.f7731e = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f7731e;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }
}
