package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: c.q.a.c.g.g.id */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4502id {

    /* renamed from: a */
    public ArrayList f9292a = new ArrayList();

    /* renamed from: b */
    public C4421fd f9293b = C4421fd.f9226b;

    /* renamed from: c */
    public Integer f9294c = null;

    /* renamed from: a */
    public final C4502id mo26103a(C4278a5 a5Var, int i, C4521j5 j5Var) {
        ArrayList arrayList = this.f9292a;
        if (arrayList != null) {
            arrayList.add(new C4556kd(a5Var, i, j5Var, (C4529jd) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    /* renamed from: b */
    public final C4502id mo26104b(C4421fd fdVar) {
        if (this.f9292a != null) {
            this.f9293b = fdVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    /* renamed from: c */
    public final C4502id mo26105c(int i) {
        if (this.f9292a != null) {
            this.f9294c = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    /* renamed from: d */
    public final C4610md mo26106d() {
        if (this.f9292a != null) {
            Integer num = this.f9294c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f9292a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((C4556kd) arrayList.get(i)).mo26170a() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            C4610md mdVar = new C4610md(this.f9293b, Collections.unmodifiableList(this.f9292a), this.f9294c, (C4583ld) null);
            this.f9292a = null;
            return mdVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
