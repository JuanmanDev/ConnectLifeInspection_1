package androidx.camera.core;

import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p353b.p360g.p361a.C6316e;

public final class SettableImageProxyBundle implements ImageProxyBundle {
    public final List<Integer> mCaptureIdList;
    @GuardedBy("mLock")
    public boolean mClosed = false;
    @GuardedBy("mLock")
    public final SparseArray<CallbackToFutureAdapter.Completer<ImageProxy>> mCompleters = new SparseArray<>();
    @GuardedBy("mLock")
    public final SparseArray<C6316e<ImageProxy>> mFutureResults = new SparseArray<>();
    public final Object mLock = new Object();
    @GuardedBy("mLock")
    public final List<ImageProxy> mOwnedImageProxies = new ArrayList();

    public SettableImageProxyBundle(List<Integer> list) {
        this.mCaptureIdList = list;
        setup();
    }

    private void setup() {
        synchronized (this.mLock) {
            for (Integer intValue : this.mCaptureIdList) {
                final int intValue2 = intValue.intValue();
                this.mFutureResults.put(intValue2, CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<ImageProxy>() {
                    public Object attachCompleter(@NonNull CallbackToFutureAdapter.Completer<ImageProxy> completer) {
                        synchronized (SettableImageProxyBundle.this.mLock) {
                            SettableImageProxyBundle.this.mCompleters.put(intValue2, completer);
                        }
                        return "getImageProxy(id: " + intValue2 + ")";
                    }
                }));
            }
        }
    }

    public void addImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                Integer num = (Integer) imageProxy.getImageInfo().getTag();
                if (num != null) {
                    CallbackToFutureAdapter.Completer completer = this.mCompleters.get(num.intValue());
                    if (completer != null) {
                        this.mOwnedImageProxies.add(imageProxy);
                        completer.set(imageProxy);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                for (ImageProxy close : this.mOwnedImageProxies) {
                    close.close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                this.mClosed = true;
            }
        }
    }

    public List<Integer> getCaptureIds() {
        return Collections.unmodifiableList(this.mCaptureIdList);
    }

    public C6316e<ImageProxy> getImageProxy(int i) {
        C6316e<ImageProxy> eVar;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                eVar = this.mFutureResults.get(i);
                if (eVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return eVar;
    }

    public void reset() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                for (ImageProxy close : this.mOwnedImageProxies) {
                    close.close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                setup();
            }
        }
    }
}
