package p040c.p200q.p201a.p348d.p349a.p350a.p351c;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: c.q.a.d.a.a.c.i */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5804i {

    /* renamed from: a */
    public final String f11309a;

    public C5804i(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.f11309a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    /* renamed from: f */
    public static String m16485f(String str, String str2, @Nullable Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int mo28895a(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m16485f(this.f11309a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo28896b(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m16485f(this.f11309a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo28897c(Throwable th, String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m16485f(this.f11309a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo28898d(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m16485f(this.f11309a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo28899e(String str, @Nullable Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m16485f(this.f11309a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
