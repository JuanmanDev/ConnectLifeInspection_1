package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DebugKt;
import p040c.p200q.p363c.C6326c;
import p040c.p200q.p363c.C6327d;
import p040c.p200q.p363c.C6328e;
import p040c.p200q.p363c.C6329f;
import p040c.p200q.p363c.p369m.C6439o;
import p040c.p200q.p363c.p390s.C6746g;
import p040c.p200q.p363c.p403y.C6874d;
import p040c.p200q.p363c.p403y.C6876f;
import p040c.p200q.p363c.p403y.C6878h;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: a */
    public static /* synthetic */ String m22582a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* renamed from: b */
    public static /* synthetic */ String m22583b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: c */
    public static /* synthetic */ String m22584c(Context context) {
        if (Build.VERSION.SDK_INT >= 16 && context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (Build.VERSION.SDK_INT >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (Build.VERSION.SDK_INT < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (Build.VERSION.SDK_INT < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
    }

    /* renamed from: d */
    public static /* synthetic */ String m22585d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m22586e(installerPackageName) : "";
    }

    /* renamed from: e */
    public static String m22586e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<C6439o<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C6874d.m19538b());
        arrayList.add(C6746g.m19087c());
        arrayList.add(C6878h.m19548a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C6878h.m19548a("fire-core", "20.2.0"));
        arrayList.add(C6878h.m19548a("device-name", m22586e(Build.PRODUCT)));
        arrayList.add(C6878h.m19548a("device-model", m22586e(Build.DEVICE)));
        arrayList.add(C6878h.m19548a("device-brand", m22586e(Build.BRAND)));
        arrayList.add(C6878h.m19549b("android-target-sdk", C6327d.f11969a));
        arrayList.add(C6878h.m19549b("android-min-sdk", C6329f.f11971a));
        arrayList.add(C6878h.m19549b("android-platform", C6328e.f11970a));
        arrayList.add(C6878h.m19549b("android-installer", C6326c.f11968a));
        String a = C6876f.m19544a();
        if (a != null) {
            arrayList.add(C6878h.m19548a("kotlin", a));
        }
        return arrayList;
    }
}
