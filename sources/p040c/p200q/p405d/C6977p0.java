package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.FieldType;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p200q.p405d.C6904e;
import p040c.p200q.p405d.C6917g0;
import p040c.p200q.p405d.C6999y;
import sun.misc.Unsafe;

/* renamed from: c.q.d.p0 */
/* compiled from: MessageSchema */
public final class C6977p0<T> implements C6903d1<T> {

    /* renamed from: r */
    public static final int[] f13347r = new int[0];

    /* renamed from: s */
    public static final Unsafe f13348s = C6961n1.m20331F();

    /* renamed from: a */
    public final int[] f13349a;

    /* renamed from: b */
    public final Object[] f13350b;

    /* renamed from: c */
    public final int f13351c;

    /* renamed from: d */
    public final int f13352d;

    /* renamed from: e */
    public final C6954m0 f13353e;

    /* renamed from: f */
    public final boolean f13354f;

    /* renamed from: g */
    public final boolean f13355g;

    /* renamed from: h */
    public final boolean f13356h;

    /* renamed from: i */
    public final boolean f13357i;

    /* renamed from: j */
    public final int[] f13358j;

    /* renamed from: k */
    public final int f13359k;

    /* renamed from: l */
    public final int f13360l;

    /* renamed from: m */
    public final C6983r0 f13361m;

    /* renamed from: n */
    public final C6899d0 f13362n;

    /* renamed from: o */
    public final C6944j1<?, ?> f13363o;

    /* renamed from: p */
    public final C6979q<?> f13364p;

    /* renamed from: q */
    public final C6930h0 f13365q;

