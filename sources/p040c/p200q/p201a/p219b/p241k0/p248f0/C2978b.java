package p040c.p200q.p201a.p219b.p241k0.p248f0;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.io.IOException;
import java.util.List;
import p040c.p200q.p201a.p219b.C3216y;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2732g;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2741l;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2870b;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2872d;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2873e;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2876f;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2881i;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2884l;
import p040c.p200q.p201a.p219b.p241k0.p243c0.C2885m;
import p040c.p200q.p201a.p219b.p241k0.p248f0.C2981c;
import p040c.p200q.p201a.p219b.p241k0.p248f0.p249f.C2987a;
import p040c.p200q.p201a.p219b.p259m0.C3107e;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3136s;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.f0.b */
/* compiled from: DefaultSsChunkSource */
public class C2978b implements C2981c {

    /* renamed from: a */
    public final C3136s f5101a;

    /* renamed from: b */
    public final int f5102b;

    /* renamed from: c */
    public final C3107e f5103c;

    /* renamed from: d */
    public final C2873e[] f5104d;

    /* renamed from: e */
    public final C3122h f5105e;

    /* renamed from: f */
    public C2987a f5106f;

    /* renamed from: g */
    public int f5107g;

    /* renamed from: h */
    public IOException f5108h;

    /* renamed from: c.q.a.b.k0.f0.b$a */
    /* compiled from: DefaultSsChunkSource */
    public static final class C2979a implements C2981c.C2982a {

        /* renamed from: a */
        public final C3122h.C3123a f5109a;

        public C2979a(C3122h.C3123a aVar) {
            this.f5109a = aVar;
        }

        /* renamed from: a */
        public C2981c mo19450a(C3136s sVar, C2987a aVar, int i, C3107e eVar, @Nullable C3141v vVar) {
            C3122h a = this.f5109a.mo19884a();
            if (vVar != null) {
                a.mo19308b(vVar);
            }
            return new C2978b(sVar, aVar, i, eVar, a);
        }
    }

    /* renamed from: c.q.a.b.k0.f0.b$b */
    /* compiled from: DefaultSsChunkSource */
    public static final class C2980b extends C2870b {
        public C2980b(C2987a.C2989b bVar, int i, int i2) {
            super((long) i2, (long) (bVar.f5169k - 1));
        }
    }

    public C2978b(C3136s sVar, C2987a aVar, int i, C3107e eVar, C3122h hVar) {
        C2987a aVar2 = aVar;
        int i2 = i;
        C3107e eVar2 = eVar;
        this.f5101a = sVar;
        this.f5106f = aVar2;
        this.f5102b = i2;
        this.f5103c = eVar2;
        this.f5105e = hVar;
        C2987a.C2989b bVar = aVar2.f5153f[i2];
        this.f5104d = new C2873e[eVar.length()];
        int i3 = 0;
        while (i3 < this.f5104d.length) {
            int g = eVar2.mo19825g(i3);
            Format format = bVar.f5168j[g];
            int i4 = i3;
            C2741l lVar = r7;
            C2741l lVar2 = new C2741l(g, bVar.f5159a, bVar.f5161c, -9223372036854775807L, aVar2.f5154g, format, 0, format.f7569t != null ? aVar2.f5152e.f5158c : null, bVar.f5159a == 2 ? 4 : 0, (long[]) null, (long[]) null);
            this.f5104d[i4] = new C2873e(new C2732g(3, (C3146b0) null, lVar, (DrmInitData) null), bVar.f5159a, format);
            i3 = i4 + 1;
        }
    }

    /* renamed from: i */
    public static C2884l m6854i(Format format, C3122h hVar, Uri uri, String str, int i, long j, long j2, long j3, int i2, Object obj, C2873e eVar) {
        C3122h hVar2 = hVar;
        long j4 = j2;
        long j5 = j3;
        int i3 = i2;
        Object obj2 = obj;
        C3125j jVar = r26;
        C3125j jVar2 = new C3125j(uri, 0, -1, str);
        return new C2881i(hVar2, jVar, format, i3, obj2, j, j4, j5, -9223372036854775807L, (long) i, 1, j, eVar);
    }

    /* renamed from: a */
    public void mo19115a() {
        IOException iOException = this.f5108h;
        if (iOException == null) {
            this.f5101a.mo19182a();
            return;
        }
        throw iOException;
    }

