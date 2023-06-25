package p040c.p107e.p108a.p109e;

/* renamed from: c.e.a.e.b */
/* compiled from: Credentials */
public class C1969b {

    /* renamed from: a */
    public String f1650a;

    /* renamed from: b */
    public String f1651b;

    public C1969b(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("username and password cannot be null");
        }
        this.f1650a = str;
        this.f1651b = str2;
    }

    /* renamed from: a */
    public String mo16460a() {
        return this.f1651b;
    }

    /* renamed from: b */
    public String mo16461b() {
        return this.f1650a;
    }
}
