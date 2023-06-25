package p040c.p200q.p406e;

import com.google.zxing.NotFoundException;
import p040c.p200q.p406e.p410l.C7032a;
import p040c.p200q.p406e.p410l.C7033b;

/* renamed from: c.q.e.b */
/* compiled from: BinaryBitmap */
public final class C7016b {

    /* renamed from: a */
    public final C7015a f13404a;

    /* renamed from: b */
    public C7033b f13405b;

    public C7016b(C7015a aVar) {
        if (aVar != null) {
            this.f13404a = aVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    /* renamed from: a */
    public C7033b mo32457a() {
        if (this.f13405b == null) {
            this.f13405b = this.f13404a.mo32452a();
        }
        return this.f13405b;
    }

    /* renamed from: b */
    public C7032a mo32458b(int i, C7032a aVar) {
        return this.f13404a.mo32453b(i, aVar);
    }

    /* renamed from: c */
    public int mo32459c() {
        return this.f13404a.mo32454c();
    }

    /* renamed from: d */
    public int mo32460d() {
        return this.f13404a.mo32456e();
    }

    /* renamed from: e */
    public boolean mo32461e() {
        return this.f13404a.mo32455d().mo32468e();
    }

    /* renamed from: f */
    public C7016b mo32462f() {
        this.f13404a.mo32455d().mo32469f();
        throw null;
    }

    public String toString() {
        try {
            return mo32457a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
