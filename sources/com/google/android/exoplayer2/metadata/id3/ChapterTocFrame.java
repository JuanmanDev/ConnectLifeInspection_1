package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C4020a();

    /* renamed from: l */
    public final String f7749l;

    /* renamed from: m */
    public final boolean f7750m;

    /* renamed from: n */
    public final boolean f7751n;

    /* renamed from: o */
    public final String[] f7752o;

    /* renamed from: p */
    public final Id3Frame[] f7753p;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.ChapterTocFrame$a */
    public static class C4020a implements Parcelable.Creator<ChapterTocFrame> {
        /* renamed from: a */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        /* renamed from: b */
        public ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f7749l = str;
        this.f7750m = z;
        this.f7751n = z2;
        this.f7752o = strArr;
        this.f7753p = id3FrameArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.f7750m != chapterTocFrame.f7750m || this.f7751n != chapterTocFrame.f7751n || !C3152e0.m7789b(this.f7749l, chapterTocFrame.f7749l) || !Arrays.equals(this.f7752o, chapterTocFrame.f7752o) || !Arrays.equals(this.f7753p, chapterTocFrame.f7753p)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = (((true + (this.f7750m ? 1 : 0)) * 31) + (this.f7751n ? 1 : 0)) * 31;
        String str = this.f7749l;
        return i + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7749l);
        parcel.writeByte(this.f7750m ? (byte) 1 : 0);
        parcel.writeByte(this.f7751n ? (byte) 1 : 0);
        parcel.writeStringArray(this.f7752o);
        parcel.writeInt(this.f7753p.length);
        for (Id3Frame writeParcelable : this.f7753p) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7749l = readString;
        boolean z = true;
        this.f7750m = parcel.readByte() != 0;
        this.f7751n = parcel.readByte() == 0 ? false : z;
        this.f7752o = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f7753p = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f7753p[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
