package p040c.p200q.p201a.p264c.p294g.p333g;

import java.io.Serializable;
import java.util.regex.Pattern;

/* renamed from: c.q.a.c.g.g.zl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4960zl extends C4293ak implements Serializable {

    /* renamed from: e */
    public final Pattern f9788e;

    public C4960zl(Pattern pattern) {
        if (pattern != null) {
            this.f9788e = pattern;
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final C4292aj mo25794a(CharSequence charSequence) {
        return new C4591ll(this.f9788e.matcher(charSequence));
    }

    public final String toString() {
        return this.f9788e.toString();
    }
}
