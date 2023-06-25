package com.bumptech.glide.load.resource.bitmap;

import p040c.p077d.p078a.p081k.C1568d;

public abstract class DownsampleStrategy {

    /* renamed from: a */
    public static final DownsampleStrategy f7025a = new C3832c();

    /* renamed from: b */
    public static final DownsampleStrategy f7026b = new C3831b();

    /* renamed from: c */
    public static final DownsampleStrategy f7027c = new C3830a();

    /* renamed from: d */
    public static final DownsampleStrategy f7028d = new C3833d();

    /* renamed from: e */
    public static final DownsampleStrategy f7029e;

    /* renamed from: f */
    public static final C1568d<DownsampleStrategy> f7030f;

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$a */
    public static class C3830a extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo21674a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo21675b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, DownsampleStrategy.f7025a.mo21675b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$b */
    public static class C3831b extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo21674a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo21675b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c */
    public static class C3832c extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo21674a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo21675b(int i, int i2, int i3, int i4) {
            return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$d */
    public static class C3833d extends DownsampleStrategy {
        /* renamed from: a */
        public SampleSizeRounding mo21674a(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }

        /* renamed from: b */
        public float mo21675b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    static {
        DownsampleStrategy downsampleStrategy = f7026b;
        f7029e = downsampleStrategy;
        f7030f = C1568d.m1282f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", downsampleStrategy);
    }

    /* renamed from: a */
    public abstract SampleSizeRounding mo21674a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo21675b(int i, int i2, int i3, int i4);
}
