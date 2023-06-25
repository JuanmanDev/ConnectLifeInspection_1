package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C4021a();

    /* renamed from: l */
    public final String f7754l;

    /* renamed from: m */
    public final String f7755m;

    /* renamed from: n */
    public final String f7756n;

    /* renamed from: com.google.android.exoplayer2.metadata.id3.CommentFrame$a */
    public static class C4021a implements Parcelable.Creator<CommentFrame> {
        /* renamed from: a */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        /* renamed from: b */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f7754l = str;
        this.f7755m = str2;
        this.f7756n = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (!C3152e0.m7789b(this.f7755m, commentFrame.f7755m) || !C3152e0.m7789b(this.f7754l, commentFrame.f7754l) || !C3152e0.m7789b(this.f7756n, commentFrame.f7756n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f7754l;
        int i = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7755m;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7756n;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return this.f7761e + ": language=" + this.f7754l + ", description=" + this.f7755m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7761e);
        parcel.writeString(this.f7754l);
        parcel.writeString(this.f7756n);
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        C3152e0.m7797f(readString);
        this.f7754l = readString;
        String readString2 = parcel.readString();
        C3152e0.m7797f(readString2);
        this.f7755m = readString2;
        String readString3 = parcel.readString();
        C3152e0.m7797f(readString3);
        this.f7756n = readString3;
    }
}
