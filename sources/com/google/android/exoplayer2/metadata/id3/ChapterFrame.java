package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C4019a();

    /* renamed from: l */
    public final String f7743l;

    /* renamed from: m */
    public final int f7744m;

    /* renamed from: n */
    public final int f7745n;

    /* renamed from: o */
    public final long f7746o;

    /* renamed from: p */
    public final long f7747p;

    /* renamed from: q */
    public final Id3Frame[] f7748q;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterFrame$a */
    public static class C4019a implements Parcelable.Creator<ChapterFrame> {
        /* renamed from: a */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        /* renamed from: b */
        public ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f7743l = str;
        this.f7744m = i;
        this.f7745n = i2;
        this.f7746o = j;
        this.f7747p = j2;
        this.f7748q = id3FrameArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.f7744m == chapterFrame.f7744m && this.f7745n == chapterFrame.f7745n && this.f7746o == chapterFrame.f7746o && this.f7747p == chapterFrame.f7747p && C3152e0.m7789b(this.f7743l, chapterFrame.f7743l) && Arrays.equals(this.f7748q, chapterFrame.f7748q)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = (((((((527 + this.f7744m) * 31) + this.f7745n) * 31) + ((int) this.f7746o)) * 31) + ((int) this.f7747p)) * 31;
        String str = this.f7743l;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7743l);
        parcel.writeInt(this.f7744m);
        parcel.writeInt(this.f7745n);
        parcel.writeLong(this.f7746o);
        parcel.writeLong(this.f7747p);
        parcel.writeInt(this.f7748q.length);
        for (Id3Frame writeParcelable : this.f7748q) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7743l = readString;
        this.f7744m = parcel.readInt();
        this.f7745n = parcel.readInt();
        this.f7746o = parcel.readLong();
        this.f7747p = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7748q = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7748q[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
