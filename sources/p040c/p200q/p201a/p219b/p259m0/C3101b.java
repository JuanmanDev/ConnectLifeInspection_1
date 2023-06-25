package p040c.p200q.p201a.p219b.p259m0;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.m0.b */
/* compiled from: BaseTrackSelection */
public abstract class C3101b implements C3107e {

    /* renamed from: a */
    public final TrackGroup f5666a;

    /* renamed from: b */
    public final int f5667b;

    /* renamed from: c */
    public final int[] f5668c;

    /* renamed from: d */
    public final Format[] f5669d;

    /* renamed from: e */
    public final long[] f5670e;

    /* renamed from: f */
    public int f5671f;

    /* renamed from: c.q.a.b.m0.b$b */
    /* compiled from: BaseTrackSelection */
    public static final class C3103b implements Comparator<Format> {
        public C3103b() {
        }

        /* renamed from: a */
        public int compare(Format format, Format format2) {
            return format2.f7562m - format.f7562m;
        }
    }

    public C3101b(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        C3151e.m7759g(iArr.length > 0);
        C3151e.m7757e(trackGroup);
        this.f5666a = trackGroup;
        int length = iArr.length;
        this.f5667b = length;
        this.f5669d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f5669d[i2] = trackGroup.mo24200a(iArr[i2]);
        }
        Arrays.sort(this.f5669d, new C3103b());
        this.f5668c = new int[this.f5667b];
        while (true) {
            int i3 = this.f5667b;
            if (i < i3) {
                this.f5668c[i] = trackGroup.mo24201b(this.f5669d[i]);
                i++;
            } else {
                this.f5670e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final TrackGroup mo19820a() {
        return this.f5666a;
    }

    /* renamed from: c */
    public final boolean mo19821c(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean r = mo19832r(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f5667b && !r) {
            r = i2 != i && !mo19832r(i2, elapsedRealtime);
            i2++;
        }
        if (!r) {
            return false;
        }
        long[] jArr = this.f5670e;
        jArr[i] = Math.max(jArr[i], C3152e0.m7787a(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    /* renamed from: d */
    public void mo19822d() {
    }

    /* renamed from: e */
    public final Format mo19823e(int i) {
        return this.f5669d[i];
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3101b bVar = (C3101b) obj;
        if (this.f5666a != bVar.f5666a || !Arrays.equals(this.f5668c, bVar.f5668c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo19813f() {
    }

    /* renamed from: g */
    public final int mo19825g(int i) {
        return this.f5668c[i];
    }

    /* renamed from: h */
    public int mo19814h(long j, List<? extends C2884l> list) {
        return list.size();
    }

    public int hashCode() {
        if (this.f5671f == 0) {
            this.f5671f = (System.identityHashCode(this.f5666a) * 31) + Arrays.hashCode(this.f5668c);
        }
        return this.f5671f;
    }

    /* renamed from: i */
    public final int mo19827i(Format format) {
        for (int i = 0; i < this.f5667b; i++) {
            if (this.f5669d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo19828k() {
        return this.f5668c[mo19337b()];
    }

    /* renamed from: l */
    public final Format mo19829l() {
        return this.f5669d[mo19337b()];
    }

    public final int length() {
        return this.f5668c.length;
    }

    /* renamed from: n */
    public void mo19815n(float f) {
    }

    /* renamed from: q */
    public final int mo19831q(int i) {
        for (int i2 = 0; i2 < this.f5667b; i2++) {
            if (this.f5668c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final boolean mo19832r(int i, long j) {
        return this.f5670e[i] > j;
    }
}