    /* renamed from: c.q.d.p0$a */
    /* compiled from: MessageSchema */
    public static /* synthetic */ class C6978a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13366a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13366a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f13366a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.C6978a.<clinit>():void");
        }
    }

    public C6977p0(int[] iArr, Object[] objArr, int i, int i2, C6954m0 m0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C6983r0 r0Var, C6899d0 d0Var, C6944j1<?, ?> j1Var, C6979q<?> qVar, C6930h0 h0Var) {
        this.f13349a = iArr;
        this.f13350b = objArr;
        this.f13351c = i;
        this.f13352d = i2;
        this.f13355g = m0Var instanceof GeneratedMessageLite;
        this.f13356h = z;
        this.f13354f = qVar != null && qVar.mo32332e(m0Var);
        this.f13357i = z2;
        this.f13358j = iArr2;
        this.f13359k = i3;
        this.f13360l = i4;
        this.f13361m = r0Var;
        this.f13362n = d0Var;
        this.f13363o = j1Var;
        this.f13364p = qVar;
        this.f13353e = m0Var;
        this.f13365q = h0Var;
    }

    /* renamed from: A */
    public static boolean m20509A(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: D */
    public static boolean m20510D(Object obj, int i, C6903d1 d1Var) {
        return d1Var.mo31885d(C6961n1.m20330E(obj, m20517U(i)));
    }

    /* renamed from: I */
    public static boolean m20511I(int i) {
        return (i & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
    }

    /* renamed from: J */
    public static List<?> m20512J(Object obj, long j) {
        return (List) C6961n1.m20330E(obj, j);
    }

    /* renamed from: K */
    public static <T> long m20513K(T t, long j) {
        return C6961n1.m20328C(t, j);
    }

    /* renamed from: Q */
    public static <T> C6977p0<T> m20514Q(Class<T> cls, C6947k0 k0Var, C6983r0 r0Var, C6899d0 d0Var, C6944j1<?, ?> j1Var, C6979q<?> qVar, C6930h0 h0Var) {
        if (k0Var instanceof C6887a1) {
            return m20516S((C6887a1) k0Var, r0Var, d0Var, j1Var, qVar, h0Var);
        }
        return m20515R((C6931h1) k0Var, r0Var, d0Var, j1Var, qVar, h0Var);
    }

    /* renamed from: R */
    public static <T> C6977p0<T> m20515R(C6931h1 h1Var, C6983r0 r0Var, C6899d0 d0Var, C6944j1<?, ?> j1Var, C6979q<?> qVar, C6930h0 h0Var) {
        int i;
        int i2;
        int i3;
        boolean z = h1Var.mo31753c() == ProtoSyntax.PROTO3;
        C6986t[] e = h1Var.mo32018e();
        if (e.length == 0) {
            i2 = 0;
            i = 0;
        } else {
            i2 = e[0].mo32346g();
            i = e[e.length - 1].mo32346g();
        }
        int length = e.length;
        int[] iArr = new int[(length * 3)];
        Object[] objArr = new Object[(length * 2)];
        int i4 = 0;
        int i5 = 0;
        for (C6986t tVar : e) {
            if (tVar.mo32352n() == FieldType.MAP) {
                i4++;
            } else if (tVar.mo32352n().mo37956id() >= 18 && tVar.mo32352n().mo37956id() <= 49) {
                i5++;
            }
        }
        int[] iArr2 = null;
        int[] iArr3 = i4 > 0 ? new int[i4] : null;
        if (i5 > 0) {
            iArr2 = new int[i5];
        }
        int[] d = h1Var.mo32017d();
        if (d == null) {
            d = f13347r;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < e.length) {
            C6986t tVar2 = e[i6];
            int g = tVar2.mo32346g();
            m20526q0(tVar2, iArr, i7, z, objArr);
            if (i8 < d.length && d[i8] == g) {
                d[i8] = i7;
                i8++;
            }
            if (tVar2.mo32352n() == FieldType.MAP) {
                iArr3[i9] = i7;
                i9++;
            } else if (tVar2.mo32352n().mo37956id() >= 18 && tVar2.mo32352n().mo37956id() <= 49) {
                i3 = i7;
                iArr2[i10] = (int) C6961n1.m20334I(tVar2.mo32345e());
                i10++;
                i6++;
                i7 = i3 + 3;
            }
            i3 = i7;
            i6++;
            i7 = i3 + 3;
        }
        if (iArr3 == null) {
            iArr3 = f13347r;
        }
        if (iArr2 == null) {
            iArr2 = f13347r;
        }
        int[] iArr4 = new int[(d.length + iArr3.length + iArr2.length)];
        System.arraycopy(d, 0, iArr4, 0, d.length);
        System.arraycopy(iArr3, 0, iArr4, d.length, iArr3.length);
        System.arraycopy(iArr2, 0, iArr4, d.length + iArr3.length, iArr2.length);
        return new C6977p0(iArr, objArr, i2, i, h1Var.mo31752b(), z, true, iArr4, d.length, d.length + iArr3.length, r0Var, d0Var, j1Var, qVar, h0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0391  */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p040c.p200q.p405d.C6977p0<T> m20516S(p040c.p200q.p405d.C6887a1 r36, p040c.p200q.p405d.C6983r0 r37, p040c.p200q.p405d.C6899d0 r38, p040c.p200q.p405d.C6944j1<?, ?> r39, p040c.p200q.p405d.C6979q<?> r40, p040c.p200q.p405d.C6930h0 r41) {
        /*
            com.google.protobuf.ProtoSyntax r0 = r36.mo31753c()
            com.google.protobuf.ProtoSyntax r1 = com.google.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r36.mo31755e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f13347r
            r9 = r2
            r11 = r9
            r12 = r11
            r14 = r12
            r15 = r14
            r13 = r8
            r8 = r15
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = f13348s
            java.lang.Object[] r18 = r36.mo31754d()
            c.q.d.m0 r19 = r36.mo31752b()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e9
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b0
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m20524m0(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r6 = (int) r6
            int r15 = r15 + 1
            r7 = r18[r15]
            boolean r9 = r7 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L_0x029d
        L_0x0295:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m20524m0(r3, r7)
            r18[r15] = r7
        L_0x029d:
            r9 = r6
            long r6 = r5.objectFieldOffset(r7)
            int r6 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r3 = r6
            r6 = r9
            r9 = r10
            r7 = r33
            r15 = 0
            goto L_0x03ae
        L_0x02b0:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m20524m0(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0325
            r14 = 17
            if (r10 != r14) goto L_0x02c8
            goto L_0x0325
        L_0x02c8:
            r14 = 27
            if (r10 == r14) goto L_0x0315
            if (r10 != r9) goto L_0x02cf
            goto L_0x0315
        L_0x02cf:
            r14 = 12
            if (r10 == r14) goto L_0x0304
            r14 = 30
            if (r10 == r14) goto L_0x0304
            r14 = 44
            if (r10 != r14) goto L_0x02dc
            goto L_0x0304
        L_0x02dc:
            r14 = 50
            if (r10 != r14) goto L_0x0302
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fd
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0331
        L_0x02fd:
            r23 = r14
            r6 = r27
            goto L_0x0331
        L_0x0302:
            r9 = 1
            goto L_0x0331
        L_0x0304:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0331
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0321
        L_0x0315:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0321:
            r14 = r10
            r6 = r20
            goto L_0x0332
        L_0x0325:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0331:
            r14 = r10
        L_0x0332:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0391
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038b
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0367
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0350:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0362
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0350
        L_0x0362:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0367:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0378
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0380
        L_0x0378:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m20524m0(r3, r10)
            r18[r19] = r10
        L_0x0380:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r3 = (int) r3
            int r15 = r15 % 32
            goto L_0x039a
        L_0x038b:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0397
        L_0x0391:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0397:
            r14 = r15
            r3 = 0
            r15 = 0
        L_0x039a:
            r4 = 18
            if (r9 < r4) goto L_0x03a8
            r4 = 49
            if (r9 > r4) goto L_0x03a8
            int r4 = r24 + 1
            r13[r24] = r7
            r24 = r4
        L_0x03a8:
            r35 = r14
            r14 = r6
            r6 = r7
            r7 = r35
        L_0x03ae:
            int r4 = r22 + 1
            r11[r22] = r34
            int r10 = r4 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03bd
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03be
        L_0x03bd:
            r0 = 0
        L_0x03be:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c5
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c6
        L_0x03c5:
            r1 = 0
        L_0x03c6:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r6
            r11[r4] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r3
            r11[r10] = r1
            r6 = r11
            r3 = r19
            r4 = r22
            r11 = r25
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r0 = r32
            goto L_0x0196
        L_0x03e9:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            c.q.d.p0 r0 = new c.q.d.p0
            c.q.d.m0 r9 = r36.mo31752b()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.m20516S(c.q.d.a1, c.q.d.r0, c.q.d.d0, c.q.d.j1, c.q.d.q, c.q.d.h0):c.q.d.p0");
    }

    /* renamed from: U */
    public static long m20517U(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: V */
    public static <T> boolean m20518V(T t, long j) {
        return ((Boolean) C6961n1.m20330E(t, j)).booleanValue();
    }

    /* renamed from: W */
    public static <T> double m20519W(T t, long j) {
        return ((Double) C6961n1.m20330E(t, j)).doubleValue();
    }

    /* renamed from: X */
    public static <T> float m20520X(T t, long j) {
        return ((Float) C6961n1.m20330E(t, j)).floatValue();
    }

    /* renamed from: Y */
    public static <T> int m20521Y(T t, long j) {
        return ((Integer) C6961n1.m20330E(t, j)).intValue();
    }

    /* renamed from: Z */
    public static <T> long m20522Z(T t, long j) {
        return ((Long) C6961n1.m20330E(t, j)).longValue();
    }

    /* renamed from: k */
    public static <T> boolean m20523k(T t, long j) {
        return C6961n1.m20365r(t, j);
    }

    /* renamed from: m0 */
    public static Field m20524m0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: n */
    public static <T> double m20525n(T t, long j) {
        return C6961n1.m20372y(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c5  */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20526q0(p040c.p200q.p405d.C6986t r8, int[] r9, int r10, boolean r11, java.lang.Object[] r12) {
        /*
            c.q.d.v0 r0 = r8.mo32349j()
            r1 = 0
            if (r0 == 0) goto L_0x0027
            com.google.protobuf.FieldType r11 = r8.mo32352n()
            int r11 = r11.mo37956id()
            int r11 = r11 + 51
            java.lang.reflect.Field r2 = r0.mo32407b()
            long r2 = p040c.p200q.p405d.C6961n1.m20334I(r2)
            int r2 = (int) r2
            java.lang.reflect.Field r0 = r0.mo32406a()
            long r3 = p040c.p200q.p405d.C6961n1.m20334I(r0)
            int r0 = (int) r3
        L_0x0023:
            r3 = r2
            r2 = r0
            r0 = r1
            goto L_0x0073
        L_0x0027:
            com.google.protobuf.FieldType r0 = r8.mo32352n()
            java.lang.reflect.Field r2 = r8.mo32345e()
            long r2 = p040c.p200q.p405d.C6961n1.m20334I(r2)
            int r2 = (int) r2
            int r3 = r0.mo37956id()
            if (r11 != 0) goto L_0x005d
            boolean r11 = r0.isList()
            if (r11 != 0) goto L_0x005d
            boolean r11 = r0.isMap()
            if (r11 != 0) goto L_0x005d
            java.lang.reflect.Field r11 = r8.mo32350k()
            long r4 = p040c.p200q.p405d.C6961n1.m20334I(r11)
            int r0 = (int) r4
            int r11 = r8.mo32351m()
            int r11 = java.lang.Integer.numberOfTrailingZeros(r11)
            r7 = r0
            r0 = r11
            r11 = r3
            r3 = r2
            r2 = r7
            goto L_0x0073
        L_0x005d:
            java.lang.reflect.Field r11 = r8.mo32343c()
            if (r11 != 0) goto L_0x0068
            r0 = r1
            r11 = r3
            r3 = r2
            r2 = r0
            goto L_0x0073
        L_0x0068:
            java.lang.reflect.Field r11 = r8.mo32343c()
            long r4 = p040c.p200q.p405d.C6961n1.m20334I(r11)
            int r0 = (int) r4
            r11 = r3
            goto L_0x0023
        L_0x0073:
            int r4 = r8.mo32346g()
            r9[r10] = r4
            int r4 = r10 + 1
            boolean r5 = r8.mo32353o()
            if (r5 == 0) goto L_0x0084
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0085
        L_0x0084:
            r5 = r1
        L_0x0085:
            boolean r6 = r8.mo32354q()
            if (r6 == 0) goto L_0x008d
            r1 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x008d:
            r1 = r1 | r5
            int r11 = r11 << 20
            r11 = r11 | r1
            r11 = r11 | r3
            r9[r4] = r11
            int r11 = r10 + 2
            int r0 = r0 << 20
            r0 = r0 | r2
            r9[r11] = r0
            java.lang.Class r9 = r8.mo32348i()
            java.lang.Object r11 = r8.mo32347h()
            if (r11 == 0) goto L_0x00c5
            int r10 = r10 / 3
            int r10 = r10 * 2
            java.lang.Object r11 = r8.mo32347h()
            r12[r10] = r11
            if (r9 == 0) goto L_0x00b6
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00e2
        L_0x00b6:
            c.q.d.y$e r9 = r8.mo32344d()
            if (r9 == 0) goto L_0x00e2
            int r10 = r10 + 1
            c.q.d.y$e r8 = r8.mo32344d()
            r12[r10] = r8
            goto L_0x00e2
        L_0x00c5:
            if (r9 == 0) goto L_0x00d0
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            r12[r10] = r9
            goto L_0x00e2
        L_0x00d0:
            c.q.d.y$e r9 = r8.mo32344d()
            if (r9 == 0) goto L_0x00e2
            int r10 = r10 / 3
            int r10 = r10 * 2
            int r10 = r10 + 1
            c.q.d.y$e r8 = r8.mo32344d()
            r12[r10] = r8
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.m20526q0(c.q.d.t, int[], int, boolean, java.lang.Object[]):void");
    }

    /* renamed from: r */
    public static <T> float m20527r(T t, long j) {
        return C6961n1.m20373z(t, j);
    }

    /* renamed from: r0 */
    public static int m20528r0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: v */
    public static C6948k1 m20529v(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C6948k1 k1Var = generatedMessageLite.f15527l;
        if (k1Var != C6948k1.m20192e()) {
            return k1Var;
        }
        C6948k1 l = C6948k1.m20196l();
        generatedMessageLite.f15527l = l;
        return l;
    }

    /* renamed from: z */
    public static <T> int m20530z(T t, long j) {
        return C6961n1.m20326A(t, j);
    }

    /* renamed from: B */
    public final boolean mo32282B(T t, int i) {
        if (this.f13356h) {
            int s0 = mo32316s0(i);
            long U = m20517U(s0);
            switch (m20528r0(s0)) {
                case 0:
                    if (C6961n1.m20372y(t, U) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C6961n1.m20373z(t, U) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C6961n1.m20328C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C6961n1.m20328C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C6961n1.m20326A(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C6961n1.m20328C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C6961n1.m20326A(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C6961n1.m20365r(t, U);
                case 8:
                    Object E = C6961n1.m20330E(t, U);
                    if (E instanceof String) {
                        return !((String) E).isEmpty();
                    }
                    if (E instanceof ByteString) {
                        return !ByteString.EMPTY.equals(E);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C6961n1.m20330E(t, U) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !ByteString.EMPTY.equals(C6961n1.m20330E(t, U));
                case 11:
                    if (C6961n1.m20326A(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C6961n1.m20326A(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C6961n1.m20326A(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C6961n1.m20328C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C6961n1.m20326A(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C6961n1.m20328C(t, U) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C6961n1.m20330E(t, U) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int h0 = mo32301h0(i);
            if ((C6961n1.m20326A(t, (long) (h0 & 1048575)) & (1 << (h0 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: C */
    public final boolean mo32283C(T t, int i, int i2, int i3) {
        if (this.f13356h) {
            return mo32282B(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: E */
    public final <N> boolean mo32284E(Object obj, int i, int i2) {
        List list = (List) C6961n1.m20330E(obj, m20517U(i));
        if (list.isEmpty()) {
            return true;
        }
        C6903d1 u = mo32319u(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!u.mo31885d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public final boolean mo32285F(T t, int i, int i2) {
        Map<?, ?> h = this.f13365q.mo32016h(C6961n1.m20330E(t, m20517U(i)));
        if (h.isEmpty()) {
            return true;
        }
        if (this.f13365q.mo32011c(mo32317t(i2)).f13239c.getJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        C6903d1<?> d1Var = null;
        for (Object next : h.values()) {
            if (d1Var == null) {
                d1Var = C7009y0.m20722a().mo32432d(next.getClass());
            }
            if (!d1Var.mo31885d(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public final boolean mo32286G(T t, T t2, int i) {
        long h0 = (long) (mo32301h0(i) & 1048575);
        return C6961n1.m20326A(t, h0) == C6961n1.m20326A(t2, h0);
    }

    /* renamed from: H */
    public final boolean mo32287H(T t, int i, int i2) {
        return C6961n1.m20326A(t, (long) (mo32301h0(i2) & 1048575)) == i;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: L */
    public final <UT, UB, ET extends p040c.p200q.p405d.C6988u.C6990b<ET>> void mo32288L(p040c.p200q.p405d.C6944j1<UT, UB> r17, p040c.p200q.p405d.C6979q<ET> r18, T r19, p040c.p200q.p405d.C6890b1 r20, p040c.p200q.p405d.C6975p r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo31779A()     // Catch:{ all -> 0x060f }
            int r3 = r8.mo32299f0(r1)     // Catch:{ all -> 0x060f }
            if (r3 >= 0) goto L_0x008c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f13359k
        L_0x001e:
            int r1 = r8.f13360l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f13358j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo32312p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo32109o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f13354f     // Catch:{ all -> 0x060f }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            c.q.d.m0 r2 = r8.f13353e     // Catch:{ all -> 0x060f }
            r15 = r18
            java.lang.Object r1 = r15.mo32329b(r11, r2, r1)     // Catch:{ all -> 0x060f }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005b
            if (r14 != 0) goto L_0x004c
            c.q.d.u r14 = r18.mo32331d(r19)     // Catch:{ all -> 0x060f }
        L_0x004c:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo32334g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x060f }
            goto L_0x000d
        L_0x005b:
            boolean r1 = r9.mo32111q(r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0068
            boolean r1 = r20.mo31787I()     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0068:
            if (r13 != 0) goto L_0x006e
            java.lang.Object r13 = r9.mo32100f(r10)     // Catch:{ all -> 0x060f }
        L_0x006e:
            boolean r1 = r9.mo32107m(r13, r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0075:
            int r0 = r8.f13359k
        L_0x0077:
            int r1 = r8.f13360l
            if (r0 >= r1) goto L_0x0086
            int[] r1 = r8.f13358j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo32312p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0086:
            if (r13 == 0) goto L_0x008b
            r9.mo32109o(r10, r13)
        L_0x008b:
            return
        L_0x008c:
            r15 = r18
            int r4 = r8.mo32316s0(r3)     // Catch:{ all -> 0x060f }
            int r2 = m20528r0(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            switch(r2) {
                case 0: goto L_0x059b;
                case 1: goto L_0x058b;
                case 2: goto L_0x057b;
                case 3: goto L_0x056b;
                case 4: goto L_0x055b;
                case 5: goto L_0x054b;
                case 6: goto L_0x053b;
                case 7: goto L_0x052b;
                case 8: goto L_0x0523;
                case 9: goto L_0x04ec;
                case 10: goto L_0x04dc;
                case 11: goto L_0x04cc;
                case 12: goto L_0x04a9;
                case 13: goto L_0x0499;
                case 14: goto L_0x0489;
                case 15: goto L_0x0479;
                case 16: goto L_0x0469;
                case 17: goto L_0x0432;
                case 18: goto L_0x0423;
                case 19: goto L_0x0414;
                case 20: goto L_0x0405;
                case 21: goto L_0x03f6;
                case 22: goto L_0x03e7;
                case 23: goto L_0x03d8;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03ba;
                case 26: goto L_0x03b5;
                case 27: goto L_0x03a3;
                case 28: goto L_0x0394;
                case 29: goto L_0x0385;
                case 30: goto L_0x036e;
                case 31: goto L_0x035f;
                case 32: goto L_0x0350;
                case 33: goto L_0x0341;
                case 34: goto L_0x0332;
                case 35: goto L_0x0323;
                case 36: goto L_0x0314;
                case 37: goto L_0x0305;
                case 38: goto L_0x02f6;
                case 39: goto L_0x02e7;
                case 40: goto L_0x02d8;
                case 41: goto L_0x02c9;
                case 42: goto L_0x02ba;
                case 43: goto L_0x02ab;
                case 44: goto L_0x0294;
                case 45: goto L_0x0285;
                case 46: goto L_0x0276;
                case 47: goto L_0x0267;
                case 48: goto L_0x0258;
                case 49: goto L_0x0242;
                case 50: goto L_0x0231;
                case 51: goto L_0x021d;
                case 52: goto L_0x0209;
                case 53: goto L_0x01f5;
                case 54: goto L_0x01e1;
                case 55: goto L_0x01cd;
                case 56: goto L_0x01b9;
                case 57: goto L_0x01a5;
                case 58: goto L_0x0191;
                case 59: goto L_0x0189;
                case 60: goto L_0x0150;
                case 61: goto L_0x0140;
                case 62: goto L_0x012c;
                case 63: goto L_0x0105;
                case 64: goto L_0x00f1;
                case 65: goto L_0x00dd;
                case 66: goto L_0x00c9;
                case 67: goto L_0x00b5;
                case 68: goto L_0x00a1;
                default: goto L_0x0099;
            }     // Catch:{ InvalidWireTypeException -> 0x05c8 }
        L_0x0099:
            if (r13 != 0) goto L_0x05ab
            java.lang.Object r13 = r17.mo32108n()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x05ab
        L_0x00a1:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r2 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.mo31808n(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00b5:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.mo31819w()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00c9:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.mo31818v()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00dd:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.mo31806l()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x00f1:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.mo31788J()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0105:
            int r2 = r20.mo31816t()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.y$e r5 = r8.mo32315s(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x011c
            boolean r5 = r5.mo32429a(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x0116
            goto L_0x011c
        L_0x0116:
            java.lang.Object r13 = p040c.p200q.p405d.C6915f1.m19829L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x011c:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x012c:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.mo31809o()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0140:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.protobuf.ByteString r2 = r20.mo31784F()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0150:
            boolean r2 = r8.mo32287H(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r2 == 0) goto L_0x0172
            long r5 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = p040c.p200q.p405d.C6961n1.m20330E(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r5 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r5 = r0.mo31781C(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = p040c.p200q.p405d.C6999y.m20714h(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x0184
        L_0x0172:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r2 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.mo31781C(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
        L_0x0184:
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0189:
            r8.mo32305k0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0191:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            boolean r2 = r20.mo31804j()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01a5:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.mo31803i()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01b9:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.mo31796c()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01cd:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r2 = r20.mo31786H()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01e1:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.mo31795b()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x01f5:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r6 = r20.mo31791M()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0209:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x021d:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32311o0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0231:
            java.lang.Object r4 = r8.mo32317t(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo32289M(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0242:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r6 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo32302i0(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0258:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31798e(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0267:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31794a(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0276:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31811q(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0285:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31797d(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0294:
            c.q.d.d0 r2 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r2 = r2.mo31881e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31815s(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.y$e r3 = r8.mo32315s(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r13 = p040c.p200q.p405d.C6915f1.m19818A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02ab:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31800g(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02ba:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31820x(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02c9:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31817u(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02d8:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31793O(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02e7:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31812r(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x02f6:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31807m(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0305:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31810p(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0314:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31785G(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0323:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31790L(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0332:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31798e(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0341:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31794a(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0350:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31811q(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x035f:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31797d(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x036e:
            c.q.d.d0 r2 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r2 = r2.mo31881e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31815s(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.y$e r3 = r8.mo32315s(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r13 = p040c.p200q.p405d.C6915f1.m19818A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0385:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31800g(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0394:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31789K(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03a3:
            c.q.d.d1 r5 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo32304j0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03b5:
            r8.mo32307l0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03ba:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31820x(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03c9:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31817u(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03d8:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31793O(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03e7:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31812r(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x03f6:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31807m(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0405:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31810p(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0414:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31785G(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0423:
            c.q.d.d0 r1 = r8.f13362n     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.util.List r1 = r1.mo31881e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r0.mo31790L(r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0432:
            boolean r1 = r8.mo32282B(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r1 == 0) goto L_0x0455
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = p040c.p200q.p405d.C6961n1.m20330E(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r2 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.mo31808n(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = p040c.p200q.p405d.C6999y.m20714h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0455:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r4 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r4 = r0.mo31808n(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0469:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.mo31819w()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20344S(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0479:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.mo31818v()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20343R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0489:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.mo31806l()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20344S(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0499:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.mo31788J()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20343R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04a9:
            int r2 = r20.mo31816t()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.y$e r5 = r8.mo32315s(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x04c0
            boolean r5 = r5.mo32429a(r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r5 == 0) goto L_0x04ba
            goto L_0x04c0
        L_0x04ba:
            java.lang.Object r13 = p040c.p200q.p405d.C6915f1.m19829L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04c0:
            long r4 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20343R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04cc:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.mo31809o()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20343R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04dc:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            com.google.protobuf.ByteString r4 = r20.mo31784F()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x04ec:
            boolean r1 = r8.mo32282B(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r1 == 0) goto L_0x050f
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = p040c.p200q.p405d.C6961n1.m20330E(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r2 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r2 = r0.mo31781C(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r1 = p040c.p200q.p405d.C6999y.m20714h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r2 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x050f:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            c.q.d.d1 r4 = r8.mo32319u(r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            java.lang.Object r4 = r0.mo31781C(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20345T(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x0523:
            r8.mo32305k0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x052b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            boolean r4 = r20.mo31804j()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20335J(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x053b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.mo31803i()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20343R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x054b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.mo31796c()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20344S(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x055b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            int r4 = r20.mo31786H()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20343R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x056b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.mo31795b()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20344S(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x057b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            long r4 = r20.mo31791M()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20344S(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x058b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20342Q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x059b:
            long r1 = m20517U(r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            p040c.p200q.p405d.C6961n1.m20341P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            r8.mo32309n0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            goto L_0x000d
        L_0x05ab:
            boolean r1 = r9.mo32107m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05c8 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f13359k
        L_0x05b3:
            int r1 = r8.f13360l
            if (r0 >= r1) goto L_0x05c2
            int[] r1 = r8.f13358j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo32312p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b3
        L_0x05c2:
            if (r13 == 0) goto L_0x05c7
            r9.mo32109o(r10, r13)
        L_0x05c7:
            return
        L_0x05c8:
            boolean r1 = r9.mo32111q(r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x05eb
            boolean r1 = r20.mo31787I()     // Catch:{ all -> 0x060f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f13359k
        L_0x05d6:
            int r1 = r8.f13360l
            if (r0 >= r1) goto L_0x05e5
            int[] r1 = r8.f13358j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo32312p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d6
        L_0x05e5:
            if (r13 == 0) goto L_0x05ea
            r9.mo32109o(r10, r13)
        L_0x05ea:
            return
        L_0x05eb:
            if (r13 != 0) goto L_0x05f2
            java.lang.Object r1 = r9.mo32100f(r10)     // Catch:{ all -> 0x060f }
            r13 = r1
        L_0x05f2:
            boolean r1 = r9.mo32107m(r13, r0)     // Catch:{ all -> 0x060f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f13359k
        L_0x05fa:
            int r1 = r8.f13360l
            if (r0 >= r1) goto L_0x0609
            int[] r1 = r8.f13358j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo32312p(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fa
        L_0x0609:
            if (r13 == 0) goto L_0x060e
            r9.mo32109o(r10, r13)
        L_0x060e:
            return
        L_0x060f:
            r0 = move-exception
            int r1 = r8.f13359k
        L_0x0612:
            int r2 = r8.f13360l
            if (r1 >= r2) goto L_0x0621
            int[] r2 = r8.f13358j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo32312p(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0612
        L_0x0621:
            if (r13 == 0) goto L_0x0626
            r9.mo32109o(r10, r13)
        L_0x0626:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32288L(c.q.d.j1, c.q.d.q, java.lang.Object, c.q.d.b1, c.q.d.p):void");
    }

    /* renamed from: M */
    public final <K, V> void mo32289M(Object obj, int i, Object obj2, C6975p pVar, C6890b1 b1Var) {
        long U = m20517U(mo32316s0(i));
        Object E = C6961n1.m20330E(obj, U);
        if (E == null) {
            E = this.f13365q.mo32013e(obj2);
            C6961n1.m20345T(obj, U, E);
        } else if (this.f13365q.mo32015g(E)) {
            Object e = this.f13365q.mo32013e(obj2);
            this.f13365q.mo32009a(e, E);
            C6961n1.m20345T(obj, U, e);
            E = e;
        }
        b1Var.mo31782D(this.f13365q.mo32012d(E), this.f13365q.mo32011c(obj2), pVar);
    }

    /* renamed from: N */
    public final void mo32290N(T t, T t2, int i) {
        long U = m20517U(mo32316s0(i));
        if (mo32282B(t2, i)) {
            Object E = C6961n1.m20330E(t, U);
            Object E2 = C6961n1.m20330E(t2, U);
            if (E != null && E2 != null) {
                C6961n1.m20345T(t, U, C6999y.m20714h(E, E2));
                mo32309n0(t, i);
            } else if (E2 != null) {
                C6961n1.m20345T(t, U, E2);
                mo32309n0(t, i);
            }
        }
    }

    /* renamed from: O */
    public final void mo32291O(T t, T t2, int i) {
        int s0 = mo32316s0(i);
        int T = mo32293T(i);
        long U = m20517U(s0);
        if (mo32287H(t2, T, i)) {
            Object E = C6961n1.m20330E(t, U);
            Object E2 = C6961n1.m20330E(t2, U);
            if (E != null && E2 != null) {
                C6961n1.m20345T(t, U, C6999y.m20714h(E, E2));
                mo32311o0(t, T, i);
            } else if (E2 != null) {
                C6961n1.m20345T(t, U, E2);
                mo32311o0(t, T, i);
            }
        }
    }

    /* renamed from: P */
    public final void mo32292P(T t, T t2, int i) {
        int s0 = mo32316s0(i);
        long U = m20517U(s0);
        int T = mo32293T(i);
        switch (m20528r0(s0)) {
            case 0:
                if (mo32282B(t2, i)) {
                    C6961n1.m20341P(t, U, C6961n1.m20372y(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 1:
                if (mo32282B(t2, i)) {
                    C6961n1.m20342Q(t, U, C6961n1.m20373z(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 2:
                if (mo32282B(t2, i)) {
                    C6961n1.m20344S(t, U, C6961n1.m20328C(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 3:
                if (mo32282B(t2, i)) {
                    C6961n1.m20344S(t, U, C6961n1.m20328C(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 4:
                if (mo32282B(t2, i)) {
                    C6961n1.m20343R(t, U, C6961n1.m20326A(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 5:
                if (mo32282B(t2, i)) {
                    C6961n1.m20344S(t, U, C6961n1.m20328C(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 6:
                if (mo32282B(t2, i)) {
                    C6961n1.m20343R(t, U, C6961n1.m20326A(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 7:
                if (mo32282B(t2, i)) {
                    C6961n1.m20335J(t, U, C6961n1.m20365r(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 8:
                if (mo32282B(t2, i)) {
                    C6961n1.m20345T(t, U, C6961n1.m20330E(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 9:
                mo32290N(t, t2, i);
                return;
            case 10:
                if (mo32282B(t2, i)) {
                    C6961n1.m20345T(t, U, C6961n1.m20330E(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 11:
                if (mo32282B(t2, i)) {
                    C6961n1.m20343R(t, U, C6961n1.m20326A(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 12:
                if (mo32282B(t2, i)) {
                    C6961n1.m20343R(t, U, C6961n1.m20326A(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 13:
                if (mo32282B(t2, i)) {
                    C6961n1.m20343R(t, U, C6961n1.m20326A(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 14:
                if (mo32282B(t2, i)) {
                    C6961n1.m20344S(t, U, C6961n1.m20328C(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 15:
                if (mo32282B(t2, i)) {
                    C6961n1.m20343R(t, U, C6961n1.m20326A(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 16:
                if (mo32282B(t2, i)) {
                    C6961n1.m20344S(t, U, C6961n1.m20328C(t2, U));
                    mo32309n0(t, i);
                    return;
                }
                return;
            case 17:
                mo32290N(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f13362n.mo31880d(t, t2, U);
                return;
            case 50:
                C6915f1.m19823F(this.f13365q, t, t2, U);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (mo32287H(t2, T, i)) {
                    C6961n1.m20345T(t, U, C6961n1.m20330E(t2, U));
                    mo32311o0(t, T, i);
                    return;
                }
                return;
            case 60:
                mo32291O(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (mo32287H(t2, T, i)) {
                    C6961n1.m20345T(t, U, C6961n1.m20330E(t2, U));
                    mo32311o0(t, T, i);
                    return;
                }
                return;
            case 68:
                mo32291O(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: T */
    public final int mo32293T(int i) {
        return this.f13349a[i];
    }

    /* renamed from: a */
    public void mo31882a(T t, T t2) {
        if (t2 != null) {
            for (int i = 0; i < this.f13349a.length; i += 3) {
                mo32292P(t, t2, i);
            }
            C6915f1.m19824G(this.f13363o, t, t2);
            if (this.f13354f) {
                C6915f1.m19822E(this.f13364p, t, t2);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a0 */
    public final <K, V> int mo32294a0(T t, byte[] bArr, int i, int i2, int i3, long j, C6904e.C6906b bVar) {
        T t2 = t;
        long j2 = j;
        Unsafe unsafe = f13348s;
        int i4 = i3;
        Object t3 = mo32317t(i3);
        Object object = unsafe.getObject(t, j2);
        if (this.f13365q.mo32015g(object)) {
            Object e = this.f13365q.mo32013e(t3);
            this.f13365q.mo32009a(e, object);
            unsafe.putObject(t, j2, e);
            object = e;
        }
        return mo32306l(bArr, i, i2, this.f13365q.mo32011c(t3), this.f13365q.mo32012d(object), bVar);
    }

    /* renamed from: b */
    public void mo31883b(T t, Writer writer) {
        if (writer.mo32166l() == Writer.FieldOrder.DESCENDING) {
            mo32321v0(t, writer);
        } else if (this.f13356h) {
            mo32320u0(t, writer);
        } else {
            mo32318t0(t, writer);
        }
    }

    /* renamed from: b0 */
    public final int mo32295b0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C6904e.C6906b bVar) {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C6904e.C6906b bVar2 = bVar;
        Unsafe unsafe = f13348s;
        long j3 = (long) (this.f13349a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(C6904e.m19707d(bArr, i)));
                    int i14 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i14;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(C6904e.m19715l(bArr, i)));
                    int i15 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i15;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int L = C6904e.m19701L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(bVar2.f13211b));
                    unsafe.putInt(t2, j3, i11);
                    return L;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int I = C6904e.m19698I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(bVar2.f13210a));
                    unsafe.putInt(t2, j3, i11);
                    return I;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C6904e.m19713j(bArr, i)));
                    int i16 = i9 + 8;
                    unsafe.putInt(t2, j3, i11);
                    return i16;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C6904e.m19711h(bArr, i)));
                    int i17 = i9 + 4;
                    unsafe.putInt(t2, j3, i11);
                    return i17;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int L2 = C6904e.m19701L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(bVar2.f13211b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return L2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int I2 = C6904e.m19698I(bArr2, i9, bVar2);
                    int i18 = bVar2.f13210a;
                    if (i18 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C6969o1.m20455t(bArr2, I2, I2 + i18)) {
                        unsafe.putObject(t2, j2, new String(bArr2, I2, i18, C6999y.f13392a));
                        I2 += i18;
                    } else {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return I2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int p = C6904e.m19719p(mo32319u(i13), bArr2, i9, i2, bVar2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, bVar2.f13212c);
                    } else {
                        unsafe.putObject(t2, j2, C6999y.m20714h(object, bVar2.f13212c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return p;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int b = C6904e.m19705b(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, bVar2.f13212c);
                    unsafe.putInt(t2, j3, i11);
                    return b;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int I3 = C6904e.m19698I(bArr2, i9, bVar2);
                    int i19 = bVar2.f13210a;
                    C6999y.C7004e s = mo32315s(i13);
                    if (s == null || s.mo32429a(i19)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i19));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m20529v(t).mo32131n(i10, Long.valueOf((long) i19));
                    }
                    return I3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int I4 = C6904e.m19698I(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C6937j.m19961b(bVar2.f13210a)));
                    unsafe.putInt(t2, j3, i11);
                    return I4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int L3 = C6904e.m19701L(bArr2, i9, bVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C6937j.m19962c(bVar2.f13211b)));
                    unsafe.putInt(t2, j3, i11);
                    return L3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int n = C6904e.m19717n(mo32319u(i13), bArr, i, i2, (i10 & -8) | 4, bVar);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, bVar2.f13212c);
                    } else {
                        unsafe.putObject(t2, j2, C6999y.m20714h(object2, bVar2.f13212c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* renamed from: c */
    public void mo31884c(T t) {
        int i;
        int i2 = this.f13359k;
        while (true) {
            i = this.f13360l;
            if (i2 >= i) {
                break;
            }
            long U = m20517U(mo32316s0(this.f13358j[i2]));
            Object E = C6961n1.m20330E(t, U);
            if (E != null) {
                C6961n1.m20345T(t, U, this.f13365q.mo32010b(E));
            }
            i2++;
        }
        int length = this.f13358j.length;
        while (i < length) {
            this.f13362n.mo31879c(t, (long) this.f13358j[i]);
            i++;
        }
        this.f13363o.mo32104j(t);
        if (this.f13354f) {
            this.f13364p.mo32333f(t);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0359, code lost:
        if (r0 != r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03a2, code lost:
        if (r0 != r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03c5, code lost:
        if (r0 != r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03c8, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fc, code lost:
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0162, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0205, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r3 = r13;
        r1 = r17;
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022f, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0269, code lost:
        r6 = r6 | r20;
        r2 = r8;
        r0 = r11;
        r3 = r13;
        r1 = r17;
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0272, code lost:
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a8, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02aa, code lost:
        r6 = r6 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02ac, code lost:
        r11 = r35;
        r2 = r8;
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b4, code lost:
        r0 = r35;
        r22 = r6;
        r19 = r7;
        r20 = r8;
        r28 = r10;
        r2 = r11;
        r8 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03fe  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo32296c0(T r31, byte[] r32, int r33, int r34, int r35, p040c.p200q.p405d.C6904e.C6906b r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f13348s
            r16 = 0
            r0 = r33
            r2 = r16
            r3 = r2
            r6 = r3
            r1 = -1
            r7 = -1
        L_0x0018:
            if (r0 >= r13) goto L_0x0421
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = p040c.p200q.p405d.C6904e.m19697H(r0, r12, r3, r9)
            int r3 = r9.f13210a
            r4 = r0
            r5 = r3
            goto L_0x002b
        L_0x0029:
            r5 = r0
            r4 = r3
        L_0x002b:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r8 = 3
            if (r3 <= r1) goto L_0x0038
            int r2 = r2 / r8
            int r1 = r15.mo32300g0(r3, r2)
            goto L_0x003c
        L_0x0038:
            int r1 = r15.mo32299f0(r3)
        L_0x003c:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x004f
            r17 = r3
            r2 = r4
            r8 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r0 = r11
            r20 = r16
            goto L_0x03cd
        L_0x004f:
            int[] r1 = r15.f13349a
            int r18 = r2 + 1
            r1 = r1[r18]
            int r8 = m20528r0(r1)
            long r11 = m20517U(r1)
            r18 = r5
            r5 = 17
            r19 = r1
            if (r8 > r5) goto L_0x02c2
            int[] r5 = r15.f13349a
            int r20 = r2 + 2
            r5 = r5[r20]
            int r20 = r5 >>> 20
            r1 = 1
            int r20 = r1 << r20
            r22 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r22
            if (r5 == r7) goto L_0x0087
            r13 = -1
            r17 = r2
            if (r7 == r13) goto L_0x0080
            long r1 = (long) r7
            r10.putInt(r14, r1, r6)
        L_0x0080:
            long r1 = (long) r5
            int r6 = r10.getInt(r14, r1)
            r7 = r5
            goto L_0x008a
        L_0x0087:
            r17 = r2
            r13 = -1
        L_0x008a:
            r1 = 5
            switch(r8) {
                case 0: goto L_0x0290;
                case 1: goto L_0x0276;
                case 2: goto L_0x024d;
                case 3: goto L_0x024d;
                case 4: goto L_0x0232;
                case 5: goto L_0x020e;
                case 6: goto L_0x01eb;
                case 7: goto L_0x01c6;
                case 8: goto L_0x019f;
                case 9: goto L_0x0167;
                case 10: goto L_0x014b;
                case 11: goto L_0x0232;
                case 12: goto L_0x011a;
                case 13: goto L_0x01eb;
                case 14: goto L_0x020e;
                case 15: goto L_0x0100;
                case 16: goto L_0x00df;
                case 17: goto L_0x009d;
                default: goto L_0x008e;
            }
        L_0x008e:
            r12 = r32
            r11 = r4
            r8 = r17
            r17 = r3
            r29 = r18
            r18 = r13
            r13 = r29
            goto L_0x02b4
        L_0x009d:
            r2 = 3
            if (r0 != r2) goto L_0x00d8
            int r0 = r3 << 3
            r5 = r0 | 4
            r2 = r17
            c.q.d.d1 r0 = r15.mo32319u(r2)
            r1 = r32
            r8 = r2
            r2 = r4
            r17 = r3
            r3 = r34
            r4 = r5
            r13 = r18
            r5 = r36
            int r0 = p040c.p200q.p405d.C6904e.m19717n(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x00c5
            java.lang.Object r1 = r9.f13212c
            r10.putObject(r14, r11, r1)
            goto L_0x00d2
        L_0x00c5:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f13212c
            java.lang.Object r1 = p040c.p200q.p405d.C6999y.m20714h(r1, r2)
            r10.putObject(r14, r11, r1)
        L_0x00d2:
            r6 = r6 | r20
            r12 = r32
            goto L_0x02ac
        L_0x00d8:
            r8 = r17
            r13 = r18
            r17 = r3
            goto L_0x00fc
        L_0x00df:
            r8 = r17
            r13 = r18
            r17 = r3
            if (r0 != 0) goto L_0x00fc
            r2 = r11
            r12 = r32
            int r11 = p040c.p200q.p405d.C6904e.m19701L(r12, r4, r9)
            long r0 = r9.f13211b
            long r4 = p040c.p200q.p405d.C6937j.m19962c(r0)
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
            goto L_0x0269
        L_0x00fc:
            r12 = r32
            goto L_0x0162
        L_0x0100:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != 0) goto L_0x0162
            int r0 = p040c.p200q.p405d.C6904e.m19698I(r12, r4, r9)
            int r1 = r9.f13210a
            int r1 = p040c.p200q.p405d.C6937j.m19961b(r1)
            r10.putInt(r14, r2, r1)
            goto L_0x02aa
        L_0x011a:
            r8 = r17
            r13 = r18
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != 0) goto L_0x0162
            int r0 = p040c.p200q.p405d.C6904e.m19698I(r12, r4, r9)
            int r1 = r9.f13210a
            c.q.d.y$e r4 = r15.mo32315s(r8)
            if (r4 == 0) goto L_0x0146
            boolean r4 = r4.mo32429a(r1)
            if (r4 == 0) goto L_0x0138
            goto L_0x0146
        L_0x0138:
            c.q.d.k1 r2 = m20529v(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo32131n(r13, r1)
            goto L_0x02ac
        L_0x0146:
            r10.putInt(r14, r2, r1)
            goto L_0x02aa
        L_0x014b:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != r1) goto L_0x0162
            int r0 = p040c.p200q.p405d.C6904e.m19705b(r12, r4, r9)
            java.lang.Object r1 = r9.f13212c
            r10.putObject(r14, r2, r1)
            goto L_0x02aa
        L_0x0162:
            r11 = r4
            r18 = -1
            goto L_0x02b4
        L_0x0167:
            r8 = r17
            r13 = r18
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r32
            if (r0 != r1) goto L_0x0199
            c.q.d.d1 r0 = r15.mo32319u(r8)
            r11 = r34
            r18 = -1
            int r0 = p040c.p200q.p405d.C6904e.m19719p(r0, r12, r4, r11, r9)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x018a
            java.lang.Object r1 = r9.f13212c
            r10.putObject(r14, r2, r1)
            goto L_0x0205
        L_0x018a:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.f13212c
            java.lang.Object r1 = p040c.p200q.p405d.C6999y.m20714h(r1, r4)
            r10.putObject(r14, r2, r1)
            goto L_0x0205
        L_0x0199:
            r11 = r34
            r18 = -1
            goto L_0x022f
        L_0x019f:
            r8 = r17
            r1 = 2
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x022f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x01bc
            int r0 = p040c.p200q.p405d.C6904e.m19692C(r12, r4, r9)
            goto L_0x01c0
        L_0x01bc:
            int r0 = p040c.p200q.p405d.C6904e.m19695F(r12, r4, r9)
        L_0x01c0:
            java.lang.Object r1 = r9.f13212c
            r10.putObject(r14, r2, r1)
            goto L_0x0205
        L_0x01c6:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != 0) goto L_0x022f
            int r0 = p040c.p200q.p405d.C6904e.m19701L(r12, r4, r9)
            long r4 = r9.f13211b
            r23 = 0
            int r1 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r1 == 0) goto L_0x01e5
            r1 = 1
            goto L_0x01e7
        L_0x01e5:
            r1 = r16
        L_0x01e7:
            p040c.p200q.p405d.C6961n1.m20335J(r14, r2, r1)
            goto L_0x0205
        L_0x01eb:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x022f
            int r0 = p040c.p200q.p405d.C6904e.m19711h(r12, r4)
            r10.putInt(r14, r2, r0)
            int r0 = r4 + 4
        L_0x0205:
            r6 = r6 | r20
            r2 = r8
            r3 = r13
            r1 = r17
            r13 = r11
            goto L_0x0272
        L_0x020e:
            r8 = r17
            r1 = 1
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r34
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x022f
            long r21 = p040c.p200q.p405d.C6904e.m19713j(r12, r4)
            r0 = r10
            r1 = r31
            r11 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x02a8
        L_0x022f:
            r11 = r4
            goto L_0x02b4
        L_0x0232:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != 0) goto L_0x02b4
            int r0 = p040c.p200q.p405d.C6904e.m19698I(r12, r11, r9)
            int r1 = r9.f13210a
            r10.putInt(r14, r2, r1)
            goto L_0x02aa
        L_0x024d:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != 0) goto L_0x02b4
            int r11 = p040c.p200q.p405d.C6904e.m19701L(r12, r11, r9)
            long r4 = r9.f13211b
            r0 = r10
            r1 = r31
            r0.putLong(r1, r2, r4)
        L_0x0269:
            r6 = r6 | r20
            r2 = r8
            r0 = r11
            r3 = r13
            r1 = r17
            r13 = r34
        L_0x0272:
            r11 = r35
            goto L_0x0018
        L_0x0276:
            r8 = r17
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x02b4
            float r0 = p040c.p200q.p405d.C6904e.m19715l(r12, r11)
            p040c.p200q.p405d.C6961n1.m20342Q(r14, r2, r0)
            int r0 = r11 + 4
            goto L_0x02aa
        L_0x0290:
            r8 = r17
            r1 = 1
            r17 = r3
            r2 = r11
            r12 = r32
            r11 = r4
            r29 = r18
            r18 = r13
            r13 = r29
            if (r0 != r1) goto L_0x02b4
            double r0 = p040c.p200q.p405d.C6904e.m19707d(r12, r11)
            p040c.p200q.p405d.C6961n1.m20341P(r14, r2, r0)
        L_0x02a8:
            int r0 = r11 + 8
        L_0x02aa:
            r6 = r6 | r20
        L_0x02ac:
            r11 = r35
            r2 = r8
            r3 = r13
            r1 = r17
            goto L_0x0311
        L_0x02b4:
            r0 = r35
            r22 = r6
            r19 = r7
            r20 = r8
            r28 = r10
            r2 = r11
            r8 = r13
            goto L_0x03cd
        L_0x02c2:
            r5 = r2
            r17 = r3
            r2 = r11
            r13 = r18
            r18 = -1
            r12 = r32
            r11 = r4
            r1 = 27
            if (r8 != r1) goto L_0x0322
            r1 = 2
            if (r0 != r1) goto L_0x0315
            java.lang.Object r0 = r10.getObject(r14, r2)
            c.q.d.y$i r0 = (p040c.p200q.p405d.C6999y.C7008i) r0
            boolean r1 = r0.mo31823N()
            if (r1 != 0) goto L_0x02f2
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02e9
            r1 = 10
            goto L_0x02eb
        L_0x02e9:
            int r1 = r1 * 2
        L_0x02eb:
            c.q.d.y$i r0 = r0.mo31773q(r1)
            r10.putObject(r14, r2, r0)
        L_0x02f2:
            r8 = r0
            c.q.d.d1 r0 = r15.mo32319u(r5)
            r1 = r13
            r2 = r32
            r3 = r11
            r4 = r34
            r20 = r5
            r5 = r8
            r22 = r6
            r6 = r36
            int r0 = p040c.p200q.p405d.C6904e.m19720q(r0, r1, r2, r3, r4, r5, r6)
            r11 = r35
            r3 = r13
            r1 = r17
            r2 = r20
            r6 = r22
        L_0x0311:
            r13 = r34
            goto L_0x0018
        L_0x0315:
            r20 = r5
            r22 = r6
            r19 = r7
            r28 = r10
            r15 = r11
            r18 = r13
            goto L_0x03a5
        L_0x0322:
            r20 = r5
            r22 = r6
            r1 = 49
            if (r8 > r1) goto L_0x0375
            r1 = r19
            long r5 = (long) r1
            r4 = r0
            r0 = r30
            r1 = r31
            r23 = r2
            r2 = r32
            r3 = r11
            r33 = r4
            r4 = r34
            r25 = r5
            r5 = r13
            r6 = r17
            r19 = r7
            r7 = r33
            r27 = r8
            r8 = r20
            r28 = r10
            r9 = r25
            r15 = r11
            r11 = r27
            r18 = r13
            r12 = r23
            r14 = r36
            int r0 = r0.mo32298e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03c8
        L_0x035b:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            r1 = r17
            r3 = r18
            r7 = r19
            r2 = r20
            r6 = r22
        L_0x0371:
            r10 = r28
            goto L_0x0018
        L_0x0375:
            r33 = r0
            r23 = r2
            r27 = r8
            r28 = r10
            r15 = r11
            r18 = r13
            r1 = r19
            r19 = r7
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x03ab
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x03a5
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r23
            r8 = r36
            int r0 = r0.mo32294a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03c8
            goto L_0x035b
        L_0x03a5:
            r0 = r35
            r2 = r15
            r8 = r18
            goto L_0x03cd
        L_0x03ab:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r17
            r10 = r23
            r12 = r20
            r13 = r36
            int r0 = r0.mo32295b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03c8
            goto L_0x035b
        L_0x03c8:
            r2 = r0
            r8 = r18
            r0 = r35
        L_0x03cd:
            if (r8 != r0) goto L_0x03db
            if (r0 == 0) goto L_0x03db
            r9 = r30
            r10 = r0
            r0 = r2
            r3 = r8
            r7 = r19
            r6 = r22
            goto L_0x0429
        L_0x03db:
            r9 = r30
            r10 = r0
            boolean r0 = r9.f13354f
            r11 = r36
            if (r0 == 0) goto L_0x03fe
            c.q.d.p r0 = r11.f13213d
            c.q.d.p r1 = p040c.p200q.p405d.C6975p.m20507b()
            if (r0 == r1) goto L_0x03fe
            c.q.d.m0 r5 = r9.f13353e
            c.q.d.j1<?, ?> r6 = r9.f13363o
            r0 = r8
            r1 = r32
            r3 = r34
            r4 = r31
            r7 = r36
            int r0 = p040c.p200q.p405d.C6904e.m19710g(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x040d
        L_0x03fe:
            c.q.d.k1 r4 = m20529v(r31)
            r0 = r8
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = p040c.p200q.p405d.C6904e.m19696G(r0, r1, r2, r3, r4, r5)
        L_0x040d:
            r14 = r31
            r12 = r32
            r13 = r34
            r3 = r8
            r15 = r9
            r9 = r11
            r1 = r17
            r7 = r19
            r2 = r20
            r6 = r22
            r11 = r10
            goto L_0x0371
        L_0x0421:
            r22 = r6
            r19 = r7
            r28 = r10
            r10 = r11
            r9 = r15
        L_0x0429:
            r1 = -1
            if (r7 == r1) goto L_0x0435
            long r1 = (long) r7
            r4 = r31
            r5 = r28
            r5.putInt(r4, r1, r6)
            goto L_0x0437
        L_0x0435:
            r4 = r31
        L_0x0437:
            r1 = 0
            int r2 = r9.f13359k
        L_0x043a:
            int r5 = r9.f13360l
            if (r2 >= r5) goto L_0x044d
            int[] r5 = r9.f13358j
            r5 = r5[r2]
            c.q.d.j1<?, ?> r6 = r9.f13363o
            java.lang.Object r1 = r9.mo32312p(r4, r5, r1, r6)
            c.q.d.k1 r1 = (p040c.p200q.p405d.C6948k1) r1
            int r2 = r2 + 1
            goto L_0x043a
        L_0x044d:
            if (r1 == 0) goto L_0x0454
            c.q.d.j1<?, ?> r2 = r9.f13363o
            r2.mo32109o(r4, r1)
        L_0x0454:
            if (r10 != 0) goto L_0x0460
            r1 = r34
            if (r0 != r1) goto L_0x045b
            goto L_0x0466
        L_0x045b:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L_0x0460:
            r1 = r34
            if (r0 > r1) goto L_0x0467
            if (r3 != r10) goto L_0x0467
        L_0x0466:
            return r0
        L_0x0467:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32296c0(java.lang.Object, byte[], int, int, int, c.q.d.e$b):int");
    }

    /* renamed from: d */
    public final boolean mo31885d(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13359k; i4++) {
            int i5 = this.f13358j[i4];
            int T = mo32293T(i5);
            int s0 = mo32316s0(i5);
            if (!this.f13356h) {
                int i6 = this.f13349a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = f13348s.getInt(t, (long) i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            if (m20511I(s0) && !mo32283C(t, i5, i3, i)) {
                return false;
            }
            int r0 = m20528r0(s0);
            if (r0 != 9 && r0 != 17) {
                if (r0 != 27) {
                    if (r0 == 60 || r0 == 68) {
                        if (mo32287H(t, T, i5) && !m20510D(t, s0, mo32319u(i5))) {
                            return false;
                        }
                    } else if (r0 != 49) {
                        if (r0 == 50 && !mo32285F(t, s0, i5)) {
                            return false;
                        }
                    }
                }
                if (!mo32284E(t, s0, i5)) {
                    return false;
                }
            } else if (mo32283C(t, i5, i3, i) && !m20510D(t, s0, mo32319u(i5))) {
                return false;
            }
        }
        return !this.f13354f || this.f13364p.mo32330c(t).mo32367p();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0107, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0139, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0155, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0157, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01de, code lost:
        if (r0 != r15) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x020c, code lost:
        if (r0 != r15) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022b, code lost:
        if (r0 != r15) goto L_0x023f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32297d0(T r28, byte[] r29, int r30, int r31, p040c.p200q.p405d.C6904e.C6906b r32) {
        /*
            r27 = this;
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            sun.misc.Unsafe r9 = f13348s
            r10 = -1
            r16 = 0
            r0 = r30
            r1 = r10
            r2 = r16
        L_0x0014:
            if (r0 >= r13) goto L_0x0253
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0026
            int r0 = p040c.p200q.p405d.C6904e.m19697H(r0, r12, r3, r11)
            int r3 = r11.f13210a
            r8 = r0
            r17 = r3
            goto L_0x0029
        L_0x0026:
            r17 = r0
            r8 = r3
        L_0x0029:
            int r7 = r17 >>> 3
            r6 = r17 & 7
            if (r7 <= r1) goto L_0x0036
            int r2 = r2 / 3
            int r0 = r15.mo32300g0(r7, r2)
            goto L_0x003a
        L_0x0036:
            int r0 = r15.mo32299f0(r7)
        L_0x003a:
            r4 = r0
            if (r4 != r10) goto L_0x0048
            r24 = r7
            r2 = r8
            r18 = r9
            r26 = r10
            r19 = r16
            goto L_0x022f
        L_0x0048:
            int[] r0 = r15.f13349a
            int r1 = r4 + 1
            r5 = r0[r1]
            int r3 = m20528r0(r5)
            long r1 = m20517U(r5)
            r0 = 17
            r10 = 2
            if (r3 > r0) goto L_0x0164
            r0 = 1
            switch(r3) {
                case 0: goto L_0x014a;
                case 1: goto L_0x013b;
                case 2: goto L_0x0129;
                case 3: goto L_0x0129;
                case 4: goto L_0x011b;
                case 5: goto L_0x010b;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00e3;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00ab;
                case 10: goto L_0x009e;
                case 11: goto L_0x011b;
                case 12: goto L_0x008f;
                case 13: goto L_0x00fa;
                case 14: goto L_0x010b;
                case 15: goto L_0x007c;
                case 16: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x01a0
        L_0x0061:
            if (r6 != 0) goto L_0x01a0
            int r6 = p040c.p200q.p405d.C6904e.m19701L(r12, r8, r11)
            r19 = r1
            long r0 = r11.f13211b
            long r21 = p040c.p200q.p405d.C6937j.m19962c(r0)
            r0 = r9
            r2 = r19
            r1 = r28
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            goto L_0x0139
        L_0x007c:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r0 = p040c.p200q.p405d.C6904e.m19698I(r12, r8, r11)
            int r1 = r11.f13210a
            int r1 = p040c.p200q.p405d.C6937j.m19961b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x0157
        L_0x008f:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r0 = p040c.p200q.p405d.C6904e.m19698I(r12, r8, r11)
            int r1 = r11.f13210a
            r9.putInt(r14, r2, r1)
            goto L_0x0157
        L_0x009e:
            r2 = r1
            if (r6 != r10) goto L_0x01a0
            int r0 = p040c.p200q.p405d.C6904e.m19705b(r12, r8, r11)
            java.lang.Object r1 = r11.f13212c
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00ab:
            r2 = r1
            if (r6 != r10) goto L_0x01a0
            c.q.d.d1 r0 = r15.mo32319u(r4)
            int r0 = p040c.p200q.p405d.C6904e.m19719p(r0, r12, r8, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r1 = r11.f13212c
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00c2:
            java.lang.Object r5 = r11.f13212c
            java.lang.Object r1 = p040c.p200q.p405d.C6999y.m20714h(r1, r5)
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00cc:
            r2 = r1
            if (r6 != r10) goto L_0x01a0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00d9
            int r0 = p040c.p200q.p405d.C6904e.m19692C(r12, r8, r11)
            goto L_0x00dd
        L_0x00d9:
            int r0 = p040c.p200q.p405d.C6904e.m19695F(r12, r8, r11)
        L_0x00dd:
            java.lang.Object r1 = r11.f13212c
            r9.putObject(r14, r2, r1)
            goto L_0x0107
        L_0x00e3:
            r2 = r1
            if (r6 != 0) goto L_0x01a0
            int r1 = p040c.p200q.p405d.C6904e.m19701L(r12, r8, r11)
            long r5 = r11.f13211b
            r19 = 0
            int r5 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x00f3
            goto L_0x00f5
        L_0x00f3:
            r0 = r16
        L_0x00f5:
            p040c.p200q.p405d.C6961n1.m20335J(r14, r2, r0)
            r0 = r1
            goto L_0x0107
        L_0x00fa:
            r2 = r1
            r0 = 5
            if (r6 != r0) goto L_0x01a0
            int r0 = p040c.p200q.p405d.C6904e.m19711h(r12, r8)
            r9.putInt(r14, r2, r0)
            int r0 = r8 + 4
        L_0x0107:
            r2 = r4
            r1 = r7
            goto L_0x0159
        L_0x010b:
            r2 = r1
            if (r6 != r0) goto L_0x01a0
            long r5 = p040c.p200q.p405d.C6904e.m19713j(r12, r8)
            r0 = r9
            r1 = r28
            r10 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
            goto L_0x0155
        L_0x011b:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r0 = p040c.p200q.p405d.C6904e.m19698I(r12, r8, r11)
            int r1 = r11.f13210a
            r9.putInt(r14, r2, r1)
            goto L_0x0157
        L_0x0129:
            r2 = r1
            r10 = r4
            if (r6 != 0) goto L_0x015c
            int r6 = p040c.p200q.p405d.C6904e.m19701L(r12, r8, r11)
            long r4 = r11.f13211b
            r0 = r9
            r1 = r28
            r0.putLong(r1, r2, r4)
        L_0x0139:
            r0 = r6
            goto L_0x0157
        L_0x013b:
            r2 = r1
            r10 = r4
            r0 = 5
            if (r6 != r0) goto L_0x015c
            float r0 = p040c.p200q.p405d.C6904e.m19715l(r12, r8)
            p040c.p200q.p405d.C6961n1.m20342Q(r14, r2, r0)
            int r0 = r8 + 4
            goto L_0x0157
        L_0x014a:
            r2 = r1
            r10 = r4
            if (r6 != r0) goto L_0x015c
            double r0 = p040c.p200q.p405d.C6904e.m19707d(r12, r8)
            p040c.p200q.p405d.C6961n1.m20341P(r14, r2, r0)
        L_0x0155:
            int r0 = r8 + 8
        L_0x0157:
            r1 = r7
            r2 = r10
        L_0x0159:
            r10 = -1
            goto L_0x0014
        L_0x015c:
            r24 = r7
            r15 = r8
            r18 = r9
            r19 = r10
            goto L_0x01a7
        L_0x0164:
            r0 = 27
            if (r3 != r0) goto L_0x01ab
            if (r6 != r10) goto L_0x01a0
            java.lang.Object r0 = r9.getObject(r14, r1)
            c.q.d.y$i r0 = (p040c.p200q.p405d.C6999y.C7008i) r0
            boolean r3 = r0.mo31823N()
            if (r3 != 0) goto L_0x0188
            int r3 = r0.size()
            if (r3 != 0) goto L_0x017f
            r3 = 10
            goto L_0x0181
        L_0x017f:
            int r3 = r3 * 2
        L_0x0181:
            c.q.d.y$i r0 = r0.mo31773q(r3)
            r9.putObject(r14, r1, r0)
        L_0x0188:
            r5 = r0
            c.q.d.d1 r0 = r15.mo32319u(r4)
            r1 = r17
            r2 = r29
            r3 = r8
            r19 = r4
            r4 = r31
            r6 = r32
            int r0 = p040c.p200q.p405d.C6904e.m19720q(r0, r1, r2, r3, r4, r5, r6)
            r1 = r7
            r2 = r19
            goto L_0x0159
        L_0x01a0:
            r19 = r4
            r24 = r7
            r15 = r8
            r18 = r9
        L_0x01a7:
            r26 = -1
            goto L_0x020f
        L_0x01ab:
            r19 = r4
            r0 = 49
            if (r3 > r0) goto L_0x01e2
            long r4 = (long) r5
            r0 = r27
            r20 = r1
            r1 = r28
            r2 = r29
            r10 = r3
            r3 = r8
            r22 = r4
            r4 = r31
            r5 = r17
            r30 = r6
            r6 = r7
            r24 = r7
            r7 = r30
            r15 = r8
            r8 = r19
            r18 = r9
            r25 = r10
            r26 = -1
            r9 = r22
            r11 = r25
            r12 = r20
            r14 = r32
            int r0 = r0.mo32298e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x022e
        L_0x01e0:
            goto L_0x023f
        L_0x01e2:
            r20 = r1
            r25 = r3
            r30 = r6
            r24 = r7
            r15 = r8
            r18 = r9
            r26 = -1
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0211
            r7 = r30
            if (r7 != r10) goto L_0x020f
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r5 = r19
            r6 = r20
            r8 = r32
            int r0 = r0.mo32294a0(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x022e
            goto L_0x01e0
        L_0x020f:
            r2 = r15
            goto L_0x022f
        L_0x0211:
            r7 = r30
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r15
            r4 = r31
            r8 = r5
            r5 = r17
            r6 = r24
            r10 = r20
            r12 = r19
            r13 = r32
            int r0 = r0.mo32295b0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x022e
            goto L_0x01e0
        L_0x022e:
            r2 = r0
        L_0x022f:
            c.q.d.k1 r4 = m20529v(r28)
            r0 = r17
            r1 = r29
            r3 = r31
            r5 = r32
            int r0 = p040c.p200q.p405d.C6904e.m19696G(r0, r1, r2, r3, r4, r5)
        L_0x023f:
            r15 = r27
            r14 = r28
            r12 = r29
            r13 = r31
            r11 = r32
            r9 = r18
            r2 = r19
            r1 = r24
            r10 = r26
            goto L_0x0014
        L_0x0253:
            r1 = r13
            if (r0 != r1) goto L_0x0257
            return r0
        L_0x0257:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32297d0(java.lang.Object, byte[], int, int, c.q.d.e$b):int");
    }

    /* renamed from: e */
    public void mo31886e(T t, C6890b1 b1Var, C6975p pVar) {
        if (pVar != null) {
            mo32288L(this.f13363o, this.f13364p, t, b1Var, pVar);
            return;
        }
        throw null;
    }

    /* renamed from: e0 */
    public final int mo32298e0(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C6904e.C6906b bVar) {
        int i8;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i5;
        int i11 = i6;
        long j3 = j2;
        C6904e.C6906b bVar2 = bVar;
        C6999y.C7008i iVar = (C6999y.C7008i) f13348s.getObject(t, j3);
        if (!iVar.mo31823N()) {
            int size = iVar.size();
            iVar = iVar.mo31773q(size == 0 ? 10 : size * 2);
            f13348s.putObject(t, j3, iVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i10 == 2) {
                    return C6904e.m19722s(bArr, i, iVar, bVar2);
                }
                if (i10 == 1) {
                    return C6904e.m19708e(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return C6904e.m19725v(bArr, i, iVar, bVar2);
                }
                if (i10 == 5) {
                    return C6904e.m19716m(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return C6904e.m19729z(bArr, i, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C6904e.m19702M(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return C6904e.m19728y(bArr, i, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C6904e.m19699J(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i10 == 2) {
                    return C6904e.m19724u(bArr, i, iVar, bVar2);
                }
                if (i10 == 1) {
                    return C6904e.m19714k(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return C6904e.m19723t(bArr, i, iVar, bVar2);
                }
                if (i10 == 5) {
                    return C6904e.m19712i(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return C6904e.m19721r(bArr, i, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C6904e.m19704a(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    if ((j & 536870912) == 0) {
                        return C6904e.m19693D(i3, bArr, i, i2, iVar, bVar);
                    }
                    return C6904e.m19694E(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return C6904e.m19720q(mo32319u(i11), i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return C6904e.m19706c(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    i8 = C6904e.m19728y(bArr, i, iVar, bVar2);
                } else if (i10 == 0) {
                    i8 = C6904e.m19699J(i3, bArr, i, i2, iVar, bVar);
                }
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) t2;
                C6948k1 k1Var = generatedMessageLite.f15527l;
                if (k1Var == C6948k1.m20192e()) {
                    k1Var = null;
                }
                C6948k1 k1Var2 = (C6948k1) C6915f1.m19818A(i4, iVar, mo32315s(i11), k1Var, this.f13363o);
                if (k1Var2 != null) {
                    generatedMessageLite.f15527l = k1Var2;
                }
                return i8;
            case 33:
            case 47:
                if (i10 == 2) {
                    return C6904e.m19726w(bArr, i, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C6904e.m19690A(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return C6904e.m19727x(bArr, i, iVar, bVar2);
                }
                if (i10 == 0) {
                    return C6904e.m19691B(i3, bArr, i, i2, iVar, bVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return C6904e.m19718o(mo32319u(i11), i3, bArr, i, i2, iVar, bVar);
                }
                break;
        }
        return i9;
    }

    /* renamed from: f */
    public void mo31887f(T t, byte[] bArr, int i, int i2, C6904e.C6906b bVar) {
        if (this.f13356h) {
            mo32297d0(t, bArr, i, i2, bVar);
        } else {
            mo32296c0(t, bArr, i, i2, 0, bVar);
        }
    }

    /* renamed from: f0 */
    public final int mo32299f0(int i) {
        if (i < this.f13351c || i > this.f13352d) {
            return -1;
        }
        return mo32313p0(i, 0);
    }

    /* renamed from: g */
    public boolean mo31888g(T t, T t2) {
        int length = this.f13349a.length;
        for (int i = 0; i < length; i += 3) {
            if (!mo32310o(t, t2, i)) {
                return false;
            }
        }
        if (!this.f13363o.mo32101g(t).equals(this.f13363o.mo32101g(t2))) {
            return false;
        }
        if (this.f13354f) {
            return this.f13364p.mo32330c(t).equals(this.f13364p.mo32330c(t2));
        }
        return true;
    }

    /* renamed from: g0 */
    public final int mo32300g0(int i, int i2) {
        if (i < this.f13351c || i > this.f13352d) {
            return -1;
        }
        return mo32313p0(i, i2);
    }

    /* renamed from: h */
    public int mo31889h(T t) {
        return this.f13356h ? mo32324x(t) : mo32322w(t);
    }

    /* renamed from: h0 */
    public final int mo32301h0(int i) {
        return this.f13349a[i + 2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo31890i(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f13349a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.mo32316s0(r1)
            int r4 = r8.mo32293T(r1)
            long r5 = m20517U(r3)
            int r3 = m20528r0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m20522Z(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m20521Y(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m20522Z(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m20521Y(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m20521Y(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m20521Y(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m20518V(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20709c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m20521Y(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m20522Z(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m20521Y(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m20522Z(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m20522Z(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m20520X(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.mo32287H(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m20519W(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p405d.C6961n1.m20328C(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p405d.C6961n1.m20326A(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p405d.C6961n1.m20328C(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p405d.C6961n1.m20326A(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p405d.C6961n1.m20326A(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p405d.C6961n1.m20326A(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p405d.C6961n1.m20330E(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = p040c.p200q.p405d.C6961n1.m20365r(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20709c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p405d.C6961n1.m20326A(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p405d.C6961n1.m20328C(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p405d.C6961n1.m20326A(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p405d.C6961n1.m20328C(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p405d.C6961n1.m20328C(r9, r5)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = p040c.p200q.p405d.C6961n1.m20373z(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = p040c.p200q.p405d.C6961n1.m20372y(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p040c.p200q.p405d.C6999y.m20712f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            c.q.d.j1<?, ?> r0 = r8.f13363o
            java.lang.Object r0 = r0.mo32101g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f13354f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            c.q.d.q<?> r0 = r8.f13364p
            c.q.d.u r9 = r0.mo32330c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo31890i(java.lang.Object):int");
    }

    /* renamed from: i0 */
    public final <E> void mo32302i0(Object obj, long j, C6890b1 b1Var, C6903d1<E> d1Var, C6975p pVar) {
        b1Var.mo31799f(this.f13362n.mo31881e(obj, j), d1Var, pVar);
    }

    /* renamed from: j */
    public final boolean mo32303j(T t, T t2, int i) {
        return mo32282B(t, i) == mo32282B(t2, i);
    }

    /* renamed from: j0 */
    public final <E> void mo32304j0(Object obj, int i, C6890b1 b1Var, C6903d1<E> d1Var, C6975p pVar) {
        b1Var.mo31805k(this.f13362n.mo31881e(obj, m20517U(i)), d1Var, pVar);
    }

    /* renamed from: k0 */
    public final void mo32305k0(Object obj, int i, C6890b1 b1Var) {
        if (m20509A(i)) {
            C6961n1.m20345T(obj, m20517U(i), b1Var.mo31792N());
        } else if (this.f13355g) {
            C6961n1.m20345T(obj, m20517U(i), b1Var.mo31821y());
        } else {
            C6961n1.m20345T(obj, m20517U(i), b1Var.mo31784F());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <K, V> int mo32306l(byte[] r15, int r16, int r17, p040c.p200q.p405d.C6917g0.C6918a<K, V> r18, java.util.Map<K, V> r19, p040c.p200q.p405d.C6904e.C6906b r20) {
        /*
            r14 = this;
            r7 = r15
            r8 = r17
            r9 = r18
            r0 = r16
            r10 = r20
            int r0 = p040c.p200q.p405d.C6904e.m19698I(r15, r0, r10)
            int r1 = r10.f13210a
            if (r1 < 0) goto L_0x0081
            int r2 = r8 - r0
            if (r1 > r2) goto L_0x0081
            int r11 = r0 + r1
            K r1 = r9.f13238b
            V r2 = r9.f13240d
            r12 = r1
            r13 = r2
        L_0x001d:
            if (r0 >= r11) goto L_0x0074
            int r1 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = p040c.p200q.p405d.C6904e.m19697H(r0, r15, r1, r10)
            int r1 = r10.f13210a
            r2 = r0
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r2 = r1
        L_0x002f:
            int r1 = r0 >>> 3
            r3 = r0 & 7
            r4 = 1
            if (r1 == r4) goto L_0x0057
            r4 = 2
            if (r1 == r4) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            com.google.protobuf.WireFormat$FieldType r1 = r9.f13239c
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.WireFormat$FieldType r4 = r9.f13239c
            V r0 = r9.f13240d
            java.lang.Class r5 = r0.getClass()
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.mo32308m(r1, r2, r3, r4, r5, r6)
            java.lang.Object r13 = r10.f13212c
            goto L_0x001d
        L_0x0057:
            com.google.protobuf.WireFormat$FieldType r1 = r9.f13237a
            int r1 = r1.getWireType()
            if (r3 != r1) goto L_0x006f
            com.google.protobuf.WireFormat$FieldType r4 = r9.f13237a
            r5 = 0
            r0 = r14
            r1 = r15
            r3 = r17
            r6 = r20
            int r0 = r0.mo32308m(r1, r2, r3, r4, r5, r6)
            java.lang.Object r12 = r10.f13212c
            goto L_0x001d
        L_0x006f:
            int r0 = p040c.p200q.p405d.C6904e.m19703N(r0, r15, r2, r8, r10)
            goto L_0x001d
        L_0x0074:
            if (r0 != r11) goto L_0x007c
            r0 = r19
            r0.put(r12, r13)
            return r11
        L_0x007c:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
            throw r0
        L_0x0081:
            com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32306l(byte[], int, int, c.q.d.g0$a, java.util.Map, c.q.d.e$b):int");
    }

    /* renamed from: l0 */
    public final void mo32307l0(Object obj, int i, C6890b1 b1Var) {
        if (m20509A(i)) {
            b1Var.mo31783E(this.f13362n.mo31881e(obj, m20517U(i)));
        } else {
            b1Var.mo31780B(this.f13362n.mo31881e(obj, m20517U(i)));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return r3 + 8;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32308m(byte[] r2, int r3, int r4, com.google.protobuf.WireFormat.FieldType r5, java.lang.Class<?> r6, p040c.p200q.p405d.C6904e.C6906b r7) {
        /*
            r1 = this;
            int[] r0 = p040c.p200q.p405d.C6977p0.C6978a.f13366a
            int r5 = r5.ordinal()
            r5 = r0[r5]
            switch(r5) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0094;
                case 3: goto L_0x0087;
                case 4: goto L_0x007a;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x006f;
                case 8: goto L_0x0064;
                case 9: goto L_0x0057;
                case 10: goto L_0x0057;
                case 11: goto L_0x0057;
                case 12: goto L_0x004a;
                case 13: goto L_0x004a;
                case 14: goto L_0x003d;
                case 15: goto L_0x002b;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "unsupported field type."
            r2.<init>(r3)
            throw r2
        L_0x0013:
            int r2 = p040c.p200q.p405d.C6904e.m19695F(r2, r3, r7)
            goto L_0x00ae
        L_0x0019:
            int r2 = p040c.p200q.p405d.C6904e.m19701L(r2, r3, r7)
            long r3 = r7.f13211b
            long r3 = p040c.p200q.p405d.C6937j.m19962c(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f13212c = r3
            goto L_0x00ae
        L_0x002b:
            int r2 = p040c.p200q.p405d.C6904e.m19698I(r2, r3, r7)
            int r3 = r7.f13210a
            int r3 = p040c.p200q.p405d.C6937j.m19961b(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f13212c = r3
            goto L_0x00ae
        L_0x003d:
            c.q.d.y0 r5 = p040c.p200q.p405d.C7009y0.m20722a()
            c.q.d.d1 r5 = r5.mo32432d(r6)
            int r2 = p040c.p200q.p405d.C6904e.m19719p(r5, r2, r3, r4, r7)
            goto L_0x00ae
        L_0x004a:
            int r2 = p040c.p200q.p405d.C6904e.m19701L(r2, r3, r7)
            long r3 = r7.f13211b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r7.f13212c = r3
            goto L_0x00ae
        L_0x0057:
            int r2 = p040c.p200q.p405d.C6904e.m19698I(r2, r3, r7)
            int r3 = r7.f13210a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.f13212c = r3
            goto L_0x00ae
        L_0x0064:
            float r2 = p040c.p200q.p405d.C6904e.m19715l(r2, r3)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r7.f13212c = r2
            goto L_0x0084
        L_0x006f:
            long r4 = p040c.p200q.p405d.C6904e.m19713j(r2, r3)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r7.f13212c = r2
            goto L_0x0091
        L_0x007a:
            int r2 = p040c.p200q.p405d.C6904e.m19711h(r2, r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.f13212c = r2
        L_0x0084:
            int r2 = r3 + 4
            goto L_0x00ae
        L_0x0087:
            double r4 = p040c.p200q.p405d.C6904e.m19707d(r2, r3)
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r7.f13212c = r2
        L_0x0091:
            int r2 = r3 + 8
            goto L_0x00ae
        L_0x0094:
            int r2 = p040c.p200q.p405d.C6904e.m19705b(r2, r3, r7)
            goto L_0x00ae
        L_0x0099:
            int r2 = p040c.p200q.p405d.C6904e.m19701L(r2, r3, r7)
            long r3 = r7.f13211b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00a7
            r3 = 1
            goto L_0x00a8
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.f13212c = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32308m(byte[], int, int, com.google.protobuf.WireFormat$FieldType, java.lang.Class, c.q.d.e$b):int");
    }

    /* renamed from: n0 */
    public final void mo32309n0(T t, int i) {
        if (!this.f13356h) {
            int h0 = mo32301h0(i);
            long j = (long) (h0 & 1048575);
            C6961n1.m20343R(t, j, C6961n1.m20326A(t, j) | (1 << (h0 >>> 20)));
        }
    }

    public T newInstance() {
        return this.f13361m.mo32342a(this.f13353e);
    }

    /* renamed from: o */
    public final boolean mo32310o(T t, T t2, int i) {
        int s0 = mo32316s0(i);
        long U = m20517U(s0);
        switch (m20528r0(s0)) {
            case 0:
                if (!mo32303j(t, t2, i) || Double.doubleToLongBits(C6961n1.m20372y(t, U)) != Double.doubleToLongBits(C6961n1.m20372y(t2, U))) {
                    return false;
                }
                return true;
            case 1:
                if (!mo32303j(t, t2, i) || Float.floatToIntBits(C6961n1.m20373z(t, U)) != Float.floatToIntBits(C6961n1.m20373z(t2, U))) {
                    return false;
                }
                return true;
            case 2:
                if (!mo32303j(t, t2, i) || C6961n1.m20328C(t, U) != C6961n1.m20328C(t2, U)) {
                    return false;
                }
                return true;
            case 3:
                if (!mo32303j(t, t2, i) || C6961n1.m20328C(t, U) != C6961n1.m20328C(t2, U)) {
                    return false;
                }
                return true;
            case 4:
                if (!mo32303j(t, t2, i) || C6961n1.m20326A(t, U) != C6961n1.m20326A(t2, U)) {
                    return false;
                }
                return true;
            case 5:
                if (!mo32303j(t, t2, i) || C6961n1.m20328C(t, U) != C6961n1.m20328C(t2, U)) {
                    return false;
                }
                return true;
            case 6:
                if (!mo32303j(t, t2, i) || C6961n1.m20326A(t, U) != C6961n1.m20326A(t2, U)) {
                    return false;
                }
                return true;
            case 7:
                if (!mo32303j(t, t2, i) || C6961n1.m20365r(t, U) != C6961n1.m20365r(t2, U)) {
                    return false;
                }
                return true;
            case 8:
                if (!mo32303j(t, t2, i) || !C6915f1.m19828K(C6961n1.m20330E(t, U), C6961n1.m20330E(t2, U))) {
                    return false;
                }
                return true;
            case 9:
                if (!mo32303j(t, t2, i) || !C6915f1.m19828K(C6961n1.m20330E(t, U), C6961n1.m20330E(t2, U))) {
                    return false;
                }
                return true;
            case 10:
                if (!mo32303j(t, t2, i) || !C6915f1.m19828K(C6961n1.m20330E(t, U), C6961n1.m20330E(t2, U))) {
                    return false;
                }
                return true;
            case 11:
                if (!mo32303j(t, t2, i) || C6961n1.m20326A(t, U) != C6961n1.m20326A(t2, U)) {
                    return false;
                }
                return true;
            case 12:
                if (!mo32303j(t, t2, i) || C6961n1.m20326A(t, U) != C6961n1.m20326A(t2, U)) {
                    return false;
                }
                return true;
            case 13:
                if (!mo32303j(t, t2, i) || C6961n1.m20326A(t, U) != C6961n1.m20326A(t2, U)) {
                    return false;
                }
                return true;
            case 14:
                if (!mo32303j(t, t2, i) || C6961n1.m20328C(t, U) != C6961n1.m20328C(t2, U)) {
                    return false;
                }
                return true;
            case 15:
                if (!mo32303j(t, t2, i) || C6961n1.m20326A(t, U) != C6961n1.m20326A(t2, U)) {
                    return false;
                }
                return true;
            case 16:
                if (!mo32303j(t, t2, i) || C6961n1.m20328C(t, U) != C6961n1.m20328C(t2, U)) {
                    return false;
                }
                return true;
            case 17:
                if (!mo32303j(t, t2, i) || !C6915f1.m19828K(C6961n1.m20330E(t, U), C6961n1.m20330E(t2, U))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return C6915f1.m19828K(C6961n1.m20330E(t, U), C6961n1.m20330E(t2, U));
            case 50:
                return C6915f1.m19828K(C6961n1.m20330E(t, U), C6961n1.m20330E(t2, U));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!mo32286G(t, t2, i) || !C6915f1.m19828K(C6961n1.m20330E(t, U), C6961n1.m20330E(t2, U))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: o0 */
    public final void mo32311o0(T t, int i, int i2) {
        C6961n1.m20343R(t, (long) (mo32301h0(i2) & 1048575), i);
    }

    /* renamed from: p */
    public final <UT, UB> UB mo32312p(Object obj, int i, UB ub, C6944j1<UT, UB> j1Var) {
        C6999y.C7004e s;
        int T = mo32293T(i);
        Object E = C6961n1.m20330E(obj, m20517U(mo32316s0(i)));
        if (E == null || (s = mo32315s(i)) == null) {
            return ub;
        }
        return mo32314q(i, T, this.f13365q.mo32012d(E), s, ub, j1Var);
    }

    /* renamed from: p0 */
    public final int mo32313p0(int i, int i2) {
        int length = (this.f13349a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int T = mo32293T(i4);
            if (i == T) {
                return i4;
            }
            if (i < T) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final <K, V, UT, UB> UB mo32314q(int i, int i2, Map<K, V> map, C6999y.C7004e eVar, UB ub, C6944j1<UT, UB> j1Var) {
        C6917g0.C6918a<?, ?> c = this.f13365q.mo32011c(mo32317t(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo32429a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = j1Var.mo32108n();
                }
                ByteString.C8413h newCodedBuilder = ByteString.newCodedBuilder(C6917g0.m19888b(c, next.getKey(), next.getValue()));
                try {
                    C6917g0.m19890e(newCodedBuilder.mo37896b(), c, next.getKey(), next.getValue());
                    j1Var.mo32098d(ub, i2, newCodedBuilder.mo37895a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: s */
    public final C6999y.C7004e mo32315s(int i) {
        return (C6999y.C7004e) this.f13350b[((i / 3) * 2) + 1];
    }

    /* renamed from: s0 */
    public final int mo32316s0(int i) {
        return this.f13349a[i + 1];
    }

    /* renamed from: t */
    public final Object mo32317t(int i) {
        return this.f13350b[(i / 3) * 2];
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32318t0(T r18, com.google.protobuf.Writer r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f13354f
            if (r3 == 0) goto L_0x0021
            c.q.d.q<?> r3 = r0.f13364p
            c.q.d.u r3 = r3.mo32330c(r1)
            boolean r5 = r3.mo32365n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo32368s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f13349a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f13348s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x049a
            int r12 = r0.mo32316s0(r10)
            int r13 = r0.mo32293T(r10)
            int r14 = m20528r0(r12)
            boolean r15 = r0.f13356h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f13349a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x0056
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            c.q.d.q<?> r9 = r0.f13364p
            int r9 = r9.mo32328a(r5)
            if (r9 > r13) goto L_0x0081
            c.q.d.q<?> r9 = r0.f13364p
            r9.mo32337j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r9 = r6
            long r5 = m20517U(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            c.q.d.d1 r5 = r0.mo32319u(r10)
            r2.mo32173s(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m20522Z(r1, r5)
            r2.mo32139F(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m20521Y(r1, r5)
            r2.mo32147N(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m20522Z(r1, r5)
            r2.mo32180z(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m20521Y(r1, r5)
            r2.mo32174t(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m20521Y(r1, r5)
            r2.mo32143J(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m20521Y(r1, r5)
            r2.mo32158d(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo32176v(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            c.q.d.d1 r5 = r0.mo32319u(r10)
            r2.mo32164j(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.mo32325x0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = m20518V(r1, r5)
            r2.mo32172r(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m20521Y(r1, r5)
            r2.mo32160f(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m20522Z(r1, r5)
            r2.mo32165k(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m20521Y(r1, r5)
            r2.mo32177w(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m20522Z(r1, r5)
            r2.mo32169o(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m20522Z(r1, r5)
            r2.mo32171q(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = m20520X(r1, r5)
            r2.mo32140G(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.mo32287H(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = m20519W(r1, r5)
            r2.mo32161g(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.mo32323w0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            c.q.d.d1 r6 = r0.mo32319u(r10)
            p040c.p200q.p405d.C6915f1.m19838U(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            p040c.p200q.p405d.C6915f1.m19847b0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19845a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19843Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19842Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19834Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19851d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19831N(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19835R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19836S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19839V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19853e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19840W(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19837T(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19833P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p040c.p200q.p405d.C6915f1.m19847b0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19845a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19843Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19842Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19834Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19851d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19832O(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            c.q.d.d1 r6 = r0.mo32319u(r10)
            p040c.p200q.p405d.C6915f1.m19841X(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19849c0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p040c.p200q.p405d.C6915f1.m19831N(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19835R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19836S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19839V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19853e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19840W(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19837T(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.mo32293T(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p405d.C6915f1.m19833P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            c.q.d.d1 r5 = r0.mo32319u(r10)
            r2.mo32173s(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo32139F(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo32147N(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo32180z(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo32174t(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo32143J(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo32158d(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo32176v(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            c.q.d.d1 r5 = r0.mo32319u(r10)
            r2.mo32164j(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.mo32325x0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = m20523k(r1, r5)
            r2.mo32172r(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo32160f(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo32165k(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo32177w(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo32169o(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo32171q(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = m20527r(r1, r5)
            r2.mo32140G(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = m20525n(r1, r5)
            r2.mo32161g(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            c.q.d.q<?> r4 = r0.f13364p
            r4.mo32337j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            c.q.d.j1<?, ?> r3 = r0.f13363o
            r0.mo32327y0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32318t0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* renamed from: u */
    public final C6903d1 mo32319u(int i) {
        int i2 = (i / 3) * 2;
        C6903d1 d1Var = (C6903d1) this.f13350b[i2];
        if (d1Var != null) {
            return d1Var;
        }
        C6903d1 d = C7009y0.m20722a().mo32432d((Class) this.f13350b[i2 + 1]);
        this.f13350b[i2] = d;
        return d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32320u0(T r13, com.google.protobuf.Writer r14) {
        /*
            r12 = this;
            boolean r0 = r12.f13354f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            c.q.d.q<?> r0 = r12.f13364p
            c.q.d.u r0 = r0.mo32330c(r13)
            boolean r2 = r0.mo32365n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo32368s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f13349a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.mo32316s0(r5)
            int r7 = r12.mo32293T(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            c.q.d.q<?> r8 = r12.f13364p
            int r8 = r8.mo32328a(r2)
            if (r8 > r7) goto L_0x004b
            c.q.d.q<?> r8 = r12.f13364p
            r8.mo32337j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m20528r0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            c.q.d.d1 r8 = r12.mo32319u(r5)
            r14.mo32173s(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20522Z(r13, r8)
            r14.mo32139F(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20521Y(r13, r8)
            r14.mo32147N(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20522Z(r13, r8)
            r14.mo32180z(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20521Y(r13, r8)
            r14.mo32174t(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20521Y(r13, r8)
            r14.mo32143J(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20521Y(r13, r8)
            r14.mo32158d(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.mo32176v(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            c.q.d.d1 r8 = r12.mo32319u(r5)
            r14.mo32164j(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            r12.mo32325x0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            boolean r6 = m20518V(r13, r8)
            r14.mo32172r(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20521Y(r13, r8)
            r14.mo32160f(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20522Z(r13, r8)
            r14.mo32165k(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20521Y(r13, r8)
            r14.mo32177w(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20522Z(r13, r8)
            r14.mo32169o(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20522Z(r13, r8)
            r14.mo32171q(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            float r6 = m20520X(r13, r8)
            r14.mo32140G(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.mo32287H(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            double r8 = m20519W(r13, r8)
            r14.mo32161g(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            r12.mo32323w0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            c.q.d.d1 r8 = r12.mo32319u(r5)
            p040c.p200q.p405d.C6915f1.m19838U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19847b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19845a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19843Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19842Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19834Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19851d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19831N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19835R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19836S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19839V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19853e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19840W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19837T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.mo32293T(r5)
            long r10 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19833P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19847b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19845a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19843Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19842Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19834Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19851d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19832O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            c.q.d.d1 r8 = r12.mo32319u(r5)
            p040c.p200q.p405d.C6915f1.m19841X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19849c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19831N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19835R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19836S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19839V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19853e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19840W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19837T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.mo32293T(r5)
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p040c.p200q.p405d.C6915f1.m19833P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            c.q.d.d1 r8 = r12.mo32319u(r5)
            r14.mo32173s(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20513K(r13, r8)
            r14.mo32139F(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20530z(r13, r8)
            r14.mo32147N(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20513K(r13, r8)
            r14.mo32180z(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20530z(r13, r8)
            r14.mo32174t(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20530z(r13, r8)
            r14.mo32143J(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20530z(r13, r8)
            r14.mo32158d(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            r14.mo32176v(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            c.q.d.d1 r8 = r12.mo32319u(r5)
            r14.mo32164j(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r13, r8)
            r12.mo32325x0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            boolean r6 = m20523k(r13, r8)
            r14.mo32172r(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20530z(r13, r8)
            r14.mo32160f(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20513K(r13, r8)
            r14.mo32165k(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            int r6 = m20530z(r13, r8)
            r14.mo32177w(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20513K(r13, r8)
            r14.mo32169o(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            long r8 = m20513K(r13, r8)
            r14.mo32171q(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            float r6 = m20527r(r13, r8)
            r14.mo32140G(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.mo32282B(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m20517U(r6)
            double r8 = m20525n(r13, r8)
            r14.mo32161g(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            c.q.d.q<?> r3 = r12.f13364p
            r3.mo32337j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            c.q.d.j1<?, ?> r0 = r12.f13363o
            r12.mo32327y0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32320u0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32321v0(T r11, com.google.protobuf.Writer r12) {
        /*
            r10 = this;
            c.q.d.j1<?, ?> r0 = r10.f13363o
            r10.mo32327y0(r0, r11, r12)
            boolean r0 = r10.f13354f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            c.q.d.q<?> r0 = r10.f13364p
            c.q.d.u r0 = r0.mo32330c(r11)
            boolean r2 = r0.mo32365n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo32359g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f13349a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.mo32316s0(r3)
            int r5 = r10.mo32293T(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            c.q.d.q<?> r6 = r10.f13364p
            int r6 = r6.mo32328a(r2)
            if (r6 <= r5) goto L_0x0050
            c.q.d.q<?> r6 = r10.f13364p
            r6.mo32337j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m20528r0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            c.q.d.d1 r6 = r10.mo32319u(r3)
            r12.mo32173s(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20522Z(r11, r6)
            r12.mo32139F(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20521Y(r11, r6)
            r12.mo32147N(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20522Z(r11, r6)
            r12.mo32180z(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20521Y(r11, r6)
            r12.mo32174t(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20521Y(r11, r6)
            r12.mo32143J(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20521Y(r11, r6)
            r12.mo32158d(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.mo32176v(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            c.q.d.d1 r6 = r10.mo32319u(r3)
            r12.mo32164j(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            r10.mo32325x0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            boolean r4 = m20518V(r11, r6)
            r12.mo32172r(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20521Y(r11, r6)
            r12.mo32160f(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20522Z(r11, r6)
            r12.mo32165k(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20521Y(r11, r6)
            r12.mo32177w(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20522Z(r11, r6)
            r12.mo32169o(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20522Z(r11, r6)
            r12.mo32171q(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            float r4 = m20520X(r11, r6)
            r12.mo32140G(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.mo32287H(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            double r6 = m20519W(r11, r6)
            r12.mo32161g(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            r10.mo32323w0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            c.q.d.d1 r6 = r10.mo32319u(r3)
            p040c.p200q.p405d.C6915f1.m19838U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19847b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19845a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19843Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19842Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19834Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19851d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19831N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19835R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19836S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19839V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19853e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19840W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19837T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.mo32293T(r3)
            long r8 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19833P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19847b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19845a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19843Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19842Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19834Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19851d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19832O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            c.q.d.d1 r6 = r10.mo32319u(r3)
            p040c.p200q.p405d.C6915f1.m19841X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19849c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19831N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19835R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19836S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19839V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19853e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19840W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19837T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.mo32293T(r3)
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p040c.p200q.p405d.C6915f1.m19833P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            c.q.d.d1 r6 = r10.mo32319u(r3)
            r12.mo32173s(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20513K(r11, r6)
            r12.mo32139F(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20530z(r11, r6)
            r12.mo32147N(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20513K(r11, r6)
            r12.mo32180z(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20530z(r11, r6)
            r12.mo32174t(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20530z(r11, r6)
            r12.mo32143J(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20530z(r11, r6)
            r12.mo32158d(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r12.mo32176v(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            c.q.d.d1 r6 = r10.mo32319u(r3)
            r12.mo32164j(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            java.lang.Object r4 = p040c.p200q.p405d.C6961n1.m20330E(r11, r6)
            r10.mo32325x0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            boolean r4 = m20523k(r11, r6)
            r12.mo32172r(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20530z(r11, r6)
            r12.mo32160f(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20513K(r11, r6)
            r12.mo32165k(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            int r4 = m20530z(r11, r6)
            r12.mo32177w(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20513K(r11, r6)
            r12.mo32169o(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            long r6 = m20513K(r11, r6)
            r12.mo32171q(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            float r4 = m20527r(r11, r6)
            r12.mo32140G(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.mo32282B(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m20517U(r4)
            double r6 = m20525n(r11, r6)
            r12.mo32161g(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            c.q.d.q<?> r11 = r10.f13364p
            r11.mo32337j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32321v0(java.lang.Object, com.google.protobuf.Writer):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0347, code lost:
        r4 = (r4 + r8) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0413, code lost:
        r6 = r6 + r3;
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0465, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x051c, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32322w(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = f13348s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f13349a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0522
            int r8 = r0.mo32316s0(r5)
            int r9 = r0.mo32293T(r5)
            int r10 = m20528r0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f13349a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.f13357i
            if (r11 == 0) goto L_0x0055
            com.google.protobuf.FieldType r11 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r11 = r11.mo37956id()
            if (r10 < r11) goto L_0x0055
            com.google.protobuf.FieldType r11 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r11 = r11.mo37956id()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.f13349a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = m20517U(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x0510;
                case 1: goto L_0x0506;
                case 2: goto L_0x04f8;
                case 3: goto L_0x04ea;
                case 4: goto L_0x04dc;
                case 5: goto L_0x04d2;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04bd;
                case 8: goto L_0x04a1;
                case 9: goto L_0x0490;
                case 10: goto L_0x0481;
                case 11: goto L_0x0474;
                case 12: goto L_0x0467;
                case 13: goto L_0x045c;
                case 14: goto L_0x0453;
                case 15: goto L_0x0446;
                case 16: goto L_0x0439;
                case 17: goto L_0x0426;
                case 18: goto L_0x0417;
                case 19: goto L_0x0408;
                case 20: goto L_0x03fc;
                case 21: goto L_0x03f0;
                case 22: goto L_0x03e4;
                case 23: goto L_0x03d8;
                case 24: goto L_0x03cc;
                case 25: goto L_0x03c0;
                case 26: goto L_0x03b5;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0399;
                case 29: goto L_0x038c;
                case 30: goto L_0x037f;
                case 31: goto L_0x0372;
                case 32: goto L_0x0365;
                case 33: goto L_0x0358;
                case 34: goto L_0x034b;
                case 35: goto L_0x032b;
                case 36: goto L_0x030e;
                case 37: goto L_0x02f1;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02b6;
                case 40: goto L_0x0298;
                case 41: goto L_0x027a;
                case 42: goto L_0x025c;
                case 43: goto L_0x023e;
                case 44: goto L_0x0220;
                case 45: goto L_0x0202;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01c6;
                case 48: goto L_0x01a8;
                case 49: goto L_0x0198;
                case 50: goto L_0x0188;
                case 51: goto L_0x017a;
                case 52: goto L_0x016e;
                case 53: goto L_0x015e;
                case 54: goto L_0x014e;
                case 55: goto L_0x013e;
                case 56: goto L_0x0132;
                case 57: goto L_0x0125;
                case 58: goto L_0x0118;
                case 59: goto L_0x00fa;
                case 60: goto L_0x00e6;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a7;
                case 65: goto L_0x009b;
                case 66: goto L_0x008b;
                case 67: goto L_0x007b;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0423
        L_0x0065:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            c.q.d.m0 r3 = (p040c.p200q.p405d.C6954m0) r3
            c.q.d.d1 r4 = r0.mo32319u(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m23138t(r9, r3, r4)
            goto L_0x0422
        L_0x007b:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            long r3 = m20522Z(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23109R(r9, r3)
            goto L_0x0422
        L_0x008b:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m20521Y(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23107P(r9, r3)
            goto L_0x0422
        L_0x009b:
            boolean r8 = r0.mo32287H(r1, r9, r5)
            if (r8 == 0) goto L_0x0423
            int r3 = com.google.protobuf.CodedOutputStream.m23105N(r9, r3)
            goto L_0x0422
        L_0x00a7:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m23103L(r9, r3)
            goto L_0x0465
        L_0x00b4:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m20521Y(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23130l(r9, r3)
            goto L_0x0422
        L_0x00c4:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m20521Y(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23114W(r9, r3)
            goto L_0x0422
        L_0x00d4:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m23126h(r9, r3)
            goto L_0x0422
        L_0x00e6:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            c.q.d.d1 r4 = r0.mo32319u(r5)
            int r3 = p040c.p200q.p405d.C6915f1.m19863o(r9, r3, r4)
            goto L_0x0422
        L_0x00fa:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x0110
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m23126h(r9, r3)
            goto L_0x0422
        L_0x0110:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m23111T(r9, r3)
            goto L_0x0422
        L_0x0118:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m23121e(r9, r3)
            goto L_0x0422
        L_0x0125:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m23132n(r9, r3)
            goto L_0x0465
        L_0x0132:
            boolean r8 = r0.mo32287H(r1, r9, r5)
            if (r8 == 0) goto L_0x0423
            int r3 = com.google.protobuf.CodedOutputStream.m23134p(r9, r3)
            goto L_0x0422
        L_0x013e:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = m20521Y(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23141w(r9, r3)
            goto L_0x0422
        L_0x014e:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            long r3 = m20522Z(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23116Y(r9, r3)
            goto L_0x0422
        L_0x015e:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            long r3 = m20522Z(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23143y(r9, r3)
            goto L_0x0422
        L_0x016e:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            int r3 = com.google.protobuf.CodedOutputStream.m23136r(r9, r8)
            goto L_0x0422
        L_0x017a:
            boolean r3 = r0.mo32287H(r1, r9, r5)
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m23128j(r9, r3)
            goto L_0x0422
        L_0x0188:
            c.q.d.h0 r3 = r0.f13365q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.mo32317t(r5)
            int r3 = r3.mo32014f(r9, r4, r8)
            goto L_0x0422
        L_0x0198:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            c.q.d.d1 r4 = r0.mo32319u(r5)
            int r3 = p040c.p200q.p405d.C6915f1.m19858j(r9, r3, r4)
            goto L_0x0422
        L_0x01a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19868t(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x01bc
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01bc:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19866r(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x01da
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01da:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19857i(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x01f8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01f8:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x0202:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19855g(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x0216
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0216:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x0220:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19852e(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x0234
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0234:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x023e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19871w(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x0252
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0252:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x025c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19846b(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x0270
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0270:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x027a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19855g(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x028e
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x028e:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x0298:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19857i(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x02ac
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ac:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x02b6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19860l(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x02ca
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ca:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x02d4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19873y(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x02e8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02e8:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x02f1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19862n(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x0305
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0305:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x030e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19855g(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x0322
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0322:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
            goto L_0x0347
        L_0x032b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19857i(r3)
            if (r3 <= 0) goto L_0x0423
            boolean r4 = r0.f13357i
            if (r4 == 0) goto L_0x033f
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x033f:
            int r4 = com.google.protobuf.CodedOutputStream.m23113V(r9)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r3)
        L_0x0347:
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x0465
        L_0x034b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = p040c.p200q.p405d.C6915f1.m19867s(r9, r3, r4)
            goto L_0x0413
        L_0x0358:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19865q(r9, r3, r4)
            goto L_0x0413
        L_0x0365:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19856h(r9, r3, r4)
            goto L_0x0413
        L_0x0372:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19854f(r9, r3, r4)
            goto L_0x0413
        L_0x037f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19850d(r9, r3, r4)
            goto L_0x0413
        L_0x038c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19870v(r9, r3, r4)
            goto L_0x0422
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19848c(r9, r3)
            goto L_0x0422
        L_0x03a5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            c.q.d.d1 r4 = r0.mo32319u(r5)
            int r3 = p040c.p200q.p405d.C6915f1.m19864p(r9, r3, r4)
            goto L_0x0422
        L_0x03b5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19869u(r9, r3)
            goto L_0x0422
        L_0x03c0:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = p040c.p200q.p405d.C6915f1.m19844a(r9, r3, r4)
            goto L_0x0413
        L_0x03cc:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19854f(r9, r3, r4)
            goto L_0x0413
        L_0x03d8:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19856h(r9, r3, r4)
            goto L_0x0413
        L_0x03e4:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19859k(r9, r3, r4)
            goto L_0x0413
        L_0x03f0:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19872x(r9, r3, r4)
            goto L_0x0413
        L_0x03fc:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19861m(r9, r3, r4)
            goto L_0x0413
        L_0x0408:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19854f(r9, r3, r4)
        L_0x0413:
            int r6 = r6 + r3
            r10 = r4
            goto L_0x051c
        L_0x0417:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p405d.C6915f1.m19856h(r9, r3, r4)
        L_0x0422:
            int r6 = r6 + r3
        L_0x0423:
            r10 = 0
            goto L_0x051c
        L_0x0426:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            c.q.d.m0 r3 = (p040c.p200q.p405d.C6954m0) r3
            c.q.d.d1 r4 = r0.mo32319u(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m23138t(r9, r3, r4)
            goto L_0x0422
        L_0x0439:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23109R(r9, r3)
            goto L_0x0422
        L_0x0446:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23107P(r9, r3)
            goto L_0x0422
        L_0x0453:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0423
            int r3 = com.google.protobuf.CodedOutputStream.m23105N(r9, r3)
            goto L_0x0422
        L_0x045c:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m23103L(r9, r3)
        L_0x0465:
            int r6 = r6 + r4
            goto L_0x0423
        L_0x0467:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23130l(r9, r3)
            goto L_0x0422
        L_0x0474:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23114W(r9, r3)
            goto L_0x0422
        L_0x0481:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m23126h(r9, r3)
            goto L_0x0422
        L_0x0490:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            c.q.d.d1 r4 = r0.mo32319u(r5)
            int r3 = p040c.p200q.p405d.C6915f1.m19863o(r9, r3, r4)
            goto L_0x0422
        L_0x04a1:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x04b5
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m23126h(r9, r3)
            goto L_0x0422
        L_0x04b5:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m23111T(r9, r3)
            goto L_0x0422
        L_0x04bd:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m23121e(r9, r3)
            goto L_0x0422
        L_0x04c8:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0423
            r10 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m23132n(r9, r10)
            goto L_0x051b
        L_0x04d2:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x051c
            int r3 = com.google.protobuf.CodedOutputStream.m23134p(r9, r3)
            goto L_0x051b
        L_0x04dc:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            int r3 = r2.getInt(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23141w(r9, r3)
            goto L_0x051b
        L_0x04ea:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23116Y(r9, r3)
            goto L_0x051b
        L_0x04f8:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            long r3 = r2.getLong(r1, r12)
            int r3 = com.google.protobuf.CodedOutputStream.m23143y(r9, r3)
            goto L_0x051b
        L_0x0506:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            int r3 = com.google.protobuf.CodedOutputStream.m23136r(r9, r8)
            goto L_0x051b
        L_0x0510:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x051c
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m23128j(r9, r3)
        L_0x051b:
            int r6 = r6 + r3
        L_0x051c:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x0522:
            c.q.d.j1<?, ?> r2 = r0.f13363o
            int r2 = r0.mo32326y(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f13354f
            if (r2 == 0) goto L_0x0538
            c.q.d.q<?> r2 = r0.f13364p
            c.q.d.u r1 = r2.mo32330c(r1)
            int r1 = r1.mo32364l()
            int r6 = r6 + r1
        L_0x0538:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32322w(java.lang.Object):int");
    }

    /* renamed from: w0 */
    public final <K, V> void mo32323w0(Writer writer, int i, Object obj, int i2) {
        if (obj != null) {
            writer.mo32136C(i, this.f13365q.mo32011c(mo32317t(i2)), this.f13365q.mo32016h(obj));
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32324x(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f13348s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f13349a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.mo32316s0(r4)
            int r7 = m20528r0(r6)
            int r8 = r15.mo32293T(r4)
            long r9 = m20517U(r6)
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r6 = r6.mo37956id()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.FieldType r6 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r6 = r6.mo37956id()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f13349a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            c.q.d.m0 r6 = (p040c.p200q.p405d.C6954m0) r6
            c.q.d.d1 r7 = r15.mo32319u(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m23138t(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m20522Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23109R(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m20521Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23107P(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23105N(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23103L(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m20521Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23130l(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m20521Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23114W(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m23126h(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            c.q.d.d1 r7 = r15.mo32319u(r4)
            int r6 = p040c.p200q.p405d.C6915f1.m19863o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x00ec
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m23126h(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m23111T(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23121e(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23132n(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23134p(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m20521Y(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23141w(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m20522Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23116Y(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m20522Z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23143y(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23136r(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.mo32287H(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m23128j(r8, r6)
            goto L_0x03c4
        L_0x0162:
            c.q.d.h0 r6 = r0.f13365q
            java.lang.Object r7 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            java.lang.Object r9 = r15.mo32317t(r4)
            int r6 = r6.mo32014f(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m20512J(r1, r9)
            c.q.d.d1 r7 = r15.mo32319u(r4)
            int r6 = p040c.p200q.p405d.C6915f1.m19858j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19868t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19866r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19857i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19855g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19852e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19871w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19846b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19855g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19857i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19860l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19873y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19862n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19855g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p040c.p200q.p405d.C6915f1.m19857i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f13357i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.CodedOutputStream.m23113V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m23115X(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19867s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19865q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19856h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19854f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19850d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19870v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19848c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m20512J(r1, r9)
            c.q.d.d1 r7 = r15.mo32319u(r4)
            int r6 = p040c.p200q.p405d.C6915f1.m19864p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19869u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19844a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19854f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19856h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19859k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19872x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19861m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19854f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m20512J(r1, r9)
            int r6 = p040c.p200q.p405d.C6915f1.m19856h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            c.q.d.m0 r6 = (p040c.p200q.p405d.C6954m0) r6
            c.q.d.d1 r7 = r15.mo32319u(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m23138t(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p040c.p200q.p405d.C6961n1.m20328C(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23109R(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p040c.p200q.p405d.C6961n1.m20326A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23107P(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23105N(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23103L(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p040c.p200q.p405d.C6961n1.m20326A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23130l(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p040c.p200q.p405d.C6961n1.m20326A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23114W(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m23126h(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            c.q.d.d1 r7 = r15.mo32319u(r4)
            int r6 = p040c.p200q.p405d.C6915f1.m19863o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p040c.p200q.p405d.C6961n1.m20330E(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.ByteString
            if (r7 == 0) goto L_0x0469
            com.google.protobuf.ByteString r6 = (com.google.protobuf.ByteString) r6
            int r6 = com.google.protobuf.CodedOutputStream.m23126h(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m23111T(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23121e(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23132n(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23134p(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p040c.p200q.p405d.C6961n1.m20326A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23141w(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p040c.p200q.p405d.C6961n1.m20328C(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23116Y(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p040c.p200q.p405d.C6961n1.m20328C(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m23143y(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m23136r(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.mo32282B(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m23128j(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            c.q.d.j1<?, ?> r2 = r0.f13363o
            int r1 = r15.mo32326y(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6977p0.mo32324x(java.lang.Object):int");
    }

    /* renamed from: x0 */
    public final void mo32325x0(int i, Object obj, Writer writer) {
        if (obj instanceof String) {
            writer.mo32168n(i, (String) obj);
        } else {
            writer.mo32176v(i, (ByteString) obj);
        }
    }

    /* renamed from: y */
    public final <UT, UB> int mo32326y(C6944j1<UT, UB> j1Var, T t) {
        return j1Var.mo32102h(j1Var.mo32101g(t));
    }

    /* renamed from: y0 */
    public final <UT, UB> void mo32327y0(C6944j1<UT, UB> j1Var, T t, Writer writer) {
        j1Var.mo32114t(j1Var.mo32101g(t), writer);
    }
}
