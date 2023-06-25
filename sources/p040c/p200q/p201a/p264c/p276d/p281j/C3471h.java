package p040c.p200q.p201a.p264c.p276d.p281j;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.c.d.j.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class C3471h {

    /* renamed from: a */
    public final String f6466a;
    @Nullable

    /* renamed from: b */
    public final String f6467b;

    public C3471h(@NonNull String str) {
        this(str, (String) null);
    }

    /* renamed from: a */
    public boolean mo20726a(int i) {
        return Log.isLoggable(this.f6466a, i);
    }

    /* renamed from: b */
    public void mo20727b(@NonNull String str, @NonNull String str2) {
        if (mo20726a(3)) {
            mo20731f(str2);
        }
    }

    /* renamed from: c */
    public void mo20728c(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (mo20726a(6)) {
            mo20731f(str2);
        }
    }

    /* renamed from: d */
    public void mo20729d(@NonNull String str, @NonNull String str2) {
        if (mo20726a(2)) {
            mo20731f(str2);
        }
    }

    /* renamed from: e */
    public void mo20730e(@NonNull String str, @NonNull String str2) {
        if (mo20726a(5)) {
            mo20731f(str2);
        }
    }

    /* renamed from: f */
    public final String mo20731f(String str) {
        String str2 = this.f6467b;
        return str2 == null ? str : str2.concat(str);
    }

    public C3471h(@NonNull String str, @Nullable String str2) {
        C3495o.m8909k(str, "log tag cannot be null");
        C3495o.m8901c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f6466a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f6467b = null;
        } else {
            this.f6467b = str2;
        }
    }
}
