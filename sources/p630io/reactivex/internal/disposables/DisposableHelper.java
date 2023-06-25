package p630io.reactivex.internal.disposables;

import java.util.concurrent.atomic.AtomicReference;
import p553f.p594c.p598o.C9207b;
import p553f.p594c.p602s.p604b.C9227b;
import p553f.p594c.p617v.C9323a;
import p630io.reactivex.exceptions.ProtocolViolationException;

/* renamed from: io.reactivex.internal.disposables.DisposableHelper */
public enum DisposableHelper implements C9207b {
    DISPOSED;

    public static boolean dispose(AtomicReference<C9207b> atomicReference) {
        C9207b andSet;
        C9207b bVar = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (bVar == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean isDisposed(C9207b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<C9207b> atomicReference, C9207b bVar) {
        C9207b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static void reportDisposableSet() {
        C9323a.m25169p(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<C9207b> atomicReference, C9207b bVar) {
        C9207b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar == null) {
                    return false;
                }
                bVar.dispose();
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 == null) {
            return true;
        }
        bVar2.dispose();
        return true;
    }

    public static boolean setOnce(AtomicReference<C9207b> atomicReference, C9207b bVar) {
        C9227b.m24985d(bVar, "d is null");
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        reportDisposableSet();
        return false;
    }

    public static boolean trySet(AtomicReference<C9207b> atomicReference, C9207b bVar) {
        if (atomicReference.compareAndSet((Object) null, bVar)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bVar.dispose();
        return false;
    }

    public static boolean validate(C9207b bVar, C9207b bVar2) {
        if (bVar2 == null) {
            C9323a.m25169p(new NullPointerException("next is null"));
            return false;
        } else if (bVar == null) {
            return true;
        } else {
            bVar2.dispose();
            reportDisposableSet();
            return false;
        }
    }

    public void dispose() {
    }

    public boolean isDisposed() {
        return true;
    }
}
