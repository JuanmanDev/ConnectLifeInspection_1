package androidx.camera.core;

import android.content.Context;
import android.os.Handler;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.UseCaseGroupRepository;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@MainThread
public final class CameraX {
    public static final CameraX INSTANCE = new CameraX();
    public CameraFactory mCameraFactory;
    public final CameraRepository mCameraRepository = new CameraRepository();
    public Context mContext;
    public UseCaseConfigFactory mDefaultConfigFactory;
    public final ErrorHandler mErrorHandler = new ErrorHandler();
    public final AtomicBoolean mInitialized = new AtomicBoolean(false);
    public CameraDeviceSurfaceManager mSurfaceManager;
    public final UseCaseGroupRepository mUseCaseGroupRepository = new UseCaseGroupRepository();

    public enum ErrorCode {
        CAMERA_STATE_INCONSISTENT,
        USE_CASE_ERROR
    }

    public interface ErrorListener {
        void onError(ErrorCode errorCode, String str);
    }

    public enum LensFacing {
        FRONT,
        BACK
    }

    public static void attach(String str, UseCase useCase) {
        BaseCamera camera = INSTANCE.getCameraRepository().getCamera(str);
        if (camera != null) {
            useCase.addStateChangeListener(camera);
            useCase.attachCameraControl(str, camera.getCameraControl());
            return;
        }
        throw new IllegalArgumentException("Invalid camera: " + str);
    }

