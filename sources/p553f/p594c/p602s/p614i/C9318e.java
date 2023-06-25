package p553f.p594c.p602s.p614i;

/* renamed from: f.c.s.i.e */
/* compiled from: OpenHashSet */
public final class C9318e<T> {

    /* renamed from: a */
    public final float f18267a;

    /* renamed from: b */
    public int f18268b;

    /* renamed from: c */
    public int f18269c;

    /* renamed from: d */
    public int f18270d;

    /* renamed from: e */
    public T[] f18271e;

    public C9318e() {
        this(16, 0.75f);
    }

    /* renamed from: c */
    public static int m25145c(int i) {
        int i2 = i * -1640531527;
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a */
    public boolean mo47164a(T t) {
        T t2;
        T[] tArr = this.f18271e;
        int i = this.f18268b;
        int c = m25145c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                c = (c + 1) & i;
                t2 = tArr[c];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[c] = t;
        int i2 = this.f18269c + 1;
        this.f18269c = i2;
        if (i2 >= this.f18270d) {
            mo47166d();
        }
        return true;
    }

    /* renamed from: b */
    public Object[] mo47165b() {
        return this.f18271e;
    }

    /* renamed from: d */
    public void mo47166d() {
        T[] tArr = this.f18271e;
        int length = tArr.length;
        int i = length << 1;
        int i2 = i - 1;
        T[] tArr2 = new Object[i];
        int i3 = this.f18269c;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                do {
                    length--;
                } while (tArr[length] == null);
                int c = m25145c(tArr[length].hashCode()) & i2;
                if (tArr2[c] != null) {
                    do {
                        c = (c + 1) & i2;
                    } while (tArr2[c] != null);
                }
                tArr2[c] = tArr[length];
                i3 = i4;
            } else {
                this.f18268b = i2;
                this.f18270d = (int) (((float) i) * this.f18267a);
                this.f18271e = tArr2;
                return;
            }
        }
    }

    /* renamed from: e */
    public boolean mo47167e(T t) {
        T t2;
        T[] tArr = this.f18271e;
        int i = this.f18268b;
        int c = m25145c(t.hashCode()) & i;
        T t3 = tArr[c];
        if (t3 == null) {
            return false;
        }
        if (t3.equals(t)) {
            return mo47168f(c, tArr, i);
        }
        do {
            c = (c + 1) & i;
            t2 = tArr[c];
            if (t2 == null) {
                return false;
            }
        } while (!t2.equals(t));
        return mo47168f(c, tArr, i);
    }

    /* renamed from: f */
    public boolean mo47168f(int i, T[] tArr, int i2) {
        int i3;
        T t;
        this.f18269c--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                t = tArr[i3];
                if (t == null) {
                    tArr[i] = null;
                    return true;
                }
                int c = m25145c(t.hashCode()) & i2;
                if (i <= i3) {
                    if (i >= c || c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= c && c > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            tArr[i] = t;
            i = i3;
        }
    }

    public C9318e(int i, float f) {
        this.f18267a = f;
        int a = C9319f.m25151a(i);
        this.f18268b = a - 1;
        this.f18270d = (int) (f * ((float) a));
        this.f18271e = new Object[a];
    }
}
