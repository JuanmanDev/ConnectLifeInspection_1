package androidx.test.rule;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.runner.permission.PermissionRequester;

public final /* synthetic */ class GrantPermissionRule$$Lambda$0 implements ServiceLoaderWrapper.Factory {
    public static final ServiceLoaderWrapper.Factory $instance = new GrantPermissionRule$$Lambda$0();

    public Object create() {
        return new PermissionRequester();
    }
}
