package p040c.p200q.p201a.p219b.p261o0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: c.q.a.b.o0.w */
/* compiled from: SlidingPercentile */
public class C3176w {

    /* renamed from: h */
    public static final Comparator<C3178b> f5884h = C3145b.f5813e;

    /* renamed from: i */
    public static final Comparator<C3178b> f5885i = C3147c.f5817e;

    /* renamed from: a */
    public final int f5886a;

    /* renamed from: b */
    public final ArrayList<C3178b> f5887b = new ArrayList<>();

    /* renamed from: c */
    public final C3178b[] f5888c = new C3178b[5];

    /* renamed from: d */
    public int f5889d = -1;

    /* renamed from: e */
    public int f5890e;

    /* renamed from: f */
    public int f5891f;

    /* renamed from: g */
    public int f5892g;

    /* renamed from: c.q.a.b.o0.w$b */
    /* compiled from: SlidingPercentile */
    public static class C3178b {

        /* renamed from: a */
        public int f5893a;

        /* renamed from: b */
        public int f5894b;

        /* renamed from: c */
        public float f5895c;

        public C3178b() {
        }
    }

    public C3176w(int i) {
        this.f5886a = i;
    }

    /* renamed from: e */
    public static /* synthetic */ int m7983e(C3178b bVar, C3178b bVar2) {
        return bVar.f5893a - bVar2.f5893a;
    }

    /* renamed from: a */
    public void mo20046a(int i, float f) {
        C3178b bVar;
        mo20047b();
        int i2 = this.f5892g;
        if (i2 > 0) {
            C3178b[] bVarArr = this.f5888c;
            int i3 = i2 - 1;
            this.f5892g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C3178b();
        }
        int i4 = this.f5890e;
        this.f5890e = i4 + 1;
        bVar.f5893a = i4;
        bVar.f5894b = i;
        bVar.f5895c = f;
        this.f5887b.add(bVar);
        this.f5891f += i;
        while (true) {
            int i5 = this.f5891f;
            int i6 = this.f5886a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C3178b bVar2 = this.f5887b.get(0);
                int i8 = bVar2.f5894b;
                if (i8 <= i7) {
                    this.f5891f -= i8;
                    this.f5887b.remove(0);
                    int i9 = this.f5892g;
                    if (i9 < 5) {
                        C3178b[] bVarArr2 = this.f5888c;
                        this.f5892g = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f5894b = i8 - i7;
                    this.f5891f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo20047b() {
        if (this.f5889d != 1) {
            Collections.sort(this.f5887b, f5884h);
            this.f5889d = 1;
        }
    }

    /* renamed from: c */
    public final void mo20048c() {
        if (this.f5889d != 0) {
            Collections.sort(this.f5887b, f5885i);
            this.f5889d = 0;
        }
    }

    /* renamed from: d */
    public float mo20049d(float f) {
        mo20048c();
        float f2 = f * ((float) this.f5891f);
        int i = 0;
        for (int i2 = 0; i2 < this.f5887b.size(); i2++) {
            C3178b bVar = this.f5887b.get(i2);
            i += bVar.f5894b;
            if (((float) i) >= f2) {
                return bVar.f5895c;
            }
        }
        if (this.f5887b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<C3178b> arrayList = this.f5887b;
        return arrayList.get(arrayList.size() - 1).f5895c;
    }
}
