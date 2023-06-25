package androidx.camera.core;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class UseCaseGroup {
    public static final String TAG = "UseCaseGroup";
    public volatile boolean mIsActive = false;
    @GuardedBy("mListenerLock")
    public StateChangeListener mListener;
    public final Object mListenerLock = new Object();
    @GuardedBy("mUseCasesLock")
    public final Set<UseCase> mUseCases = new HashSet();
    public final Object mUseCasesLock = new Object();

    public interface StateChangeListener {
        void onGroupActive(UseCaseGroup useCaseGroup);

        void onGroupInactive(UseCaseGroup useCaseGroup);
    }

    public boolean addUseCase(UseCase useCase) {
        boolean add;
        synchronized (this.mUseCasesLock) {
            add = this.mUseCases.add(useCase);
        }
        return add;
    }

    public void clear() {
        ArrayList<UseCase> arrayList = new ArrayList<>();
        synchronized (this.mUseCasesLock) {
            arrayList.addAll(this.mUseCases);
            this.mUseCases.clear();
        }
        for (UseCase useCase : arrayList) {
            "Clearing use case: " + useCase.getName();
            useCase.clear();
        }
    }

    public boolean contains(UseCase useCase) {
        boolean contains;
        synchronized (this.mUseCasesLock) {
            contains = this.mUseCases.contains(useCase);
        }
        return contains;
    }

    public Map<String, Set<UseCase>> getCameraIdToUseCaseMap() {
        HashMap hashMap = new HashMap();
        synchronized (this.mUseCasesLock) {
            for (UseCase next : this.mUseCases) {
                for (String next2 : next.getAttachedCameraIds()) {
                    Set set = (Set) hashMap.get(next2);
                    if (set == null) {
                        set = new HashSet();
                    }
                    set.add(next);
                    hashMap.put(next2, set);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Collection<UseCase> getUseCases() {
        Collection<UseCase> unmodifiableCollection;
        synchronized (this.mUseCasesLock) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.mUseCases);
        }
        return unmodifiableCollection;
    }

    public boolean isActive() {
        return this.mIsActive;
    }

    public boolean removeUseCase(UseCase useCase) {
        boolean remove;
        synchronized (this.mUseCasesLock) {
            remove = this.mUseCases.remove(useCase);
        }
        return remove;
    }

    public void setListener(StateChangeListener stateChangeListener) {
        synchronized (this.mListenerLock) {
            this.mListener = stateChangeListener;
        }
    }

    public void start() {
        synchronized (this.mListenerLock) {
            if (this.mListener != null) {
                this.mListener.onGroupActive(this);
            }
            this.mIsActive = true;
        }
    }

    public void stop() {
        synchronized (this.mListenerLock) {
            if (this.mListener != null) {
                this.mListener.onGroupInactive(this);
            }
            this.mIsActive = false;
        }
    }
}
