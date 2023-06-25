package com.google.android.material.transition;

public class FadeModeEvaluators {
    public static final FadeModeEvaluator CROSS = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };

    /* renamed from: IN */
    public static final FadeModeEvaluator f14986IN = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.endOnTop(255, TransitionUtils.lerp(0, 255, f2, f3, f));
        }
    };
    public static final FadeModeEvaluator OUT = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f3, f), 255);
        }
    };
    public static final FadeModeEvaluator THROUGH = new FadeModeEvaluator() {
        public FadeModeResult evaluate(float f, float f2, float f3) {
            float f4 = ((f3 - f2) * 0.35f) + f2;
            return FadeModeResult.startOnTop(TransitionUtils.lerp(255, 0, f2, f4, f), TransitionUtils.lerp(0, 255, f4, f3, f));
        }
    };

    public static FadeModeEvaluator get(int i, boolean z) {
        if (i == 0) {
            return z ? f14986IN : OUT;
        }
        if (i == 1) {
            return z ? OUT : f14986IN;
        }
        if (i == 2) {
            return CROSS;
        }
        if (i == 3) {
            return THROUGH;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i);
    }
}
