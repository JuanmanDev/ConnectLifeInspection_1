package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.camera.core.SessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class UseCaseAttachState {
    public static final String TAG = "UseCaseAttachState";
    public final Map<UseCase, UseCaseAttachInfo> mAttachedUseCasesToInfoMap = new HashMap();
    public final String mCameraId;

    public interface AttachStateFilter {
        boolean filter(UseCaseAttachInfo useCaseAttachInfo);
    }

    public static final class UseCaseAttachInfo {
        public boolean mActive = false;
        public boolean mOnline = false;
        public final SessionConfig mSessionConfig;

        public UseCaseAttachInfo(SessionConfig sessionConfig) {
            this.mSessionConfig = sessionConfig;
        }

        public boolean getActive() {
            return this.mActive;
        }

        public boolean getOnline() {
            return this.mOnline;
        }

        public SessionConfig getSessionConfig() {
            return this.mSessionConfig;
        }

        public void setActive(boolean z) {
            this.mActive = z;
        }

        public void setOnline(boolean z) {
            this.mOnline = z;
        }
    }

    public UseCaseAttachState(String str) {
        this.mCameraId = str;
    }

    private UseCaseAttachInfo getOrCreateUseCaseAttachInfo(UseCase useCase) {
        UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(useCase);
        if (useCaseAttachInfo != null) {
            return useCaseAttachInfo;
        }
        UseCaseAttachInfo useCaseAttachInfo2 = new UseCaseAttachInfo(useCase.getSessionConfig(this.mCameraId));
        this.mAttachedUseCasesToInfoMap.put(useCase, useCaseAttachInfo2);
        return useCaseAttachInfo2;
    }

    private Collection<UseCase> getUseCases(AttachStateFilter attachStateFilter) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mAttachedUseCasesToInfoMap.entrySet()) {
            if (attachStateFilter == null || attachStateFilter.filter((UseCaseAttachInfo) next.getValue())) {
                arrayList.add(next.getKey());
            }
        }
        return arrayList;
    }

    public SessionConfig.ValidatingBuilder getActiveAndOnlineBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) next.getValue();
            if (useCaseAttachInfo.getActive() && useCaseAttachInfo.getOnline()) {
                validatingBuilder.add(useCaseAttachInfo.getSessionConfig());
                arrayList.add(((UseCase) next.getKey()).getName());
            }
        }
        "Active and online use case: " + arrayList + " for camera: " + this.mCameraId;
        return validatingBuilder;
    }

    public Collection<UseCase> getActiveAndOnlineUseCases() {
        return Collections.unmodifiableCollection(getUseCases(new AttachStateFilter() {
            public boolean filter(UseCaseAttachInfo useCaseAttachInfo) {
                return useCaseAttachInfo.getActive() && useCaseAttachInfo.getOnline();
            }
        }));
    }

    public SessionConfig.ValidatingBuilder getOnlineBuilder() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mAttachedUseCasesToInfoMap.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) next.getValue();
            if (useCaseAttachInfo.getOnline()) {
                validatingBuilder.add(useCaseAttachInfo.getSessionConfig());
                arrayList.add(((UseCase) next.getKey()).getName());
            }
        }
        "All use case: " + arrayList + " for camera: " + this.mCameraId;
        return validatingBuilder;
    }

    public Collection<UseCase> getOnlineUseCases() {
        return Collections.unmodifiableCollection(getUseCases(new AttachStateFilter() {
            public boolean filter(UseCaseAttachInfo useCaseAttachInfo) {
                return useCaseAttachInfo.getOnline();
            }
        }));
    }

    public SessionConfig getUseCaseSessionConfig(UseCase useCase) {
        if (!this.mAttachedUseCasesToInfoMap.containsKey(useCase)) {
            return SessionConfig.defaultEmptySessionConfig();
        }
        return this.mAttachedUseCasesToInfoMap.get(useCase).getSessionConfig();
    }

    public boolean isUseCaseOnline(UseCase useCase) {
        if (!this.mAttachedUseCasesToInfoMap.containsKey(useCase)) {
            return false;
        }
        return this.mAttachedUseCasesToInfoMap.get(useCase).getOnline();
    }

    public void setUseCaseActive(UseCase useCase) {
        getOrCreateUseCaseAttachInfo(useCase).setActive(true);
    }

    public void setUseCaseInactive(UseCase useCase) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(useCase)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(useCase);
            useCaseAttachInfo.setActive(false);
            if (!useCaseAttachInfo.getOnline()) {
                this.mAttachedUseCasesToInfoMap.remove(useCase);
            }
        }
    }

    public void setUseCaseOffline(UseCase useCase) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(useCase)) {
            UseCaseAttachInfo useCaseAttachInfo = this.mAttachedUseCasesToInfoMap.get(useCase);
            useCaseAttachInfo.setOnline(false);
            if (!useCaseAttachInfo.getActive()) {
                this.mAttachedUseCasesToInfoMap.remove(useCase);
            }
        }
    }

    public void setUseCaseOnline(UseCase useCase) {
        getOrCreateUseCaseAttachInfo(useCase).setOnline(true);
    }

    public void updateUseCase(UseCase useCase) {
        if (this.mAttachedUseCasesToInfoMap.containsKey(useCase)) {
            UseCaseAttachInfo useCaseAttachInfo = new UseCaseAttachInfo(useCase.getSessionConfig(this.mCameraId));
            UseCaseAttachInfo useCaseAttachInfo2 = this.mAttachedUseCasesToInfoMap.get(useCase);
            useCaseAttachInfo.setOnline(useCaseAttachInfo2.getOnline());
            useCaseAttachInfo.setActive(useCaseAttachInfo2.getActive());
            this.mAttachedUseCasesToInfoMap.put(useCase, useCaseAttachInfo);
        }
    }
}
