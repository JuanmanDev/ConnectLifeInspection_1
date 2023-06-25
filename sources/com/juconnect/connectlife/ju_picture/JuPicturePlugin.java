package com.juconnect.connectlife.ju_picture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.juconnect.connect_life.global.GeneralMethodConstant;
import com.juconnect.connectlife.ju_dist.JuDistPlugin;
import com.juconnect.connectlife.ju_picture.activity.TakePhotoActivity;
import com.juconnect.connectlife.ju_picture.activity.TakePictureActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p040c.p472t.p473a.C7585u;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;

@Metadata(mo47990d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0010J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_picture/JuPicturePlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "activity", "Landroid/app/Activity;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "(Landroid/app/Activity;Lio/flutter/plugin/common/MethodChannel;)V", "onMethodCall", "", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "qrJumpToManual", "qrResult", "info", "", "qrTimeOut", "takePhotoError", "message", "takePhotoResult", "fileName", "Companion", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: JuPicturePlugin.kt */
public final class JuPicturePlugin implements C9017j.C9021c {
    @NotNull
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Nullable
    public static JuPicturePlugin juPicturePlugin;
    @NotNull
    public Activity activity;
    @NotNull
    public C9017j channel;

    @Metadata(mo47990d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, mo47991d2 = {"Lcom/juconnect/connectlife/ju_picture/JuPicturePlugin$Companion;", "", "()V", "juPicturePlugin", "Lcom/juconnect/connectlife/ju_picture/JuPicturePlugin;", "getJuPicturePlugin", "()Lcom/juconnect/connectlife/ju_picture/JuPicturePlugin;", "setJuPicturePlugin", "(Lcom/juconnect/connectlife/ju_picture/JuPicturePlugin;)V", "registerWith", "", "registrar", "Lio/flutter/plugin/common/PluginRegistry$Registrar;", "ju_picture_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
    /* compiled from: JuPicturePlugin.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final JuPicturePlugin getJuPicturePlugin() {
            return JuPicturePlugin.juPicturePlugin;
        }

        @JvmStatic
        public final void registerWith(@NotNull C9024l.C9027c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "registrar");
            C9017j jVar = new C9017j(cVar.mo46301f(), "com.juconnect.connectlife/juPictureMethod");
            Activity d = cVar.mo46299d();
            Intrinsics.checkNotNullExpressionValue(d, "registrar.activity()");
            setJuPicturePlugin(new JuPicturePlugin(d, jVar));
            jVar.mo46575e(getJuPicturePlugin());
        }

        public final void setJuPicturePlugin(@Nullable JuPicturePlugin juPicturePlugin) {
            JuPicturePlugin.juPicturePlugin = juPicturePlugin;
        }
    }

    public JuPicturePlugin(@NotNull Activity activity2, @NotNull C9017j jVar) {
        Intrinsics.checkNotNullParameter(activity2, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        Intrinsics.checkNotNullParameter(jVar, "channel");
        this.activity = activity2;
        this.channel = jVar;
    }

    @JvmStatic
    public static final void registerWith(@NotNull C9024l.C9027c cVar) {
        Companion.registerWith(cVar);
    }

    public void onMethodCall(@NotNull C9016i iVar, @NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "goToTakePhotoPage")) {
            Intent intent = new Intent(this.activity, TakePictureActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("whereToGo", 0);
            intent.putExtras(bundle);
            this.activity.startActivity(intent);
        } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "selectPicture")) {
            Intent intent2 = new Intent(this.activity, TakePictureActivity.class);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("whereToGo", 1);
            intent2.putExtras(bundle2);
            this.activity.startActivity(intent2);
        } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "takePhoto")) {
            this.activity.startActivity(new Intent(this.activity, TakePhotoActivity.class));
        } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "checkCameraStatus")) {
            try {
                if (C7585u.m21555d(this.activity, "android.permission.CAMERA")) {
                    this.channel.mo46573c("checkCameraStatusCallback", JuDistPlugin.PERMISSION_GRANT);
                    return;
                }
                C7585u l = C7585u.m21560l(this.activity);
                l.mo33042g("android.permission.CAMERA");
                l.mo33043h(new JuPicturePlugin$onMethodCall$1(this));
            } catch (Exception e) {
                e.printStackTrace();
                this.channel.mo46573c("checkCameraStatusCallback", JuDistPlugin.PERMISSION_DENIED);
            }
        } else if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) GeneralMethodConstant.OPEN_APP_SETTING)) {
            C7585u.m21559k(this.activity, "android.permission.CAMERA");
        } else {
            dVar.notImplemented();
        }
    }

    public final void qrJumpToManual() {
        this.channel.mo46573c("goToManuallyAddCallback", (Object) null);
    }

    public final void qrResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "info");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", "-1");
        jSONObject.put("resultCode", 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("value", str);
        jSONObject.put("data", jSONObject2);
        this.channel.mo46573c("qrCodeResultCallback", jSONObject.toString());
    }

    public final void qrTimeOut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", "-2");
        jSONObject.put("errorDesc", "超时");
        jSONObject.put("resultCode", 0);
    }

    public final void takePhotoError(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", "2");
        jSONObject.put("resultCode", 0);
        jSONObject.put("errorDesc", str);
        this.channel.mo46573c("getPhotoCallback", jSONObject.toString());
    }

    public final void takePhotoResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorCode", "-1");
        jSONObject.put("resultCode", 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("filePath", str);
        jSONObject.put("data", jSONObject2);
        this.channel.mo46573c("getPhotoCallback", jSONObject.toString());
    }
}