    /* renamed from: b */
    public void mo19448b(C2987a aVar) {
        C2987a.C2989b[] bVarArr = this.f5106f.f5153f;
        int i = this.f5102b;
        C2987a.C2989b bVar = bVarArr[i];
        int i2 = bVar.f5169k;
        C2987a.C2989b bVar2 = aVar.f5153f[i];
        if (i2 == 0 || bVar2.f5169k == 0) {
            this.f5107g += i2;
        } else {
            int i3 = i2 - 1;
            long e = bVar.mo19467e(i3) + bVar.mo19465c(i3);
            long e2 = bVar2.mo19467e(0);
            if (e <= e2) {
                this.f5107g += i2;
            } else {
                this.f5107g += bVar.mo19466d(e2);
            }
        }
        this.f5106f = aVar;
    }

    /* renamed from: c */
    public boolean mo19116c(C2872d dVar, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            C3107e eVar = this.f5103c;
            if (eVar.mo19821c(eVar.mo19827i(dVar.f4555c), j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public long mo19117e(long j, C3216y yVar) {
        C2987a.C2989b bVar = this.f5106f.f5153f[this.f5102b];
        int d = bVar.mo19466d(j);
        long e = bVar.mo19467e(d);
        return C3152e0.m7790b0(j, yVar, e, (e >= j || d >= bVar.f5169k + -1) ? e : bVar.mo19467e(d + 1));
    }

    /* renamed from: f */
    public int mo19118f(long j, List<? extends C2884l> list) {
        if (this.f5108h != null || this.f5103c.length() < 2) {
            return list.size();
        }
        return this.f5103c.mo19814h(j, list);
    }

    /* renamed from: g */
    public void mo19119g(C2872d dVar) {
    }

    /* renamed from: h */
    public final void mo19120h(long j, long j2, List<? extends C2884l> list, C2876f fVar) {
        int i;
        long j3 = j2;
        C2876f fVar2 = fVar;
        if (this.f5108h == null) {
            C2987a aVar = this.f5106f;
            C2987a.C2989b bVar = aVar.f5153f[this.f5102b];
            if (bVar.f5169k == 0) {
                fVar2.f4578b = !aVar.f5151d;
                return;
            }
            if (list.isEmpty()) {
                i = bVar.mo19466d(j3);
                List<? extends C2884l> list2 = list;
            } else {
                i = (int) (((C2884l) list.get(list.size() - 1)).mo19122f() - ((long) this.f5107g));
                if (i < 0) {
                    this.f5108h = new BehindLiveWindowException();
                    return;
                }
            }
            if (i >= bVar.f5169k) {
                fVar2.f4578b = !this.f5106f.f5151d;
                return;
            }
            long j4 = j3 - j;
            long j5 = mo19449j(j);
            int length = this.f5103c.length();
            C2885m[] mVarArr = new C2885m[length];
            for (int i2 = 0; i2 < length; i2++) {
                mVarArr[i2] = new C2980b(bVar, this.f5103c.mo19825g(i2), i);
            }
            this.f5103c.mo19338j(j, j4, j5, list, mVarArr);
            long e = bVar.mo19467e(i);
            long c = e + bVar.mo19465c(i);
            if (!list.isEmpty()) {
                j3 = -9223372036854775807L;
            }
            long j6 = j3;
            int i3 = i + this.f5107g;
            int b = this.f5103c.mo19337b();
            C2873e eVar = this.f5104d[b];
            Uri a = bVar.mo19463a(this.f5103c.mo19825g(b), i);
            fVar2.f4577a = m6854i(this.f5103c.mo19829l(), this.f5105e, a, (String) null, i3, e, c, j6, this.f5103c.mo19339m(), this.f5103c.mo19340p(), eVar);
        }
    }

    /* renamed from: j */
    public final long mo19449j(long j) {
        C2987a aVar = this.f5106f;
        if (!aVar.f5151d) {
            return -9223372036854775807L;
        }
        C2987a.C2989b bVar = aVar.f5153f[this.f5102b];
        int i = bVar.f5169k - 1;
        return (bVar.mo19467e(i) + bVar.mo19465c(i)) - j;
    }
}
