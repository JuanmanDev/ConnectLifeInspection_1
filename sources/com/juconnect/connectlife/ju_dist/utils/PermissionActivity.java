package com.juconnect.connectlife.ju_dist.utils;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_dist/utils/PermissionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openGPS", "request", "requestLocationPermission", "ju_dist_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PermissionActivity.kt */
public final class PermissionActivity extends AppCompatActivity {
    private final void openGPS() {
        LogUtils.Companion.debug("PermissionActivity", " 打开GPS");
        new PermissionFragment().show(getSupportFragmentManager(), "dialog");
    }

    private final void request() {
        finish();
        String wifiName = WifiNameUtils.Companion.wifiName(this);
        C9017j channel = JuDistPlugin.Companion.getChannel();
        if (channel != null) {
            channel.mo46573c("getWifiNameCallback", wifiName);
        }
    }

    private final void requestLocationPermission() {
        if (GpsUtils.INSTANCE.isOPen(this)) {
            request();
        } else {
            openGPS();
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (getSupportFragmentManager().getFragments().size() > 0) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "supportFragmentManager.fragments");
            for (Fragment onActivityResult : fragments) {
                onActivityResult.onActivityResult(i, i2, intent);
            }
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        requestLocationPermission();
    }
}
