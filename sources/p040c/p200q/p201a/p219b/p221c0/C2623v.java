package p040c.p200q.p201a.p219b.p221c0;

import java.nio.ShortBuffer;
import java.util.Arrays;
import okhttp3.internal.platform.android.AndroidLog;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.c0.v */
/* compiled from: Sonic */
public final class C2623v {

    /* renamed from: a */
    public final int f3227a;

    /* renamed from: b */
    public final int f3228b;

    /* renamed from: c */
    public final float f3229c;

    /* renamed from: d */
    public final float f3230d;

    /* renamed from: e */
    public final float f3231e;

    /* renamed from: f */
    public final int f3232f;

    /* renamed from: g */
    public final int f3233g;

    /* renamed from: h */
    public final int f3234h;

    /* renamed from: i */
    public final short[] f3235i;

    /* renamed from: j */
    public short[] f3236j;

    /* renamed from: k */
    public int f3237k;

    /* renamed from: l */
    public short[] f3238l;

    /* renamed from: m */
    public int f3239m;

    /* renamed from: n */
    public short[] f3240n;

    /* renamed from: o */
    public int f3241o;

    /* renamed from: p */
    public int f3242p;

    /* renamed from: q */
    public int f3243q;

    /* renamed from: r */
    public int f3244r;

    /* renamed from: s */
    public int f3245s;

    /* renamed from: t */
    public int f3246t;

    /* renamed from: u */
    public int f3247u;

    /* renamed from: v */
    public int f3248v;

    public C2623v(int i, int i2, float f, float f2, int i3) {
        this.f3227a = i;
        this.f3228b = i2;
        this.f3229c = f;
        this.f3230d = f2;
        this.f3231e = ((float) i) / ((float) i3);
        this.f3232f = i / 400;
        int i4 = i / 65;
        this.f3233g = i4;
        int i5 = i4 * 2;
        this.f3234h = i5;
        this.f3235i = new short[i5];
        this.f3236j = new short[(i5 * i2)];
        this.f3238l = new short[(i5 * i2)];
        this.f3240n = new short[(i5 * i2)];
    }

