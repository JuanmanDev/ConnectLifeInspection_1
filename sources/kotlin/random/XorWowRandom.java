package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00122\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0012B\u0017\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B7\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016R\u000e\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo47991d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "seed1", "", "seed2", "(II)V", "x", "y", "z", "w", "v", "addend", "(IIIIII)V", "nextBits", "bitCount", "nextInt", "Companion", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: XorWowRandom.kt */
public final class XorWowRandom extends Random implements Serializable {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final long serialVersionUID = 0;
    public int addend;

    /* renamed from: v */
    public int f18803v;

    /* renamed from: w */
    public int f18804w;

    /* renamed from: x */
    public int f18805x;

    /* renamed from: y */
    public int f18806y;

    /* renamed from: z */
    public int f18807z;

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo47991d2 = {"Lkotlin/random/XorWowRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
    /* compiled from: XorWowRandom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public XorWowRandom(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f18805x = i;
        this.f18806y = i2;
        this.f18807z = i3;
        this.f18804w = i4;
        this.f18803v = i5;
        this.addend = i6;
        int i7 = i | i2 | i3 | i4 | i5;
        if (i7 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                nextInt();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }

    public int nextBits(int i) {
        return RandomKt.takeUpperBits(nextInt(), i);
    }

    public int nextInt() {
        int i = this.f18805x;
        int i2 = i ^ (i >>> 2);
        this.f18805x = this.f18806y;
        this.f18806y = this.f18807z;
        this.f18807z = this.f18804w;
        int i3 = this.f18803v;
        this.f18804w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f18803v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XorWowRandom(int r8, int r9) {
        /*
            r7 = this;
            int r5 = ~r8
            int r0 = r8 << 10
            int r1 = r9 >>> 4
            r6 = r0 ^ r1
            r3 = 0
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.random.XorWowRandom.<init>(int, int):void");
    }
}