    public static void bindToLifecycle(LifecycleOwner lifecycleOwner, UseCase... useCaseArr) {
        UseCaseGroupLifecycleController orCreateUseCaseGroup = INSTANCE.getOrCreateUseCaseGroup(lifecycleOwner);
        UseCaseGroup useCaseGroup = orCreateUseCaseGroup.getUseCaseGroup();
        Collection<UseCaseGroupLifecycleController> useCaseGroups = INSTANCE.mUseCaseGroupRepository.getUseCaseGroups();
        for (UseCase useCase : useCaseArr) {
            for (UseCaseGroupLifecycleController useCaseGroup2 : useCaseGroups) {
                UseCaseGroup useCaseGroup3 = useCaseGroup2.getUseCaseGroup();
                if (useCaseGroup3.contains(useCase) && useCaseGroup3 != useCaseGroup) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{useCase}));
                }
            }
        }
        for (UseCase onBind : useCaseArr) {
            onBind.onBind();
        }
        calculateSuggestedResolutions(lifecycleOwner, useCaseArr);
        for (UseCase useCase2 : useCaseArr) {
            useCaseGroup.addUseCase(useCase2);
            for (String attach : useCase2.getAttachedCameraIds()) {
                attach(attach, useCase2);
            }
        }
        orCreateUseCaseGroup.notifyState();
    }

    public static void calculateSuggestedResolutions(LifecycleOwner lifecycleOwner, UseCase... useCaseArr) {
        UseCaseGroup useCaseGroup = INSTANCE.getOrCreateUseCaseGroup(lifecycleOwner).getUseCaseGroup();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (UseCase next : useCaseGroup.getUseCases()) {
            for (String next2 : next.getAttachedCameraIds()) {
                List list = (List) hashMap.get(next2);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(next2, list);
                }
                list.add(next);
            }
        }
        int length = useCaseArr.length;
        int i = 0;
        while (i < length) {
            UseCase useCase = useCaseArr[i];
            LensFacing lensFacing = (LensFacing) useCase.getUseCaseConfig().retrieveOption(CameraDeviceConfig.OPTION_LENS_FACING);
            try {
                String cameraWithLensFacing = getCameraWithLensFacing(lensFacing);
                List list2 = (List) hashMap2.get(cameraWithLensFacing);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap2.put(cameraWithLensFacing, list2);
                }
                list2.add(useCase);
                i++;
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid camera lens facing: " + lensFacing, e);
            }
        }
        for (String str : hashMap2.keySet()) {
            Map<UseCase, Size> suggestedResolutions = getSurfaceManager().getSuggestedResolutions(str, (List) hashMap.get(str), (List) hashMap2.get(str));
            for (UseCase useCase2 : useCaseArr) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put(str, suggestedResolutions.get(useCase2));
                useCase2.updateSuggestedResolution(hashMap3);
            }
        }
    }

    public static void detach(String str, List<UseCase> list) {
        BaseCamera camera = INSTANCE.getCameraRepository().getCamera(str);
        if (camera != null) {
            for (UseCase next : list) {
                next.removeStateChangeListener(camera);
                next.detachCameraControl(str);
            }
            camera.removeOnlineUseCase(list);
            return;
        }
        throw new IllegalArgumentException("Invalid camera: " + str);
    }

    private CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    private CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static CameraInfo getCameraInfo(String str) {
        return INSTANCE.getCameraRepository().getCamera(str).getCameraInfo();
    }

    private CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static String getCameraWithLensFacing(LensFacing lensFacing) {
        return INSTANCE.getCameraFactory().cameraIdForLensFacing(lensFacing);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static Context getContext() {
        return INSTANCE.mContext;
    }

    private UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <C extends UseCaseConfig<?>> C getDefaultUseCaseConfig(Class<C> cls, LensFacing lensFacing) {
        return INSTANCE.getDefaultConfigFactory().getConfig(cls, lensFacing);
    }

    private UseCaseGroupLifecycleController getOrCreateUseCaseGroup(LifecycleOwner lifecycleOwner) {
        return this.mUseCaseGroupRepository.getOrCreateUseCaseGroup(lifecycleOwner, new UseCaseGroupRepository.UseCaseGroupSetup() {
            public void setup(UseCaseGroup useCaseGroup) {
                useCaseGroup.setListener(CameraX.this.mCameraRepository);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static CameraDeviceSurfaceManager getSurfaceManager() {
        return INSTANCE.getCameraDeviceSurfaceManager();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void init(Context context, AppConfig appConfig) {
        INSTANCE.initInternal(context, appConfig);
    }

    private void initInternal(Context context, AppConfig appConfig) {
        if (!this.mInitialized.getAndSet(true)) {
            this.mContext = context.getApplicationContext();
            CameraFactory cameraFactory = appConfig.getCameraFactory((CameraFactory) null);
            this.mCameraFactory = cameraFactory;
            if (cameraFactory != null) {
                CameraDeviceSurfaceManager deviceSurfaceManager = appConfig.getDeviceSurfaceManager((CameraDeviceSurfaceManager) null);
                this.mSurfaceManager = deviceSurfaceManager;
                if (deviceSurfaceManager != null) {
                    UseCaseConfigFactory useCaseConfigRepository = appConfig.getUseCaseConfigRepository((UseCaseConfigFactory) null);
                    this.mDefaultConfigFactory = useCaseConfigRepository;
                    if (useCaseConfigRepository != null) {
                        this.mCameraRepository.init(this.mCameraFactory);
                        return;
                    }
                    throw new IllegalStateException("Invalid app configuration provided. Missing UseCaseConfigFactory.");
                }
                throw new IllegalStateException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager.");
            }
            throw new IllegalStateException("Invalid app configuration provided. Missing CameraFactory.");
        }
    }

    public static boolean isBound(UseCase useCase) {
        for (UseCaseGroupLifecycleController useCaseGroup : INSTANCE.mUseCaseGroupRepository.getUseCaseGroups()) {
            if (useCaseGroup.getUseCaseGroup().contains(useCase)) {
                return true;
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static boolean isInitialized() {
        return INSTANCE.mInitialized.get();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void postError(ErrorCode errorCode, String str) {
        INSTANCE.mErrorHandler.postError(errorCode, str);
    }

    public static void setErrorListener(ErrorListener errorListener, Handler handler) {
        INSTANCE.mErrorHandler.setErrorListener(errorListener, handler);
    }

    public static void unbind(UseCase... useCaseArr) {
        Collection<UseCaseGroupLifecycleController> useCaseGroups = INSTANCE.mUseCaseGroupRepository.getUseCaseGroups();
        HashMap hashMap = new HashMap();
        for (UseCase useCase : useCaseArr) {
            for (UseCaseGroupLifecycleController useCaseGroup : useCaseGroups) {
                if (useCaseGroup.getUseCaseGroup().removeUseCase(useCase)) {
                    for (String next : useCase.getAttachedCameraIds()) {
                        List list = (List) hashMap.get(next);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap.put(next, list);
                        }
                        list.add(useCase);
                    }
                }
            }
        }
        for (String str : hashMap.keySet()) {
            detach(str, (List) hashMap.get(str));
        }
        for (UseCase clear : useCaseArr) {
            clear.clear();
        }
    }

    public static void unbindAll() {
        Collection<UseCaseGroupLifecycleController> useCaseGroups = INSTANCE.mUseCaseGroupRepository.getUseCaseGroups();
        ArrayList arrayList = new ArrayList();
        for (UseCaseGroupLifecycleController useCaseGroup : useCaseGroups) {
            arrayList.addAll(useCaseGroup.getUseCaseGroup().getUseCases());
        }
        unbind((UseCase[]) arrayList.toArray(new UseCase[0]));
    }
}
