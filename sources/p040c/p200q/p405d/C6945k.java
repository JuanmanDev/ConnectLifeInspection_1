package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.WireFormat;
import java.util.List;

/* renamed from: c.q.d.k */
/* compiled from: CodedInputStreamReader */
public final class C6945k implements C6890b1 {

    /* renamed from: a */
    public final C6937j f13305a;

    /* renamed from: b */
    public int f13306b;

    /* renamed from: c */
    public int f13307c;

    /* renamed from: d */
    public int f13308d = 0;

    /* renamed from: c.q.d.k$a */
    /* compiled from: CodedInputStreamReader */
    public static /* synthetic */ class C6946a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13309a;

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
                f13309a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f13309a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6945k.C6946a.<clinit>():void");
        }
    }

    public C6945k(C6937j jVar) {
        C6999y.m20708b(jVar, "input");
        C6937j jVar2 = jVar;
        this.f13305a = jVar2;
        jVar2.f13274d = this;
    }

    /* renamed from: P */
    public static C6945k m20137P(C6937j jVar) {
        C6945k kVar = jVar.f13274d;
        if (kVar != null) {
            return kVar;
        }
        return new C6945k(jVar);
    }

    /* renamed from: A */
    public int mo31779A() {
        int i = this.f13308d;
        if (i != 0) {
            this.f13306b = i;
            this.f13308d = 0;
        } else {
            this.f13306b = this.f13305a.mo32025C();
        }
        int i2 = this.f13306b;
        if (i2 == 0 || i2 == this.f13307c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.m23292a(i2);
    }

    /* renamed from: B */
    public void mo31780B(List<String> list) {
        mo32118T(list, false);
    }

    /* renamed from: C */
    public <T> T mo31781C(C6903d1<T> d1Var, C6975p pVar) {
        mo32120V(2);
        return mo32117S(d1Var, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo31787I() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo31782D(java.util.Map<K, V> r8, p040c.p200q.p405d.C6917g0.C6918a<K, V> r9, p040c.p200q.p405d.C6975p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.mo32120V(r0)
            c.q.d.j r1 = r7.f13305a
            int r1 = r1.mo32026D()
            c.q.d.j r2 = r7.f13305a
            int r1 = r2.mo32033m(r1)
            K r2 = r9.f13238b
            V r3 = r9.f13240d
        L_0x0014:
            int r4 = r7.mo31779A()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            c.q.d.j r5 = r7.f13305a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo32031e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo31787I()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f13239c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f13240d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.mo32115Q(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f13237a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.mo32115Q(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo31787I()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            c.q.d.j r8 = r7.f13305a
            r8.mo32032l(r1)
            return
        L_0x0065:
            r8 = move-exception
            c.q.d.j r9 = r7.f13305a
            r9.mo32032l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p405d.C6945k.mo31782D(java.util.Map, c.q.d.g0$a, c.q.d.p):void");
    }

    /* renamed from: E */
    public void mo31783E(List<String> list) {
        mo32118T(list, true);
    }

    /* renamed from: F */
    public ByteString mo31784F() {
        mo32120V(2);
        return this.f13305a.mo32035o();
    }

    /* renamed from: G */
    public void mo31785G(List<Float> list) {
        int C;
        int C2;
        if (list instanceof C6993v) {
            C6993v vVar = (C6993v) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 2) {
                int D = this.f13305a.mo32026D();
                mo32121W(D);
                int d = this.f13305a.mo32030d() + D;
                do {
                    vVar.mo32392k(this.f13305a.mo32040t());
                } while (this.f13305a.mo32030d() < d);
            } else if (b == 5) {
                do {
                    vVar.mo32392k(this.f13305a.mo32040t());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 2) {
                int D2 = this.f13305a.mo32026D();
                mo32121W(D2);
                int d2 = this.f13305a.mo32030d() + D2;
                do {
                    list.add(Float.valueOf(this.f13305a.mo32040t()));
                } while (this.f13305a.mo32030d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f13305a.mo32040t()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: H */
    public int mo31786H() {
        mo32120V(0);
        return this.f13305a.mo32041u();
    }

    /* renamed from: I */
    public boolean mo31787I() {
        int i;
        if (this.f13305a.mo32031e() || (i = this.f13306b) == this.f13307c) {
            return false;
        }
        return this.f13305a.mo32028F(i);
    }

    /* renamed from: J */
    public int mo31788J() {
        mo32120V(5);
        return this.f13305a.mo32043w();
    }

    /* renamed from: K */
    public void mo31789K(List<ByteString> list) {
        int C;
        if (WireFormat.m23293b(this.f13306b) == 2) {
            do {
                list.add(mo31784F());
                if (!this.f13305a.mo32031e()) {
                    C = this.f13305a.mo32025C();
                } else {
                    return;
                }
            } while (C == this.f13306b);
            this.f13308d = C;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: L */
    public void mo31790L(List<Double> list) {
        int C;
        int C2;
        if (list instanceof C6953m) {
            C6953m mVar = (C6953m) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 1) {
                do {
                    mVar.mo32201k(this.f13305a.mo32036p());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int D = this.f13305a.mo32026D();
                mo32122X(D);
                int d = this.f13305a.mo32030d() + D;
                do {
                    mVar.mo32201k(this.f13305a.mo32036p());
                } while (this.f13305a.mo32030d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f13305a.mo32036p()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int D2 = this.f13305a.mo32026D();
                mo32122X(D2);
                int d2 = this.f13305a.mo32030d() + D2;
                do {
                    list.add(Double.valueOf(this.f13305a.mo32036p()));
                } while (this.f13305a.mo32030d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: M */
    public long mo31791M() {
        mo32120V(0);
        return this.f13305a.mo32042v();
    }

    /* renamed from: N */
    public String mo31792N() {
        mo32120V(2);
        return this.f13305a.mo32024B();
    }

    /* renamed from: O */
    public void mo31793O(List<Long> list) {
        int C;
        int C2;
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 1) {
                do {
                    e0Var.mo31897l(this.f13305a.mo32039s());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int D = this.f13305a.mo32026D();
                mo32122X(D);
                int d = this.f13305a.mo32030d() + D;
                do {
                    e0Var.mo31897l(this.f13305a.mo32039s());
                } while (this.f13305a.mo32030d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f13305a.mo32039s()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int D2 = this.f13305a.mo32026D();
                mo32122X(D2);
                int d2 = this.f13305a.mo32030d() + D2;
                do {
                    list.add(Long.valueOf(this.f13305a.mo32039s()));
                } while (this.f13305a.mo32030d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: Q */
    public final Object mo32115Q(WireFormat.FieldType fieldType, Class<?> cls, C6975p pVar) {
        switch (C6946a.f13309a[fieldType.ordinal()]) {
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

    /* renamed from: R */
    public final <T> T mo32116R(C6903d1<T> d1Var, C6975p pVar) {
        int i = this.f13307c;
        this.f13307c = WireFormat.m23294c(WireFormat.m23292a(this.f13306b), 4);
        try {
            T newInstance = d1Var.newInstance();
            d1Var.mo31886e(newInstance, this, pVar);
            d1Var.mo31884c(newInstance);
            if (this.f13306b == this.f13307c) {
                return newInstance;
            }
            throw InvalidProtocolBufferException.parseFailure();
        } finally {
            this.f13307c = i;
        }
    }

    /* renamed from: S */
    public final <T> T mo32117S(C6903d1<T> d1Var, C6975p pVar) {
        int D = this.f13305a.mo32026D();
        C6937j jVar = this.f13305a;
        if (jVar.f13271a < jVar.f13272b) {
            int m = jVar.mo32033m(D);
            T newInstance = d1Var.newInstance();
            this.f13305a.f13271a++;
            d1Var.mo31886e(newInstance, this, pVar);
            d1Var.mo31884c(newInstance);
            this.f13305a.mo32029a(0);
            C6937j jVar2 = this.f13305a;
            jVar2.f13271a--;
            jVar2.mo32032l(m);
            return newInstance;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    /* renamed from: T */
    public void mo32118T(List<String> list, boolean z) {
        int C;
        int C2;
        if (WireFormat.m23293b(this.f13306b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        } else if (!(list instanceof C6892c0) || z) {
            do {
                list.add(z ? mo31792N() : mo31821y());
                if (!this.f13305a.mo32031e()) {
                    C = this.f13305a.mo32025C();
                } else {
                    return;
                }
            } while (C == this.f13306b);
            this.f13308d = C;
        } else {
            C6892c0 c0Var = (C6892c0) list;
            do {
                c0Var.mo31774r(mo31784F());
                if (!this.f13305a.mo32031e()) {
                    C2 = this.f13305a.mo32025C();
                } else {
                    return;
                }
            } while (C2 == this.f13306b);
            this.f13308d = C2;
        }
    }

    /* renamed from: U */
    public final void mo32119U(int i) {
        if (this.f13305a.mo32030d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    /* renamed from: V */
    public final void mo32120V(int i) {
        if (WireFormat.m23293b(this.f13306b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    /* renamed from: W */
    public final void mo32121W(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: X */
    public final void mo32122X(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    /* renamed from: a */
    public void mo31794a(List<Integer> list) {
        int C;
        int C2;
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    xVar.mo32413k(this.f13305a.mo32045y());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    xVar.mo32413k(this.f13305a.mo32045y());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32045y()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32045y()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: b */
    public long mo31795b() {
        mo32120V(0);
        return this.f13305a.mo32027E();
    }

    /* renamed from: c */
    public long mo31796c() {
        mo32120V(1);
        return this.f13305a.mo32039s();
    }

    /* renamed from: d */
    public void mo31797d(List<Integer> list) {
        int C;
        int C2;
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 2) {
                int D = this.f13305a.mo32026D();
                mo32121W(D);
                int d = this.f13305a.mo32030d() + D;
                do {
                    xVar.mo32413k(this.f13305a.mo32043w());
                } while (this.f13305a.mo32030d() < d);
            } else if (b == 5) {
                do {
                    xVar.mo32413k(this.f13305a.mo32043w());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 2) {
                int D2 = this.f13305a.mo32026D();
                mo32121W(D2);
                int d2 = this.f13305a.mo32030d() + D2;
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32043w()));
                } while (this.f13305a.mo32030d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32043w()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: e */
    public void mo31798e(List<Long> list) {
        int C;
        int C2;
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    e0Var.mo31897l(this.f13305a.mo32046z());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    e0Var.mo31897l(this.f13305a.mo32046z());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f13305a.mo32046z()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Long.valueOf(this.f13305a.mo32046z()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: f */
    public <T> void mo31799f(List<T> list, C6903d1<T> d1Var, C6975p pVar) {
        int C;
        if (WireFormat.m23293b(this.f13306b) == 3) {
            int i = this.f13306b;
            do {
                list.add(mo32116R(d1Var, pVar));
                if (!this.f13305a.mo32031e() && this.f13308d == 0) {
                    C = this.f13305a.mo32025C();
                } else {
                    return;
                }
            } while (C == i);
            this.f13308d = C;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: g */
    public void mo31800g(List<Integer> list) {
        int C;
        int C2;
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    xVar.mo32413k(this.f13305a.mo32026D());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    xVar.mo32413k(this.f13305a.mo32026D());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32026D()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32026D()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public int getTag() {
        return this.f13306b;
    }

    /* renamed from: h */
    public <T> T mo31802h(Class<T> cls, C6975p pVar) {
        mo32120V(2);
        return mo32117S(C7009y0.m20722a().mo32432d(cls), pVar);
    }

    /* renamed from: i */
    public int mo31803i() {
        mo32120V(5);
        return this.f13305a.mo32038r();
    }

    /* renamed from: j */
    public boolean mo31804j() {
        mo32120V(0);
        return this.f13305a.mo32034n();
    }

    /* renamed from: k */
    public <T> void mo31805k(List<T> list, C6903d1<T> d1Var, C6975p pVar) {
        int C;
        if (WireFormat.m23293b(this.f13306b) == 2) {
            int i = this.f13306b;
            do {
                list.add(mo32117S(d1Var, pVar));
                if (!this.f13305a.mo32031e() && this.f13308d == 0) {
                    C = this.f13305a.mo32025C();
                } else {
                    return;
                }
            } while (C == i);
            this.f13308d = C;
            return;
        }
        throw InvalidProtocolBufferException.invalidWireType();
    }

    /* renamed from: l */
    public long mo31806l() {
        mo32120V(1);
        return this.f13305a.mo32044x();
    }

    /* renamed from: m */
    public void mo31807m(List<Long> list) {
        int C;
        int C2;
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    e0Var.mo31897l(this.f13305a.mo32027E());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    e0Var.mo31897l(this.f13305a.mo32027E());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f13305a.mo32027E()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Long.valueOf(this.f13305a.mo32027E()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: n */
    public <T> T mo31808n(C6903d1<T> d1Var, C6975p pVar) {
        mo32120V(3);
        return mo32116R(d1Var, pVar);
    }

    /* renamed from: o */
    public int mo31809o() {
        mo32120V(0);
        return this.f13305a.mo32026D();
    }

    /* renamed from: p */
    public void mo31810p(List<Long> list) {
        int C;
        int C2;
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    e0Var.mo31897l(this.f13305a.mo32042v());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    e0Var.mo31897l(this.f13305a.mo32042v());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f13305a.mo32042v()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Long.valueOf(this.f13305a.mo32042v()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: q */
    public void mo31811q(List<Long> list) {
        int C;
        int C2;
        if (list instanceof C6907e0) {
            C6907e0 e0Var = (C6907e0) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 1) {
                do {
                    e0Var.mo31897l(this.f13305a.mo32044x());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int D = this.f13305a.mo32026D();
                mo32122X(D);
                int d = this.f13305a.mo32030d() + D;
                do {
                    e0Var.mo31897l(this.f13305a.mo32044x());
                } while (this.f13305a.mo32030d() < d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f13305a.mo32044x()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int D2 = this.f13305a.mo32026D();
                mo32122X(D2);
                int d2 = this.f13305a.mo32030d() + D2;
                do {
                    list.add(Long.valueOf(this.f13305a.mo32044x()));
                } while (this.f13305a.mo32030d() < d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: r */
    public void mo31812r(List<Integer> list) {
        int C;
        int C2;
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    xVar.mo32413k(this.f13305a.mo32041u());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    xVar.mo32413k(this.f13305a.mo32041u());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32041u()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32041u()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    public double readDouble() {
        mo32120V(1);
        return this.f13305a.mo32036p();
    }

    public float readFloat() {
        mo32120V(5);
        return this.f13305a.mo32040t();
    }

    /* renamed from: s */
    public void mo31815s(List<Integer> list) {
        int C;
        int C2;
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    xVar.mo32413k(this.f13305a.mo32037q());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    xVar.mo32413k(this.f13305a.mo32037q());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32037q()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32037q()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: t */
    public int mo31816t() {
        mo32120V(0);
        return this.f13305a.mo32037q();
    }

    /* renamed from: u */
    public void mo31817u(List<Integer> list) {
        int C;
        int C2;
        if (list instanceof C6997x) {
            C6997x xVar = (C6997x) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 2) {
                int D = this.f13305a.mo32026D();
                mo32121W(D);
                int d = this.f13305a.mo32030d() + D;
                do {
                    xVar.mo32413k(this.f13305a.mo32038r());
                } while (this.f13305a.mo32030d() < d);
            } else if (b == 5) {
                do {
                    xVar.mo32413k(this.f13305a.mo32038r());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 2) {
                int D2 = this.f13305a.mo32026D();
                mo32121W(D2);
                int d2 = this.f13305a.mo32030d() + D2;
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32038r()));
                } while (this.f13305a.mo32030d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f13305a.mo32038r()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: v */
    public int mo31818v() {
        mo32120V(0);
        return this.f13305a.mo32045y();
    }

    /* renamed from: w */
    public long mo31819w() {
        mo32120V(0);
        return this.f13305a.mo32046z();
    }

    /* renamed from: x */
    public void mo31820x(List<Boolean> list) {
        int C;
        int C2;
        if (list instanceof C6916g) {
            C6916g gVar = (C6916g) list;
            int b = WireFormat.m23293b(this.f13306b);
            if (b == 0) {
                do {
                    gVar.mo31941l(this.f13305a.mo32034n());
                    if (!this.f13305a.mo32031e()) {
                        C2 = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C2 == this.f13306b);
                this.f13308d = C2;
            } else if (b == 2) {
                int d = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    gVar.mo31941l(this.f13305a.mo32034n());
                } while (this.f13305a.mo32030d() < d);
                mo32119U(d);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        } else {
            int b2 = WireFormat.m23293b(this.f13306b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f13305a.mo32034n()));
                    if (!this.f13305a.mo32031e()) {
                        C = this.f13305a.mo32025C();
                    } else {
                        return;
                    }
                } while (C == this.f13306b);
                this.f13308d = C;
            } else if (b2 == 2) {
                int d2 = this.f13305a.mo32030d() + this.f13305a.mo32026D();
                do {
                    list.add(Boolean.valueOf(this.f13305a.mo32034n()));
                } while (this.f13305a.mo32030d() < d2);
                mo32119U(d2);
            } else {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }
    }

    /* renamed from: y */
    public String mo31821y() {
        mo32120V(2);
        return this.f13305a.mo32023A();
    }

    /* renamed from: z */
    public <T> T mo31822z(Class<T> cls, C6975p pVar) {
        mo32120V(3);
        return mo32116R(C7009y0.m20722a().mo32432d(cls), pVar);
    }
}
