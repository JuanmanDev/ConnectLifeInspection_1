package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.camera.core.VideoCapture;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p224f0.C2674g;
import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p224f0.p228u.C2712e;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2732g;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2741l;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2777d0;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2780e;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2788g;
import p040c.p200q.p201a.p219b.p224f0.p232y.C2791i;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3166p;

/* renamed from: c.q.a.b.k0.e0.e */
/* compiled from: DefaultHlsExtractorFactory */
public final class C2944e implements C2951h {

    /* renamed from: b */
    public final int f4852b;

    public C2944e() {
        this(0);
    }

    /* renamed from: b */
    public static Pair<C2674g, Boolean> m6624b(C2674g gVar) {
        return new Pair<>(gVar, Boolean.valueOf((gVar instanceof C2788g) || (gVar instanceof C2780e) || (gVar instanceof C2712e)));
    }

    /* renamed from: d */
    public static C2777d0 m6625d(int i, Format format, List<Format> list, C3146b0 b0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else {
            list = Collections.singletonList(Format.m10245s((String) null, "application/cea-608", 0, (String) null));
        }
        String str = format.f7563n;
        if (!TextUtils.isEmpty(str)) {
            if (!VideoCapture.AUDIO_MIME_TYPE.equals(C3166p.m7889a(str))) {
                i2 |= 2;
            }
            if (!VideoCapture.VIDEO_MIME_TYPE.equals(C3166p.m7898j(str))) {
                i2 |= 4;
            }
        }
        return new C2777d0(2, b0Var, new C2791i(i2, list));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static boolean m6626e(C2674g gVar, C2675h hVar) {
        try {
            boolean b = gVar.mo18547b(hVar);
            hVar.mo18527f();
            return b;
        } catch (EOFException unused) {
            hVar.mo18527f();
            return false;
        } catch (Throwable th) {
            hVar.mo18527f();
            throw th;
        }
    }

    /* renamed from: a */
    public Pair<C2674g, Boolean> mo19316a(C2674g gVar, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, C3146b0 b0Var, Map<String, List<String>> map, C2675h hVar) {
        List<Format> list2;
        if (gVar == null) {
            C2674g c = mo19317c(uri, format, list, drmInitData, b0Var);
            hVar.mo18527f();
            if (m6626e(c, hVar)) {
                return m6624b(c);
            }
            if (!(c instanceof C2963p)) {
                C2963p pVar = new C2963p(format.f7557J, b0Var);
                if (m6626e(pVar, hVar)) {
                    return m6624b(pVar);
                }
            }
            if (!(c instanceof C2788g)) {
                C2788g gVar2 = new C2788g();
                if (m6626e(gVar2, hVar)) {
                    return m6624b(gVar2);
                }
            }
            if (!(c instanceof C2780e)) {
                C2780e eVar = new C2780e();
                if (m6626e(eVar, hVar)) {
                    return m6624b(eVar);
                }
            }
            if (!(c instanceof C2712e)) {
                C2712e eVar2 = new C2712e(0, 0);
                if (m6626e(eVar2, hVar)) {
                    return m6624b(eVar2);
                }
            }
            if (!(c instanceof C2732g)) {
                if (list != null) {
                    list2 = list;
                } else {
                    list2 = Collections.emptyList();
                }
                C2732g gVar3 = new C2732g(0, b0Var, (C2741l) null, drmInitData, list2);
                if (m6626e(gVar3, hVar)) {
                    return m6624b(gVar3);
                }
            }
            if (!(c instanceof C2777d0)) {
                C2777d0 d = m6625d(this.f4852b, format, list, b0Var);
                if (m6626e(d, hVar)) {
                    return m6624b(d);
                }
            }
            return m6624b(c);
        } else if ((gVar instanceof C2777d0) || (gVar instanceof C2732g)) {
            return m6624b(gVar);
        } else {
            if (gVar instanceof C2963p) {
                return m6624b(new C2963p(format.f7557J, b0Var));
            }
            if (gVar instanceof C2788g) {
                return m6624b(new C2788g());
            }
            if (gVar instanceof C2780e) {
                return m6624b(new C2780e());
            }
            if (gVar instanceof C2712e) {
                return m6624b(new C2712e());
            }
            throw new IllegalArgumentException("Unexpected previousExtractor type: " + gVar.getClass().getSimpleName());
        }
    }

    /* renamed from: c */
    public final C2674g mo19317c(Uri uri, Format format, List<Format> list, DrmInitData drmInitData, C3146b0 b0Var) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if ("text/vtt".equals(format.f7566q) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            return new C2963p(format.f7557J, b0Var);
        }
        if (lastPathSegment.endsWith(".aac")) {
            return new C2788g();
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return new C2780e();
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return new C2712e(0, 0);
        }
        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return m6625d(this.f4852b, format, list, b0Var);
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C2732g(0, b0Var, (C2741l) null, drmInitData, list);
    }

    public C2944e(int i) {
        this.f4852b = i;
    }
}
