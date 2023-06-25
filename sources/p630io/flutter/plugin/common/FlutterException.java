package p630io.flutter.plugin.common;

/* renamed from: io.flutter.plugin.common.FlutterException */
public class FlutterException extends RuntimeException {
    public static final String TAG = "FlutterException#";
    public final String code;
    public final Object details;

    public FlutterException(String str, String str2, Object obj) {
        super(str2);
        this.code = str;
        this.details = obj;
    }
}
