package androidx.camera.core.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.Optional;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public abstract class CollectionFuture<V, C> extends AggregateFuture<V, C> {

    public abstract class CollectionFutureRunningState extends AggregateFuture<V, C>.RunningState {
        public List<Optional<V>> mValues;

        public CollectionFutureRunningState(Collection<? extends C6316e<? extends V>> collection, boolean z) {
            super(collection, z, true);
            ArrayList arrayList;
            if (collection.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(collection.size());
            }
            this.mValues = arrayList;
            for (int i = 0; i < collection.size(); i++) {
                this.mValues.add((Object) null);
            }
        }

        public final void collectOneValue(boolean z, int i, @Nullable V v) {
            List<Optional<V>> list = this.mValues;
            if (list != null) {
                list.set(i, Optional.fromNullable(v));
            } else {
                Preconditions.checkState(z || CollectionFuture.this.isCancelled(), "Future was done before all dependencies completed");
            }
        }

        public abstract C combine(List<Optional<V>> list);

        public final void handleAllCompleted() {
            List<Optional<V>> list = this.mValues;
            if (list != null) {
                CollectionFuture.this.set(combine(list));
            } else {
                Preconditions.checkState(CollectionFuture.this.isDone());
            }
        }

        public void releaseResourcesAfterFailure() {
            super.releaseResourcesAfterFailure();
            this.mValues = null;
        }
    }

    public static final class ListFuture<V> extends CollectionFuture<V, List<V>> {

        public final class ListFutureRunningState extends CollectionFuture<V, List<V>>.CollectionFutureRunningState {
            public ListFutureRunningState(Collection<? extends C6316e<? extends V>> collection, boolean z) {
                super(collection, z);
            }

            public List<V> combine(List<Optional<V>> list) {
                ArrayList arrayList = new ArrayList(list.size());
                Iterator<Optional<V>> it = list.iterator();
                while (it.hasNext()) {
                    Optional next = it.next();
                    arrayList.add(next != null ? next.orNull() : null);
                }
                return arrayList;
            }
        }

        public ListFuture(Collection<? extends C6316e<? extends V>> collection, boolean z) {
            init(new ListFutureRunningState(collection, z));
        }
    }
}
