package com.juconnect.connect_life.util;

import android.app.ActivityManager;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47990d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/ServiceUtils;", "", "()V", "Companion", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: ServiceUtils.kt */
public final class ServiceUtils {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    @Metadata(mo47990d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo47991d2 = {"Lcom/juconnect/connect_life/util/ServiceUtils$Companion;", "", "()V", "isRunService", "", "context", "Landroid/content/Context;", "serviceName", "", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: ServiceUtils.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isRunService(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "serviceName");
            Object systemService = context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (systemService != null) {
                for (ActivityManager.RunningServiceInfo next : ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE)) {
                    Intrinsics.checkNotNullExpressionValue(next, "manager.getRunningServices(Integer.MAX_VALUE)");
                    String className = next.service.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "service.service.className");
                    if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) str, false, 2, (Object) null)) {
                        return true;
                    }
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }
}
