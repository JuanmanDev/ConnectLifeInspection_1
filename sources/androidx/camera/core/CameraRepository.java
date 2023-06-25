package androidx.camera.core;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.camera.core.UseCaseGroup;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CameraRepository implements UseCaseGroup.StateChangeListener {
    public static final String TAG = "CameraRepository";
    @GuardedBy("mCamerasLock")
    public final Map<String, BaseCamera> mCameras = new HashMap();
    public final Object mCamerasLock = new Object();

    @GuardedBy("mCamerasLock")
    private void attachUseCasesToCamera(BaseCamera baseCamera, Set<UseCase> set) {
        baseCamera.addOnlineUseCase(set);
    }

    @GuardedBy("mCamerasLock")
    private void detachUseCasesFromCamera(BaseCamera baseCamera, Set<UseCase> set) {
        baseCamera.removeOnlineUseCase(set);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public BaseCamera getCamera(String str) {
        BaseCamera baseCamera;
        synchronized (this.mCamerasLock) {
            baseCamera = this.mCameras.get(str);
            if (baseCamera == null) {
                throw new IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return baseCamera;
    }

    public Set<String> getCameraIds() {
        Set<String> unmodifiableSet;
        synchronized (this.mCamerasLock) {
            unmodifiableSet = Collections.unmodifiableSet(this.mCameras.keySet());
        }
        return unmodifiableSet;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void init(CameraFactory cameraFactory) {
        synchronized (this.mCamerasLock) {
            try {
                for (String next : cameraFactory.getAvailableCameraIds()) {
                    "Added camera: " + next;
                    this.mCameras.put(next, cameraFactory.getCamera(next));
                }
            } catch (Exception e) {
                throw new IllegalStateException("Unable to enumerate cameras", e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onGroupActive(UseCaseGroup useCaseGroup) {
        synchronized (this.mCamerasLock) {
            for (Map.Entry next : useCaseGroup.getCameraIdToUseCaseMap().entrySet()) {
                attachUseCasesToCamera(getCamera((String) next.getKey()), (Set) next.getValue());
            }
        }
    }

    public void onGroupInactive(UseCaseGroup useCaseGroup) {
        synchronized (this.mCamerasLock) {
            for (Map.Entry next : useCaseGroup.getCameraIdToUseCaseMap().entrySet()) {
                detachUseCasesFromCamera(getCamera((String) next.getKey()), (Set) next.getValue());
            }
        }
    }
}
