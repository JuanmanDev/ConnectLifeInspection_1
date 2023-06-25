package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p223e0.C2641c;
import p040c.p200q.p201a.p219b.p223e0.C2645g;
import p040c.p200q.p201a.p219b.p223e0.C2649h;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p223e0.C2651j;
import p040c.p200q.p201a.p219b.p223e0.C2652k;
import p040c.p200q.p201a.p219b.p223e0.C2653l;
import p040c.p200q.p201a.p219b.p223e0.C2657n;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3158j;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

@TargetApi(18)
public class DefaultDrmSessionManager<T extends C2652k> implements C2650i<T>, C2645g.C2648c<T> {

    /* renamed from: a */
    public final UUID f7641a;

    /* renamed from: b */
    public final C2653l<T> f7642b;

    /* renamed from: c */
    public final C2657n f7643c;

    /* renamed from: d */
    public final HashMap<String, String> f7644d;

    /* renamed from: e */
    public final C3158j<C2649h> f7645e;

    /* renamed from: f */
    public final boolean f7646f;

    /* renamed from: g */
    public final int f7647g;

    /* renamed from: h */
    public final List<C2645g<T>> f7648h;

    /* renamed from: i */
    public final List<C2645g<T>> f7649i;

    /* renamed from: j */
    public Looper f7650j;

    /* renamed from: k */
    public int f7651k;

    /* renamed from: l */
    public byte[] f7652l;

    /* renamed from: m */
    public volatile DefaultDrmSessionManager<T>.b f7653m;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    public class C4004b extends Handler {
        public C4004b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (C2645g gVar : DefaultDrmSessionManager.this.f7648h) {
                if (gVar.mo18446j(bArr)) {
                    gVar.mo18452q(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public static List<DrmInitData.SchemeData> m10359i(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f7658n);
        for (int i = 0; i < drmInitData.f7658n; i++) {
            DrmInitData.SchemeData e = drmInitData.mo23985e(i);
            if ((e.mo23993e(uuid) || (C2627d.f3281c.equals(uuid) && e.mo23993e(C2627d.f3280b))) && (e.f7663o != null || z)) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public DrmSession<T> mo18469a(Looper looper, DrmInitData drmInitData) {
        List<DrmInitData.SchemeData> list;
        Looper looper2 = this.f7650j;
        C3151e.m7759g(looper2 == null || looper2 == looper);
        if (this.f7648h.isEmpty()) {
            this.f7650j = looper;
            if (this.f7653m == null) {
                this.f7653m = new C4004b(looper);
            }
        }
        C2645g gVar = null;
        if (this.f7652l == null) {
            List<DrmInitData.SchemeData> i = m10359i(drmInitData, this.f7641a, false);
            if (i.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f7641a);
                this.f7645e.mo19960b(new C2641c(missingSchemeDataException));
                return new C2651j(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
            list = i;
        } else {
            list = null;
        }
        if (this.f7646f) {
            Iterator<C2645g<T>> it = this.f7648h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2645g next = it.next();
                if (C3152e0.m7789b(next.f3344a, list)) {
                    gVar = next;
                    break;
                }
            }
        } else if (!this.f7648h.isEmpty()) {
            gVar = this.f7648h.get(0);
        }
        if (gVar == null) {
            C2645g gVar2 = new C2645g(this.f7641a, this.f7642b, this, list, this.f7651k, this.f7652l, this.f7644d, this.f7643c, looper, this.f7645e, this.f7647g);
            this.f7648h.add(gVar2);
            gVar = gVar2;
        }
        gVar.mo18442g();
        return gVar;
    }

    /* renamed from: b */
    public void mo18466b(C2645g<T> gVar) {
        this.f7649i.add(gVar);
        if (this.f7649i.size() == 1) {
            gVar.mo18458w();
        }
    }

    /* renamed from: c */
    public void mo18467c(Exception exc) {
        for (C2645g<T> s : this.f7649i) {
            s.mo18454s(exc);
        }
        this.f7649i.clear();
    }

    /* renamed from: d */
    public boolean mo18470d(@NonNull DrmInitData drmInitData) {
        if (this.f7652l != null) {
            return true;
        }
        if (m10359i(drmInitData, this.f7641a, true).isEmpty()) {
            if (drmInitData.f7658n != 1 || !drmInitData.mo23985e(0).mo23993e(C2627d.f3280b)) {
                return false;
            }
            C3163m.m7880f("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f7641a);
        }
        String str = drmInitData.f7657m;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if (("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) && C3152e0.f5819a < 25) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo18468e() {
        for (C2645g<T> r : this.f7649i) {
            r.mo18453r();
        }
        this.f7649i.clear();
    }

    /* renamed from: f */
    public void mo18471f(DrmSession<T> drmSession) {
        if (!(drmSession instanceof C2651j)) {
            C2645g<T> gVar = (C2645g) drmSession;
            if (gVar.mo18459x()) {
                this.f7648h.remove(gVar);
                if (this.f7649i.size() > 1 && this.f7649i.get(0) == gVar) {
                    this.f7649i.get(1).mo18458w();
                }
                this.f7649i.remove(gVar);
            }
        }
    }

    /* renamed from: h */
    public final void mo23979h(Handler handler, C2649h hVar) {
        this.f7645e.mo19959a(handler, hVar);
    }
}
