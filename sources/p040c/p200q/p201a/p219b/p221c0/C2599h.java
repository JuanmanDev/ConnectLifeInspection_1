package p040c.p200q.p201a.p219b.p221c0;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import androidx.annotation.Nullable;

/* renamed from: c.q.a.b.c0.h */
/* compiled from: AudioAttributes */
public final class C2599h {

    /* renamed from: e */
    public static final C2599h f3109e = new C2601b().mo18232a();

    /* renamed from: a */
    public final int f3110a;

    /* renamed from: b */
    public final int f3111b;

    /* renamed from: c */
    public final int f3112c;
    @Nullable

    /* renamed from: d */
    public AudioAttributes f3113d;

    /* renamed from: c.q.a.b.c0.h$b */
    /* compiled from: AudioAttributes */
    public static final class C2601b {

        /* renamed from: a */
        public int f3114a = 0;

        /* renamed from: b */
        public int f3115b = 0;

        /* renamed from: c */
        public int f3116c = 1;

        /* renamed from: a */
        public C2599h mo18232a() {
            return new C2599h(this.f3114a, this.f3115b, this.f3116c);
        }

        /* renamed from: b */
        public C2601b mo18233b(int i) {
            this.f3114a = i;
            return this;
        }

        /* renamed from: c */
        public C2601b mo18234c(int i) {
            this.f3116c = i;
            return this;
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    public AudioAttributes mo18229a() {
        if (this.f3113d == null) {
            this.f3113d = new AudioAttributes.Builder().setContentType(this.f3110a).setFlags(this.f3111b).setUsage(this.f3112c).build();
        }
        return this.f3113d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2599h.class != obj.getClass()) {
            return false;
        }
        C2599h hVar = (C2599h) obj;
        if (this.f3110a == hVar.f3110a && this.f3111b == hVar.f3111b && this.f3112c == hVar.f3112c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f3110a) * 31) + this.f3111b) * 31) + this.f3112c;
    }

    public C2599h(int i, int i2, int i3) {
        this.f3110a = i;
        this.f3111b = i2;
        this.f3112c = i3;
    }
}
