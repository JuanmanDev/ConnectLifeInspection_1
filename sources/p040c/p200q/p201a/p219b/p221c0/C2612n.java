package p040c.p200q.p201a.p219b.p221c0;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.c0.n */
/* compiled from: AudioTrackPositionTracker */
public final class C2612n {

    /* renamed from: a */
    public final C2613a f3143a;

    /* renamed from: b */
    public final long[] f3144b;
    @Nullable

    /* renamed from: c */
    public AudioTrack f3145c;

    /* renamed from: d */
    public int f3146d;

    /* renamed from: e */
    public int f3147e;
    @Nullable

    /* renamed from: f */
    public C2610m f3148f;

    /* renamed from: g */
    public int f3149g;

    /* renamed from: h */
    public boolean f3150h;

    /* renamed from: i */
    public long f3151i;

    /* renamed from: j */
    public long f3152j;

    /* renamed from: k */
    public long f3153k;
    @Nullable

    /* renamed from: l */
    public Method f3154l;

    /* renamed from: m */
    public long f3155m;

    /* renamed from: n */
    public boolean f3156n;

    /* renamed from: o */
    public boolean f3157o;

    /* renamed from: p */
    public long f3158p;

    /* renamed from: q */
    public long f3159q;

    /* renamed from: r */
    public long f3160r;

    /* renamed from: s */
    public long f3161s;

    /* renamed from: t */
    public int f3162t;

    /* renamed from: u */
    public int f3163u;

    /* renamed from: v */
    public long f3164v;

    /* renamed from: w */
    public long f3165w;

    /* renamed from: x */
    public long f3166x;

    /* renamed from: y */
    public long f3167y;

    /* renamed from: c.q.a.b.c0.n$a */
    /* compiled from: AudioTrackPositionTracker */
    public interface C2613a {
        /* renamed from: a */
        void mo18300a(int i, long j);

        /* renamed from: b */
        void mo18301b(long j);

        /* renamed from: c */
        void mo18302c(long j, long j2, long j3, long j4);

        /* renamed from: d */
        void mo18303d(long j, long j2, long j3, long j4);
    }

    public C2612n(C2613a aVar) {
        C3151e.m7757e(aVar);
        this.f3143a = aVar;
        if (C3152e0.f5819a >= 18) {
            try {
                this.f3154l = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f3144b = new long[10];
    }

    /* renamed from: o */
    public static boolean m4889o(int i) {
        return C3152e0.f5819a < 23 && (i == 5 || i == 6);
    }

    /* renamed from: a */
    public final boolean mo18281a() {
        if (this.f3150h) {
            AudioTrack audioTrack = this.f3145c;
            C3151e.m7757e(audioTrack);
            return audioTrack.getPlayState() == 2 && mo18285e() == 0;
        }
    }

    /* renamed from: b */
    public final long mo18282b(long j) {
        return (j * EventLoop_commonKt.MS_TO_NS) / ((long) this.f3149g);
    }

    /* renamed from: c */
    public int mo18283c(long j) {
        return this.f3147e - ((int) (j - (mo18285e() * ((long) this.f3146d))));
    }

    /* renamed from: d */
    public long mo18284d(boolean z) {
        long j;
        AudioTrack audioTrack = this.f3145c;
        C3151e.m7757e(audioTrack);
        if (audioTrack.getPlayState() == 3) {
            mo18293m();
        }
        long nanoTime = System.nanoTime() / 1000;
        C2610m mVar = this.f3148f;
        C3151e.m7757e(mVar);
        C2610m mVar2 = mVar;
        if (mVar2.mo18272d()) {
            long b = mo18282b(mVar2.mo18270b());
            if (!mVar2.mo18273e()) {
                return b;
            }
            return b + (nanoTime - mVar2.mo18271c());
        }
        if (this.f3163u == 0) {
            j = mo18286f();
        } else {
            j = nanoTime + this.f3152j;
        }
        return !z ? j - this.f3155m : j;
    }

    /* renamed from: e */
    public final long mo18285e() {
        AudioTrack audioTrack = this.f3145c;
        C3151e.m7757e(audioTrack);
        AudioTrack audioTrack2 = audioTrack;
        if (this.f3164v != -9223372036854775807L) {
            return Math.min(this.f3167y, this.f3166x + ((((SystemClock.elapsedRealtime() * 1000) - this.f3164v) * ((long) this.f3149g)) / EventLoop_commonKt.MS_TO_NS));
        }
        int playState = audioTrack2.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack2.getPlaybackHeadPosition());
        if (this.f3150h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f3161s = this.f3159q;
            }
            playbackHeadPosition += this.f3161s;
        }
        if (C3152e0.f5819a <= 28) {
            if (playbackHeadPosition == 0 && this.f3159q > 0 && playState == 3) {
                if (this.f3165w == -9223372036854775807L) {
                    this.f3165w = SystemClock.elapsedRealtime();
                }
                return this.f3159q;
            }
            this.f3165w = -9223372036854775807L;
        }
        if (this.f3159q > playbackHeadPosition) {
            this.f3160r++;
        }
        this.f3159q = playbackHeadPosition;
        return playbackHeadPosition + (this.f3160r << 32);
    }

