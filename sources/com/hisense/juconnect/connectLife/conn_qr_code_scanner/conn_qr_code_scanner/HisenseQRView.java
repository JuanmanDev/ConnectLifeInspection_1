package com.hisense.juconnect.connectLife.conn_qr_code_scanner.conn_qr_code_scanner;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.test.orchestrator.junit.BundleJUnitUtils;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.concurrent.TimersKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p307cn.bingoogolapple.qrcode.core.QRCodeViewNew;
import p307cn.bingoogolapple.qrcode.zxing.ZXingViewNew;
import p553f.p554a.p556d.p558b.p561g.p562c.C8950c;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9024l;
import p553f.p554a.p570e.p575e.C9055e;

@Metadata(mo47990d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B9\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u0014H\u0016J\u0018\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J/\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\b2\u0010\u0010&\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000b\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0016¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u0017H\u0016J\u0012\u0010,\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, mo47991d2 = {"Lcom/hisense/juconnect/connectLife/conn_qr_code_scanner/conn_qr_code_scanner/HisenseQRView;", "Lio/flutter/plugin/platform/PlatformView;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "Lcn/bingoogolapple/qrcode/core/QRCodeViewNew$Delegate;", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "id", "", "params", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "(Lio/flutter/plugin/common/BinaryMessenger;ILjava/util/HashMap;)V", "barcodeView", "Lcn/bingoogolapple/qrcode/zxing/ZXingViewNew;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "isTorchOn", "", "permissionGranted", "checkAndRequestPermission", "", "result", "Lio/flutter/plugin/common/MethodChannel$Result;", "dispose", "getView", "Landroid/view/View;", "hasCameraPermission", "initBarCodeView", "onCameraAmbientBrightnessChanged", "isDark", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "onScanQRCodeOpenCameraError", "onScanQRCodeSuccess", "conn_qr_code_scanner_release"}, mo47992k = 1, mo47993mv = {1, 6, 0}, mo47995xi = 48)
/* compiled from: HisenseQRView.kt */
public final class HisenseQRView implements C9055e, C9017j.C9021c, C9024l.C9028d, QRCodeViewNew.C3740f {
    @Nullable
    public ZXingViewNew barcodeView;
    @NotNull
    public final C9017j channel;
    public boolean isTorchOn;
    @NotNull
    public final HashMap<String, Object> params;
    public boolean permissionGranted;

    public HisenseQRView(@NotNull C9003c cVar, int i, @NotNull HashMap<String, Object> hashMap) {
        Application application;
        Intrinsics.checkNotNullParameter(cVar, "messenger");
        Intrinsics.checkNotNullParameter(hashMap, "params");
        this.params = hashMap;
        this.channel = new C9017j(cVar, Intrinsics.stringPlus("conn_qr_code_scanner_", Integer.valueOf(i)));
        if (Shared.INSTANCE.getBinding() != null) {
            C8950c binding = Shared.INSTANCE.getBinding();
            Intrinsics.checkNotNull(binding);
            binding.mo46417b(this);
        }
        if (Shared.INSTANCE.getRegistrar() != null) {
            C9024l.C9027c registrar = Shared.INSTANCE.getRegistrar();
            Intrinsics.checkNotNull(registrar);
            registrar.mo46297b(this);
        }
        this.channel.mo46575e(this);
        Activity activity = Shared.INSTANCE.getActivity();
        if (activity != null && (application = activity.getApplication()) != null) {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(this) {
                public final /* synthetic */ HisenseQRView this$0;

                {
                    this.this$0 = r1;
                }

                public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, "p0");
                }

                public void onActivityDestroyed(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "p0");
                }

                public void onActivityPaused(@NotNull Activity activity) {
                    ZXingViewNew access$getBarcodeView$p;
                    Intrinsics.checkNotNullParameter(activity, "p0");
                    if (Intrinsics.areEqual((Object) activity, (Object) Shared.INSTANCE.getActivity()) && this.this$0.hasCameraPermission() && (access$getBarcodeView$p = this.this$0.barcodeView) != null) {
                        access$getBarcodeView$p.mo21144F();
                    }
                }

                public void onActivityResumed(@NotNull Activity activity) {
                    ZXingViewNew access$getBarcodeView$p;
                    Intrinsics.checkNotNullParameter(activity, "p0");
                    if (Intrinsics.areEqual((Object) activity, (Object) Shared.INSTANCE.getActivity()) && this.this$0.hasCameraPermission() && (access$getBarcodeView$p = this.this$0.barcodeView) != null) {
                        access$getBarcodeView$p.mo21142D();
                    }
                }

