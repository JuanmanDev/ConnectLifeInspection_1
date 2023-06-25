package p040c.p200q.p406e.p410l.p411l;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.l.l.b */
/* compiled from: WhiteRectangleDetector */
public final class C7044b {

    /* renamed from: a */
    public final C7033b f13488a;

    /* renamed from: b */
    public final int f13489b;

    /* renamed from: c */
    public final int f13490c;

    /* renamed from: d */
    public final int f13491d;

    /* renamed from: e */
    public final int f13492e;

    /* renamed from: f */
    public final int f13493f;

    /* renamed from: g */
    public final int f13494g;

    public C7044b(C7033b bVar) {
        this(bVar, 10, bVar.mo32542k() / 2, bVar.mo32538h() / 2);
    }

    /* renamed from: a */
    public final C7023i[] mo32574a(C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4) {
        float c = iVar.mo32486c();
        float d = iVar.mo32487d();
        float c2 = iVar2.mo32486c();
        float d2 = iVar2.mo32487d();
        float c3 = iVar3.mo32486c();
        float d3 = iVar3.mo32487d();
        float c4 = iVar4.mo32486c();
        float d4 = iVar4.mo32487d();
        if (c < ((float) this.f13490c) / 2.0f) {
            return new C7023i[]{new C7023i(c4 - 1.0f, d4 + 1.0f), new C7023i(c2 + 1.0f, d2 + 1.0f), new C7023i(c3 - 1.0f, d3 - 1.0f), new C7023i(c + 1.0f, d - 1.0f)};
        }
        return new C7023i[]{new C7023i(c4 + 1.0f, d4 + 1.0f), new C7023i(c2 + 1.0f, d2 - 1.0f), new C7023i(c3 - 1.0f, d3 + 1.0f), new C7023i(c - 1.0f, d - 1.0f)};
    }

    /* renamed from: b */
    public final boolean mo32575b(int i, int i2, int i3, boolean z) {
        if (z) {
            while (i <= i2) {
                if (this.f13488a.mo32534d(i, i3)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i2) {
            if (this.f13488a.mo32534d(i3, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    /* renamed from: c */
    public C7023i[] mo32576c() {
        int i = this.f13491d;
        int i2 = this.f13492e;
        int i3 = this.f13494g;
        int i4 = this.f13493f;
        boolean z = false;
        int i5 = 1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = true;
        while (true) {
            if (!z7) {
                break;
            }
            boolean z8 = false;
            boolean z9 = true;
            while (true) {
                if ((z9 || !z2) && i2 < this.f13490c) {
                    z9 = mo32575b(i3, i4, i2, false);
                    if (z9) {
                        i2++;
                        z2 = true;
                        z8 = true;
                    } else if (!z2) {
                        i2++;
                    }
                }
            }
            if (i2 >= this.f13490c) {
                break;
            }
            boolean z10 = true;
            while (true) {
                if ((z10 || !z3) && i4 < this.f13489b) {
                    z10 = mo32575b(i, i2, i4, true);
                    if (z10) {
                        i4++;
                        z3 = true;
                        z8 = true;
                    } else if (!z3) {
                        i4++;
                    }
                }
            }
            if (i4 >= this.f13489b) {
                break;
            }
            boolean z11 = true;
            while (true) {
                if ((z11 || !z4) && i >= 0) {
                    z11 = mo32575b(i3, i4, i, false);
                    if (z11) {
                        i--;
                        z4 = true;
                        z8 = true;
                    } else if (!z4) {
                        i--;
                    }
                }
            }
            if (i < 0) {
                break;
            }
            z7 = z8;
            boolean z12 = true;
            while (true) {
                if ((z12 || !z6) && i3 >= 0) {
                    z12 = mo32575b(i, i2, i3, true);
                    if (z12) {
                        i3--;
                        z7 = true;
                        z6 = true;
                    } else if (!z6) {
                        i3--;
                    }
                }
            }
            if (i3 < 0) {
                break;
            } else if (z7) {
                z5 = true;
            }
        }
        z = true;
        if (z || !z5) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i6 = i2 - i;
        C7023i iVar = null;
        int i7 = 1;
        C7023i iVar2 = null;
        while (iVar2 == null && i7 < i6) {
            iVar2 = mo32577d((float) i, (float) (i4 - i7), (float) (i + i7), (float) i4);
            i7++;
        }
        if (iVar2 != null) {
            int i8 = 1;
            C7023i iVar3 = null;
            while (iVar3 == null && i8 < i6) {
                iVar3 = mo32577d((float) i, (float) (i3 + i8), (float) (i + i8), (float) i3);
                i8++;
            }
            if (iVar3 != null) {
                int i9 = 1;
                C7023i iVar4 = null;
                while (iVar4 == null && i9 < i6) {
                    iVar4 = mo32577d((float) i2, (float) (i3 + i9), (float) (i2 - i9), (float) i3);
                    i9++;
                }
                if (iVar4 != null) {
                    while (iVar == null && i5 < i6) {
                        iVar = mo32577d((float) i2, (float) (i4 - i5), (float) (i2 - i5), (float) i4);
                        i5++;
                    }
                    if (iVar != null) {
                        return mo32574a(iVar, iVar2, iVar4, iVar3);
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public final C7023i mo32577d(float f, float f2, float f3, float f4) {
        int c = C7043a.m20885c(C7043a.m20883a(f, f2, f3, f4));
        float f5 = (float) c;
        float f6 = (f3 - f) / f5;
        float f7 = (f4 - f2) / f5;
        for (int i = 0; i < c; i++) {
            float f8 = (float) i;
            int c2 = C7043a.m20885c((f8 * f6) + f);
            int c3 = C7043a.m20885c((f8 * f7) + f2);
            if (this.f13488a.mo32534d(c2, c3)) {
                return new C7023i((float) c2, (float) c3);
            }
        }
        return null;
    }

    public C7044b(C7033b bVar, int i, int i2, int i3) {
        this.f13488a = bVar;
        this.f13489b = bVar.mo32538h();
        int k = bVar.mo32542k();
        this.f13490c = k;
        int i4 = i / 2;
        int i5 = i2 - i4;
        this.f13491d = i5;
        int i6 = i2 + i4;
        this.f13492e = i6;
        int i7 = i3 - i4;
        this.f13494g = i7;
        int i8 = i3 + i4;
        this.f13493f = i8;
        if (i7 < 0 || i5 < 0 || i8 >= this.f13489b || i6 >= k) {
            throw NotFoundException.getNotFoundInstance();
        }
    }
}
