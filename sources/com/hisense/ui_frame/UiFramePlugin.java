package com.hisense.ui_frame;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import com.google.android.play.core.review.ReviewInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p348d.p349a.p350a.C5794a;
import p040c.p200q.p201a.p348d.p349a.p350a.C5795b;
import p040c.p429r.p466c.C7561a;
import p040c.p429r.p466c.C7562b;
import p553f.p554a.p556d.p558b.p561g.C8944a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8948a;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

@Metadata(mo47990d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0012\u0010\u0014\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00020\f2\b\b\u0001\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo47991d2 = {"Lcom/hisense/ui_frame/UiFramePlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "()V", "activity", "Landroid/app/Activity;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "manager", "Lcom/google/android/play/core/review/ReviewManager;", "onAttachedToActivity", "", "binding", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToEngine", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromActivity", "onDetachedFromActivityForConfigChanges", "onDetachedFromEngine", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "onReattachedToActivityForConfigChanges", "ui_frame_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: UiFramePlugin.kt */
public final class UiFramePlugin implements C8944a, C9017j.C9021c, C8948a {
    public Activity activity;
    public C9017j channel;
    public C5794a manager;

    /* renamed from: onMethodCall$lambda-1  reason: not valid java name */
    public static final void m27173onMethodCall$lambda1(UiFramePlugin uiFramePlugin, C5771j jVar) {
        Intrinsics.checkNotNullParameter(uiFramePlugin, "this$0");
        Intrinsics.checkNotNullParameter(jVar, "task");
        if (jVar.mo28856q()) {
            ReviewInfo reviewInfo = (ReviewInfo) jVar.mo28852m();
            C5794a aVar = uiFramePlugin.manager;
            Activity activity2 = null;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                aVar = null;
            }
            Activity activity3 = uiFramePlugin.activity;
            if (activity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            } else {
                activity2 = activity3;
            }
            C5771j<Void> a = aVar.mo28885a(activity2, reviewInfo);
            Intrinsics.checkNotNullExpressionValue(a, "manager.launchReviewFlow(activity, reviewInfo)");
            a.mo28842c(C7561a.f14262a);
        }
    }

    /* renamed from: onMethodCall$lambda-1$lambda-0  reason: not valid java name */
    public static final void m27174onMethodCall$lambda1$lambda0(C5771j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "$noName_0");
    }

    public void onAttachedToActivity(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
        C5794a a = C5795b.m16472a(cVar.mo46419d());
        Intrinsics.checkNotNullExpressionValue(a, "create(binding.activity)");
        this.manager = a;
        Activity d = cVar.mo46419d();
        Intrinsics.checkNotNullExpressionValue(d, "binding.activity");
        this.activity = d;
    }

    public void onAttachedToEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "flutterPluginBinding");
        C9017j jVar = new C9017j(bVar.mo46465b(), "ui_frame");
        this.channel = jVar;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            jVar = null;
        }
        jVar.mo46575e(this);
    }

    public void onDetachedFromActivity() {
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(@NotNull @NonNull C8944a.C8946b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "binding");
        C9017j jVar = this.channel;
        if (jVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            jVar = null;
        }
        jVar.mo46575e((C9017j.C9021c) null);
    }

    public void onMethodCall(@NotNull @NonNull C9016i iVar, @NotNull @NonNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        if (Intrinsics.areEqual((Object) iVar.f17687a, (Object) "showScore")) {
            C5794a aVar = this.manager;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("manager");
                aVar = null;
            }
            C5771j<ReviewInfo> b = aVar.mo28886b();
            Intrinsics.checkNotNullExpressionValue(b, "manager.requestReviewFlow()");
            b.mo28842c(new C7562b(this));
            return;
        }
        dVar.notImplemented();
    }

    public void onReattachedToActivityForConfigChanges(@NotNull C8950c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "binding");
    }
}
