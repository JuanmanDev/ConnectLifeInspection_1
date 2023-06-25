package p040c.p151o.p152a.p153a.p174u;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* renamed from: c.o.a.a.u.d */
/* compiled from: FileUtils */
public class C2203d {

    /* renamed from: a */
    public final Context f2183a;

    /* renamed from: a */
    public Bundle mo17058a() {
        try {
            return this.f2183a.getPackageManager().getApplicationInfo(this.f2183a.getPackageName(), 128).metaData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public String mo17059b(String str) {
        Bundle a = mo17058a();
        if (a == null) {
            return null;
        }
        if (a.get(str) instanceof String) {
            return (String) a.get(str);
        }
        if ((a.get(str) instanceof Float) || (a.get(str) instanceof Integer)) {
            return String.valueOf(str);
        }
        return null;
    }
}
