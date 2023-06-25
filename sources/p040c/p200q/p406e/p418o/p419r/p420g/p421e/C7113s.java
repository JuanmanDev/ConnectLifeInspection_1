package p040c.p200q.p406e.p418o.p419r.p420g.p421e;

import com.google.zxing.FormatException;
import kotlin.text.Typography;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.r.g.e.s */
/* compiled from: GeneralAppIdDecoder */
public final class C7113s {

    /* renamed from: a */
    public final C7032a f13669a;

    /* renamed from: b */
    public final C7106m f13670b = new C7106m();

    /* renamed from: c */
    public final StringBuilder f13671c = new StringBuilder();

    public C7113s(C7032a aVar) {
        this.f13669a = aVar;
    }

    /* renamed from: g */
    public static int m21168g(C7032a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo32517c(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String mo32740a(StringBuilder sb, int i) {
        String str = null;
        while (true) {
            C7109o c = mo32742c(i, str);
            String a = C7112r.m21165a(c.mo32732b());
            if (a != null) {
                sb.append(a);
            }
            String valueOf = c.mo32734d() ? String.valueOf(c.mo32733c()) : null;
            if (i == c.mo32739a()) {
                return sb.toString();
            }
            i = c.mo32739a();
            str = valueOf;
        }
    }

    /* renamed from: b */
    public final C7108n mo32741b(int i) {
        char c;
        int f = mo32745f(i, 5);
        if (f == 15) {
            return new C7108n(i + 5, Typography.dollar);
        }
        if (f >= 5 && f < 15) {
            return new C7108n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo32745f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C7108n(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + f2);
        }
        return new C7108n(i + 6, c);
    }

    /* renamed from: c */
    public C7109o mo32742c(int i, String str) {
        this.f13671c.setLength(0);
        if (str != null) {
            this.f13671c.append(str);
        }
        this.f13670b.mo32729h(i);
        C7109o o = mo32753o();
        if (o == null || !o.mo32734d()) {
            return new C7109o(this.f13670b.mo32722a(), this.f13671c.toString());
        }
        return new C7109o(this.f13670b.mo32722a(), this.f13671c.toString(), o.mo32733c());
    }

    /* renamed from: d */
    public final C7108n mo32743d(int i) {
        char c;
        int f = mo32745f(i, 5);
        if (f == 15) {
            return new C7108n(i + 5, Typography.dollar);
        }
        if (f >= 5 && f < 15) {
            return new C7108n(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo32745f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C7108n(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C7108n(i + 7, (char) (f2 + 7));
        }
        switch (mo32745f(i, 8)) {
            case 232:
                c = PublicSuffixDatabase.EXCEPTION_MARKER;
                break;
            case 233:
                c = Typography.quote;
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = Typography.amp;
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case 238:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case 240:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case 242:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = ':';
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = Typography.less;
                break;
            case 248:
                c = '=';
                break;
            case 249:
                c = Typography.greater;
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        return new C7108n(i + 8, c);
    }

    /* renamed from: e */
    public final C7110p mo32744e(int i) {
        int i2 = i + 7;
        if (i2 > this.f13669a.mo32523h()) {
            int f = mo32745f(i, 4);
            if (f == 0) {
                return new C7110p(this.f13669a.mo32523h(), 10, 10);
            }
            return new C7110p(this.f13669a.mo32523h(), f - 1, 10);
        }
        int f2 = mo32745f(i, 7) - 8;
        return new C7110p(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: f */
    public int mo32745f(int i, int i2) {
        return m21168g(this.f13669a, i, i2);
    }

    /* renamed from: h */
    public final boolean mo32746h(int i) {
        int i2 = i + 3;
        if (i2 > this.f13669a.mo32523h()) {
            return false;
        }
        while (i < i2) {
            if (this.f13669a.mo32517c(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo32747i(int i) {
        int i2;
        if (i + 1 > this.f13669a.mo32523h()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f13669a.mo32523h()) {
            if (i3 == 2) {
                if (!this.f13669a.mo32517c(i + 2)) {
                    return false;
                }
            } else if (this.f13669a.mo32517c(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo32748j(int i) {
        int i2;
        if (i + 1 > this.f13669a.mo32523h()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f13669a.mo32523h()) {
            if (this.f13669a.mo32517c(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo32749k(int i) {
        int f;
        if (i + 5 > this.f13669a.mo32523h()) {
            return false;
        }
        int f2 = mo32745f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 6 <= this.f13669a.mo32523h() && (f = mo32745f(i, 6)) >= 16 && f < 63) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo32750l(int i) {
        int f;
        if (i + 5 > this.f13669a.mo32523h()) {
            return false;
        }
        int f2 = mo32745f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.f13669a.mo32523h()) {
            return false;
        }
        int f3 = mo32745f(i, 7);
        if (f3 >= 64 && f3 < 116) {
            return true;
        }
        if (i + 8 <= this.f13669a.mo32523h() && (f = mo32745f(i, 8)) >= 232 && f < 253) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo32751m(int i) {
        if (i + 7 <= this.f13669a.mo32523h()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.f13669a.mo32517c(i3);
                }
                if (this.f13669a.mo32517c(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.f13669a.mo32523h()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    public final C7105l mo32752n() {
        while (mo32749k(this.f13670b.mo32722a())) {
            C7108n b = mo32741b(this.f13670b.mo32722a());
            this.f13670b.mo32729h(b.mo32739a());
            if (b.mo32731c()) {
                return new C7105l(new C7109o(this.f13670b.mo32722a(), this.f13671c.toString()), true);
            }
            this.f13671c.append(b.mo32730b());
        }
        if (mo32746h(this.f13670b.mo32722a())) {
            this.f13670b.mo32723b(3);
            this.f13670b.mo32728g();
        } else if (mo32747i(this.f13670b.mo32722a())) {
            if (this.f13670b.mo32722a() + 5 < this.f13669a.mo32523h()) {
                this.f13670b.mo32723b(5);
            } else {
                this.f13670b.mo32729h(this.f13669a.mo32523h());
            }
            this.f13670b.mo32727f();
        }
        return new C7105l(false);
    }

    /* renamed from: o */
    public final C7109o mo32753o() {
        boolean z;
        C7105l lVar;
        do {
            int a = this.f13670b.mo32722a();
            if (this.f13670b.mo32724c()) {
                lVar = mo32752n();
                z = lVar.mo32721b();
            } else if (this.f13670b.mo32725d()) {
                lVar = mo32754p();
                z = lVar.mo32721b();
            } else {
                lVar = mo32755q();
                z = lVar.mo32721b();
            }
            if (!(a != this.f13670b.mo32722a()) && !z) {
                break;
            }
        } while (!z);
        return lVar.mo32720a();
    }

    /* renamed from: p */
    public final C7105l mo32754p() {
        while (mo32750l(this.f13670b.mo32722a())) {
            C7108n d = mo32743d(this.f13670b.mo32722a());
            this.f13670b.mo32729h(d.mo32739a());
            if (d.mo32731c()) {
                return new C7105l(new C7109o(this.f13670b.mo32722a(), this.f13671c.toString()), true);
            }
            this.f13671c.append(d.mo32730b());
        }
        if (mo32746h(this.f13670b.mo32722a())) {
            this.f13670b.mo32723b(3);
            this.f13670b.mo32728g();
        } else if (mo32747i(this.f13670b.mo32722a())) {
            if (this.f13670b.mo32722a() + 5 < this.f13669a.mo32523h()) {
                this.f13670b.mo32723b(5);
            } else {
                this.f13670b.mo32729h(this.f13669a.mo32523h());
            }
            this.f13670b.mo32726e();
        }
        return new C7105l(false);
    }

    /* renamed from: q */
    public final C7105l mo32755q() {
        C7109o oVar;
        while (mo32751m(this.f13670b.mo32722a())) {
            C7110p e = mo32744e(this.f13670b.mo32722a());
            this.f13670b.mo32729h(e.mo32739a());
            if (e.mo32737d()) {
                if (e.mo32738e()) {
                    oVar = new C7109o(this.f13670b.mo32722a(), this.f13671c.toString());
                } else {
                    oVar = new C7109o(this.f13670b.mo32722a(), this.f13671c.toString(), e.mo32736c());
                }
                return new C7105l(oVar, true);
            }
            this.f13671c.append(e.mo32735b());
            if (e.mo32738e()) {
                return new C7105l(new C7109o(this.f13670b.mo32722a(), this.f13671c.toString()), true);
            }
            this.f13671c.append(e.mo32736c());
        }
        if (mo32748j(this.f13670b.mo32722a())) {
            this.f13670b.mo32726e();
            this.f13670b.mo32723b(4);
        }
        return new C7105l(false);
    }
}
