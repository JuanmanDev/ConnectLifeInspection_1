package com.hisense.connect_life.core.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.test.espresso.base.RootsOracle;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, mo47991d2 = {"Lcom/hisense/connect_life/core/utils/DisplayUtil;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "defaultDisplayDensity", "", "getDefaultDisplayDensity", "()I", "setDefaultDisplay", "", "context", "Landroid/content/Context;", "core_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: DisplayUtil.kt */
public final class DisplayUtil {
    @NotNull
    public static final DisplayUtil INSTANCE = new DisplayUtil();
    public static final String TAG = DisplayUtil.class.getSimpleName();

    @SuppressLint({"PrivateApi"})
    public final int getDefaultDisplayDensity() {
        try {
            Class<?> cls = Class.forName(RootsOracle.WINDOW_MANAGER_GLOBAL_CLAZZ);
            Method method = cls.getMethod("getWindowManagerService", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(cls, new Object[0]);
            Method method2 = invoke.getClass().getMethod("getInitialDisplayDensity", new Class[]{Integer.TYPE});
            method2.setAccessible(true);
            Object invoke2 = method2.invoke(invoke, new Object[]{0});
            if (invoke2 != null) {
                return ((Integer) invoke2).intValue();
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public final void setDefaultDisplay(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT > 23) {
            Configuration configuration = context.getResources().getConfiguration();
            int defaultDisplayDensity = getDefaultDisplayDensity();
            configuration.densityDpi = defaultDisplayDensity;
            Intrinsics.stringPlus("densityDpi: ", Integer.valueOf(defaultDisplayDensity));
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
    }
}
