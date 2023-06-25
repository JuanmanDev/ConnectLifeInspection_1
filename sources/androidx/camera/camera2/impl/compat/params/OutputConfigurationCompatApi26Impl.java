package androidx.camera.camera2.impl.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

@RequiresApi(26)
public class OutputConfigurationCompatApi26Impl extends OutputConfigurationCompatApi24Impl {
    public static final String MAX_SHARED_SURFACES_COUNT_FIELD = "MAX_SURFACES_COUNT";
    public static final String SURFACES_FIELD = "mSurfaces";

    public static final class OutputConfigurationParamsApi26 {
        public final OutputConfiguration mOutputConfiguration;
        @Nullable
        public String mPhysicalCameraId;

        public OutputConfigurationParamsApi26(@NonNull OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OutputConfigurationParamsApi26)) {
                return false;
            }
            OutputConfigurationParamsApi26 outputConfigurationParamsApi26 = (OutputConfigurationParamsApi26) obj;
            if (!Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi26.mOutputConfiguration) || !Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi26.mPhysicalCameraId)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i2 = (hashCode << 5) - hashCode;
            String str = this.mPhysicalCameraId;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            return i ^ i2;
        }
    }

    public OutputConfigurationCompatApi26Impl(@NonNull Surface surface) {
        this((Object) new OutputConfigurationParamsApi26(new OutputConfiguration(surface)));
    }

    public static int getMaxSharedSurfaceCountApi26() {
        Field declaredField = OutputConfiguration.class.getDeclaredField(MAX_SHARED_SURFACES_COUNT_FIELD);
        declaredField.setAccessible(true);
        return declaredField.getInt((Object) null);
    }

    public static List<Surface> getMutableSurfaceListApi26(OutputConfiguration outputConfiguration) {
        Field declaredField = OutputConfiguration.class.getDeclaredField(SURFACES_FIELD);
        declaredField.setAccessible(true);
        return (List) declaredField.get(outputConfiguration);
    }

    @RequiresApi(26)
    public static OutputConfigurationCompatApi26Impl wrap(@NonNull OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi26Impl((Object) new OutputConfigurationParamsApi26(outputConfiguration));
    }

    public void addSurface(@NonNull Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).addSurface(surface);
    }

    public void enableSurfaceSharing() {
        ((OutputConfiguration) getOutputConfiguration()).enableSurfaceSharing();
    }

    public int getMaxSharedSurfaceCount() {
        try {
            return getMaxSharedSurfaceCountApi26();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return super.getMaxSharedSurfaceCount();
        }
    }

    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.mObject instanceof OutputConfigurationParamsApi26);
        return ((OutputConfigurationParamsApi26) this.mObject).mOutputConfiguration;
    }

    @Nullable
    public String getPhysicalCameraId() {
        return ((OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId;
    }

    @NonNull
    public List<Surface> getSurfaces() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaces();
    }

    public final boolean isSurfaceSharingEnabled() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    public void removeSurface(@NonNull Surface surface) {
        if (getSurface() != surface) {
            try {
                if (!getMutableSurfaceListApi26((OutputConfiguration) getOutputConfiguration()).remove(surface)) {
                    throw new IllegalArgumentException("Surface is not part of this output configuration");
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
        } else {
            throw new IllegalArgumentException("Cannot remove surface associated with this output configuration");
        }
    }

    public void setPhysicalCameraId(@Nullable String str) {
        ((OutputConfigurationParamsApi26) this.mObject).mPhysicalCameraId = str;
    }

    public OutputConfigurationCompatApi26Impl(@NonNull Object obj) {
        super(obj);
    }
}
