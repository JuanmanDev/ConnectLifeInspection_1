package com.yalantis.ucrop.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

public class AspectRatio implements Parcelable {
    public static final Parcelable.Creator<AspectRatio> CREATOR = new C8872a();
    @Nullable

    /* renamed from: e */
    public final String f17292e;

    /* renamed from: l */
    public final float f17293l;

    /* renamed from: m */
    public final float f17294m;

    /* renamed from: com.yalantis.ucrop.model.AspectRatio$a */
    public static class C8872a implements Parcelable.Creator<AspectRatio> {
        /* renamed from: a */
        public AspectRatio createFromParcel(Parcel parcel) {
            return new AspectRatio(parcel);
        }

        /* renamed from: b */
        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    }

    public AspectRatio(@Nullable String str, float f, float f2) {
        this.f17292e = str;
        this.f17293l = f;
        this.f17294m = f2;
    }

    @Nullable
    /* renamed from: a */
    public String mo46110a() {
        return this.f17292e;
    }

    /* renamed from: b */
    public float mo46111b() {
        return this.f17293l;
    }

    /* renamed from: c */
    public float mo46112c() {
        return this.f17294m;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17292e);
        parcel.writeFloat(this.f17293l);
        parcel.writeFloat(this.f17294m);
    }

    public AspectRatio(Parcel parcel) {
        this.f17292e = parcel.readString();
        this.f17293l = parcel.readFloat();
        this.f17294m = parcel.readFloat();
    }
}
