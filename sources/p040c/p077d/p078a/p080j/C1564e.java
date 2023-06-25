package p040c.p077d.p078a.p080j;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import p040c.p077d.p078a.p080j.C1559a;

/* renamed from: c.d.a.j.e */
/* compiled from: StandardGifDecoder */
public class C1564e implements C1559a {

    /* renamed from: u */
    public static final String f893u = "e";
    @ColorInt

    /* renamed from: a */
    public int[] f894a;
    @ColorInt

    /* renamed from: b */
    public final int[] f895b;

    /* renamed from: c */
    public final C1559a.C1560a f896c;

    /* renamed from: d */
    public ByteBuffer f897d;

    /* renamed from: e */
    public byte[] f898e;

    /* renamed from: f */
    public short[] f899f;

    /* renamed from: g */
    public byte[] f900g;

    /* renamed from: h */
    public byte[] f901h;

    /* renamed from: i */
    public byte[] f902i;
    @ColorInt

    /* renamed from: j */
    public int[] f903j;

    /* renamed from: k */
    public int f904k;

    /* renamed from: l */
    public C1562c f905l;

    /* renamed from: m */
    public Bitmap f906m;

    /* renamed from: n */
    public boolean f907n;

    /* renamed from: o */
    public int f908o;

    /* renamed from: p */
    public int f909p;

    /* renamed from: q */
    public int f910q;

    /* renamed from: r */
    public int f911r;
    @Nullable

    /* renamed from: s */
    public Boolean f912s;
    @NonNull

    /* renamed from: t */
    public Bitmap.Config f913t;

