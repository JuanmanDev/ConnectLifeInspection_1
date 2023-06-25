package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.d.f */
/* compiled from: BinaryReader */
public abstract class C6909f implements C6890b1 {

    /* renamed from: c.q.d.f$a */
    /* compiled from: BinaryReader */
    public static /* synthetic */ class C6910a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13217a;

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
                f13217a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f13217a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6909f.C6910a.<clinit>():void");
        }
    }

    /* renamed from: c.q.d.f$b */
    /* compiled from: BinaryReader */
    public static final class C6911b extends C6909f {

        /* renamed from: a */
        public final boolean f13218a;

        /* renamed from: b */
        public final byte[] f13219b;

        /* renamed from: c */
        public int f13220c;

        /* renamed from: d */
        public int f13221d;

        /* renamed from: e */
        public int f13222e;

        /* renamed from: f */
        public int f13223f;

        public C6911b(ByteBuffer byteBuffer, boolean z) {
            super((C6910a) null);
            this.f13218a = z;
            this.f13219b = byteBuffer.array();
            this.f13220c = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f13221d = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        /* renamed from: A */
        public int mo31779A() {
            if (mo31911Q()) {
                return Integer.MAX_VALUE;
            }
            int b0 = mo31922b0();
            this.f13222e = b0;
            if (b0 == this.f13223f) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.m23292a(b0);
        }

        /* renamed from: B */
        public void mo31780B(List<String> list) {
            mo31921a0(list, false);
        }

        /* renamed from: C */
        public <T> T mo31781C(C6903d1<T> d1Var, C6975p pVar) {
            mo31927g0(2);
            return mo31919Y(d1Var, pVar);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|(2:22|35)(3:30|23|24)) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (mo31787I() != false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
            throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* renamed from: D */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <K, V> void mo31782D(java.util.Map<K, V> r8, p040c.p200q.p405d.C6917g0.C6918a<K, V> r9, p040c.p200q.p405d.C6975p r10) {
            /*
                r7 = this;
                r0 = 2
                r7.mo31927g0(r0)
                int r1 = r7.mo31922b0()
                r7.mo31925e0(r1)
                int r2 = r7.f13221d
                int r3 = r7.f13220c
                int r3 = r3 + r1
                r7.f13221d = r3
                K r1 = r9.f13238b     // Catch:{ all -> 0x005b }
                V r3 = r9.f13240d     // Catch:{ all -> 0x005b }
            L_0x0016:
                int r4 = r7.mo31779A()     // Catch:{ all -> 0x005b }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0025
                r8.put(r1, r3)     // Catch:{ all -> 0x005b }
                r7.f13221d = r2
                return
            L_0x0025:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0046
                if (r4 == r0) goto L_0x0039
                boolean r4 = r7.mo31787I()     // Catch:{ InvalidWireTypeException -> 0x004e }
                if (r4 == 0) goto L_0x0033
                goto L_0x0016
            L_0x0033:
                com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004e }
                r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004e }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x004e }
            L_0x0039:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f13239c     // Catch:{ InvalidWireTypeException -> 0x004e }
                V r5 = r9.f13240d     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004e }
                java.lang.Object r3 = r7.mo31913S(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x0046:
                com.google.protobuf.WireFormat$FieldType r4 = r9.f13237a     // Catch:{ InvalidWireTypeException -> 0x004e }
                r5 = 0
                java.lang.Object r1 = r7.mo31913S(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004e }
                goto L_0x0016
            L_0x004e:
                boolean r4 = r7.mo31787I()     // Catch:{ all -> 0x005b }
                if (r4 == 0) goto L_0x0055
                goto L_0x0016
            L_0x0055:
                com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x005b }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x005b }
                throw r8     // Catch:{ all -> 0x005b }
            L_0x005b:
                r8 = move-exception
                r7.f13221d = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6909f.C6911b.mo31782D(java.util.Map, c.q.d.g0$a, c.q.d.p):void");
        }

        /* renamed from: E */
        public void mo31783E(List<String> list) {
            mo31921a0(list, true);
        }

        /* renamed from: F */
        public ByteString mo31784F() {
            ByteString byteString;
            mo31927g0(2);
            int b0 = mo31922b0();
            if (b0 == 0) {
                return ByteString.EMPTY;
            }
            mo31925e0(b0);
            if (this.f13218a) {
                byteString = ByteString.wrap(this.f13219b, this.f13220c, b0);
            } else {
                byteString = ByteString.copyFrom(this.f13219b, this.f13220c, b0);
            }
            this.f13220c += b0;
            return byteString;
        }

        /* renamed from: G */
        public void mo31785G(List<Float> list) {
            int i;
            int i2;
            if (list instanceof C6993v) {
                C6993v vVar = (C6993v) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 2) {
                    int b0 = mo31922b0();
                    mo31932l0(b0);
                    int i3 = this.f13220c + b0;
                    while (this.f13220c < i3) {
                        vVar.mo32392k(Float.intBitsToFloat(mo31916V()));
                    }
                } else if (b == 5) {
                    do {
                        vVar.mo32392k(readFloat());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 2) {
                    int b02 = mo31922b0();
                    mo31932l0(b02);
                    int i4 = this.f13220c + b02;
                    while (this.f13220c < i4) {
                        list.add(Float.valueOf(Float.intBitsToFloat(mo31916V())));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: H */
        public int mo31786H() {
            mo31927g0(0);
            return mo31922b0();
        }

        /* renamed from: I */
        public boolean mo31787I() {
            int i;
            if (mo31911Q() || (i = this.f13222e) == this.f13223f) {
                return false;
            }
            int b = WireFormat.m23293b(i);
            if (b == 0) {
                mo31930j0();
                return true;
            } else if (b == 1) {
                mo31928h0(8);
                return true;
            } else if (b == 2) {
                mo31928h0(mo31922b0());
                return true;
            } else if (b == 3) {
                mo31929i0();
                return true;
            } else if (b == 5) {
                mo31928h0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        /* renamed from: J */
        public int mo31788J() {
            mo31927g0(5);
            return mo31915U();
        }

        /* renamed from: K */
        public void mo31789K(List<ByteString> list) {
            int i;
            if (WireFormat.m23293b(this.f13222e) == 2) {
                do {
                    list.add(mo31784F());
                    if (!mo31911Q()) {
                        i = this.f13220c;
                    } else {
                        return;
                    }
                } while (mo31922b0() == this.f13222e);
                this.f13220c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: L */
        public void mo31790L(List<Double> list) {
            int i;
            int i2;
            if (list instanceof C6953m) {
                C6953m mVar = (C6953m) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 1) {
                    do {
                        mVar.mo32201k(readDouble());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = mo31922b0();
                    mo31933m0(b0);
                    int i3 = this.f13220c + b0;
                    while (this.f13220c < i3) {
                        mVar.mo32201k(Double.longBitsToDouble(mo31918X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = mo31922b0();
                    mo31933m0(b02);
                    int i4 = this.f13220c + b02;
                    while (this.f13220c < i4) {
                        list.add(Double.valueOf(Double.longBitsToDouble(mo31918X())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: M */
        public long mo31791M() {
            mo31927g0(0);
            return mo31923c0();
        }

        /* renamed from: N */
        public String mo31792N() {
            return mo31920Z(true);
        }

        /* renamed from: O */
        public void mo31793O(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C6907e0) {
                C6907e0 e0Var = (C6907e0) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 1) {
                    do {
                        e0Var.mo31897l(mo31796c());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = mo31922b0();
                    mo31933m0(b0);
                    int i3 = this.f13220c + b0;
                    while (this.f13220c < i3) {
                        e0Var.mo31897l(mo31918X());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo31796c()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = mo31922b0();
                    mo31933m0(b02);
                    int i4 = this.f13220c + b02;
                    while (this.f13220c < i4) {
                        list.add(Long.valueOf(mo31918X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: Q */
        public final boolean mo31911Q() {
            return this.f13220c == this.f13221d;
        }

        /* renamed from: R */
        public final byte mo31912R() {
            int i = this.f13220c;
            if (i != this.f13221d) {
                byte[] bArr = this.f13219b;
                this.f13220c = i + 1;
                return bArr[i];
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        /* renamed from: S */
        public final Object mo31913S(WireFormat.FieldType fieldType, Class<?> cls, C6975p pVar) {
            switch (C6910a.f13217a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(mo31804j());
                case 2:
                    return mo31784F();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(mo31816t());
                case 5:
                    return Integer.valueOf(mo31803i());
                case 6:
                    return Long.valueOf(mo31796c());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(mo31786H());
                case 9:
                    return Long.valueOf(mo31791M());
                case 10:
                    return mo31802h(cls, pVar);
                case 11:
                    return Integer.valueOf(mo31788J());
                case 12:
                    return Long.valueOf(mo31806l());
                case 13:
                    return Integer.valueOf(mo31818v());
                case 14:
                    return Long.valueOf(mo31819w());
                case 15:
                    return mo31792N();
                case 16:
                    return Integer.valueOf(mo31809o());
                case 17:
                    return Long.valueOf(mo31795b());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        /* renamed from: T */
        public final <T> T mo31914T(C6903d1<T> d1Var, C6975p pVar) {
            int i = this.f13223f;
            this.f13223f = WireFormat.m23294c(WireFormat.m23292a(this.f13222e), 4);
            try {
                T newInstance = d1Var.newInstance();
                d1Var.mo31886e(newInstance, this, pVar);
                d1Var.mo31884c(newInstance);
                if (this.f13222e == this.f13223f) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f13223f = i;
            }
        }

        /* renamed from: U */
        public final int mo31915U() {
            mo31925e0(4);
            return mo31916V();
        }

        /* renamed from: V */
        public final int mo31916V() {
            int i = this.f13220c;
            byte[] bArr = this.f13219b;
            this.f13220c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        /* renamed from: W */
        public final long mo31917W() {
            mo31925e0(8);
            return mo31918X();
        }

        /* renamed from: X */
        public final long mo31918X() {
            int i = this.f13220c;
            byte[] bArr = this.f13219b;
            this.f13220c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        /* renamed from: Y */
        public final <T> T mo31919Y(C6903d1<T> d1Var, C6975p pVar) {
            int b0 = mo31922b0();
            mo31925e0(b0);
            int i = this.f13221d;
            int i2 = this.f13220c + b0;
            this.f13221d = i2;
            try {
                T newInstance = d1Var.newInstance();
                d1Var.mo31886e(newInstance, this, pVar);
                d1Var.mo31884c(newInstance);
                if (this.f13220c == i2) {
                    return newInstance;
                }
                throw InvalidProtocolBufferException.parseFailure();
            } finally {
                this.f13221d = i;
            }
        }

        /* renamed from: Z */
        public String mo31920Z(boolean z) {
            mo31927g0(2);
            int b0 = mo31922b0();
            if (b0 == 0) {
                return "";
            }
            mo31925e0(b0);
            if (z) {
                byte[] bArr = this.f13219b;
                int i = this.f13220c;
                if (!C6969o1.m20455t(bArr, i, i + b0)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f13219b, this.f13220c, b0, C6999y.f13392a);
            this.f13220c += b0;
            return str;
        }

        /* renamed from: a */
        public void mo31794a(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C6997x) {
                C6997x xVar = (C6997x) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        xVar.mo32413k(mo31818v());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        xVar.mo32413k(C6937j.m19961b(mo31922b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo31818v()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Integer.valueOf(C6937j.m19961b(mo31922b0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: a0 */
        public void mo31921a0(List<String> list, boolean z) {
            int i;
            int i2;
            if (WireFormat.m23293b(this.f13222e) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            } else if (!(list instanceof C6892c0) || z) {
                do {
                    list.add(mo31920Z(z));
                    if (!mo31911Q()) {
                        i = this.f13220c;
                    } else {
                        return;
                    }
                } while (mo31922b0() == this.f13222e);
                this.f13220c = i;
            } else {
                C6892c0 c0Var = (C6892c0) list;
                do {
                    c0Var.mo31774r(mo31784F());
                    if (!mo31911Q()) {
                        i2 = this.f13220c;
                    } else {
                        return;
                    }
                } while (mo31922b0() == this.f13222e);
                this.f13220c = i2;
            }
        }

        /* renamed from: b */
        public long mo31795b() {
            mo31927g0(0);
            return mo31923c0();
        }

        /* renamed from: b0 */
        public final int mo31922b0() {
            byte b;
            int i = this.f13220c;
            int i2 = this.f13221d;
            if (i2 != i) {
                byte[] bArr = this.f13219b;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f13220c = i3;
                    return b2;
                } else if (i2 - i3 < 9) {
                    return (int) mo31924d0();
                } else {
                    int i4 = i3 + 1;
                    byte b3 = b2 ^ (bArr[i3] << 7);
                    if (b3 < 0) {
                        b = b3 ^ ByteCompanionObject.MIN_VALUE;
                    } else {
                        int i5 = i4 + 1;
                        byte b4 = b3 ^ (bArr[i4] << 14);
                        if (b4 >= 0) {
                            b = b4 ^ ByteCompanionObject.MIN_VALUE;
                        } else {
                            i4 = i5 + 1;
                            byte b5 = b4 ^ (bArr[i5] << 21);
                            if (b5 < 0) {
                                b = b5 ^ ByteCompanionObject.MIN_VALUE;
                            } else {
                                i5 = i4 + 1;
                                byte b6 = bArr[i4];
                                b = (b5 ^ (b6 << 28)) ^ ByteCompanionObject.MIN_VALUE;
                                if (b6 < 0) {
                                    i4 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i4 + 1;
                                        if (bArr[i4] < 0) {
                                            i4 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i4 + 1;
                                                if (bArr[i4] < 0) {
                                                    i4 = i5 + 1;
                                                    if (bArr[i5] < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i5;
                    }
                    this.f13220c = i4;
                    return b;
                }
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: c */
        public long mo31796c() {
            mo31927g0(1);
            return mo31917W();
        }

        /* renamed from: c0 */
        public long mo31923c0() {
            long j;
            int i;
            long j2;
            long j3;
            byte b;
            int i2 = this.f13220c;
            int i3 = this.f13221d;
            if (i3 != i2) {
                byte[] bArr = this.f13219b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f13220c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return mo31924d0();
                } else {
                    int i5 = i4 + 1;
                    byte b3 = b2 ^ (bArr[i4] << 7);
                    if (b3 < 0) {
                        b = b3 ^ ByteCompanionObject.MIN_VALUE;
                    } else {
                        int i6 = i5 + 1;
                        byte b4 = b3 ^ (bArr[i5] << 14);
                        if (b4 >= 0) {
                            i = i6;
                            j = (long) (b4 ^ ByteCompanionObject.MIN_VALUE);
                        } else {
                            i5 = i6 + 1;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                b = b5 ^ ByteCompanionObject.MIN_VALUE;
                            } else {
                                long j4 = (long) b5;
                                int i7 = i5 + 1;
                                long j5 = j4 ^ (((long) bArr[i5]) << 28);
                                if (j5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i8 = i7 + 1;
                                    long j6 = j5 ^ (((long) bArr[i7]) << 35);
                                    if (j6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i7 = i8 + 1;
                                        j5 = j6 ^ (((long) bArr[i8]) << 42);
                                        if (j5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i8 = i7 + 1;
                                            j6 = j5 ^ (((long) bArr[i7]) << 49);
                                            if (j6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                int i9 = i8 + 1;
                                                long j7 = (j6 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                                if (j7 < 0) {
                                                    i = i9 + 1;
                                                    if (((long) bArr[i9]) < 0) {
                                                        throw InvalidProtocolBufferException.malformedVarint();
                                                    }
                                                } else {
                                                    i = i9;
                                                }
                                                j = j7;
                                            }
                                        }
                                    }
                                    j = j6 ^ j2;
                                }
                                j = j5 ^ j3;
                                i = i7;
                            }
                        }
                        this.f13220c = i;
                        return j;
                    }
                    j = (long) b;
                    this.f13220c = i;
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: d */
        public void mo31797d(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C6997x) {
                C6997x xVar = (C6997x) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 2) {
                    int b0 = mo31922b0();
                    mo31932l0(b0);
                    int i3 = this.f13220c + b0;
                    while (this.f13220c < i3) {
                        xVar.mo32413k(mo31916V());
                    }
                } else if (b == 5) {
                    do {
                        xVar.mo32413k(mo31788J());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 2) {
                    int b02 = mo31922b0();
                    mo31932l0(b02);
                    int i4 = this.f13220c + b02;
                    while (this.f13220c < i4) {
                        list.add(Integer.valueOf(mo31916V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo31788J()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: d0 */
        public final long mo31924d0() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte R = mo31912R();
                j |= ((long) (R & ByteCompanionObject.MAX_VALUE)) << i;
                if ((R & ByteCompanionObject.MIN_VALUE) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: e */
        public void mo31798e(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C6907e0) {
                C6907e0 e0Var = (C6907e0) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        e0Var.mo31897l(mo31819w());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        e0Var.mo31897l(C6937j.m19962c(mo31923c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo31819w()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Long.valueOf(C6937j.m19962c(mo31923c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: e0 */
        public final void mo31925e0(int i) {
            if (i < 0 || i > this.f13221d - this.f13220c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: f */
        public <T> void mo31799f(List<T> list, C6903d1<T> d1Var, C6975p pVar) {
            int i;
            if (WireFormat.m23293b(this.f13222e) == 3) {
                int i2 = this.f13222e;
                do {
                    list.add(mo31914T(d1Var, pVar));
                    if (!mo31911Q()) {
                        i = this.f13220c;
                    } else {
                        return;
                    }
                } while (mo31922b0() == i2);
                this.f13220c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: f0 */
        public final void mo31926f0(int i) {
            if (this.f13220c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        /* renamed from: g */
        public void mo31800g(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C6997x) {
                C6997x xVar = (C6997x) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        xVar.mo32413k(mo31809o());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        xVar.mo32413k(mo31922b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo31809o()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Integer.valueOf(mo31922b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: g0 */
        public final void mo31927g0(int i) {
            if (WireFormat.m23293b(this.f13222e) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        public int getTag() {
            return this.f13222e;
        }

        /* renamed from: h */
        public <T> T mo31802h(Class<T> cls, C6975p pVar) {
            mo31927g0(2);
            return mo31919Y(C7009y0.m20722a().mo32432d(cls), pVar);
        }

        /* renamed from: h0 */
        public final void mo31928h0(int i) {
            mo31925e0(i);
            this.f13220c += i;
        }

        /* renamed from: i */
        public int mo31803i() {
            mo31927g0(5);
            return mo31915U();
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* renamed from: i0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo31929i0() {
            /*
                r3 = this;
                int r0 = r3.f13223f
                int r1 = r3.f13222e
                int r1 = com.google.protobuf.WireFormat.m23292a(r1)
                r2 = 4
                int r1 = com.google.protobuf.WireFormat.m23294c(r1, r2)
                r3.f13223f = r1
            L_0x000f:
                int r1 = r3.mo31779A()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.mo31787I()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f13222e
                int r2 = r3.f13223f
                if (r1 != r2) goto L_0x0027
                r3.f13223f = r0
                return
            L_0x0027:
                com.google.protobuf.InvalidProtocolBufferException r0 = com.google.protobuf.InvalidProtocolBufferException.parseFailure()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6909f.C6911b.mo31929i0():void");
        }

        /* renamed from: j */
        public boolean mo31804j() {
            mo31927g0(0);
            if (mo31922b0() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: j0 */
        public final void mo31930j0() {
            int i = this.f13221d;
            int i2 = this.f13220c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f13219b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.f13220c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            mo31931k0();
        }

        /* renamed from: k */
        public <T> void mo31805k(List<T> list, C6903d1<T> d1Var, C6975p pVar) {
            int i;
            if (WireFormat.m23293b(this.f13222e) == 2) {
                int i2 = this.f13222e;
                do {
                    list.add(mo31919Y(d1Var, pVar));
                    if (!mo31911Q()) {
                        i = this.f13220c;
                    } else {
                        return;
                    }
                } while (mo31922b0() == i2);
                this.f13220c = i;
                return;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        /* renamed from: k0 */
        public final void mo31931k0() {
            int i = 0;
            while (i < 10) {
                if (mo31912R() < 0) {
                    i++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        /* renamed from: l */
        public long mo31806l() {
            mo31927g0(1);
            return mo31917W();
        }

        /* renamed from: l0 */
        public final void mo31932l0(int i) {
            mo31925e0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        /* renamed from: m */
        public void mo31807m(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C6907e0) {
                C6907e0 e0Var = (C6907e0) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        e0Var.mo31897l(mo31795b());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        e0Var.mo31897l(mo31923c0());
                    }
                    mo31926f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo31795b()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Long.valueOf(mo31923c0()));
                    }
                    mo31926f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: m0 */
        public final void mo31933m0(int i) {
            mo31925e0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        /* renamed from: n */
        public <T> T mo31808n(C6903d1<T> d1Var, C6975p pVar) {
            mo31927g0(3);
            return mo31914T(d1Var, pVar);
        }

        /* renamed from: o */
        public int mo31809o() {
            mo31927g0(0);
            return mo31922b0();
        }

        /* renamed from: p */
        public void mo31810p(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C6907e0) {
                C6907e0 e0Var = (C6907e0) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        e0Var.mo31897l(mo31791M());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        e0Var.mo31897l(mo31923c0());
                    }
                    mo31926f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Long.valueOf(mo31791M()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Long.valueOf(mo31923c0()));
                    }
                    mo31926f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: q */
        public void mo31811q(List<Long> list) {
            int i;
            int i2;
            if (list instanceof C6907e0) {
                C6907e0 e0Var = (C6907e0) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 1) {
                    do {
                        e0Var.mo31897l(mo31806l());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = mo31922b0();
                    mo31933m0(b0);
                    int i3 = this.f13220c + b0;
                    while (this.f13220c < i3) {
                        e0Var.mo31897l(mo31918X());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 1) {
                    do {
                        list.add(Long.valueOf(mo31806l()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = mo31922b0();
                    mo31933m0(b02);
                    int i4 = this.f13220c + b02;
                    while (this.f13220c < i4) {
                        list.add(Long.valueOf(mo31918X()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: r */
        public void mo31812r(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C6997x) {
                C6997x xVar = (C6997x) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        xVar.mo32413k(mo31786H());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        xVar.mo32413k(mo31922b0());
                    }
                    mo31926f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo31786H()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Integer.valueOf(mo31922b0()));
                    }
                    mo31926f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        public double readDouble() {
            mo31927g0(1);
            return Double.longBitsToDouble(mo31917W());
        }

        public float readFloat() {
            mo31927g0(5);
            return Float.intBitsToFloat(mo31915U());
        }

        /* renamed from: s */
        public void mo31815s(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C6997x) {
                C6997x xVar = (C6997x) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        xVar.mo32413k(mo31816t());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        xVar.mo32413k(mo31922b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Integer.valueOf(mo31816t()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Integer.valueOf(mo31922b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: t */
        public int mo31816t() {
            mo31927g0(0);
            return mo31922b0();
        }

        /* renamed from: u */
        public void mo31817u(List<Integer> list) {
            int i;
            int i2;
            if (list instanceof C6997x) {
                C6997x xVar = (C6997x) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 2) {
                    int b0 = mo31922b0();
                    mo31932l0(b0);
                    int i3 = this.f13220c + b0;
                    while (this.f13220c < i3) {
                        xVar.mo32413k(mo31916V());
                    }
                } else if (b == 5) {
                    do {
                        xVar.mo32413k(mo31803i());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 2) {
                    int b02 = mo31922b0();
                    mo31932l0(b02);
                    int i4 = this.f13220c + b02;
                    while (this.f13220c < i4) {
                        list.add(Integer.valueOf(mo31916V()));
                    }
                } else if (b2 == 5) {
                    do {
                        list.add(Integer.valueOf(mo31803i()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: v */
        public int mo31818v() {
            mo31927g0(0);
            return C6937j.m19961b(mo31922b0());
        }

        /* renamed from: w */
        public long mo31819w() {
            mo31927g0(0);
            return C6937j.m19962c(mo31923c0());
        }

        /* renamed from: x */
        public void mo31820x(List<Boolean> list) {
            int i;
            int i2;
            if (list instanceof C6916g) {
                C6916g gVar = (C6916g) list;
                int b = WireFormat.m23293b(this.f13222e);
                if (b == 0) {
                    do {
                        gVar.mo31941l(mo31804j());
                        if (!mo31911Q()) {
                            i2 = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i2;
                } else if (b == 2) {
                    int b0 = this.f13220c + mo31922b0();
                    while (this.f13220c < b0) {
                        gVar.mo31941l(mo31922b0() != 0);
                    }
                    mo31926f0(b0);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            } else {
                int b2 = WireFormat.m23293b(this.f13222e);
                if (b2 == 0) {
                    do {
                        list.add(Boolean.valueOf(mo31804j()));
                        if (!mo31911Q()) {
                            i = this.f13220c;
                        } else {
                            return;
                        }
                    } while (mo31922b0() == this.f13222e);
                    this.f13220c = i;
                } else if (b2 == 2) {
                    int b02 = this.f13220c + mo31922b0();
                    while (this.f13220c < b02) {
                        list.add(Boolean.valueOf(mo31922b0() != 0));
                    }
                    mo31926f0(b02);
                } else {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
            }
        }

        /* renamed from: y */
        public String mo31821y() {
            return mo31920Z(false);
        }

        /* renamed from: z */
        public <T> T mo31822z(Class<T> cls, C6975p pVar) {
            mo31927g0(3);
            return mo31914T(C7009y0.m20722a().mo32432d(cls), pVar);
        }
    }

    public /* synthetic */ C6909f(C6910a aVar) {
        this();
    }

    /* renamed from: P */
    public static C6909f m19744P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new C6911b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    public C6909f() {
    }
}
