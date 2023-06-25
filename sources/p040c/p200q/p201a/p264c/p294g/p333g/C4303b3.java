package p040c.p200q.p201a.p264c.p294g.p333g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.q.a.c.g.g.b3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4303b3 {

    /* renamed from: a */
    public final C4371dh f9131a;

    /* renamed from: b */
    public final C4302b2 f9132b;

    public C4303b3(C4302b2 b2Var) {
        C4397eg egVar = C4397eg.f9199b;
        this.f9132b = b2Var;
        this.f9131a = egVar;
    }

    /* renamed from: b */
    public static C4303b3 m11701b(char c) {
        return new C4303b3(new C4272a(new C4368de('.')));
    }

    /* renamed from: c */
    public static C4303b3 m11702c(String str) {
        C4293ak a = C4647nn.m12562a("[.-]");
        if (!((C4591ll) a.mo25794a("")).f9394a.matches()) {
            return new C4303b3(new C4462h0(a));
        }
        throw new IllegalArgumentException(C4304b4.m11704a("The pattern may not match the empty string: %s", a));
    }

    /* renamed from: d */
    public final List mo25808d(CharSequence charSequence) {
        if (charSequence != null) {
            Iterator a = this.f9132b.mo25754a(this, charSequence);
            ArrayList arrayList = new ArrayList();
            while (a.hasNext()) {
                arrayList.add((String) a.next());
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw null;
    }
}
