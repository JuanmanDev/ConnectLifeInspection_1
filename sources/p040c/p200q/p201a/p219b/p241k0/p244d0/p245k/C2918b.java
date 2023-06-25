package p040c.p200q.p201a.p219b.p241k0.p244d0.p245k;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p040c.p200q.p201a.p219b.C2627d;
import p040c.p200q.p201a.p219b.p239i0.C2846b;
import p040c.p200q.p201a.p219b.p239i0.C2848d;

/* renamed from: c.q.a.b.k0.d0.k.b */
/* compiled from: DashManifest */
public class C2918b implements C2846b<C2918b> {

    /* renamed from: a */
    public final long f4768a;

    /* renamed from: b */
    public final long f4769b;

    /* renamed from: c */
    public final long f4770c;

    /* renamed from: d */
    public final boolean f4771d;

    /* renamed from: e */
    public final long f4772e;

    /* renamed from: f */
    public final long f4773f;

    /* renamed from: g */
    public final long f4774g;

    /* renamed from: h */
    public final long f4775h;

    /* renamed from: i */
    public final C2938m f4776i;

    /* renamed from: j */
    public final Uri f4777j;
    @Nullable

    /* renamed from: k */
    public final C2924g f4778k;

    /* renamed from: l */
    public final List<C2923f> f4779l;

    public C2918b(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable C2924g gVar, C2938m mVar, Uri uri, List<C2923f> list) {
        this.f4768a = j;
        this.f4769b = j2;
        this.f4770c = j3;
        this.f4771d = z;
        this.f4772e = j4;
        this.f4773f = j5;
        this.f4774g = j6;
        this.f4775h = j7;
        this.f4778k = gVar;
        this.f4776i = mVar;
        this.f4777j = uri;
        this.f4779l = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public static ArrayList<C2917a> m6505c(List<C2917a> list, LinkedList<C2848d> linkedList) {
        C2848d poll = linkedList.poll();
        int i = poll.f4457e;
        ArrayList<C2917a> arrayList = new ArrayList<>();
        do {
            int i2 = poll.f4458l;
            C2917a aVar = list.get(i2);
            List<C2926i> list2 = aVar.f4765c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f4459m));
                poll = linkedList.poll();
                if (!(poll.f4457e == i && poll.f4458l == i2)) {
                    arrayList.add(new C2917a(aVar.f4763a, aVar.f4764b, arrayList2, aVar.f4766d, aVar.f4767e));
                }
                arrayList2.add(list2.get(poll.f4459m));
                poll = linkedList.poll();
                break;
            } while (poll.f4458l == i2);
            arrayList.add(new C2917a(aVar.f4763a, aVar.f4764b, arrayList2, aVar.f4766d, aVar.f4767e));
        } while (poll.f4457e == i);
        linkedList.addFirst(poll);
        return arrayList;
    }

    /* renamed from: b */
    public final C2918b mo18947a(List<C2848d> list) {
        long j;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new C2848d(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i = 0;
        while (true) {
            j = -9223372036854775807L;
            if (i >= mo19237e()) {
                break;
            }
            if (((C2848d) linkedList.peek()).f4457e != i) {
                long f = mo19238f(i);
                if (f != -9223372036854775807L) {
                    j2 += f;
                }
            } else {
                C2923f d = mo19236d(i);
                arrayList.add(new C2923f(d.f4799a, d.f4800b - j2, m6505c(d.f4801c, linkedList), d.f4802d));
            }
            i++;
        }
        long j3 = this.f4769b;
        if (j3 != -9223372036854775807L) {
            j = j3 - j2;
        }
        return new C2918b(this.f4768a, j, this.f4770c, this.f4771d, this.f4772e, this.f4773f, this.f4774g, this.f4775h, this.f4778k, this.f4776i, this.f4777j, arrayList);
    }

    /* renamed from: d */
    public final C2923f mo19236d(int i) {
        return this.f4779l.get(i);
    }

    /* renamed from: e */
    public final int mo19237e() {
        return this.f4779l.size();
    }

    /* renamed from: f */
    public final long mo19238f(int i) {
        if (i != this.f4779l.size() - 1) {
            return this.f4779l.get(i + 1).f4800b - this.f4779l.get(i).f4800b;
        }
        long j = this.f4769b;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - this.f4779l.get(i).f4800b;
    }

    /* renamed from: g */
    public final long mo19239g(int i) {
        return C2627d.m5057a(mo19238f(i));
    }
}
