package p040c.p200q.p201a.p219b.p241k0.p248f0.p249f;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.EventLoop_commonKt;
import p040c.p200q.p201a.p219b.p224f0.p229v.C2742m;
import p040c.p200q.p201a.p219b.p239i0.C2846b;
import p040c.p200q.p201a.p219b.p239i0.C2848d;
import p040c.p200q.p201a.p219b.p261o0.C3150d0;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.f0.f.a */
/* compiled from: SsManifest */
public class C2987a implements C2846b<C2987a> {

    /* renamed from: a */
    public final int f5148a;

    /* renamed from: b */
    public final int f5149b;

    /* renamed from: c */
    public final int f5150c;

    /* renamed from: d */
    public final boolean f5151d;

    /* renamed from: e */
    public final C2988a f5152e;

    /* renamed from: f */
    public final C2989b[] f5153f;

    /* renamed from: g */
    public final long f5154g;

    /* renamed from: h */
    public final long f5155h;

    /* renamed from: c.q.a.b.k0.f0.f.a$a */
    /* compiled from: SsManifest */
    public static class C2988a {

        /* renamed from: a */
        public final UUID f5156a;

        /* renamed from: b */
        public final byte[] f5157b;

        /* renamed from: c */
        public final C2742m[] f5158c;

        public C2988a(UUID uuid, byte[] bArr, C2742m[] mVarArr) {
            this.f5156a = uuid;
            this.f5157b = bArr;
            this.f5158c = mVarArr;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2987a(int i, int i2, long j, long j2, long j3, int i3, boolean z, C2988a aVar, C2989b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : C3152e0.m7792c0(j2, EventLoop_commonKt.MS_TO_NS, j), j3 != 0 ? C3152e0.m7792c0(j3, EventLoop_commonKt.MS_TO_NS, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    /* renamed from: b */
    public final C2987a mo18947a(List<C2848d> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C2989b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            C2848d dVar = (C2848d) arrayList.get(i);
            C2989b bVar2 = this.f5153f[dVar.f4458l];
            if (!(bVar2 == bVar || bVar == null)) {
                arrayList2.add(bVar.mo19464b((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.f5168j[dVar.f4459m]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.mo19464b((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new C2987a(this.f5148a, this.f5149b, this.f5154g, this.f5155h, this.f5150c, this.f5151d, this.f5152e, (C2989b[]) arrayList2.toArray(new C2989b[0]));
    }

    /* renamed from: c.q.a.b.k0.f0.f.a$b */
    /* compiled from: SsManifest */
    public static class C2989b {

        /* renamed from: a */
        public final int f5159a;

        /* renamed from: b */
        public final String f5160b;

        /* renamed from: c */
        public final long f5161c;

        /* renamed from: d */
        public final String f5162d;

        /* renamed from: e */
        public final int f5163e;

        /* renamed from: f */
        public final int f5164f;

        /* renamed from: g */
        public final int f5165g;

        /* renamed from: h */
        public final int f5166h;

        /* renamed from: i */
        public final String f5167i;

        /* renamed from: j */
        public final Format[] f5168j;

        /* renamed from: k */
        public final int f5169k;

        /* renamed from: l */
        public final String f5170l;

        /* renamed from: m */
        public final String f5171m;

        /* renamed from: n */
        public final List<Long> f5172n;

        /* renamed from: o */
        public final long[] f5173o;

        /* renamed from: p */
        public final long f5174p;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C2989b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list, C3152e0.m7794d0(list, EventLoop_commonKt.MS_TO_NS, j), C3152e0.m7792c0(j2, EventLoop_commonKt.MS_TO_NS, j));
            String str6 = str;
            String str7 = str2;
            int i6 = i;
        }

        /* renamed from: a */
        public Uri mo19463a(int i, int i2) {
            boolean z = true;
            C3151e.m7759g(this.f5168j != null);
            C3151e.m7759g(this.f5172n != null);
            if (i2 >= this.f5172n.size()) {
                z = false;
            }
            C3151e.m7759g(z);
            String num = Integer.toString(this.f5168j[i].f7562m);
            String l = this.f5172n.get(i2).toString();
            return C3150d0.m7752d(this.f5170l, this.f5171m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        /* renamed from: b */
        public C2989b mo19464b(Format[] formatArr) {
            String str = this.f5170l;
            return new C2989b(str, this.f5171m, this.f5159a, this.f5160b, this.f5161c, this.f5162d, this.f5163e, this.f5164f, this.f5165g, this.f5166h, this.f5167i, formatArr, this.f5172n, this.f5173o, this.f5174p);
        }

        /* renamed from: c */
        public long mo19465c(int i) {
            if (i == this.f5169k - 1) {
                return this.f5174p;
            }
            long[] jArr = this.f5173o;
            return jArr[i + 1] - jArr[i];
        }

        /* renamed from: d */
        public int mo19466d(long j) {
            return C3152e0.m7795e(this.f5173o, j, true, true);
        }

        /* renamed from: e */
        public long mo19467e(int i) {
            return this.f5173o[i];
        }

        public C2989b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j2) {
            this.f5170l = str;
            this.f5171m = str2;
            this.f5159a = i;
            this.f5160b = str3;
            this.f5161c = j;
            this.f5162d = str4;
            this.f5163e = i2;
            this.f5164f = i3;
            this.f5165g = i4;
            this.f5166h = i5;
            this.f5167i = str5;
            this.f5168j = formatArr;
            this.f5172n = list;
            this.f5173o = jArr;
            this.f5174p = j2;
            this.f5169k = list.size();
        }
    }

    public C2987a(int i, int i2, long j, long j2, int i3, boolean z, C2988a aVar, C2989b[] bVarArr) {
        this.f5148a = i;
        this.f5149b = i2;
        this.f5154g = j;
        this.f5155h = j2;
        this.f5150c = i3;
        this.f5151d = z;
        this.f5152e = aVar;
        this.f5153f = bVarArr;
    }
}
