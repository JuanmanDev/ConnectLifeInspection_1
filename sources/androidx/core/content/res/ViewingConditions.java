package androidx.core.content.res;

import androidx.annotation.NonNull;

public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = make(CamUtils.WHITE_POINT_D65, (float) ((((double) CamUtils.yFromLStar(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    public final float mAw;

    /* renamed from: mC */
    public final float f229mC;
    public final float mFl;
    public final float mFlRoot;

    /* renamed from: mN */
    public final float f230mN;
    public final float mNbb;
    public final float mNc;
    public final float mNcb;
    public final float[] mRgbD;

    /* renamed from: mZ */
    public final float f231mZ;

    public ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f230mN = f;
        this.mAw = f2;
        this.mNbb = f3;
        this.mNcb = f4;
        this.f229mC = f5;
        this.mNc = f6;
        this.mRgbD = fArr;
        this.mFl = f7;
        this.mFlRoot = f8;
        this.f231mZ = f9;
    }

    @NonNull
    public static ViewingConditions make(@NonNull float[] fArr, float f, float f2, float f3, boolean z) {
        float f4;
        float f5 = f;
        float[][] fArr2 = CamUtils.XYZ_TO_CAM16RGB;
        float f6 = (fArr[0] * fArr2[0][0]) + (fArr[1] * fArr2[0][1]) + (fArr[2] * fArr2[0][2]);
        float f7 = (fArr[0] * fArr2[1][0]) + (fArr[1] * fArr2[1][1]) + (fArr[2] * fArr2[1][2]);
        float f8 = (fArr[0] * fArr2[2][0]) + (fArr[1] * fArr2[2][1]) + (fArr[2] * fArr2[2][2]);
        float f9 = (f3 / 10.0f) + 0.8f;
        float lerp = ((double) f9) >= 0.9d ? CamUtils.lerp(0.59f, 0.69f, (f9 - 0.9f) * 10.0f) : CamUtils.lerp(0.525f, 0.59f, (f9 - 0.8f) * 10.0f);
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = (1.0f - (((float) Math.exp((double) (((-f5) - 42.0f) / 92.0f))) * 0.2777778f)) * f9;
        }
        double d = (double) f4;
        if (d > 1.0d) {
            f4 = 1.0f;
        } else if (d < 0.0d) {
            f4 = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f6) * f4) + 1.0f) - f4, (((100.0f / f7) * f4) + 1.0f) - f4, (((100.0f / f8) * f4) + 1.0f) - f4};
        float f10 = 1.0f / ((5.0f * f5) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float cbrt = (f11 * f5) + (0.1f * f12 * f12 * ((float) Math.cbrt(((double) f5) * 5.0d)));
        float yFromLStar = CamUtils.yFromLStar(f2) / fArr[1];
        double d2 = (double) yFromLStar;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f8)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        return new ViewingConditions(yFromLStar, ((fArr5[0] * 2.0f) + fArr5[1] + (fArr5[2] * 0.05f)) * pow, pow, pow, lerp, f9, fArr3, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public float getAw() {
        return this.mAw;
    }

    public float getC() {
        return this.f229mC;
    }

    public float getFl() {
        return this.mFl;
    }

    public float getFlRoot() {
        return this.mFlRoot;
    }

    public float getN() {
        return this.f230mN;
    }

    public float getNbb() {
        return this.mNbb;
    }

    public float getNc() {
        return this.mNc;
    }

    public float getNcb() {
        return this.mNcb;
    }

    @NonNull
    public float[] getRgbD() {
        return this.mRgbD;
    }

    public float getZ() {
        return this.f231mZ;
    }
}
