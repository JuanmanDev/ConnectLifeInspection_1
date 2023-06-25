package com.juconnect.connectlife.ju_picture;

import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p472t.p473a.C7567d;

@Metadata(mo47990d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, mo47991d2 = {"com/juconnect/connectlife/ju_picture/JuPicturePlugin$onMethodCall$1", "Lcom/hjq/permissions/OnPermissionCallback;", "onDenied", "", "permissions", "", "", "never", "", "onGranted", "all", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuPicturePlugin.kt */
public final class JuPicturePlugin$onMethodCall$1 implements C7567d {
    public final /* synthetic */ JuPicturePlugin this$0;

    public JuPicturePlugin$onMethodCall$1(JuPicturePlugin juPicturePlugin) {
        this.this$0 = juPicturePlugin;
    }

    public void onDenied(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "permissions");
        this.this$0.channel.mo46573c("checkCameraStatusCallback", JuDistPlugin.PERMISSION_DENIED);
    }

    public void onGranted(@NotNull List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "permissions");
        if (z) {
            this.this$0.channel.mo46573c("checkCameraStatusCallback", JuDistPlugin.PERMISSION_GRANT);
        } else {
            this.this$0.channel.mo46573c("checkCameraStatusCallback", JuDistPlugin.PERMISSION_DENIED);
        }
    }
}
