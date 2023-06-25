package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface CaptureBundle {
    List<CaptureStage> getCaptureStages();
}