                public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
                    Intrinsics.checkNotNullParameter(activity, "p0");
                    Intrinsics.checkNotNullParameter(bundle, "p1");
                }

                public void onActivityStarted(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "p0");
                }

                public void onActivityStopped(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "p0");
                }
            });
        }
    }

    private final void checkAndRequestPermission(C9017j.C9022d dVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            Activity activity = Shared.INSTANCE.getActivity();
            if (activity != null) {
                activity.requestPermissions(new String[]{"android.permission.CAMERA"}, Shared.CAMERA_REQUEST_ID);
            }
        } else if (dVar != null) {
            dVar.error("cameraPermission", "Platform Version to low for camera permission check", (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final boolean hasCameraPermission() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        Activity activity = Shared.INSTANCE.getActivity();
        if (activity != null && activity.checkSelfPermission("android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    private final ZXingViewNew initBarCodeView() {
        if (this.barcodeView == null) {
            this.barcodeView = new ZXingViewNew(Shared.INSTANCE.getActivity());
        } else if (!hasCameraPermission()) {
            checkAndRequestPermission((C9017j.C9022d) null);
        }
        ZXingViewNew zXingViewNew = this.barcodeView;
        if (zXingViewNew == null) {
            return null;
        }
        zXingViewNew.setDelegate(this);
        return zXingViewNew;
    }

    public void dispose() {
        ZXingViewNew zXingViewNew = this.barcodeView;
        if (zXingViewNew != null) {
            zXingViewNew.mo21144F();
        }
        ZXingViewNew zXingViewNew2 = this.barcodeView;
        if (zXingViewNew2 != null) {
            zXingViewNew2.mo21143E();
        }
        this.barcodeView = null;
    }

    @NotNull
    public View getView() {
        ZXingViewNew zXingViewNew = this.barcodeView;
        if (zXingViewNew != null) {
            return zXingViewNew;
        }
        ZXingViewNew initBarCodeView = initBarCodeView();
        Intrinsics.checkNotNull(initBarCodeView);
        return initBarCodeView;
    }

    public void onCameraAmbientBrightnessChanged(boolean z) {
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(@NonNull View view) {
        super.onFlutterViewAttached(view);
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
        super.onFlutterViewDetached();
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
        super.onInputConnectionLocked();
    }

    @SuppressLint({"NewApi"})
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
        super.onInputConnectionUnlocked();
    }

    public void onMethodCall(@NotNull C9016i iVar, @NotNull C9017j.C9022d dVar) {
        Intrinsics.checkNotNullParameter(iVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(dVar, BundleJUnitUtils.KEY_RESULT);
        String str = iVar.f17687a;
        if (str != null) {
            switch (str.hashCode()) {
                case -2129330689:
                    if (str.equals("startScan")) {
                        TimersKt.timer((String) null, false).schedule(new HisenseQRView$onMethodCall$$inlined$timer$default$1(this), 300, 1);
                        dVar.success((Object) null);
                        return;
                    }
                    break;
                case -1824838201:
                    if (str.equals("stopCamera")) {
                        ZXingViewNew zXingViewNew = this.barcodeView;
                        if (zXingViewNew != null) {
                            zXingViewNew.mo21144F();
                        }
                        ZXingViewNew zXingViewNew2 = this.barcodeView;
                        if (zXingViewNew2 != null) {
                            zXingViewNew2.mo21143E();
                        }
                        ZXingViewNew zXingViewNew3 = this.barcodeView;
                        if (zXingViewNew3 != null) {
                            zXingViewNew3.mo21145G();
                        }
                        dVar.success((Object) null);
                        return;
                    }
                    break;
                case -1157185016:
                    if (str.equals("getFlashInfo")) {
                        dVar.success(Boolean.valueOf(this.isTorchOn));
                        return;
                    }
                    break;
                case -668845828:
                    if (str.equals("toggleFlash")) {
                        boolean z = !this.isTorchOn;
                        this.isTorchOn = z;
                        if (z) {
                            ZXingViewNew zXingViewNew4 = this.barcodeView;
                            if (zXingViewNew4 != null) {
                                zXingViewNew4.mo21161u();
                            }
                        } else {
                            ZXingViewNew zXingViewNew5 = this.barcodeView;
                            if (zXingViewNew5 != null) {
                                zXingViewNew5.mo21151n();
                            }
                        }
                        dVar.success((Object) null);
                        return;
                    }
                    break;
                case 1026482610:
                    if (str.equals("resumeCamera")) {
                        ZXingViewNew zXingViewNew6 = this.barcodeView;
                        if (zXingViewNew6 != null) {
                            zXingViewNew6.mo21142D();
                        }
                        dVar.success((Object) null);
                        return;
                    }
                    break;
                case 1714778527:
                    if (str.equals("stopScan")) {
                        ZXingViewNew zXingViewNew7 = this.barcodeView;
                        if (zXingViewNew7 != null) {
                            zXingViewNew7.mo21144F();
                        }
                        dVar.success((Object) null);
                        return;
                    }
                    break;
                case 2013529275:
                    if (str.equals("pauseCamera")) {
                        ZXingViewNew zXingViewNew8 = this.barcodeView;
                        if (zXingViewNew8 != null) {
                            zXingViewNew8.mo21144F();
                        }
                        dVar.success((Object) null);
                        return;
                    }
                    break;
            }
        }
        dVar.notImplemented();
    }

    public boolean onRequestPermissionsResult(int i, @Nullable String[] strArr, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i == 513469796) {
            if ((!(iArr.length == 0)) && iArr[0] == 0) {
                this.permissionGranted = true;
                this.channel.mo46573c("onPermissionSet", Boolean.TRUE);
                return true;
            }
        }
        this.permissionGranted = false;
        this.channel.mo46573c("onPermissionSet", Boolean.FALSE);
        return false;
    }

    public void onScanQRCodeOpenCameraError() {
    }

    public void onScanQRCodeSuccess(@Nullable String str) {
        this.channel.mo46573c("onRecognizeQR", str);
    }
}
