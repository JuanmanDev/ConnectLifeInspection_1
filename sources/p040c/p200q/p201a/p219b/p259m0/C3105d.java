package p040c.p200q.p201a.p219b.p259m0;

import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import p040c.p200q.p201a.p219b.C3213v;
import p040c.p200q.p201a.p219b.C3214w;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.m0.d */
/* compiled from: MappingTrackSelector */
public abstract class C3105d extends C3110g {

    /* renamed from: c.q.a.b.m0.d$a */
    /* compiled from: MappingTrackSelector */
    public static final class C3106a {

        /* renamed from: a */
        public final int f5674a;

        /* renamed from: b */
        public final int[] f5675b;

        /* renamed from: c */
        public final TrackGroupArray[] f5676c;

        /* renamed from: d */
        public final TrackGroupArray f5677d;

        public C3106a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f5675b = iArr;
            this.f5676c = trackGroupArrayArr;
            this.f5677d = trackGroupArray;
            this.f5674a = iArr.length;
        }

        /* renamed from: a */
        public int mo19838a() {
            return this.f5674a;
        }

        /* renamed from: b */
        public int mo19839b(int i) {
            return this.f5675b[i];
        }

        /* renamed from: c */
        public TrackGroupArray mo19840c(int i) {
            return this.f5676c[i];
        }
    }

    /* renamed from: e */
    public static int m7564e(C3213v[] vVarArr, TrackGroup trackGroup) {
        int length = vVarArr.length;
        int i = 0;
        for (int i2 = 0; i2 < vVarArr.length; i2++) {
            C3213v vVar = vVarArr[i2];
            for (int i3 = 0; i3 < trackGroup.f7826e; i3++) {
                int a = vVar.mo18904a(trackGroup.mo24200a(i3)) & 7;
                if (a > i) {
                    if (a == 4) {
                        return i2;
                    }
                    length = i2;
                    i = a;
                }
            }
        }
        return length;
    }

    /* renamed from: f */
    public static int[] m7565f(C3213v vVar, TrackGroup trackGroup) {
        int[] iArr = new int[trackGroup.f7826e];
        for (int i = 0; i < trackGroup.f7826e; i++) {
            iArr[i] = vVar.mo18904a(trackGroup.mo24200a(i));
        }
        return iArr;
    }

    /* renamed from: g */
    public static int[] m7566g(C3213v[] vVarArr) {
        int length = vVarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = vVarArr[i].mo18209n();
        }
        return iArr;
    }

    /* renamed from: c */
    public final void mo19835c(Object obj) {
        C3106a aVar = (C3106a) obj;
    }

    /* renamed from: d */
    public final C3112h mo19836d(C3213v[] vVarArr, TrackGroupArray trackGroupArray) {
        int[] iArr;
        int[] iArr2 = new int[(vVarArr.length + 1)];
        int length = vVarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr3 = new int[(vVarArr.length + 1)][][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroupArray.f7830e;
            trackGroupArr[i] = new TrackGroup[i2];
            iArr3[i] = new int[i2][];
        }
        int[] g = m7566g(vVarArr);
        for (int i3 = 0; i3 < trackGroupArray.f7830e; i3++) {
            TrackGroup a = trackGroupArray.mo24210a(i3);
            int e = m7564e(vVarArr, a);
            if (e == vVarArr.length) {
                iArr = new int[a.f7826e];
            } else {
                iArr = m7565f(vVarArr[e], a);
            }
            int i4 = iArr2[e];
            trackGroupArr[e][i4] = a;
            iArr3[e][i4] = iArr;
            iArr2[e] = iArr2[e] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[vVarArr.length];
        int[] iArr4 = new int[vVarArr.length];
        for (int i5 = 0; i5 < vVarArr.length; i5++) {
            int i6 = iArr2[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) C3152e0.m7783W(trackGroupArr[i5], i6));
            iArr3[i5] = (int[][]) C3152e0.m7783W(iArr3[i5], i6);
            iArr4[i5] = vVarArr[i5].mo18204h();
        }
        C3106a aVar = new C3106a(iArr4, trackGroupArrayArr, g, iArr3, new TrackGroupArray((TrackGroup[]) C3152e0.m7783W(trackGroupArr[vVarArr.length], iArr2[vVarArr.length])));
        Pair<C3214w[], C3107e[]> h = mo19837h(aVar, iArr3, g);
        return new C3112h((C3214w[]) h.first, (C3107e[]) h.second, aVar);
    }

    /* renamed from: h */
    public abstract Pair<C3214w[], C3107e[]> mo19837h(C3106a aVar, int[][][] iArr, int[] iArr2);
}
