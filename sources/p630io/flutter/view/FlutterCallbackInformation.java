package p630io.flutter.view;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import p630io.flutter.embedding.engine.FlutterJNI;

@Keep
/* renamed from: io.flutter.view.FlutterCallbackInformation */
public final class FlutterCallbackInformation {
    public final String callbackClassName;
    public final String callbackLibraryPath;
    public final String callbackName;

    public FlutterCallbackInformation(String str, String str2, String str3) {
        this.callbackName = str;
        this.callbackClassName = str2;
        this.callbackLibraryPath = str3;
    }

    @NonNull
    public static FlutterCallbackInformation lookupCallbackInformation(long j) {
        return FlutterJNI.nativeLookupCallbackInformation(j);
    }
}
