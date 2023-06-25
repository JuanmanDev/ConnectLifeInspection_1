package androidx.camera.core;

import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UseCaseGroupRepository {
    @GuardedBy("mUseCasesLock")
    public final List<LifecycleOwner> mActiveLifecycleOwnerList = new ArrayList();
    @GuardedBy("mUseCasesLock")
    public LifecycleOwner mCurrentActiveLifecycleOwner = null;
    @GuardedBy("mUseCasesLock")
    public final Map<LifecycleOwner, UseCaseGroupLifecycleController> mLifecycleToUseCaseGroupControllerMap = new HashMap();
    public final Object mUseCasesLock = new Object();

    public interface UseCaseGroupSetup {
        void setup(UseCaseGroup useCaseGroup);
    }

    private LifecycleObserver createLifecycleObserver() {
        return new LifecycleObserver() {
            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy(LifecycleOwner lifecycleOwner) {
                synchronized (UseCaseGroupRepository.this.mUseCasesLock) {
                    UseCaseGroupRepository.this.mLifecycleToUseCaseGroupControllerMap.remove(lifecycleOwner);
                }
                lifecycleOwner.getLifecycle().removeObserver(this);
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_START)
            public void onStart(LifecycleOwner lifecycleOwner) {
                synchronized (UseCaseGroupRepository.this.mUseCasesLock) {
                    for (Map.Entry next : UseCaseGroupRepository.this.mLifecycleToUseCaseGroupControllerMap.entrySet()) {
                        if (next.getKey() != lifecycleOwner) {
                            UseCaseGroup useCaseGroup = ((UseCaseGroupLifecycleController) next.getValue()).getUseCaseGroup();
                            if (useCaseGroup.isActive()) {
                                useCaseGroup.stop();
                            }
                        }
                    }
                    UseCaseGroupRepository.this.mCurrentActiveLifecycleOwner = lifecycleOwner;
                    UseCaseGroupRepository.this.mActiveLifecycleOwnerList.add(0, UseCaseGroupRepository.this.mCurrentActiveLifecycleOwner);
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
            public void onStop(LifecycleOwner lifecycleOwner) {
                synchronized (UseCaseGroupRepository.this.mUseCasesLock) {
                    UseCaseGroupRepository.this.mActiveLifecycleOwnerList.remove(lifecycleOwner);
                    if (UseCaseGroupRepository.this.mCurrentActiveLifecycleOwner == lifecycleOwner) {
                        if (UseCaseGroupRepository.this.mActiveLifecycleOwnerList.size() > 0) {
                            UseCaseGroupRepository.this.mCurrentActiveLifecycleOwner = UseCaseGroupRepository.this.mActiveLifecycleOwnerList.get(0);
                            UseCaseGroupRepository.this.mLifecycleToUseCaseGroupControllerMap.get(UseCaseGroupRepository.this.mCurrentActiveLifecycleOwner).getUseCaseGroup().start();
                        } else {
                            UseCaseGroupRepository.this.mCurrentActiveLifecycleOwner = null;
                        }
                    }
                }
            }
        };
    }

    private UseCaseGroupLifecycleController createUseCaseGroup(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycleOwner.getLifecycle().addObserver(createLifecycleObserver());
            UseCaseGroupLifecycleController useCaseGroupLifecycleController = new UseCaseGroupLifecycleController(lifecycleOwner.getLifecycle());
            synchronized (this.mUseCasesLock) {
                this.mLifecycleToUseCaseGroupControllerMap.put(lifecycleOwner, useCaseGroupLifecycleController);
            }
            return useCaseGroupLifecycleController;
        }
        throw new IllegalArgumentException("Trying to create use case group with destroyed lifecycle.");
    }

    public UseCaseGroupLifecycleController getOrCreateUseCaseGroup(LifecycleOwner lifecycleOwner) {
        return getOrCreateUseCaseGroup(lifecycleOwner, new UseCaseGroupSetup() {
            public void setup(UseCaseGroup useCaseGroup) {
            }
        });
    }

    public Collection<UseCaseGroupLifecycleController> getUseCaseGroups() {
        Collection<UseCaseGroupLifecycleController> unmodifiableCollection;
        synchronized (this.mUseCasesLock) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.mLifecycleToUseCaseGroupControllerMap.values());
        }
        return unmodifiableCollection;
    }

    @VisibleForTesting
    public Map<LifecycleOwner, UseCaseGroupLifecycleController> getUseCasesMap() {
        Map<LifecycleOwner, UseCaseGroupLifecycleController> map;
        synchronized (this.mUseCasesLock) {
            map = this.mLifecycleToUseCaseGroupControllerMap;
        }
        return map;
    }

    public UseCaseGroupLifecycleController getOrCreateUseCaseGroup(LifecycleOwner lifecycleOwner, UseCaseGroupSetup useCaseGroupSetup) {
        UseCaseGroupLifecycleController useCaseGroupLifecycleController;
        synchronized (this.mUseCasesLock) {
            useCaseGroupLifecycleController = this.mLifecycleToUseCaseGroupControllerMap.get(lifecycleOwner);
            if (useCaseGroupLifecycleController == null) {
                useCaseGroupLifecycleController = createUseCaseGroup(lifecycleOwner);
                useCaseGroupSetup.setup(useCaseGroupLifecycleController.getUseCaseGroup());
            }
        }
        return useCaseGroupLifecycleController;
    }
}
