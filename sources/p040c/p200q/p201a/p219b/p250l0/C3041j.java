package p040c.p200q.p201a.p219b.p250l0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.C2589c;
import p040c.p200q.p201a.p219b.C3030l;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.l0.j */
/* compiled from: TextRenderer */
public final class C3041j extends C2589c implements Handler.Callback {

    /* renamed from: A */
    public Format f5343A;

    /* renamed from: B */
    public C3035e f5344B;

    /* renamed from: C */
    public C3038g f5345C;

    /* renamed from: D */
    public C3039h f5346D;

    /* renamed from: E */
    public C3039h f5347E;

    /* renamed from: F */
    public int f5348F;
    @Nullable

    /* renamed from: t */
    public final Handler f5349t;

    /* renamed from: u */
    public final C3040i f5350u;

    /* renamed from: v */
    public final C3036f f5351v;

    /* renamed from: w */
    public final C3030l f5352w;

    /* renamed from: x */
    public boolean f5353x;

    /* renamed from: y */
    public boolean f5354y;

    /* renamed from: z */
    public int f5355z;

    public C3041j(C3040i iVar, @Nullable Looper looper) {
        this(iVar, looper, C3036f.f5339a);
    }

    /* renamed from: A */
    public void mo18193A() {
        this.f5343A = null;
        mo19626J();
        mo19630N();
    }

    /* renamed from: C */
    public void mo18195C(long j, boolean z) {
        mo19626J();
        this.f5353x = false;
        this.f5354y = false;
        if (this.f5355z != 0) {
            mo19631O();
            return;
        }
        mo19629M();
        this.f5344B.flush();
    }

    /* renamed from: F */
    public void mo18198F(Format[] formatArr, long j) {
        Format format = formatArr[0];
        this.f5343A = format;
        if (this.f5344B != null) {
            this.f5355z = 1;
        } else {
            this.f5344B = this.f5351v.mo19623b(format);
        }
    }

    /* renamed from: J */
    public final void mo19626J() {
        mo19632P(Collections.emptyList());
    }

    /* renamed from: K */
    public final long mo19627K() {
        int i = this.f5348F;
        if (i == -1 || i >= this.f5346D.mo19621g()) {
            return Long.MAX_VALUE;
        }
        return this.f5346D.mo19619d(this.f5348F);
    }

    /* renamed from: L */
    public final void mo19628L(List<C3031a> list) {
        this.f5350u.mo19625e(list);
    }

    /* renamed from: M */
    public final void mo19629M() {
        this.f5345C = null;
        this.f5348F = -1;
        C3039h hVar = this.f5346D;
        if (hVar != null) {
            hVar.mo18409r();
            this.f5346D = null;
        }
        C3039h hVar2 = this.f5347E;
        if (hVar2 != null) {
            hVar2.mo18409r();
            this.f5347E = null;
        }
    }

    /* renamed from: N */
    public final void mo19630N() {
        mo19629M();
        this.f5344B.release();
        this.f5344B = null;
        this.f5355z = 0;
    }

    /* renamed from: O */
    public final void mo19631O() {
        mo19630N();
        this.f5344B = this.f5351v.mo19623b(this.f5343A);
    }

    /* renamed from: P */
    public final void mo19632P(List<C3031a> list) {
        Handler handler = this.f5349t;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            mo19628L(list);
        }
    }

    /* renamed from: a */
    public int mo18904a(Format format) {
        return this.f5351v.mo19622a(format) ? C2589c.m4787I((C2650i<?>) null, format.f7569t) ? 4 : 2 : C3166p.m7900l(format.f7566q) ? 1 : 0;
    }

    /* renamed from: b */
    public boolean mo18329b() {
        return this.f5354y;
    }

    /* renamed from: c */
    public boolean mo18330c() {
        return true;
    }

    public boolean handleMessage(Message message) {
        if (message.what == 0) {
            mo19628L((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public void mo18906o(long j, long j2) {
        boolean z;
        if (!this.f5354y) {
            if (this.f5347E == null) {
                this.f5344B.mo19612a(j);
                try {
                    this.f5347E = (C3039h) this.f5344B.mo18398b();
                } catch (SubtitleDecoderException e) {
                    throw ExoPlaybackException.createForRenderer(e, mo18220x());
                }
            }
            if (getState() == 2) {
                if (this.f5346D != null) {
                    long K = mo19627K();
                    z = false;
                    while (K <= j) {
                        this.f5348F++;
                        K = mo19627K();
                        z = true;
                    }
                } else {
                    z = false;
                }
                C3039h hVar = this.f5347E;
                if (hVar != null) {
                    if (hVar.mo18390n()) {
                        if (!z && mo19627K() == Long.MAX_VALUE) {
                            if (this.f5355z == 2) {
                                mo19631O();
                            } else {
                                mo19629M();
                                this.f5354y = true;
                            }
                        }
                    } else if (this.f5347E.f3310l <= j) {
                        C3039h hVar2 = this.f5346D;
                        if (hVar2 != null) {
                            hVar2.mo18409r();
                        }
                        C3039h hVar3 = this.f5347E;
                        this.f5346D = hVar3;
                        this.f5347E = null;
                        this.f5348F = hVar3.mo19618c(j);
                        z = true;
                    }
                }
                if (z) {
                    mo19632P(this.f5346D.mo19620e(j));
                }
                if (this.f5355z != 2) {
                    while (!this.f5353x) {
                        try {
                            if (this.f5345C == null) {
                                C3038g gVar = (C3038g) this.f5344B.mo18399c();
                                this.f5345C = gVar;
                                if (gVar == null) {
                                    return;
                                }
                            }
                            if (this.f5355z == 1) {
                                this.f5345C.mo18392q(4);
                                this.f5344B.mo18400d(this.f5345C);
                                this.f5345C = null;
                                this.f5355z = 2;
                                return;
                            }
                            int G = mo18199G(this.f5352w, this.f5345C, false);
                            if (G == -4) {
                                if (this.f5345C.mo18390n()) {
                                    this.f5353x = true;
                                } else {
                                    this.f5345C.f5340p = this.f5352w.f5333a.f7570u;
                                    this.f5345C.mo18406u();
                                }
                                this.f5344B.mo18400d(this.f5345C);
                                this.f5345C = null;
                            } else if (G == -3) {
                                return;
                            }
                        } catch (SubtitleDecoderException e2) {
                            throw ExoPlaybackException.createForRenderer(e2, mo18220x());
                        }
                    }
                }
            }
        }
    }

    public C3041j(C3040i iVar, @Nullable Looper looper, C3036f fVar) {
        super(3);
        Handler handler;
        C3151e.m7757e(iVar);
        this.f5350u = iVar;
        if (looper == null) {
            handler = null;
        } else {
            handler = C3152e0.m7818r(looper, this);
        }
        this.f5349t = handler;
        this.f5351v = fVar;
        this.f5352w = new C3030l();
    }
}
