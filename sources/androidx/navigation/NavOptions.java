package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

public final class NavOptions {
    @AnimRes
    @AnimatorRes
    public int mEnterAnim;
    @AnimRes
    @AnimatorRes
    public int mExitAnim;
    @AnimRes
    @AnimatorRes
    public int mPopEnterAnim;
    @AnimRes
    @AnimatorRes
    public int mPopExitAnim;
    @IdRes
    public int mPopUpTo;
    public boolean mPopUpToInclusive;
    public boolean mSingleTop;

    public static final class Builder {
        @AnimRes
        @AnimatorRes
        public int mEnterAnim = -1;
        @AnimRes
        @AnimatorRes
        public int mExitAnim = -1;
        @AnimRes
        @AnimatorRes
        public int mPopEnterAnim = -1;
        @AnimRes
        @AnimatorRes
        public int mPopExitAnim = -1;
        @IdRes
        public int mPopUpTo = -1;
        public boolean mPopUpToInclusive;
        public boolean mSingleTop;

        @NonNull
        public NavOptions build() {
            return new NavOptions(this.mSingleTop, this.mPopUpTo, this.mPopUpToInclusive, this.mEnterAnim, this.mExitAnim, this.mPopEnterAnim, this.mPopExitAnim);
        }

        @NonNull
        public Builder setEnterAnim(@AnimRes @AnimatorRes int i) {
            this.mEnterAnim = i;
            return this;
        }

        @NonNull
        public Builder setExitAnim(@AnimRes @AnimatorRes int i) {
            this.mExitAnim = i;
            return this;
        }

        @NonNull
        public Builder setLaunchSingleTop(boolean z) {
            this.mSingleTop = z;
            return this;
        }

        @NonNull
        public Builder setPopEnterAnim(@AnimRes @AnimatorRes int i) {
            this.mPopEnterAnim = i;
            return this;
        }

        @NonNull
        public Builder setPopExitAnim(@AnimRes @AnimatorRes int i) {
            this.mPopExitAnim = i;
            return this;
        }

        @NonNull
        public Builder setPopUpTo(@IdRes int i, boolean z) {
            this.mPopUpTo = i;
            this.mPopUpToInclusive = z;
            return this;
        }
    }

    public NavOptions(boolean z, @IdRes int i, boolean z2, @AnimRes @AnimatorRes int i2, @AnimRes @AnimatorRes int i3, @AnimRes @AnimatorRes int i4, @AnimRes @AnimatorRes int i5) {
        this.mSingleTop = z;
        this.mPopUpTo = i;
        this.mPopUpToInclusive = z2;
        this.mEnterAnim = i2;
        this.mExitAnim = i3;
        this.mPopEnterAnim = i4;
        this.mPopExitAnim = i5;
    }

    @AnimRes
    @AnimatorRes
    public int getEnterAnim() {
        return this.mEnterAnim;
    }

    @AnimRes
    @AnimatorRes
    public int getExitAnim() {
        return this.mExitAnim;
    }

    @AnimRes
    @AnimatorRes
    public int getPopEnterAnim() {
        return this.mPopEnterAnim;
    }

    @AnimRes
    @AnimatorRes
    public int getPopExitAnim() {
        return this.mPopExitAnim;
    }

    @IdRes
    public int getPopUpTo() {
        return this.mPopUpTo;
    }

    public boolean isPopUpToInclusive() {
        return this.mPopUpToInclusive;
    }

    public boolean shouldLaunchSingleTop() {
        return this.mSingleTop;
    }
}
