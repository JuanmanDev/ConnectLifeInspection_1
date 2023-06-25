package p040c.p142n.p143a.p144a.p150m;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: c.n.a.a.m.c */
/* compiled from: TextBuffer */
public final class C2096c {

    /* renamed from: l */
    public static final char[] f2047l = new char[0];

    /* renamed from: a */
    public final C2094a f2048a;

    /* renamed from: b */
    public char[] f2049b;

    /* renamed from: c */
    public int f2050c;

    /* renamed from: d */
    public int f2051d;

    /* renamed from: e */
    public ArrayList<char[]> f2052e;

    /* renamed from: f */
    public boolean f2053f = false;

    /* renamed from: g */
    public int f2054g;

    /* renamed from: h */
    public char[] f2055h;

    /* renamed from: i */
    public int f2056i;

    /* renamed from: j */
    public String f2057j;

    /* renamed from: k */
    public char[] f2058k;

    public C2096c(C2094a aVar) {
        this.f2048a = aVar;
    }

    /* renamed from: a */
    public final char[] mo16839a(int i) {
        C2094a aVar = this.f2048a;
        if (aVar != null) {
            return aVar.mo16815d(2, i);
        }
        return new char[Math.max(i, 1000)];
    }

    /* renamed from: b */
    public final char[] mo16840b(int i) {
        return new char[i];
    }

    /* renamed from: c */
    public final void mo16841c() {
        this.f2053f = false;
        this.f2052e.clear();
        this.f2054g = 0;
        this.f2056i = 0;
    }

    /* renamed from: d */
    public char[] mo16842d() {
        char[] cArr = this.f2058k;
        if (cArr != null) {
            return cArr;
        }
        char[] j = mo16848j();
        this.f2058k = j;
        return j;
    }

    /* renamed from: e */
    public String mo16843e() {
        if (this.f2057j == null) {
            if (this.f2058k != null) {
                this.f2057j = new String(this.f2058k);
            } else {
                String str = "";
                if (this.f2050c < 0) {
                    int i = this.f2054g;
                    int i2 = this.f2056i;
                    if (i == 0) {
                        if (i2 != 0) {
                            str = new String(this.f2055h, 0, i2);
                        }
                        this.f2057j = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i + i2);
                        ArrayList<char[]> arrayList = this.f2052e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                char[] cArr = this.f2052e.get(i3);
                                sb.append(cArr, 0, cArr.length);
                            }
                        }
                        sb.append(this.f2055h, 0, this.f2056i);
                        this.f2057j = sb.toString();
                    }
                } else if (this.f2051d < 1) {
                    this.f2057j = str;
                    return str;
                } else {
                    this.f2057j = new String(this.f2049b, this.f2050c, this.f2051d);
                }
            }
        }
        return this.f2057j;
    }

    /* renamed from: f */
    public char[] mo16844f() {
        this.f2050c = -1;
        this.f2056i = 0;
        this.f2051d = 0;
        this.f2049b = null;
        this.f2057j = null;
        this.f2058k = null;
        if (this.f2053f) {
            mo16841c();
        }
        char[] cArr = this.f2055h;
        if (cArr != null) {
            return cArr;
        }
        char[] a = mo16839a(0);
        this.f2055h = a;
        return a;
    }

    /* renamed from: g */
    public char[] mo16845g() {
        if (this.f2052e == null) {
            this.f2052e = new ArrayList<>();
        }
        this.f2053f = true;
        this.f2052e.add(this.f2055h);
        int length = this.f2055h.length;
        this.f2054g += length;
        this.f2056i = 0;
        int i = length + (length >> 1);
        if (i < 1000) {
            i = 1000;
        } else if (i > 262144) {
            i = 262144;
        }
        char[] b = mo16840b(i);
        this.f2055h = b;
        return b;
    }

    /* renamed from: h */
    public void mo16846h() {
        if (this.f2048a == null) {
            mo16847i();
        } else if (this.f2055h != null) {
            mo16847i();
            char[] cArr = this.f2055h;
            this.f2055h = null;
            this.f2048a.mo16821j(2, cArr);
        }
    }

    /* renamed from: i */
    public void mo16847i() {
        this.f2050c = -1;
        this.f2056i = 0;
        this.f2051d = 0;
        this.f2049b = null;
        this.f2057j = null;
        this.f2058k = null;
        if (this.f2053f) {
            mo16841c();
        }
    }

    /* renamed from: j */
    public final char[] mo16848j() {
        int i;
        String str = this.f2057j;
        if (str != null) {
            return str.toCharArray();
        }
        int i2 = this.f2050c;
        if (i2 >= 0) {
            int i3 = this.f2051d;
            if (i3 < 1) {
                return f2047l;
            }
            if (i2 == 0) {
                return Arrays.copyOf(this.f2049b, i3);
            }
            return Arrays.copyOfRange(this.f2049b, i2, i3 + i2);
        }
        int l = mo16850l();
        if (l < 1) {
            return f2047l;
        }
        char[] b = mo16840b(l);
        ArrayList<char[]> arrayList = this.f2052e;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr = this.f2052e.get(i4);
                int length = cArr.length;
                System.arraycopy(cArr, 0, b, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this.f2055h, 0, b, i, this.f2056i);
        return b;
    }

    /* renamed from: k */
    public void mo16849k(int i) {
        this.f2056i = i;
    }

    /* renamed from: l */
    public int mo16850l() {
        if (this.f2050c >= 0) {
            return this.f2051d;
        }
        char[] cArr = this.f2058k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.f2057j;
        if (str != null) {
            return str.length();
        }
        return this.f2054g + this.f2056i;
    }

    public String toString() {
        return mo16843e();
    }
}