    /* renamed from: o */
    public static void m5010o(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo18358a(float f, int i) {
        int i2;
        int i3;
        if (this.f3239m != i) {
            int i4 = this.f3227a;
            int i5 = (int) (((float) i4) / f);
            while (true) {
                if (i5 <= 16384 && i4 <= 16384) {
                    break;
                }
                i5 /= 2;
                i4 /= 2;
            }
            mo18371n(i);
            int i6 = 0;
            while (true) {
                int i7 = this.f3241o;
                boolean z = true;
                if (i6 < i7 - 1) {
                    while (true) {
                        i2 = this.f3242p;
                        int i8 = (i2 + 1) * i5;
                        i3 = this.f3243q;
                        if (i8 <= i3 * i4) {
                            break;
                        }
                        this.f3238l = mo18363f(this.f3238l, this.f3239m, 1);
                        int i9 = 0;
                        while (true) {
                            int i10 = this.f3228b;
                            if (i9 >= i10) {
                                break;
                            }
                            this.f3238l[(this.f3239m * i10) + i9] = mo18370m(this.f3240n, (i10 * i6) + i9, i4, i5);
                            i9++;
                        }
                        this.f3243q++;
                        this.f3239m++;
                    }
                    int i11 = i2 + 1;
                    this.f3242p = i11;
                    if (i11 == i4) {
                        this.f3242p = 0;
                        if (i3 != i5) {
                            z = false;
                        }
                        C3151e.m7759g(z);
                        this.f3243q = 0;
                    }
                    i6++;
                } else {
                    mo18376t(i7 - 1);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo18359b(float f) {
        int l;
        int i = this.f3237k;
        if (i >= this.f3234h) {
            int i2 = 0;
            do {
                if (this.f3244r > 0) {
                    l = mo18360c(i2);
                } else {
                    int g = mo18364g(this.f3236j, i2);
                    if (((double) f) > 1.0d) {
                        l = g + mo18378v(this.f3236j, i2, f, g);
                    } else {
                        l = mo18369l(this.f3236j, i2, f, g);
                    }
                }
                i2 += l;
            } while (this.f3234h + i2 <= i);
            mo18377u(i2);
        }
    }

    /* renamed from: c */
    public final int mo18360c(int i) {
        int min = Math.min(this.f3234h, this.f3244r);
        mo18361d(this.f3236j, i, min);
        this.f3244r -= min;
        return min;
    }

    /* renamed from: d */
    public final void mo18361d(short[] sArr, int i, int i2) {
        short[] f = mo18363f(this.f3238l, this.f3239m, i2);
        this.f3238l = f;
        int i3 = this.f3228b;
        System.arraycopy(sArr, i * i3, f, this.f3239m * i3, i3 * i2);
        this.f3239m += i2;
    }

    /* renamed from: e */
    public final void mo18362e(short[] sArr, int i, int i2) {
        int i3 = this.f3234h / i2;
        int i4 = this.f3228b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f3235i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: f */
    public final short[] mo18363f(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f3228b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: g */
    public final int mo18364g(short[] sArr, int i) {
        int i2;
        int i3 = this.f3227a;
        int i4 = i3 > 4000 ? i3 / AndroidLog.MAX_LOG_LENGTH : 1;
        if (this.f3228b == 1 && i4 == 1) {
            i2 = mo18365h(sArr, i, this.f3232f, this.f3233g);
        } else {
            mo18362e(sArr, i, i4);
            int h = mo18365h(this.f3235i, 0, this.f3232f / i4, this.f3233g / i4);
            if (i4 != 1) {
                int i5 = h * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f3232f;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f3233g;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f3228b == 1) {
                    i2 = mo18365h(sArr, i, i7, i8);
                } else {
                    mo18362e(sArr, i, 1);
                    i2 = mo18365h(this.f3235i, 0, i7, i8);
                }
            } else {
                i2 = h;
            }
        }
        int i11 = mo18372p(this.f3247u, this.f3248v) ? this.f3245s : i2;
        this.f3246t = this.f3247u;
        this.f3245s = i2;
        return i11;
    }

    /* renamed from: h */
    public final int mo18365h(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f3228b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                i9 += Math.abs(sArr[i4 + i10] - sArr[(i4 + i2) + i10]);
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f3247u = i5 / i7;
        this.f3248v = i8 / i6;
        return i7;
    }

    /* renamed from: i */
    public void mo18366i() {
        this.f3237k = 0;
        this.f3239m = 0;
        this.f3241o = 0;
        this.f3242p = 0;
        this.f3243q = 0;
        this.f3244r = 0;
        this.f3245s = 0;
        this.f3246t = 0;
        this.f3247u = 0;
        this.f3248v = 0;
    }

    /* renamed from: j */
    public int mo18367j() {
        return this.f3239m;
    }

    /* renamed from: k */
    public void mo18368k(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f3228b, this.f3239m);
        shortBuffer.put(this.f3238l, 0, this.f3228b * min);
        int i = this.f3239m - min;
        this.f3239m = i;
        short[] sArr = this.f3238l;
        int i2 = this.f3228b;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    /* renamed from: l */
    public final int mo18369l(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f3244r = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        short[] f2 = mo18363f(this.f3238l, this.f3239m, i4);
        this.f3238l = f2;
        int i5 = this.f3228b;
        System.arraycopy(sArr, i * i5, f2, this.f3239m * i5, i5 * i2);
        m5010o(i3, this.f3228b, this.f3238l, this.f3239m + i2, sArr, i + i2, sArr, i);
        this.f3239m += i4;
        return i3;
    }

    /* renamed from: m */
    public final short mo18370m(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        short s2 = sArr[i + this.f3228b];
        int i4 = this.f3243q * i2;
        int i5 = this.f3242p;
        int i6 = i5 * i3;
        int i7 = (i5 + 1) * i3;
        int i8 = i7 - i4;
        int i9 = i7 - i6;
        return (short) (((s * i8) + ((i9 - i8) * s2)) / i9);
    }

    /* renamed from: n */
    public final void mo18371n(int i) {
        int i2 = this.f3239m - i;
        short[] f = mo18363f(this.f3240n, this.f3241o, i2);
        this.f3240n = f;
        short[] sArr = this.f3238l;
        int i3 = this.f3228b;
        System.arraycopy(sArr, i * i3, f, this.f3241o * i3, i3 * i2);
        this.f3239m = i;
        this.f3241o += i2;
    }

    /* renamed from: p */
    public final boolean mo18372p(int i, int i2) {
        if (i == 0 || this.f3245s == 0 || i2 > i * 3 || i * 2 <= this.f3246t * 3) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public final void mo18373q() {
        int i = this.f3239m;
        float f = this.f3229c;
        float f2 = this.f3230d;
        float f3 = f / f2;
        float f4 = this.f3231e * f2;
        double d = (double) f3;
        if (d > 1.00001d || d < 0.99999d) {
            mo18359b(f3);
        } else {
            mo18361d(this.f3236j, 0, this.f3237k);
            this.f3237k = 0;
        }
        if (f4 != 1.0f) {
            mo18358a(f4, i);
        }
    }

    /* renamed from: r */
    public void mo18374r() {
        int i;
        int i2 = this.f3237k;
        float f = this.f3229c;
        float f2 = this.f3230d;
        int i3 = this.f3239m + ((int) ((((((float) i2) / (f / f2)) + ((float) this.f3241o)) / (this.f3231e * f2)) + 0.5f));
        this.f3236j = mo18363f(this.f3236j, i2, (this.f3234h * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.f3234h;
            int i5 = this.f3228b;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.f3236j[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.f3237k += i * 2;
        mo18373q();
        if (this.f3239m > i3) {
            this.f3239m = i3;
        }
        this.f3237k = 0;
        this.f3244r = 0;
        this.f3241o = 0;
    }

    /* renamed from: s */
    public void mo18375s(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.f3228b;
        int i2 = remaining / i;
        short[] f = mo18363f(this.f3236j, this.f3237k, i2);
        this.f3236j = f;
        shortBuffer.get(f, this.f3237k * this.f3228b, ((i * i2) * 2) / 2);
        this.f3237k += i2;
        mo18373q();
    }

    /* renamed from: t */
    public final void mo18376t(int i) {
        if (i != 0) {
            short[] sArr = this.f3240n;
            int i2 = this.f3228b;
            System.arraycopy(sArr, i * i2, sArr, 0, (this.f3241o - i) * i2);
            this.f3241o -= i;
        }
    }

    /* renamed from: u */
    public final void mo18377u(int i) {
        int i2 = this.f3237k - i;
        short[] sArr = this.f3236j;
        int i3 = this.f3228b;
        System.arraycopy(sArr, i * i3, sArr, 0, i3 * i2);
        this.f3237k = i2;
    }

    /* renamed from: v */
    public final int mo18378v(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f3244r = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        short[] f2 = mo18363f(this.f3238l, this.f3239m, i3);
        this.f3238l = f2;
        m5010o(i3, this.f3228b, f2, this.f3239m, sArr, i, sArr, i + i2);
        this.f3239m += i3;
        return i3;
    }
}
