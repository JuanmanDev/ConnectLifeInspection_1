package p040c.p200q.p201a.p219b.p235h0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.C2589c;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.h0.e */
/* compiled from: MetadataRenderer */
public final class C2833e extends C2589c implements Handler.Callback {

    /* renamed from: A */
    public int f4400A;

    /* renamed from: B */
    public int f4401B;

    /* renamed from: C */
    public C2828a f4402C;

    /* renamed from: D */
    public boolean f4403D;

    /* renamed from: t */
    public final C2829b f4404t;

    /* renamed from: u */
    public final C2832d f4405u;
    @Nullable

    /* renamed from: v */
    public final Handler f4406v;

    /* renamed from: w */
    public final C3030l f4407w;

    /* renamed from: x */
    public final C2831c f4408x;

    /* renamed from: y */
    public final Metadata[] f4409y;

    /* renamed from: z */
    public final long[] f4410z;

    public C2833e(C2832d dVar, @Nullable Looper looper) {
        this(dVar, looper, C2829b.f4398a);
    }

    /* renamed from: A */
    public void mo18193A() {
        mo18901J();
        this.f4402C = null;
    }

    /* renamed from: C */
    public void mo18195C(long j, boolean z) {
        mo18901J();
        this.f4403D = false;
    }

    /* renamed from: F */
    public void mo18198F(Format[] formatArr, long j) {
        this.f4402C = this.f4404t.mo18900b(formatArr[0]);
    }

    /* renamed from: J */
    public final void mo18901J() {
        Arrays.fill(this.f4409y, (Object) null);
        this.f4400A = 0;
        this.f4401B = 0;
    }

    /* renamed from: K */
    public final void mo18902K(Metadata metadata) {
        Handler handler = this.f4406v;
        if (handler != null) {
            handler.obtainMessage(0, metadata).sendToTarget();
        } else {
            mo18903L(metadata);
        }
    }

    /* renamed from: L */
    public final void mo18903L(Metadata metadata) {
        this.f4405u.mo18131t(metadata);
    }

    /* renamed from: a */
    public int mo18904a(Format format) {
        if (this.f4404t.mo18899a(format)) {
            return C2589c.m4787I((C2650i<?>) null, format.f7569t) ? 4 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo18329b() {
        return this.f4403D;
    }

    /* renamed from: c */
    public boolean mo18330c() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            mo18903L((Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public void mo18906o(long j, long j2) {
        if (!this.f4403D && this.f4401B < 5) {
            this.f4408x.mo18386i();
            if (mo18199G(this.f4407w, this.f4408x, false) == -4) {
                if (this.f4408x.mo18390n()) {
                    this.f4403D = true;
                } else if (!this.f4408x.mo18389m()) {
                    C2831c cVar = this.f4408x;
                    cVar.f4399p = this.f4407w.f5333a.f7570u;
                    cVar.mo18406u();
                    int i = (this.f4400A + this.f4401B) % 5;
                    Metadata a = this.f4402C.mo18898a(this.f4408x);
                    if (a != null) {
                        this.f4409y[i] = a;
                        this.f4410z[i] = this.f4408x.f3308n;
                        this.f4401B++;
                    }
                }
            }
        }
        if (this.f4401B > 0) {
            long[] jArr = this.f4410z;
            int i2 = this.f4400A;
            if (jArr[i2] <= j) {
                mo18902K(this.f4409y[i2]);
                Metadata[] metadataArr = this.f4409y;
                int i3 = this.f4400A;
                metadataArr[i3] = null;
                this.f4400A = (i3 + 1) % 5;
                this.f4401B--;
            }
        }
    }

    public C2833e(C2832d dVar, @Nullable Looper looper, C2829b bVar) {
        super(4);
        Handler handler;
        C3151e.m7757e(dVar);
        this.f4405u = dVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = C3152e0.m7818r(looper, this);
        }
        this.f4406v = handler;
        C3151e.m7757e(bVar);
        this.f4404t = bVar;
        this.f4407w = new C3030l();
        this.f4408x = new C2831c();
        this.f4409y = new Metadata[5];
        this.f4410z = new long[5];
    }
}
