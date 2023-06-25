package p627i.p629b;

/* renamed from: i.b.b */
/* compiled from: ComparisonCompactor */
public class C9384b {

    /* renamed from: a */
    public int f18405a;

    /* renamed from: b */
    public String f18406b;

    /* renamed from: c */
    public String f18407c;

    /* renamed from: d */
    public int f18408d;

    /* renamed from: e */
    public int f18409e;

    public C9384b(int i, String str, String str2) {
        this.f18405a = i;
        this.f18406b = str;
        this.f18407c = str2;
    }

    /* renamed from: a */
    public final boolean mo47288a() {
        return this.f18406b.equals(this.f18407c);
    }

    /* renamed from: b */
    public String mo47289b(String str) {
        if (this.f18406b == null || this.f18407c == null || mo47288a()) {
            return C9383a.m25315e(str, this.f18406b, this.f18407c);
        }
        mo47293f();
        mo47294g();
        return C9383a.m25315e(str, mo47290c(this.f18406b), mo47290c(this.f18407c));
    }

    /* renamed from: c */
    public final String mo47290c(String str) {
        String str2 = "[" + str.substring(this.f18408d, (str.length() - this.f18409e) + 1) + "]";
        if (this.f18408d > 0) {
            str2 = mo47291d() + str2;
        }
        if (this.f18409e <= 0) {
            return str2;
        }
        return str2 + mo47292e();
    }

    /* renamed from: d */
    public final String mo47291d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f18408d > this.f18405a ? "..." : "");
        sb.append(this.f18406b.substring(Math.max(0, this.f18408d - this.f18405a), this.f18408d));
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo47292e() {
        int min = Math.min((this.f18406b.length() - this.f18409e) + 1 + this.f18405a, this.f18406b.length());
        StringBuilder sb = new StringBuilder();
        String str = this.f18406b;
        sb.append(str.substring((str.length() - this.f18409e) + 1, min));
        sb.append((this.f18406b.length() - this.f18409e) + 1 < this.f18406b.length() - this.f18405a ? "..." : "");
        return sb.toString();
    }

    /* renamed from: f */
    public final void mo47293f() {
        this.f18408d = 0;
        int min = Math.min(this.f18406b.length(), this.f18407c.length());
        while (true) {
            int i = this.f18408d;
            if (i < min && this.f18406b.charAt(i) == this.f18407c.charAt(this.f18408d)) {
                this.f18408d++;
            } else {
                return;
            }
        }
    }

    /* renamed from: g */
    public final void mo47294g() {
        int length = this.f18406b.length() - 1;
        int length2 = this.f18407c.length() - 1;
        while (true) {
            int i = this.f18408d;
            if (length2 < i || length < i || this.f18406b.charAt(length) != this.f18407c.charAt(length2)) {
                this.f18409e = this.f18406b.length() - length;
            } else {
                length2--;
                length--;
            }
        }
        this.f18409e = this.f18406b.length() - length;
    }
}
