package p040c.p175p.p176a.p177a.p180j;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* renamed from: c.p.a.a.j.b */
/* compiled from: PagePart */
public class C2239b {

    /* renamed from: a */
    public int f2283a;

    /* renamed from: b */
    public Bitmap f2284b;

    /* renamed from: c */
    public RectF f2285c;

    /* renamed from: d */
    public boolean f2286d;

    /* renamed from: e */
    public int f2287e;

    public C2239b(int i, Bitmap bitmap, RectF rectF, boolean z, int i2) {
        this.f2283a = i;
        this.f2284b = bitmap;
        this.f2285c = rectF;
        this.f2286d = z;
        this.f2287e = i2;
    }

    /* renamed from: a */
    public int mo17201a() {
        return this.f2287e;
    }

    /* renamed from: b */
    public int mo17202b() {
        return this.f2283a;
    }

    /* renamed from: c */
    public RectF mo17203c() {
        return this.f2285c;
    }

    /* renamed from: d */
    public Bitmap mo17204d() {
        return this.f2284b;
    }

    /* renamed from: e */
    public boolean mo17205e() {
        return this.f2286d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2239b)) {
            return false;
        }
        C2239b bVar = (C2239b) obj;
        if (bVar.mo17202b() == this.f2283a && bVar.mo17203c().left == this.f2285c.left && bVar.mo17203c().right == this.f2285c.right && bVar.mo17203c().top == this.f2285c.top && bVar.mo17203c().bottom == this.f2285c.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void mo17207f(int i) {
        this.f2287e = i;
    }
}
