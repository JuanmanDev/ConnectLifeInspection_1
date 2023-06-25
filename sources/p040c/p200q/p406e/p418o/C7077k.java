package p040c.p200q.p406e.p418o;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import p040c.p200q.p406e.C7016b;
import p040c.p200q.p406e.C7021g;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.C7023i;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.k */
/* compiled from: OneDReader */
public abstract class C7077k implements C7021g {
    /* renamed from: e */
    public static float m21023e(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = (float) i;
        float f3 = f2 / ((float) i2);
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            float f6 = ((float) iArr2[i4]) * f3;
            float f7 = (float) i5;
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }

    /* renamed from: f */
    public static void m21024f(C7032a aVar, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int h = aVar.mo32523h();
        if (i < h) {
            boolean z = !aVar.mo32517c(i);
            while (i < h) {
                if (!(aVar.mo32517c(i) ^ z)) {
                    i2++;
                    if (i2 == length) {
                        break;
                    }
                    iArr[i2] = 1;
                    z = !z;
                } else {
                    iArr[i2] = iArr[i2] + 1;
                }
                i++;
            }
            if (i2 == length) {
                return;
            }
            if (i2 != length - 1 || i != h) {
                throw NotFoundException.getNotFoundInstance();
            }
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: g */
    public static void m21025g(C7032a aVar, int i, int[] iArr) {
        int length = iArr.length;
        boolean c = aVar.mo32517c(i);
        while (i > 0 && length >= 0) {
            i--;
            if (aVar.mo32517c(i) != c) {
                length--;
                c = !c;
            }
        }
        if (length < 0) {
            m21024f(aVar, i + 1, iArr);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: a */
    public void mo32471a() {
    }

    /* renamed from: b */
    public C7022h mo32472b(C7016b bVar, Map<DecodeHintType, ?> map) {
        try {
            return mo32655d(bVar, map);
        } catch (NotFoundException e) {
            if (!(map != null && map.containsKey(DecodeHintType.TRY_HARDER)) || !bVar.mo32461e()) {
                throw e;
            }
            bVar.mo32462f();
            throw null;
        }
    }

    /* renamed from: c */
    public abstract C7022h mo32640c(int i, C7032a aVar, Map<DecodeHintType, ?> map);

    /* renamed from: d */
    public final C7022h mo32655d(C7016b bVar, Map<DecodeHintType, ?> map) {
        int i;
        Map<DecodeHintType, ?> map2;
        int i2;
        EnumMap enumMap = map;
        int d = bVar.mo32460d();
        int c = bVar.mo32459c();
        C7032a aVar = new C7032a(d);
        int i3 = c >> 1;
        int i4 = 0;
        int i5 = 1;
        boolean z = enumMap != null && enumMap.containsKey(DecodeHintType.TRY_HARDER);
        int max = Math.max(1, c >> (z ? 8 : 5));
        int i6 = z ? c : 15;
        int i7 = 0;
        while (i7 < i6) {
            int i8 = i7 + 1;
            int i9 = i8 / 2;
            if (((i7 & 1) == 0 ? i5 : i4) == 0) {
                i9 = -i9;
            }
            int i10 = (i9 * max) + i3;
            if (i10 < 0 || i10 >= c) {
                break;
            }
            try {
                aVar = bVar.mo32458b(i10, aVar);
                int i11 = i4;
                while (i11 < 2) {
                    if (i11 == i5) {
                        aVar.mo32526k();
                        if (enumMap != null && enumMap.containsKey(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                            EnumMap enumMap2 = new EnumMap(DecodeHintType.class);
                            enumMap2.putAll(enumMap);
                            enumMap2.remove(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                            enumMap = enumMap2;
                        }
                    }
                    try {
                        C7022h c2 = mo32640c(i10, aVar, enumMap);
                        if (i11 == i5) {
                            try {
                                c2.mo32484h(ResultMetadataType.ORIENTATION, 180);
                                C7023i[] e = c2.mo32481e();
                                if (e != null) {
                                    map2 = enumMap;
                                    float f = (float) d;
                                    try {
                                        i = d;
                                        try {
                                            e[0] = new C7023i((f - e[i4].mo32486c()) - 1.0f, e[i4].mo32487d());
                                            i2 = 1;
                                            try {
                                                e[1] = new C7023i((f - e[1].mo32486c()) - 1.0f, e[1].mo32487d());
                                            } catch (ReaderException unused) {
                                                continue;
                                            }
                                        } catch (ReaderException unused2) {
                                            i2 = 1;
                                            i11++;
                                            i5 = i2;
                                            enumMap = map2;
                                            d = i;
                                            i4 = 0;
                                        }
                                    } catch (ReaderException unused3) {
                                        i = d;
                                        i2 = 1;
                                        i11++;
                                        i5 = i2;
                                        enumMap = map2;
                                        d = i;
                                        i4 = 0;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = enumMap;
                                i = d;
                                i2 = 1;
                                i11++;
                                i5 = i2;
                                enumMap = map2;
                                d = i;
                                i4 = 0;
                            }
                        }
                        return c2;
                    } catch (ReaderException unused5) {
                        map2 = enumMap;
                        i = d;
                        i2 = i5;
                        i11++;
                        i5 = i2;
                        enumMap = map2;
                        d = i;
                        i4 = 0;
                    }
                }
                continue;
            } catch (NotFoundException unused6) {
            }
            i7 = i8;
            i5 = i5;
            d = d;
            i4 = 0;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
