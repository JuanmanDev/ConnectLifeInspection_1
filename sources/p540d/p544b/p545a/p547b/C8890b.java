package p540d.p544b.p545a.p547b;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import androidx.core.p028os.EnvironmentCompat;
import androidx.test.internal.runner.TestRequestBuilder;
import com.hisense.connect_life.core.global.EventBusConstKt;
import java.util.Arrays;
import java.util.HashMap;
import okhttp3.internal.http2.Http2ExchangeCodec;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;

/* renamed from: d.b.a.b.b */
/* compiled from: MethodCallHandlerImpl */
public class C8890b implements C9017j.C9021c {

    /* renamed from: m */
    public static final String[] f17411m = new String[0];

    /* renamed from: e */
    public final ContentResolver f17412e;

    /* renamed from: l */
    public final PackageManager f17413l;

    public C8890b(ContentResolver contentResolver, PackageManager packageManager) {
        this.f17412e = contentResolver;
        this.f17413l = packageManager;
    }

    @SuppressLint({"HardwareIds"})
    /* renamed from: a */
    public final String mo46251a() {
        return Settings.Secure.getString(this.f17412e, "android_id");
    }

    /* renamed from: b */
    public final String[] mo46252b() {
        FeatureInfo[] systemAvailableFeatures = this.f17413l.getSystemAvailableFeatures();
        if (systemAvailableFeatures == null) {
            return f17411m;
        }
        String[] strArr = new String[systemAvailableFeatures.length];
        for (int i = 0; i < systemAvailableFeatures.length; i++) {
            strArr[i] = systemAvailableFeatures[i].name;
        }
        return strArr;
    }

    /* renamed from: c */
    public final boolean mo46253c() {
        return (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) || Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith(EnvironmentCompat.MEDIA_UNKNOWN) || Build.HARDWARE.contains(TestRequestBuilder.RequiresDeviceFilter.EMULATOR_HARDWARE_GOLDFISH) || Build.HARDWARE.contains(TestRequestBuilder.RequiresDeviceFilter.EMULATOR_HARDWARE_RANCHU) || Build.MODEL.contains("google_sdk") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("emulator") || Build.PRODUCT.contains("simulator");
    }

    public void onMethodCall(C9016i iVar, C9017j.C9022d dVar) {
        if (iVar.f17687a.equals("getAndroidDeviceInfo")) {
            HashMap hashMap = new HashMap();
            hashMap.put("board", Build.BOARD);
            hashMap.put("bootloader", Build.BOOTLOADER);
            hashMap.put("brand", Build.BRAND);
            hashMap.put(EventBusConstKt.DEVICE, Build.DEVICE);
            hashMap.put("display", Build.DISPLAY);
            hashMap.put("fingerprint", Build.FINGERPRINT);
            hashMap.put("hardware", Build.HARDWARE);
            hashMap.put(Http2ExchangeCodec.HOST, Build.HOST);
            hashMap.put("id", Build.ID);
            hashMap.put("manufacturer", Build.MANUFACTURER);
            hashMap.put("model", Build.MODEL);
            hashMap.put("product", Build.PRODUCT);
            if (Build.VERSION.SDK_INT >= 21) {
                hashMap.put("supported32BitAbis", Arrays.asList(Build.SUPPORTED_32_BIT_ABIS));
                hashMap.put("supported64BitAbis", Arrays.asList(Build.SUPPORTED_64_BIT_ABIS));
                hashMap.put("supportedAbis", Arrays.asList(Build.SUPPORTED_ABIS));
            } else {
                hashMap.put("supported32BitAbis", Arrays.asList(f17411m));
                hashMap.put("supported64BitAbis", Arrays.asList(f17411m));
                hashMap.put("supportedAbis", Arrays.asList(f17411m));
            }
            hashMap.put("tags", Build.TAGS);
            hashMap.put("type", Build.TYPE);
            hashMap.put("isPhysicalDevice", Boolean.valueOf(!mo46253c()));
            hashMap.put("androidId", mo46251a());
            hashMap.put("systemFeatures", Arrays.asList(mo46252b()));
            HashMap hashMap2 = new HashMap();
            if (Build.VERSION.SDK_INT >= 23) {
                hashMap2.put("baseOS", Build.VERSION.BASE_OS);
                hashMap2.put("previewSdkInt", Integer.valueOf(Build.VERSION.PREVIEW_SDK_INT));
                hashMap2.put("securityPatch", Build.VERSION.SECURITY_PATCH);
            }
            hashMap2.put("codename", Build.VERSION.CODENAME);
            hashMap2.put("incremental", Build.VERSION.INCREMENTAL);
            hashMap2.put("release", Build.VERSION.RELEASE);
            hashMap2.put("sdkInt", Integer.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("version", hashMap2);
            dVar.success(hashMap);
            return;
        }
        dVar.notImplemented();
    }
}
