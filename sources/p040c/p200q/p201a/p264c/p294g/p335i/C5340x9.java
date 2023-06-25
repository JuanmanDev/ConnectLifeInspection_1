package p040c.p200q.p201a.p264c.p294g.p335i;

import com.google.android.gms.internal.measurement.zzje;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzlg;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.i.x9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
public final class C5340x9<T> implements C5065fa<T> {

    /* renamed from: o */
    public static final int[] f10250o = new int[0];

    /* renamed from: p */
    public static final Unsafe f10251p = C5082gb.m14156l();

    /* renamed from: a */
    public final int[] f10252a;

    /* renamed from: b */
    public final Object[] f10253b;

    /* renamed from: c */
    public final int f10254c;

    /* renamed from: d */
    public final int f10255d;

    /* renamed from: e */
    public final C5295u9 f10256e;

    /* renamed from: f */
    public final boolean f10257f;

    /* renamed from: g */
    public final boolean f10258g;

    /* renamed from: h */
    public final int[] f10259h;

    /* renamed from: i */
    public final int f10260i;

    /* renamed from: j */
    public final int f10261j;

    /* renamed from: k */
    public final C5128j9 f10262k;

    /* renamed from: l */
    public final C5326wa f10263l;

    /* renamed from: m */
    public final C5095h8 f10264m;

    /* renamed from: n */
    public final C5220p9 f10265n;

    public C5340x9(int[] iArr, Object[] objArr, int i, int i2, C5295u9 u9Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C5370z9 z9Var, C5128j9 j9Var, C5326wa waVar, C5095h8 h8Var, C5220p9 p9Var, byte[] bArr) {
        C5295u9 u9Var2 = u9Var;
        C5095h8 h8Var2 = h8Var;
        this.f10252a = iArr;
        this.f10253b = objArr;
        this.f10254c = i;
        this.f10255d = i2;
        this.f10258g = z;
        boolean z3 = false;
        if (h8Var2 != null && h8Var2.mo27307c(u9Var)) {
            z3 = true;
        }
        this.f10257f = z3;
        this.f10259h = iArr2;
        this.f10260i = i3;
        this.f10261j = i4;
        this.f10262k = j9Var;
        this.f10263l = waVar;
        this.f10264m = h8Var2;
        this.f10256e = u9Var2;
        this.f10265n = p9Var;
    }

    /* renamed from: E */
    public static boolean m15249E(Object obj, int i, C5065fa faVar) {
        return faVar.mo27239c(C5082gb.m14155k(obj, (long) (i & 1048575)));
    }

