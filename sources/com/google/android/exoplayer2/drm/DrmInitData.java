package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C4006a();

    /* renamed from: e */
    public final SchemeData[] f7655e;

    /* renamed from: l */
    public int f7656l;
    @Nullable

    /* renamed from: m */
    public final String f7657m;

    /* renamed from: n */
    public final int f7658n;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C4005a();

        /* renamed from: e */
        public int f7659e;

        /* renamed from: l */
        public final UUID f7660l;
        @Nullable

        /* renamed from: m */
        public final String f7661m;

        /* renamed from: n */
        public final String f7662n;

        /* renamed from: o */
        public final byte[] f7663o;

        /* renamed from: p */
        public final boolean f7664p;

        /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$SchemeData$a */
        public static class C4005a implements Parcelable.Creator<SchemeData> {
            /* renamed from: a */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            /* renamed from: b */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        /* renamed from: b */
        public boolean mo23989b(SchemeData schemeData) {
            return mo23991d() && !schemeData.mo23991d() && mo23993e(schemeData.f7660l);
        }

        /* renamed from: c */
        public SchemeData mo23990c(@Nullable byte[] bArr) {
            return new SchemeData(this.f7660l, this.f7661m, this.f7662n, bArr, this.f7664p);
        }

        /* renamed from: d */
        public boolean mo23991d() {
            return this.f7663o != null;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean mo23993e(UUID uuid) {
            return C2627d.f3279a.equals(this.f7660l) || uuid.equals(this.f7660l);
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!C3152e0.m7789b(this.f7661m, schemeData.f7661m) || !C3152e0.m7789b(this.f7662n, schemeData.f7662n) || !C3152e0.m7789b(this.f7660l, schemeData.f7660l) || !Arrays.equals(this.f7663o, schemeData.f7663o)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            if (this.f7659e == 0) {
                int hashCode = this.f7660l.hashCode() * 31;
                String str = this.f7661m;
                this.f7659e = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f7662n.hashCode()) * 31) + Arrays.hashCode(this.f7663o);
            }
            return this.f7659e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7660l.getMostSignificantBits());
            parcel.writeLong(this.f7660l.getLeastSignificantBits());
            parcel.writeString(this.f7661m);
            parcel.writeString(this.f7662n);
            parcel.writeByteArray(this.f7663o);
            parcel.writeByte(this.f7664p ? (byte) 1 : 0);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, (String) null, str, bArr, z);
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, byte[] bArr, boolean z) {
            C3151e.m7757e(uuid);
            this.f7660l = uuid;
            this.f7661m = str;
            C3151e.m7757e(str2);
            this.f7662n = str2;
            this.f7663o = bArr;
            this.f7664p = z;
        }

        public SchemeData(Parcel parcel) {
            this.f7660l = new UUID(parcel.readLong(), parcel.readLong());
            this.f7661m = parcel.readString();
            this.f7662n = parcel.readString();
            this.f7663o = parcel.createByteArray();
            this.f7664p = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.DrmInitData$a */
    public static class C4006a implements Parcelable.Creator<DrmInitData> {
        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        /* renamed from: b */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this((String) null, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    /* renamed from: b */
    public static boolean m10368b(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f7660l.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: d */
    public static DrmInitData m10369d(@Nullable DrmInitData drmInitData, @Nullable DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.f7657m;
            for (SchemeData schemeData : drmInitData.f7655e) {
                if (schemeData.mo23991d()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f7657m;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f7655e) {
                if (schemeData2.mo23991d() && !m10368b(arrayList, size, schemeData2.f7660l)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, (List<SchemeData>) arrayList);
    }

    /* renamed from: a */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (C2627d.f3279a.equals(schemeData.f7660l)) {
            return C2627d.f3279a.equals(schemeData2.f7660l) ? 0 : 1;
        }
        return schemeData.f7660l.compareTo(schemeData2.f7660l);
    }

    /* renamed from: c */
    public DrmInitData mo23982c(@Nullable String str) {
        if (C3152e0.m7789b(this.f7657m, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f7655e);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public SchemeData mo23985e(int i) {
        return this.f7655e[i];
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (!C3152e0.m7789b(this.f7657m, drmInitData.f7657m) || !Arrays.equals(this.f7655e, drmInitData.f7655e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f7656l == 0) {
            String str = this.f7657m;
            this.f7656l = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7655e);
        }
        return this.f7656l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7657m);
        parcel.writeTypedArray(this.f7655e, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrmInitData(@androidx.annotation.Nullable java.lang.String r1, boolean r2, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f7657m = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
        L_0x000e:
            java.util.Arrays.sort(r3, r0)
            r0.f7655e = r3
            int r1 = r3.length
            r0.f7658n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.<init>(java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]):void");
    }

    public DrmInitData(Parcel parcel) {
        this.f7657m = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.f7655e = schemeDataArr;
        this.f7658n = schemeDataArr.length;
    }
}
