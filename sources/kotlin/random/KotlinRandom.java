package kotlin.random;

import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\b\u0010\f\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo47991d2 = {"Lkotlin/random/KotlinRandom;", "Ljava/util/Random;", "impl", "Lkotlin/random/Random;", "(Lkotlin/random/Random;)V", "getImpl", "()Lkotlin/random/Random;", "seedInitialized", "", "next", "", "bits", "nextBoolean", "nextBytes", "", "bytes", "", "nextDouble", "", "nextFloat", "", "nextInt", "bound", "nextLong", "", "setSeed", "seed", "Companion", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: PlatformRandom.kt */
public final class KotlinRandom extends Random {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    public static final long serialVersionUID = 0;
    @NotNull
    public final Random impl;
    public boolean seedInitialized;

    @Metadata(mo47990d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo47991d2 = {"Lkotlin/random/KotlinRandom$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, mo47992k = 1, mo47993mv = {1, 7, 1}, mo47995xi = 48)
    /* compiled from: PlatformRandom.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KotlinRandom(@NotNull Random random) {
        Intrinsics.checkNotNullParameter(random, "impl");
        this.impl = random;
    }

    @NotNull
    public final Random getImpl() {
        return this.impl;
    }

    public int next(int i) {
        return this.impl.nextBits(i);
    }

    public boolean nextBoolean() {
        return this.impl.nextBoolean();
    }

    public void nextBytes(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "bytes");
        this.impl.nextBytes(bArr);
    }

    public double nextDouble() {
        return this.impl.nextDouble();
    }

    public float nextFloat() {
        return this.impl.nextFloat();
    }

    public int nextInt() {
        return this.impl.nextInt();
    }

    public long nextLong() {
        return this.impl.nextLong();
    }

    public void setSeed(long j) {
        if (!this.seedInitialized) {
            this.seedInitialized = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }

    public int nextInt(int i) {
        return this.impl.nextInt(i);
    }
}
