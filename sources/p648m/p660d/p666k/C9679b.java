package p648m.p660d.p666k;

import androidx.test.internal.runner.RunnerArgs;
import java.util.regex.Pattern;

/* renamed from: m.d.k.b */
/* compiled from: Protocol */
public class C9679b implements C9678a {

    /* renamed from: b */
    public static final Pattern f18944b = Pattern.compile(" ");

    /* renamed from: c */
    public static final Pattern f18945c = Pattern.compile(RunnerArgs.CLASS_SEPARATOR);

    /* renamed from: a */
    public final String f18946a;

    public C9679b(String str) {
        if (str != null) {
            this.f18946a = str;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public String mo50503a() {
        return this.f18946a;
    }

    /* renamed from: b */
    public C9678a mo50504b() {
        return new C9679b(mo50503a());
    }

    /* renamed from: c */
    public boolean mo50505c(String str) {
        if ("".equals(this.f18946a)) {
            return true;
        }
        for (String equals : f18945c.split(f18944b.matcher(str).replaceAll(""))) {
            if (this.f18946a.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9679b.class != obj.getClass()) {
            return false;
        }
        return this.f18946a.equals(((C9679b) obj).f18946a);
    }

    public int hashCode() {
        return this.f18946a.hashCode();
    }

    public String toString() {
        return mo50503a();
    }
}
