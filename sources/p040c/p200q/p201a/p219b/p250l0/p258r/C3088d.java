package p040c.p200q.p201a.p219b.p250l0.p258r;

import android.text.Layout;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.l0.r.d */
/* compiled from: WebvttCssStyle */
public final class C3088d {

    /* renamed from: a */
    public String f5597a;

    /* renamed from: b */
    public String f5598b;

    /* renamed from: c */
    public List<String> f5599c;

    /* renamed from: d */
    public String f5600d;

    /* renamed from: e */
    public String f5601e;

    /* renamed from: f */
    public int f5602f;

    /* renamed from: g */
    public boolean f5603g;

    /* renamed from: h */
    public int f5604h;

    /* renamed from: i */
    public boolean f5605i;

    /* renamed from: j */
    public int f5606j;

    /* renamed from: k */
    public int f5607k;

    /* renamed from: l */
    public int f5608l;

    /* renamed from: m */
    public int f5609m;

    /* renamed from: n */
    public int f5610n;

    /* renamed from: o */
    public float f5611o;

    /* renamed from: p */
    public Layout.Alignment f5612p;

    public C3088d() {
        mo19784m();
    }

    /* renamed from: x */
    public static int m7457x(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    /* renamed from: a */
    public int mo19772a() {
        if (this.f5605i) {
            return this.f5604h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public int mo19773b() {
        if (this.f5603g) {
            return this.f5602f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: c */
    public String mo19774c() {
        return this.f5601e;
    }

    /* renamed from: d */
    public float mo19775d() {
        return this.f5611o;
    }

    /* renamed from: e */
    public int mo19776e() {
        return this.f5610n;
    }

    /* renamed from: f */
    public int mo19777f(String str, String str2, String[] strArr, String str3) {
        if (this.f5597a.isEmpty() && this.f5598b.isEmpty() && this.f5599c.isEmpty() && this.f5600d.isEmpty()) {
            return str2.isEmpty() ? 1 : 0;
        }
        int x = m7457x(m7457x(m7457x(0, this.f5597a, str, 1073741824), this.f5598b, str2, 2), this.f5600d, str3, 4);
        if (x == -1 || !Arrays.asList(strArr).containsAll(this.f5599c)) {
            return 0;
        }
        return x + (this.f5599c.size() * 4);
    }

    /* renamed from: g */
    public int mo19778g() {
        if (this.f5608l == -1 && this.f5609m == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f5608l == 1 ? 1 : 0;
        if (this.f5609m == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: h */
    public Layout.Alignment mo19779h() {
        return this.f5612p;
    }

    /* renamed from: i */
    public boolean mo19780i() {
        return this.f5605i;
    }

    /* renamed from: j */
    public boolean mo19781j() {
        return this.f5603g;
    }

    /* renamed from: k */
    public boolean mo19782k() {
        return this.f5606j == 1;
    }

    /* renamed from: l */
    public boolean mo19783l() {
        return this.f5607k == 1;
    }

    /* renamed from: m */
    public void mo19784m() {
        this.f5597a = "";
        this.f5598b = "";
        this.f5599c = Collections.emptyList();
        this.f5600d = "";
        this.f5601e = null;
        this.f5603g = false;
        this.f5605i = false;
        this.f5606j = -1;
        this.f5607k = -1;
        this.f5608l = -1;
        this.f5609m = -1;
        this.f5610n = -1;
        this.f5612p = null;
    }

    /* renamed from: n */
    public C3088d mo19785n(int i) {
        this.f5604h = i;
        this.f5605i = true;
        return this;
    }

    /* renamed from: o */
    public C3088d mo19786o(boolean z) {
        this.f5608l = z ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C3088d mo19787p(int i) {
        this.f5602f = i;
        this.f5603g = true;
        return this;
    }

    /* renamed from: q */
    public C3088d mo19788q(String str) {
        this.f5601e = C3152e0.m7810l0(str);
        return this;
    }

    /* renamed from: r */
    public C3088d mo19789r(boolean z) {
        this.f5609m = z ? 1 : 0;
        return this;
    }

    /* renamed from: s */
    public void mo19790s(String[] strArr) {
        this.f5599c = Arrays.asList(strArr);
    }

    /* renamed from: t */
    public void mo19791t(String str) {
        this.f5597a = str;
    }

    /* renamed from: u */
    public void mo19792u(String str) {
        this.f5598b = str;
    }

    /* renamed from: v */
    public void mo19793v(String str) {
        this.f5600d = str;
    }

    /* renamed from: w */
    public C3088d mo19794w(boolean z) {
        this.f5607k = z ? 1 : 0;
        return this;
    }
}
