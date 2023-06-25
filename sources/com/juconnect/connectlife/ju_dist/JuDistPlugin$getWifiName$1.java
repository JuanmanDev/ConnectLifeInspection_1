package com.juconnect.connectlife.ju_dist;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p040c.p472t.p473a.C7567d;
import p040c.p472t.p473a.C7585u;

@Metadata(mo47990d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo47991d2 = {"com/juconnect/connectlife/ju_dist/JuDistPlugin$getWifiName$1", "Lcom/hjq/permissions/OnPermissionCallback;", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuDistPlugin.kt */
public final class JuDistPlugin$getWifiName$1 implements C7567d {
    public final /* synthetic */ JuDistPlugin this$0;

    public JuDistPlugin$getWifiName$1(JuDistPlugin juDistPlugin) {
        this.this$0 = juDistPlugin;
    }

    public void onDenied(@Nullable List<String> list, boolean z) {
        super.onDenied(list, z);
        if (z) {
            FragmentActivity access$getActivity$p = this.this$0.activity;
            if (access$getActivity$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
                access$getActivity$p = null;
            }
            if (C7585u.m21556e(access$getActivity$p, list)) {
                this.this$0.locationPermissionCallback(JuDistPlugin.PERMISSION_DENIED);
                return;
            }
            return;
        }
        this.this$0.locationPermissionCallback(JuDistPlugin.PERMISSION_NOT_DETERMINED);
    }

    public void onGranted(@Nullable List<String> list, boolean z) {
        if (z) {
            this.this$0.locationPermissionCallback(JuDistPlugin.PERMISSION_GRANT);
        } else {
            this.this$0.locationPermissionCallback(JuDistPlugin.PERMISSION_DENIED);
        }
    }
}
