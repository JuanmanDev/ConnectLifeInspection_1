package p040c.p200q.p201a.p264c.p276d.p284k;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.test.internal.runner.RunnerArgs;
import java.util.Locale;
import p040c.p200q.p201a.p264c.p276d.p281j.C3471h;

/* renamed from: c.q.a.c.d.k.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3537a {

    /* renamed from: a */
    public final String f6533a;

    /* renamed from: b */
    public final String f6534b;

    /* renamed from: c */
    public final int f6535c;

    public C3537a(@NonNull String str, @NonNull String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(RunnerArgs.CLASS_SEPARATOR);
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f6534b = str2;
        this.f6533a = str;
        new C3471h(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f6533a, i)) {
            i++;
        }
        this.f6535c = i;
    }

    /* renamed from: a */
    public void mo20805a(@NonNull String str, @NonNull Object... objArr) {
        if (mo20809e(3)) {
            mo20808d(str, objArr);
        }
    }

    /* renamed from: b */
    public void mo20806b(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        mo20808d(str, objArr);
    }

    /* renamed from: c */
    public void mo20807c(@NonNull String str, @NonNull Object... objArr) {
        mo20808d(str, objArr);
    }

    @NonNull
    /* renamed from: d */
    public String mo20808d(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f6534b.concat(str);
    }

    /* renamed from: e */
    public boolean mo20809e(int i) {
        return this.f6535c <= i;
    }

    /* renamed from: f */
    public void mo20810f(@NonNull String str, @NonNull Object... objArr) {
        if (mo20809e(2)) {
            mo20808d(str, objArr);
        }
    }

    /* renamed from: g */
    public void mo20811g(@NonNull String str, @NonNull Object... objArr) {
        mo20808d(str, objArr);
    }

    /* renamed from: h */
    public void mo20812h(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        Log.wtf(this.f6533a, mo20808d(str, objArr), th);
    }

    /* renamed from: i */
    public void mo20813i(@NonNull Throwable th) {
        Log.wtf(this.f6533a, th);
    }
}
