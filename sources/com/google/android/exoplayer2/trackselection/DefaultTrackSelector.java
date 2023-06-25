package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p040c.p200q.p201a.p219b.C3214w;
import p040c.p200q.p201a.p219b.p259m0.C3099a;
import p040c.p200q.p201a.p219b.p259m0.C3104c;
import p040c.p200q.p201a.p219b.p259m0.C3105d;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3118e;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

public class DefaultTrackSelector extends C3105d {

    /* renamed from: d */
    public static final int[] f7865d = new int[0];

    /* renamed from: b */
    public final C3107e.C3108a f7866b;

    /* renamed from: c */
    public final AtomicReference<Parameters> f7867c;

    public static final class Parameters implements Parcelable {
        public static final Parcelable.Creator<Parameters> CREATOR = new C4050a();

        /* renamed from: E */
        public static final Parameters f7868E = new Parameters();

        /* renamed from: A */
        public final boolean f7869A;

        /* renamed from: B */
        public final boolean f7870B;

        /* renamed from: C */
        public final boolean f7871C;

        /* renamed from: D */
        public final int f7872D;

        /* renamed from: e */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f7873e;

        /* renamed from: l */
        public final SparseBooleanArray f7874l;
        @Nullable

        /* renamed from: m */
        public final String f7875m;
        @Nullable

        /* renamed from: n */
        public final String f7876n;

        /* renamed from: o */
        public final boolean f7877o;

        /* renamed from: p */
        public final int f7878p;

        /* renamed from: q */
        public final int f7879q;

        /* renamed from: r */
        public final int f7880r;

        /* renamed from: s */
        public final int f7881s;

        /* renamed from: t */
        public final int f7882t;

        /* renamed from: u */
        public final boolean f7883u;

        /* renamed from: v */
        public final int f7884v;

        /* renamed from: w */
        public final int f7885w;

        /* renamed from: x */
        public final boolean f7886x;

        /* renamed from: y */
        public final boolean f7887y;

