package p040c.p200q.p363c.p370n.p371h.p376l;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* renamed from: c.q.c.n.h.l.j */
/* compiled from: AutoValue_CrashlyticsReport_Session_Device */
public final class C6626j extends CrashlyticsReport.C8260e.C8265c {

    /* renamed from: a */
    public final int f12612a;

    /* renamed from: b */
    public final String f12613b;

    /* renamed from: c */
    public final int f12614c;

    /* renamed from: d */
    public final long f12615d;

    /* renamed from: e */
    public final long f12616e;

    /* renamed from: f */
    public final boolean f12617f;

    /* renamed from: g */
    public final int f12618g;

    /* renamed from: h */
    public final String f12619h;

    /* renamed from: i */
    public final String f12620i;

    /* renamed from: c.q.c.n.h.l.j$b */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Device */
    public static final class C6628b extends CrashlyticsReport.C8260e.C8265c.C8266a {

        /* renamed from: a */
        public Integer f12621a;

        /* renamed from: b */
        public String f12622b;

        /* renamed from: c */
        public Integer f12623c;

        /* renamed from: d */
        public Long f12624d;

        /* renamed from: e */
        public Long f12625e;

        /* renamed from: f */
        public Boolean f12626f;

        /* renamed from: g */
        public Integer f12627g;

        /* renamed from: h */
        public String f12628h;

        /* renamed from: i */
        public String f12629i;

        /* renamed from: a */
        public CrashlyticsReport.C8260e.C8265c mo31085a() {
            String str = "";
            if (this.f12621a == null) {
                str = str + " arch";
            }
            if (this.f12622b == null) {
                str = str + " model";
            }
            if (this.f12623c == null) {
                str = str + " cores";
            }
            if (this.f12624d == null) {
                str = str + " ram";
            }
            if (this.f12625e == null) {
                str = str + " diskSpace";
            }
            if (this.f12626f == null) {
                str = str + " simulator";
            }
            if (this.f12627g == null) {
                str = str + " state";
            }
            if (this.f12628h == null) {
                str = str + " manufacturer";
            }
            if (this.f12629i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C6626j(this.f12621a.intValue(), this.f12622b, this.f12623c.intValue(), this.f12624d.longValue(), this.f12625e.longValue(), this.f12626f.booleanValue(), this.f12627g.intValue(), this.f12628h, this.f12629i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31086b(int i) {
            this.f12621a = Integer.valueOf(i);
            return this;
        }

        /* renamed from: c */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31087c(int i) {
            this.f12623c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31088d(long j) {
            this.f12625e = Long.valueOf(j);
            return this;
        }

        /* renamed from: e */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31089e(String str) {
            if (str != null) {
                this.f12628h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        /* renamed from: f */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31090f(String str) {
            if (str != null) {
                this.f12622b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        /* renamed from: g */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31091g(String str) {
            if (str != null) {
                this.f12629i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        /* renamed from: h */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31092h(long j) {
            this.f12624d = Long.valueOf(j);
            return this;
        }

        /* renamed from: i */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31093i(boolean z) {
            this.f12626f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: j */
        public CrashlyticsReport.C8260e.C8265c.C8266a mo31094j(int i) {
            this.f12627g = Integer.valueOf(i);
            return this;
        }
    }

    @NonNull
    /* renamed from: b */
    public int mo31073b() {
        return this.f12612a;
    }

    /* renamed from: c */
    public int mo31074c() {
        return this.f12614c;
    }

    /* renamed from: d */
    public long mo31075d() {
        return this.f12616e;
    }

    @NonNull
    /* renamed from: e */
    public String mo31076e() {
        return this.f12619h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C8260e.C8265c)) {
            return false;
        }
        CrashlyticsReport.C8260e.C8265c cVar = (CrashlyticsReport.C8260e.C8265c) obj;
        if (this.f12612a == cVar.mo31073b() && this.f12613b.equals(cVar.mo31078f()) && this.f12614c == cVar.mo31074c() && this.f12615d == cVar.mo31080h() && this.f12616e == cVar.mo31075d() && this.f12617f == cVar.mo31083j() && this.f12618g == cVar.mo31082i() && this.f12619h.equals(cVar.mo31076e()) && this.f12620i.equals(cVar.mo31079g())) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: f */
    public String mo31078f() {
        return this.f12613b;
    }

    @NonNull
    /* renamed from: g */
    public String mo31079g() {
        return this.f12620i;
    }

    /* renamed from: h */
    public long mo31080h() {
        return this.f12615d;
    }

    public int hashCode() {
        long j = this.f12615d;
        long j2 = this.f12616e;
        return ((((((((((((((((this.f12612a ^ 1000003) * 1000003) ^ this.f12613b.hashCode()) * 1000003) ^ this.f12614c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f12617f ? 1231 : 1237)) * 1000003) ^ this.f12618g) * 1000003) ^ this.f12619h.hashCode()) * 1000003) ^ this.f12620i.hashCode();
    }

    /* renamed from: i */
    public int mo31082i() {
        return this.f12618g;
    }

    /* renamed from: j */
    public boolean mo31083j() {
        return this.f12617f;
    }

    public String toString() {
        return "Device{arch=" + this.f12612a + ", model=" + this.f12613b + ", cores=" + this.f12614c + ", ram=" + this.f12615d + ", diskSpace=" + this.f12616e + ", simulator=" + this.f12617f + ", state=" + this.f12618g + ", manufacturer=" + this.f12619h + ", modelClass=" + this.f12620i + "}";
    }

    public C6626j(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f12612a = i;
        this.f12613b = str;
        this.f12614c = i2;
        this.f12615d = j;
        this.f12616e = j2;
        this.f12617f = z;
        this.f12618g = i3;
        this.f12619h = str2;
        this.f12620i = str3;
    }
}
