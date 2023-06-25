package com.pichillilorenzo.flutter_inappwebview;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class RequestPermissionHandler implements ActivityCompat.OnRequestPermissionsResultCallback {

    /* renamed from: e */
    public static Map<Integer, List<Runnable>> f16863e = new HashMap();

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (iArr.length > 0 && iArr[0] == 0) {
            List<Runnable> list = f16863e.get(Integer.valueOf(i));
            for (Runnable runnable : list) {
                runnable.run();
                list.remove(runnable);
            }
        }
    }
}
