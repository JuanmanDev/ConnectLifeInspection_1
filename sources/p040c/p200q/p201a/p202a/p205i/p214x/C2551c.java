package p040c.p200q.p201a.p202a.p205i.p214x;

import android.content.Context;
import androidx.annotation.NonNull;
import p040c.p200q.p201a.p202a.p205i.p212e0.C2512a;

/* renamed from: c.q.a.a.i.x.c */
/* compiled from: AutoValue_CreationContext */
public final class C2551c extends C2556g {

    /* renamed from: a */
    public final Context f2998a;

    /* renamed from: b */
    public final C2512a f2999b;

    /* renamed from: c */
    public final C2512a f3000c;

    /* renamed from: d */
    public final String f3001d;

    public C2551c(Context context, C2512a aVar, C2512a aVar2, String str) {
        if (context != null) {
            this.f2998a = context;
            if (aVar != null) {
                this.f2999b = aVar;
                if (aVar2 != null) {
                    this.f3000c = aVar2;
                    if (str != null) {
                        this.f3001d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    /* renamed from: b */
    public Context mo18002b() {
        return this.f2998a;
    }

    @NonNull
    /* renamed from: c */
    public String mo18003c() {
        return this.f3001d;
    }

    /* renamed from: d */
    public C2512a mo18004d() {
        return this.f3000c;
    }

    /* renamed from: e */
    public C2512a mo18005e() {
        return this.f2999b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2556g)) {
            return false;
        }
        C2556g gVar = (C2556g) obj;
        if (!this.f2998a.equals(gVar.mo18002b()) || !this.f2999b.equals(gVar.mo18005e()) || !this.f3000c.equals(gVar.mo18004d()) || !this.f3001d.equals(gVar.mo18003c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f2998a.hashCode() ^ 1000003) * 1000003) ^ this.f2999b.hashCode()) * 1000003) ^ this.f3000c.hashCode()) * 1000003) ^ this.f3001d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f2998a + ", wallClock=" + this.f2999b + ", monotonicClock=" + this.f3000c + ", backendName=" + this.f3001d + "}";
    }
}
