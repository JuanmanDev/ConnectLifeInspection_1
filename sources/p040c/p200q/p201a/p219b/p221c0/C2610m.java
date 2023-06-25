package p040c.p200q.p201a.p219b.p221c0;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.c0.m */
/* compiled from: AudioTimestampPoller */
public final class C2610m {
    @Nullable

    /* renamed from: a */
    public final C2611a f3132a;

    /* renamed from: b */
    public int f3133b;

    /* renamed from: c */
    public long f3134c;

    /* renamed from: d */
    public long f3135d;

    /* renamed from: e */
    public long f3136e;

    /* renamed from: f */
    public long f3137f;

    @TargetApi(19)
    /* renamed from: c.q.a.b.c0.m$a */
    /* compiled from: AudioTimestampPoller */
    public static final class C2611a {

        /* renamed from: a */
        public final AudioTrack f3138a;

        /* renamed from: b */
        public final AudioTimestamp f3139b = new AudioTimestamp();

        /* renamed from: c */
        public long f3140c;

        /* renamed from: d */
        public long f3141d;

        /* renamed from: e */
        public long f3142e;

        public C2611a(AudioTrack audioTrack) {
            this.f3138a = audioTrack;
        }

        /* renamed from: a */
        public long mo18278a() {
            return this.f3142e;
        }

        /* renamed from: b */
        public long mo18279b() {
            return this.f3139b.nanoTime / 1000;
        }

        /* renamed from: c */
        public boolean mo18280c() {
            boolean timestamp = this.f3138a.getTimestamp(this.f3139b);
            if (timestamp) {
                long j = this.f3139b.framePosition;
                if (this.f3141d > j) {
                    this.f3140c++;
                }
                this.f3141d = j;
                this.f3142e = j + (this.f3140c << 32);
            }
            return timestamp;
        }
    }

    public C2610m(AudioTrack audioTrack) {
        if (C3152e0.f5819a >= 19) {
            this.f3132a = new C2611a(audioTrack);
            mo18276h();
            return;
        }
        this.f3132a = null;
        mo18277i(3);
    }

    /* renamed from: a */
    public void mo18269a() {
        if (this.f3133b == 4) {
            mo18276h();
        }
    }

    /* renamed from: b */
    public long mo18270b() {
        C2611a aVar = this.f3132a;
        if (aVar != null) {
            return aVar.mo18278a();
        }
        return -1;
    }

    /* renamed from: c */
    public long mo18271c() {
        C2611a aVar = this.f3132a;
        if (aVar != null) {
            return aVar.mo18279b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    public boolean mo18272d() {
        int i = this.f3133b;
        return i == 1 || i == 2;
    }

    /* renamed from: e */
    public boolean mo18273e() {
        return this.f3133b == 2;
    }

    /* renamed from: f */
    public boolean mo18274f(long j) {
        C2611a aVar = this.f3132a;
        if (aVar == null || j - this.f3136e < this.f3135d) {
            return false;
        }
        this.f3136e = j;
        boolean c = aVar.mo18280c();
        int i = this.f3133b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (c) {
                        mo18276h();
                    }
                } else if (!c) {
                    mo18276h();
                }
            } else if (!c) {
                mo18276h();
            } else if (this.f3132a.mo18278a() > this.f3137f) {
                mo18277i(2);
            }
        } else if (c) {
            if (this.f3132a.mo18279b() < this.f3134c) {
                return false;
            }
            this.f3137f = this.f3132a.mo18278a();
            mo18277i(1);
        } else if (j - this.f3134c > 500000) {
            mo18277i(3);
        }
        return c;
    }

    /* renamed from: g */
    public void mo18275g() {
        mo18277i(4);
    }

    /* renamed from: h */
    public void mo18276h() {
        if (this.f3132a != null) {
            mo18277i(0);
        }
    }

    /* renamed from: i */
    public final void mo18277i(int i) {
        this.f3133b = i;
        if (i == 0) {
            this.f3136e = 0;
            this.f3137f = -1;
            this.f3134c = System.nanoTime() / 1000;
            this.f3135d = 5000;
        } else if (i == 1) {
            this.f3135d = 5000;
        } else if (i == 2 || i == 3) {
            this.f3135d = 10000000;
        } else if (i == 4) {
            this.f3135d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
