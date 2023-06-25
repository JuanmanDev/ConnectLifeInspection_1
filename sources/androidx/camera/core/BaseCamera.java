package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraControl;
import androidx.camera.core.UseCase;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface BaseCamera extends UseCase.StateChangeListener, CameraControl.ControlUpdateListener {
    void addOnlineUseCase(Collection<UseCase> collection);

    void close();

    CameraControl getCameraControl();

    CameraInfo getCameraInfo();

    void open();

    void release();

    void removeOnlineUseCase(Collection<UseCase> collection);
}
