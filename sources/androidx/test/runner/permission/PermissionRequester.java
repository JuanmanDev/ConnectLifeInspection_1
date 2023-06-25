package androidx.test.runner.permission;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.test.annotation.Beta;
import androidx.test.internal.platform.content.PermissionGranter;
import androidx.test.internal.util.Checks;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.runner.permission.RequestPermissionCallable;
import androidx.test.runner.permission.UiAutomationShellCommand;
import java.util.HashSet;
import java.util.Iterator;
import p627i.p629b.C9383a;

@TargetApi(23)
@Beta
public class PermissionRequester implements PermissionGranter {
    public static final String TAG = "PermissionRequester";
    public int androidRuntimeVersion;
    @VisibleForTesting
    public final HashSet<RequestPermissionCallable> requestedPermissions;
    @NonNull
    public final Context targetContext;

    public PermissionRequester() {
        this(InstrumentationRegistry.getInstrumentation().getTargetContext());
    }

    private boolean deviceSupportsRuntimePermissions() {
        return getAndroidRuntimeVersion() >= 23;
    }

    private int getAndroidRuntimeVersion() {
        return this.androidRuntimeVersion;
    }

    public void addPermissions(@NonNull String... strArr) {
        Checks.checkNotNull(strArr, "permissions cannot be null!");
        if (deviceSupportsRuntimePermissions()) {
            for (String str : strArr) {
                C9383a.m25311a("Permission String is empty or null!", TextUtils.isEmpty(str));
                Checks.checkState(this.requestedPermissions.add(new GrantPermissionCallable(new UiAutomationShellCommand(this.targetContext.getPackageName(), str, UiAutomationShellCommand.PmCommand.GRANT_PERMISSION), this.targetContext, str)));
            }
        }
    }

    public void requestPermissions() {
        if (deviceSupportsRuntimePermissions()) {
            Iterator<RequestPermissionCallable> it = this.requestedPermissions.iterator();
            while (it.hasNext()) {
                try {
                    if (RequestPermissionCallable.Result.FAILURE == it.next().call()) {
                        C9383a.m25314d("Failed to grant permissions, see logcat for details");
                        throw null;
                    }
                } catch (Exception unused) {
                    C9383a.m25314d("Failed to grant permissions, see logcat for details");
                    throw null;
                }
            }
        }
    }

    @VisibleForTesting
    public void setAndroidRuntimeVersion(int i) {
        this.androidRuntimeVersion = i;
    }

    @VisibleForTesting
    public PermissionRequester(@NonNull Context context) {
        this.androidRuntimeVersion = Build.VERSION.SDK_INT;
        this.requestedPermissions = new HashSet<>();
        this.targetContext = (Context) Checks.checkNotNull(context, "targetContext cannot be null!");
    }
}
