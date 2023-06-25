package p040c.p200q.p201a.p264c.p294g.p333g;

import com.google.android.gms.internal.p527firebaseauthapi.zzacc;
import com.google.android.gms.internal.p527firebaseauthapi.zzadn;
import com.google.android.gms.internal.p527firebaseauthapi.zzaee;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: c.q.a.c.g.g.o2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4653o2<T> implements C4889x2<T> {

    /* renamed from: p */
    public static final int[] f9494p = new int[0];

    /* renamed from: q */
    public static final Unsafe f9495q = C4916y3.m13556l();

    /* renamed from: a */
    public final int[] f9496a;

    /* renamed from: b */
    public final Object[] f9497b;

    /* renamed from: c */
    public final int f9498c;

    /* renamed from: d */
    public final int f9499d;

    /* renamed from: e */
    public final C4572l2 f9500e;

    /* renamed from: f */
    public final boolean f9501f;

    /* renamed from: g */
    public final boolean f9502g;

    /* renamed from: h */
    public final boolean f9503h;

    /* renamed from: i */
    public final int[] f9504i;

    /* renamed from: j */
    public final int f9505j;

    /* renamed from: k */
    public final int f9506k;

    /* renamed from: l */
    public final C4940z1 f9507l;

    /* renamed from: m */
    public final C4654o3 f9508m;

    /* renamed from: n */
    public final C4939z0 f9509n;

    /* renamed from: o */
    public final C4437g2 f9510o;

    public C4653o2(int[] iArr, Object[] objArr, int i, int i2, C4572l2 l2Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C4707q2 q2Var, C4940z1 z1Var, C4654o3 o3Var, C4939z0 z0Var, C4437g2 g2Var, byte[] bArr) {
        C4572l2 l2Var2 = l2Var;
        C4939z0 z0Var2 = z0Var;
        this.f9496a = iArr;
        this.f9497b = objArr;
        this.f9498c = i;
        this.f9499d = i2;
        this.f9502g = l2Var2 instanceof C4544k1;
        this.f9503h = z;
        boolean z3 = false;
        if (z0Var2 != null && z0Var2.mo25761e(l2Var)) {
            z3 = true;
        }
        this.f9501f = z3;
        this.f9504i = iArr2;
        this.f9505j = i3;
        this.f9506k = i4;
        this.f9507l = z1Var;
        this.f9508m = o3Var;
        this.f9509n = z0Var2;
        this.f9500e = l2Var2;
        this.f9510o = g2Var;
    }

    /* renamed from: E */
    public static boolean m12617E(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: H */
    public static boolean m12618H(Object obj, int i, C4889x2 x2Var) {
        return x2Var.mo26415c(C4916y3.m13555k(obj, (long) (i & 1048575)));
    }

    /* renamed from: I */
    public static boolean m12619I(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C4544k1) {
            return ((C4544k1) obj).mo26157p();
        }
        return true;
    }

    /* renamed from: K */
    public static boolean m12620K(Object obj, long j) {
        return ((Boolean) C4916y3.m13555k(obj, j)).booleanValue();
    }

    /* renamed from: N */
    public static final void m12621N(int i, Object obj, C4809u0 u0Var) {
        if (obj instanceof String) {
            u0Var.mo26701f(i, (String) obj);
        } else {
            u0Var.mo26709o(i, (zzacc) obj);
        }
    }

    /* renamed from: P */
    public static C4681p3 m12622P(Object obj) {
        C4544k1 k1Var = (C4544k1) obj;
        C4681p3 p3Var = k1Var.zzc;
        if (p3Var != C4681p3.m12775c()) {
            return p3Var;
        }
        C4681p3 f = C4681p3.m12777f();
        k1Var.zzc = f;
        return f;
    }

    /* renamed from: Q */
    public static C4653o2 m12623Q(Class cls, C4491i2 i2Var, C4707q2 q2Var, C4940z1 z1Var, C4654o3 o3Var, C4939z0 z0Var, C4437g2 g2Var) {
        if (i2Var instanceof C4837v2) {
            return m12624R((C4837v2) i2Var, q2Var, z1Var, o3Var, z0Var, g2Var);
        }
        C4600m3 m3Var = (C4600m3) i2Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0379  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040c.p200q.p201a.p264c.p294g.p333g.C4653o2 m12624R(p040c.p200q.p201a.p264c.p294g.p333g.C4837v2 r34, p040c.p200q.p201a.p264c.p294g.p333g.C4707q2 r35, p040c.p200q.p201a.p264c.p294g.p333g.C4940z1 r36, p040c.p200q.p201a.p264c.p294g.p333g.C4654o3 r37, p040c.p200q.p201a.p264c.p294g.p333g.C4939z0 r38, p040c.p200q.p201a.p264c.p294g.p333g.C4437g2 r39) {
        /*
            int r0 = r34.mo26094b()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r34.mo26764c()
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
            int[] r6 = f9494p
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
            sun.misc.Unsafe r15 = f9495q
            java.lang.Object[] r17 = r34.mo26765d()
            c.q.a.c.g.g.l2 r18 = r34.zza()
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
            java.lang.reflect.Field r12 = m12630u(r1, r12)
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
            java.lang.reflect.Field r8 = m12630u(r1, r8)
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
            java.lang.reflect.Field r8 = m12630u(r1, r8)
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
            java.lang.reflect.Field r11 = m12630u(r1, r11)
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
            c.q.a.c.g.g.o2 r0 = new c.q.a.c.g.g.o2
            r4 = r0
            c.q.a.c.g.g.l2 r9 = r34.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.m12624R(c.q.a.c.g.g.v2, c.q.a.c.g.g.q2, c.q.a.c.g.g.z1, c.q.a.c.g.g.o3, c.q.a.c.g.g.z0, c.q.a.c.g.g.g2):c.q.a.c.g.g.o2");
    }

    /* renamed from: S */
    public static double m12625S(Object obj, long j) {
        return ((Double) C4916y3.m13555k(obj, j)).doubleValue();
    }

    /* renamed from: T */
    public static float m12626T(Object obj, long j) {
        return ((Float) C4916y3.m13555k(obj, j)).floatValue();
    }

    /* renamed from: W */
    public static int m12627W(Object obj, long j) {
        return ((Integer) C4916y3.m13555k(obj, j)).intValue();
    }

    /* renamed from: l */
    public static int m12628l(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: n */
    public static long m12629n(Object obj, long j) {
        return ((Long) C4916y3.m13555k(obj, j)).longValue();
    }

    /* renamed from: u */
    public static Field m12630u(Class cls, String str) {
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

    /* renamed from: v */
    public static void m12631v(Object obj) {
        if (!m12619I(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* renamed from: A */
    public final void mo26396A(Object obj, int i, int i2) {
        C4916y3.m13566v(obj, (long) (mo26418d0(i2) & 1048575), i);
    }

    /* renamed from: B */
    public final void mo26397B(Object obj, int i, Object obj2) {
        f9495q.putObject(obj, (long) (mo26426m(i) & 1048575), obj2);
        mo26436z(obj, i);
    }

    /* renamed from: C */
    public final void mo26398C(Object obj, int i, int i2, Object obj2) {
        f9495q.putObject(obj, (long) (mo26426m(i2) & 1048575), obj2);
        mo26396A(obj, i, i2);
    }

    /* renamed from: D */
    public final boolean mo26399D(Object obj, Object obj2, int i) {
        return mo26400F(obj, i) == mo26400F(obj2, i);
    }

    /* renamed from: F */
    public final boolean mo26400F(Object obj, int i) {
        int d0 = mo26418d0(i);
        long j = (long) (d0 & 1048575);
        if (j != 1048575) {
            return (C4916y3.m13552h(obj, j) & (1 << (d0 >>> 20))) != 0;
        }
        int m = mo26426m(i);
        long j2 = (long) (m & 1048575);
        switch (m12628l(m)) {
            case 0:
                return Double.doubleToRawLongBits(C4916y3.m13550f(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C4916y3.m13551g(obj, j2)) != 0;
            case 2:
                return C4916y3.m13553i(obj, j2) != 0;
            case 3:
                return C4916y3.m13553i(obj, j2) != 0;
            case 4:
                return C4916y3.m13552h(obj, j2) != 0;
            case 5:
                return C4916y3.m13553i(obj, j2) != 0;
            case 6:
                return C4916y3.m13552h(obj, j2) != 0;
            case 7:
                return C4916y3.m13541B(obj, j2);
            case 8:
                Object k = C4916y3.m13555k(obj, j2);
                if (k instanceof String) {
                    return !((String) k).isEmpty();
                }
                if (k instanceof zzacc) {
                    return !zzacc.zzb.equals(k);
                }
                throw new IllegalArgumentException();
            case 9:
                return C4916y3.m13555k(obj, j2) != null;
            case 10:
                return !zzacc.zzb.equals(C4916y3.m13555k(obj, j2));
            case 11:
                return C4916y3.m13552h(obj, j2) != 0;
            case 12:
                return C4916y3.m13552h(obj, j2) != 0;
            case 13:
                return C4916y3.m13552h(obj, j2) != 0;
            case 14:
                return C4916y3.m13553i(obj, j2) != 0;
            case 15:
                return C4916y3.m13552h(obj, j2) != 0;
            case 16:
                return C4916y3.m13553i(obj, j2) != 0;
            case 17:
                return C4916y3.m13555k(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: G */
    public final boolean mo26401G(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return mo26400F(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: J */
    public final boolean mo26402J(Object obj, int i, int i2) {
        return C4916y3.m13552h(obj, (long) (mo26418d0(i2) & 1048575)) == i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044c, code lost:
        r7 = r7 + 3;
        r5 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029b, code lost:
        r13 = r11;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26403L(java.lang.Object r17, p040c.p200q.p201a.p264c.p294g.p333g.C4809u0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f9501f
            if (r3 != 0) goto L_0x045d
            int[] r3 = r0.f9496a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f9495q
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r5
            r7 = 0
            r8 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x0453
            int r10 = r0.mo26426m(r7)
            int[] r11 = r0.f9496a
            r12 = r11[r7]
            int r13 = m12628l(r10)
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
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.g.x2 r6 = r0.mo26428p(r7)
            r2.mo26686B(r12, r5, r6)
            goto L_0x0041
        L_0x0056:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m12629n(r1, r5)
            r2.mo26698c(r12, r5)
            goto L_0x0041
        L_0x0064:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m12627W(r1, r5)
            r2.mo26696a(r12, r5)
            goto L_0x0041
        L_0x0072:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m12629n(r1, r5)
            r2.mo26694J(r12, r5)
            goto L_0x0041
        L_0x0080:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m12627W(r1, r5)
            r2.mo26692H(r12, r5)
            goto L_0x0041
        L_0x008e:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m12627W(r1, r5)
            r2.mo26714t(r12, r5)
            goto L_0x0041
        L_0x009c:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m12627W(r1, r5)
            r2.mo26703h(r12, r5)
            goto L_0x0041
        L_0x00aa:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.firebase-auth-api.zzacc r5 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r5
            r2.mo26709o(r12, r5)
            goto L_0x0041
        L_0x00ba:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.g.x2 r6 = r0.mo26428p(r7)
            r2.mo26691G(r12, r5, r6)
            goto L_0x0041
        L_0x00cd:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            m12621N(r12, r5, r2)
            goto L_0x0041
        L_0x00dc:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            boolean r5 = m12620K(r1, r5)
            r2.mo26707m(r12, r5)
            goto L_0x0041
        L_0x00eb:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m12627W(r1, r5)
            r2.mo26716v(r12, r5)
            goto L_0x0041
        L_0x00fa:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m12629n(r1, r5)
            r2.mo26718x(r12, r5)
            goto L_0x0041
        L_0x0109:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m12627W(r1, r5)
            r2.mo26687C(r12, r5)
            goto L_0x0041
        L_0x0118:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m12629n(r1, r5)
            r2.mo26705j(r12, r5)
            goto L_0x0041
        L_0x0127:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m12629n(r1, r5)
            r2.mo26689E(r12, r5)
            goto L_0x0041
        L_0x0136:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            float r5 = m12626T(r1, r5)
            r2.mo26720z(r12, r5)
            goto L_0x0041
        L_0x0145:
            boolean r10 = r0.mo26402J(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            double r5 = m12625S(r1, r5)
            r2.mo26711q(r12, r5)
            goto L_0x0041
        L_0x0154:
            java.lang.Object r5 = r4.getObject(r1, r5)
            r0.mo26404M(r2, r12, r5, r7)
            goto L_0x0041
        L_0x015d:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            c.q.a.c.g.g.x2 r6 = r0.mo26428p(r7)
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13675q(r10, r5, r2, r6)
            goto L_0x0041
        L_0x0170:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13682x(r10, r5, r2, r15)
            goto L_0x0041
        L_0x017f:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13681w(r10, r5, r2, r15)
            goto L_0x0041
        L_0x018e:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13680v(r10, r5, r2, r15)
            goto L_0x0041
        L_0x019d:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13679u(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ac:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13671m(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01bb:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13684z(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ca:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13668j(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01d9:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13672n(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01e8:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13673o(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01f7:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13676r(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0206:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13632B(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0215:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13677s(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0224:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13674p(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0233:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13670l(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0242:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r11 = 0
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13682x(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0251:
            r11 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13681w(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0260:
            r11 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13680v(r10, r5, r2, r11)
            goto L_0x029b
        L_0x026f:
            r11 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13679u(r10, r5, r2, r11)
            goto L_0x029b
        L_0x027e:
            r11 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13671m(r10, r5, r2, r11)
            goto L_0x029b
        L_0x028d:
            r11 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13684z(r10, r5, r2, r11)
        L_0x029b:
            r13 = r11
            goto L_0x044c
        L_0x029e:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13669k(r10, r5, r2)
            goto L_0x0041
        L_0x02ad:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            c.q.a.c.g.g.x2 r6 = r0.mo26428p(r7)
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13678t(r10, r5, r2, r6)
            goto L_0x0041
        L_0x02c0:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13683y(r10, r5, r2)
            goto L_0x0041
        L_0x02cf:
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r13 = 0
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13668j(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02df:
            r13 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13672n(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ef:
            r13 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13673o(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ff:
            r13 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13676r(r10, r5, r2, r13)
            goto L_0x044c
        L_0x030f:
            r13 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13632B(r10, r5, r2, r13)
            goto L_0x044c
        L_0x031f:
            r13 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13677s(r10, r5, r2, r13)
            goto L_0x044c
        L_0x032f:
            r13 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13674p(r10, r5, r2, r13)
            goto L_0x044c
        L_0x033f:
            r13 = 0
            int[] r10 = r0.f9496a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13670l(r10, r5, r2, r13)
            goto L_0x044c
        L_0x034f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.g.x2 r6 = r0.mo26428p(r7)
            r2.mo26686B(r12, r5, r6)
            goto L_0x044c
        L_0x0361:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo26698c(r12, r5)
            goto L_0x044c
        L_0x036f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo26696a(r12, r5)
            goto L_0x044c
        L_0x037d:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo26694J(r12, r5)
            goto L_0x044c
        L_0x038b:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo26692H(r12, r5)
            goto L_0x044c
        L_0x0399:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo26714t(r12, r5)
            goto L_0x044c
        L_0x03a7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo26703h(r12, r5)
            goto L_0x044c
        L_0x03b5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.firebase-auth-api.zzacc r5 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r5
            r2.mo26709o(r12, r5)
            goto L_0x044c
        L_0x03c5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            c.q.a.c.g.g.x2 r6 = r0.mo26428p(r7)
            r2.mo26691G(r12, r5, r6)
            goto L_0x044c
        L_0x03d7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            m12621N(r12, r5, r2)
            goto L_0x044c
        L_0x03e5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            boolean r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13541B(r1, r5)
            r2.mo26707m(r12, r5)
            goto L_0x044c
        L_0x03f2:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo26716v(r12, r5)
            goto L_0x044c
        L_0x03ff:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo26718x(r12, r5)
            goto L_0x044c
        L_0x040c:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo26687C(r12, r5)
            goto L_0x044c
        L_0x0419:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo26705j(r12, r5)
            goto L_0x044c
        L_0x0426:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo26689E(r12, r5)
            goto L_0x044c
        L_0x0433:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            float r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13551g(r1, r5)
            r2.mo26720z(r12, r5)
            goto L_0x044c
        L_0x0440:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            double r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13550f(r1, r5)
            r2.mo26711q(r12, r5)
        L_0x044c:
            int r7 = r7 + 3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0015
        L_0x0453:
            c.q.a.c.g.g.o3 r3 = r0.f9508m
            java.lang.Object r1 = r3.mo26440d(r1)
            r3.mo26454r(r1, r2)
            return
        L_0x045d:
            c.q.a.c.g.g.z0 r2 = r0.f9509n
            r2.mo25757a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26403L(java.lang.Object, c.q.a.c.g.g.u0):void");
    }

    /* renamed from: M */
    public final void mo26404M(C4809u0 u0Var, int i, Object obj, int i2) {
        if (obj != null) {
            C4410f2 f2Var = (C4410f2) mo26430r(i2);
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x033f, code lost:
        if (r0 != r15) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x035b, code lost:
        r7 = r34;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03a4, code lost:
        if (r0 != r15) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0192, code lost:
        r5 = r26 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0194, code lost:
        r1 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0197, code lost:
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01fb, code lost:
        r5 = r26 | r24;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01fe, code lost:
        r2 = r11;
        r3 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0202, code lost:
        r8 = r6;
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0299, code lost:
        r0 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x029b, code lost:
        r5 = r26 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x029d, code lost:
        r2 = r11;
        r3 = r13;
        r1 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a3, code lost:
        r8 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x02a5, code lost:
        r7 = r34;
        r2 = r6;
        r28 = r10;
        r20 = r11;
        r21 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo26405O(java.lang.Object r30, byte[] r31, int r32, int r33, int r34, p040c.p200q.p201a.p264c.p294g.p333g.C4860w r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            m12631v(r30)
            sun.misc.Unsafe r10 = f9495q
            r16 = 0
            r0 = r32
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001d:
            if (r0 >= r13) goto L_0x0412
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13439k(r0, r12, r1, r9)
            int r1 = r9.f9715a
            r4 = r1
            r1 = r0
            goto L_0x002f
        L_0x002e:
            r4 = r0
        L_0x002f:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r2) goto L_0x003c
            int r3 = r3 / r8
            int r2 = r15.mo26416c0(r0, r3)
            goto L_0x0040
        L_0x003c:
            int r2 = r15.mo26414b0(r0)
        L_0x0040:
            r19 = 0
            r3 = -1
            if (r2 != r3) goto L_0x0054
            r20 = r0
            r2 = r1
            r18 = r3
            r8 = r4
            r26 = r5
            r28 = r10
            r7 = r11
            r21 = r16
            goto L_0x03a7
        L_0x0054:
            int[] r3 = r15.f9496a
            int r20 = r2 + 1
            r8 = r3[r20]
            int r11 = m12628l(r8)
            r20 = r0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r8 & r17
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
            r17 = r4
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
            r17 = r4
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
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a3
            java.lang.Object r7 = r15.mo26431s(r14, r13)
            c.q.a.c.g.g.x2 r1 = r15.mo26428p(r13)
            int r0 = r11 << 3
            r5 = r0 | 4
            r0 = r7
            r2 = r31
            r3 = r6
            r4 = r33
            r8 = r17
            r6 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13442n(r0, r1, r2, r3, r4, r5, r6)
            r15.mo26397B(r14, r13, r7)
            goto L_0x0192
        L_0x00c5:
            if (r7 != 0) goto L_0x00eb
            r1 = r21
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r12, r1, r9)
            long r0 = r9.f9716b
            long r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12505l(r0)
            r11 = r20
            r7 = r22
            r0 = r10
            r1 = r30
            r13 = r2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r7
            r8 = r17
            r0.putLong(r1, r2, r4)
            r5 = r26 | r24
            r0 = r6
            goto L_0x0194
        L_0x00eb:
            r13 = r2
            r11 = r20
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r17
            r6 = r21
            goto L_0x02a5
        L_0x00f9:
            r13 = r2
            r8 = r17
            r11 = r20
            r1 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0197
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r12, r1, r9)
            int r1 = r9.f9715a
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12504k(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x0192
        L_0x0118:
            r13 = r2
            r8 = r17
            r11 = r20
            r1 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0197
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r12, r1, r9)
            int r1 = r9.f9715a
            c.q.a.c.g.g.o1 r2 = r15.mo26427o(r13)
            if (r2 == 0) goto L_0x014b
            boolean r2 = r2.zza()
            if (r2 == 0) goto L_0x013b
            goto L_0x014b
        L_0x013b:
            c.q.a.c.g.g.p3 r2 = m12622P(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo26506j(r8, r1)
            r1 = r8
            r2 = r11
            goto L_0x02fb
        L_0x014b:
            r10.putInt(r14, r3, r1)
            goto L_0x0192
        L_0x014f:
            r13 = r2
            r8 = r17
            r11 = r20
            r1 = r21
            r3 = r22
            r0 = 2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0197
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13429a(r12, r1, r9)
            java.lang.Object r1 = r9.f9717c
            r10.putObject(r14, r3, r1)
            goto L_0x0192
        L_0x016a:
            r13 = r2
            r8 = r17
            r11 = r20
            r1 = r21
            r0 = 2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0197
            java.lang.Object r6 = r15.mo26431s(r14, r13)
            c.q.a.c.g.g.x2 r2 = r15.mo26428p(r13)
            r0 = r6
            r5 = r1
            r1 = r2
            r2 = r31
            r3 = r5
            r4 = r33
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13443o(r0, r1, r2, r3, r4, r5)
            r15.mo26397B(r14, r13, r6)
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
            r6 = r17
            r11 = r20
            r5 = r21
            r3 = r22
            r0 = 2
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0202
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 != 0) goto L_0x01b5
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13435g(r12, r5, r9)
            goto L_0x01b9
        L_0x01b5:
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13436h(r12, r5, r9)
        L_0x01b9:
            java.lang.Object r1 = r9.f9717c
            r10.putObject(r14, r3, r1)
            goto L_0x01fb
        L_0x01bf:
            r13 = r2
            r6 = r17
            r11 = r20
            r5 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0202
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r12, r5, r9)
            long r7 = r9.f9716b
            r21 = 0
            int r2 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x01dc
            goto L_0x01de
        L_0x01dc:
            r1 = r16
        L_0x01de:
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13562r(r14, r3, r1)
            goto L_0x01fb
        L_0x01e2:
            r13 = r2
            r6 = r17
            r11 = r20
            r5 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x0202
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r12, r5)
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
            r6 = r17
            r11 = r20
            r5 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x0227
            long r7 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r12, r5)
            r0 = r10
            r1 = r30
            r2 = r3
            r17 = r6
            r6 = r5
            r4 = r7
            r0.putLong(r1, r2, r4)
            goto L_0x0299
        L_0x0227:
            r17 = r6
            r6 = r5
            goto L_0x02a3
        L_0x022c:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a3
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r12, r6, r9)
            int r1 = r9.f9715a
            r10.putInt(r14, r3, r1)
            goto L_0x029b
        L_0x0244:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x02a3
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r12, r6, r9)
            long r7 = r9.f9716b
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
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02a3
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r12, r6)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13565u(r14, r3, r0)
            int r0 = r6 + 4
            goto L_0x029b
        L_0x0280:
            r13 = r2
            r11 = r20
            r6 = r21
            r3 = r22
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r1) goto L_0x02a3
            long r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r12, r6)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13564t(r14, r3, r0)
        L_0x0299:
            int r0 = r6 + 8
        L_0x029b:
            r5 = r26 | r24
        L_0x029d:
            r2 = r11
            r3 = r13
            r1 = r17
            goto L_0x02fe
        L_0x02a3:
            r8 = r17
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
            r18 = -1
            r20 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r11 != r0) goto L_0x0313
            r0 = 2
            if (r7 != r0) goto L_0x0306
            java.lang.Object r0 = r10.getObject(r14, r3)
            c.q.a.c.g.g.p1 r0 = (p040c.p200q.p201a.p264c.p294g.p333g.C4679p1) r0
            boolean r7 = r0.mo26497b()
            if (r7 != 0) goto L_0x02e3
            int r7 = r0.size()
            if (r7 != 0) goto L_0x02db
            r7 = 10
            goto L_0x02dc
        L_0x02db:
            int r7 = r7 + r7
        L_0x02dc:
            c.q.a.c.g.g.p1 r0 = r0.mo25771i(r7)
            r10.putObject(r14, r3, r0)
        L_0x02e3:
            r7 = r0
            c.q.a.c.g.g.x2 r0 = r15.mo26428p(r13)
            r8 = r1
            r1 = r2
            r11 = r2
            r2 = r31
            r3 = r6
            r4 = r33
            r26 = r5
            r5 = r7
            r6 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13433e(r0, r1, r2, r3, r4, r5, r6)
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
            r17 = r2
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
            r17 = r5
            r15 = r6
            r6 = r8
            r20 = r8
            r8 = r13
            r28 = r10
            r9 = r21
            r21 = r13
            r12 = r24
            r14 = r35
            int r0 = r0.mo26412a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x035b
        L_0x0341:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r9 = r35
            r1 = r17
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
            r17 = r5
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
            r8 = r17
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
            r0.mo26408X(r1, r2, r3, r4, r5, r6, r8)
            throw r19
        L_0x038c:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r20
            r9 = r11
            r10 = r24
            r12 = r21
            r13 = r35
            int r0 = r0.mo26409Y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x035b
            goto L_0x0341
        L_0x03a7:
            if (r8 != r7) goto L_0x03b8
            if (r7 == 0) goto L_0x03b8
            r9 = r29
            r12 = r30
            r0 = r6
            r5 = r26
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2
            goto L_0x0422
        L_0x03b8:
            r9 = r29
            boolean r0 = r9.f9501f
            if (r0 == 0) goto L_0x03eb
            r10 = r35
            c.q.a.c.g.g.y0 r0 = r10.f9718d
            c.q.a.c.g.g.y0 r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4913y0.f9740b
            if (r0 == r1) goto L_0x03e8
            c.q.a.c.g.g.l2 r1 = r9.f9500e
            r11 = r20
            c.q.a.c.g.g.j1 r0 = r0.mo26854b(r1, r11)
            if (r0 != 0) goto L_0x03e2
            c.q.a.c.g.g.p3 r4 = m12622P(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13437i(r0, r1, r2, r3, r4, r5)
            r12 = r30
            goto L_0x0400
        L_0x03e2:
            r12 = r30
            r0 = r12
            c.q.a.c.g.g.i1 r0 = (p040c.p200q.p201a.p264c.p294g.p333g.C4490i1) r0
            throw r19
        L_0x03e8:
            r12 = r30
            goto L_0x03ef
        L_0x03eb:
            r12 = r30
            r10 = r35
        L_0x03ef:
            r11 = r20
            c.q.a.c.g.g.p3 r4 = m12622P(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13437i(r0, r1, r2, r3, r4, r5)
        L_0x0400:
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
        L_0x0412:
            r26 = r5
            r27 = r6
            r28 = r10
            r7 = r11
            r12 = r14
            r9 = r15
            r6 = r0
            r8 = r1
            r0 = r27
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0422:
            if (r0 == r1) goto L_0x042a
            long r0 = (long) r0
            r2 = r28
            r2.putInt(r12, r0, r5)
        L_0x042a:
            int r0 = r9.f9505j
            r10 = r0
        L_0x042d:
            int r0 = r9.f9506k
            if (r10 >= r0) goto L_0x0444
            int[] r0 = r9.f9504i
            r2 = r0[r10]
            r3 = 0
            c.q.a.c.g.g.o3 r4 = r9.f9508m
            r0 = r29
            r1 = r30
            r5 = r30
            r0.mo26429q(r1, r2, r3, r4, r5)
            int r10 = r10 + 1
            goto L_0x042d
        L_0x0444:
            if (r7 != 0) goto L_0x0450
            r0 = r33
            if (r6 != r0) goto L_0x044b
            goto L_0x0456
        L_0x044b:
            com.google.android.gms.internal.firebase-auth-api.zzadn r0 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzg()
            throw r0
        L_0x0450:
            r0 = r33
            if (r6 > r0) goto L_0x0457
            if (r8 != r7) goto L_0x0457
        L_0x0456:
            return r6
        L_0x0457:
            com.google.android.gms.internal.firebase-auth-api.zzadn r0 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26405O(java.lang.Object, byte[], int, int, int, c.q.a.c.g.g.w):int");
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
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo26406U(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f9495q
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r3
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000d:
            int[] r9 = r0.f9496a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0556
            int r9 = r0.mo26426m(r5)
            int[] r10 = r0.f9496a
            r11 = r10[r5]
            int r12 = m12628l(r9)
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
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.g.l2 r3 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r3
            c.q.a.c.g.g.x2 r4 = r0.mo26428p(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13096F(r11, r3, r4)
            goto L_0x037e
        L_0x0056:
            boolean r10 = r0.mo26402J(r1, r11, r5)
            if (r10 == 0) goto L_0x037f
            long r3 = m12629n(r1, r3)
            int r10 = r11 << 3
            int r10 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037f
        L_0x0072:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m12627W(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030b
        L_0x008d:
            boolean r3 = r0.mo26402J(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x01bc
        L_0x009b:
            boolean r3 = r0.mo26402J(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x01ac
        L_0x00a9:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m12627W(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r3)
            goto L_0x030b
        L_0x00bf:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m12627W(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030b
        L_0x00d5:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
        L_0x00ef:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030c
        L_0x00f3:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.g.x2 r4 = r0.mo26428p(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13647Q(r11, r3, r4)
            goto L_0x037e
        L_0x0107:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.p527firebaseauthapi.zzacc
            if (r4 == 0) goto L_0x0126
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x00ef
        L_0x0126:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13101d(r3)
            goto L_0x030b
        L_0x0134:
            boolean r3 = r0.mo26402J(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            int r3 = r3 + r14
            goto L_0x037e
        L_0x0143:
            boolean r3 = r0.mo26402J(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x01ac
        L_0x0150:
            boolean r3 = r0.mo26402J(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x01bc
        L_0x015d:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            int r3 = m12627W(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r3)
            goto L_0x030b
        L_0x0173:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            long r3 = m12629n(r1, r3)
            int r9 = r11 << 3
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r3)
            goto L_0x019c
        L_0x0188:
            boolean r9 = r0.mo26402J(r1, r11, r5)
            if (r9 == 0) goto L_0x037f
            long r3 = m12629n(r1, r3)
            int r9 = r11 << 3
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r3)
        L_0x019c:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037f
        L_0x01a0:
            boolean r3 = r0.mo26402J(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
        L_0x01ac:
            int r3 = r3 + 4
            goto L_0x037e
        L_0x01b0:
            boolean r3 = r0.mo26402J(r1, r11, r5)
            if (r3 == 0) goto L_0x037f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
        L_0x01bc:
            int r3 = r3 + 8
            goto L_0x037e
        L_0x01c0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.mo26430r(r5)
            p040c.p200q.p201a.p264c.p294g.p333g.C4437g2.m12016a(r11, r3, r4)
            goto L_0x037f
        L_0x01cd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            c.q.a.c.g.g.x2 r4 = r0.mo26428p(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13642L(r11, r3, r4)
            goto L_0x037e
        L_0x01dd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13652V(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x01f3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13650T(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x0209:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13641K(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x021f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13639I(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x0235:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13637G(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x024b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13655Y(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x0261:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13634D(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x0277:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13639I(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x028d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13641K(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x02a2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13644N(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x02b7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13658a0(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x02cc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13646P(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x02e1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13639I(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x030a
        L_0x02f6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13641K(r3)
            if (r3 <= 0) goto L_0x037f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r11)
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
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
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13651U(r11, r3, r9)
            goto L_0x034a
        L_0x031b:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13649S(r11, r3, r9)
            goto L_0x034a
        L_0x0327:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13640J(r11, r3, r9)
            goto L_0x034a
        L_0x0333:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13638H(r11, r3, r9)
            goto L_0x034a
        L_0x033f:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13636F(r11, r3, r9)
        L_0x034a:
            int r6 = r6 + r3
            r12 = r9
            goto L_0x054f
        L_0x034e:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13654X(r11, r3, r9)
            goto L_0x037e
        L_0x035a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13635E(r11, r3)
            goto L_0x037e
        L_0x0365:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            c.q.a.c.g.g.x2 r4 = r0.mo26428p(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13648R(r11, r3, r4)
            goto L_0x037e
        L_0x0374:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13653W(r11, r3)
        L_0x037e:
            int r6 = r6 + r3
        L_0x037f:
            r12 = 0
            goto L_0x054f
        L_0x0382:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13631A(r11, r3, r12)
            goto L_0x03e1
        L_0x038e:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13638H(r11, r3, r12)
            goto L_0x03e1
        L_0x039a:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13640J(r11, r3, r12)
            goto L_0x03e1
        L_0x03a6:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13643M(r11, r3, r12)
            goto L_0x03e1
        L_0x03b2:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13656Z(r11, r3, r12)
            goto L_0x03e1
        L_0x03be:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13645O(r11, r3, r12)
            goto L_0x03e1
        L_0x03ca:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13638H(r11, r3, r12)
            goto L_0x03e1
        L_0x03d6:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13640J(r11, r3, r12)
        L_0x03e1:
            int r6 = r6 + r3
            goto L_0x054f
        L_0x03e4:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.g.l2 r3 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r3
            c.q.a.c.g.g.x2 r4 = r0.mo26428p(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13096F(r11, r3, r4)
            goto L_0x03e1
        L_0x03f8:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054f
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r10)
            long r14 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r14
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054f
        L_0x0412:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x0504
        L_0x042c:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x054b
        L_0x0439:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x053c
        L_0x0446:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r3)
            goto L_0x0504
        L_0x045b:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x0504
        L_0x0470:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
        L_0x0489:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0505
        L_0x048d:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            c.q.a.c.g.g.x2 r4 = r0.mo26428p(r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13647Q(r11, r3, r4)
            goto L_0x03e1
        L_0x04a0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.p527firebaseauthapi.zzacc
            if (r4 == 0) goto L_0x04be
            com.google.android.gms.internal.firebase-auth-api.zzacc r3 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = r3.zzd()
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x0489
        L_0x04be:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13101d(r3)
            goto L_0x0504
        L_0x04cb:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            int r3 = r3 + r14
            goto L_0x03e1
        L_0x04d9:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x053c
        L_0x04e5:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
            goto L_0x054b
        L_0x04f1:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r3)
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
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r3)
            goto L_0x052e
        L_0x051b:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054f
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r9)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r3)
        L_0x052e:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054f
        L_0x0531:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
        L_0x053c:
            int r3 = r3 + 4
            goto L_0x03e1
        L_0x0540:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054f
            int r3 = r11 << 3
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r3)
        L_0x054b:
            int r3 = r3 + 8
            goto L_0x03e1
        L_0x054f:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0556:
            c.q.a.c.g.g.o3 r2 = r0.f9508m
            java.lang.Object r3 = r2.mo26440d(r1)
            int r2 = r2.mo26437a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f9501f
            if (r2 != 0) goto L_0x0566
            return r6
        L_0x0566:
            c.q.a.c.g.g.z0 r2 = r0.f9509n
            r2.mo25757a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26406U(java.lang.Object):int");
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
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo26407V(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f9495q
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f9496a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.mo26426m(r2)
            int r5 = m12628l(r4)
            int[] r6 = r11.f9496a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.firebase-auth-api.zzacy r4 = com.google.android.gms.internal.p527firebaseauthapi.zzacy.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.firebase-auth-api.zzacy r4 = com.google.android.gms.internal.p527firebaseauthapi.zzacy.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f9496a
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
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            c.q.a.c.g.g.l2 r4 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r4
            c.q.a.c.g.g.x2 r5 = r11.mo26428p(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13096F(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.mo26402J(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m12629n(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12627W(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12627W(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12627W(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            c.q.a.c.g.g.x2 r5 = r11.mo26428p(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13647Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p527firebaseauthapi.zzacc
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13101d(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m12627W(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m12629n(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m12629n(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.mo26402J(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.lang.Object r5 = r11.mo26430r(r2)
            p040c.p200q.p201a.p264c.p294g.p333g.C4437g2.m12016a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            c.q.a.c.g.g.x2 r5 = r11.mo26428p(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13642L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13652V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13650T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13641K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13639I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13637G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13655Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13634D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13639I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13641K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13644N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13658a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13646P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13639I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13641K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13102e(r6)
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13651U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13649S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13640J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13638H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13636F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13654X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13635E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            c.q.a.c.g.g.x2 r5 = r11.mo26428p(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13648R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13653W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13631A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13638H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13640J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13643M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13656Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13645O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13638H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13640J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            c.q.a.c.g.g.l2 r4 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r4
            c.q.a.c.g.g.x2 r5 = r11.mo26428p(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13096F(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.mo26400F(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            c.q.a.c.g.g.x2 r5 = r11.mo26428p(r2)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13647Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.p527firebaseauthapi.zzacc
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = (com.google.android.gms.internal.p527firebaseauthapi.zzacc) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = r4.zzd()
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13101d(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r12, r7)
            int r5 = r6 << 3
            int r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r5)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13097G(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r12, r7)
            int r6 = r6 << 3
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r6)
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13104g(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.mo26400F(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4783t0.m13103f(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            c.q.a.c.g.g.o3 r0 = r11.f9508m
            java.lang.Object r12 = r0.mo26440d(r12)
            int r12 = r0.mo26437a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26407V(java.lang.Object):int");
    }

    /* renamed from: X */
    public final int mo26408X(Object obj, byte[] bArr, int i, int i2, int i3, long j, C4860w wVar) {
        Unsafe unsafe = f9495q;
        Object r = mo26430r(i3);
        Object object = unsafe.getObject(obj, j);
        if (C4437g2.m12017b(object)) {
            zzaee zzb = zzaee.zza().zzb();
            C4437g2.m12018c(zzb, object);
            unsafe.putObject(obj, j, zzb);
        }
        C4410f2 f2Var = (C4410f2) r;
        throw null;
    }

    /* renamed from: Y */
    public final int mo26409Y(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C4860w wVar) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C4860w wVar2 = wVar;
        Unsafe unsafe = f9495q;
        long j3 = (long) (this.f9496a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(C4886x.m13444p(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(C4886x.m13430b(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = C4886x.m13441m(bArr2, i9, wVar2);
                    unsafe.putObject(obj2, j2, Long.valueOf(wVar2.f9716b));
                    unsafe.putInt(obj2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = C4886x.m13438j(bArr2, i9, wVar2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(wVar2.f9715a));
                    unsafe.putInt(obj2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(C4886x.m13444p(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(C4886x.m13430b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = C4886x.m13441m(bArr2, i9, wVar2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(wVar2.f9716b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = C4886x.m13438j(bArr2, i9, wVar2);
                    int i14 = wVar2.f9715a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C4385e4.m11888f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, j5, i14, C4706q1.f9576a));
                        j5 += i14;
                    } else {
                        throw zzadn.zzd();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    Object t = mo26432t(obj2, i11, i13);
                    int o = C4886x.m13443o(t, mo26428p(i13), bArr, i, i2, wVar);
                    mo26398C(obj2, i11, i13, t);
                    return o;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C4886x.m13429a(bArr2, i9, wVar2);
                    unsafe.putObject(obj2, j2, wVar2.f9717c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = C4886x.m13438j(bArr2, i9, wVar2);
                    int i15 = wVar2.f9715a;
                    C4652o1 o2 = mo26427o(i13);
                    if (o2 == null || o2.zza()) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m12622P(obj).mo26506j(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = C4886x.m13438j(bArr2, i9, wVar2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(C4624n0.m12504k(wVar2.f9715a)));
                    unsafe.putInt(obj2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m3 = C4886x.m13441m(bArr2, i9, wVar2);
                    unsafe.putObject(obj2, j2, Long.valueOf(C4624n0.m12505l(wVar2.f9716b)));
                    unsafe.putInt(obj2, j3, i11);
                    return m3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    Object t2 = mo26432t(obj2, i11, i13);
                    int n = C4886x.m13442n(t2, mo26428p(i13), bArr, i, i2, (i10 & -8) | 4, wVar);
                    mo26398C(obj2, i11, i13, t2);
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
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo26410Z(java.lang.Object r31, byte[] r32, int r33, int r34, p040c.p200q.p201a.p264c.p294g.p333g.C4860w r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            m12631v(r31)
            sun.misc.Unsafe r9 = f9495q
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
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13439k(r0, r12, r3, r11)
            int r3 = r11.f9715a
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
            int r0 = r15.mo26416c0(r5, r2)
            goto L_0x0042
        L_0x003e:
            int r0 = r15.mo26414b0(r5)
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
            int[] r0 = r15.f9496a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r13 = m12628l(r1)
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
            int r13 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r12, r4, r11)
            long r0 = r11.f9716b
            long r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12505l(r0)
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
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r12, r4, r11)
            int r1 = r11.f9715a
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12504k(r1)
            r7.putInt(r14, r8, r1)
            goto L_0x0114
        L_0x00ee:
            r23 = r33
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x014b
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r12, r4, r11)
            int r1 = r11.f9715a
            r7.putInt(r14, r8, r1)
            goto L_0x0114
        L_0x0101:
            r23 = r33
            r15 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x014b
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13429a(r12, r4, r11)
            java.lang.Object r1 = r11.f9717c
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
            java.lang.Object r8 = r13.mo26431s(r14, r15)
            c.q.a.c.g.g.x2 r1 = r13.mo26428p(r15)
            r0 = r8
            r2 = r32
            r3 = r4
            r4 = r34
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13443o(r0, r1, r2, r3, r4, r5)
            r13.mo26397B(r14, r15, r8)
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
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13435g(r12, r4, r11)
            goto L_0x016f
        L_0x016b:
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13436h(r12, r4, r11)
        L_0x016f:
            java.lang.Object r1 = r11.f9717c
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
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r12, r4, r11)
            long r1 = r11.f9716b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0190
            goto L_0x0192
        L_0x0190:
            r5 = r16
        L_0x0192:
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13562r(r14, r8, r5)
            goto L_0x0238
        L_0x0197:
            r13 = r30
            r23 = r33
            r19 = r15
            r15 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x0247
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r12, r4)
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
            long r21 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r12, r4)
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
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r12, r4, r11)
            int r1 = r11.f9715a
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
            int r17 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r12, r4, r11)
            long r4 = r11.f9716b
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
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13565u(r14, r8, r0)
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
            long r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13564t(r14, r8, r0)
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
            c.q.a.c.g.g.p1 r0 = (p040c.p200q.p201a.p264c.p294g.p333g.C4679p1) r0
            boolean r1 = r0.mo26497b()
            if (r1 != 0) goto L_0x0281
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0279
            r1 = 10
            goto L_0x027a
        L_0x0279:
            int r1 = r1 + r1
        L_0x027a:
            c.q.a.c.g.g.p1 r0 = r0.mo25771i(r1)
            r7.putObject(r14, r8, r0)
        L_0x0281:
            r5 = r0
            c.q.a.c.g.g.x2 r0 = r10.mo26428p(r15)
            r1 = r17
            r2 = r32
            r3 = r4
            r4 = r34
            r8 = r6
            r6 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13433e(r0, r1, r2, r3, r4, r5, r6)
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
            int r0 = r0.mo26412a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
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
            r0.mo26408X(r1, r2, r3, r4, r5, r6, r8)
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
            int r0 = r0.mo26409Y(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02fc
            goto L_0x02e9
        L_0x034c:
            c.q.a.c.g.g.p3 r4 = m12622P(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13437i(r0, r1, r2, r3, r4, r5)
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
            com.google.android.gms.internal.firebase-auth-api.zzadn r0 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26410Z(java.lang.Object, byte[], int, int, c.q.a.c.g.g.w):int");
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
    public final int mo26411a(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f9496a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.mo26426m(r1)
            int[] r4 = r8.f9496a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m12628l(r3)
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
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12629n(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12627W(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12629n(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12627W(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12627W(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12627W(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m12620K(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12864a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12627W(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12629n(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m12627W(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12629n(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m12629n(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m12626T(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.mo26402J(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m12625S(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13541B(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12864a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13552h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13553i(r9, r5)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13551g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13550f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.m12866c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            c.q.a.c.g.g.o3 r0 = r8.f9508m
            java.lang.Object r0 = r0.mo26440d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f9501f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            c.q.a.c.g.g.z0 r0 = r8.f9509n
            r0.mo25757a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26411a(java.lang.Object):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x044a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ca  */
    /* renamed from: a0 */
    public final int mo26412a0(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p040c.p200q.p201a.p264c.p294g.p333g.C4860w r29) {
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
            sun.misc.Unsafe r11 = f9495q
            java.lang.Object r11 = r11.getObject(r1, r9)
            c.q.a.c.g.g.p1 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4679p1) r11
            boolean r12 = r11.mo26497b()
            if (r12 != 0) goto L_0x0034
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002a
            r12 = 10
            goto L_0x002b
        L_0x002a:
            int r12 = r12 + r12
        L_0x002b:
            c.q.a.c.g.g.p1 r11 = r11.mo25771i(r12)
            sun.misc.Unsafe r12 = f9495q
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
            c.q.a.c.g.g.x2 r1 = r15.mo26428p(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13431c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f9717c
            r11.add(r8)
            goto L_0x0427
        L_0x005e:
            if (r6 != r14) goto L_0x0082
            c.q.a.c.g.g.a2 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4275a2) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r2 = r7.f9715a
            int r2 = r2 + r1
        L_0x0069:
            if (r1 >= r2) goto L_0x0079
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r1, r7)
            long r4 = r7.f9716b
            long r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12505l(r4)
            r11.mo25768g(r4)
            goto L_0x0069
        L_0x0079:
            if (r1 != r2) goto L_0x007d
            goto L_0x044a
        L_0x007d:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x0082:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.g.a2 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4275a2) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r4, r7)
            long r8 = r7.f9716b
            long r8 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12505l(r8)
            r11.mo25768g(r8)
        L_0x0093:
            if (r1 >= r5) goto L_0x00ac
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x009e
            goto L_0x00ac
        L_0x009e:
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r4, r7)
            long r8 = r7.f9716b
            long r8 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12505l(r8)
            r11.mo25768g(r8)
            goto L_0x0093
        L_0x00ac:
            return r1
        L_0x00ad:
            if (r6 != r14) goto L_0x00d1
            c.q.a.c.g.g.l1 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4571l1) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r2 = r7.f9715a
            int r2 = r2 + r1
        L_0x00b8:
            if (r1 >= r2) goto L_0x00c8
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r4 = r7.f9715a
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12504k(r4)
            r11.mo26223g(r4)
            goto L_0x00b8
        L_0x00c8:
            if (r1 != r2) goto L_0x00cc
            goto L_0x044a
        L_0x00cc:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x00d1:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.g.l1 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4571l1) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12504k(r4)
            r11.mo26223g(r4)
        L_0x00e2:
            if (r1 >= r5) goto L_0x00fb
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x00ed
            goto L_0x00fb
        L_0x00ed:
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4624n0.m12504k(r4)
            r11.mo26223g(r4)
            goto L_0x00e2
        L_0x00fb:
            return r1
        L_0x00fc:
            if (r6 != r14) goto L_0x0103
            int r2 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13434f(r3, r4, r11, r7)
            goto L_0x0114
        L_0x0103:
            if (r6 != 0) goto L_0x0449
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r11
            r7 = r29
            int r2 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13440l(r2, r3, r4, r5, r6, r7)
        L_0x0114:
            c.q.a.c.g.g.o1 r3 = r15.mo26427o(r8)
            r4 = 0
            c.q.a.c.g.g.o3 r5 = r0.f9508m
            r22 = r16
            r23 = r21
            r24 = r11
            r25 = r3
            r26 = r4
            r27 = r5
            p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13661c(r22, r23, r24, r25, r26, r27)
        L_0x012a:
            r1 = r2
            goto L_0x044a
        L_0x012d:
            if (r6 != r14) goto L_0x0449
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            if (r4 < 0) goto L_0x0182
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x017d
            if (r4 != 0) goto L_0x0143
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = com.google.android.gms.internal.p527firebaseauthapi.zzacc.zzb
            r11.add(r4)
            goto L_0x014b
        L_0x0143:
            com.google.android.gms.internal.firebase-auth-api.zzacc r6 = com.google.android.gms.internal.p527firebaseauthapi.zzacc.zzo(r3, r1, r4)
            r11.add(r6)
        L_0x014a:
            int r1 = r1 + r4
        L_0x014b:
            if (r1 >= r5) goto L_0x017c
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x0156
            goto L_0x017c
        L_0x0156:
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            if (r4 < 0) goto L_0x0177
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0172
            if (r4 != 0) goto L_0x016a
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = com.google.android.gms.internal.p527firebaseauthapi.zzacc.zzb
            r11.add(r4)
            goto L_0x014b
        L_0x016a:
            com.google.android.gms.internal.firebase-auth-api.zzacc r6 = com.google.android.gms.internal.p527firebaseauthapi.zzacc.zzo(r3, r1, r4)
            r11.add(r6)
            goto L_0x014a
        L_0x0172:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x0177:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzf()
            throw r1
        L_0x017c:
            return r1
        L_0x017d:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x0182:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzf()
            throw r1
        L_0x0187:
            if (r6 == r14) goto L_0x018b
            goto L_0x0449
        L_0x018b:
            c.q.a.c.g.g.x2 r1 = r15.mo26428p(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r11
            r27 = r29
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13433e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a2:
            if (r6 != r14) goto L_0x0449
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01f5
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            if (r4 < 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01bd
            r11.add(r6)
            goto L_0x01c8
        L_0x01bd:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.f9576a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
        L_0x01c7:
            int r1 = r1 + r4
        L_0x01c8:
            if (r1 >= r5) goto L_0x044a
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r8 = r7.f9715a
            if (r2 != r8) goto L_0x044a
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            if (r4 < 0) goto L_0x01eb
            if (r4 != 0) goto L_0x01e0
            r11.add(r6)
            goto L_0x01c8
        L_0x01e0:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.f9576a
            r8.<init>(r3, r1, r4, r9)
            r11.add(r8)
            goto L_0x01c7
        L_0x01eb:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzf()
            throw r1
        L_0x01f0:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzf()
            throw r1
        L_0x01f5:
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            if (r4 < 0) goto L_0x0250
            if (r4 != 0) goto L_0x0203
            r11.add(r6)
            goto L_0x0216
        L_0x0203:
            int r8 = r1 + r4
            boolean r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4385e4.m11888f(r3, r1, r8)
            if (r9 == 0) goto L_0x024b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.f9576a
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
        L_0x0215:
            r1 = r8
        L_0x0216:
            if (r1 >= r5) goto L_0x044a
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r8 = r7.f9715a
            if (r2 != r8) goto L_0x044a
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            if (r4 < 0) goto L_0x0246
            if (r4 != 0) goto L_0x022e
            r11.add(r6)
            goto L_0x0216
        L_0x022e:
            int r8 = r1 + r4
            boolean r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4385e4.m11888f(r3, r1, r8)
            if (r9 == 0) goto L_0x0241
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = p040c.p200q.p201a.p264c.p294g.p333g.C4706q1.f9576a
            r9.<init>(r3, r1, r4, r10)
            r11.add(r9)
            goto L_0x0215
        L_0x0241:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzd()
            throw r1
        L_0x0246:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzf()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzd()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzf()
            throw r1
        L_0x0255:
            r1 = 0
            if (r6 != r14) goto L_0x027d
            c.q.a.c.g.g.y r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4912y) r11
            int r2 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r4 = r7.f9715a
            int r4 = r4 + r2
        L_0x0261:
            if (r2 >= r4) goto L_0x0274
            int r2 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r2, r7)
            long r5 = r7.f9716b
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x026f
            r5 = r10
            goto L_0x0270
        L_0x026f:
            r5 = r1
        L_0x0270:
            r11.mo26846f(r5)
            goto L_0x0261
        L_0x0274:
            if (r2 != r4) goto L_0x0278
            goto L_0x012a
        L_0x0278:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x027d:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.g.y r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4912y) r11
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r4, r7)
            long r8 = r7.f9716b
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x028d
            r6 = r10
            goto L_0x028e
        L_0x028d:
            r6 = r1
        L_0x028e:
            r11.mo26846f(r6)
        L_0x0291:
            if (r4 >= r5) goto L_0x02ad
            int r6 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r8 = r7.f9715a
            if (r2 == r8) goto L_0x029c
            goto L_0x02ad
        L_0x029c:
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r6, r7)
            long r8 = r7.f9716b
            int r6 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r6 == 0) goto L_0x02a8
            r6 = r10
            goto L_0x02a9
        L_0x02a8:
            r6 = r1
        L_0x02a9:
            r11.mo26846f(r6)
            goto L_0x0291
        L_0x02ad:
            return r4
        L_0x02ae:
            if (r6 != r14) goto L_0x02ce
            c.q.a.c.g.g.l1 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4571l1) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r2 = r7.f9715a
            int r2 = r2 + r1
        L_0x02b9:
            if (r1 >= r2) goto L_0x02c5
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r3, r1)
            r11.mo26223g(r4)
            int r1 = r1 + 4
            goto L_0x02b9
        L_0x02c5:
            if (r1 != r2) goto L_0x02c9
            goto L_0x044a
        L_0x02c9:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x02ce:
            if (r6 != r9) goto L_0x0449
            c.q.a.c.g.g.l1 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4571l1) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r17, r18)
            r11.mo26223g(r1)
        L_0x02d9:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02ee
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x02e6
            goto L_0x02ee
        L_0x02e6:
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r3, r4)
            r11.mo26223g(r1)
            goto L_0x02d9
        L_0x02ee:
            return r1
        L_0x02ef:
            if (r6 != r14) goto L_0x030f
            c.q.a.c.g.g.a2 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4275a2) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r2 = r7.f9715a
            int r2 = r2 + r1
        L_0x02fa:
            if (r1 >= r2) goto L_0x0306
            long r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r3, r1)
            r11.mo25768g(r4)
            int r1 = r1 + 8
            goto L_0x02fa
        L_0x0306:
            if (r1 != r2) goto L_0x030a
            goto L_0x044a
        L_0x030a:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x030f:
            if (r6 != r10) goto L_0x0449
            c.q.a.c.g.g.a2 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4275a2) r11
            long r8 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r17, r18)
            r11.mo25768g(r8)
        L_0x031a:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x032f
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x0327
            goto L_0x032f
        L_0x0327:
            long r8 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r3, r4)
            r11.mo25768g(r8)
            goto L_0x031a
        L_0x032f:
            return r1
        L_0x0330:
            if (r6 != r14) goto L_0x0338
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13434f(r3, r4, r11, r7)
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
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13440l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x034b:
            if (r6 != r14) goto L_0x036b
            c.q.a.c.g.g.a2 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4275a2) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r2 = r7.f9715a
            int r2 = r2 + r1
        L_0x0356:
            if (r1 >= r2) goto L_0x0362
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r1, r7)
            long r4 = r7.f9716b
            r11.mo25768g(r4)
            goto L_0x0356
        L_0x0362:
            if (r1 != r2) goto L_0x0366
            goto L_0x044a
        L_0x0366:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x036b:
            if (r6 != 0) goto L_0x0449
            c.q.a.c.g.g.a2 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4275a2) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r4, r7)
            long r8 = r7.f9716b
            r11.mo25768g(r8)
        L_0x0378:
            if (r1 >= r5) goto L_0x038d
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x0383
            goto L_0x038d
        L_0x0383:
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13441m(r3, r4, r7)
            long r8 = r7.f9716b
            r11.mo25768g(r8)
            goto L_0x0378
        L_0x038d:
            return r1
        L_0x038e:
            if (r6 != r14) goto L_0x03b2
            c.q.a.c.g.g.e1 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4382e1) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r2 = r7.f9715a
            int r2 = r2 + r1
        L_0x0399:
            if (r1 >= r2) goto L_0x03a9
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r11.mo25923f(r4)
            int r1 = r1 + 4
            goto L_0x0399
        L_0x03a9:
            if (r1 != r2) goto L_0x03ad
            goto L_0x044a
        L_0x03ad:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x03b2:
            if (r6 != r9) goto L_0x0449
            c.q.a.c.g.g.e1 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4382e1) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r11.mo25923f(r1)
        L_0x03c1:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03da
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x03ce
            goto L_0x03da
        L_0x03ce:
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13430b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r11.mo25923f(r1)
            goto L_0x03c1
        L_0x03da:
            return r1
        L_0x03db:
            if (r6 != r14) goto L_0x03fe
            c.q.a.c.g.g.v0 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4835v0) r11
            int r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r2 = r7.f9715a
            int r2 = r2 + r1
        L_0x03e6:
            if (r1 >= r2) goto L_0x03f6
            long r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r11.mo26753f(r4)
            int r1 = r1 + 8
            goto L_0x03e6
        L_0x03f6:
            if (r1 != r2) goto L_0x03f9
            goto L_0x044a
        L_0x03f9:
            com.google.android.gms.internal.firebase-auth-api.zzadn r1 = com.google.android.gms.internal.p527firebaseauthapi.zzadn.zzi()
            throw r1
        L_0x03fe:
            if (r6 != r10) goto L_0x0449
            c.q.a.c.g.g.v0 r11 = (p040c.p200q.p201a.p264c.p294g.p333g.C4835v0) r11
            long r8 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r11.mo26753f(r8)
        L_0x040d:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0426
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r1, r7)
            int r6 = r7.f9715a
            if (r2 == r6) goto L_0x041a
            goto L_0x0426
        L_0x041a:
            long r8 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13444p(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r11.mo26753f(r8)
            goto L_0x040d
        L_0x0426:
            return r1
        L_0x0427:
            if (r4 >= r5) goto L_0x0448
            int r8 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13438j(r3, r4, r7)
            int r9 = r7.f9715a
            if (r2 == r9) goto L_0x0432
            goto L_0x0448
        L_0x0432:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = p040c.p200q.p201a.p264c.p294g.p333g.C4886x.m13431c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f9717c
            r11.add(r8)
            goto L_0x0427
        L_0x0448:
            return r4
        L_0x0449:
            r1 = r4
        L_0x044a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26412a0(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, c.q.a.c.g.g.w):int");
    }

    /* renamed from: b */
    public final void mo26413b(Object obj) {
        if (m12619I(obj)) {
            if (obj instanceof C4544k1) {
                C4544k1 k1Var = (C4544k1) obj;
                k1Var.mo26154m(Integer.MAX_VALUE);
                k1Var.zza = 0;
                k1Var.mo26153k();
            }
            int length = this.f9496a.length;
            for (int i = 0; i < length; i += 3) {
                int m = mo26426m(i);
                long j = (long) (1048575 & m);
                int l = m12628l(m);
                if (l != 9) {
                    switch (l) {
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
                            this.f9507l.mo26762b(obj, j);
                            continue;
                        case 50:
                            Object object = f9495q.getObject(obj, j);
                            if (object != null) {
                                Unsafe unsafe = f9495q;
                                ((zzaee) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (mo26400F(obj, i)) {
                    mo26428p(i).mo26413b(f9495q.getObject(obj, j));
                }
            }
            this.f9508m.mo26449m(obj);
            if (this.f9501f) {
                this.f9509n.mo25760d(obj);
                throw null;
            }
        }
    }

    /* renamed from: b0 */
    public final int mo26414b0(int i) {
        if (i < this.f9498c || i > this.f9499d) {
            return -1;
        }
        return mo26425k(i, 0);
    }

    /* renamed from: c */
    public final boolean mo26415c(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f9505j) {
            int i6 = this.f9504i[i5];
            int i7 = this.f9496a[i6];
            int m = mo26426m(i6);
            int i8 = this.f9496a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f9495q.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & m) != 0 && !mo26401G(obj, i6, i2, i, i10)) {
                return false;
            }
            int l = m12628l(m);
            if (l != 9 && l != 17) {
                if (l != 27) {
                    if (l == 60 || l == 68) {
                        if (mo26402J(obj2, i7, i6) && !m12618H(obj2, m, mo26428p(i6))) {
                            return false;
                        }
                    } else if (l != 49) {
                        if (l == 50 && !((zzaee) C4916y3.m13555k(obj2, (long) (m & 1048575))).isEmpty()) {
                            C4410f2 f2Var = (C4410f2) mo26430r(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C4916y3.m13555k(obj2, (long) (m & 1048575));
                if (!list.isEmpty()) {
                    C4889x2 p = mo26428p(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!p.mo26415c(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (mo26401G(obj, i6, i2, i, i10) && !m12618H(obj2, m, mo26428p(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f9501f) {
            return true;
        }
        this.f9509n.mo25757a(obj2);
        throw null;
    }

    /* renamed from: c0 */
    public final int mo26416c0(int i, int i2) {
        if (i < this.f9498c || i > this.f9499d) {
            return -1;
        }
        return mo26425k(i, i2);
    }

    /* renamed from: d */
    public final Object mo26417d() {
        return ((C4544k1) this.f9500e).mo26148A();
    }

    /* renamed from: d0 */
    public final int mo26418d0(int i) {
        return this.f9496a[i + 2];
    }

    /* renamed from: e */
    public final int mo26419e(Object obj) {
        return this.f9503h ? mo26407V(obj) : mo26406U(obj);
    }

    /* renamed from: f */
    public final void mo26420f(Object obj, Object obj2) {
        m12631v(obj);
        if (obj2 != null) {
            for (int i = 0; i < this.f9496a.length; i += 3) {
                int m = mo26426m(i);
                long j = (long) (1048575 & m);
                int i2 = this.f9496a[i];
                switch (m12628l(m)) {
                    case 0:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13564t(obj, j, C4916y3.m13550f(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 1:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13565u(obj, j, C4916y3.m13551g(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 2:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13567w(obj, j, C4916y3.m13553i(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 3:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13567w(obj, j, C4916y3.m13553i(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 4:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13566v(obj, j, C4916y3.m13552h(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 5:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13567w(obj, j, C4916y3.m13553i(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 6:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13566v(obj, j, C4916y3.m13552h(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 7:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13562r(obj, j, C4916y3.m13541B(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 8:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13568x(obj, j, C4916y3.m13555k(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 9:
                        mo26433w(obj, obj2, i);
                        break;
                    case 10:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13568x(obj, j, C4916y3.m13555k(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 11:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13566v(obj, j, C4916y3.m13552h(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 12:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13566v(obj, j, C4916y3.m13552h(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 13:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13566v(obj, j, C4916y3.m13552h(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 14:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13567w(obj, j, C4916y3.m13553i(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 15:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13566v(obj, j, C4916y3.m13552h(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 16:
                        if (!mo26400F(obj2, i)) {
                            break;
                        } else {
                            C4916y3.m13567w(obj, j, C4916y3.m13553i(obj2, j));
                            mo26436z(obj, i);
                            break;
                        }
                    case 17:
                        mo26433w(obj, obj2, i);
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
                        this.f9507l.mo26763c(obj, obj2, j);
                        break;
                    case 50:
                        C4941z2.m13667i(this.f9510o, obj, obj2, j);
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
                        if (!mo26402J(obj2, i2, i)) {
                            break;
                        } else {
                            C4916y3.m13568x(obj, j, C4916y3.m13555k(obj2, j));
                            mo26396A(obj, i2, i);
                            break;
                        }
                    case 60:
                        mo26434x(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!mo26402J(obj2, i2, i)) {
                            break;
                        } else {
                            C4916y3.m13568x(obj, j, C4916y3.m13555k(obj2, j));
                            mo26396A(obj, i2, i);
                            break;
                        }
                    case 68:
                        mo26434x(obj, obj2, i);
                        break;
                }
            }
            C4941z2.m13664f(this.f9508m, obj, obj2);
            if (this.f9501f) {
                C4941z2.m13663e(this.f9509n, obj, obj2);
                throw null;
            }
            return;
        }
        throw null;
    }

    /* renamed from: g */
    public final boolean mo26421g(Object obj, Object obj2) {
        boolean z;
        int length = this.f9496a.length;
        for (int i = 0; i < length; i += 3) {
            int m = mo26426m(i);
            long j = (long) (m & 1048575);
            switch (m12628l(m)) {
                case 0:
                    if (mo26399D(obj, obj2, i) && Double.doubleToLongBits(C4916y3.m13550f(obj, j)) == Double.doubleToLongBits(C4916y3.m13550f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (mo26399D(obj, obj2, i) && Float.floatToIntBits(C4916y3.m13551g(obj, j)) == Float.floatToIntBits(C4916y3.m13551g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13553i(obj, j) == C4916y3.m13553i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13553i(obj, j) == C4916y3.m13553i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13552h(obj, j) == C4916y3.m13552h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13553i(obj, j) == C4916y3.m13553i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13552h(obj, j) == C4916y3.m13552h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13541B(obj, j) == C4916y3.m13541B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (mo26399D(obj, obj2, i) && C4941z2.m13666h(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (mo26399D(obj, obj2, i) && C4941z2.m13666h(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (mo26399D(obj, obj2, i) && C4941z2.m13666h(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13552h(obj, j) == C4916y3.m13552h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13552h(obj, j) == C4916y3.m13552h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13552h(obj, j) == C4916y3.m13552h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13553i(obj, j) == C4916y3.m13553i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13552h(obj, j) == C4916y3.m13552h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (mo26399D(obj, obj2, i) && C4916y3.m13553i(obj, j) == C4916y3.m13553i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (mo26399D(obj, obj2, i) && C4941z2.m13666h(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j))) {
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
                    z = C4941z2.m13666h(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j));
                    break;
                case 50:
                    z = C4941z2.m13666h(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j));
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
                    long d0 = (long) (mo26418d0(i) & 1048575);
                    if (C4916y3.m13552h(obj, d0) == C4916y3.m13552h(obj2, d0) && C4941z2.m13666h(C4916y3.m13555k(obj, j), C4916y3.m13555k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f9508m.mo26440d(obj).equals(this.f9508m.mo26440d(obj2))) {
            return false;
        }
        if (!this.f9501f) {
            return true;
        }
        this.f9509n.mo25757a(obj);
        throw null;
    }

    /* renamed from: h */
    public final void mo26422h(Object obj, byte[] bArr, int i, int i2, C4860w wVar) {
        if (this.f9503h) {
            mo26410Z(obj, bArr, i, i2, wVar);
        } else {
            mo26405O(obj, bArr, i, i2, 0, wVar);
        }
    }

    /* renamed from: i */
    public final void mo26423i(Object obj, C4809u0 u0Var) {
        if (!this.f9503h) {
            mo26403L(obj, u0Var);
        } else if (!this.f9501f) {
            int length = this.f9496a.length;
            for (int i = 0; i < length; i += 3) {
                int m = mo26426m(i);
                int i2 = this.f9496a[i];
                switch (m12628l(m)) {
                    case 0:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26711q(i2, C4916y3.m13550f(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 1:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26720z(i2, C4916y3.m13551g(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 2:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26689E(i2, C4916y3.m13553i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 3:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26705j(i2, C4916y3.m13553i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 4:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26687C(i2, C4916y3.m13552h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 5:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26718x(i2, C4916y3.m13553i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 6:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26716v(i2, C4916y3.m13552h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 7:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26707m(i2, C4916y3.m13541B(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 8:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            m12621N(i2, C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var);
                            break;
                        }
                    case 9:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26691G(i2, C4916y3.m13555k(obj, (long) (m & 1048575)), mo26428p(i));
                            break;
                        }
                    case 10:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26709o(i2, (zzacc) C4916y3.m13555k(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 11:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26703h(i2, C4916y3.m13552h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 12:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26714t(i2, C4916y3.m13552h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 13:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26692H(i2, C4916y3.m13552h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 14:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26694J(i2, C4916y3.m13553i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 15:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26696a(i2, C4916y3.m13552h(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 16:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26698c(i2, C4916y3.m13553i(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 17:
                        if (!mo26400F(obj, i)) {
                            break;
                        } else {
                            u0Var.mo26686B(i2, C4916y3.m13555k(obj, (long) (m & 1048575)), mo26428p(i));
                            break;
                        }
                    case 18:
                        C4941z2.m13670l(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 19:
                        C4941z2.m13674p(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 20:
                        C4941z2.m13677s(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 21:
                        C4941z2.m13632B(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 22:
                        C4941z2.m13676r(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 23:
                        C4941z2.m13673o(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 24:
                        C4941z2.m13672n(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 25:
                        C4941z2.m13668j(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 26:
                        C4941z2.m13683y(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var);
                        break;
                    case 27:
                        C4941z2.m13678t(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, mo26428p(i));
                        break;
                    case 28:
                        C4941z2.m13669k(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var);
                        break;
                    case 29:
                        C4941z2.m13684z(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 30:
                        C4941z2.m13671m(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 31:
                        C4941z2.m13679u(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 32:
                        C4941z2.m13680v(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 33:
                        C4941z2.m13681w(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 34:
                        C4941z2.m13682x(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, false);
                        break;
                    case 35:
                        C4941z2.m13670l(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 36:
                        C4941z2.m13674p(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 37:
                        C4941z2.m13677s(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 38:
                        C4941z2.m13632B(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 39:
                        C4941z2.m13676r(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 40:
                        C4941z2.m13673o(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 41:
                        C4941z2.m13672n(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 42:
                        C4941z2.m13668j(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 43:
                        C4941z2.m13684z(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 44:
                        C4941z2.m13671m(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 45:
                        C4941z2.m13679u(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 46:
                        C4941z2.m13680v(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 47:
                        C4941z2.m13681w(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 48:
                        C4941z2.m13682x(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, true);
                        break;
                    case 49:
                        C4941z2.m13675q(i2, (List) C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var, mo26428p(i));
                        break;
                    case 50:
                        mo26404M(u0Var, i2, C4916y3.m13555k(obj, (long) (m & 1048575)), i);
                        break;
                    case 51:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26711q(i2, m12625S(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 52:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26720z(i2, m12626T(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 53:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26689E(i2, m12629n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 54:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26705j(i2, m12629n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 55:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26687C(i2, m12627W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 56:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26718x(i2, m12629n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 57:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26716v(i2, m12627W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 58:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26707m(i2, m12620K(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 59:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            m12621N(i2, C4916y3.m13555k(obj, (long) (m & 1048575)), u0Var);
                            break;
                        }
                    case 60:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26691G(i2, C4916y3.m13555k(obj, (long) (m & 1048575)), mo26428p(i));
                            break;
                        }
                    case 61:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26709o(i2, (zzacc) C4916y3.m13555k(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 62:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26703h(i2, m12627W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 63:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26714t(i2, m12627W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 64:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26692H(i2, m12627W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 65:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26694J(i2, m12629n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 66:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26696a(i2, m12627W(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 67:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26698c(i2, m12629n(obj, (long) (m & 1048575)));
                            break;
                        }
                    case 68:
                        if (!mo26402J(obj, i2, i)) {
                            break;
                        } else {
                            u0Var.mo26686B(i2, C4916y3.m13555k(obj, (long) (m & 1048575)), mo26428p(i));
                            break;
                        }
                }
            }
            C4654o3 o3Var = this.f9508m;
            o3Var.mo26454r(o3Var.mo26440d(obj), u0Var);
        } else {
            this.f9509n.mo25757a(obj);
            throw null;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: j */
    public final void mo26424j(java.lang.Object r11, p040c.p200q.p201a.p264c.p294g.p333g.C4863w2 r12, p040c.p200q.p201a.p264c.p294g.p333g.C4913y0 r13) {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0586
            m12631v(r11)
            c.q.a.c.g.g.o3 r7 = r10.f9508m
            c.q.a.c.g.g.z0 r8 = r10.f9509n
            r9 = r0
        L_0x000b:
            int r2 = r12.mo26369b()     // Catch:{ all -> 0x056a }
            int r1 = r10.mo26414b0(r2)     // Catch:{ all -> 0x056a }
            if (r1 >= 0) goto L_0x0071
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0035
            int r12 = r10.f9505j
        L_0x001c:
            int r13 = r10.f9506k
            if (r12 >= r13) goto L_0x002f
            int[] r13 = r10.f9504i
            r3 = r13[r12]
            r1 = r10
            r2 = r11
            r4 = r9
            r5 = r7
            r6 = r11
            r1.mo26429q(r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x001c
        L_0x002f:
            if (r9 == 0) goto L_0x0569
            r7.mo26450n(r11, r9)
            return
        L_0x0035:
            boolean r1 = r10.f9501f     // Catch:{ all -> 0x056a }
            if (r1 != 0) goto L_0x003b
            r1 = r0
            goto L_0x0041
        L_0x003b:
            c.q.a.c.g.g.l2 r1 = r10.f9500e     // Catch:{ all -> 0x056a }
            java.lang.Object r1 = r8.mo25759c(r13, r1, r2)     // Catch:{ all -> 0x056a }
        L_0x0041:
            if (r1 != 0) goto L_0x006d
            r7.mo26453q(r12)     // Catch:{ all -> 0x056a }
            if (r9 != 0) goto L_0x004c
            java.lang.Object r9 = r7.mo26439c(r11)     // Catch:{ all -> 0x056a }
        L_0x004c:
            boolean r1 = r7.mo26452p(r9, r12)     // Catch:{ all -> 0x056a }
            if (r1 != 0) goto L_0x000b
            int r12 = r10.f9505j
        L_0x0054:
            int r13 = r10.f9506k
            if (r12 >= r13) goto L_0x0067
            int[] r13 = r10.f9504i
            r3 = r13[r12]
            r1 = r10
            r2 = r11
            r4 = r9
            r5 = r7
            r6 = r11
            r1.mo26429q(r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x0054
        L_0x0067:
            if (r9 == 0) goto L_0x0569
            r7.mo26450n(r11, r9)
            return
        L_0x006d:
            r8.mo25758b(r11)     // Catch:{ all -> 0x056a }
            throw r0
        L_0x0071:
            int r3 = r10.mo26426m(r1)     // Catch:{ all -> 0x056a }
            int r4 = m12628l(r3)     // Catch:{ zzadm -> 0x053f }
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x050f;
                case 1: goto L_0x0500;
                case 2: goto L_0x04f1;
                case 3: goto L_0x04e2;
                case 4: goto L_0x04d3;
                case 5: goto L_0x04c4;
                case 6: goto L_0x04b5;
                case 7: goto L_0x04a6;
                case 8: goto L_0x049e;
                case 9: goto L_0x048c;
                case 10: goto L_0x047d;
                case 11: goto L_0x046e;
                case 12: goto L_0x044c;
                case 13: goto L_0x043d;
                case 14: goto L_0x042e;
                case 15: goto L_0x041f;
                case 16: goto L_0x0410;
                case 17: goto L_0x03fe;
                case 18: goto L_0x03f0;
                case 19: goto L_0x03e2;
                case 20: goto L_0x03d4;
                case 21: goto L_0x03c6;
                case 22: goto L_0x03b8;
                case 23: goto L_0x03aa;
                case 24: goto L_0x039c;
                case 25: goto L_0x038e;
                case 26: goto L_0x0364;
                case 27: goto L_0x0352;
                case 28: goto L_0x0344;
                case 29: goto L_0x0336;
                case 30: goto L_0x031e;
                case 31: goto L_0x0310;
                case 32: goto L_0x0302;
                case 33: goto L_0x02f4;
                case 34: goto L_0x02e6;
                case 35: goto L_0x02d8;
                case 36: goto L_0x02ca;
                case 37: goto L_0x02bc;
                case 38: goto L_0x02ae;
                case 39: goto L_0x02a0;
                case 40: goto L_0x0292;
                case 41: goto L_0x0284;
                case 42: goto L_0x0276;
                case 43: goto L_0x0268;
                case 44: goto L_0x0250;
                case 45: goto L_0x0242;
                case 46: goto L_0x0234;
                case 47: goto L_0x0226;
                case 48: goto L_0x0218;
                case 49: goto L_0x0206;
                case 50: goto L_0x01d0;
                case 51: goto L_0x01be;
                case 52: goto L_0x01ac;
                case 53: goto L_0x019a;
                case 54: goto L_0x0188;
                case 55: goto L_0x0176;
                case 56: goto L_0x0164;
                case 57: goto L_0x0152;
                case 58: goto L_0x0140;
                case 59: goto L_0x0138;
                case 60: goto L_0x0126;
                case 61: goto L_0x0118;
                case 62: goto L_0x0106;
                case 63: goto L_0x00e1;
                case 64: goto L_0x00cf;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00ab;
                case 67: goto L_0x0099;
                case 68: goto L_0x0087;
                default: goto L_0x007f;
            }     // Catch:{ zzadm -> 0x053f }
        L_0x007f:
            if (r9 != 0) goto L_0x051e
            java.lang.Object r9 = r7.mo26439c(r11)     // Catch:{ zzadm -> 0x053f }
            goto L_0x051e
        L_0x0087:
            java.lang.Object r3 = r10.mo26432t(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.l2 r3 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r3     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.x2 r4 = r10.mo26428p(r1)     // Catch:{ zzadm -> 0x053f }
            r12.mo26358G(r3, r4, r13)     // Catch:{ zzadm -> 0x053f }
            r10.mo26398C(r11, r2, r1, r3)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0099:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            long r5 = r12.mo26383p()     // Catch:{ zzadm -> 0x053f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x00ab:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            int r5 = r12.mo26373f()     // Catch:{ zzadm -> 0x053f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x00bd:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            long r5 = r12.mo26386s()     // Catch:{ zzadm -> 0x053f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x00cf:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            int r5 = r12.mo26372e()     // Catch:{ zzadm -> 0x053f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x00e1:
            int r4 = r12.mo26371d()     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.o1 r6 = r10.mo26427o(r1)     // Catch:{ zzadm -> 0x053f }
            if (r6 == 0) goto L_0x00f8
            boolean r6 = r6.zza()     // Catch:{ zzadm -> 0x053f }
            if (r6 == 0) goto L_0x00f2
            goto L_0x00f8
        L_0x00f2:
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13662d(r11, r2, r4, r9, r7)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x00f8:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzadm -> 0x053f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r5, r3)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0106:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            int r5 = r12.mo26380m()     // Catch:{ zzadm -> 0x053f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0118:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            com.google.android.gms.internal.firebase-auth-api.zzacc r5 = r12.mo26375h()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0126:
            java.lang.Object r3 = r10.mo26432t(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.l2 r3 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r3     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.x2 r4 = r10.mo26428p(r1)     // Catch:{ zzadm -> 0x053f }
            r12.mo26356E(r3, r4, r13)     // Catch:{ zzadm -> 0x053f }
            r10.mo26398C(r11, r2, r1, r3)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0138:
            r10.mo26435y(r11, r3, r12)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0140:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            boolean r5 = r12.mo26387t()     // Catch:{ zzadm -> 0x053f }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0152:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            int r5 = r12.mo26384q()     // Catch:{ zzadm -> 0x053f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0164:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            long r5 = r12.mo26374g()     // Catch:{ zzadm -> 0x053f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0176:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            int r5 = r12.mo26378k()     // Catch:{ zzadm -> 0x053f }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0188:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            long r5 = r12.mo26377j()     // Catch:{ zzadm -> 0x053f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x019a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            long r5 = r12.mo26379l()     // Catch:{ zzadm -> 0x053f }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x01ac:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            float r5 = r12.mo26368a()     // Catch:{ zzadm -> 0x053f }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x01be:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ zzadm -> 0x053f }
            double r5 = r12.zza()     // Catch:{ zzadm -> 0x053f }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r10.mo26396A(r11, r2, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x01d0:
            java.lang.Object r2 = r10.mo26430r(r1)     // Catch:{ zzadm -> 0x053f }
            int r1 = r10.mo26426m(r1)     // Catch:{ zzadm -> 0x053f }
            r1 = r1 & r5
            long r3 = (long) r1     // Catch:{ zzadm -> 0x053f }
            java.lang.Object r1 = p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13555k(r11, r3)     // Catch:{ zzadm -> 0x053f }
            if (r1 == 0) goto L_0x01f6
            boolean r5 = p040c.p200q.p201a.p264c.p294g.p333g.C4437g2.m12017b(r1)     // Catch:{ zzadm -> 0x053f }
            if (r5 == 0) goto L_0x0201
            com.google.android.gms.internal.firebase-auth-api.zzaee r5 = com.google.android.gms.internal.p527firebaseauthapi.zzaee.zza()     // Catch:{ zzadm -> 0x053f }
            com.google.android.gms.internal.firebase-auth-api.zzaee r5 = r5.zzb()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4437g2.m12018c(r5, r1)     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r5)     // Catch:{ zzadm -> 0x053f }
            r1 = r5
            goto L_0x0201
        L_0x01f6:
            com.google.android.gms.internal.firebase-auth-api.zzaee r1 = com.google.android.gms.internal.p527firebaseauthapi.zzaee.zza()     // Catch:{ zzadm -> 0x053f }
            com.google.android.gms.internal.firebase-auth-api.zzaee r1 = r1.zzb()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r3, r1)     // Catch:{ zzadm -> 0x053f }
        L_0x0201:
            com.google.android.gms.internal.firebase-auth-api.zzaee r1 = (com.google.android.gms.internal.p527firebaseauthapi.zzaee) r1     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.f2 r2 = (p040c.p200q.p201a.p264c.p294g.p333g.C4410f2) r2     // Catch:{ zzadm -> 0x053f }
            throw r0     // Catch:{ zzadm -> 0x053f }
        L_0x0206:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.x2 r1 = r10.mo26428p(r1)     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.z1 r4 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            java.util.List r2 = r4.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26353B(r2, r1, r13)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0218:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26357F(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0226:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26360I(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0234:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26352A(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0242:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26354C(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0250:
            c.q.a.c.g.g.z1 r4 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzadm -> 0x053f }
            java.util.List r3 = r4.mo26761a(r11, r5)     // Catch:{ zzadm -> 0x053f }
            r12.mo26388u(r3)     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.o1 r4 = r10.mo26427o(r1)     // Catch:{ zzadm -> 0x053f }
            r1 = r11
            r5 = r9
            r6 = r7
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13661c(r1, r2, r3, r4, r5, r6)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0268:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26362K(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0276:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26363L(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0284:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26355D(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0292:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26359H(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x02a0:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26393z(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x02ae:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26390w(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x02bc:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26389v(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x02ca:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26364M(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x02d8:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26391x(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x02e6:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26357F(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x02f4:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26360I(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0302:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26352A(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0310:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26354C(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x031e:
            c.q.a.c.g.g.z1 r4 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ zzadm -> 0x053f }
            java.util.List r3 = r4.mo26761a(r11, r5)     // Catch:{ zzadm -> 0x053f }
            r12.mo26388u(r3)     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.o1 r4 = r10.mo26427o(r1)     // Catch:{ zzadm -> 0x053f }
            r1 = r11
            r5 = r9
            r6 = r7
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13661c(r1, r2, r3, r4, r5, r6)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0336:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26362K(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0344:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26392y(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0352:
            c.q.a.c.g.g.x2 r1 = r10.mo26428p(r1)     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.z1 r4 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            java.util.List r2 = r4.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26361J(r2, r1, r13)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0364:
            boolean r1 = m12617E(r3)     // Catch:{ zzadm -> 0x053f }
            if (r1 == 0) goto L_0x037c
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r2 = r12
            c.q.a.c.g.g.o0 r2 = (p040c.p200q.p201a.p264c.p294g.p333g.C4651o0) r2     // Catch:{ zzadm -> 0x053f }
            r3 = 1
            r2.mo26376i(r1, r3)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x037c:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r2 = r12
            c.q.a.c.g.g.o0 r2 = (p040c.p200q.p201a.p264c.p294g.p333g.C4651o0) r2     // Catch:{ zzadm -> 0x053f }
            r3 = 0
            r2.mo26376i(r1, r3)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x038e:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26363L(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x039c:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26355D(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x03aa:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26359H(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x03b8:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26393z(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x03c6:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26390w(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x03d4:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26389v(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x03e2:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26364M(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x03f0:
            c.q.a.c.g.g.z1 r1 = r10.f9507l     // Catch:{ zzadm -> 0x053f }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            java.util.List r1 = r1.mo26761a(r11, r2)     // Catch:{ zzadm -> 0x053f }
            r12.mo26391x(r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x03fe:
            java.lang.Object r2 = r10.mo26431s(r11, r1)     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.l2 r2 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r2     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.x2 r3 = r10.mo26428p(r1)     // Catch:{ zzadm -> 0x053f }
            r12.mo26358G(r2, r3, r13)     // Catch:{ zzadm -> 0x053f }
            r10.mo26397B(r11, r1, r2)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0410:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            long r4 = r12.mo26383p()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13567w(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x041f:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            int r4 = r12.mo26373f()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13566v(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x042e:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            long r4 = r12.mo26386s()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13567w(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x043d:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            int r4 = r12.mo26372e()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13566v(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x044c:
            int r4 = r12.mo26371d()     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.o1 r6 = r10.mo26427o(r1)     // Catch:{ zzadm -> 0x053f }
            if (r6 == 0) goto L_0x0463
            boolean r6 = r6.zza()     // Catch:{ zzadm -> 0x053f }
            if (r6 == 0) goto L_0x045d
            goto L_0x0463
        L_0x045d:
            java.lang.Object r9 = p040c.p200q.p201a.p264c.p294g.p333g.C4941z2.m13662d(r11, r2, r4, r9, r7)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0463:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13566v(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x046e:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            int r4 = r12.mo26380m()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13566v(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x047d:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            com.google.android.gms.internal.firebase-auth-api.zzacc r4 = r12.mo26375h()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13568x(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x048c:
            java.lang.Object r2 = r10.mo26431s(r11, r1)     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.l2 r2 = (p040c.p200q.p201a.p264c.p294g.p333g.C4572l2) r2     // Catch:{ zzadm -> 0x053f }
            c.q.a.c.g.g.x2 r3 = r10.mo26428p(r1)     // Catch:{ zzadm -> 0x053f }
            r12.mo26356E(r2, r3, r13)     // Catch:{ zzadm -> 0x053f }
            r10.mo26397B(r11, r1, r2)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x049e:
            r10.mo26435y(r11, r3, r12)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x04a6:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            boolean r4 = r12.mo26387t()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13562r(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x04b5:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            int r4 = r12.mo26384q()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13566v(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x04c4:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            long r4 = r12.mo26374g()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13567w(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x04d3:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            int r4 = r12.mo26378k()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13566v(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x04e2:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            long r4 = r12.mo26377j()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13567w(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x04f1:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            long r4 = r12.mo26379l()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13567w(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x0500:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            float r4 = r12.mo26368a()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13565u(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x050f:
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ zzadm -> 0x053f }
            double r4 = r12.zza()     // Catch:{ zzadm -> 0x053f }
            p040c.p200q.p201a.p264c.p294g.p333g.C4916y3.m13564t(r11, r2, r4)     // Catch:{ zzadm -> 0x053f }
            r10.mo26436z(r11, r1)     // Catch:{ zzadm -> 0x053f }
            goto L_0x000b
        L_0x051e:
            boolean r1 = r7.mo26452p(r9, r12)     // Catch:{ zzadm -> 0x053f }
            if (r1 != 0) goto L_0x000b
            int r12 = r10.f9505j
        L_0x0526:
            int r13 = r10.f9506k
            if (r12 >= r13) goto L_0x0539
            int[] r13 = r10.f9504i
            r3 = r13[r12]
            r1 = r10
            r2 = r11
            r4 = r9
            r5 = r7
            r6 = r11
            r1.mo26429q(r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x0526
        L_0x0539:
            if (r9 == 0) goto L_0x0569
            r7.mo26450n(r11, r9)
            return
        L_0x053f:
            r7.mo26453q(r12)     // Catch:{ all -> 0x056a }
            if (r9 != 0) goto L_0x0549
            java.lang.Object r1 = r7.mo26439c(r11)     // Catch:{ all -> 0x056a }
            r9 = r1
        L_0x0549:
            boolean r1 = r7.mo26452p(r9, r12)     // Catch:{ all -> 0x056a }
            if (r1 != 0) goto L_0x000b
            int r12 = r10.f9505j
        L_0x0551:
            int r13 = r10.f9506k
            if (r12 >= r13) goto L_0x0564
            int[] r13 = r10.f9504i
            r3 = r13[r12]
            r1 = r10
            r2 = r11
            r4 = r9
            r5 = r7
            r6 = r11
            r1.mo26429q(r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L_0x0551
        L_0x0564:
            if (r9 == 0) goto L_0x0569
            r7.mo26450n(r11, r9)
        L_0x0569:
            return
        L_0x056a:
            r12 = move-exception
            int r13 = r10.f9505j
        L_0x056d:
            int r0 = r10.f9506k
            if (r13 >= r0) goto L_0x0580
            int[] r0 = r10.f9504i
            r3 = r0[r13]
            r1 = r10
            r2 = r11
            r4 = r9
            r5 = r7
            r6 = r11
            r1.mo26429q(r2, r3, r4, r5, r6)
            int r13 = r13 + 1
            goto L_0x056d
        L_0x0580:
            if (r9 == 0) goto L_0x0585
            r7.mo26450n(r11, r9)
        L_0x0585:
            throw r12
        L_0x0586:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p294g.p333g.C4653o2.mo26424j(java.lang.Object, c.q.a.c.g.g.w2, c.q.a.c.g.g.y0):void");
    }

    /* renamed from: k */
    public final int mo26425k(int i, int i2) {
        int length = (this.f9496a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f9496a[i4];
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

    /* renamed from: m */
    public final int mo26426m(int i) {
        return this.f9496a[i + 1];
    }

    /* renamed from: o */
    public final C4652o1 mo26427o(int i) {
        int i2 = i / 3;
        return (C4652o1) this.f9497b[i2 + i2 + 1];
    }

    /* renamed from: p */
    public final C4889x2 mo26428p(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C4889x2 x2Var = (C4889x2) this.f9497b[i3];
        if (x2Var != null) {
            return x2Var;
        }
        C4889x2 b = C4785t2.m13132a().mo26659b((Class) this.f9497b[i3 + 1]);
        this.f9497b[i3] = b;
        return b;
    }

    /* renamed from: q */
    public final Object mo26429q(Object obj, int i, Object obj2, C4654o3 o3Var, Object obj3) {
        int i2 = this.f9496a[i];
        Object k = C4916y3.m13555k(obj, (long) (mo26426m(i) & 1048575));
        if (k == null || mo26427o(i) == null) {
            return obj2;
        }
        zzaee zzaee = (zzaee) k;
        C4410f2 f2Var = (C4410f2) mo26430r(i);
        throw null;
    }

    /* renamed from: r */
    public final Object mo26430r(int i) {
        int i2 = i / 3;
        return this.f9497b[i2 + i2];
    }

    /* renamed from: s */
    public final Object mo26431s(Object obj, int i) {
        C4889x2 p = mo26428p(i);
        long m = (long) (mo26426m(i) & 1048575);
        if (!mo26400F(obj, i)) {
            return p.mo26417d();
        }
        Object object = f9495q.getObject(obj, m);
        if (m12619I(object)) {
            return object;
        }
        Object d = p.mo26417d();
        if (object != null) {
            p.mo26420f(d, object);
        }
        return d;
    }

    /* renamed from: t */
    public final Object mo26432t(Object obj, int i, int i2) {
        C4889x2 p = mo26428p(i2);
        if (!mo26402J(obj, i, i2)) {
            return p.mo26417d();
        }
        Object object = f9495q.getObject(obj, (long) (mo26426m(i2) & 1048575));
        if (m12619I(object)) {
            return object;
        }
        Object d = p.mo26417d();
        if (object != null) {
            p.mo26420f(d, object);
        }
        return d;
    }

    /* renamed from: w */
    public final void mo26433w(Object obj, Object obj2, int i) {
        if (mo26400F(obj2, i)) {
            long m = (long) (mo26426m(i) & 1048575);
            Object object = f9495q.getObject(obj2, m);
            if (object != null) {
                C4889x2 p = mo26428p(i);
                if (!mo26400F(obj, i)) {
                    if (!m12619I(object)) {
                        f9495q.putObject(obj, m, object);
                    } else {
                        Object d = p.mo26417d();
                        p.mo26420f(d, object);
                        f9495q.putObject(obj, m, d);
                    }
                    mo26436z(obj, i);
                    return;
                }
                Object object2 = f9495q.getObject(obj, m);
                if (!m12619I(object2)) {
                    Object d2 = p.mo26417d();
                    p.mo26420f(d2, object2);
                    f9495q.putObject(obj, m, d2);
                    object2 = d2;
                }
                p.mo26420f(object2, object);
                return;
            }
            int i2 = this.f9496a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: x */
    public final void mo26434x(Object obj, Object obj2, int i) {
        int i2 = this.f9496a[i];
        if (mo26402J(obj2, i2, i)) {
            long m = (long) (mo26426m(i) & 1048575);
            Object object = f9495q.getObject(obj2, m);
            if (object != null) {
                C4889x2 p = mo26428p(i);
                if (!mo26402J(obj, i2, i)) {
                    if (!m12619I(object)) {
                        f9495q.putObject(obj, m, object);
                    } else {
                        Object d = p.mo26417d();
                        p.mo26420f(d, object);
                        f9495q.putObject(obj, m, d);
                    }
                    mo26396A(obj, i2, i);
                    return;
                }
                Object object2 = f9495q.getObject(obj, m);
                if (!m12619I(object2)) {
                    Object d2 = p.mo26417d();
                    p.mo26420f(d2, object2);
                    f9495q.putObject(obj, m, d2);
                    object2 = d2;
                }
                p.mo26420f(object2, object);
                return;
            }
            int i3 = this.f9496a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: y */
    public final void mo26435y(Object obj, int i, C4863w2 w2Var) {
        if (m12617E(i)) {
            C4916y3.m13568x(obj, (long) (i & 1048575), w2Var.mo26381n());
        } else if (this.f9502g) {
            C4916y3.m13568x(obj, (long) (i & 1048575), w2Var.mo26382o());
        } else {
            C4916y3.m13568x(obj, (long) (i & 1048575), w2Var.mo26375h());
        }
    }

    /* renamed from: z */
    public final void mo26436z(Object obj, int i) {
        int d0 = mo26418d0(i);
        long j = (long) (1048575 & d0);
        if (j != 1048575) {
            C4916y3.m13566v(obj, j, (1 << (d0 >>> 20)) | C4916y3.m13552h(obj, j));
        }
    }
}
