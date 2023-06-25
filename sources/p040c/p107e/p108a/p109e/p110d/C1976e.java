package p040c.p107e.p108a.p109e.p110d;

/* renamed from: c.e.a.e.d.e */
/* compiled from: CharArrayBuffer */
public final class C1976e {

    /* renamed from: a */
    public char[] f1668a;

    /* renamed from: b */
    public int f1669b;

    public C1976e(int i) {
        if (i >= 0) {
            this.f1668a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    public void mo16491a(String str) {
        if (str == null) {
            str = "null";
        }
        int length = str.length();
        int i = this.f1669b + length;
        if (i > this.f1668a.length) {
            mo16493c(i);
        }
        str.getChars(0, length, this.f1668a, this.f1669b);
        this.f1669b = i;
    }

    /* renamed from: b */
    public char mo16492b(int i) {
        return this.f1668a[i];
    }

    /* renamed from: c */
    public final void mo16493c(int i) {
        char[] cArr = new char[Math.max(this.f1668a.length << 1, i)];
        System.arraycopy(this.f1668a, 0, cArr, 0, this.f1669b);
        this.f1668a = cArr;
    }

    /* renamed from: d */
    public String mo16494d(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f1669b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.f1668a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: e */
    public String mo16495e(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f1669b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && C1977f.m2646a(this.f1668a[i])) {
                i++;
            }
            while (i2 > i && C1977f.m2646a(this.f1668a[i2 - 1])) {
                i2--;
            }
            return new String(this.f1668a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String toString() {
        return new String(this.f1668a, 0, this.f1669b);
    }
}
