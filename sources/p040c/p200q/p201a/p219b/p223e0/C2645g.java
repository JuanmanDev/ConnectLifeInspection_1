package p040c.p200q.p201a.p219b.p223e0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p223e0.C2652k;
import p040c.p200q.p201a.p219b.p223e0.C2653l;
import p040c.p200q.p201a.p219b.p261o0.C3158j;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

@TargetApi(18)
/* renamed from: c.q.a.b.e0.g */
/* compiled from: DefaultDrmSession */
public class C2645g<T extends C2652k> implements DrmSession<T> {
    @Nullable

    /* renamed from: a */
    public final List<DrmInitData.SchemeData> f3344a;

    /* renamed from: b */
    public final C2653l<T> f3345b;

    /* renamed from: c */
    public final C2648c<T> f3346c;

    /* renamed from: d */
    public final int f3347d;

    /* renamed from: e */
    public final HashMap<String, String> f3348e;

    /* renamed from: f */
    public final C3158j<C2649h> f3349f;

    /* renamed from: g */
    public final int f3350g;

    /* renamed from: h */
    public final C2657n f3351h;

    /* renamed from: i */
    public final UUID f3352i;

    /* renamed from: j */
    public final C2645g<T>.b f3353j;

    /* renamed from: k */
    public int f3354k;

    /* renamed from: l */
    public int f3355l;

    /* renamed from: m */
    public HandlerThread f3356m;

    /* renamed from: n */
    public C2645g<T>.a f3357n;

    /* renamed from: o */
    public T f3358o;

    /* renamed from: p */
    public DrmSession.DrmSessionException f3359p;

    /* renamed from: q */
    public byte[] f3360q;
    @Nullable

    /* renamed from: r */
    public byte[] f3361r;

    /* renamed from: s */
    public C2653l.C2654a f3362s;

    /* renamed from: t */
    public C2653l.C2655b f3363t;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: c.q.a.b.e0.g$a */
    /* compiled from: DefaultDrmSession */
    public class C2646a extends Handler {
        public C2646a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final long mo18461a(int i) {
            return (long) Math.min((i - 1) * 1000, 5000);
        }

        /* renamed from: b */
        public final boolean mo18462b(Message message) {
            int i;
            if (!(message.arg1 == 1) || (i = message.arg2 + 1) > C2645g.this.f3350g) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i;
            sendMessageDelayed(obtain, mo18461a(i));
            return true;
        }

        /* renamed from: c */
        public void mo18463c(int i, Object obj, boolean z) {
            obtainMessage(i, z ? 1 : 0, 0, obj).sendToTarget();
        }

        public void handleMessage(Message message) {
            Object obj = message.obj;
            try {
                int i = message.what;
                if (i == 0) {
                    e = C2645g.this.f3351h.mo18484b(C2645g.this.f3352i, (C2653l.C2655b) obj);
                } else if (i == 1) {
                    e = C2645g.this.f3351h.mo18483a(C2645g.this.f3352i, (C2653l.C2654a) obj);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e) {
                e = e;
                if (mo18462b(message)) {
                    return;
                }
            }
            C2645g.this.f3353j.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: c.q.a.b.e0.g$b */
    /* compiled from: DefaultDrmSession */
    public class C2647b extends Handler {
        public C2647b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                C2645g.this.mo18455t(obj, obj2);
            } else if (i == 1) {
                C2645g.this.mo18449n(obj, obj2);
            }
        }
    }

    /* renamed from: c.q.a.b.e0.g$c */
    /* compiled from: DefaultDrmSession */
    public interface C2648c<T extends C2652k> {
        /* renamed from: b */
        void mo18466b(C2645g<T> gVar);

        /* renamed from: c */
        void mo18467c(Exception exc);

        /* renamed from: e */
        void mo18468e();
    }

