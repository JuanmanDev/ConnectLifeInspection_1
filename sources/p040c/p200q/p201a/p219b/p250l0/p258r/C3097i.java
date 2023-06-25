package p040c.p200q.p201a.p219b.p250l0.p258r;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p250l0.C3031a;
import p040c.p200q.p201a.p219b.p250l0.C3034d;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.l0.r.i */
/* compiled from: WebvttSubtitle */
public final class C3097i implements C3034d {

    /* renamed from: e */
    public final List<C3089e> f5642e;

    /* renamed from: l */
    public final int f5643l;

    /* renamed from: m */
    public final long[] f5644m;

    /* renamed from: n */
    public final long[] f5645n;

    public C3097i(List<C3089e> list) {
        this.f5642e = list;
        int size = list.size();
        this.f5643l = size;
        this.f5644m = new long[(size * 2)];
        for (int i = 0; i < this.f5643l; i++) {
            C3089e eVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f5644m;
            jArr[i2] = eVar.f5613o;
            jArr[i2 + 1] = eVar.f5614p;
        }
        long[] jArr2 = this.f5644m;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f5645n = copyOf;
        Arrays.sort(copyOf);
    }

    /* renamed from: c */
    public int mo19618c(long j) {
        int c = C3152e0.m7791c(this.f5645n, j, false, false);
        if (c < this.f5645n.length) {
            return c;
        }
        return -1;
    }

    /* renamed from: d */
    public long mo19619d(int i) {
        boolean z = true;
        C3151e.m7753a(i >= 0);
        if (i >= this.f5645n.length) {
            z = false;
        }
        C3151e.m7753a(z);
        return this.f5645n[i];
    }

    /* renamed from: e */
    public List<C3031a> mo19620e(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList = null;
        C3089e eVar = null;
        for (int i = 0; i < this.f5643l; i++) {
            long[] jArr = this.f5644m;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C3089e eVar2 = this.f5642e.get(i);
                if (!eVar2.mo19795c()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(eVar.f5334e).append("\n").append(eVar2.f5334e);
                } else {
                    spannableStringBuilder.append("\n").append(eVar2.f5334e);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new C3089e(spannableStringBuilder));
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: g */
    public int mo19621g() {
        return this.f5645n.length;
    }
}
