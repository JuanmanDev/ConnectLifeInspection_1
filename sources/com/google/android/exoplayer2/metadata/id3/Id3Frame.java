package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata;

public abstract class Id3Frame implements Metadata.Entry {

    /* renamed from: e */
    public final String f7761e;

    public Id3Frame(String str) {
        this.f7761e = str;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f7761e;
    }
}
