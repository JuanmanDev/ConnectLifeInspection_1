package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import androidx.core.util.TimeUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class LocationRequestCompat {
    public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    public final long mDurationMillis;
    public final long mIntervalMillis;
    public final long mMaxUpdateDelayMillis;
    public final int mMaxUpdates;
    public final float mMinUpdateDistanceMeters;
    public final long mMinUpdateIntervalMillis;
    public final int mQuality;

    @RequiresApi(19)
    public static class Api19Impl {
        public static Method sCreateFromDeprecatedProviderMethod;
        public static Class<?> sLocationRequestClass;
        public static Method sSetExpireInMethod;
        public static Method sSetFastestIntervalMethod;
        public static Method sSetNumUpdatesMethod;
        public static Method sSetQualityMethod;

        public static Object toLocationRequest(LocationRequestCompat locationRequestCompat, String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sCreateFromDeprecatedProviderMethod == null) {
                        Method declaredMethod = sLocationRequestClass.getDeclaredMethod("createFromDeprecatedProvider", new Class[]{String.class, Long.TYPE, Float.TYPE, Boolean.TYPE});
                        sCreateFromDeprecatedProviderMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    Object invoke = sCreateFromDeprecatedProviderMethod.invoke((Object) null, new Object[]{str, Long.valueOf(locationRequestCompat.getIntervalMillis()), Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), Boolean.FALSE});
                    if (invoke == null) {
                        return null;
                    }
                    if (sSetQualityMethod == null) {
                        Method declaredMethod2 = sLocationRequestClass.getDeclaredMethod("setQuality", new Class[]{Integer.TYPE});
                        sSetQualityMethod = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    }
                    sSetQualityMethod.invoke(invoke, new Object[]{Integer.valueOf(locationRequestCompat.getQuality())});
                    if (sSetFastestIntervalMethod == null) {
                        Method declaredMethod3 = sLocationRequestClass.getDeclaredMethod("setFastestInterval", new Class[]{Long.TYPE});
                        sSetFastestIntervalMethod = declaredMethod3;
                        declaredMethod3.setAccessible(true);
                    }
                    sSetFastestIntervalMethod.invoke(invoke, new Object[]{Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis())});
                    if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                        if (sSetNumUpdatesMethod == null) {
                            Method declaredMethod4 = sLocationRequestClass.getDeclaredMethod("setNumUpdates", new Class[]{Integer.TYPE});
                            sSetNumUpdatesMethod = declaredMethod4;
                            declaredMethod4.setAccessible(true);
                        }
                        sSetNumUpdatesMethod.invoke(invoke, new Object[]{Integer.valueOf(locationRequestCompat.getMaxUpdates())});
                    }
                    if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                        if (sSetExpireInMethod == null) {
                            Method declaredMethod5 = sLocationRequestClass.getDeclaredMethod("setExpireIn", new Class[]{Long.TYPE});
                            sSetExpireInMethod = declaredMethod5;
                            declaredMethod5.setAccessible(true);
                        }
                        sSetExpireInMethod.invoke(invoke, new Object[]{Long.valueOf(locationRequestCompat.getDurationMillis())});
                    }
                    return invoke;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            return null;
        }
    }

    @RequiresApi(31)
    public static class Api31Impl {
        @DoNotInline
        public static LocationRequest toLocationRequest(LocationRequestCompat locationRequestCompat) {
            return new LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Quality {
    }

    public LocationRequestCompat(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.mIntervalMillis = j;
        this.mQuality = i;
        this.mMinUpdateIntervalMillis = j3;
        this.mDurationMillis = j2;
        this.mMaxUpdates = i2;
        this.mMinUpdateDistanceMeters = f;
        this.mMaxUpdateDelayMillis = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequestCompat)) {
            return false;
        }
        LocationRequestCompat locationRequestCompat = (LocationRequestCompat) obj;
        if (this.mQuality == locationRequestCompat.mQuality && this.mIntervalMillis == locationRequestCompat.mIntervalMillis && this.mMinUpdateIntervalMillis == locationRequestCompat.mMinUpdateIntervalMillis && this.mDurationMillis == locationRequestCompat.mDurationMillis && this.mMaxUpdates == locationRequestCompat.mMaxUpdates && Float.compare(locationRequestCompat.mMinUpdateDistanceMeters, this.mMinUpdateDistanceMeters) == 0 && this.mMaxUpdateDelayMillis == locationRequestCompat.mMaxUpdateDelayMillis) {
            return true;
        }
        return false;
    }

    @IntRange(from = 1)
    public long getDurationMillis() {
        return this.mDurationMillis;
    }

    @IntRange(from = 0)
    public long getIntervalMillis() {
        return this.mIntervalMillis;
    }

    @IntRange(from = 0)
    public long getMaxUpdateDelayMillis() {
        return this.mMaxUpdateDelayMillis;
    }

    @IntRange(from = 1, mo840to = 2147483647L)
    public int getMaxUpdates() {
        return this.mMaxUpdates;
    }

    @FloatRange(from = 0.0d, mo822to = 3.4028234663852886E38d)
    public float getMinUpdateDistanceMeters() {
        return this.mMinUpdateDistanceMeters;
    }

    @IntRange(from = 0)
    public long getMinUpdateIntervalMillis() {
        long j = this.mMinUpdateIntervalMillis;
        return j == -1 ? this.mIntervalMillis : j;
    }

    public int getQuality() {
        return this.mQuality;
    }

    public int hashCode() {
        long j = this.mIntervalMillis;
        long j2 = this.mMinUpdateIntervalMillis;
        return (((this.mQuality * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @RequiresApi(31)
    @NonNull
    public LocationRequest toLocationRequest() {
        return Api31Impl.toLocationRequest(this);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (this.mIntervalMillis != Long.MAX_VALUE) {
            sb.append("@");
            TimeUtils.formatDuration(this.mIntervalMillis, sb);
            int i = this.mQuality;
            if (i == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sb.append(" BALANCED");
            } else if (i == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.mDurationMillis != Long.MAX_VALUE) {
            sb.append(", duration=");
            TimeUtils.formatDuration(this.mDurationMillis, sb);
        }
        if (this.mMaxUpdates != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.mMaxUpdates);
        }
        long j = this.mMinUpdateIntervalMillis;
        if (j != -1 && j < this.mIntervalMillis) {
            sb.append(", minUpdateInterval=");
            TimeUtils.formatDuration(this.mMinUpdateIntervalMillis, sb);
        }
        if (((double) this.mMinUpdateDistanceMeters) > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.mMinUpdateDistanceMeters);
        }
        if (this.mMaxUpdateDelayMillis / 2 > this.mIntervalMillis) {
            sb.append(", maxUpdateDelay=");
            TimeUtils.formatDuration(this.mMaxUpdateDelayMillis, sb);
        }
        sb.append(']');
        return sb.toString();
    }

    @RequiresApi(19)
    @SuppressLint({"NewApi"})
    @Nullable
    public LocationRequest toLocationRequest(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return toLocationRequest();
        }
        return (LocationRequest) Api19Impl.toLocationRequest(this, str);
    }

    public static final class Builder {
        public long mDurationMillis;
        public long mIntervalMillis;
        public long mMaxUpdateDelayMillis;
        public int mMaxUpdates;
        public float mMinUpdateDistanceMeters;
        public long mMinUpdateIntervalMillis;
        public int mQuality;

        public Builder(long j) {
            setIntervalMillis(j);
            this.mQuality = 102;
            this.mDurationMillis = Long.MAX_VALUE;
            this.mMaxUpdates = Integer.MAX_VALUE;
            this.mMinUpdateIntervalMillis = -1;
            this.mMinUpdateDistanceMeters = 0.0f;
            this.mMaxUpdateDelayMillis = 0;
        }

        @NonNull
        public LocationRequestCompat build() {
            Preconditions.checkState((this.mIntervalMillis == Long.MAX_VALUE && this.mMinUpdateIntervalMillis == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.mIntervalMillis;
            return new LocationRequestCompat(j, this.mQuality, this.mDurationMillis, this.mMaxUpdates, Math.min(this.mMinUpdateIntervalMillis, j), this.mMinUpdateDistanceMeters, this.mMaxUpdateDelayMillis);
        }

        @NonNull
        public Builder clearMinUpdateIntervalMillis() {
            this.mMinUpdateIntervalMillis = -1;
            return this;
        }

        @NonNull
        public Builder setDurationMillis(@IntRange(from = 1) long j) {
            this.mDurationMillis = Preconditions.checkArgumentInRange(j, 1, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(@IntRange(from = 0) long j) {
            this.mIntervalMillis = Preconditions.checkArgumentInRange(j, 0, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(@IntRange(from = 0) long j) {
            this.mMaxUpdateDelayMillis = j;
            this.mMaxUpdateDelayMillis = Preconditions.checkArgumentInRange(j, 0, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(@IntRange(from = 1, mo840to = 2147483647L) int i) {
            this.mMaxUpdates = Preconditions.checkArgumentInRange(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(@FloatRange(from = 0.0d, mo822to = 3.4028234663852886E38d) float f) {
            this.mMinUpdateDistanceMeters = f;
            this.mMinUpdateDistanceMeters = Preconditions.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(@IntRange(from = 0) long j) {
            this.mMinUpdateIntervalMillis = Preconditions.checkArgumentInRange(j, 0, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @NonNull
        public Builder setQuality(int i) {
            Preconditions.checkArgument(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i));
            this.mQuality = i;
            return this;
        }

        public Builder(@NonNull LocationRequestCompat locationRequestCompat) {
            this.mIntervalMillis = locationRequestCompat.mIntervalMillis;
            this.mQuality = locationRequestCompat.mQuality;
            this.mDurationMillis = locationRequestCompat.mDurationMillis;
            this.mMaxUpdates = locationRequestCompat.mMaxUpdates;
            this.mMinUpdateIntervalMillis = locationRequestCompat.mMinUpdateIntervalMillis;
            this.mMinUpdateDistanceMeters = locationRequestCompat.mMinUpdateDistanceMeters;
            this.mMaxUpdateDelayMillis = locationRequestCompat.mMaxUpdateDelayMillis;
        }
    }
}
