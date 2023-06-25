package p630io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p553f.p594c.p598o.C9207b;

/* renamed from: io.reactivex.internal.disposables.ArrayCompositeDisposable */
public final class ArrayCompositeDisposable extends AtomicReferenceArray<C9207b> implements C9207b {
    public static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(i);
    }

    public void dispose() {
        C9207b bVar;
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                C9207b bVar2 = (C9207b) get(i);
                DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
                if (!(bVar2 == disposableHelper || (bVar = (C9207b) getAndSet(i, disposableHelper)) == DisposableHelper.DISPOSED || bVar == null)) {
                    bVar.dispose();
                }
            }
        }
    }

    public boolean isDisposed() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    public C9207b replaceResource(int i, C9207b bVar) {
        C9207b bVar2;
        do {
            bVar2 = (C9207b) get(i);
            if (bVar2 == DisposableHelper.DISPOSED) {
                bVar.dispose();
                return null;
            }
        } while (!compareAndSet(i, bVar2, bVar));
        return bVar2;
    }

    public boolean setResource(int i, C9207b bVar) {
        C9207b bVar2;
        do {
            bVar2 = (C9207b) get(i);
            if (bVar2 == DisposableHelper.DISPOSED) {
                bVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }
}
