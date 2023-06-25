package p040c.p200q.p201a.p219b.p259m0;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.List;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2885m;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3118e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3153f;

/* renamed from: c.q.a.b.m0.a */
/* compiled from: AdaptiveTrackSelection */
public class C3099a extends C3101b {

    /* renamed from: g */
    public final C3118e f5646g;

    /* renamed from: h */
    public final long f5647h;

    /* renamed from: i */
    public final long f5648i;

    /* renamed from: j */
    public final long f5649j;

    /* renamed from: k */
    public final float f5650k;

    /* renamed from: l */
    public final float f5651l;

    /* renamed from: m */
    public final long f5652m;

    /* renamed from: n */
    public final C3153f f5653n;

    /* renamed from: o */
    public float f5654o = 1.0f;

    /* renamed from: p */
    public int f5655p = mo19816s(Long.MIN_VALUE);

    /* renamed from: q */
    public int f5656q = 1;

    /* renamed from: r */
    public long f5657r = -9223372036854775807L;

    /* renamed from: c.q.a.b.m0.a$a */
    /* compiled from: AdaptiveTrackSelection */
    public static final class C3100a implements C3107e.C3108a {
        @Nullable

        /* renamed from: a */
        public final C3118e f5658a;

        /* renamed from: b */
        public final int f5659b;

        /* renamed from: c */
        public final int f5660c;

        /* renamed from: d */
        public final int f5661d;

        /* renamed from: e */
        public final float f5662e;

        /* renamed from: f */
        public final float f5663f;

        /* renamed from: g */
        public final long f5664g;

        /* renamed from: h */
        public final C3153f f5665h;

        public C3100a() {
            this(10000, 25000, 25000, 0.75f, 0.75f, ItemTouchHelper.Callback.DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS, C3153f.f5828a);
        }

        /* renamed from: b */
        public C3099a mo19818a(TrackGroup trackGroup, C3118e eVar, int... iArr) {
            C3118e eVar2 = this.f5658a;
            return new C3099a(trackGroup, iArr, eVar2 != null ? eVar2 : eVar, (long) this.f5659b, (long) this.f5660c, (long) this.f5661d, this.f5662e, this.f5663f, this.f5664g, this.f5665h);
        }

        public C3100a(int i, int i2, int i3, float f, float f2, long j, C3153f fVar) {
            this((C3118e) null, i, i2, i3, f, f2, j, fVar);
        }

        @Deprecated
        public C3100a(@Nullable C3118e eVar, int i, int i2, int i3, float f, float f2, long j, C3153f fVar) {
            this.f5658a = eVar;
            this.f5659b = i;
            this.f5660c = i2;
            this.f5661d = i3;
            this.f5662e = f;
            this.f5663f = f2;
            this.f5664g = j;
            this.f5665h = fVar;
        }
    }

    public C3099a(TrackGroup trackGroup, int[] iArr, C3118e eVar, long j, long j2, long j3, float f, float f2, long j4, C3153f fVar) {
        super(trackGroup, iArr);
        this.f5646g = eVar;
        this.f5647h = j * 1000;
        this.f5648i = j2 * 1000;
        this.f5649j = j3 * 1000;
        this.f5650k = f;
        this.f5651l = f2;
        this.f5652m = j4;
        this.f5653n = fVar;
    }

    /* renamed from: b */
    public int mo19337b() {
        return this.f5655p;
    }

    /* renamed from: f */
    public void mo19813f() {
        this.f5657r = -9223372036854775807L;
    }

    /* renamed from: h */
    public int mo19814h(long j, List<? extends C2884l> list) {
        int i;
        int i2;
        long b = this.f5653n.mo19953b();
        long j2 = this.f5657r;
        if (j2 != -9223372036854775807L && b - j2 < this.f5652m) {
            return list.size();
        }
        this.f5657r = b;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (C3152e0.m7771K(((C2884l) list.get(size - 1)).f4558f - j, this.f5654o) < this.f5649j) {
            return size;
        }
        Format e = mo19823e(mo19816s(b));
        for (int i3 = 0; i3 < size; i3++) {
            C2884l lVar = (C2884l) list.get(i3);
            Format format = lVar.f4555c;
            if (C3152e0.m7771K(lVar.f4558f - j, this.f5654o) >= this.f5649j && format.f7562m < e.f7562m && (i = format.f7572w) != -1 && i < 720 && (i2 = format.f7571v) != -1 && i2 < 1280 && i < e.f7572w) {
                return i3;
            }
        }
        return size;
    }

    /* renamed from: j */
    public void mo19338j(long j, long j2, long j3, List<? extends C2884l> list, C2885m[] mVarArr) {
        long b = this.f5653n.mo19953b();
        int i = this.f5655p;
        int s = mo19816s(b);
        this.f5655p = s;
        if (s != i) {
            if (!mo19832r(i, b)) {
                Format e = mo19823e(i);
                Format e2 = mo19823e(this.f5655p);
                if (e2.f7562m > e.f7562m && j2 < mo19817t(j3)) {
                    this.f5655p = i;
                } else if (e2.f7562m < e.f7562m && j2 >= this.f5648i) {
                    this.f5655p = i;
                }
            }
            if (this.f5655p != i) {
                this.f5656q = 3;
            }
        }
    }

    /* renamed from: m */
    public int mo19339m() {
        return this.f5656q;
    }

    /* renamed from: n */
    public void mo19815n(float f) {
        this.f5654o = f;
    }

    @Nullable
    /* renamed from: p */
    public Object mo19340p() {
        return null;
    }

    /* renamed from: s */
    public final int mo19816s(long j) {
        long e = (long) (((float) this.f5646g.mo19878e()) * this.f5650k);
        int i = 0;
        for (int i2 = 0; i2 < this.f5667b; i2++) {
            if (j == Long.MIN_VALUE || !mo19832r(i2, j)) {
                if (((long) Math.round(((float) mo19823e(i2).f7562m) * this.f5654o)) <= e) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: t */
    public final long mo19817t(long j) {
        return (j > -9223372036854775807L ? 1 : (j == -9223372036854775807L ? 0 : -1)) != 0 && (j > this.f5647h ? 1 : (j == this.f5647h ? 0 : -1)) <= 0 ? (long) (((float) j) * this.f5651l) : this.f5647h;
    }
}
