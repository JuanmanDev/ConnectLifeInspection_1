package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import p040c.p200q.p353b.p360g.p361a.C6316e;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class OperationImpl implements Operation {
    public final SettableFuture<Operation.State.SUCCESS> mOperationFuture = SettableFuture.create();
    public final MutableLiveData<Operation.State> mOperationState = new MutableLiveData<>();

    public OperationImpl() {
        setState(Operation.IN_PROGRESS);
    }

    @NonNull
    public C6316e<Operation.State.SUCCESS> getResult() {
        return this.mOperationFuture;
    }

    @NonNull
    public LiveData<Operation.State> getState() {
        return this.mOperationState;
    }

    public void setState(@NonNull Operation.State state) {
        this.mOperationState.postValue(state);
        if (state instanceof Operation.State.SUCCESS) {
            this.mOperationFuture.set((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            this.mOperationFuture.setException(((Operation.State.FAILURE) state).getThrowable());
        }
    }
}
