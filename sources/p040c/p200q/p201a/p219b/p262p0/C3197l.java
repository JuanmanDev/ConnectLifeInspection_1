package p040c.p200q.p201a.p219b.p262p0;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

@TargetApi(16)
/* renamed from: c.q.a.b.p0.l */
/* compiled from: VideoFrameReleaseTimeHelper */
public final class C3197l {

    /* renamed from: a */
    public final WindowManager f5986a;

    /* renamed from: b */
    public final C3199b f5987b;

    /* renamed from: c */
    public final C3198a f5988c;

    /* renamed from: d */
    public long f5989d;

    /* renamed from: e */
    public long f5990e;

    /* renamed from: f */
    public long f5991f;

    /* renamed from: g */
    public long f5992g;

    /* renamed from: h */
    public long f5993h;

    /* renamed from: i */
    public boolean f5994i;

    /* renamed from: j */
    public long f5995j;

    /* renamed from: k */
    public long f5996k;

    /* renamed from: l */
    public long f5997l;

    @TargetApi(17)
    /* renamed from: c.q.a.b.p0.l$a */
    /* compiled from: VideoFrameReleaseTimeHelper */
    public final class C3198a implements DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f5998a;

        public C3198a(DisplayManager displayManager) {
            this.f5998a = displayManager;
        }

        /* renamed from: a */
        public void mo20128a() {
            this.f5998a.registerDisplayListener(this, (Handler) null);
        }

        /* renamed from: b */
        public void mo20129b() {
            this.f5998a.unregisterDisplayListener(this);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                C3197l.this.mo20127h();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: c.q.a.b.p0.l$b */
    /* compiled from: VideoFrameReleaseTimeHelper */
    public static final class C3199b implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: p */
        public static final C3199b f6000p = new C3199b();

        /* renamed from: e */
        public volatile long f6001e = -9223372036854775807L;

        /* renamed from: l */
        public final Handler f6002l;

        /* renamed from: m */
        public final HandlerThread f6003m;

        /* renamed from: n */
        public Choreographer f6004n;

        /* renamed from: o */
        public int f6005o;

        public C3199b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f6003m = handlerThread;
            handlerThread.start();
            Handler r = C3152e0.m7818r(this.f6003m.getLooper(), this);
            this.f6002l = r;
            r.sendEmptyMessage(0);
        }

        /* renamed from: d */
        public static C3199b m8105d() {
            return f6000p;
        }

        /* renamed from: a */
        public void mo20133a() {
            this.f6002l.sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void mo20134b() {
            int i = this.f6005o + 1;
            this.f6005o = i;
            if (i == 1) {
                this.f6004n.postFrameCallback(this);
            }
        }

        /* renamed from: c */
        public final void mo20135c() {
            this.f6004n = Choreographer.getInstance();
        }

        public void doFrame(long j) {
            this.f6001e = j;
            this.f6004n.postFrameCallbackDelayed(this, 500);
        }

        /* renamed from: e */
        public void mo20137e() {
            this.f6002l.sendEmptyMessage(2);
        }

        /* renamed from: f */
        public final void mo20138f() {
            int i = this.f6005o - 1;
            this.f6005o = i;
            if (i == 0) {
                this.f6004n.removeFrameCallback(this);
                this.f6001e = -9223372036854775807L;
            }
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                mo20135c();
                return true;
            } else if (i == 1) {
                mo20134b();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                mo20138f();
                return true;
            }
        }
    }

    public C3197l(@Nullable Context context) {
        C3198a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f5986a = (WindowManager) context.getSystemService("window");
        } else {
            this.f5986a = null;
        }
        if (this.f5986a != null) {
            this.f5988c = C3152e0.f5819a >= 17 ? mo20126g(context) : aVar;
            this.f5987b = C3199b.m8105d();
        } else {
            this.f5988c = null;
            this.f5987b = null;
        }
        this.f5989d = -9223372036854775807L;
        this.f5990e = -9223372036854775807L;
    }

    /* renamed from: c */
    public static long m8096c(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo20122b(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f5994i
            if (r2 == 0) goto L_0x0041
            long r2 = r10.f5991f
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0018
            long r2 = r10.f5997l
            r4 = 1
            long r2 = r2 + r4
            r10.f5997l = r2
            long r2 = r10.f5993h
            r10.f5992g = r2
        L_0x0018:
            long r2 = r10.f5997l
            r4 = 6
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L_0x0039
            long r6 = r10.f5996k
            long r6 = r0 - r6
            long r6 = r6 / r2
            long r2 = r10.f5992g
            long r2 = r2 + r6
            boolean r4 = r10.mo20125f(r2, r13)
            if (r4 == 0) goto L_0x0032
            r10.f5994i = r5
            goto L_0x0041
        L_0x0032:
            long r4 = r10.f5995j
            long r4 = r4 + r2
            long r6 = r10.f5996k
            long r4 = r4 - r6
            goto L_0x0043
        L_0x0039:
            boolean r2 = r10.mo20125f(r0, r13)
            if (r2 == 0) goto L_0x0041
            r10.f5994i = r5
        L_0x0041:
            r4 = r13
            r2 = r0
        L_0x0043:
            boolean r6 = r10.f5994i
            if (r6 != 0) goto L_0x0052
            r10.f5996k = r0
            r10.f5995j = r13
            r13 = 0
            r10.f5997l = r13
            r13 = 1
            r10.f5994i = r13
        L_0x0052:
            r10.f5991f = r11
            r10.f5993h = r2
            c.q.a.b.p0.l$b r11 = r10.f5987b
            if (r11 == 0) goto L_0x0077
            long r12 = r10.f5989d
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x0066
            goto L_0x0077
        L_0x0066:
            long r6 = r11.f6001e
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006d
            return r4
        L_0x006d:
            long r8 = r10.f5989d
            long r11 = m8096c(r4, r6, r8)
            long r13 = r10.f5990e
            long r11 = r11 - r13
            return r11
        L_0x0077:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p262p0.C3197l.mo20122b(long, long):long");
    }

    /* renamed from: d */
    public void mo20123d() {
        if (this.f5986a != null) {
            C3198a aVar = this.f5988c;
            if (aVar != null) {
                aVar.mo20129b();
            }
            this.f5987b.mo20137e();
        }
    }

    /* renamed from: e */
    public void mo20124e() {
        this.f5994i = false;
        if (this.f5986a != null) {
            this.f5987b.mo20133a();
            C3198a aVar = this.f5988c;
            if (aVar != null) {
                aVar.mo20128a();
            }
            mo20127h();
        }
    }

    /* renamed from: f */
    public final boolean mo20125f(long j, long j2) {
        return Math.abs((j2 - this.f5995j) - (j - this.f5996k)) > 20000000;
    }

    @TargetApi(17)
    /* renamed from: g */
    public final C3198a mo20126g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C3198a(displayManager);
    }

    /* renamed from: h */
    public final void mo20127h() {
        Display defaultDisplay = this.f5986a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f5989d = refreshRate;
            this.f5990e = (refreshRate * 80) / 100;
        }
    }
}
