package androidx.camera.camera2.impl.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

@RequiresApi(28)
public class OutputConfigurationCompatApi28Impl extends OutputConfigurationCompatApi26Impl {
    public OutputConfigurationCompatApi28Impl(@NonNull Surface surface) {
        super((Object) new OutputConfiguration(surface));
    }

    @RequiresApi(28)
    public static OutputConfigurationCompatApi28Impl wrap(@NonNull OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi28Impl((Object) outputConfiguration);
    }

    public int getMaxSharedSurfaceCount() {
        return ((OutputConfiguration) getOutputConfiguration()).getMaxSharedSurfaceCount();
    }

    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.mObject instanceof OutputConfiguration);
        return this.mObject;
    }

    @Nullable
    public String getPhysicalCameraId() {
        return null;
    }

    public void removeSurface(@NonNull Surface surface) {
        ((OutputConfiguration) getOutputConfiguration()).removeSurface(surface);
    }

    public void setPhysicalCameraId(@Nullable String str) {
        ((OutputConfiguration) getOutputConfiguration()).setPhysicalCameraId(str);
    }

    public OutputConfigurationCompatApi28Impl(@NonNull Object obj) {
        super(obj);
    }
}
