package p630io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;

@Keep
/* renamed from: io.flutter.plugins.firebase.crashlytics.FirebaseCrashlyticsTestCrash */
public class FirebaseCrashlyticsTestCrash extends RuntimeException {
    public FirebaseCrashlyticsTestCrash() {
        super("This is a test crash caused by calling .crash() in Dart.");
    }
}
