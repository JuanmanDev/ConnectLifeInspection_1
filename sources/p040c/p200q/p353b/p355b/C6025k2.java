package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* renamed from: c.q.b.b.k2 */
/* compiled from: RegularImmutableSet */
public final class C6025k2<E> extends ImmutableSet<E> {

    /* renamed from: p */
    public static final C6025k2<Object> f11592p = new C6025k2(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: e */
    public final transient Object[] f11593e;

    /* renamed from: l */
    public final transient Object[] f11594l;

    /* renamed from: m */
    public final transient int f11595m;

    /* renamed from: n */
    public final transient int f11596n;

    /* renamed from: o */
    public final transient int f11597o;

    public C6025k2(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f11593e = objArr;
        this.f11594l = objArr2;
        this.f11595m = i2;
        this.f11596n = i;
        this.f11597o = i3;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f11594l;
        if (obj == null || objArr == null) {
            return false;
        }
        int d = C6204z0.m17453d(obj);
        while (true) {
            int i = d & this.f11595m;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            d = i + 1;
        }
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.f11593e, 0, objArr, i, this.f11597o);
        return i + this.f11597o;
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(this.f11593e, this.f11597o);
    }

    public int hashCode() {
        return this.f11596n;
    }

    public Object[] internalArray() {
        return this.f11593e;
    }

    public int internalArrayEnd() {
        return this.f11597o;
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f11597o;
    }

    public C5991h3<E> iterator() {
        return asList().iterator();
    }
}
