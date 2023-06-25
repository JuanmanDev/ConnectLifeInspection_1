package com.juconnect.connect_life.pic_activity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.hisense.connect_life.core.base.BaseActivity;
import com.hisense.juconnect.connectlife.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p040c.p301y.p508a.p512v.C7731a;
import p040c.p301y.p508a.p512v.C7732b;

@Metadata(mo47990d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0006H\u0014¨\u0006\u000b"}, mo47991d2 = {"Lcom/juconnect/connect_life/pic_activity/PermissionDeniedActivity;", "Lcom/hisense/connect_life/core/base/BaseActivity;", "()V", "bindLayout", "", "initWidgets", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setListeners", "app_aab"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: PermissionDeniedActivity.kt */
public final class PermissionDeniedActivity extends BaseActivity {
    @NotNull
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* renamed from: setListeners$lambda-0  reason: not valid java name */
    public static final void m27242setListeners$lambda0(PermissionDeniedActivity permissionDeniedActivity, View view) {
        Intrinsics.checkNotNullParameter(permissionDeniedActivity, "this$0");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
            intent.setData(Uri.parse(Intrinsics.stringPlus("package:", permissionDeniedActivity.getPackageName())));
            permissionDeniedActivity.startActivity(intent);
        } catch (Exception unused) {
            permissionDeniedActivity.startActivity(new Intent("android.settings.SETTINGS"));
        }
    }

    /* renamed from: setListeners$lambda-1  reason: not valid java name */
    public static final void m27243setListeners$lambda1(PermissionDeniedActivity permissionDeniedActivity, View view) {
        Intrinsics.checkNotNullParameter(permissionDeniedActivity, "this$0");
        permissionDeniedActivity.onBackPressed();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int bindLayout() {
        return R.layout.activity_permission_denied;
    }

    public void initWidgets() {
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    public void setListeners() {
        ((Button) findViewById(R.id.btn_open_setting)).setOnClickListener(new C7731a(this));
        ((ImageView) findViewById(R.id.tv_back)).setOnClickListener(new C7732b(this));
    }
}
