package p687n.p688a.p689a;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.fragment.app.Fragment;
import java.util.Arrays;
import p687n.p688a.p689a.p690e.C9827e;
import pub.devrel.easypermissions.R$string;

/* renamed from: n.a.a.b */
/* compiled from: PermissionRequest */
public final class C9818b {

    /* renamed from: a */
    public final C9827e f19085a;

    /* renamed from: b */
    public final String[] f19086b;

    /* renamed from: c */
    public final int f19087c;

    /* renamed from: d */
    public final String f19088d;

    /* renamed from: e */
    public final String f19089e;

    /* renamed from: f */
    public final String f19090f;

    /* renamed from: g */
    public final int f19091g;

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public C9827e mo50736a() {
        return this.f19085a;
    }

    @NonNull
    /* renamed from: b */
    public String mo50737b() {
        return this.f19090f;
    }

    @NonNull
    /* renamed from: c */
    public String[] mo50738c() {
        return (String[]) this.f19086b.clone();
    }

    @NonNull
    /* renamed from: d */
    public String mo50739d() {
        return this.f19089e;
    }

    @NonNull
    /* renamed from: e */
    public String mo50740e() {
        return this.f19088d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9818b.class != obj.getClass()) {
            return false;
        }
        C9818b bVar = (C9818b) obj;
        if (!Arrays.equals(this.f19086b, bVar.f19086b) || this.f19087c != bVar.f19087c) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public int mo50742f() {
        return this.f19087c;
    }

    @StyleRes
    /* renamed from: g */
    public int mo50743g() {
        return this.f19091g;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f19086b) * 31) + this.f19087c;
    }

    public String toString() {
        return "PermissionRequest{mHelper=" + this.f19085a + ", mPerms=" + Arrays.toString(this.f19086b) + ", mRequestCode=" + this.f19087c + ", mRationale='" + this.f19088d + '\'' + ", mPositiveButtonText='" + this.f19089e + '\'' + ", mNegativeButtonText='" + this.f19090f + '\'' + ", mTheme=" + this.f19091g + '}';
    }

    public C9818b(C9827e eVar, String[] strArr, int i, String str, String str2, String str3, int i2) {
        this.f19085a = eVar;
        this.f19086b = (String[]) strArr.clone();
        this.f19087c = i;
        this.f19088d = str;
        this.f19089e = str2;
        this.f19090f = str3;
        this.f19091g = i2;
    }

    /* renamed from: n.a.a.b$b */
    /* compiled from: PermissionRequest */
    public static final class C9820b {

        /* renamed from: a */
        public final C9827e f19092a;

        /* renamed from: b */
        public final int f19093b;

        /* renamed from: c */
        public final String[] f19094c;

        /* renamed from: d */
        public String f19095d;

        /* renamed from: e */
        public String f19096e;

        /* renamed from: f */
        public String f19097f;

        /* renamed from: g */
        public int f19098g = -1;

        public C9820b(@NonNull Activity activity, int i, @Size(min = 1) @NonNull String... strArr) {
            this.f19092a = C9827e.m26419d(activity);
            this.f19093b = i;
            this.f19094c = strArr;
        }

        @NonNull
        /* renamed from: a */
        public C9818b mo50746a() {
            if (this.f19095d == null) {
                this.f19095d = this.f19092a.mo50757b().getString(R$string.rationale_ask);
            }
            if (this.f19096e == null) {
                this.f19096e = this.f19092a.mo50757b().getString(17039370);
            }
            if (this.f19097f == null) {
                this.f19097f = this.f19092a.mo50757b().getString(17039360);
            }
            return new C9818b(this.f19092a, this.f19094c, this.f19093b, this.f19095d, this.f19096e, this.f19097f, this.f19098g);
        }

        @NonNull
        /* renamed from: b */
        public C9820b mo50747b(@StringRes int i) {
            this.f19097f = this.f19092a.mo50757b().getString(i);
            return this;
        }

        @NonNull
        /* renamed from: c */
        public C9820b mo50748c(@StringRes int i) {
            this.f19096e = this.f19092a.mo50757b().getString(i);
            return this;
        }

        @NonNull
        /* renamed from: d */
        public C9820b mo50749d(@StringRes int i) {
            this.f19095d = this.f19092a.mo50757b().getString(i);
            return this;
        }

        @NonNull
        /* renamed from: e */
        public C9820b mo50750e(@Nullable String str) {
            this.f19095d = str;
            return this;
        }

        public C9820b(@NonNull Fragment fragment, int i, @Size(min = 1) @NonNull String... strArr) {
            this.f19092a = C9827e.m26420e(fragment);
            this.f19093b = i;
            this.f19094c = strArr;
        }
    }
}