    public C1564e(@NonNull C1559a.C1560a aVar, C1562c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo15603q(cVar, byteBuffer, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        return null;
     */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Bitmap mo15557a() {
        /*
            r7 = this;
            monitor-enter(r7)
            c.d.a.j.c r0 = r7.f905l     // Catch:{ all -> 0x00d0 }
            int r0 = r0.f878c     // Catch:{ all -> 0x00d0 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r7.f904k     // Catch:{ all -> 0x00d0 }
            if (r0 >= 0) goto L_0x0035
        L_0x000d:
            java.lang.String r0 = f893u     // Catch:{ all -> 0x00d0 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r0.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = "Unable to decode frame, frameCount="
            r0.append(r3)     // Catch:{ all -> 0x00d0 }
            c.d.a.j.c r3 = r7.f905l     // Catch:{ all -> 0x00d0 }
            int r3 = r3.f878c     // Catch:{ all -> 0x00d0 }
            r0.append(r3)     // Catch:{ all -> 0x00d0 }
            java.lang.String r3 = ", framePointer="
            r0.append(r3)     // Catch:{ all -> 0x00d0 }
            int r3 = r7.f904k     // Catch:{ all -> 0x00d0 }
            r0.append(r3)     // Catch:{ all -> 0x00d0 }
            r0.toString()     // Catch:{ all -> 0x00d0 }
        L_0x0033:
            r7.f908o = r2     // Catch:{ all -> 0x00d0 }
        L_0x0035:
            int r0 = r7.f908o     // Catch:{ all -> 0x00d0 }
            r3 = 0
            if (r0 == r2) goto L_0x00b4
            int r0 = r7.f908o     // Catch:{ all -> 0x00d0 }
            r4 = 2
            if (r0 != r4) goto L_0x0041
            goto L_0x00b4
        L_0x0041:
            r0 = 0
            r7.f908o = r0     // Catch:{ all -> 0x00d0 }
            byte[] r4 = r7.f898e     // Catch:{ all -> 0x00d0 }
            if (r4 != 0) goto L_0x0052
            c.d.a.j.a$a r4 = r7.f896c     // Catch:{ all -> 0x00d0 }
            r5 = 255(0xff, float:3.57E-43)
            byte[] r4 = r4.mo15571e(r5)     // Catch:{ all -> 0x00d0 }
            r7.f898e = r4     // Catch:{ all -> 0x00d0 }
        L_0x0052:
            c.d.a.j.c r4 = r7.f905l     // Catch:{ all -> 0x00d0 }
            java.util.List<c.d.a.j.b> r4 = r4.f880e     // Catch:{ all -> 0x00d0 }
            int r5 = r7.f904k     // Catch:{ all -> 0x00d0 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x00d0 }
            c.d.a.j.b r4 = (p040c.p077d.p078a.p080j.C1561b) r4     // Catch:{ all -> 0x00d0 }
            int r5 = r7.f904k     // Catch:{ all -> 0x00d0 }
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x006e
            c.d.a.j.c r6 = r7.f905l     // Catch:{ all -> 0x00d0 }
            java.util.List<c.d.a.j.b> r6 = r6.f880e     // Catch:{ all -> 0x00d0 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x00d0 }
            c.d.a.j.b r5 = (p040c.p077d.p078a.p080j.C1561b) r5     // Catch:{ all -> 0x00d0 }
            goto L_0x006f
        L_0x006e:
            r5 = r3
        L_0x006f:
            int[] r6 = r4.f875k     // Catch:{ all -> 0x00d0 }
            if (r6 == 0) goto L_0x0076
            int[] r6 = r4.f875k     // Catch:{ all -> 0x00d0 }
            goto L_0x007a
        L_0x0076:
            c.d.a.j.c r6 = r7.f905l     // Catch:{ all -> 0x00d0 }
            int[] r6 = r6.f876a     // Catch:{ all -> 0x00d0 }
        L_0x007a:
            r7.f894a = r6     // Catch:{ all -> 0x00d0 }
            if (r6 != 0) goto L_0x009c
            java.lang.String r0 = f893u     // Catch:{ all -> 0x00d0 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x0098
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r0.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "No valid color table found for frame #"
            r0.append(r1)     // Catch:{ all -> 0x00d0 }
            int r1 = r7.f904k     // Catch:{ all -> 0x00d0 }
            r0.append(r1)     // Catch:{ all -> 0x00d0 }
            r0.toString()     // Catch:{ all -> 0x00d0 }
        L_0x0098:
            r7.f908o = r2     // Catch:{ all -> 0x00d0 }
            monitor-exit(r7)
            return r3
        L_0x009c:
            boolean r1 = r4.f870f     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x00ae
            int[] r1 = r7.f895b     // Catch:{ all -> 0x00d0 }
            int r2 = r6.length     // Catch:{ all -> 0x00d0 }
            java.lang.System.arraycopy(r6, r0, r1, r0, r2)     // Catch:{ all -> 0x00d0 }
            int[] r1 = r7.f895b     // Catch:{ all -> 0x00d0 }
            r7.f894a = r1     // Catch:{ all -> 0x00d0 }
            int r2 = r4.f872h     // Catch:{ all -> 0x00d0 }
            r1[r2] = r0     // Catch:{ all -> 0x00d0 }
        L_0x00ae:
            android.graphics.Bitmap r0 = r7.mo15604r(r4, r5)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r7)
            return r0
        L_0x00b4:
            java.lang.String r0 = f893u     // Catch:{ all -> 0x00d0 }
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00ce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r0.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "Unable to decode frame, status="
            r0.append(r1)     // Catch:{ all -> 0x00d0 }
            int r1 = r7.f908o     // Catch:{ all -> 0x00d0 }
            r0.append(r1)     // Catch:{ all -> 0x00d0 }
            r0.toString()     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r7)
            return r3
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p080j.C1564e.mo15557a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public void mo15558b() {
        this.f904k = (this.f904k + 1) % this.f905l.f878c;
    }

    /* renamed from: c */
    public int mo15559c() {
        return this.f905l.f878c;
    }

    public void clear() {
        this.f905l = null;
        byte[] bArr = this.f902i;
        if (bArr != null) {
            this.f896c.mo15570d(bArr);
        }
        int[] iArr = this.f903j;
        if (iArr != null) {
            this.f896c.mo15572f(iArr);
        }
        Bitmap bitmap = this.f906m;
        if (bitmap != null) {
            this.f896c.mo15569c(bitmap);
        }
        this.f906m = null;
        this.f897d = null;
        this.f912s = null;
        byte[] bArr2 = this.f898e;
        if (bArr2 != null) {
            this.f896c.mo15570d(bArr2);
        }
    }

    /* renamed from: d */
    public int mo15561d() {
        int i;
        if (this.f905l.f878c <= 0 || (i = this.f904k) < 0) {
            return 0;
        }
        return mo15599m(i);
    }

    /* renamed from: e */
    public void mo15562e(@NonNull Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f913t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* renamed from: f */
    public void mo15563f() {
        this.f904k = -1;
    }

    /* renamed from: g */
    public int mo15564g() {
        return this.f904k;
    }

    @NonNull
    public ByteBuffer getData() {
        return this.f897d;
    }

    /* renamed from: h */
    public int mo15566h() {
        return this.f897d.limit() + this.f902i.length + (this.f903j.length * 4);
    }

    @ColorInt
    /* renamed from: i */
    public final int mo15595i(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f909p + i; i9++) {
            byte[] bArr = this.f902i;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f894a[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f909p + i11; i12++) {
            byte[] bArr2 = this.f902i;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f894a[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: j */
    public final void mo15596j(C1561b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C1561b bVar2 = bVar;
        int[] iArr = this.f903j;
        int i6 = bVar2.f868d;
        int i7 = this.f909p;
        int i8 = i6 / i7;
        int i9 = bVar2.f866b / i7;
        int i10 = bVar2.f867c / i7;
        int i11 = bVar2.f865a / i7;
        boolean z2 = this.f904k == 0;
        int i12 = this.f909p;
        int i13 = this.f911r;
        int i14 = this.f910q;
        byte[] bArr = this.f902i;
        int[] iArr2 = this.f894a;
        Boolean bool = this.f912s;
        int i15 = 8;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i16 < i8) {
            Boolean bool2 = bool;
            if (bVar2.f869e) {
                if (i17 >= i8) {
                    i = i8;
                    int i19 = i18 + 1;
                    if (i19 == 2) {
                        i18 = i19;
                        i17 = 4;
                    } else if (i19 == 3) {
                        i18 = i19;
                        i15 = 4;
                        i17 = 2;
                    } else if (i19 != 4) {
                        i18 = i19;
                    } else {
                        i18 = i19;
                        i17 = 1;
                        i15 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i17 + i15;
            } else {
                i = i8;
                i2 = i17;
                i17 = i16;
            }
            int i20 = i17 + i9;
            boolean z3 = i12 == 1;
            if (i20 < i14) {
                int i21 = i20 * i13;
                int i22 = i21 + i11;
                int i23 = i22 + i10;
                int i24 = i21 + i13;
                if (i24 < i23) {
                    i23 = i24;
                }
                i3 = i2;
                int i25 = i16 * i12 * bVar2.f867c;
                if (z3) {
                    int i26 = i22;
                    while (i26 < i23) {
                        int i27 = i9;
                        int i28 = iArr2[bArr[i25] & 255];
                        if (i28 != 0) {
                            iArr[i26] = i28;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i12;
                        i26++;
                        i9 = i27;
                    }
                } else {
                    i5 = i9;
                    int i29 = ((i23 - i22) * i12) + i25;
                    int i30 = i22;
                    while (true) {
                        i4 = i10;
                        if (i30 >= i23) {
                            break;
                        }
                        int i31 = mo15595i(i25, i29, bVar2.f867c);
                        if (i31 != 0) {
                            iArr[i30] = i31;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i25 += i12;
                        i30++;
                        i10 = i4;
                    }
                    bool = bool2;
                    i16++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i17 = i3;
                }
            } else {
                i3 = i2;
            }
            i5 = i9;
            i4 = i10;
            bool = bool2;
            i16++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i17 = i3;
        }
        Boolean bool3 = bool;
        if (this.f912s == null) {
            if (bool3 == null) {
                z = false;
            } else {
                z = bool3.booleanValue();
            }
            this.f912s = Boolean.valueOf(z);
        }
    }

    /* renamed from: k */
    public final void mo15597k(C1561b bVar) {
        C1561b bVar2 = bVar;
        int[] iArr = this.f903j;
        int i = bVar2.f868d;
        int i2 = bVar2.f866b;
        int i3 = bVar2.f867c;
        int i4 = bVar2.f865a;
        boolean z = this.f904k == 0;
        int i5 = this.f911r;
        byte[] bArr = this.f902i;
        int[] iArr2 = this.f894a;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f867c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = i;
                byte b3 = b2 & 255;
                if (b3 != b) {
                    int i14 = iArr2[b3];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                C1561b bVar3 = bVar;
                i = i13;
            }
            int i15 = i;
            i6++;
            bVar2 = bVar;
        }
        this.f912s = Boolean.valueOf(this.f912s == null && z && b != -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r7v13, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15598l(p040c.p077d.p078a.p080j.C1561b r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            if (r1 == 0) goto L_0x000d
            java.nio.ByteBuffer r2 = r0.f897d
            int r3 = r1.f874j
            r2.position(r3)
        L_0x000d:
            if (r1 != 0) goto L_0x0016
            c.d.a.j.c r1 = r0.f905l
            int r2 = r1.f881f
            int r1 = r1.f882g
            goto L_0x001a
        L_0x0016:
            int r2 = r1.f867c
            int r1 = r1.f868d
        L_0x001a:
            int r2 = r2 * r1
            byte[] r1 = r0.f902i
            if (r1 == 0) goto L_0x0022
            int r1 = r1.length
            if (r1 >= r2) goto L_0x002a
        L_0x0022:
            c.d.a.j.a$a r1 = r0.f896c
            byte[] r1 = r1.mo15571e(r2)
            r0.f902i = r1
        L_0x002a:
            byte[] r1 = r0.f902i
            short[] r3 = r0.f899f
            r4 = 4096(0x1000, float:5.74E-42)
            if (r3 != 0) goto L_0x0036
            short[] r3 = new short[r4]
            r0.f899f = r3
        L_0x0036:
            short[] r3 = r0.f899f
            byte[] r5 = r0.f900g
            if (r5 != 0) goto L_0x0040
            byte[] r5 = new byte[r4]
            r0.f900g = r5
        L_0x0040:
            byte[] r5 = r0.f900g
            byte[] r6 = r0.f901h
            if (r6 != 0) goto L_0x004c
            r6 = 4097(0x1001, float:5.741E-42)
            byte[] r6 = new byte[r6]
            r0.f901h = r6
        L_0x004c:
            byte[] r6 = r0.f901h
            int r7 = r28.mo15602p()
            r8 = 1
            int r9 = r8 << r7
            int r10 = r9 + 1
            int r11 = r9 + 2
            int r7 = r7 + r8
            int r12 = r8 << r7
            int r12 = r12 - r8
            r13 = 0
            r14 = r13
        L_0x005f:
            if (r14 >= r9) goto L_0x0069
            r3[r14] = r13
            byte r15 = (byte) r14
            r5[r14] = r15
            int r14 = r14 + 1
            goto L_0x005f
        L_0x0069:
            byte[] r14 = r0.f898e
            r15 = -1
            r23 = r7
            r21 = r11
            r22 = r12
            r16 = r13
            r17 = r16
            r18 = r17
            r19 = r18
            r20 = r19
            r25 = r20
            r26 = r25
            r24 = r15
        L_0x0082:
            if (r13 >= r2) goto L_0x014b
            if (r16 != 0) goto L_0x0093
            int r16 = r28.mo15601o()
            if (r16 > 0) goto L_0x0091
            r3 = 3
            r0.f908o = r3
            goto L_0x014b
        L_0x0091:
            r17 = 0
        L_0x0093:
            byte r4 = r14[r17]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r18
            int r19 = r19 + r4
            int r18 = r18 + 8
            int r17 = r17 + 1
            int r16 = r16 + -1
            r4 = r18
            r8 = r21
            r15 = r23
            r0 = r24
            r23 = r7
            r7 = r25
        L_0x00ad:
            if (r4 < r15) goto L_0x0135
            r24 = r11
            r11 = r19 & r22
            int r19 = r19 >> r15
            int r4 = r4 - r15
            if (r11 != r9) goto L_0x00c1
            r22 = r12
            r15 = r23
            r8 = r24
            r11 = r8
            r0 = -1
            goto L_0x00ad
        L_0x00c1:
            if (r11 != r10) goto L_0x00d8
            r18 = r4
            r25 = r7
            r21 = r8
            r7 = r23
            r11 = r24
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r24 = r0
            r23 = r15
            r15 = -1
            r0 = r28
            goto L_0x0082
        L_0x00d8:
            r25 = r4
            r4 = -1
            if (r0 != r4) goto L_0x00ec
            byte r0 = r5[r11]
            r1[r20] = r0
            int r20 = r20 + 1
            int r13 = r13 + 1
            r0 = r11
            r7 = r0
            r11 = r24
            r4 = r25
            goto L_0x00ad
        L_0x00ec:
            if (r11 < r8) goto L_0x00f5
            byte r7 = (byte) r7
            r6[r26] = r7
            int r26 = r26 + 1
            r7 = r0
            goto L_0x00f6
        L_0x00f5:
            r7 = r11
        L_0x00f6:
            if (r7 < r9) goto L_0x0101
            byte r21 = r5[r7]
            r6[r26] = r21
            int r26 = r26 + 1
            short r7 = r3[r7]
            goto L_0x00f6
        L_0x0101:
            byte r7 = r5[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r7
            r1[r20] = r4
        L_0x0108:
            int r20 = r20 + 1
            int r13 = r13 + 1
            if (r26 <= 0) goto L_0x0115
            int r26 = r26 + -1
            byte r27 = r6[r26]
            r1[r20] = r27
            goto L_0x0108
        L_0x0115:
            r27 = r6
            r6 = 4096(0x1000, float:5.74E-42)
            if (r8 >= r6) goto L_0x012c
            short r0 = (short) r0
            r3[r8] = r0
            r5[r8] = r4
            int r8 = r8 + 1
            r0 = r8 & r22
            if (r0 != 0) goto L_0x012c
            if (r8 >= r6) goto L_0x012c
            int r15 = r15 + 1
            int r22 = r22 + r8
        L_0x012c:
            r0 = r11
            r11 = r24
            r4 = r25
            r6 = r27
            goto L_0x00ad
        L_0x0135:
            r25 = r4
            r24 = r0
            r21 = r8
            r18 = r25
            r4 = 4096(0x1000, float:5.74E-42)
            r8 = 1
            r0 = r28
            r25 = r7
            r7 = r23
            r23 = r15
            r15 = -1
            goto L_0x0082
        L_0x014b:
            r13 = r20
            r0 = 0
            java.util.Arrays.fill(r1, r13, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p080j.C1564e.mo15598l(c.d.a.j.b):void");
    }

    /* renamed from: m */
    public int mo15599m(int i) {
        if (i >= 0) {
            C1562c cVar = this.f905l;
            if (i < cVar.f878c) {
                return cVar.f880e.get(i).f873i;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public final Bitmap mo15600n() {
        Boolean bool = this.f912s;
        Bitmap a = this.f896c.mo15567a(this.f911r, this.f910q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f913t);
        a.setHasAlpha(true);
        return a;
    }

    /* renamed from: o */
    public final int mo15601o() {
        int p = mo15602p();
        if (p <= 0) {
            return p;
        }
        ByteBuffer byteBuffer = this.f897d;
        byteBuffer.get(this.f898e, 0, Math.min(p, byteBuffer.remaining()));
        return p;
    }

    /* renamed from: p */
    public final int mo15602p() {
        return this.f897d.get() & 255;
    }

    /* renamed from: q */
    public synchronized void mo15603q(@NonNull C1562c cVar, @NonNull ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f908o = 0;
            this.f905l = cVar;
            this.f904k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f897d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f897d.order(ByteOrder.LITTLE_ENDIAN);
            this.f907n = false;
            Iterator<C1561b> it = cVar.f880e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f871g == 3) {
                        this.f907n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f909p = highestOneBit;
            this.f911r = cVar.f881f / highestOneBit;
            this.f910q = cVar.f882g / highestOneBit;
            this.f902i = this.f896c.mo15571e(cVar.f881f * cVar.f882g);
            this.f903j = this.f896c.mo15568b(this.f911r * this.f910q);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }

    /* renamed from: r */
    public final Bitmap mo15604r(C1561b bVar, C1561b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f903j;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f906m;
            if (bitmap2 != null) {
                this.f896c.mo15569c(bitmap2);
            }
            this.f906m = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f871g == 3 && this.f906m == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f871g) > 0) {
            if (i2 == 2) {
                if (!bVar.f870f) {
                    C1562c cVar = this.f905l;
                    int i4 = cVar.f887l;
                    if (bVar.f875k == null || cVar.f885j != bVar.f872h) {
                        i3 = i4;
                    }
                } else if (this.f904k == 0) {
                    this.f912s = Boolean.TRUE;
                }
                int i5 = bVar2.f868d;
                int i6 = this.f909p;
                int i7 = i5 / i6;
                int i8 = bVar2.f866b / i6;
                int i9 = bVar2.f867c / i6;
                int i10 = bVar2.f865a / i6;
                int i11 = this.f911r;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f911r;
                }
            } else if (i2 == 3 && (bitmap = this.f906m) != null) {
                int i16 = this.f911r;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f910q);
            }
        }
        mo15598l(bVar);
        if (bVar.f869e || this.f909p != 1) {
            mo15596j(bVar);
        } else {
            mo15597k(bVar);
        }
        if (this.f907n && ((i = bVar.f871g) == 0 || i == 1)) {
            if (this.f906m == null) {
                this.f906m = mo15600n();
            }
            Bitmap bitmap3 = this.f906m;
            int i17 = this.f911r;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f910q);
        }
        Bitmap n = mo15600n();
        int i18 = this.f911r;
        n.setPixels(iArr, 0, i18, 0, 0, i18, this.f910q);
        return n;
    }

    public C1564e(@NonNull C1559a.C1560a aVar) {
        this.f895b = new int[256];
        this.f913t = Bitmap.Config.ARGB_8888;
        this.f896c = aVar;
        this.f905l = new C1562c();
    }
}
