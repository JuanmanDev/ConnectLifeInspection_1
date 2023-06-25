package p040c.p200q.p201a.p219b;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p200q.p201a.p219b.p259m0.C3109f;
import p040c.p200q.p201a.p219b.p260n0.C3117d;
import p040c.p200q.p201a.p219b.p260n0.C3126k;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.e */
/* compiled from: DefaultLoadControl */
public class C2638e implements C3098m {

    /* renamed from: a */
    public final C3126k f3326a;

    /* renamed from: b */
    public final long f3327b;

    /* renamed from: c */
    public final long f3328c;

    /* renamed from: d */
    public final long f3329d;

    /* renamed from: e */
    public final long f3330e;

    /* renamed from: f */
    public final int f3331f;

    /* renamed from: g */
    public final boolean f3332g;

    /* renamed from: h */
    public final PriorityTaskManager f3333h;

    /* renamed from: i */
    public final long f3334i;

    /* renamed from: j */
    public final boolean f3335j;

    /* renamed from: k */
    public int f3336k;

    /* renamed from: l */
    public boolean f3337l;

    public C2638e() {
        this(new C3126k(true, 65536));
    }

    /* renamed from: j */
    public static void m5105j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C3151e.m7754b(z, str + " cannot be less than " + str2);
    }

    /* renamed from: a */
    public void mo18427a() {
        mo18437l(false);
    }

    /* renamed from: b */
    public boolean mo18428b() {
        return this.f3335j;
    }

    /* renamed from: c */
    public long mo18429c() {
        return this.f3334i;
    }

    /* renamed from: d */
    public boolean mo18430d(long j, float f, boolean z) {
        long K = C3152e0.m7771K(j, f);
        long j2 = z ? this.f3330e : this.f3329d;
        return j2 <= 0 || K >= j2 || (!this.f3332g && this.f3326a.mo19896f() >= this.f3336k);
    }

    /* renamed from: e */
    public boolean mo18431e(long j, float f) {
        boolean z;
        boolean z2 = true;
        boolean z3 = this.f3326a.mo19896f() >= this.f3336k;
        boolean z4 = this.f3337l;
        long j2 = this.f3327b;
        if (f > 1.0f) {
            j2 = Math.min(C3152e0.m7766F(j2, f), this.f3328c);
        }
        if (j < j2) {
            if (!this.f3332g && z3) {
                z2 = false;
            }
            this.f3337l = z2;
        } else if (j >= this.f3328c || z3) {
            this.f3337l = false;
        }
        PriorityTaskManager priorityTaskManager = this.f3333h;
        if (!(priorityTaskManager == null || (z = this.f3337l) == z4)) {
            if (z) {
                priorityTaskManager.mo24294a(0);
            } else {
                priorityTaskManager.mo24295b(0);
            }
        }
        return this.f3337l;
    }

    /* renamed from: f */
    public void mo18432f(C3212u[] uVarArr, TrackGroupArray trackGroupArray, C3109f fVar) {
        int i = this.f3331f;
        if (i == -1) {
            i = mo18436k(uVarArr, fVar);
        }
        this.f3336k = i;
        this.f3326a.mo19898h(i);
    }

    /* renamed from: g */
    public void mo18433g() {
        mo18437l(true);
    }

    /* renamed from: h */
    public C3117d mo18434h() {
        return this.f3326a;
    }

    /* renamed from: i */
    public void mo18435i() {
        mo18437l(true);
    }

    /* renamed from: k */
    public int mo18436k(C3212u[] uVarArr, C3109f fVar) {
        int i = 0;
        for (int i2 = 0; i2 < uVarArr.length; i2++) {
            if (fVar.mo19842a(i2) != null) {
                i += C3152e0.m7763C(uVarArr[i2].mo18204h());
            }
        }
        return i;
    }

    /* renamed from: l */
    public final void mo18437l(boolean z) {
        this.f3336k = 0;
        PriorityTaskManager priorityTaskManager = this.f3333h;
        if (priorityTaskManager != null && this.f3337l) {
            priorityTaskManager.mo24295b(0);
        }
        this.f3337l = false;
        if (z) {
            this.f3326a.mo19897g();
        }
    }

    @Deprecated
    public C2638e(C3126k kVar) {
        this(kVar, 15000, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, 5000, -1, true);
    }

    @Deprecated
    public C2638e(C3126k kVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(kVar, i, i2, i3, i4, i5, z, (PriorityTaskManager) null);
    }

    @Deprecated
    public C2638e(C3126k kVar, int i, int i2, int i3, int i4, int i5, boolean z, PriorityTaskManager priorityTaskManager) {
        this(kVar, i, i2, i3, i4, i5, z, priorityTaskManager, 0, false);
    }

    public C2638e(C3126k kVar, int i, int i2, int i3, int i4, int i5, boolean z, PriorityTaskManager priorityTaskManager, int i6, boolean z2) {
        m5105j(i3, 0, "bufferForPlaybackMs", "0");
        m5105j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m5105j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m5105j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m5105j(i2, i, "maxBufferMs", "minBufferMs");
        m5105j(i6, 0, "backBufferDurationMs", "0");
        this.f3326a = kVar;
        this.f3327b = C2627d.m5057a((long) i);
        this.f3328c = C2627d.m5057a((long) i2);
        this.f3329d = C2627d.m5057a((long) i3);
        this.f3330e = C2627d.m5057a((long) i4);
        this.f3331f = i5;
        this.f3332g = z;
        this.f3333h = priorityTaskManager;
        this.f3334i = C2627d.m5057a((long) i6);
        this.f3335j = z2;
    }
}
