package androidx.camera.camera2.impl;

import android.annotation.SuppressLint;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.Camera2Config;
import androidx.camera.core.CaptureConfig;
import androidx.camera.core.DeviceProperties;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureConfig;
import androidx.camera.core.UseCaseConfig;

public final class ImageCaptureOptionUnpacker extends Camera2CaptureOptionUnpacker {
    public static final ImageCaptureOptionUnpacker INSTANCE = new ImageCaptureOptionUnpacker();
    public DeviceProperties mDeviceProperties = DeviceProperties.create();

    /* renamed from: androidx.camera.camera2.impl.ImageCaptureOptionUnpacker$1 */
    public static /* synthetic */ class C03611 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$ImageCapture$CaptureMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.ImageCapture$CaptureMode[] r0 = androidx.camera.core.ImageCapture.CaptureMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$ImageCapture$CaptureMode = r0
                androidx.camera.core.ImageCapture$CaptureMode r1 = androidx.camera.core.ImageCapture.CaptureMode.MAX_QUALITY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$ImageCapture$CaptureMode     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.ImageCapture$CaptureMode r1 = androidx.camera.core.ImageCapture.CaptureMode.MIN_LATENCY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.ImageCaptureOptionUnpacker.C03611.<clinit>():void");
        }
    }

    @SuppressLint({"NewApi"})
    private void applyPixelHdrPlusChangeForCaptureMode(ImageCapture.CaptureMode captureMode, Camera2Config.Builder builder) {
        if (!"Google".equals(this.mDeviceProperties.manufacturer())) {
            return;
        }
        if (("Pixel 2".equals(this.mDeviceProperties.model()) || "Pixel 3".equals(this.mDeviceProperties.model())) && this.mDeviceProperties.sdkVersion() >= 26 && captureMode != null) {
            int i = C03611.$SwitchMap$androidx$camera$core$ImageCapture$CaptureMode[captureMode.ordinal()];
            if (i == 1) {
                builder.setCaptureRequestOption(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.TRUE);
            } else if (i == 2) {
                builder.setCaptureRequestOption(CaptureRequest.CONTROL_ENABLE_ZSL, Boolean.FALSE);
            }
        }
    }

    public void setDeviceProperty(DeviceProperties deviceProperties) {
        this.mDeviceProperties = deviceProperties;
    }

    public void unpack(UseCaseConfig<?> useCaseConfig, CaptureConfig.Builder builder) {
        super.unpack(useCaseConfig, builder);
        if (useCaseConfig instanceof ImageCaptureConfig) {
            Camera2Config.Builder builder2 = new Camera2Config.Builder();
            applyPixelHdrPlusChangeForCaptureMode(((ImageCaptureConfig) useCaseConfig).getCaptureMode((ImageCapture.CaptureMode) null), builder2);
            builder.addImplementationOptions(builder2.build());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
