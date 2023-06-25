package androidx.camera.core;

import androidx.annotation.GuardedBy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public final class UseCaseGroupLifecycleController implements LifecycleObserver {
    public final Lifecycle mLifecycle;
    @GuardedBy("mUseCaseGroupLock")
    public final UseCaseGroup mUseCaseGroup;
    public final Object mUseCaseGroupLock;

    public UseCaseGroupLifecycleController(Lifecycle lifecycle) {
        this(lifecycle, new UseCaseGroup());
    }

    public UseCaseGroup getUseCaseGroup() {
        UseCaseGroup useCaseGroup;
        synchronized (this.mUseCaseGroupLock) {
            useCaseGroup = this.mUseCaseGroup;
        }
        return useCaseGroup;
    }

    public void notifyState() {
        synchronized (this.mUseCaseGroupLock) {
            if (this.mLifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                this.mUseCaseGroup.start();
            }
            for (UseCase notifyState : this.mUseCaseGroup.getUseCases()) {
                notifyState.notifyState();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.mUseCaseGroupLock) {
            this.mUseCaseGroup.clear();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.mUseCaseGroupLock) {
            this.mUseCaseGroup.start();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.mUseCaseGroupLock) {
            this.mUseCaseGroup.stop();
        }
    }

    public void release() {
        this.mLifecycle.removeObserver(this);
    }

    public UseCaseGroupLifecycleController(Lifecycle lifecycle, UseCaseGroup useCaseGroup) {
        this.mUseCaseGroupLock = new Object();
        this.mUseCaseGroup = useCaseGroup;
        this.mLifecycle = lifecycle;
        lifecycle.addObserver(this);
    }
}