    public C2645g(UUID uuid, C2653l<T> lVar, C2648c<T> cVar, @Nullable List<DrmInitData.SchemeData> list, int i, @Nullable byte[] bArr, HashMap<String, String> hashMap, C2657n nVar, Looper looper, C3158j<C2649h> jVar, int i2) {
        this.f3352i = uuid;
        this.f3346c = cVar;
        this.f3345b = lVar;
        this.f3347d = i;
        this.f3361r = bArr;
        this.f3344a = bArr == null ? Collections.unmodifiableList(list) : null;
        this.f3348e = hashMap;
        this.f3351h = nVar;
        this.f3350g = i2;
        this.f3349f = jVar;
        this.f3354k = 2;
        this.f3353j = new C2647b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f3356m = handlerThread;
        handlerThread.start();
        this.f3357n = new C2646a(this.f3356m.getLooper());
    }

    /* renamed from: a */
    public Map<String, String> mo18439a() {
        byte[] bArr = this.f3360q;
        if (bArr == null) {
            return null;
        }
        return this.f3345b.mo18472a(bArr);
    }

    /* renamed from: b */
    public final T mo18440b() {
        return this.f3358o;
    }

    /* renamed from: c */
    public final DrmSession.DrmSessionException mo18441c() {
        if (this.f3354k == 1) {
            return this.f3359p;
        }
        return null;
    }

    /* renamed from: g */
    public void mo18442g() {
        int i = this.f3355l + 1;
        this.f3355l = i;
        if (i == 1 && this.f3354k != 1 && mo18456u(true)) {
            mo18444h(true);
        }
    }

    public final int getState() {
        return this.f3354k;
    }

    /* renamed from: h */
    public final void mo18444h(boolean z) {
        int i = this.f3347d;
        if (i == 0 || i == 1) {
            if (this.f3361r == null) {
                mo18457v(1, z);
            } else if (this.f3354k == 4 || mo18460y()) {
                long i2 = mo18445i();
                if (this.f3347d == 0 && i2 <= 60) {
                    C3163m.m7876b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + i2);
                    mo18457v(2, z);
                } else if (i2 <= 0) {
                    mo18448m(new KeysExpiredException());
                } else {
                    this.f3354k = 4;
                    this.f3349f.mo19960b(C2643e.f3342a);
                }
            }
        } else if (i != 2) {
            if (i == 3 && mo18460y()) {
                mo18457v(3, z);
            }
        } else if (this.f3361r == null) {
            mo18457v(2, z);
        } else if (mo18460y()) {
            mo18457v(2, z);
        }
    }

    /* renamed from: i */
    public final long mo18445i() {
        if (!C2627d.f3282d.equals(this.f3352i)) {
            return Long.MAX_VALUE;
        }
        Pair<Long, Long> b = C2658o.m5179b(this);
        return Math.min(((Long) b.first).longValue(), ((Long) b.second).longValue());
    }

    /* renamed from: j */
    public boolean mo18446j(byte[] bArr) {
        return Arrays.equals(this.f3360q, bArr);
    }

    /* renamed from: k */
    public final boolean mo18447k() {
        int i = this.f3354k;
        return i == 3 || i == 4;
    }

    /* renamed from: m */
    public final void mo18448m(Exception exc) {
        this.f3359p = new DrmSession.DrmSessionException(exc);
        this.f3349f.mo19960b(new C2640b(exc));
        if (this.f3354k != 4) {
            this.f3354k = 1;
        }
    }

