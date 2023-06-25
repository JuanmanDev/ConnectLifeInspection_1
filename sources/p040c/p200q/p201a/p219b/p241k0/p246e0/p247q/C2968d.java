package p040c.p200q.p201a.p219b.p241k0.p246e0.p247q;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040c.p200q.p201a.p219b.p239i0.C2848d;

/* renamed from: c.q.a.b.k0.e0.q.d */
/* compiled from: HlsMasterPlaylist */
public final class C2968d extends C2972f {

    /* renamed from: j */
    public static final C2968d f5024j = new C2968d("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (Format) null, Collections.emptyList(), false, Collections.emptyMap());

    /* renamed from: d */
    public final List<C2969a> f5025d;

    /* renamed from: e */
    public final List<C2969a> f5026e;

    /* renamed from: f */
    public final List<C2969a> f5027f;

    /* renamed from: g */
    public final Format f5028g;

    /* renamed from: h */
    public final List<Format> f5029h;

    /* renamed from: i */
    public final Map<String, String> f5030i;

    /* renamed from: c.q.a.b.k0.e0.q.d$a */
    /* compiled from: HlsMasterPlaylist */
    public static final class C2969a {

        /* renamed from: a */
        public final String f5031a;

        /* renamed from: b */
        public final Format f5032b;

        public C2969a(String str, Format format) {
            this.f5031a = str;
            this.f5032b = format;
        }

        /* renamed from: a */
        public static C2969a m6822a(String str) {
            return new C2969a(str, Format.m10239m("0", (String) null, "application/x-mpegURL", (String) null, (String) null, -1, 0, (String) null));
        }
    }

    public C2968d(String str, List<String> list, List<C2969a> list2, List<C2969a> list3, List<C2969a> list4, Format format, List<Format> list5, boolean z, Map<String, String> map) {
        super(str, list, z);
        this.f5025d = Collections.unmodifiableList(list2);
        this.f5026e = Collections.unmodifiableList(list3);
        this.f5027f = Collections.unmodifiableList(list4);
        this.f5028g = format;
        this.f5029h = list5 != null ? Collections.unmodifiableList(list5) : null;
        this.f5030i = Collections.unmodifiableMap(map);
    }

    /* renamed from: c */
    public static List<C2969a> m6818c(List<C2969a> list, int i, List<C2848d> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            C2969a aVar = list.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size()) {
                    break;
                }
                C2848d dVar = list2.get(i3);
                if (dVar.f4458l == i && dVar.f4459m == i2) {
                    arrayList.add(aVar);
                    break;
                }
                i3++;
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static C2968d m6819d(String str) {
        List singletonList = Collections.singletonList(C2969a.m6822a(str));
        List emptyList = Collections.emptyList();
        return new C2968d((String) null, Collections.emptyList(), singletonList, emptyList, emptyList, (Format) null, (List<Format>) null, false, Collections.emptyMap());
    }

    /* renamed from: b */
    public C2968d mo18947a(List<C2848d> list) {
        return new C2968d(this.f5057a, this.f5058b, m6818c(this.f5025d, 0, list), m6818c(this.f5026e, 1, list), m6818c(this.f5027f, 2, list), this.f5028g, this.f5029h, this.f5059c, this.f5030i);
    }
}
