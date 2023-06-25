package p553f.p554a.p576f.p585g;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import p630io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: f.a.f.g.b */
/* compiled from: UrlLauncher */
public class C9115b {

    /* renamed from: a */
    public final Context f17869a;
    @Nullable

    /* renamed from: b */
    public Activity f17870b;

    /* renamed from: f.a.f.g.b$a */
    /* compiled from: UrlLauncher */
    public enum C9116a {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    public C9115b(Context context, @Nullable Activity activity) {
        this.f17869a = context;
        this.f17870b = activity;
    }

    /* renamed from: a */
    public boolean mo46832a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.f17869a.getPackageManager());
        return resolveActivity != null && !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    /* renamed from: b */
    public void mo46833b() {
        this.f17869a.sendBroadcast(new Intent(WebViewActivity.f18571o));
    }

    /* renamed from: c */
    public C9116a mo46834c(String str, Bundle bundle, boolean z, boolean z2, boolean z3) {
        Intent intent;
        Activity activity = this.f17870b;
        if (activity == null) {
            return C9116a.NO_ACTIVITY;
        }
        if (z) {
            intent = WebViewActivity.m25537b(activity, str, z2, z3, bundle);
        } else {
            intent = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle);
        }
        try {
            this.f17870b.startActivity(intent);
            return C9116a.OK;
        } catch (ActivityNotFoundException unused) {
            return C9116a.ACTIVITY_NOT_FOUND;
        }
    }

    /* renamed from: d */
    public void mo46835d(@Nullable Activity activity) {
        this.f17870b = activity;
    }
}