    /* renamed from: f */
    public final long mo18286f() {
        return mo18282b(mo18285e());
    }

    /* renamed from: g */
    public void mo18287g(long j) {
        this.f3166x = mo18285e();
        this.f3164v = SystemClock.elapsedRealtime() * 1000;
        this.f3167y = j;
    }

    /* renamed from: h */
    public boolean mo18288h(long j) {
        return j > mo18285e() || mo18281a();
    }

    /* renamed from: i */
    public boolean mo18289i() {
        AudioTrack audioTrack = this.f3145c;
        C3151e.m7757e(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    /* renamed from: j */
    public boolean mo18290j(long j) {
        return this.f3165w != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.f3165w >= 200;
    }

    /* renamed from: k */
    public boolean mo18291k(long j) {
        C2613a aVar;
        AudioTrack audioTrack = this.f3145c;
        C3151e.m7757e(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.f3150h) {
            if (playState == 2) {
                this.f3156n = false;
                return false;
            } else if (playState == 1 && mo18285e() == 0) {
                return false;
            }
        }
        boolean z = this.f3156n;
        boolean h = mo18288h(j);
        this.f3156n = h;
        if (z && !h && playState != 1 && (aVar = this.f3143a) != null) {
            aVar.mo18300a(this.f3147e, C2627d.m5058b(this.f3151i));
        }
        return true;
    }

    /* renamed from: l */
    public final void mo18292l(long j, long j2) {
        C2610m mVar = this.f3148f;
        C3151e.m7757e(mVar);
        C2610m mVar2 = mVar;
        if (mVar2.mo18274f(j)) {
            long c = mVar2.mo18271c();
            long b = mVar2.mo18270b();
            if (Math.abs(c - j) > 5000000) {
                this.f3143a.mo18303d(b, c, j, j2);
                mVar2.mo18275g();
            } else if (Math.abs(mo18282b(b) - j2) > 5000000) {
                this.f3143a.mo18302c(b, c, j, j2);
                mVar2.mo18275g();
            } else {
                mVar2.mo18269a();
            }
        }
    }

    /* renamed from: m */
    public final void mo18293m() {
        long f = mo18286f();
        if (f != 0) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - this.f3153k >= 30000) {
                long[] jArr = this.f3144b;
                int i = this.f3162t;
                jArr[i] = f - nanoTime;
                this.f3162t = (i + 1) % 10;
                int i2 = this.f3163u;
                if (i2 < 10) {
                    this.f3163u = i2 + 1;
                }
                this.f3153k = nanoTime;
                this.f3152j = 0;
                int i3 = 0;
                while (true) {
                    int i4 = this.f3163u;
                    if (i3 >= i4) {
                        break;
                    }
                    this.f3152j += this.f3144b[i3] / ((long) i4);
                    i3++;
                }
            }
            if (!this.f3150h) {
                mo18292l(nanoTime, f);
                mo18294n(nanoTime);
            }
        }
    }

    /* renamed from: n */
    public final void mo18294n(long j) {
        Method method;
        if (this.f3157o && (method = this.f3154l) != null && j - this.f3158p >= 500000) {
            try {
                AudioTrack audioTrack = this.f3145c;
                C3151e.m7757e(audioTrack);
                Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                C3152e0.m7797f(num);
                long intValue = (((long) num.intValue()) * 1000) - this.f3151i;
                this.f3155m = intValue;
                long max = Math.max(intValue, 0);
                this.f3155m = max;
                if (max > 5000000) {
                    this.f3143a.mo18301b(max);
                    this.f3155m = 0;
                }
            } catch (Exception unused) {
                this.f3154l = null;
            }
            this.f3158p = j;
        }
    }

    /* renamed from: p */
    public boolean mo18295p() {
        mo18297r();
        if (this.f3164v != -9223372036854775807L) {
            return false;
        }
        C2610m mVar = this.f3148f;
        C3151e.m7757e(mVar);
        mVar.mo18276h();
        return true;
    }

    /* renamed from: q */
    public void mo18296q() {
        mo18297r();
        this.f3145c = null;
        this.f3148f = null;
    }

    /* renamed from: r */
    public final void mo18297r() {
        this.f3152j = 0;
        this.f3163u = 0;
        this.f3162t = 0;
        this.f3153k = 0;
    }

    /* renamed from: s */
    public void mo18298s(AudioTrack audioTrack, int i, int i2, int i3) {
        this.f3145c = audioTrack;
        this.f3146d = i2;
        this.f3147e = i3;
        this.f3148f = new C2610m(audioTrack);
        this.f3149g = audioTrack.getSampleRate();
        this.f3150h = m4889o(i);
        boolean Q = C3152e0.m7777Q(i);
        this.f3157o = Q;
        this.f3151i = Q ? mo18282b((long) (i3 / i2)) : -9223372036854775807L;
        this.f3159q = 0;
        this.f3160r = 0;
        this.f3161s = 0;
        this.f3156n = false;
        this.f3164v = -9223372036854775807L;
        this.f3165w = -9223372036854775807L;
        this.f3155m = 0;
    }

    /* renamed from: t */
    public void mo18299t() {
        C2610m mVar = this.f3148f;
        C3151e.m7757e(mVar);
        mVar.mo18276h();
    }
}