    /* renamed from: F */
    public static boolean m15250F(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C5279t8) {
            return ((C5279t8) obj).mo27724w();
        }
        return true;
    }

    /* renamed from: H */
    public static boolean m15251H(Object obj, long j) {
        return ((Boolean) C5082gb.m14155k(obj, j)).booleanValue();
    }

    /* renamed from: I */
    public static final void m15252I(int i, Object obj, C5192nb nbVar) {
        if (obj instanceof String) {
            nbVar.mo27113g(i, (String) obj);
        } else {
            nbVar.mo27120n(i, (zzje) obj);
        }
    }

    /* renamed from: K */
    public static C5341xa m15253K(Object obj) {
        C5279t8 t8Var = (C5279t8) obj;
        C5341xa xaVar = t8Var.zzc;
        if (xaVar != C5341xa.m15301c()) {
            return xaVar;
        }
        C5341xa f = C5341xa.m15303f();
        t8Var.zzc = f;
        return f;
    }

    /* renamed from: L */
    public static C5340x9 m15254L(Class cls, C5250r9 r9Var, C5370z9 z9Var, C5128j9 j9Var, C5326wa waVar, C5095h8 h8Var, C5220p9 p9Var) {
        if (r9Var instanceof C5049ea) {
            return m15255M((C5049ea) r9Var, z9Var, j9Var, waVar, h8Var, p9Var);
        }
        C5296ua uaVar = (C5296ua) r9Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0379  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p264c.p294g.p335i.C5340x9 m15255M(p040c.p200q.p201a.p264c.p294g.p335i.C5049ea r34, p040c.p200q.p201a.p264c.p294g.p335i.C5370z9 r35, p040c.p200q.p201a.p264c.p294g.p335i.C5128j9 r36, p040c.p200q.p201a.p264c.p294g.p335i.C5326wa r37, p040c.p200q.p201a.p264c.p294g.p335i.C5095h8 r38, p040c.p200q.p201a.p264c.p294g.p335i.C5220p9 r39) {
        /*
            int r0 = r34.mo27194b()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r34.mo27195c()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f10250o
            r8 = r1
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0166:
            sun.misc.Unsafe r15 = f10251p
            java.lang.Object[] r17 = r34.mo27196d()
            c.q.a.c.g.i.u9 r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r3) goto L_0x03ca
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x0194:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01a6
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x0194
        L_0x01a6:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01ae
        L_0x01ac:
            r2 = r24
        L_0x01ae:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01db
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bc:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01d5
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01bc
        L_0x01d5:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01df
        L_0x01db:
            r28 = r3
            r3 = r24
        L_0x01df:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x0296
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0223
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0204:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0227
        L_0x0223:
            r32 = r12
            r14 = r27
        L_0x0227:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0248:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m15261r(r1, r12)
            r17[r3] = r12
        L_0x0269:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r7 = (int) r7
            int r3 = r3 + 1
            r8 = r17[r3]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0284
        L_0x027c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m15261r(r1, r8)
            r17[r3] = r8
        L_0x0284:
            r3 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r30 = r0
            r8 = r1
            r0 = r7
            r29 = r11
            r25 = 1
            r7 = r3
            r3 = 0
            goto L_0x0391
        L_0x0296:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m15261r(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030e
            r12 = 17
            if (r5 != r12) goto L_0x02ae
            goto L_0x030e
        L_0x02ae:
            r12 = 27
            if (r5 == r12) goto L_0x02fe
            r12 = 49
            if (r5 != r12) goto L_0x02b7
            goto L_0x02fe
        L_0x02b7:
            r12 = 12
            if (r5 == r12) goto L_0x02ee
            r12 = 30
            if (r5 == r12) goto L_0x02ee
            r12 = 44
            if (r5 != r12) goto L_0x02c4
            goto L_0x02ee
        L_0x02c4:
            r12 = 50
            if (r5 != r12) goto L_0x02e4
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e7
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e4:
            r25 = 1
            goto L_0x031b
        L_0x02e7:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031c
        L_0x02ee:
            if (r10 != 0) goto L_0x02e4
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030b
        L_0x02fe:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030b:
            r12 = r27
            goto L_0x031c
        L_0x030e:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031b:
            r12 = r7
        L_0x031c:
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r8 != r11) goto L_0x0379
            r8 = 17
            if (r5 > r8) goto L_0x0379
            int r8 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0355
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033f:
            int r27 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r11) goto L_0x0351
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r3 = r3 | r8
            int r26 = r26 + 13
            r8 = r27
            goto L_0x033f
        L_0x0351:
            int r8 = r8 << r26
            r3 = r3 | r8
            goto L_0x0357
        L_0x0355:
            r27 = r8
        L_0x0357:
            int r8 = r6 + r6
            int r26 = r3 / 32
            int r8 = r8 + r26
            r11 = r17[r8]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0368
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x0370
        L_0x0368:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m15261r(r1, r11)
            r17[r8] = r11
        L_0x0370:
            r8 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r0 = (int) r0
            int r3 = r3 % 32
            goto L_0x0381
        L_0x0379:
            r30 = r0
            r8 = r1
            r0 = r27
            r27 = r3
            r3 = 0
        L_0x0381:
            r1 = 18
            if (r5 < r1) goto L_0x038f
            r1 = 49
            if (r5 > r1) goto L_0x038f
            int r1 = r23 + 1
            r13[r23] = r7
            r23 = r1
        L_0x038f:
            r16 = r12
        L_0x0391:
            int r1 = r9 + 1
            r31[r9] = r4
            int r4 = r1 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x039e
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x039f
        L_0x039e:
            r9 = 0
        L_0x039f:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03a6
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a7
        L_0x03a6:
            r2 = 0
        L_0x03a7:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r7
            r31[r1] = r2
            int r9 = r4 + 1
            int r1 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r8
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03ca:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            c.q.a.c.g.i.x9 r0 = new c.q.a.c.g.i.x9
            r4 = r0
            c.q.a.c.g.i.u9 r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.m15255M(c.q.a.c.g.i.ea, c.q.a.c.g.i.z9, c.q.a.c.g.i.j9, c.q.a.c.g.i.wa, c.q.a.c.g.i.h8, c.q.a.c.g.i.p9):c.q.a.c.g.i.x9");
    }

    /* renamed from: N */
    public static double m15256N(Object obj, long j) {
        return ((Double) C5082gb.m14155k(obj, j)).doubleValue();
    }

    /* renamed from: O */
    public static float m15257O(Object obj, long j) {
        return ((Float) C5082gb.m14155k(obj, j)).floatValue();
    }

    /* renamed from: R */
    public static int m15258R(Object obj, long j) {
        return ((Integer) C5082gb.m14155k(obj, j)).intValue();
    }

    /* renamed from: j */
    public static int m15259j(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: l */
    public static long m15260l(Object obj, long j) {
        return ((Long) C5082gb.m14155k(obj, j)).longValue();
    }

    /* renamed from: r */
    public static Field m15261r(Class cls, String str) {
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

    /* renamed from: s */
    public static void m15262s(Object obj) {
        if (!m15250F(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* renamed from: A */
    public final void mo27896A(C5192nb nbVar, int i, Object obj, int i2) {
        if (obj != null) {
            C5205o9 o9Var = (C5205o9) mo27915o(i2);
            throw null;
        }
    }

    /* renamed from: B */
    public final boolean mo27897B(Object obj, Object obj2, int i) {
        return mo27898C(obj, i) == mo27898C(obj2, i);
    }

    /* renamed from: C */
    public final boolean mo27898C(Object obj, int i) {
        int Y = mo27910Y(i);
        long j = (long) (Y & 1048575);
        if (j != 1048575) {
            return (C5082gb.m14152h(obj, j) & (1 << (Y >>> 20))) != 0;
        }
        int k = mo27912k(i);
        long j2 = (long) (k & 1048575);
        switch (m15259j(k)) {
            case 0:
                return Double.doubleToRawLongBits(C5082gb.m14150f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C5082gb.m14151g(obj, j2)) != 0;
            case 2:
                return C5082gb.m14153i(obj, j2) != 0;
            case 3:
                return C5082gb.m14153i(obj, j2) != 0;
            case 4:
                return C5082gb.m14152h(obj, j2) != 0;
            case 5:
                return C5082gb.m14153i(obj, j2) != 0;
            case 6:
                return C5082gb.m14152h(obj, j2) != 0;
            case 7:
                return C5082gb.m14141B(obj, j2);
            case 8:
                Object k2 = C5082gb.m14155k(obj, j2);
                if (k2 instanceof String) {
                    return !((String) k2).isEmpty();
                }
                if (k2 instanceof zzje) {
                    return !zzje.zzb.equals(k2);
                }
                throw new IllegalArgumentException();
            case 9:
                return C5082gb.m14155k(obj, j2) != null;
            case 10:
                return !zzje.zzb.equals(C5082gb.m14155k(obj, j2));
            case 11:
                return C5082gb.m14152h(obj, j2) != 0;
            case 12:
                return C5082gb.m14152h(obj, j2) != 0;
            case 13:
                return C5082gb.m14152h(obj, j2) != 0;
            case 14:
                return C5082gb.m14153i(obj, j2) != 0;
            case 15:
                return C5082gb.m14152h(obj, j2) != 0;
            case 16:
                return C5082gb.m14153i(obj, j2) != 0;
            case 17:
                return C5082gb.m14155k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: D */
    public final boolean mo27899D(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return mo27898C(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: G */
    public final boolean mo27900G(Object obj, int i, int i2) {
        return C5082gb.m14152h(obj, (long) (mo27910Y(i2) & 1048575)) == i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x033f, code lost:
        if (r0 != r15) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x035b, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a4, code lost:
        if (r0 != r15) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0192, code lost:
        r5 = r26 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0194, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0197, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fb, code lost:
        r5 = r26 | r24;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01fe, code lost:
        r2 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0202, code lost:
        r8 = r6;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0299, code lost:
        r0 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x029b, code lost:
        r5 = r26 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x029d, code lost:
        r2 = r11;
        r3 = r13;
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a3, code lost:
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02a5, code lost:
        r7 = r34;
        r2 = r6;
        r28 = r10;
        r20 = r11;
        r21 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27901J(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p040c.p200q.p201a.p264c.p294g.p335i.C5094h7 r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            m15262s(r30)
            sun.misc.Unsafe r10 = f10251p
            r16 = 0
            r0 = r32
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            r17 = 0
            if (r0 >= r13) goto L_0x040f
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14335k(r0, r12, r1, r9)
            int r1 = r9.f9925a
            r4 = r1
            r1 = r0
            goto L_0x0031
        L_0x0030:
            r4 = r0
        L_0x0031:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003e
            int r3 = r3 / r8
            int r2 = r15.mo27909X(r0, r3)
            goto L_0x0042
        L_0x003e:
            int r2 = r15.mo27908W(r0)
        L_0x0042:
            r3 = -1
            if (r2 != r3) goto L_0x0054
            r20 = r0
            r2 = r1
            r19 = r3
            r8 = r4
            r26 = r5
            r28 = r10
            r7 = r11
            r21 = r16
            goto L_0x03a7
        L_0x0054:
            int[] r3 = r15.f10252a
            int r20 = r2 + 1
            r8 = r3[r20]
            int r11 = m15259j(r8)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r18
            r21 = r1
            long r0 = (long) r0
            r22 = r0
            r0 = 17
            if (r11 > r0) goto L_0x02b0
            int r0 = r2 + 2
            r0 = r3[r0]
            int r3 = r0 >>> 20
            r1 = 1
            int r24 = r1 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r3
            if (r0 == r6) goto L_0x008f
            r18 = r4
            if (r6 == r3) goto L_0x0085
            long r3 = (long) r6
            r10.putInt(r14, r3, r5)
        L_0x0085:
            long r3 = (long) r0
            int r5 = r10.getInt(r14, r3)
            r27 = r0
            r26 = r5
            goto L_0x0095
        L_0x008f:
            r18 = r4
            r26 = r5
            r27 = r6
        L_0x0095:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0280;
                case 1: goto L_0x0264;
                case 2: goto L_0x0244;
                case 3: goto L_0x0244;
                case 4: goto L_0x022c;
                case 5: goto L_0x0206;
                case 6: goto L_0x01e2;
                case 7: goto L_0x01bf;
                case 8: goto L_0x019a;
                case 9: goto L_0x016a;
                case 10: goto L_0x014f;
                case 11: goto L_0x022c;
                case 12: goto L_0x0118;
                case 13: goto L_0x01e2;
                case 14: goto L_0x0206;
                case 15: goto L_0x00f9;
                case 16: goto L_0x00c5;
                default: goto L_0x0099;
            }
        L_0x0099:
            r13 = r2
            r11 = r20
            r6 = r21
            r0 = 3
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a3
            java.lang.Object r7 = r15.mo27916p(r14, r13)
            c.q.a.c.g.i.fa r1 = r15.mo27914n(r13)
            int r0 = r11 << 3
            r5 = r0 | 4
            r0 = r7
            r2 = r31
            r3 = r6
            r4 = r33
            r8 = r18
            r6 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14338n(r0, r1, r2, r3, r4, r5, r6)
            r15.mo27922x(r14, r13, r7)
            goto L_0x0192
        L_0x00c5:
            if (r7 != 0) goto L_0x00eb
            r1 = r21
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r12, r1, r9)
            long r0 = r9.f9926b
            long r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15364b(r0)
            r11 = r20
            r7 = r22
            r0 = r10
            r1 = r30
            r13 = r2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r7
            r8 = r18
            r0.putLong(r1, r2, r4)
            r5 = r26 | r24
            r0 = r6
            goto L_0x0194
        L_0x00eb:
            r13 = r2
            r11 = r20
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r18
            r6 = r21
            goto L_0x02a5
        L_0x00f9:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0197
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r12, r1, r9)
            int r1 = r9.f9925a
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15363a(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0192
        L_0x0118:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0197
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r12, r1, r9)
            int r1 = r9.f9925a
            c.q.a.c.g.i.v8 r2 = r15.mo27913m(r13)
            if (r2 == 0) goto L_0x014b
            boolean r2 = r2.mo26929h(r1)
            if (r2 == 0) goto L_0x013b
            goto L_0x014b
        L_0x013b:
            c.q.a.c.g.i.xa r2 = m15253K(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo27933j(r8, r1)
            r1 = r8
            r2 = r11
            goto L_0x02fb
        L_0x014b:
            r10.putInt(r14, r3, r1)
            goto L_0x0192
        L_0x014f:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r3 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0197
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14325a(r12, r1, r9)
            java.lang.Object r1 = r9.f9927c
            r10.putObject(r14, r3, r1)
            goto L_0x0192
        L_0x016a:
            r13 = r2
            r8 = r18
            r11 = r20
            r1 = r21
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0197
            java.lang.Object r6 = r15.mo27916p(r14, r13)
            c.q.a.c.g.i.fa r2 = r15.mo27914n(r13)
            r0 = r6
            r5 = r1
            r1 = r2
            r2 = r31
            r3 = r5
            r4 = r33
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14339o(r0, r1, r2, r3, r4, r5)
            r15.mo27922x(r14, r13, r6)
        L_0x0192:
            r5 = r26 | r24
        L_0x0194:
            r1 = r8
            goto L_0x01fe
        L_0x0197:
            r6 = r1
            goto L_0x02a5
        L_0x019a:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r0 = 2
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0202
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01b5
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14331g(r12, r5, r9)
            goto L_0x01b9
        L_0x01b5:
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14332h(r12, r5, r9)
        L_0x01b9:
            java.lang.Object r1 = r9.f9927c
            r10.putObject(r14, r3, r1)
            goto L_0x01fb
        L_0x01bf:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0202
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r12, r5, r9)
            long r7 = r9.f9926b
            r17 = 0
            int r2 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x01dc
            goto L_0x01de
        L_0x01dc:
            r1 = r16
        L_0x01de:
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14162r(r14, r3, r1)
            goto L_0x01fb
        L_0x01e2:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0202
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r12, r5)
            r10.putInt(r14, r3, r0)
            int r0 = r5 + 4
        L_0x01fb:
            r5 = r26 | r24
            r1 = r6
        L_0x01fe:
            r2 = r11
            r3 = r13
            goto L_0x02fe
        L_0x0202:
            r8 = r6
            r6 = r5
            goto L_0x02a5
        L_0x0206:
            r13 = r2
            r6 = r18
            r11 = r20
            r5 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0227
            long r7 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r12, r5)
            r0 = r10
            r1 = r30
            r2 = r3
            r18 = r6
            r6 = r5
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x0299
        L_0x0227:
            r18 = r6
            r6 = r5
            goto L_0x02a3
        L_0x022c:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a3
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r12, r6, r9)
            int r1 = r9.f9925a
            r10.putInt(r14, r3, r1)
            goto L_0x029b
        L_0x0244:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a3
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r12, r6, r9)
            long r7 = r9.f9926b
            r0 = r10
            r1 = r30
            r2 = r3
            r4 = r7
            r0.putLong(r1, r2, r4)
            r5 = r26 | r24
            r0 = r6
            goto L_0x029d
        L_0x0264:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a3
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r12, r6)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14165u(r14, r3, r0)
            int r0 = r6 + 4
            goto L_0x029b
        L_0x0280:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02a3
            long r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r12, r6)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14164t(r14, r3, r0)
        L_0x0299:
            int r0 = r6 + 8
        L_0x029b:
            r5 = r26 | r24
        L_0x029d:
            r2 = r11
            r3 = r13
            r1 = r18
            goto L_0x02fe
        L_0x02a3:
            r8 = r18
        L_0x02a5:
            r7 = r34
            r2 = r6
            r28 = r10
            r20 = r11
            r21 = r13
            goto L_0x0376
        L_0x02b0:
            r13 = r2
            r2 = r4
            r27 = r6
            r1 = r20
            r6 = r21
            r3 = r22
            r19 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r11 != r0) goto L_0x0313
            r0 = 2
            if (r7 != r0) goto L_0x0306
            java.lang.Object r0 = r10.getObject(r14, r3)
            c.q.a.c.g.i.y8 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5354y8) r0
            boolean r7 = r0.mo27230b()
            if (r7 != 0) goto L_0x02e3
            int r7 = r0.size()
            if (r7 != 0) goto L_0x02db
            r7 = 10
            goto L_0x02dc
        L_0x02db:
            int r7 = r7 + r7
        L_0x02dc:
            c.q.a.c.g.i.y8 r0 = r0.mo27013i(r7)
            r10.putObject(r14, r3, r0)
        L_0x02e3:
            r7 = r0
            c.q.a.c.g.i.fa r0 = r15.mo27914n(r13)
            r8 = r1
            r1 = r2
            r11 = r2
            r2 = r31
            r3 = r6
            r4 = r33
            r26 = r5
            r5 = r7
            r6 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14329e(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r1 = r11
        L_0x02fb:
            r3 = r13
            r5 = r26
        L_0x02fe:
            r6 = r27
            r13 = r33
            r11 = r34
            goto L_0x001d
        L_0x0306:
            r26 = r5
            r20 = r1
            r18 = r2
            r15 = r6
            r28 = r10
            r21 = r13
            goto L_0x0371
        L_0x0313:
            r26 = r5
            r5 = r2
            r2 = r1
            r0 = 49
            if (r11 > r0) goto L_0x035f
            long r0 = (long) r8
            r21 = r0
            r0 = r29
            r1 = r30
            r8 = r2
            r2 = r31
            r24 = r3
            r3 = r6
            r4 = r33
            r18 = r5
            r15 = r6
            r6 = r8
            r20 = r8
            r8 = r13
            r28 = r10
            r9 = r21
            r21 = r13
            r12 = r24
            r14 = r35
            int r0 = r0.mo27907V(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x035b
        L_0x0341:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r18
            r2 = r20
            r3 = r21
            r5 = r26
            r6 = r27
            r10 = r28
            goto L_0x001d
        L_0x035b:
            r7 = r34
            r2 = r0
            goto L_0x0374
        L_0x035f:
            r20 = r2
            r24 = r3
            r18 = r5
            r15 = r6
            r28 = r10
            r21 = r13
            r0 = 50
            if (r11 != r0) goto L_0x038c
            r0 = 2
            if (r7 == r0) goto L_0x0379
        L_0x0371:
            r7 = r34
            r2 = r15
        L_0x0374:
            r8 = r18
        L_0x0376:
            r6 = r27
            goto L_0x03a7
        L_0x0379:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r21
            r6 = r24
            r8 = r35
            r0.mo27904S(r1, r2, r3, r4, r5, r6, r8)
            throw r17
        L_0x038c:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r20
            r9 = r11
            r10 = r24
            r12 = r21
            r13 = r35
            int r0 = r0.mo27905T(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x035b
            goto L_0x0341
        L_0x03a7:
            if (r8 != r7) goto L_0x03b5
            if (r7 == 0) goto L_0x03b5
            r9 = r29
            r12 = r30
            r0 = r2
            r1 = r8
            r5 = r26
            goto L_0x0418
        L_0x03b5:
            r9 = r29
            boolean r0 = r9.f10257f
            if (r0 == 0) goto L_0x03e8
            r10 = r35
            c.q.a.c.g.i.g8 r0 = r10.f9928d
            c.q.a.c.g.i.g8 r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5079g8.f9907c
            if (r0 == r1) goto L_0x03e5
            c.q.a.c.g.i.u9 r1 = r9.f10256e
            r11 = r20
            c.q.a.c.g.i.s8 r0 = r0.mo27273b(r1, r11)
            if (r0 != 0) goto L_0x03df
            c.q.a.c.g.i.xa r4 = m15253K(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14333i(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x03fd
        L_0x03df:
            r12 = r30
            r0 = r12
            c.q.a.c.g.i.r8 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5249r8) r0
            throw r17
        L_0x03e5:
            r12 = r30
            goto L_0x03ec
        L_0x03e8:
            r12 = r30
            r10 = r35
        L_0x03ec:
            r11 = r20
            c.q.a.c.g.i.xa r4 = m15253K(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14333i(r0, r1, r2, r3, r4, r5)
        L_0x03fd:
            r13 = r33
            r1 = r8
            r15 = r9
            r9 = r10
            r2 = r11
            r14 = r12
            r3 = r21
            r5 = r26
            r10 = r28
            r12 = r31
            r11 = r7
            goto L_0x001d
        L_0x040f:
            r26 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
        L_0x0418:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x0423
            long r3 = (long) r6
            r6 = r28
            r6.putInt(r12, r3, r5)
        L_0x0423:
            int r3 = r9.f10260i
        L_0x0425:
            int r4 = r9.f10261j
            if (r3 >= r4) goto L_0x0450
            int[] r4 = r9.f10259h
            r4 = r4[r3]
            int[] r5 = r9.f10252a
            r5 = r5[r4]
            int r5 = r9.mo27912k(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r5)
            if (r5 != 0) goto L_0x043e
            goto L_0x0444
        L_0x043e:
            c.q.a.c.g.i.v8 r6 = r9.mo27913m(r4)
            if (r6 != 0) goto L_0x0447
        L_0x0444:
            int r3 = r3 + 1
            goto L_0x0425
        L_0x0447:
            com.google.android.gms.internal.measurement.zzlg r5 = (com.google.android.gms.internal.measurement.zzlg) r5
            java.lang.Object r0 = r9.mo27915o(r4)
            c.q.a.c.g.i.o9 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5205o9) r0
            throw r17
        L_0x0450:
            if (r7 != 0) goto L_0x045c
            r2 = r33
            if (r0 != r2) goto L_0x0457
            goto L_0x0462
        L_0x0457:
            com.google.android.gms.internal.measurement.zzkp r0 = com.google.android.gms.internal.measurement.zzkp.zze()
            throw r0
        L_0x045c:
            r2 = r33
            if (r0 > r2) goto L_0x0463
            if (r1 != r7) goto L_0x0463
        L_0x0462:
            return r0
        L_0x0463:
            com.google.android.gms.internal.measurement.zzkp r0 = com.google.android.gms.internal.measurement.zzkp.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.mo27901J(java.lang.Object, byte[], int, int, int, c.q.a.c.g.i.h7):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x030a, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030b, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030c, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x034a, code lost:
        r6 = r6 + r3;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x037e, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0489, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0504, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0505, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x052e, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x053c, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054b, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x054f, code lost:
        r5 = r5 + 3;
        r3 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ef, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019c, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ac, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bc, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27902P(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f10251p
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r3
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000d:
            int[] r9 = r0.f10252a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0556
            int r9 = r0.mo27912k(r5)
            int[] r10 = r0.f10252a
            r11 = r10[r5]
            int r12 = m15259j(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0036
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0037
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            r9 = r9 & r3
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x0540;
                case 1: goto L_0x0531;
                case 2: goto L_0x051b;
                case 3: goto L_0x0507;
                case 4: goto L_0x04f1;
                case 5: goto L_0x04e5;
                case 6: goto L_0x04d9;
                case 7: goto L_0x04cb;
                case 8: goto L_0x04a0;
                case 9: goto L_0x048d;
                case 10: goto L_0x0470;
                case 11: goto L_0x045b;
                case 12: goto L_0x0446;
                case 13: goto L_0x0439;
                case 14: goto L_0x042c;
                case 15: goto L_0x0412;
                case 16: goto L_0x03f8;
                case 17: goto L_0x03e4;
                case 18: goto L_0x03d6;
                case 19: goto L_0x03ca;
                case 20: goto L_0x03be;
                case 21: goto L_0x03b2;
                case 22: goto L_0x03a6;
                case 23: goto L_0x039a;
                case 24: goto L_0x038e;
                case 25: goto L_0x0382;
                case 26: goto L_0x0374;
                case 27: goto L_0x0365;
                case 28: goto L_0x035a;
                case 29: goto L_0x034e;
                case 30: goto L_0x033f;
                case 31: goto L_0x0333;
                case 32: goto L_0x0327;
                case 33: goto L_0x031b;
                case 34: goto L_0x030f;
                case 35: goto L_0x02f6;
                case 36: goto L_0x02e1;
                case 37: goto L_0x02cc;
                case 38: goto L_0x02b7;
                case 39: goto L_0x02a2;
                case 40: goto L_0x028d;
                case 41: goto L_0x0277;
                case 42: goto L_0x0261;
                case 43: goto L_0x024b;
                case 44: goto L_0x0235;
                case 45: goto L_0x021f;
                case 46: goto L_0x0209;
                case 47: goto L_0x01f3;
                case 48: goto L_0x01dd;
                case 49: goto L_0x01cd;
                case 50: goto L_0x01c0;
                case 51: goto L_0x01b0;
                case 52: goto L_0x01a0;
                case 53: goto L_0x0188;
                case 54: goto L_0x0173;
                case 55: goto L_0x015d;
                case 56: goto L_0x0150;
                case 57: goto L_0x0143;
                case 58: goto L_0x0134;
                case 59: goto L_0x0107;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00d5;
                case 62: goto L_0x00bf;
                case 63: goto L_0x00a9;
                case 64: goto L_0x009b;
                case 65: goto L_0x008d;
                case 66: goto L_0x0072;
                case 67: goto L_0x0056;
                case 68: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x037f
        L_0x0040:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.i.u9 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5295u9) r3
            c.q.a.c.g.i.fa r4 = r0.mo27914n(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13827y(r11, r3, r4)
            goto L_0x037e
        L_0x0056:
            boolean r10 = r0.mo27900G(r1, r11, r5)
            if (r10 == 0) goto L_0x037f
            long r3 = m15260l(r1, r3)
            int r10 = r11 << 3
            int r10 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037f
        L_0x0072:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m15258R(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030b
        L_0x008d:
            boolean r3 = r0.mo27900G(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x01bc
        L_0x009b:
            boolean r3 = r0.mo27900G(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x01ac
        L_0x00a9:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m15258R(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r3)
            goto L_0x030b
        L_0x00bf:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m15258R(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030b
        L_0x00d5:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.zzje r3 = (com.google.android.gms.internal.measurement.zzje) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
        L_0x00ef:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030c
        L_0x00f3:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.i.fa r4 = r0.mo27914n(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14232Q(r11, r3, r4)
            goto L_0x037e
        L_0x0107:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzje
            if (r4 == 0) goto L_0x0126
            com.google.android.gms.internal.measurement.zzje r3 = (com.google.android.gms.internal.measurement.zzje) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x00ef
        L_0x0126:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13820C(r3)
            goto L_0x030b
        L_0x0134:
            boolean r3 = r0.mo27900G(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            int r3 = r3 + r14
            goto L_0x037e
        L_0x0143:
            boolean r3 = r0.mo27900G(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x01ac
        L_0x0150:
            boolean r3 = r0.mo27900G(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x01bc
        L_0x015d:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m15258R(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r3)
            goto L_0x030b
        L_0x0173:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            long r3 = m15260l(r1, r3)
            int r9 = r11 << 3
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r3)
            goto L_0x019c
        L_0x0188:
            boolean r9 = r0.mo27900G(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            long r3 = m15260l(r1, r3)
            int r9 = r11 << 3
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r3)
        L_0x019c:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037f
        L_0x01a0:
            boolean r3 = r0.mo27900G(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
        L_0x01ac:
            int r3 = r3 + 4
            goto L_0x037e
        L_0x01b0:
            boolean r3 = r0.mo27900G(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
        L_0x01bc:
            int r3 = r3 + 8
            goto L_0x037e
        L_0x01c0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.mo27915o(r5)
            p040c.p200q.p201a.p264c.p294g.p335i.C5220p9.m14648a(r11, r3, r4)
            goto L_0x037f
        L_0x01cd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            c.q.a.c.g.i.fa r4 = r0.mo27914n(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14227L(r11, r3, r4)
            goto L_0x037e
        L_0x01dd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14237V(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x01f3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14235T(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x0209:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14226K(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x021f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14224I(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x0235:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14222G(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x024b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14240Y(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x0261:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14219D(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x0277:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14224I(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x028d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14226K(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x02a2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14229N(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x02b7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14243a0(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x02cc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14231P(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x02e1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14224I(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x030a
        L_0x02f6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14226K(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
        L_0x030a:
            int r4 = r4 + r9
        L_0x030b:
            int r4 = r4 + r3
        L_0x030c:
            int r6 = r6 + r4
            goto L_0x037f
        L_0x030f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14236U(r11, r3, r9)
            goto L_0x034a
        L_0x031b:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14234S(r11, r3, r9)
            goto L_0x034a
        L_0x0327:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14225J(r11, r3, r9)
            goto L_0x034a
        L_0x0333:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14223H(r11, r3, r9)
            goto L_0x034a
        L_0x033f:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14221F(r11, r3, r9)
        L_0x034a:
            int r6 = r6 + r3
            r12 = r9
            goto L_0x054f
        L_0x034e:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14239X(r11, r3, r9)
            goto L_0x037e
        L_0x035a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14220E(r11, r3)
            goto L_0x037e
        L_0x0365:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            c.q.a.c.g.i.fa r4 = r0.mo27914n(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14233R(r11, r3, r4)
            goto L_0x037e
        L_0x0374:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14238W(r11, r3)
        L_0x037e:
            int r6 = r6 + r3
        L_0x037f:
            r12 = 0
            goto L_0x054f
        L_0x0382:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14216A(r11, r3, r12)
            goto L_0x03e1
        L_0x038e:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14223H(r11, r3, r12)
            goto L_0x03e1
        L_0x039a:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14225J(r11, r3, r12)
            goto L_0x03e1
        L_0x03a6:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14228M(r11, r3, r12)
            goto L_0x03e1
        L_0x03b2:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14241Z(r11, r3, r12)
            goto L_0x03e1
        L_0x03be:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14230O(r11, r3, r12)
            goto L_0x03e1
        L_0x03ca:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14223H(r11, r3, r12)
            goto L_0x03e1
        L_0x03d6:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14225J(r11, r3, r12)
        L_0x03e1:
            int r6 = r6 + r3
            goto L_0x054f
        L_0x03e4:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.i.u9 r3 = (p040c.p200q.p201a.p264c.p294g.p335i.C5295u9) r3
            c.q.a.c.g.i.fa r4 = r0.mo27914n(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13827y(r11, r3, r4)
            goto L_0x03e1
        L_0x03f8:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054f
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054f
        L_0x0412:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x0504
        L_0x042c:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x054b
        L_0x0439:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x053c
        L_0x0446:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r3)
            goto L_0x0504
        L_0x045b:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x0504
        L_0x0470:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.measurement.zzje r3 = (com.google.android.gms.internal.measurement.zzje) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
        L_0x0489:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0505
        L_0x048d:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.i.fa r4 = r0.mo27914n(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14232Q(r11, r3, r4)
            goto L_0x03e1
        L_0x04a0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.measurement.zzje
            if (r4 == 0) goto L_0x04be
            com.google.android.gms.internal.measurement.zzje r3 = (com.google.android.gms.internal.measurement.zzje) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x0489
        L_0x04be:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13820C(r3)
            goto L_0x0504
        L_0x04cb:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            int r3 = r3 + r14
            goto L_0x03e1
        L_0x04d9:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x053c
        L_0x04e5:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
            goto L_0x054b
        L_0x04f1:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r3)
        L_0x0504:
            int r4 = r4 + r3
        L_0x0505:
            int r6 = r6 + r4
            goto L_0x054f
        L_0x0507:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r3)
            goto L_0x052e
        L_0x051b:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r3)
        L_0x052e:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054f
        L_0x0531:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
        L_0x053c:
            int r3 = r3 + 4
            goto L_0x03e1
        L_0x0540:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r3)
        L_0x054b:
            int r3 = r3 + 8
            goto L_0x03e1
        L_0x054f:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0556:
            c.q.a.c.g.i.wa r2 = r0.f10263l
            java.lang.Object r3 = r2.mo27867d(r1)
            int r2 = r2.mo27864a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f10257f
            if (r2 != 0) goto L_0x0566
            return r6
        L_0x0566:
            c.q.a.c.g.i.h8 r2 = r0.f10264m
            r2.mo27305a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.mo27902P(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27903Q(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f10251p
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f10252a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.mo27912k(r2)
            int r5 = m15259j(r4)
            int[] r6 = r11.f10252a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.measurement.zzjx r4 = com.google.android.gms.internal.measurement.zzjx.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.zzjx r4 = com.google.android.gms.internal.measurement.zzjx.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f10252a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            c.q.a.c.g.i.u9 r4 = (p040c.p200q.p201a.p264c.p294g.p335i.C5295u9) r4
            c.q.a.c.g.i.fa r5 = r11.mo27914n(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13827y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.mo27900G(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m15260l(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m15258R(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m15258R(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m15258R(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            com.google.android.gms.internal.measurement.zzje r4 = (com.google.android.gms.internal.measurement.zzje) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            c.q.a.c.g.i.fa r5 = r11.mo27914n(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14232Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzje
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.measurement.zzje r4 = (com.google.android.gms.internal.measurement.zzje) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13820C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m15258R(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m15260l(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m15260l(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.mo27900G(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.lang.Object r5 = r11.mo27915o(r2)
            p040c.p200q.p201a.p264c.p294g.p335i.C5220p9.m14648a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            c.q.a.c.g.i.fa r5 = r11.mo27914n(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14227L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14237V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14235T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14226K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14224I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14222G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14240Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14219D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14224I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14226K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14229N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14243a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14231P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14224I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14226K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13821D(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14236U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14234S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14225J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14223H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14221F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14239X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14220E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            c.q.a.c.g.i.fa r5 = r11.mo27914n(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14233R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14238W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14216A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14223H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14225J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14228M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14241Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14230O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14223H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14225J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            c.q.a.c.g.i.u9 r4 = (p040c.p200q.p201a.p264c.p294g.p335i.C5295u9) r4
            c.q.a.c.g.i.fa r5 = r11.mo27914n(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13827y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.mo27898C(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            com.google.android.gms.internal.measurement.zzje r4 = (com.google.android.gms.internal.measurement.zzje) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            c.q.a.c.g.i.fa r5 = r11.mo27914n(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14232Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.zzje
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.measurement.zzje r4 = (com.google.android.gms.internal.measurement.zzje) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13820C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13828z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13823b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.mo27898C(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C4999b8.m13822a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            c.q.a.c.g.i.wa r0 = r11.f10263l
            java.lang.Object r12 = r0.mo27867d(r12)
            int r12 = r0.mo27864a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.mo27903Q(java.lang.Object):int");
    }

    /* renamed from: S */
    public final int mo27904S(Object obj, byte[] bArr, int i, int i2, int i3, long j, C5094h7 h7Var) {
        Unsafe unsafe = f10251p;
        Object o = mo27915o(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlg) object).zze()) {
            zzlg zzb = zzlg.zza().zzb();
            C5220p9.m14649b(zzb, object);
            unsafe.putObject(obj, j, zzb);
        }
        C5205o9 o9Var = (C5205o9) o;
        throw null;
    }

    /* renamed from: T */
    public final int mo27905T(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C5094h7 h7Var) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C5094h7 h7Var2 = h7Var;
        Unsafe unsafe = f10251p;
        long j3 = (long) (this.f10252a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(C5110i7.m14340p(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(C5110i7.m14326b(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = C5110i7.m14337m(bArr2, i9, h7Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(h7Var2.f9926b));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = C5110i7.m14334j(bArr2, i9, h7Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(h7Var2.f9925a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(C5110i7.m14340p(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(C5110i7.m14326b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = C5110i7.m14337m(bArr2, i9, h7Var2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(h7Var2.f9926b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = C5110i7.m14334j(bArr2, i9, h7Var2);
                    int i14 = h7Var2.f9925a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C5177mb.m14503f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i14, C5369z8.f10297a));
                        j5 += i14;
                    } else {
                        throw zzkp.zzc();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object q = mo27917q(obj2, i11, i13);
                    int o = C5110i7.m14339o(q, mo27914n(i13), bArr, i, i2, h7Var);
                    mo27923y(obj2, i11, i13, q);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C5110i7.m14325a(bArr2, i9, h7Var2);
                    unsafe.putObject(obj2, j2, h7Var2.f9927c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = C5110i7.m14334j(bArr2, i9, h7Var2);
                    int i15 = h7Var2.f9925a;
                    C5309v8 m3 = mo27913m(i13);
                    if (m3 == null || m3.mo26929h(i15)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m15253K(obj).mo27933j(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = C5110i7.m14334j(bArr2, i9, h7Var2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(C5353y7.m15363a(h7Var2.f9925a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m4 = C5110i7.m14337m(bArr2, i9, h7Var2);
                    unsafe.putObject(obj2, j2, Long.valueOf(C5353y7.m15364b(h7Var2.f9926b)));
                    unsafe.putInt(obj2, j3, i11);
                    return m4;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object q2 = mo27917q(obj2, i11, i13);
                    int n = C5110i7.m14338n(q2, mo27914n(i13), bArr, i, i2, (i10 & -8) | 4, h7Var);
                    mo27923y(obj2, i11, i13, q2);
                    return n;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0349, code lost:
        if (r0 != r14) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0114, code lost:
        r6 = r6 | r10;
        r13 = r34;
        r9 = r7;
        r2 = r15;
        r7 = r20;
        r1 = r23;
        r8 = 1048575;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014b, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021b, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0238, code lost:
        r6 = r6 | r10;
        r9 = r7;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x023b, code lost:
        r8 = r19;
        r7 = r20;
        r1 = r23;
        r10 = -1;
        r15 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0243, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0247, code lost:
        r2 = r4;
        r29 = r7;
        r7 = r20;
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02e7, code lost:
        if (r0 != r24) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02fc, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27906U(java.lang.Object r31, byte[] r32, int r33, int r34, p040c.p200q.p201a.p264c.p294g.p335i.C5094h7 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            m15262s(r31)
            sun.misc.Unsafe r9 = f10251p
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x001c:
            if (r0 >= r13) goto L_0x0372
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14335k(r0, r12, r3, r11)
            int r3 = r11.f9925a
            r4 = r0
            r17 = r3
            goto L_0x0031
        L_0x002e:
            r17 = r0
            r4 = r3
        L_0x0031:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003e
            int r2 = r2 / 3
            int r0 = r15.mo27909X(r5, r2)
            goto L_0x0042
        L_0x003e:
            int r0 = r15.mo27908W(r5)
        L_0x0042:
            r2 = r0
            if (r2 != r10) goto L_0x0050
            r2 = r4
            r23 = r5
            r29 = r9
            r18 = r10
            r15 = r16
            goto L_0x034c
        L_0x0050:
            int[] r0 = r15.f10252a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = m15259j(r1)
            r10 = r1 & r8
            r19 = r9
            long r8 = (long) r10
            r10 = 17
            r33 = r5
            if (r13 > r10) goto L_0x0250
            int r10 = r2 + 2
            r0 = r0[r10]
            int r10 = r0 >>> 20
            r5 = 1
            int r10 = r5 << r10
            r15 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r15
            if (r0 == r7) goto L_0x008d
            r22 = r1
            r20 = r2
            if (r7 == r15) goto L_0x0081
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x0081:
            r7 = r19
        L_0x0083:
            if (r0 == r15) goto L_0x008a
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x008a:
            r2 = r7
            r7 = r0
            goto L_0x0093
        L_0x008d:
            r22 = r1
            r20 = r2
            r2 = r19
        L_0x0093:
            r0 = 5
            switch(r13) {
                case 0: goto L_0x021e;
                case 1: goto L_0x0203;
                case 2: goto L_0x01e3;
                case 3: goto L_0x01e3;
                case 4: goto L_0x01cc;
                case 5: goto L_0x01ad;
                case 6: goto L_0x0197;
                case 7: goto L_0x0176;
                case 8: goto L_0x0152;
                case 9: goto L_0x0123;
                case 10: goto L_0x0101;
                case 11: goto L_0x01cc;
                case 12: goto L_0x00ee;
                case 13: goto L_0x0197;
                case 14: goto L_0x01ad;
                case 15: goto L_0x00d7;
                case 16: goto L_0x00a4;
                default: goto L_0x0097;
            }
        L_0x0097:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x0247
        L_0x00a4:
            if (r3 != 0) goto L_0x00ce
            int r13 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r12, r4, r11)
            long r0 = r11.f9926b
            long r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15364b(r0)
            r0 = r2
            r1 = r31
            r15 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r23 = r33
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r0 = r13
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            r15 = r30
            goto L_0x0243
        L_0x00ce:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            goto L_0x014b
        L_0x00d7:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x014b
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r12, r4, r11)
            int r1 = r11.f9925a
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15363a(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0114
        L_0x00ee:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x014b
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r12, r4, r11)
            int r1 = r11.f9925a
            r7.putInt(r14, r8, r1)
            goto L_0x0114
        L_0x0101:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x014b
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14325a(r12, r4, r11)
            java.lang.Object r1 = r11.f9927c
            r7.putObject(r14, r8, r1)
        L_0x0114:
            r6 = r6 | r10
            r13 = r34
            r9 = r7
            r2 = r15
            r7 = r20
            r1 = r23
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = -1
            goto L_0x036e
        L_0x0123:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x014b
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            java.lang.Object r8 = r13.mo27916p(r14, r15)
            c.q.a.c.g.i.fa r1 = r13.mo27914n(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14339o(r0, r1, r2, r3, r4, r5)
            r13.mo27922x(r14, r15, r8)
            goto L_0x0238
        L_0x014b:
            r13 = r30
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0247
        L_0x0152:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0247
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x016b
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14331g(r12, r4, r11)
            goto L_0x016f
        L_0x016b:
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14332h(r12, r4, r11)
        L_0x016f:
            java.lang.Object r1 = r11.f9927c
            r7.putObject(r14, r8, r1)
            goto L_0x0238
        L_0x0176:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0247
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r12, r4, r11)
            long r1 = r11.f9926b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0190
            goto L_0x0192
        L_0x0190:
            r5 = r16
        L_0x0192:
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14162r(r14, r8, r5)
            goto L_0x0238
        L_0x0197:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0247
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r12, r4)
            r7.putInt(r14, r8, r0)
            goto L_0x021b
        L_0x01ad:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x0247
            long r21 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0238
        L_0x01cc:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0247
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r12, r4, r11)
            int r1 = r11.f9925a
            r7.putInt(r14, r8, r1)
            goto L_0x0238
        L_0x01e3:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x0247
            int r17 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r12, r4, r11)
            long r4 = r11.f9926b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r10
            r9 = r7
            r2 = r15
            r0 = r17
            goto L_0x023b
        L_0x0203:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0247
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14165u(r14, r8, r0)
        L_0x021b:
            int r0 = r4 + 4
            goto L_0x0238
        L_0x021e:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r5) goto L_0x0247
            long r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14164t(r14, r8, r0)
            int r0 = r4 + 8
        L_0x0238:
            r6 = r6 | r10
            r9 = r7
            r2 = r15
        L_0x023b:
            r8 = r19
            r7 = r20
            r1 = r23
            r10 = -1
            r15 = r13
        L_0x0243:
            r13 = r34
            goto L_0x001c
        L_0x0247:
            r2 = r4
            r29 = r7
            r7 = r20
            r18 = -1
            goto L_0x034c
        L_0x0250:
            r23 = r33
            r22 = r1
            r20 = r7
            r10 = r15
            r7 = r19
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r2
            r0 = 27
            if (r13 != r0) goto L_0x02ae
            r0 = 2
            if (r3 != r0) goto L_0x02a3
            java.lang.Object r0 = r7.getObject(r14, r8)
            c.q.a.c.g.i.y8 r0 = (p040c.p200q.p201a.p264c.p294g.p335i.C5354y8) r0
            boolean r1 = r0.mo27230b()
            if (r1 != 0) goto L_0x0281
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0279
            r1 = 10
            goto L_0x027a
        L_0x0279:
            int r1 = r1 + r1
        L_0x027a:
            c.q.a.c.g.i.y8 r0 = r0.mo27013i(r1)
            r7.putObject(r14, r8, r0)
        L_0x0281:
            r5 = r0
            c.q.a.c.g.i.fa r0 = r10.mo27914n(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14329e(r0, r1, r2, r3, r4, r5, r6)
            r13 = r34
            r9 = r7
            r6 = r8
            r2 = r15
            r8 = r19
            r7 = r20
            r1 = r23
            r15 = r10
            r10 = -1
            goto L_0x001c
        L_0x02a3:
            r14 = r4
            r25 = r6
            r29 = r7
            r26 = r20
            r18 = -1
            goto L_0x0316
        L_0x02ae:
            r0 = 49
            if (r13 > r0) goto L_0x02fe
            r1 = r22
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r5 = r3
            r3 = r4
            r24 = r4
            r4 = r34
            r33 = r5
            r5 = r17
            r25 = r6
            r6 = r23
            r26 = r20
            r20 = r7
            r7 = r33
            r27 = r8
            r9 = r19
            r8 = r15
            r29 = r20
            r18 = -1
            r9 = r21
            r11 = r13
            r12 = r27
            r14 = r35
            int r0 = r0.mo27907V(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r24
            if (r0 == r14) goto L_0x02fc
        L_0x02e9:
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r10 = r18
            r1 = r23
            r6 = r25
            r7 = r26
            goto L_0x0369
        L_0x02fc:
            r2 = r0
            goto L_0x0317
        L_0x02fe:
            r33 = r3
            r14 = r4
            r25 = r6
            r29 = r7
            r27 = r8
            r26 = r20
            r1 = r22
            r18 = -1
            r0 = 50
            if (r13 != r0) goto L_0x032f
            r7 = r33
            r0 = 2
            if (r7 == r0) goto L_0x031c
        L_0x0316:
            r2 = r14
        L_0x0317:
            r6 = r25
            r7 = r26
            goto L_0x034c
        L_0x031c:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r15
            r6 = r27
            r8 = r35
            r0.mo27904S(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x032f:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r14
            r4 = r34
            r5 = r17
            r6 = r23
            r9 = r13
            r10 = r27
            r12 = r15
            r13 = r35
            int r0 = r0.mo27905T(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02fc
            goto L_0x02e9
        L_0x034c:
            c.q.a.c.g.i.xa r4 = m15253K(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14333i(r0, r1, r2, r3, r4, r5)
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r15
            r10 = r18
            r1 = r23
        L_0x0369:
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
        L_0x036e:
            r15 = r30
            goto L_0x001c
        L_0x0372:
            r25 = r6
            r1 = r8
            r29 = r9
            if (r7 == r1) goto L_0x0383
            long r1 = (long) r7
            r3 = r31
            r6 = r25
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0383:
            r1 = r34
            if (r0 != r1) goto L_0x0388
            return r0
        L_0x0388:
            com.google.android.gms.internal.measurement.zzkp r0 = com.google.android.gms.internal.measurement.zzkp.zze()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.mo27906U(java.lang.Object, byte[], int, int, c.q.a.c.g.i.h7):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x044a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ca  */
    /* renamed from: V */
    public final int mo27907V(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p040c.p200q.p201a.p264c.p294g.p335i.C5094h7 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f10251p
            java.lang.Object r11 = r11.getObject(r1, r9)
            c.q.a.c.g.i.y8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5354y8) r11
            boolean r12 = r11.mo27230b()
            if (r12 != 0) goto L_0x0034
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002a
            r12 = 10
            goto L_0x002b
        L_0x002a:
            int r12 = r12 + r12
        L_0x002b:
            c.q.a.c.g.i.y8 r11 = r11.mo27013i(r12)
            sun.misc.Unsafe r12 = f10251p
            r12.putObject(r1, r9, r11)
        L_0x0034:
            r9 = 5
            r12 = 0
            r10 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03db;
                case 19: goto L_0x038e;
                case 20: goto L_0x034b;
                case 21: goto L_0x034b;
                case 22: goto L_0x0330;
                case 23: goto L_0x02ef;
                case 24: goto L_0x02ae;
                case 25: goto L_0x0255;
                case 26: goto L_0x01a2;
                case 27: goto L_0x0187;
                case 28: goto L_0x012d;
                case 29: goto L_0x0330;
                case 30: goto L_0x00fc;
                case 31: goto L_0x02ae;
                case 32: goto L_0x02ef;
                case 33: goto L_0x00ad;
                case 34: goto L_0x005e;
                case 35: goto L_0x03db;
                case 36: goto L_0x038e;
                case 37: goto L_0x034b;
                case 38: goto L_0x034b;
                case 39: goto L_0x0330;
                case 40: goto L_0x02ef;
                case 41: goto L_0x02ae;
                case 42: goto L_0x0255;
                case 43: goto L_0x0330;
                case 44: goto L_0x00fc;
                case 45: goto L_0x02ae;
                case 46: goto L_0x02ef;
                case 47: goto L_0x00ad;
                case 48: goto L_0x005e;
                default: goto L_0x003c;
            }
        L_0x003c:
            r1 = 3
            if (r6 != r1) goto L_0x0449
            c.q.a.c.g.i.fa r1 = r15.mo27914n(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14327c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f9927c
            r11.add(r8)
            goto L_0x0427
        L_0x005e:
            if (r6 != r14) goto L_0x0082
            c.q.a.c.g.i.k9 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5144k9) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r2 = r7.f9925a
            int r2 = r2 + r1
        L_0x0069:
            if (r1 >= r2) goto L_0x0079
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r1, r7)
            long r4 = r7.f9926b
            long r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15364b(r4)
            r11.mo27363g(r4)
            goto L_0x0069
        L_0x0079:
            if (r1 != r2) goto L_0x007d
            goto L_0x044a
        L_0x007d:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x0082:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.i.k9 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5144k9) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r4, r7)
            long r8 = r7.f9926b
            long r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15364b(r8)
            r11.mo27363g(r8)
        L_0x0093:
            if (r1 >= r5) goto L_0x00ac
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x009e
            goto L_0x00ac
        L_0x009e:
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r4, r7)
            long r8 = r7.f9926b
            long r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15364b(r8)
            r11.mo27363g(r8)
            goto L_0x0093
        L_0x00ac:
            return r1
        L_0x00ad:
            if (r6 != r14) goto L_0x00d1
            c.q.a.c.g.i.u8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5294u8) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r2 = r7.f9925a
            int r2 = r2 + r1
        L_0x00b8:
            if (r1 >= r2) goto L_0x00c8
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r4 = r7.f9925a
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15363a(r4)
            r11.mo27780k(r4)
            goto L_0x00b8
        L_0x00c8:
            if (r1 != r2) goto L_0x00cc
            goto L_0x044a
        L_0x00cc:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x00d1:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.i.u8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5294u8) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15363a(r4)
            r11.mo27780k(r4)
        L_0x00e2:
            if (r1 >= r5) goto L_0x00fb
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x00ed
            goto L_0x00fb
        L_0x00ed:
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5353y7.m15363a(r4)
            r11.mo27780k(r4)
            goto L_0x00e2
        L_0x00fb:
            return r1
        L_0x00fc:
            if (r6 != r14) goto L_0x0103
            int r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14330f(r3, r4, r11, r7)
            goto L_0x0114
        L_0x0103:
            if (r6 != 0) goto L_0x0449
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r11
            r7 = r29
            int r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14336l(r2, r3, r4, r5, r6, r7)
        L_0x0114:
            c.q.a.c.g.i.v8 r3 = r15.mo27913m(r8)
            r4 = 0
            c.q.a.c.g.i.wa r5 = r0.f10263l
            r22 = r16
            r23 = r21
            r24 = r11
            r25 = r3
            r26 = r4
            r27 = r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14246c(r22, r23, r24, r25, r26, r27)
        L_0x012a:
            r1 = r2
            goto L_0x044a
        L_0x012d:
            if (r6 != r14) goto L_0x0449
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            if (r4 < 0) goto L_0x0182
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017d
            if (r4 != 0) goto L_0x0143
            com.google.android.gms.internal.measurement.zzje r4 = com.google.android.gms.internal.measurement.zzje.zzb
            r11.add(r4)
            goto L_0x014b
        L_0x0143:
            com.google.android.gms.internal.measurement.zzje r6 = com.google.android.gms.internal.measurement.zzje.zzl(r3, r1, r4)
            r11.add(r6)
        L_0x014a:
            int r1 = r1 + r4
        L_0x014b:
            if (r1 >= r5) goto L_0x017c
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x0156
            goto L_0x017c
        L_0x0156:
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            if (r4 < 0) goto L_0x0177
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0172
            if (r4 != 0) goto L_0x016a
            com.google.android.gms.internal.measurement.zzje r4 = com.google.android.gms.internal.measurement.zzje.zzb
            r11.add(r4)
            goto L_0x014b
        L_0x016a:
            com.google.android.gms.internal.measurement.zzje r6 = com.google.android.gms.internal.measurement.zzje.zzl(r3, r1, r4)
            r11.add(r6)
            goto L_0x014a
        L_0x0172:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x0177:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzd()
            throw r1
        L_0x017c:
            return r1
        L_0x017d:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x0182:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzd()
            throw r1
        L_0x0187:
            if (r6 == r14) goto L_0x018b
            goto L_0x0449
        L_0x018b:
            c.q.a.c.g.i.fa r1 = r15.mo27914n(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r11
            r27 = r29
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14329e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a2:
            if (r6 != r14) goto L_0x0449
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01f5
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            if (r4 < 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01bd
            r11.add(r6)
            goto L_0x01c8
        L_0x01bd:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.f10297a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
        L_0x01c7:
            int r1 = r1 + r4
        L_0x01c8:
            if (r1 >= r5) goto L_0x044a
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r8 = r7.f9925a
            if (r2 != r8) goto L_0x044a
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            if (r4 < 0) goto L_0x01eb
            if (r4 != 0) goto L_0x01e0
            r11.add(r6)
            goto L_0x01c8
        L_0x01e0:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.f10297a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
            goto L_0x01c7
        L_0x01eb:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzd()
            throw r1
        L_0x01f0:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzd()
            throw r1
        L_0x01f5:
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            if (r4 < 0) goto L_0x0250
            if (r4 != 0) goto L_0x0203
            r11.add(r6)
            goto L_0x0216
        L_0x0203:
            int r8 = r1 + r4
            boolean r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5177mb.m14503f(r3, r1, r8)
            if (r9 == 0) goto L_0x024b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.f10297a
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
        L_0x0215:
            r1 = r8
        L_0x0216:
            if (r1 >= r5) goto L_0x044a
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r8 = r7.f9925a
            if (r2 != r8) goto L_0x044a
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            if (r4 < 0) goto L_0x0246
            if (r4 != 0) goto L_0x022e
            r11.add(r6)
            goto L_0x0216
        L_0x022e:
            int r8 = r1 + r4
            boolean r9 = p040c.p200q.p201a.p264c.p294g.p335i.C5177mb.m14503f(r3, r1, r8)
            if (r9 == 0) goto L_0x0241
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.f10297a
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
            goto L_0x0215
        L_0x0241:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzc()
            throw r1
        L_0x0246:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzd()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzc()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzd()
            throw r1
        L_0x0255:
            r1 = 0
            if (r6 != r14) goto L_0x027d
            c.q.a.c.g.i.j7 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5126j7) r11
            int r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r4 = r7.f9925a
            int r4 = r4 + r2
        L_0x0261:
            if (r2 >= r4) goto L_0x0274
            int r2 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r2, r7)
            long r5 = r7.f9926b
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x026f
            r5 = r10
            goto L_0x0270
        L_0x026f:
            r5 = r1
        L_0x0270:
            r11.mo27344f(r5)
            goto L_0x0261
        L_0x0274:
            if (r2 != r4) goto L_0x0278
            goto L_0x012a
        L_0x0278:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x027d:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.i.j7 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5126j7) r11
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r4, r7)
            long r8 = r7.f9926b
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x028d
            r6 = r10
            goto L_0x028e
        L_0x028d:
            r6 = r1
        L_0x028e:
            r11.mo27344f(r6)
        L_0x0291:
            if (r4 >= r5) goto L_0x02ad
            int r6 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r8 = r7.f9925a
            if (r2 == r8) goto L_0x029c
            goto L_0x02ad
        L_0x029c:
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r6, r7)
            long r8 = r7.f9926b
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x02a8
            r6 = r10
            goto L_0x02a9
        L_0x02a8:
            r6 = r1
        L_0x02a9:
            r11.mo27344f(r6)
            goto L_0x0291
        L_0x02ad:
            return r4
        L_0x02ae:
            if (r6 != r14) goto L_0x02ce
            c.q.a.c.g.i.u8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5294u8) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r2 = r7.f9925a
            int r2 = r2 + r1
        L_0x02b9:
            if (r1 >= r2) goto L_0x02c5
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r3, r1)
            r11.mo27780k(r4)
            int r1 = r1 + 4
            goto L_0x02b9
        L_0x02c5:
            if (r1 != r2) goto L_0x02c9
            goto L_0x044a
        L_0x02c9:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x02ce:
            if (r6 != r9) goto L_0x0449
            c.q.a.c.g.i.u8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5294u8) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r17, r18)
            r11.mo27780k(r1)
        L_0x02d9:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02ee
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x02e6
            goto L_0x02ee
        L_0x02e6:
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r3, r4)
            r11.mo27780k(r1)
            goto L_0x02d9
        L_0x02ee:
            return r1
        L_0x02ef:
            if (r6 != r14) goto L_0x030f
            c.q.a.c.g.i.k9 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5144k9) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r2 = r7.f9925a
            int r2 = r2 + r1
        L_0x02fa:
            if (r1 >= r2) goto L_0x0306
            long r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r3, r1)
            r11.mo27363g(r4)
            int r1 = r1 + 8
            goto L_0x02fa
        L_0x0306:
            if (r1 != r2) goto L_0x030a
            goto L_0x044a
        L_0x030a:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x030f:
            if (r6 != r10) goto L_0x0449
            c.q.a.c.g.i.k9 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5144k9) r11
            long r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r17, r18)
            r11.mo27363g(r8)
        L_0x031a:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x032f
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x0327
            goto L_0x032f
        L_0x0327:
            long r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r3, r4)
            r11.mo27363g(r8)
            goto L_0x031a
        L_0x032f:
            return r1
        L_0x0330:
            if (r6 != r14) goto L_0x0338
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14330f(r3, r4, r11, r7)
            goto L_0x044a
        L_0x0338:
            if (r6 == 0) goto L_0x033c
            goto L_0x0449
        L_0x033c:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r11
            r25 = r29
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14336l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x034b:
            if (r6 != r14) goto L_0x036b
            c.q.a.c.g.i.k9 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5144k9) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r2 = r7.f9925a
            int r2 = r2 + r1
        L_0x0356:
            if (r1 >= r2) goto L_0x0362
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r1, r7)
            long r4 = r7.f9926b
            r11.mo27363g(r4)
            goto L_0x0356
        L_0x0362:
            if (r1 != r2) goto L_0x0366
            goto L_0x044a
        L_0x0366:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x036b:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.i.k9 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5144k9) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r4, r7)
            long r8 = r7.f9926b
            r11.mo27363g(r8)
        L_0x0378:
            if (r1 >= r5) goto L_0x038d
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x0383
            goto L_0x038d
        L_0x0383:
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14337m(r3, r4, r7)
            long r8 = r7.f9926b
            r11.mo27363g(r8)
            goto L_0x0378
        L_0x038d:
            return r1
        L_0x038e:
            if (r6 != r14) goto L_0x03b2
            c.q.a.c.g.i.m8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5174m8) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r2 = r7.f9925a
            int r2 = r2 + r1
        L_0x0399:
            if (r1 >= r2) goto L_0x03a9
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r11.mo27430f(r4)
            int r1 = r1 + 4
            goto L_0x0399
        L_0x03a9:
            if (r1 != r2) goto L_0x03ad
            goto L_0x044a
        L_0x03ad:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x03b2:
            if (r6 != r9) goto L_0x0449
            c.q.a.c.g.i.m8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5174m8) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r11.mo27430f(r1)
        L_0x03c1:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03da
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x03ce
            goto L_0x03da
        L_0x03ce:
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14326b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r11.mo27430f(r1)
            goto L_0x03c1
        L_0x03da:
            return r1
        L_0x03db:
            if (r6 != r14) goto L_0x03fe
            c.q.a.c.g.i.d8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5031d8) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r2 = r7.f9925a
            int r2 = r2 + r1
        L_0x03e6:
            if (r1 >= r2) goto L_0x03f6
            long r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r11.mo27155f(r4)
            int r1 = r1 + 8
            goto L_0x03e6
        L_0x03f6:
            if (r1 != r2) goto L_0x03f9
            goto L_0x044a
        L_0x03f9:
            com.google.android.gms.internal.measurement.zzkp r1 = com.google.android.gms.internal.measurement.zzkp.zzf()
            throw r1
        L_0x03fe:
            if (r6 != r10) goto L_0x0449
            c.q.a.c.g.i.d8 r11 = (p040c.p200q.p201a.p264c.p294g.p335i.C5031d8) r11
            long r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r11.mo27155f(r8)
        L_0x040d:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0426
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r1, r7)
            int r6 = r7.f9925a
            if (r2 == r6) goto L_0x041a
            goto L_0x0426
        L_0x041a:
            long r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14340p(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r11.mo27155f(r8)
            goto L_0x040d
        L_0x0426:
            return r1
        L_0x0427:
            if (r4 >= r5) goto L_0x0448
            int r8 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14334j(r3, r4, r7)
            int r9 = r7.f9925a
            if (r2 == r9) goto L_0x0432
            goto L_0x0448
        L_0x0432:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = p040c.p200q.p201a.p264c.p294g.p335i.C5110i7.m14327c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f9927c
            r11.add(r8)
            goto L_0x0427
        L_0x0448:
            return r4
        L_0x0449:
            r1 = r4
        L_0x044a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.mo27907V(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, c.q.a.c.g.i.h7):int");
    }

    /* renamed from: W */
    public final int mo27908W(int i) {
        if (i < this.f10254c || i > this.f10255d) {
            return -1;
        }
        return mo27911Z(i, 0);
    }

    /* renamed from: X */
    public final int mo27909X(int i, int i2) {
        if (i < this.f10254c || i > this.f10255d) {
            return -1;
        }
        return mo27911Z(i, i2);
    }

    /* renamed from: Y */
    public final int mo27910Y(int i) {
        return this.f10252a[i + 2];
    }

    /* renamed from: Z */
    public final int mo27911Z(int i, int i2) {
        int length = (this.f10252a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f10252a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo27237a(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f10252a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.mo27912k(r1)
            int[] r4 = r8.f10252a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m15259j(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m15260l(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m15258R(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m15260l(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m15258R(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m15258R(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m15258R(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m15251H(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15421a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m15258R(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m15260l(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m15258R(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m15260l(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m15260l(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m15257O(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.mo27900G(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m15256N(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14155k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14141B(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15421a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14152h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14153i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14151g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14150f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p040c.p200q.p201a.p264c.p294g.p335i.C5369z8.m15423c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            c.q.a.c.g.i.wa r0 = r8.f10263l
            java.lang.Object r0 = r0.mo27867d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f10257f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            c.q.a.c.g.i.h8 r0 = r8.f10264m
            r0.mo27305a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.mo27237a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final void mo27238b(Object obj) {
        if (m15250F(obj)) {
            if (obj instanceof C5279t8) {
                C5279t8 t8Var = (C5279t8) obj;
                t8Var.mo27723v(Integer.MAX_VALUE);
                t8Var.zzb = 0;
                t8Var.mo27721t();
            }
            int length = this.f10252a.length;
            for (int i = 0; i < length; i += 3) {
                int k = mo27912k(i);
                long j = (long) (1048575 & k);
                int j2 = m15259j(k);
                if (j2 != 9) {
                    switch (j2) {
                        case 17:
                            break;
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
                            this.f10262k.mo27191a(obj, j);
                            continue;
                        case 50:
                            Object object = f10251p.getObject(obj, j);
                            if (object != null) {
                                Unsafe unsafe = f10251p;
                                ((zzlg) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (mo27898C(obj, i)) {
                    mo27914n(i).mo27238b(f10251p.getObject(obj, j));
                }
            }
            this.f10263l.mo27870g(obj);
            if (this.f10257f) {
                this.f10264m.mo27306b(obj);
                throw null;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo27239c(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f10260i) {
            int i6 = this.f10259h[i5];
            int i7 = this.f10252a[i6];
            int k = mo27912k(i6);
            int i8 = this.f10252a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f10251p.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & k) != 0 && !mo27899D(obj, i6, i2, i, i10)) {
                return false;
            }
            int j = m15259j(k);
            if (j != 9 && j != 17) {
                if (j != 27) {
                    if (j == 60 || j == 68) {
                        if (mo27900G(obj2, i7, i6) && !m15249E(obj2, k, mo27914n(i6))) {
                            return false;
                        }
                    } else if (j != 49) {
                        if (j == 50 && !((zzlg) C5082gb.m14155k(obj2, (long) (k & 1048575))).isEmpty()) {
                            C5205o9 o9Var = (C5205o9) mo27915o(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C5082gb.m14155k(obj2, (long) (k & 1048575));
                if (!list.isEmpty()) {
                    C5065fa n = mo27914n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!n.mo27239c(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo27899D(obj, i6, i2, i, i10) && !m15249E(obj2, k, mo27914n(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f10257f) {
            return true;
        }
        this.f10264m.mo27305a(obj2);
        throw null;
    }

    /* renamed from: d */
    public final Object mo27240d() {
        return ((C5279t8) this.f10256e).mo27719j();
    }

    /* renamed from: e */
    public final int mo27241e(Object obj) {
        return this.f10258g ? mo27903Q(obj) : mo27902P(obj);
    }

    /* renamed from: f */
    public final void mo27242f(Object obj, Object obj2) {
        m15262s(obj);
        if (obj2 != null) {
            for (int i = 0; i < this.f10252a.length; i += 3) {
                int k = mo27912k(i);
                long j = (long) (1048575 & k);
                int i2 = this.f10252a[i];
                switch (m15259j(k)) {
                    case 0:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14164t(obj, j, C5082gb.m14150f(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 1:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14165u(obj, j, C5082gb.m14151g(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 2:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14167w(obj, j, C5082gb.m14153i(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 3:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14167w(obj, j, C5082gb.m14153i(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 4:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14166v(obj, j, C5082gb.m14152h(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 5:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14167w(obj, j, C5082gb.m14153i(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 6:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14166v(obj, j, C5082gb.m14152h(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 7:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14162r(obj, j, C5082gb.m14141B(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 8:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14168x(obj, j, C5082gb.m14155k(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 9:
                        mo27918t(obj, obj2, i);
                        break;
                    case 10:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14168x(obj, j, C5082gb.m14155k(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 11:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14166v(obj, j, C5082gb.m14152h(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 12:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14166v(obj, j, C5082gb.m14152h(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 13:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14166v(obj, j, C5082gb.m14152h(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 14:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14167w(obj, j, C5082gb.m14153i(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 15:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14166v(obj, j, C5082gb.m14152h(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 16:
                        if (!mo27898C(obj2, i)) {
                            break;
                        } else {
                            C5082gb.m14167w(obj, j, C5082gb.m14153i(obj2, j));
                            mo27920v(obj, i);
                            break;
                        }
                    case 17:
                        mo27918t(obj, obj2, i);
                        break;
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
                        this.f10262k.mo27192b(obj, obj2, j);
                        break;
                    case 50:
                        C5097ha.m14217B(this.f10265n, obj, obj2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!mo27900G(obj2, i2, i)) {
                            break;
                        } else {
                            C5082gb.m14168x(obj, j, C5082gb.m14155k(obj2, j));
                            mo27921w(obj, i2, i);
                            break;
                        }
                    case 60:
                        mo27919u(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!mo27900G(obj2, i2, i)) {
                            break;
                        } else {
                            C5082gb.m14168x(obj, j, C5082gb.m14155k(obj2, j));
                            mo27921w(obj, i2, i);
                            break;
                        }
                    case 68:
                        mo27919u(obj, obj2, i);
                        break;
                }
            }
            C5097ha.m14249f(this.f10263l, obj, obj2);
            if (this.f10257f) {
                C5097ha.m14248e(this.f10264m, obj, obj2);
                throw null;
            }
            return;
        }
        throw null;
    }

    /* renamed from: g */
    public final boolean mo27243g(Object obj, Object obj2) {
        boolean z;
        int length = this.f10252a.length;
        for (int i = 0; i < length; i += 3) {
            int k = mo27912k(i);
            long j = (long) (k & 1048575);
            switch (m15259j(k)) {
                case 0:
                    if (mo27897B(obj, obj2, i) && Double.doubleToLongBits(C5082gb.m14150f(obj, j)) == Double.doubleToLongBits(C5082gb.m14150f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (mo27897B(obj, obj2, i) && Float.floatToIntBits(C5082gb.m14151g(obj, j)) == Float.floatToIntBits(C5082gb.m14151g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14153i(obj, j) == C5082gb.m14153i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14153i(obj, j) == C5082gb.m14153i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14152h(obj, j) == C5082gb.m14152h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14153i(obj, j) == C5082gb.m14153i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14152h(obj, j) == C5082gb.m14152h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14141B(obj, j) == C5082gb.m14141B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (mo27897B(obj, obj2, i) && C5097ha.m14269z(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (mo27897B(obj, obj2, i) && C5097ha.m14269z(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (mo27897B(obj, obj2, i) && C5097ha.m14269z(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14152h(obj, j) == C5082gb.m14152h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14152h(obj, j) == C5082gb.m14152h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14152h(obj, j) == C5082gb.m14152h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14153i(obj, j) == C5082gb.m14153i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14152h(obj, j) == C5082gb.m14152h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (mo27897B(obj, obj2, i) && C5082gb.m14153i(obj, j) == C5082gb.m14153i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (mo27897B(obj, obj2, i) && C5097ha.m14269z(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j))) {
                        continue;
                    }
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
                    z = C5097ha.m14269z(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j));
                    break;
                case 50:
                    z = C5097ha.m14269z(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j));
                    break;
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
                    long Y = (long) (mo27910Y(i) & 1048575);
                    if (C5082gb.m14152h(obj, Y) == C5082gb.m14152h(obj2, Y) && C5097ha.m14269z(C5082gb.m14155k(obj, j), C5082gb.m14155k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f10263l.mo27867d(obj).equals(this.f10263l.mo27867d(obj2))) {
            return false;
        }
        if (!this.f10257f) {
            return true;
        }
        this.f10264m.mo27305a(obj);
        throw null;
    }

    /* renamed from: h */
    public final void mo27244h(Object obj, C5192nb nbVar) {
        if (!this.f10258g) {
            mo27924z(obj, nbVar);
        } else if (!this.f10257f) {
            int length = this.f10252a.length;
            for (int i = 0; i < length; i += 3) {
                int k = mo27912k(i);
                int i2 = this.f10252a[i];
                switch (m15259j(k)) {
                    case 0:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27126t(i2, C5082gb.m14150f(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 1:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27129w(i2, C5082gb.m14151g(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 2:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27114h(i2, C5082gb.m14153i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 3:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27099C(i2, C5082gb.m14153i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 4:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27124r(i2, C5082gb.m14152h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 5:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27102F(i2, C5082gb.m14153i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 6:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27110d(i2, C5082gb.m14152h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 7:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27111e(i2, C5082gb.m14141B(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 8:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            m15252I(i2, C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar);
                            break;
                        }
                    case 9:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27104H(i2, C5082gb.m14155k(obj, (long) (k & 1048575)), mo27914n(i));
                            break;
                        }
                    case 10:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27120n(i2, (zzje) C5082gb.m14155k(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 11:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27107a(i2, C5082gb.m14152h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 12:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27122p(i2, C5082gb.m14152h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 13:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27128v(i2, C5082gb.m14152h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 14:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27116j(i2, C5082gb.m14153i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 15:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27112f(i2, C5082gb.m14152h(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 16:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27105I(i2, C5082gb.m14153i(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 17:
                        if (!mo27898C(obj, i)) {
                            break;
                        } else {
                            nbVar.mo27118l(i2, C5082gb.m14155k(obj, (long) (k & 1048575)), mo27914n(i));
                            break;
                        }
                    case 18:
                        C5097ha.m14253j(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 19:
                        C5097ha.m14257n(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 20:
                        C5097ha.m14260q(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 21:
                        C5097ha.m14268y(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 22:
                        C5097ha.m14259p(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 23:
                        C5097ha.m14256m(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 24:
                        C5097ha.m14255l(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 25:
                        C5097ha.m14251h(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 26:
                        C5097ha.m14266w(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar);
                        break;
                    case 27:
                        C5097ha.m14261r(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, mo27914n(i));
                        break;
                    case 28:
                        C5097ha.m14252i(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar);
                        break;
                    case 29:
                        C5097ha.m14267x(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 30:
                        C5097ha.m14254k(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 31:
                        C5097ha.m14262s(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 32:
                        C5097ha.m14263t(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 33:
                        C5097ha.m14264u(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 34:
                        C5097ha.m14265v(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, false);
                        break;
                    case 35:
                        C5097ha.m14253j(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 36:
                        C5097ha.m14257n(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 37:
                        C5097ha.m14260q(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 38:
                        C5097ha.m14268y(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 39:
                        C5097ha.m14259p(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 40:
                        C5097ha.m14256m(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 41:
                        C5097ha.m14255l(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 42:
                        C5097ha.m14251h(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 43:
                        C5097ha.m14267x(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 44:
                        C5097ha.m14254k(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 45:
                        C5097ha.m14262s(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 46:
                        C5097ha.m14263t(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 47:
                        C5097ha.m14264u(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 48:
                        C5097ha.m14265v(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, true);
                        break;
                    case 49:
                        C5097ha.m14258o(i2, (List) C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar, mo27914n(i));
                        break;
                    case 50:
                        mo27896A(nbVar, i2, C5082gb.m14155k(obj, (long) (k & 1048575)), i);
                        break;
                    case 51:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27126t(i2, m15256N(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 52:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27129w(i2, m15257O(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 53:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27114h(i2, m15260l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 54:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27099C(i2, m15260l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 55:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27124r(i2, m15258R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 56:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27102F(i2, m15260l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 57:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27110d(i2, m15258R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 58:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27111e(i2, m15251H(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 59:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            m15252I(i2, C5082gb.m14155k(obj, (long) (k & 1048575)), nbVar);
                            break;
                        }
                    case 60:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27104H(i2, C5082gb.m14155k(obj, (long) (k & 1048575)), mo27914n(i));
                            break;
                        }
                    case 61:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27120n(i2, (zzje) C5082gb.m14155k(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 62:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27107a(i2, m15258R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 63:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27122p(i2, m15258R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 64:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27128v(i2, m15258R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 65:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27116j(i2, m15260l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 66:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27112f(i2, m15258R(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 67:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27105I(i2, m15260l(obj, (long) (k & 1048575)));
                            break;
                        }
                    case 68:
                        if (!mo27900G(obj, i2, i)) {
                            break;
                        } else {
                            nbVar.mo27118l(i2, C5082gb.m14155k(obj, (long) (k & 1048575)), mo27914n(i));
                            break;
                        }
                }
            }
            C5326wa waVar = this.f10263l;
            waVar.mo27872i(waVar.mo27867d(obj), nbVar);
        } else {
            this.f10264m.mo27305a(obj);
            throw null;
        }
    }

    /* renamed from: i */
    public final void mo27245i(Object obj, byte[] bArr, int i, int i2, C5094h7 h7Var) {
        if (this.f10258g) {
            mo27906U(obj, bArr, i, i2, h7Var);
        } else {
            mo27901J(obj, bArr, i, i2, 0, h7Var);
        }
    }

    /* renamed from: k */
    public final int mo27912k(int i) {
        return this.f10252a[i + 1];
    }

    /* renamed from: m */
    public final C5309v8 mo27913m(int i) {
        int i2 = i / 3;
        return (C5309v8) this.f10253b[i2 + i2 + 1];
    }

    /* renamed from: n */
    public final C5065fa mo27914n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C5065fa faVar = (C5065fa) this.f10253b[i3];
        if (faVar != null) {
            return faVar;
        }
        C5065fa b = C5017ca.m13951a().mo27133b((Class) this.f10253b[i3 + 1]);
        this.f10253b[i3] = b;
        return b;
    }

    /* renamed from: o */
    public final Object mo27915o(int i) {
        int i2 = i / 3;
        return this.f10253b[i2 + i2];
    }

    /* renamed from: p */
    public final Object mo27916p(Object obj, int i) {
        C5065fa n = mo27914n(i);
        long k = (long) (mo27912k(i) & 1048575);
        if (!mo27898C(obj, i)) {
            return n.mo27240d();
        }
        Object object = f10251p.getObject(obj, k);
        if (m15250F(object)) {
            return object;
        }
        Object d = n.mo27240d();
        if (object != null) {
            n.mo27242f(d, object);
        }
        return d;
    }

    /* renamed from: q */
    public final Object mo27917q(Object obj, int i, int i2) {
        C5065fa n = mo27914n(i2);
        if (!mo27900G(obj, i, i2)) {
            return n.mo27240d();
        }
        Object object = f10251p.getObject(obj, (long) (mo27912k(i2) & 1048575));
        if (m15250F(object)) {
            return object;
        }
        Object d = n.mo27240d();
        if (object != null) {
            n.mo27242f(d, object);
        }
        return d;
    }

    /* renamed from: t */
    public final void mo27918t(Object obj, Object obj2, int i) {
        if (mo27898C(obj2, i)) {
            long k = (long) (mo27912k(i) & 1048575);
            Object object = f10251p.getObject(obj2, k);
            if (object != null) {
                C5065fa n = mo27914n(i);
                if (!mo27898C(obj, i)) {
                    if (!m15250F(object)) {
                        f10251p.putObject(obj, k, object);
                    } else {
                        Object d = n.mo27240d();
                        n.mo27242f(d, object);
                        f10251p.putObject(obj, k, d);
                    }
                    mo27920v(obj, i);
                    return;
                }
                Object object2 = f10251p.getObject(obj, k);
                if (!m15250F(object2)) {
                    Object d2 = n.mo27240d();
                    n.mo27242f(d2, object2);
                    f10251p.putObject(obj, k, d2);
                    object2 = d2;
                }
                n.mo27242f(object2, object);
                return;
            }
            int i2 = this.f10252a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: u */
    public final void mo27919u(Object obj, Object obj2, int i) {
        int i2 = this.f10252a[i];
        if (mo27900G(obj2, i2, i)) {
            long k = (long) (mo27912k(i) & 1048575);
            Object object = f10251p.getObject(obj2, k);
            if (object != null) {
                C5065fa n = mo27914n(i);
                if (!mo27900G(obj, i2, i)) {
                    if (!m15250F(object)) {
                        f10251p.putObject(obj, k, object);
                    } else {
                        Object d = n.mo27240d();
                        n.mo27242f(d, object);
                        f10251p.putObject(obj, k, d);
                    }
                    mo27921w(obj, i2, i);
                    return;
                }
                Object object2 = f10251p.getObject(obj, k);
                if (!m15250F(object2)) {
                    Object d2 = n.mo27240d();
                    n.mo27242f(d2, object2);
                    f10251p.putObject(obj, k, d2);
                    object2 = d2;
                }
                n.mo27242f(object2, object);
                return;
            }
            int i3 = this.f10252a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: v */
    public final void mo27920v(Object obj, int i) {
        int Y = mo27910Y(i);
        long j = (long) (1048575 & Y);
        if (j != 1048575) {
            C5082gb.m14166v(obj, j, (1 << (Y >>> 20)) | C5082gb.m14152h(obj, j));
        }
    }

    /* renamed from: w */
    public final void mo27921w(Object obj, int i, int i2) {
        C5082gb.m14166v(obj, (long) (mo27910Y(i2) & 1048575), i);
    }

    /* renamed from: x */
    public final void mo27922x(Object obj, int i, Object obj2) {
        f10251p.putObject(obj, (long) (mo27912k(i) & 1048575), obj2);
        mo27920v(obj, i);
    }

    /* renamed from: y */
    public final void mo27923y(Object obj, int i, int i2, Object obj2) {
        f10251p.putObject(obj, (long) (mo27912k(i2) & 1048575), obj2);
        mo27921w(obj, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044c, code lost:
        r7 = r7 + 3;
        r5 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029b, code lost:
        r13 = r11;
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27924z(java.lang.Object r17, p040c.p200q.p201a.p264c.p294g.p335i.C5192nb r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f10257f
            if (r3 != 0) goto L_0x045d
            int[] r3 = r0.f10252a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f10251p
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r5
            r7 = 0
            r8 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x0453
            int r10 = r0.mo27912k(r7)
            int[] r11 = r0.f10252a
            r12 = r11[r7]
            int r13 = m15259j(r10)
            r14 = 17
            r15 = 1
            if (r13 > r14) goto L_0x003b
            int r14 = r7 + 2
            r11 = r11[r14]
            r14 = r11 & r5
            if (r14 == r9) goto L_0x0036
            long r8 = (long) r14
            int r8 = r4.getInt(r1, r8)
            r9 = r14
        L_0x0036:
            int r11 = r11 >>> 20
            int r11 = r15 << r11
            goto L_0x003c
        L_0x003b:
            r11 = 0
        L_0x003c:
            r10 = r10 & r5
            long r5 = (long) r10
            switch(r13) {
                case 0: goto L_0x0440;
                case 1: goto L_0x0433;
                case 2: goto L_0x0426;
                case 3: goto L_0x0419;
                case 4: goto L_0x040c;
                case 5: goto L_0x03ff;
                case 6: goto L_0x03f2;
                case 7: goto L_0x03e5;
                case 8: goto L_0x03d7;
                case 9: goto L_0x03c5;
                case 10: goto L_0x03b5;
                case 11: goto L_0x03a7;
                case 12: goto L_0x0399;
                case 13: goto L_0x038b;
                case 14: goto L_0x037d;
                case 15: goto L_0x036f;
                case 16: goto L_0x0361;
                case 17: goto L_0x034f;
                case 18: goto L_0x033f;
                case 19: goto L_0x032f;
                case 20: goto L_0x031f;
                case 21: goto L_0x030f;
                case 22: goto L_0x02ff;
                case 23: goto L_0x02ef;
                case 24: goto L_0x02df;
                case 25: goto L_0x02cf;
                case 26: goto L_0x02c0;
                case 27: goto L_0x02ad;
                case 28: goto L_0x029e;
                case 29: goto L_0x028d;
                case 30: goto L_0x027e;
                case 31: goto L_0x026f;
                case 32: goto L_0x0260;
                case 33: goto L_0x0251;
                case 34: goto L_0x0242;
                case 35: goto L_0x0233;
                case 36: goto L_0x0224;
                case 37: goto L_0x0215;
                case 38: goto L_0x0206;
                case 39: goto L_0x01f7;
                case 40: goto L_0x01e8;
                case 41: goto L_0x01d9;
                case 42: goto L_0x01ca;
                case 43: goto L_0x01bb;
                case 44: goto L_0x01ac;
                case 45: goto L_0x019d;
                case 46: goto L_0x018e;
                case 47: goto L_0x017f;
                case 48: goto L_0x0170;
                case 49: goto L_0x015d;
                case 50: goto L_0x0154;
                case 51: goto L_0x0145;
                case 52: goto L_0x0136;
                case 53: goto L_0x0127;
                case 54: goto L_0x0118;
                case 55: goto L_0x0109;
                case 56: goto L_0x00fa;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00aa;
                case 62: goto L_0x009c;
                case 63: goto L_0x008e;
                case 64: goto L_0x0080;
                case 65: goto L_0x0072;
                case 66: goto L_0x0064;
                case 67: goto L_0x0056;
                case 68: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            r13 = 0
            goto L_0x044c
        L_0x0044:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.i.fa r6 = r0.mo27914n(r7)
            r2.mo27118l(r12, r5, r6)
            goto L_0x0041
        L_0x0056:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m15260l(r1, r5)
            r2.mo27105I(r12, r5)
            goto L_0x0041
        L_0x0064:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m15258R(r1, r5)
            r2.mo27112f(r12, r5)
            goto L_0x0041
        L_0x0072:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m15260l(r1, r5)
            r2.mo27116j(r12, r5)
            goto L_0x0041
        L_0x0080:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m15258R(r1, r5)
            r2.mo27128v(r12, r5)
            goto L_0x0041
        L_0x008e:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m15258R(r1, r5)
            r2.mo27122p(r12, r5)
            goto L_0x0041
        L_0x009c:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m15258R(r1, r5)
            r2.mo27107a(r12, r5)
            goto L_0x0041
        L_0x00aa:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzje r5 = (com.google.android.gms.internal.measurement.zzje) r5
            r2.mo27120n(r12, r5)
            goto L_0x0041
        L_0x00ba:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.i.fa r6 = r0.mo27914n(r7)
            r2.mo27104H(r12, r5, r6)
            goto L_0x0041
        L_0x00cd:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            m15252I(r12, r5, r2)
            goto L_0x0041
        L_0x00dc:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            boolean r5 = m15251H(r1, r5)
            r2.mo27111e(r12, r5)
            goto L_0x0041
        L_0x00eb:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m15258R(r1, r5)
            r2.mo27110d(r12, r5)
            goto L_0x0041
        L_0x00fa:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m15260l(r1, r5)
            r2.mo27102F(r12, r5)
            goto L_0x0041
        L_0x0109:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m15258R(r1, r5)
            r2.mo27124r(r12, r5)
            goto L_0x0041
        L_0x0118:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m15260l(r1, r5)
            r2.mo27099C(r12, r5)
            goto L_0x0041
        L_0x0127:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m15260l(r1, r5)
            r2.mo27114h(r12, r5)
            goto L_0x0041
        L_0x0136:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            float r5 = m15257O(r1, r5)
            r2.mo27129w(r12, r5)
            goto L_0x0041
        L_0x0145:
            boolean r10 = r0.mo27900G(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            double r5 = m15256N(r1, r5)
            r2.mo27126t(r12, r5)
            goto L_0x0041
        L_0x0154:
            java.lang.Object r5 = r4.getObject(r1, r5)
            r0.mo27896A(r2, r12, r5, r7)
            goto L_0x0041
        L_0x015d:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            c.q.a.c.g.i.fa r6 = r0.mo27914n(r7)
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14258o(r10, r5, r2, r6)
            goto L_0x0041
        L_0x0170:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14265v(r10, r5, r2, r15)
            goto L_0x0041
        L_0x017f:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14264u(r10, r5, r2, r15)
            goto L_0x0041
        L_0x018e:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14263t(r10, r5, r2, r15)
            goto L_0x0041
        L_0x019d:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14262s(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ac:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14254k(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01bb:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14267x(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ca:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14251h(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01d9:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14255l(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01e8:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14256m(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01f7:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14259p(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0206:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14268y(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0215:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14260q(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0224:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14257n(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0233:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14253j(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0242:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r11 = 0
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14265v(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0251:
            r11 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14264u(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0260:
            r11 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14263t(r10, r5, r2, r11)
            goto L_0x029b
        L_0x026f:
            r11 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14262s(r10, r5, r2, r11)
            goto L_0x029b
        L_0x027e:
            r11 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14254k(r10, r5, r2, r11)
            goto L_0x029b
        L_0x028d:
            r11 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14267x(r10, r5, r2, r11)
        L_0x029b:
            r13 = r11
            goto L_0x044c
        L_0x029e:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14252i(r10, r5, r2)
            goto L_0x0041
        L_0x02ad:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            c.q.a.c.g.i.fa r6 = r0.mo27914n(r7)
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14261r(r10, r5, r2, r6)
            goto L_0x0041
        L_0x02c0:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14266w(r10, r5, r2)
            goto L_0x0041
        L_0x02cf:
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r13 = 0
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14251h(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02df:
            r13 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14255l(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ef:
            r13 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14256m(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ff:
            r13 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14259p(r10, r5, r2, r13)
            goto L_0x044c
        L_0x030f:
            r13 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14268y(r10, r5, r2, r13)
            goto L_0x044c
        L_0x031f:
            r13 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14260q(r10, r5, r2, r13)
            goto L_0x044c
        L_0x032f:
            r13 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14257n(r10, r5, r2, r13)
            goto L_0x044c
        L_0x033f:
            r13 = 0
            int[] r10 = r0.f10252a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p335i.C5097ha.m14253j(r10, r5, r2, r13)
            goto L_0x044c
        L_0x034f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.i.fa r6 = r0.mo27914n(r7)
            r2.mo27118l(r12, r5, r6)
            goto L_0x044c
        L_0x0361:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo27105I(r12, r5)
            goto L_0x044c
        L_0x036f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo27112f(r12, r5)
            goto L_0x044c
        L_0x037d:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo27116j(r12, r5)
            goto L_0x044c
        L_0x038b:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo27128v(r12, r5)
            goto L_0x044c
        L_0x0399:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo27122p(r12, r5)
            goto L_0x044c
        L_0x03a7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo27107a(r12, r5)
            goto L_0x044c
        L_0x03b5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.zzje r5 = (com.google.android.gms.internal.measurement.zzje) r5
            r2.mo27120n(r12, r5)
            goto L_0x044c
        L_0x03c5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.i.fa r6 = r0.mo27914n(r7)
            r2.mo27104H(r12, r5, r6)
            goto L_0x044c
        L_0x03d7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            m15252I(r12, r5, r2)
            goto L_0x044c
        L_0x03e5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            boolean r5 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14141B(r1, r5)
            r2.mo27111e(r12, r5)
            goto L_0x044c
        L_0x03f2:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo27110d(r12, r5)
            goto L_0x044c
        L_0x03ff:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo27102F(r12, r5)
            goto L_0x044c
        L_0x040c:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo27124r(r12, r5)
            goto L_0x044c
        L_0x0419:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo27099C(r12, r5)
            goto L_0x044c
        L_0x0426:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo27114h(r12, r5)
            goto L_0x044c
        L_0x0433:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            float r5 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14151g(r1, r5)
            r2.mo27129w(r12, r5)
            goto L_0x044c
        L_0x0440:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            double r5 = p040c.p200q.p201a.p264c.p294g.p335i.C5082gb.m14150f(r1, r5)
            r2.mo27126t(r12, r5)
        L_0x044c:
            int r7 = r7 + 3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0015
        L_0x0453:
            c.q.a.c.g.i.wa r3 = r0.f10263l
            java.lang.Object r1 = r3.mo27867d(r1)
            r3.mo27872i(r1, r2)
            return
        L_0x045d:
            c.q.a.c.g.i.h8 r2 = r0.f10264m
            r2.mo27305a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p335i.C5340x9.mo27924z(java.lang.Object, c.q.a.c.g.i.nb):void");
    }
}
