package p040c.p200q.p406e.p426q.p428c;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import java.util.Map;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.C7024j;
import p040c.p200q.p406e.p410l.C7033b;
import p040c.p200q.p406e.p410l.C7037f;
import p040c.p200q.p406e.p410l.C7039h;
import p040c.p200q.p406e.p410l.C7041j;
import p040c.p200q.p406e.p410l.p411l.C7043a;
import p040c.p200q.p406e.p426q.p427b.C7150h;

/* renamed from: c.q.e.q.c.c */
/* compiled from: Detector */
public class C7155c {

    /* renamed from: a */
    public final C7033b f13774a;

    /* renamed from: b */
    public C7024j f13775b;

    public C7155c(C7033b bVar) {
        this.f13774a = bVar;
    }

    /* renamed from: c */
    public static int m21387c(C7023i iVar, C7023i iVar2, C7023i iVar3, float f) {
        int c = ((C7043a.m20885c(C7023i.m20774b(iVar, iVar2) / f) + C7043a.m20885c(C7023i.m20774b(iVar, iVar3) / f)) / 2) + 7;
        int i = c & 3;
        if (i == 0) {
            return c + 1;
        }
        if (i == 2) {
            return c - 1;
        }
        if (i != 3) {
            return c;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    public static C7041j m21388d(C7023i iVar, C7023i iVar2, C7023i iVar3, C7023i iVar4, int i) {
        float f;
        float f2;
        float f3;
        float f4 = ((float) i) - 3.5f;
        if (iVar4 != null) {
            f2 = iVar4.mo32486c();
            f = iVar4.mo32487d();
            f3 = f4 - 3.0f;
        } else {
            f2 = (iVar2.mo32486c() - iVar.mo32486c()) + iVar3.mo32486c();
            f = (iVar2.mo32487d() - iVar.mo32487d()) + iVar3.mo32487d();
            f3 = f4;
        }
        return C7041j.m20876b(3.5f, 3.5f, f4, 3.5f, f3, f3, 3.5f, f4, iVar.mo32486c(), iVar.mo32487d(), iVar2.mo32486c(), iVar2.mo32487d(), f2, f, iVar3.mo32486c(), iVar3.mo32487d());
    }

    /* renamed from: h */
    public static C7033b m21389h(C7033b bVar, C7041j jVar, int i) {
        return C7039h.m20868b().mo32567d(bVar, i, i, jVar);
    }

    /* renamed from: a */
    public final float mo32882a(C7023i iVar, C7023i iVar2, C7023i iVar3) {
        return (mo32883b(iVar, iVar2) + mo32883b(iVar, iVar3)) / 2.0f;
    }

    /* renamed from: b */
    public final float mo32883b(C7023i iVar, C7023i iVar2) {
        float j = mo32888j((int) iVar.mo32486c(), (int) iVar.mo32487d(), (int) iVar2.mo32486c(), (int) iVar2.mo32487d());
        float j2 = mo32888j((int) iVar2.mo32486c(), (int) iVar2.mo32487d(), (int) iVar.mo32486c(), (int) iVar.mo32487d());
        if (Float.isNaN(j)) {
            return j2 / 7.0f;
        }
        return Float.isNaN(j2) ? j / 7.0f : (j + j2) / 14.0f;
    }

    /* renamed from: e */
    public final C7037f mo32884e(Map<DecodeHintType, ?> map) {
        C7024j jVar;
        if (map == null) {
            jVar = null;
        } else {
            jVar = (C7024j) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        this.f13775b = jVar;
        return mo32886g(new C7157e(this.f13774a, jVar).mo32896e(map));
    }

    /* renamed from: f */
    public final C7153a mo32885f(float f, int i, int i2, float f2) {
        int i3 = (int) (f2 * f);
        int max = Math.max(0, i - i3);
        int min = Math.min(this.f13774a.mo32542k() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (((float) min) >= f3) {
            int max2 = Math.max(0, i2 - i3);
            int min2 = Math.min(this.f13774a.mo32538h() - 1, i2 + i3) - max2;
            if (((float) min2) >= f3) {
                return new C7154b(this.f13774a, max, max2, min, min2, f, this.f13775b).mo32879c();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: g */
    public final C7037f mo32886g(C7161f fVar) {
        C7023i[] iVarArr;
        C7156d b = fVar.mo32907b();
        C7156d c = fVar.mo32908c();
        C7156d a = fVar.mo32906a();
        float a2 = mo32882a(b, c, a);
        if (a2 >= 1.0f) {
            int c2 = m21387c(b, c, a, a2);
            C7150h g = C7150h.m21368g(c2);
            int e = g.mo32867e() - 7;
            C7153a aVar = null;
            if (g.mo32866d().length > 0) {
                float c3 = (c.mo32486c() - b.mo32486c()) + a.mo32486c();
                float d = (c.mo32487d() - b.mo32487d()) + a.mo32487d();
                float f = 1.0f - (3.0f / ((float) e));
                int c4 = (int) (b.mo32486c() + ((c3 - b.mo32486c()) * f));
                int d2 = (int) (b.mo32487d() + (f * (d - b.mo32487d())));
                int i = 4;
                while (true) {
                    if (i > 16) {
                        break;
                    }
                    try {
                        aVar = mo32885f(a2, c4, d2, (float) i);
                        break;
                    } catch (NotFoundException unused) {
                        i <<= 1;
                    }
                }
            }
            C7033b h = m21389h(this.f13774a, m21388d(b, c, a, aVar, c2), c2);
            if (aVar == null) {
                iVarArr = new C7023i[]{a, b, c};
            } else {
                iVarArr = new C7023i[]{a, b, c, aVar};
            }
            return new C7037f(h, iVarArr);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: i */
    public final float mo32887i(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        C7155c cVar;
        boolean z2;
        boolean z3 = true;
        boolean z4 = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z4) {
            i7 = i;
            i8 = i2;
            i5 = i3;
            i6 = i4;
        } else {
            i8 = i;
            i7 = i2;
            i6 = i3;
            i5 = i4;
        }
        int abs = Math.abs(i6 - i8);
        int abs2 = Math.abs(i5 - i7);
        int i11 = 2;
        int i12 = (-abs) / 2;
        int i13 = -1;
        int i14 = i8 < i6 ? 1 : -1;
        if (i7 < i5) {
            i13 = 1;
        }
        int i15 = i6 + i14;
        int i16 = i8;
        int i17 = i7;
        int i18 = 0;
        while (true) {
            if (i16 == i15) {
                i9 = i15;
                i10 = i11;
                break;
            }
            int i19 = z4 ? i17 : i16;
            int i20 = z4 ? i16 : i17;
            if (i18 == z3) {
                z = z4;
                z2 = z3;
                i9 = i15;
                cVar = this;
            } else {
                cVar = this;
                z = z4;
                i9 = i15;
                z2 = false;
            }
            if (z2 == cVar.f13774a.mo32534d(i19, i20)) {
                if (i18 == 2) {
                    return C7043a.m20884b(i16, i17, i8, i7);
                }
                i18++;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (i17 == i5) {
                    i10 = 2;
                    break;
                }
                i17 += i13;
                i12 -= abs;
            }
            i16 += i14;
            i15 = i9;
            z4 = z;
            z3 = true;
            i11 = 2;
        }
        if (i18 == i10) {
            return C7043a.m20884b(i9, i5, i8, i7);
        }
        return Float.NaN;
    }

    /* renamed from: j */
    public final float mo32888j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float i5 = mo32887i(i, i2, i3, i4);
        int i6 = i - (i3 - i);
        int i7 = 0;
        if (i6 < 0) {
            f = ((float) i) / ((float) (i - i6));
            i6 = 0;
        } else if (i6 >= this.f13774a.mo32542k()) {
            f = ((float) ((this.f13774a.mo32542k() - 1) - i)) / ((float) (i6 - i));
            i6 = this.f13774a.mo32542k() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = (float) i2;
        int i8 = (int) (f3 - (((float) (i4 - i2)) * f));
        if (i8 < 0) {
            f2 = f3 / ((float) (i2 - i8));
        } else if (i8 >= this.f13774a.mo32538h()) {
            f2 = ((float) ((this.f13774a.mo32538h() - 1) - i2)) / ((float) (i8 - i2));
            i7 = this.f13774a.mo32538h() - 1;
        } else {
            i7 = i8;
            f2 = 1.0f;
        }
        return (i5 + mo32887i(i, i2, (int) (((float) i) + (((float) (i6 - i)) * f2)), i7)) - 1.0f;
    }
}
