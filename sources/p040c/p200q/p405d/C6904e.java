package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import kotlin.jvm.internal.ByteCompanionObject;
import p040c.p200q.p405d.C6999y;

/* renamed from: c.q.d.e */
/* compiled from: ArrayDecoders */
public final class C6904e {

    /* renamed from: c.q.d.e$a */
    /* compiled from: ArrayDecoders */
    public static /* synthetic */ class C6905a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13209a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13209a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f13209a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6904e.C6905a.<clinit>():void");
        }
    }

    /* renamed from: c.q.d.e$b */
    /* compiled from: ArrayDecoders */
    public static final class C6906b {

        /* renamed from: a */
        public int f13210a;

        /* renamed from: b */
        public long f13211b;

        /* renamed from: c */
        public Object f13212c;

        /* renamed from: d */
        public final C6975p f13213d;

        public C6906b(C6975p pVar) {
            if (pVar != null) {
                this.f13213d = pVar;
                return;
            }
            throw null;
        }
    }

    /* renamed from: A */
    public static int m19690A(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6997x xVar = (C6997x) iVar;
        int I = m19698I(bArr, i2, bVar);
        xVar.mo32413k(C6937j.m19961b(bVar.f13210a));
        while (I < i3) {
            int I2 = m19698I(bArr, I, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            I = m19698I(bArr, I2, bVar);
            xVar.mo32413k(C6937j.m19961b(bVar.f13210a));
        }
        return I;
    }

    /* renamed from: B */
    public static int m19691B(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6907e0 e0Var = (C6907e0) iVar;
        int L = m19701L(bArr, i2, bVar);
        e0Var.mo31897l(C6937j.m19962c(bVar.f13211b));
        while (L < i3) {
            int I = m19698I(bArr, L, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            L = m19701L(bArr, I, bVar);
            e0Var.mo31897l(C6937j.m19962c(bVar.f13211b));
        }
        return L;
    }

    /* renamed from: C */
    public static int m19692C(byte[] bArr, int i, C6906b bVar) {
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 == 0) {
            bVar.f13212c = "";
            return I;
        } else {
            bVar.f13212c = new String(bArr, I, i2, C6999y.f13392a);
            return I + i2;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[EDGE_INSN: B:21:0x0044->B:17:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* renamed from: D */
    public static int m19693D(int r4, byte[] r5, int r6, int r7, p040c.p200q.p405d.C6999y.C7008i<?> r8, p040c.p200q.p405d.C6904e.C6906b r9) {
        /*
            int r6 = m19698I(r5, r6, r9)
            int r0 = r9.f13210a
            if (r0 < 0) goto L_0x0045
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r8.add(r1)
            goto L_0x001b
        L_0x0010:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = p040c.p200q.p405d.C6999y.f13392a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
        L_0x001a:
            int r6 = r6 + r0
        L_0x001b:
            if (r6 >= r7) goto L_0x0044
            int r0 = m19698I(r5, r6, r9)
            int r2 = r9.f13210a
            if (r4 == r2) goto L_0x0026
            goto L_0x0044
        L_0x0026:
            int r6 = m19698I(r5, r0, r9)
            int r0 = r9.f13210a
            if (r0 < 0) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            r8.add(r1)
            goto L_0x001b
        L_0x0034:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = p040c.p200q.p405d.C6999y.f13392a
            r2.<init>(r5, r6, r0, r3)
            r8.add(r2)
            goto L_0x001a
        L_0x003f:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        L_0x0044:
            return r6
        L_0x0045:
            com.google.protobuf.InvalidProtocolBufferException r4 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6904e.m19693D(int, byte[], int, int, c.q.d.y$i, c.q.d.e$b):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        r2 = r7 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (p040c.p200q.p405d.C6969o1.m20455t(r6, r7, r2) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r9.add(new java.lang.String(r6, r7, r0, p040c.p200q.p405d.C6999y.f13392a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        throw com.google.protobuf.InvalidProtocolBufferException.invalidUtf8();
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0059 A[EDGE_INSN: B:28:0x0059->B:23:0x0059 ?: BREAK  , SYNTHETIC] */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19694E(int r5, byte[] r6, int r7, int r8, p040c.p200q.p405d.C6999y.C7008i<?> r9, p040c.p200q.p405d.C6904e.C6906b r10) {
        /*
            int r7 = m19698I(r6, r7, r10)
            int r0 = r10.f13210a
            if (r0 < 0) goto L_0x005f
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0010
            r9.add(r1)
            goto L_0x0023
        L_0x0010:
            int r2 = r7 + r0
            boolean r3 = p040c.p200q.p405d.C6969o1.m20455t(r6, r7, r2)
            if (r3 == 0) goto L_0x005a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = p040c.p200q.p405d.C6999y.f13392a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
        L_0x0022:
            r7 = r2
        L_0x0023:
            if (r7 >= r8) goto L_0x0059
            int r0 = m19698I(r6, r7, r10)
            int r2 = r10.f13210a
            if (r5 == r2) goto L_0x002e
            goto L_0x0059
        L_0x002e:
            int r7 = m19698I(r6, r0, r10)
            int r0 = r10.f13210a
            if (r0 < 0) goto L_0x0054
            if (r0 != 0) goto L_0x003c
            r9.add(r1)
            goto L_0x0023
        L_0x003c:
            int r2 = r7 + r0
            boolean r3 = p040c.p200q.p405d.C6969o1.m20455t(r6, r7, r2)
            if (r3 == 0) goto L_0x004f
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = p040c.p200q.p405d.C6999y.f13392a
            r3.<init>(r6, r7, r0, r4)
            r9.add(r3)
            goto L_0x0022
        L_0x004f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L_0x0054:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        L_0x0059:
            return r7
        L_0x005a:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.invalidUtf8()
            throw r5
        L_0x005f:
            com.google.protobuf.InvalidProtocolBufferException r5 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6904e.m19694E(int, byte[], int, int, c.q.d.y$i, c.q.d.e$b):int");
    }

    /* renamed from: F */
    public static int m19695F(byte[] bArr, int i, C6906b bVar) {
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 == 0) {
            bVar.f13212c = "";
            return I;
        } else {
            bVar.f13212c = C6969o1.m20443h(bArr, I, i2);
            return I + i2;
        }
    }

    /* renamed from: G */
    public static int m19696G(int i, byte[] bArr, int i2, int i3, C6948k1 k1Var, C6906b bVar) {
        if (WireFormat.m23292a(i) != 0) {
            int b = WireFormat.m23293b(i);
            if (b == 0) {
                int L = m19701L(bArr, i2, bVar);
                k1Var.mo32131n(i, Long.valueOf(bVar.f13211b));
                return L;
            } else if (b == 1) {
                k1Var.mo32131n(i, Long.valueOf(m19713j(bArr, i2)));
                return i2 + 8;
            } else if (b == 2) {
                int I = m19698I(bArr, i2, bVar);
                int i4 = bVar.f13210a;
                if (i4 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                } else if (i4 <= bArr.length - I) {
                    if (i4 == 0) {
                        k1Var.mo32131n(i, ByteString.EMPTY);
                    } else {
                        k1Var.mo32131n(i, ByteString.copyFrom(bArr, I, i4));
                    }
                    return I + i4;
                } else {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } else if (b == 3) {
                C6948k1 l = C6948k1.m20196l();
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int I2 = m19698I(bArr, i2, bVar);
                    int i7 = bVar.f13210a;
                    if (i7 == i5) {
                        i6 = i7;
                        i2 = I2;
                        break;
                    }
                    i6 = i7;
                    i2 = m19696G(i7, bArr, I2, i3, l, bVar);
                }
                if (i2 > i3 || i6 != i5) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                k1Var.mo32131n(i, l);
                return i2;
            } else if (b == 5) {
                k1Var.mo32131n(i, Integer.valueOf(m19711h(bArr, i2)));
                return i2 + 4;
            } else {
                throw InvalidProtocolBufferException.invalidTag();
            }
        } else {
            throw InvalidProtocolBufferException.invalidTag();
        }
    }

    /* renamed from: H */
    public static int m19697H(int i, byte[] bArr, int i2, C6906b bVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            bVar.f13210a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            bVar.f13210a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            bVar.f13210a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            bVar.f13210a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                bVar.f13210a = i11;
                return i12;
            }
        }
    }

    /* renamed from: I */
    public static int m19698I(byte[] bArr, int i, C6906b bVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m19697H(b, bArr, i2, bVar);
        }
        bVar.f13210a = b;
        return i2;
    }

    /* renamed from: J */
    public static int m19699J(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6997x xVar = (C6997x) iVar;
        int I = m19698I(bArr, i2, bVar);
        xVar.mo32413k(bVar.f13210a);
        while (I < i3) {
            int I2 = m19698I(bArr, I, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            I = m19698I(bArr, I2, bVar);
            xVar.mo32413k(bVar.f13210a);
        }
        return I;
    }

    /* renamed from: K */
    public static int m19700K(long j, byte[] bArr, int i, C6906b bVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i3 = 7;
        while (b < 0) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            i3 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i3;
            byte b3 = b2;
            i2 = i4;
            b = b3;
        }
        bVar.f13211b = j2;
        return i2;
    }

    /* renamed from: L */
    public static int m19701L(byte[] bArr, int i, C6906b bVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
            return m19700K(j, bArr, i2, bVar);
        }
        bVar.f13211b = j;
        return i2;
    }

    /* renamed from: M */
    public static int m19702M(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6907e0 e0Var = (C6907e0) iVar;
        int L = m19701L(bArr, i2, bVar);
        e0Var.mo31897l(bVar.f13211b);
        while (L < i3) {
            int I = m19698I(bArr, L, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            L = m19701L(bArr, I, bVar);
            e0Var.mo31897l(bVar.f13211b);
        }
        return L;
    }

    /* renamed from: N */
    public static int m19703N(int i, byte[] bArr, int i2, int i3, C6906b bVar) {
        if (WireFormat.m23292a(i) != 0) {
            int b = WireFormat.m23293b(i);
            if (b == 0) {
                return m19701L(bArr, i2, bVar);
            }
            if (b == 1) {
                return i2 + 8;
            }
            if (b == 2) {
                return m19698I(bArr, i2, bVar) + bVar.f13210a;
            }
            if (b == 3) {
                int i4 = (i & -8) | 4;
                int i5 = 0;
                while (i2 < i3) {
                    i2 = m19698I(bArr, i2, bVar);
                    i5 = bVar.f13210a;
                    if (i5 == i4) {
                        break;
                    }
                    i2 = m19703N(i5, bArr, i2, i3, bVar);
                }
                if (i2 <= i3 && i5 == i4) {
                    return i2;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } else if (b == 5) {
                return i2 + 4;
            } else {
                throw InvalidProtocolBufferException.invalidTag();
            }
        } else {
            throw InvalidProtocolBufferException.invalidTag();
        }
    }

    /* renamed from: a */
    public static int m19704a(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6916g gVar = (C6916g) iVar;
        int L = m19701L(bArr, i2, bVar);
        gVar.mo31941l(bVar.f13211b != 0);
        while (L < i3) {
            int I = m19698I(bArr, L, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            L = m19701L(bArr, I, bVar);
            gVar.mo31941l(bVar.f13211b != 0);
        }
        return L;
    }

    /* renamed from: b */
    public static int m19705b(byte[] bArr, int i, C6906b bVar) {
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        } else if (i2 > bArr.length - I) {
            throw InvalidProtocolBufferException.truncatedMessage();
        } else if (i2 == 0) {
            bVar.f13212c = ByteString.EMPTY;
            return I;
        } else {
            bVar.f13212c = ByteString.copyFrom(bArr, I, i2);
            return I + i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d A[EDGE_INSN: B:30:0x004d->B:22:0x004d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19706c(int r2, byte[] r3, int r4, int r5, p040c.p200q.p405d.C6999y.C7008i<?> r6, p040c.p200q.p405d.C6904e.C6906b r7) {
        /*
            int r4 = m19698I(r3, r4, r7)
            int r0 = r7.f13210a
            if (r0 < 0) goto L_0x0053
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x004e
            if (r0 != 0) goto L_0x0014
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L_0x001c
        L_0x0014:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
        L_0x001b:
            int r4 = r4 + r0
        L_0x001c:
            if (r4 >= r5) goto L_0x004d
            int r0 = m19698I(r3, r4, r7)
            int r1 = r7.f13210a
            if (r2 == r1) goto L_0x0027
            goto L_0x004d
        L_0x0027:
            int r4 = m19698I(r3, r0, r7)
            int r0 = r7.f13210a
            if (r0 < 0) goto L_0x0048
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L_0x0043
            if (r0 != 0) goto L_0x003b
            com.google.protobuf.ByteString r0 = com.google.protobuf.ByteString.EMPTY
            r6.add(r0)
            goto L_0x001c
        L_0x003b:
            com.google.protobuf.ByteString r1 = com.google.protobuf.ByteString.copyFrom(r3, r4, r0)
            r6.add(r1)
            goto L_0x001b
        L_0x0043:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L_0x0048:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        L_0x004d:
            return r4
        L_0x004e:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r2
        L_0x0053:
            com.google.protobuf.InvalidProtocolBufferException r2 = com.google.protobuf.InvalidProtocolBufferException.negativeSize()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6904e.m19706c(int, byte[], int, int, c.q.d.y$i, c.q.d.e$b):int");
    }

    /* renamed from: d */
    public static double m19707d(byte[] bArr, int i) {
        return Double.longBitsToDouble(m19713j(bArr, i));
    }

    /* renamed from: e */
    public static int m19708e(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6953m mVar = (C6953m) iVar;
        mVar.mo32201k(m19707d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m19698I(bArr, i4, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            mVar.mo32201k(m19707d(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01f4, code lost:
        r9 = r9 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01ff, code lost:
        r9 = r9 + 8;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19709f(int r7, byte[] r8, int r9, int r10, com.google.protobuf.GeneratedMessageLite.C8428c<?, ?> r11, com.google.protobuf.GeneratedMessageLite.C8430e<?, ?> r12, p040c.p200q.p405d.C6944j1<p040c.p200q.p405d.C6948k1, p040c.p200q.p405d.C6948k1> r13, p040c.p200q.p405d.C6904e.C6906b r14) {
        /*
            c.q.d.u<com.google.protobuf.GeneratedMessageLite$d> r0 = r11.f15533o
            int r7 = r7 >>> 3
            com.google.protobuf.GeneratedMessageLite$d r1 = r12.f15540b
            boolean r1 = r1.mo32374f()
            r2 = 0
            if (r1 == 0) goto L_0x00fb
            com.google.protobuf.GeneratedMessageLite$d r1 = r12.f15540b
            boolean r1 = r1.isPacked()
            if (r1 == 0) goto L_0x00fb
            int[] r10 = p040c.p200q.p405d.C6904e.C6905a.f13209a
            com.google.protobuf.WireFormat$FieldType r1 = r12.mo37993a()
            int r1 = r1.ordinal()
            r10 = r10[r1]
            switch(r10) {
                case 1: goto L_0x00eb;
                case 2: goto L_0x00db;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00bb;
                case 6: goto L_0x00bb;
                case 7: goto L_0x00ab;
                case 8: goto L_0x00ab;
                case 9: goto L_0x009b;
                case 10: goto L_0x009b;
                case 11: goto L_0x008b;
                case 12: goto L_0x007b;
                case 13: goto L_0x006b;
                case 14: goto L_0x0041;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Type cannot be packed: "
            r8.append(r9)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            com.google.protobuf.WireFormat$FieldType r9 = r9.mo32377l()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0041:
            c.q.d.x r10 = new c.q.d.x
            r10.<init>()
            int r8 = m19728y(r8, r9, r10, r14)
            c.q.d.k1 r9 = r11.f15527l
            c.q.d.k1 r14 = p040c.p200q.p405d.C6948k1.m20192e()
            if (r9 != r14) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r9
        L_0x0054:
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            c.q.d.y$d r9 = r9.mo37992d()
            java.lang.Object r7 = p040c.p200q.p405d.C6915f1.m19874z(r7, r10, r9, r2, r13)
            c.q.d.k1 r7 = (p040c.p200q.p405d.C6948k1) r7
            if (r7 == 0) goto L_0x0064
            r11.f15527l = r7
        L_0x0064:
            com.google.protobuf.GeneratedMessageLite$d r7 = r12.f15540b
            r0.mo32372x(r7, r10)
            goto L_0x0234
        L_0x006b:
            c.q.d.e0 r7 = new c.q.d.e0
            r7.<init>()
            int r8 = m19727x(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x007b:
            c.q.d.x r7 = new c.q.d.x
            r7.<init>()
            int r8 = m19726w(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x008b:
            c.q.d.g r7 = new c.q.d.g
            r7.<init>()
            int r8 = m19721r(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x009b:
            c.q.d.x r7 = new c.q.d.x
            r7.<init>()
            int r8 = m19723t(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x00ab:
            c.q.d.e0 r7 = new c.q.d.e0
            r7.<init>()
            int r8 = m19724u(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x00bb:
            c.q.d.x r7 = new c.q.d.x
            r7.<init>()
            int r8 = m19728y(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x00cb:
            c.q.d.e0 r7 = new c.q.d.e0
            r7.<init>()
            int r8 = m19729z(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x00db:
            c.q.d.v r7 = new c.q.d.v
            r7.<init>()
            int r8 = m19725v(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x00eb:
            c.q.d.m r7 = new c.q.d.m
            r7.<init>()
            int r8 = m19722s(r8, r9, r7, r14)
            com.google.protobuf.GeneratedMessageLite$d r9 = r12.f15540b
            r0.mo32372x(r9, r7)
            goto L_0x0234
        L_0x00fb:
            com.google.protobuf.WireFormat$FieldType r1 = r12.mo37993a()
            com.google.protobuf.WireFormat$FieldType r3 = com.google.protobuf.WireFormat.FieldType.ENUM
            if (r1 != r3) goto L_0x0131
            int r9 = m19698I(r8, r9, r14)
            com.google.protobuf.GeneratedMessageLite$d r8 = r12.f15540b
            c.q.d.y$d r8 = r8.mo37992d()
            int r10 = r14.f13210a
            c.q.d.y$c r8 = r8.mo32428a(r10)
            if (r8 != 0) goto L_0x0129
            c.q.d.k1 r8 = r11.f15527l
            c.q.d.k1 r10 = p040c.p200q.p405d.C6948k1.m20192e()
            if (r8 != r10) goto L_0x0123
            c.q.d.k1 r8 = p040c.p200q.p405d.C6948k1.m20196l()
            r11.f15527l = r8
        L_0x0123:
            int r10 = r14.f13210a
            p040c.p200q.p405d.C6915f1.m19829L(r7, r10, r8, r13)
            return r9
        L_0x0129:
            int r7 = r14.f13210a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0201
        L_0x0131:
            int[] r11 = p040c.p200q.p405d.C6904e.C6905a.f13209a
            com.google.protobuf.WireFormat$FieldType r13 = r12.mo37993a()
            int r13 = r13.ordinal()
            r11 = r11[r13]
            switch(r11) {
                case 1: goto L_0x01f7;
                case 2: goto L_0x01ec;
                case 3: goto L_0x01e1;
                case 4: goto L_0x01e1;
                case 5: goto L_0x01d6;
                case 6: goto L_0x01d6;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01cd;
                case 9: goto L_0x01c4;
                case 10: goto L_0x01c4;
                case 11: goto L_0x01b0;
                case 12: goto L_0x01a1;
                case 13: goto L_0x0192;
                case 14: goto L_0x018a;
                case 15: goto L_0x0182;
                case 16: goto L_0x017a;
                case 17: goto L_0x015a;
                case 18: goto L_0x0142;
                default: goto L_0x0140;
            }
        L_0x0140:
            goto L_0x0201
        L_0x0142:
            c.q.d.y0 r7 = p040c.p200q.p405d.C7009y0.m20722a()
            c.q.d.m0 r11 = r12.mo37994b()
            java.lang.Class r11 = r11.getClass()
            c.q.d.d1 r7 = r7.mo32432d(r11)
            int r9 = m19719p(r7, r8, r9, r10, r14)
            java.lang.Object r2 = r14.f13212c
            goto L_0x0201
        L_0x015a:
            int r7 = r7 << 3
            r5 = r7 | 4
            c.q.d.y0 r7 = p040c.p200q.p405d.C7009y0.m20722a()
            c.q.d.m0 r11 = r12.mo37994b()
            java.lang.Class r11 = r11.getClass()
            c.q.d.d1 r1 = r7.mo32432d(r11)
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r14
            int r9 = m19717n(r1, r2, r3, r4, r5, r6)
            java.lang.Object r2 = r14.f13212c
            goto L_0x0201
        L_0x017a:
            int r9 = m19692C(r8, r9, r14)
            java.lang.Object r2 = r14.f13212c
            goto L_0x0201
        L_0x0182:
            int r9 = m19705b(r8, r9, r14)
            java.lang.Object r2 = r14.f13212c
            goto L_0x0201
        L_0x018a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Shouldn't reach here."
            r7.<init>(r8)
            throw r7
        L_0x0192:
            int r9 = m19701L(r8, r9, r14)
            long r7 = r14.f13211b
            long r7 = p040c.p200q.p405d.C6937j.m19962c(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x0201
        L_0x01a1:
            int r9 = m19698I(r8, r9, r14)
            int r7 = r14.f13210a
            int r7 = p040c.p200q.p405d.C6937j.m19961b(r7)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0201
        L_0x01b0:
            int r9 = m19701L(r8, r9, r14)
            long r7 = r14.f13211b
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 == 0) goto L_0x01be
            r7 = 1
            goto L_0x01bf
        L_0x01be:
            r7 = 0
        L_0x01bf:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            goto L_0x0201
        L_0x01c4:
            int r7 = m19711h(r8, r9)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x01f4
        L_0x01cd:
            long r7 = m19713j(r8, r9)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x01ff
        L_0x01d6:
            int r9 = m19698I(r8, r9, r14)
            int r7 = r14.f13210a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x0201
        L_0x01e1:
            int r9 = m19701L(r8, r9, r14)
            long r7 = r14.f13211b
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            goto L_0x0201
        L_0x01ec:
            float r7 = m19715l(r8, r9)
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
        L_0x01f4:
            int r9 = r9 + 4
            goto L_0x0201
        L_0x01f7:
            double r7 = m19707d(r8, r9)
            java.lang.Double r2 = java.lang.Double.valueOf(r7)
        L_0x01ff:
            int r9 = r9 + 8
        L_0x0201:
            boolean r7 = r12.mo37996d()
            if (r7 == 0) goto L_0x020d
            com.google.protobuf.GeneratedMessageLite$d r7 = r12.f15540b
            r0.mo32355a(r7, r2)
            goto L_0x0233
        L_0x020d:
            int[] r7 = p040c.p200q.p405d.C6904e.C6905a.f13209a
            com.google.protobuf.WireFormat$FieldType r8 = r12.mo37993a()
            int r8 = r8.ordinal()
            r7 = r7[r8]
            r8 = 17
            if (r7 == r8) goto L_0x0222
            r8 = 18
            if (r7 == r8) goto L_0x0222
            goto L_0x022e
        L_0x0222:
            com.google.protobuf.GeneratedMessageLite$d r7 = r12.f15540b
            java.lang.Object r7 = r0.mo32361i(r7)
            if (r7 == 0) goto L_0x022e
            java.lang.Object r2 = p040c.p200q.p405d.C6999y.m20714h(r7, r2)
        L_0x022e:
            com.google.protobuf.GeneratedMessageLite$d r7 = r12.f15540b
            r0.mo32372x(r7, r2)
        L_0x0233:
            r8 = r9
        L_0x0234:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6904e.m19709f(int, byte[], int, int, com.google.protobuf.GeneratedMessageLite$c, com.google.protobuf.GeneratedMessageLite$e, c.q.d.j1, c.q.d.e$b):int");
    }

    /* renamed from: g */
    public static int m19710g(int i, byte[] bArr, int i2, int i3, Object obj, C6954m0 m0Var, C6944j1<C6948k1, C6948k1> j1Var, C6906b bVar) {
        GeneratedMessageLite.C8430e a = bVar.f13213d.mo32279a(m0Var, i >>> 3);
        if (a == null) {
            return m19696G(i, bArr, i2, i3, C6977p0.m20529v(obj), bVar);
        }
        GeneratedMessageLite.C8428c cVar = (GeneratedMessageLite.C8428c) obj;
        cVar.mo37989H();
        return m19709f(i, bArr, i2, i3, cVar, a, j1Var, bVar);
    }

    /* renamed from: h */
    public static int m19711h(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: i */
    public static int m19712i(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6997x xVar = (C6997x) iVar;
        xVar.mo32413k(m19711h(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m19698I(bArr, i4, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            xVar.mo32413k(m19711h(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: j */
    public static long m19713j(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: k */
    public static int m19714k(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6907e0 e0Var = (C6907e0) iVar;
        e0Var.mo31897l(m19713j(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int I = m19698I(bArr, i4, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            e0Var.mo31897l(m19713j(bArr, I));
            i4 = I + 8;
        }
        return i4;
    }

    /* renamed from: l */
    public static float m19715l(byte[] bArr, int i) {
        return Float.intBitsToFloat(m19711h(bArr, i));
    }

    /* renamed from: m */
    public static int m19716m(int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6993v vVar = (C6993v) iVar;
        vVar.mo32392k(m19715l(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int I = m19698I(bArr, i4, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            vVar.mo32392k(m19715l(bArr, I));
            i4 = I + 4;
        }
        return i4;
    }

    /* renamed from: n */
    public static int m19717n(C6903d1 d1Var, byte[] bArr, int i, int i2, int i3, C6906b bVar) {
        C6977p0 p0Var = (C6977p0) d1Var;
        Object newInstance = p0Var.newInstance();
        int c0 = p0Var.mo32296c0(newInstance, bArr, i, i2, i3, bVar);
        p0Var.mo31884c(newInstance);
        bVar.f13212c = newInstance;
        return c0;
    }

    /* renamed from: o */
    public static int m19718o(C6903d1 d1Var, int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        int i4 = (i & -8) | 4;
        int n = m19717n(d1Var, bArr, i2, i3, i4, bVar);
        iVar.add(bVar.f13212c);
        while (n < i3) {
            int I = m19698I(bArr, n, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            n = m19717n(d1Var, bArr, I, i3, i4, bVar);
            iVar.add(bVar.f13212c);
        }
        return n;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m19719p(p040c.p200q.p405d.C6903d1 r6, byte[] r7, int r8, int r9, p040c.p200q.p405d.C6904e.C6906b r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m19697H(r8, r7, r0, r10)
            int r8 = r10.f13210a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo31887f(r1, r2, r3, r4, r5)
            r6.mo31884c(r9)
            r10.f13212c = r9
            return r8
        L_0x0025:
            com.google.protobuf.InvalidProtocolBufferException r6 = com.google.protobuf.InvalidProtocolBufferException.truncatedMessage()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6904e.m19719p(c.q.d.d1, byte[], int, int, c.q.d.e$b):int");
    }

    /* renamed from: q */
    public static int m19720q(C6903d1<?> d1Var, int i, byte[] bArr, int i2, int i3, C6999y.C7008i<?> iVar, C6906b bVar) {
        int p = m19719p(d1Var, bArr, i2, i3, bVar);
        iVar.add(bVar.f13212c);
        while (p < i3) {
            int I = m19698I(bArr, p, bVar);
            if (i != bVar.f13210a) {
                break;
            }
            p = m19719p(d1Var, bArr, I, i3, bVar);
            iVar.add(bVar.f13212c);
        }
        return p;
    }

    /* renamed from: r */
    public static int m19721r(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6916g gVar = (C6916g) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            I = m19701L(bArr, I, bVar);
            gVar.mo31941l(bVar.f13211b != 0);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: s */
    public static int m19722s(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6953m mVar = (C6953m) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            mVar.mo32201k(m19707d(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: t */
    public static int m19723t(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6997x xVar = (C6997x) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            xVar.mo32413k(m19711h(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: u */
    public static int m19724u(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6907e0 e0Var = (C6907e0) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            e0Var.mo31897l(m19713j(bArr, I));
            I += 8;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: v */
    public static int m19725v(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6993v vVar = (C6993v) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            vVar.mo32392k(m19715l(bArr, I));
            I += 4;
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: w */
    public static int m19726w(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6997x xVar = (C6997x) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            I = m19698I(bArr, I, bVar);
            xVar.mo32413k(C6937j.m19961b(bVar.f13210a));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: x */
    public static int m19727x(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6907e0 e0Var = (C6907e0) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            I = m19701L(bArr, I, bVar);
            e0Var.mo31897l(C6937j.m19962c(bVar.f13211b));
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: y */
    public static int m19728y(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6997x xVar = (C6997x) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            I = m19698I(bArr, I, bVar);
            xVar.mo32413k(bVar.f13210a);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    /* renamed from: z */
    public static int m19729z(byte[] bArr, int i, C6999y.C7008i<?> iVar, C6906b bVar) {
        C6907e0 e0Var = (C6907e0) iVar;
        int I = m19698I(bArr, i, bVar);
        int i2 = bVar.f13210a + I;
        while (I < i2) {
            I = m19701L(bArr, I, bVar);
            e0Var.mo31897l(bVar.f13211b);
        }
        if (I == i2) {
            return I;
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }
}
