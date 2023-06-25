package androidx.test.espresso.base;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.p032os.ControlledLooper;

public final /* synthetic */ class BaseLayerModule$$Lambda$0 implements ServiceLoaderWrapper.Factory {
    public static final ServiceLoaderWrapper.Factory $instance = new BaseLayerModule$$Lambda$0();

    public Object create() {
        return ControlledLooper.NO_OP_CONTROLLED_LOOPER;
    }
}
