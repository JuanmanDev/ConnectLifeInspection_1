package androidx.camera.core;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CameraDeviceSurfaceManager {
    boolean checkSupported(String str, List<SurfaceConfig> list);

    @Nullable
    Rational getCorrectedAspectRatio(@NonNull UseCaseConfig<?> useCaseConfig);

    @Nullable
    Size getMaxOutputSize(String str, int i);

    Size getPreviewSize();

    Map<UseCase, Size> getSuggestedResolutions(String str, List<UseCase> list, List<UseCase> list2);

    boolean requiresCorrectedAspectRatio(@NonNull UseCaseConfig<?> useCaseConfig);

    SurfaceConfig transformSurfaceConfig(String str, int i, Size size);
}
