package p040c.p200q.p406e;

import p040c.p200q.p406e.p410l.p411l.C7043a;

/* renamed from: c.q.e.i */
/* compiled from: ResultPoint */
public class C7023i {

    /* renamed from: a */
    public final float f13425a;

    /* renamed from: b */
    public final float f13426b;

    public C7023i(float f, float f2) {
        this.f13425a = f;
        this.f13426b = f2;
    }

    /* renamed from: a */
    public static float m20773a(C7023i iVar, C7023i iVar2, C7023i iVar3) {
        float f = iVar2.f13425a;
        float f2 = iVar2.f13426b;
        return ((iVar3.f13425a - f) * (iVar.f13426b - f2)) - ((iVar3.f13426b - f2) * (iVar.f13425a - f));
    }

    /* renamed from: b */
    public static float m20774b(C7023i iVar, C7023i iVar2) {
        return C7043a.m20883a(iVar.f13425a, iVar.f13426b, iVar2.f13425a, iVar2.f13426b);
    }

    /* renamed from: e */
    public static void m20775e(C7023i[] iVarArr) {
        C7023i iVar;
        C7023i iVar2;
        C7023i iVar3;
        float b = m20774b(iVarArr[0], iVarArr[1]);
        float b2 = m20774b(iVarArr[1], iVarArr[2]);
        float b3 = m20774b(iVarArr[0], iVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            iVar3 = iVarArr[0];
            iVar2 = iVarArr[1];
            iVar = iVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            iVar3 = iVarArr[2];
            iVar2 = iVarArr[0];
            iVar = iVarArr[1];
        } else {
            iVar3 = iVarArr[1];
            iVar2 = iVarArr[0];
            iVar = iVarArr[2];
        }
        if (m20773a(iVar2, iVar3, iVar) < 0.0f) {
            C7023i iVar4 = iVar;
            iVar = iVar2;
            iVar2 = iVar4;
        }
        iVarArr[0] = iVar2;
        iVarArr[1] = iVar3;
        iVarArr[2] = iVar;
    }

    /* renamed from: c */
    public final float mo32486c() {
        return this.f13425a;
    }

    /* renamed from: d */
    public final float mo32487d() {
        return this.f13426b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7023i) {
            C7023i iVar = (C7023i) obj;
            if (this.f13425a == iVar.f13425a && this.f13426b == iVar.f13426b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f13425a) * 31) + Float.floatToIntBits(this.f13426b);
    }

    public final String toString() {
        return "(" + this.f13425a + ',' + this.f13426b + ')';
    }
}
