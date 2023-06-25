package p040c.p200q.p353b.p355b;

import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.AbstractMap;
import java.util.Map;
import kotlin.UShort;
import p040c.p200q.p353b.p354a.C5850m;

/* renamed from: c.q.b.b.i2 */
/* compiled from: RegularImmutableMap */
public final class C6000i2<K, V> extends ImmutableMap<K, V> {

    /* renamed from: n */
    public static final ImmutableMap<Object, Object> f11559n = new C6000i2((Object) null, new Object[0], 0);
    public static final long serialVersionUID = 0;

    /* renamed from: e */
    public final transient Object f11560e;

    /* renamed from: l */
    public final transient Object[] f11561l;

    /* renamed from: m */
    public final transient int f11562m;

    /* renamed from: c.q.b.b.i2$a */
    /* compiled from: RegularImmutableMap */
    public static class C6001a<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: e */
        public final transient ImmutableMap<K, V> f11563e;

        /* renamed from: l */
        public final transient Object[] f11564l;

        /* renamed from: m */
        public final transient int f11565m;

        /* renamed from: n */
        public final transient int f11566n;

        /* renamed from: c.q.b.b.i2$a$a */
        /* compiled from: RegularImmutableMap */
        public class C6002a extends ImmutableList<Map.Entry<K, V>> {
            public C6002a() {
            }

            /* renamed from: c */
            public Map.Entry<K, V> get(int i) {
                C5850m.m16592m(i, C6001a.this.f11566n);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(C6001a.this.f11564l[C6001a.this.f11565m + i2], C6001a.this.f11564l[i2 + (C6001a.this.f11565m ^ 1)]);
            }

            public boolean isPartialView() {
                return true;
            }

            public int size() {
                return C6001a.this.f11566n;
            }
        }