    /* renamed from: n */
    public final void mo18449n(Object obj, Object obj2) {
        if (obj == this.f3362s && mo18447k()) {
            this.f3362s = null;
            if (obj2 instanceof Exception) {
                mo18450o((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f3347d == 3) {
                    this.f3345b.mo18478g(this.f3361r, bArr);
                    this.f3349f.mo19960b(C2643e.f3342a);
                    return;
                }
                byte[] g = this.f3345b.mo18478g(this.f3360q, bArr);
                if (!((this.f3347d != 2 && (this.f3347d != 0 || this.f3361r == null)) || g == null || g.length == 0)) {
                    this.f3361r = g;
                }
                this.f3354k = 4;
                this.f3349f.mo19960b(C2644f.f3343a);
            } catch (Exception e) {
                mo18450o(e);
            }
        }
    }

    /* renamed from: o */
    public final void mo18450o(Exception exc) {
        if (exc instanceof NotProvisionedException) {
            this.f3346c.mo18466b(this);
        } else {
            mo18448m(exc);
        }
    }

    /* renamed from: p */
    public final void mo18451p() {
        if (this.f3354k == 4) {
            this.f3354k = 3;
            mo18448m(new KeysExpiredException());
        }
    }

    /* renamed from: q */
    public void mo18452q(int i) {
        if (mo18447k()) {
            if (i == 1) {
                this.f3354k = 3;
                this.f3346c.mo18466b(this);
            } else if (i == 2) {
                mo18444h(false);
            } else if (i == 3) {
                mo18451p();
            }
        }
    }

    /* renamed from: r */
    public void mo18453r() {
        if (mo18456u(false)) {
            mo18444h(true);
        }
    }

    /* renamed from: s */
    public void mo18454s(Exception exc) {
        mo18448m(exc);
    }

    /* renamed from: t */
    public final void mo18455t(Object obj, Object obj2) {
        if (obj != this.f3363t) {
            return;
        }
        if (this.f3354k == 2 || mo18447k()) {
            this.f3363t = null;
            if (obj2 instanceof Exception) {
                this.f3346c.mo18467c((Exception) obj2);
                return;
            }
            try {
                this.f3345b.mo18479h((byte[]) obj2);
                this.f3346c.mo18468e();
            } catch (Exception e) {
                this.f3346c.mo18467c(e);
            }
        }
    }

    /* renamed from: u */
    public final boolean mo18456u(boolean z) {
        if (mo18447k()) {
            return true;
        }
        try {
            this.f3360q = this.f3345b.mo18475d();
            this.f3349f.mo19960b(C2642d.f3341a);
            this.f3358o = this.f3345b.mo18473b(this.f3360q);
            this.f3354k = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                this.f3346c.mo18466b(this);
                return false;
            }
            mo18448m(e);
            return false;
        } catch (Exception e2) {
            mo18448m(e2);
            return false;
        }
    }

    /* renamed from: v */
    public final void mo18457v(int i, boolean z) {
        try {
            C2653l.C2654a i2 = this.f3345b.mo18480i(i == 3 ? this.f3361r : this.f3360q, this.f3344a, i, this.f3348e);
            this.f3362s = i2;
            this.f3357n.mo18463c(1, i2, z);
        } catch (Exception e) {
            mo18450o(e);
        }
    }

    /* renamed from: w */
    public void mo18458w() {
        C2653l.C2655b c = this.f3345b.mo18474c();
        this.f3363t = c;
        this.f3357n.mo18463c(0, c, true);
    }

    /* renamed from: x */
    public boolean mo18459x() {
        int i = this.f3355l - 1;
        this.f3355l = i;
        if (i != 0) {
            return false;
        }
        this.f3354k = 0;
        this.f3353j.removeCallbacksAndMessages((Object) null);
        this.f3357n.removeCallbacksAndMessages((Object) null);
        this.f3357n = null;
        this.f3356m.quit();
        this.f3356m = null;
        this.f3358o = null;
        this.f3359p = null;
        this.f3362s = null;
        this.f3363t = null;
        byte[] bArr = this.f3360q;
        if (bArr != null) {
            this.f3345b.mo18477f(bArr);
            this.f3360q = null;
            this.f3349f.mo19960b(C2639a.f3338a);
        }
        return true;
    }

    /* renamed from: y */
    public final boolean mo18460y() {
        try {
            this.f3345b.mo18476e(this.f3360q, this.f3361r);
            return true;
        } catch (Exception e) {
            C3163m.m7878d("DefaultDrmSession", "Error trying to restore Widevine keys.", e);
            mo18448m(e);
            return false;
        }
    }
}
