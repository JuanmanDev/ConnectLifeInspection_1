package p040c.p200q.p363c.p370n.p371h;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;

/* renamed from: c.q.c.n.h.e */
/* compiled from: DevelopmentPlatformProvider */
public class C6476e {

    /* renamed from: a */
    public final Context f12183a;
    @Nullable

    /* renamed from: b */
    public C6478b f12184b = null;

    /* renamed from: c.q.c.n.h.e$b */
    /* compiled from: DevelopmentPlatformProvider */
    public class C6478b {
        @Nullable

        /* renamed from: a */
        public final String f12185a;
        @Nullable

        /* renamed from: b */
        public final String f12186b;

        public C6478b(C6476e eVar) {
            int q = C6513n.m18239q(eVar.f12183a, "com.google.firebase.crashlytics.unity_version", "string");
            if (q != 0) {
                this.f12185a = "Unity";
                this.f12186b = eVar.f12183a.getResources().getString(q);
                C6479f f = C6479f.m18125f();
                f.mo30647i("Unity Editor version is: " + this.f12186b);
            } else if (eVar.mo30636c("flutter_assets/NOTICES.Z")) {
                this.f12185a = "Flutter";
                this.f12186b = null;
                C6479f.m18125f().mo30647i("Development platform is: Flutter");
            } else {
                this.f12185a = null;
                this.f12186b = null;
            }
        }
    }

    public C6476e(Context context) {
        this.f12183a = context;
    }

    /* renamed from: c */
    public final boolean mo30636c(String str) {
        if (this.f12183a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f12183a.getAssets().open(str);
            if (open != null) {
                open.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Nullable
    /* renamed from: d */
    public String mo30637d() {
        return mo30639f().f12185a;
    }

    @Nullable
    /* renamed from: e */
    public String mo30638e() {
        return mo30639f().f12186b;
    }

    /* renamed from: f */
    public final C6478b mo30639f() {
        if (this.f12184b == null) {
            this.f12184b = new C6478b();
        }
        return this.f12184b;
    }
}