        public C6001a(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f11563e = immutableMap;
            this.f11564l = objArr;
            this.f11565m = i;
            this.f11566n = i2;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f11563e.get(key))) {
                return false;
            }
            return true;
        }

        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new C6002a();
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f11566n;
        }

        public C5991h3<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* renamed from: c.q.b.b.i2$b */
    /* compiled from: RegularImmutableMap */
    public static final class C6003b<K> extends ImmutableSet<K> {

        /* renamed from: e */
        public final transient ImmutableMap<K, ?> f11568e;

        /* renamed from: l */
        public final transient ImmutableList<K> f11569l;

        public C6003b(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f11568e = immutableMap;
            this.f11569l = immutableList;
        }

        public ImmutableList<K> asList() {
            return this.f11569l;
        }

        public boolean contains(Object obj) {
            return this.f11568e.get(obj) != null;
        }

        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f11568e.size();
        }

        public C5991h3<K> iterator() {
            return asList().iterator();
        }
    }

    /* renamed from: c.q.b.b.i2$c */
    /* compiled from: RegularImmutableMap */
    public static final class C6004c extends ImmutableList<Object> {

        /* renamed from: e */
        public final transient Object[] f11570e;

        /* renamed from: l */
        public final transient int f11571l;

        /* renamed from: m */
        public final transient int f11572m;

        public C6004c(Object[] objArr, int i, int i2) {
            this.f11570e = objArr;
            this.f11571l = i;
            this.f11572m = i2;
        }

        public Object get(int i) {
            C5850m.m16592m(i, this.f11572m);
            return this.f11570e[(i * 2) + this.f11571l];
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f11572m;
        }
    }

    public C6000i2(Object obj, Object[] objArr, int i) {
        this.f11560e = obj;
        this.f11561l = objArr;
        this.f11562m = i;
    }

    /* renamed from: a */
    public static <K, V> C6000i2<K, V> m16901a(int i, Object[] objArr) {
        if (i == 0) {
            return (C6000i2) f11559n;
        }
        if (i == 1) {
            C6166v.m17275a(objArr[0], objArr[1]);
            return new C6000i2<>((Object) null, objArr, 1);
        }
        C5850m.m16597r(i, objArr.length >> 1);
        return new C6000i2<>(m16902b(objArr, i, ImmutableSet.chooseTableSize(i), 0), objArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b0, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m16902b(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto L_0x000e
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            p040c.p200q.p353b.p355b.C6166v.m17275a(r10, r9)
            r9 = 0
            return r9
        L_0x000e:
            int r0 = r11 + -1
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L_0x0050
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x001b:
            if (r2 >= r10) goto L_0x004f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            p040c.p200q.p353b.p355b.C6166v.m17275a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = p040c.p200q.p353b.p355b.C6204z0.m17452c(r5)
        L_0x0031:
            r5 = r5 & r0
            byte r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x003f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x001b
        L_0x003f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x004a
            int r5 = r5 + 1
            goto L_0x0031
        L_0x004a:
            java.lang.IllegalArgumentException r9 = m16903c(r3, r4, r9, r6)
            throw r9
        L_0x004f:
            return r11
        L_0x0050:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L_0x0090
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x005a:
            if (r2 >= r10) goto L_0x008f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            p040c.p200q.p353b.p355b.C6166v.m17275a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = p040c.p200q.p353b.p355b.C6204z0.m17452c(r5)
        L_0x0070:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x007f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x005a
        L_0x007f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x008a
            int r5 = r5 + 1
            goto L_0x0070
        L_0x008a:
            java.lang.IllegalArgumentException r9 = m16903c(r3, r4, r9, r6)
            throw r9
        L_0x008f:
            return r11
        L_0x0090:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0095:
            if (r2 >= r10) goto L_0x00c5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            p040c.p200q.p353b.p355b.C6166v.m17275a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = p040c.p200q.p353b.p355b.C6204z0.m17452c(r6)
        L_0x00ab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto L_0x00b5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L_0x0095
        L_0x00b5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00c0
            int r6 = r6 + 1
            goto L_0x00ab
        L_0x00c0:
            java.lang.IllegalArgumentException r9 = m16903c(r4, r5, r9, r7)
            throw r9
        L_0x00c5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p353b.p355b.C6000i2.m16902b(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: c */
    public static IllegalArgumentException m16903c(Object obj, Object obj2, Object[] objArr, int i) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + obj2 + " and " + objArr[i] + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + objArr[i ^ 1]);
    }

    /* renamed from: d */
    public static Object m16904d(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (objArr[i2].equals(obj2)) {
                return objArr[i2 ^ 1];
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int c = C6204z0.m17452c(obj2.hashCode());
                while (true) {
                    int i3 = c & length;
                    byte b = bArr[i3] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (objArr[b].equals(obj2)) {
                        return objArr[b ^ 1];
                    }
                    c = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int c2 = C6204z0.m17452c(obj2.hashCode());
                while (true) {
                    int i4 = c2 & length2;
                    short s = sArr[i4] & UShort.MAX_VALUE;
                    if (s == 65535) {
                        return null;
                    }
                    if (objArr[s].equals(obj2)) {
                        return objArr[s ^ 1];
                    }
                    c2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int c3 = C6204z0.m17452c(obj2.hashCode());
                while (true) {
                    int i5 = c3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (objArr[i6].equals(obj2)) {
                        return objArr[i6 ^ 1];
                    }
                    c3 = i5 + 1;
                }
            }
        }
    }

    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new C6001a(this, this.f11561l, 0, this.f11562m);
    }

    public ImmutableSet<K> createKeySet() {
        return new C6003b(this, new C6004c(this.f11561l, 0, this.f11562m));
    }

    public ImmutableCollection<V> createValues() {
        return new C6004c(this.f11561l, 1, this.f11562m);
    }

    public V get(Object obj) {
        return m16904d(this.f11560e, this.f11561l, this.f11562m, 0, obj);
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f11562m;
    }
}