        /* renamed from: z */
        public final boolean f7888z;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$a */
        public static class C4050a implements Parcelable.Creator<Parameters> {
            /* renamed from: a */
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            /* renamed from: b */
            public Parameters[] newArray(int i) {
                return new Parameters[i];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Parameters() {
            /*
                r21 = this;
                r0 = r21
                android.util.SparseArray r2 = new android.util.SparseArray
                r1 = r2
                r2.<init>()
                android.util.SparseBooleanArray r3 = new android.util.SparseBooleanArray
                r2 = r3
                r3.<init>()
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 1
                r11 = 2147483647(0x7fffffff, float:NaN)
                r12 = 2147483647(0x7fffffff, float:NaN)
                r13 = 2147483647(0x7fffffff, float:NaN)
                r14 = 2147483647(0x7fffffff, float:NaN)
                r15 = 1
                r16 = 1
                r17 = 2147483647(0x7fffffff, float:NaN)
                r18 = 2147483647(0x7fffffff, float:NaN)
                r19 = 1
                r20 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.<init>():void");
        }

        /* renamed from: a */
        public static boolean m10644a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: b */
        public static boolean m10645b(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m10646c(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m10646c(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7789b(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.m10646c(java.util.Map, java.util.Map):boolean");
        }

        /* renamed from: g */
        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> m10647g(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        /* renamed from: h */
        public static void m10648h(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        /* renamed from: d */
        public final boolean mo24246d(int i) {
            return this.f7874l.get(i);
        }

        public int describeContents() {
            return 0;
        }

        @Nullable
        /* renamed from: e */
        public final SelectionOverride mo24248e(int i, TrackGroupArray trackGroupArray) {
            Map map = this.f7873e.get(i);
            if (map != null) {
                return (SelectionOverride) map.get(trackGroupArray);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            if (this.f7877o == parameters.f7877o && this.f7878p == parameters.f7878p && this.f7887y == parameters.f7887y && this.f7888z == parameters.f7888z && this.f7869A == parameters.f7869A && this.f7870B == parameters.f7870B && this.f7879q == parameters.f7879q && this.f7880r == parameters.f7880r && this.f7881s == parameters.f7881s && this.f7883u == parameters.f7883u && this.f7871C == parameters.f7871C && this.f7886x == parameters.f7886x && this.f7884v == parameters.f7884v && this.f7885w == parameters.f7885w && this.f7882t == parameters.f7882t && this.f7872D == parameters.f7872D && TextUtils.equals(this.f7875m, parameters.f7875m) && TextUtils.equals(this.f7876n, parameters.f7876n) && m10644a(this.f7874l, parameters.f7874l) && m10645b(this.f7873e, parameters.f7873e)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final boolean mo24250f(int i, TrackGroupArray trackGroupArray) {
            Map map = this.f7873e.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        public int hashCode() {
            int i;
            int i2 = (((((((((((((((((((((((((((((((this.f7877o ? 1 : 0) * true) + this.f7878p) * 31) + (this.f7887y ? 1 : 0)) * 31) + (this.f7888z ? 1 : 0)) * 31) + (this.f7869A ? 1 : 0)) * 31) + (this.f7870B ? 1 : 0)) * 31) + this.f7879q) * 31) + this.f7880r) * 31) + this.f7881s) * 31) + (this.f7883u ? 1 : 0)) * 31) + (this.f7871C ? 1 : 0)) * 31) + (this.f7886x ? 1 : 0)) * 31) + this.f7884v) * 31) + this.f7885w) * 31) + this.f7882t) * 31) + this.f7872D) * 31;
            String str = this.f7875m;
            int i3 = 0;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            int i4 = (i2 + i) * 31;
            String str2 = this.f7876n;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            return i4 + i3;
        }

        public void writeToParcel(Parcel parcel, int i) {
            m10648h(parcel, this.f7873e);
            parcel.writeSparseBooleanArray(this.f7874l);
            parcel.writeString(this.f7875m);
            parcel.writeString(this.f7876n);
            C3152e0.m7814n0(parcel, this.f7877o);
            parcel.writeInt(this.f7878p);
            C3152e0.m7814n0(parcel, this.f7887y);
            C3152e0.m7814n0(parcel, this.f7888z);
            C3152e0.m7814n0(parcel, this.f7869A);
            C3152e0.m7814n0(parcel, this.f7870B);
            parcel.writeInt(this.f7879q);
            parcel.writeInt(this.f7880r);
            parcel.writeInt(this.f7881s);
            parcel.writeInt(this.f7882t);
            C3152e0.m7814n0(parcel, this.f7883u);
            C3152e0.m7814n0(parcel, this.f7871C);
            parcel.writeInt(this.f7884v);
            parcel.writeInt(this.f7885w);
            C3152e0.m7814n0(parcel, this.f7886x);
            parcel.writeInt(this.f7872D);
        }

        public Parameters(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, @Nullable String str, @Nullable String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2, int i3, int i4, int i5, boolean z6, boolean z7, int i6, int i7, boolean z8, int i8) {
            this.f7873e = sparseArray;
            this.f7874l = sparseBooleanArray;
            this.f7875m = C3152e0.m7782V(str);
            this.f7876n = C3152e0.m7782V(str2);
            this.f7877o = z;
            this.f7878p = i;
            this.f7887y = z2;
            this.f7888z = z3;
            this.f7869A = z4;
            this.f7870B = z5;
            this.f7879q = i2;
            this.f7880r = i3;
            this.f7881s = i4;
            this.f7882t = i5;
            this.f7883u = z6;
            this.f7871C = z7;
            this.f7884v = i6;
            this.f7885w = i7;
            this.f7886x = z8;
            this.f7872D = i8;
        }

        public Parameters(Parcel parcel) {
            this.f7873e = m10647g(parcel);
            this.f7874l = parcel.readSparseBooleanArray();
            this.f7875m = parcel.readString();
            this.f7876n = parcel.readString();
            this.f7877o = C3152e0.m7786Z(parcel);
            this.f7878p = parcel.readInt();
            this.f7887y = C3152e0.m7786Z(parcel);
            this.f7888z = C3152e0.m7786Z(parcel);
            this.f7869A = C3152e0.m7786Z(parcel);
            this.f7870B = C3152e0.m7786Z(parcel);
            this.f7879q = parcel.readInt();
            this.f7880r = parcel.readInt();
            this.f7881s = parcel.readInt();
            this.f7882t = parcel.readInt();
            this.f7883u = C3152e0.m7786Z(parcel);
            this.f7871C = C3152e0.m7786Z(parcel);
            this.f7884v = parcel.readInt();
            this.f7885w = parcel.readInt();
            this.f7886x = C3152e0.m7786Z(parcel);
            this.f7872D = parcel.readInt();
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new C4051a();

        /* renamed from: e */
        public final int f7889e;

        /* renamed from: l */
        public final int[] f7890l;

        /* renamed from: m */
        public final int f7891m;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$a */
        public static class C4051a implements Parcelable.Creator<SelectionOverride> {
            /* renamed from: a */
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            /* renamed from: b */
            public SelectionOverride[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        public SelectionOverride(Parcel parcel) {
            this.f7889e = parcel.readInt();
            int readByte = parcel.readByte();
            this.f7891m = readByte;
            int[] iArr = new int[readByte];
            this.f7890l = iArr;
            parcel.readIntArray(iArr);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            if (this.f7889e != selectionOverride.f7889e || !Arrays.equals(this.f7890l, selectionOverride.f7890l)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f7889e * 31) + Arrays.hashCode(this.f7890l);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f7889e);
            parcel.writeInt(this.f7890l.length);
            parcel.writeIntArray(this.f7890l);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a */
    public static final class C4052a {

        /* renamed from: a */
        public final int f7892a;

        /* renamed from: b */
        public final int f7893b;
        @Nullable

        /* renamed from: c */
        public final String f7894c;

        public C4052a(int i, int i2, @Nullable String str) {
            this.f7892a = i;
            this.f7893b = i2;
            this.f7894c = str;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4052a.class != obj.getClass()) {
                return false;
            }
            C4052a aVar = (C4052a) obj;
            if (this.f7892a == aVar.f7892a && this.f7893b == aVar.f7893b && TextUtils.equals(this.f7894c, aVar.f7894c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = ((this.f7892a * 31) + this.f7893b) * 31;
            String str = this.f7894c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b */
    public static final class C4053b implements Comparable<C4053b> {

        /* renamed from: e */
        public final Parameters f7895e;

        /* renamed from: l */
        public final int f7896l;

        /* renamed from: m */
        public final int f7897m;

        /* renamed from: n */
        public final int f7898n;

        /* renamed from: o */
        public final int f7899o;

        /* renamed from: p */
        public final int f7900p;

        /* renamed from: q */
        public final int f7901q;

        public C4053b(Format format, Parameters parameters, int i) {
            this.f7895e = parameters;
            int i2 = 0;
            this.f7896l = DefaultTrackSelector.m10632u(i, false) ? 1 : 0;
            this.f7897m = DefaultTrackSelector.m10624m(format, parameters.f7875m) ? 1 : 0;
            this.f7898n = (format.f7556I & 1) != 0 ? 1 : i2;
            this.f7899o = format.f7551D;
            this.f7900p = format.f7552E;
            this.f7901q = format.f7562m;
        }

        /* renamed from: c */
        public int compareTo(@NonNull C4053b bVar) {
            int i;
            int i2 = this.f7896l;
            int i3 = bVar.f7896l;
            if (i2 != i3) {
                return DefaultTrackSelector.m10622k(i2, i3);
            }
            int i4 = this.f7897m;
            int i5 = bVar.f7897m;
            if (i4 != i5) {
                return DefaultTrackSelector.m10622k(i4, i5);
            }
            int i6 = this.f7898n;
            int i7 = bVar.f7898n;
            if (i6 != i7) {
                return DefaultTrackSelector.m10622k(i6, i7);
            }
            if (this.f7895e.f7887y) {
                return DefaultTrackSelector.m10622k(bVar.f7901q, this.f7901q);
            }
            int i8 = 1;
            if (i2 != 1) {
                i8 = -1;
            }
            int i9 = this.f7899o;
            int i10 = bVar.f7899o;
            if (i9 != i10) {
                i = DefaultTrackSelector.m10622k(i9, i10);
            } else {
                int i11 = this.f7900p;
                int i12 = bVar.f7900p;
                if (i11 != i12) {
                    i = DefaultTrackSelector.m10622k(i11, i12);
                } else {
                    i = DefaultTrackSelector.m10622k(this.f7901q, bVar.f7901q);
                }
            }
            return i8 * i;
        }
    }

    public DefaultTrackSelector() {
        this(new C3099a.C3100a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0094, code lost:
        if (m10621j(r2.f7562m, r10) < 0) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p219b.p259m0.C3107e m10619C(com.google.android.exoplayer2.source.TrackGroupArray r18, int[][] r19, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r20) {
        /*
            r0 = r18
            r1 = r20
            r3 = -1
            r9 = r3
            r10 = r9
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000b:
            int r11 = r0.f7830e
            if (r5 >= r11) goto L_0x00d2
            com.google.android.exoplayer2.source.TrackGroup r11 = r0.mo24210a(r5)
            int r12 = r1.f7884v
            int r13 = r1.f7885w
            boolean r14 = r1.f7886x
            java.util.List r12 = m10631t(r11, r12, r13, r14)
            r13 = r19[r5]
            r14 = 0
        L_0x0020:
            int r15 = r11.f7826e
            if (r14 >= r15) goto L_0x00cb
            r15 = r13[r14]
            boolean r2 = r1.f7871C
            boolean r2 = m10632u(r15, r2)
            if (r2 == 0) goto L_0x00c4
            com.google.android.exoplayer2.Format r2 = r11.mo24200a(r14)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r15 = r12.contains(r15)
            r16 = 1
            if (r15 == 0) goto L_0x0068
            int r15 = r2.f7571v
            if (r15 == r3) goto L_0x0046
            int r4 = r1.f7879q
            if (r15 > r4) goto L_0x0068
        L_0x0046:
            int r4 = r2.f7572w
            if (r4 == r3) goto L_0x004e
            int r15 = r1.f7880r
            if (r4 > r15) goto L_0x0068
        L_0x004e:
            float r4 = r2.f7573x
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r15 == 0) goto L_0x005d
            int r15 = r1.f7881s
            float r15 = (float) r15
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 > 0) goto L_0x0068
        L_0x005d:
            int r4 = r2.f7562m
            if (r4 == r3) goto L_0x0065
            int r15 = r1.f7882t
            if (r4 > r15) goto L_0x0068
        L_0x0065:
            r4 = r16
            goto L_0x0069
        L_0x0068:
            r4 = 0
        L_0x0069:
            if (r4 != 0) goto L_0x0070
            boolean r15 = r1.f7883u
            if (r15 != 0) goto L_0x0070
            goto L_0x00c4
        L_0x0070:
            if (r4 == 0) goto L_0x0074
            r15 = 2
            goto L_0x0076
        L_0x0074:
            r15 = r16
        L_0x0076:
            r3 = r13[r14]
            r0 = 0
            boolean r3 = m10632u(r3, r0)
            if (r3 == 0) goto L_0x0081
            int r15 = r15 + 1000
        L_0x0081:
            if (r15 <= r8) goto L_0x0086
            r17 = r16
            goto L_0x0088
        L_0x0086:
            r17 = r0
        L_0x0088:
            if (r15 != r8) goto L_0x00b7
            boolean r0 = r1.f7887y
            if (r0 == 0) goto L_0x009c
            int r0 = r2.f7562m
            int r0 = m10621j(r0, r10)
            if (r0 >= 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r16 = 0
        L_0x0099:
            r17 = r16
            goto L_0x00b7
        L_0x009c:
            int r0 = r2.mo23926z()
            if (r0 == r9) goto L_0x00a7
            int r0 = m10621j(r0, r9)
            goto L_0x00ad
        L_0x00a7:
            int r0 = r2.f7562m
            int r0 = m10621j(r0, r10)
        L_0x00ad:
            if (r3 == 0) goto L_0x00b4
            if (r4 == 0) goto L_0x00b4
            if (r0 <= 0) goto L_0x0097
            goto L_0x0099
        L_0x00b4:
            if (r0 >= 0) goto L_0x0097
            goto L_0x0099
        L_0x00b7:
            if (r17 == 0) goto L_0x00c4
            int r0 = r2.f7562m
            int r2 = r2.mo23926z()
            r10 = r0
            r9 = r2
            r6 = r11
            r7 = r14
            r8 = r15
        L_0x00c4:
            int r14 = r14 + 1
            r0 = r18
            r3 = -1
            goto L_0x0020
        L_0x00cb:
            int r5 = r5 + 1
            r0 = r18
            r3 = -1
            goto L_0x000b
        L_0x00d2:
            if (r6 != 0) goto L_0x00d6
            r2 = 0
            goto L_0x00db
        L_0x00d6:
            c.q.a.b.m0.c r2 = new c.q.a.b.m0.c
            r2.<init>(r6, r7)
        L_0x00db:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10619C(com.google.android.exoplayer2.source.TrackGroupArray, int[][], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):c.q.a.b.m0.e");
    }

    /* renamed from: j */
    public static int m10621j(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* renamed from: k */
    public static int m10622k(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: l */
    public static void m10623l(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            TrackGroup trackGroup2 = trackGroup;
            if (!m10634w(trackGroup.mo24200a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                list2.remove(size);
            }
        }
    }

    /* renamed from: m */
    public static boolean m10624m(Format format, @Nullable String str) {
        return str != null && TextUtils.equals(str, C3152e0.m7782V(format.f7557J));
    }

    /* renamed from: n */
    public static boolean m10625n(Format format) {
        return TextUtils.isEmpty(format.f7557J) || m10624m(format, "und");
    }

    /* renamed from: o */
    public static int m10626o(TrackGroup trackGroup, int[] iArr, C4052a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.f7826e; i2++) {
            if (m10633v(trackGroup.mo24200a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: p */
    public static int[] m10627p(TrackGroup trackGroup, int[] iArr, boolean z) {
        int o;
        HashSet hashSet = new HashSet();
        C4052a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.f7826e; i2++) {
            Format a = trackGroup.mo24200a(i2);
            C4052a aVar2 = new C4052a(a.f7551D, a.f7552E, z ? null : a.f7566q);
            if (hashSet.add(aVar2) && (o = m10626o(trackGroup, iArr, aVar2)) > i) {
                i = o;
                aVar = aVar2;
            }
        }
        if (i <= 1) {
            return f7865d;
        }
        int[] iArr2 = new int[i];
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroup.f7826e; i4++) {
            Format a2 = trackGroup.mo24200a(i4);
            int i5 = iArr[i4];
            C3151e.m7757e(aVar);
            if (m10633v(a2, i5, aVar)) {
                iArr2[i3] = i4;
                i3++;
            }
        }
        return iArr2;
    }

    /* renamed from: q */
    public static int m10628q(TrackGroup trackGroup, int[] iArr, int i, @Nullable String str, int i2, int i3, int i4, int i5, List<Integer> list) {
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            int intValue = list.get(i7).intValue();
            TrackGroup trackGroup2 = trackGroup;
            if (m10634w(trackGroup.mo24200a(intValue), str, iArr[intValue], i, i2, i3, i4, i5)) {
                i6++;
            }
        }
        return i6;
    }

    /* renamed from: r */
    public static int[] m10629r(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z2) {
        String str;
        TrackGroup trackGroup2 = trackGroup;
        if (trackGroup2.f7826e < 2) {
            return f7865d;
        }
        List<Integer> t = m10631t(trackGroup2, i6, i7, z2);
        if (t.size() < 2) {
            return f7865d;
        }
        if (!z) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i8 = 0;
            for (int i9 = 0; i9 < t.size(); i9++) {
                String str3 = trackGroup2.mo24200a(t.get(i9).intValue()).f7566q;
                if (hashSet.add(str3)) {
                    String str4 = str3;
                    int q = m10628q(trackGroup, iArr, i, str3, i2, i3, i4, i5, t);
                    if (q > i8) {
                        i8 = q;
                        str2 = str4;
                    }
                }
            }
            str = str2;
        } else {
            str = null;
        }
        m10623l(trackGroup, iArr, i, str, i2, i3, i4, i5, t);
        return t.size() < 2 ? f7865d : C3152e0.m7808k0(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m10630s(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = r3
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = r0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7801h(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p040c.p200q.p201a.p219b.p261o0.C3152e0.m7801h(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10630s(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: t */
    public static List<Integer> m10631t(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(trackGroup.f7826e);
        for (int i4 = 0; i4 < trackGroup.f7826e; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (!(i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE)) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < trackGroup.f7826e; i6++) {
                Format a = trackGroup.mo24200a(i6);
                int i7 = a.f7571v;
                if (i7 > 0 && (i3 = a.f7572w) > 0) {
                    Point s = m10630s(z, i, i2, i7, i3);
                    int i8 = a.f7571v;
                    int i9 = a.f7572w;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (((float) s.x) * 0.98f)) && i9 >= ((int) (((float) s.y) * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int z2 = trackGroup.mo24200a(((Integer) arrayList.get(size)).intValue()).mo23926z();
                    if (z2 == -1 || z2 > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: u */
    public static boolean m10632u(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: v */
    public static boolean m10633v(Format format, int i, C4052a aVar) {
        if (!m10632u(i, false) || format.f7551D != aVar.f7892a || format.f7552E != aVar.f7893b) {
            return false;
        }
        String str = aVar.f7894c;
        if (str == null || TextUtils.equals(str, format.f7566q)) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m10634w(Format format, @Nullable String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!m10632u(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !C3152e0.m7789b(format.f7566q, str)) {
            return false;
        }
        int i7 = format.f7571v;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = format.f7572w;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f = format.f7573x;
        if (f != -1.0f && f > ((float) i5)) {
            return false;
        }
        int i9 = format.f7562m;
        if (i9 == -1 || i9 <= i6) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public static void m10635x(C3105d.C3106a aVar, int[][][] iArr, C3214w[] wVarArr, C3107e[] eVarArr, int i) {
        boolean z;
        if (i != 0) {
            boolean z2 = false;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            while (true) {
                if (i2 >= aVar.mo19838a()) {
                    z = true;
                    break;
                }
                int b = aVar.mo19839b(i2);
                C3107e eVar = eVarArr[i2];
                if ((b == 1 || b == 2) && eVar != null && m10636y(iArr[i2], aVar.mo19840c(i2), eVar)) {
                    if (b == 1) {
                        if (i4 != -1) {
                            break;
                        }
                        i4 = i2;
                    } else if (i3 != -1) {
                        break;
                    } else {
                        i3 = i2;
                    }
                }
                i2++;
            }
            z = false;
            if (!(i4 == -1 || i3 == -1)) {
                z2 = true;
            }
            if (z && z2) {
                C3214w wVar = new C3214w(i);
                wVarArr[i4] = wVar;
                wVarArr[i3] = wVar;
            }
        }
    }

    /* renamed from: y */
    public static boolean m10636y(int[][] iArr, TrackGroupArray trackGroupArray, C3107e eVar) {
        if (eVar == null) {
            return false;
        }
        int b = trackGroupArray.mo24211b(eVar.mo19820a());
        for (int i = 0; i < eVar.length(); i++) {
            if ((iArr[b][eVar.mo19825g(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: z */
    public static C3107e m10637z(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, C3107e.C3108a aVar, C3118e eVar) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i2 = parameters2.f7870B ? 24 : 16;
        boolean z = parameters2.f7869A && (i & i2) != 0;
        int i3 = 0;
        while (i3 < trackGroupArray2.f7830e) {
            TrackGroup a = trackGroupArray2.mo24210a(i3);
            TrackGroup trackGroup = a;
            int[] r = m10629r(a, iArr[i3], z, i2, parameters2.f7879q, parameters2.f7880r, parameters2.f7881s, parameters2.f7882t, parameters2.f7884v, parameters2.f7885w, parameters2.f7886x);
            if (r.length > 0) {
                C3151e.m7757e(aVar);
                return aVar.mo19818a(trackGroup, eVar, r);
            }
            C3118e eVar2 = eVar;
            i3++;
            trackGroupArray2 = trackGroupArray;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040c.p200q.p201a.p219b.p259m0.C3107e[] mo24241A(p040c.p200q.p201a.p219b.p259m0.C3105d.C3106a r21, int[][][] r22, int[] r23, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r24) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            r8 = r24
            int r9 = r21.mo19838a()
            c.q.a.b.m0.e[] r10 = new p040c.p200q.p201a.p219b.p259m0.C3107e[r9]
            r11 = 0
            r0 = r11
            r12 = r0
            r13 = r12
        L_0x0010:
            r14 = 2
            r15 = 1
            if (r12 >= r9) goto L_0x0045
            int r1 = r7.mo19839b(r12)
            if (r14 != r1) goto L_0x0042
            if (r0 != 0) goto L_0x0037
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r7.mo19840c(r12)
            r2 = r22[r12]
            r3 = r23[r12]
            c.q.a.b.m0.e$a r5 = r6.f7866b
            r0 = r20
            r4 = r24
            c.q.a.b.m0.e r0 = r0.mo24245F(r1, r2, r3, r4, r5)
            r10[r12] = r0
            r0 = r10[r12]
            if (r0 == 0) goto L_0x0036
            r0 = r15
            goto L_0x0037
        L_0x0036:
            r0 = r11
        L_0x0037:
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r7.mo19840c(r12)
            int r1 = r1.f7830e
            if (r1 <= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r15 = r11
        L_0x0041:
            r13 = r13 | r15
        L_0x0042:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x0045:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = -1
            r16 = 0
            r5 = r11
            r2 = r12
            r4 = r2
            r3 = r16
            r11 = r0
        L_0x0050:
            if (r5 >= r9) goto L_0x00ee
            int r0 = r7.mo19839b(r5)
            if (r0 == r15) goto L_0x009e
            if (r0 == r14) goto L_0x0097
            r1 = 3
            if (r0 == r1) goto L_0x006a
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r7.mo19840c(r5)
            r14 = r22[r5]
            c.q.a.b.m0.e r0 = r6.mo24243D(r0, r1, r14, r8)
            r10[r5] = r0
            goto L_0x0097
        L_0x006a:
            com.google.android.exoplayer2.source.TrackGroupArray r0 = r7.mo19840c(r5)
            r1 = r22[r5]
            android.util.Pair r0 = r6.mo24244E(r0, r1, r8)
            if (r0 == 0) goto L_0x0097
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 <= r11) goto L_0x0097
            if (r4 == r12) goto L_0x0084
            r10[r4] = r16
        L_0x0084:
            java.lang.Object r1 = r0.first
            c.q.a.b.m0.e r1 = (p040c.p200q.p201a.p219b.p259m0.C3107e) r1
            r10[r5] = r1
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r11 = r0
            r4 = r5
            r19 = r4
            goto L_0x00e8
        L_0x0097:
            r15 = r2
            r14 = r3
            r17 = r4
            r19 = r5
            goto L_0x00e4
        L_0x009e:
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r7.mo19840c(r5)
            r14 = r22[r5]
            r17 = r23[r5]
            if (r13 == 0) goto L_0x00ab
            r18 = r16
            goto L_0x00af
        L_0x00ab:
            c.q.a.b.m0.e$a r0 = r6.f7866b
            r18 = r0
        L_0x00af:
            r0 = r20
            r15 = r2
            r2 = r14
            r14 = r3
            r3 = r17
            r17 = r4
            r4 = r24
            r19 = r5
            r5 = r18
            android.util.Pair r0 = r0.mo24242B(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00e4
            if (r14 == 0) goto L_0x00d0
            java.lang.Object r1 = r0.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C4053b) r1
            int r1 = r1.compareTo(r14)
            if (r1 <= 0) goto L_0x00e4
        L_0x00d0:
            if (r15 == r12) goto L_0x00d4
            r10[r15] = r16
        L_0x00d4:
            java.lang.Object r1 = r0.first
            c.q.a.b.m0.e r1 = (p040c.p200q.p201a.p219b.p259m0.C3107e) r1
            r10[r19] = r1
            java.lang.Object r0 = r0.second
            r3 = r0
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b r3 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C4053b) r3
            r4 = r17
            r2 = r19
            goto L_0x00e8
        L_0x00e4:
            r3 = r14
            r2 = r15
            r4 = r17
        L_0x00e8:
            int r5 = r19 + 1
            r14 = 2
            r15 = 1
            goto L_0x0050
        L_0x00ee:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.mo24241A(c.q.a.b.m0.d$a, int[][][], int[], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):c.q.a.b.m0.e[]");
    }

    @Nullable
    /* renamed from: B */
    public Pair<C3107e, C4053b> mo24242B(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, @Nullable C3107e.C3108a aVar) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        C3107e.C3108a aVar2 = aVar;
        C3107e eVar = null;
        C4053b bVar = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < trackGroupArray2.f7830e; i4++) {
            TrackGroup a = trackGroupArray2.mo24210a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a.f7826e; i5++) {
                if (m10632u(iArr2[i5], parameters2.f7871C)) {
                    C4053b bVar2 = new C4053b(a.mo24200a(i5), parameters2, iArr2[i5]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup a2 = trackGroupArray2.mo24210a(i2);
        if (!parameters2.f7888z && !parameters2.f7887y && aVar2 != null) {
            int[] p = m10627p(a2, iArr[i2], parameters2.f7869A);
            if (p.length > 0) {
                eVar = aVar2.mo19818a(a2, mo19846a(), p);
            }
        }
        if (eVar == null) {
            eVar = new C3104c(a2, i3);
        }
        C3151e.m7757e(bVar);
        return Pair.create(eVar, bVar);
    }

    @Nullable
    /* renamed from: D */
    public C3107e mo24243D(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroupArray.f7830e; i4++) {
            TrackGroup a = trackGroupArray.mo24210a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a.f7826e; i5++) {
                if (m10632u(iArr2[i5], parameters.f7871C)) {
                    int i6 = 1;
                    if ((a.mo24200a(i5).f7556I & 1) != 0) {
                        i6 = 2;
                    }
                    if (m10632u(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i3) {
                        trackGroup = a;
                        i2 = i5;
                        i3 = i6;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new C3104c(trackGroup, i2);
    }

    @Nullable
    /* renamed from: E */
    public Pair<C3107e, Integer> mo24244E(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i = 0;
        int i2 = 0;
        TrackGroup trackGroup = null;
        for (int i3 = 0; i3 < trackGroupArray2.f7830e; i3++) {
            TrackGroup a = trackGroupArray2.mo24210a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a.f7826e; i4++) {
                if (m10632u(iArr2[i4], parameters2.f7871C)) {
                    Format a2 = a.mo24200a(i4);
                    int i5 = a2.f7556I & (~parameters2.f7878p);
                    int i6 = 1;
                    boolean z = (i5 & 1) != 0;
                    boolean z2 = (i5 & 2) != 0;
                    boolean m = m10624m(a2, parameters2.f7876n);
                    if (m || (parameters2.f7877o && m10625n(a2))) {
                        i6 = (z ? 8 : !z2 ? 6 : 4) + (m ? 1 : 0);
                    } else if (z) {
                        i6 = 3;
                    } else if (z2) {
                        if (m10624m(a2, parameters2.f7875m)) {
                            i6 = 2;
                        }
                    }
                    if (m10632u(iArr2[i4], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i2) {
                        trackGroup = a;
                        i = i4;
                        i2 = i6;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new C3104c(trackGroup, i), Integer.valueOf(i2));
    }

    @Nullable
    /* renamed from: F */
    public C3107e mo24245F(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, @Nullable C3107e.C3108a aVar) {
        C3107e z = (parameters.f7888z || parameters.f7887y || aVar == null) ? null : m10637z(trackGroupArray, iArr, i, parameters, aVar, mo19846a());
        return z == null ? m10619C(trackGroupArray, iArr, parameters) : z;
    }

    /* renamed from: h */
    public final Pair<C3214w[], C3107e[]> mo19837h(C3105d.C3106a aVar, int[][][] iArr, int[] iArr2) {
        Parameters parameters = this.f7867c.get();
        int a = aVar.mo19838a();
        C3107e[] A = mo24241A(aVar, iArr, iArr2, parameters);
        for (int i = 0; i < a; i++) {
            if (parameters.mo24246d(i)) {
                A[i] = null;
            } else {
                TrackGroupArray c = aVar.mo19840c(i);
                if (parameters.mo24250f(i, c)) {
                    SelectionOverride e = parameters.mo24248e(i, c);
                    if (e == null) {
                        A[i] = null;
                    } else if (e.f7891m == 1) {
                        A[i] = new C3104c(c.mo24210a(e.f7889e), e.f7890l[0]);
                    } else {
                        C3107e.C3108a aVar2 = this.f7866b;
                        C3151e.m7757e(aVar2);
                        A[i] = aVar2.mo19818a(c.mo24210a(e.f7889e), mo19846a(), e.f7890l);
                    }
                }
            }
        }
        C3214w[] wVarArr = new C3214w[a];
        for (int i2 = 0; i2 < a; i2++) {
            wVarArr[i2] = !parameters.mo24246d(i2) && (aVar.mo19839b(i2) == 6 || A[i2] != null) ? C3214w.f6046b : null;
        }
        m10635x(aVar, iArr, wVarArr, A, parameters.f7872D);
        return Pair.create(wVarArr, A);
    }

    public DefaultTrackSelector(C3107e.C3108a aVar) {
        this.f7866b = aVar;
        this.f7867c = new AtomicReference<>(Parameters.f7868E);
    }
}
