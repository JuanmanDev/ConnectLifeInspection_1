package p553f.p554a.p570e.p571a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

/* renamed from: f.a.e.a.m */
/* compiled from: StandardMessageCodec */
public class C9031m implements C9015h<Object> {

    /* renamed from: a */
    public static final C9031m f17698a = new C9031m();

    /* renamed from: b */
    public static final boolean f17699b = (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN);

    /* renamed from: c */
    public static final Charset f17700c = Charset.forName("UTF8");

    /* renamed from: f.a.e.a.m$a */
    /* compiled from: StandardMessageCodec */
    public static final class C9032a extends ByteArrayOutputStream {
        /* renamed from: a */
        public byte[] mo46580a() {
            return this.buf;
        }
    }

    /* renamed from: c */
    public static final void m24429c(ByteBuffer byteBuffer, int i) {
        int position = byteBuffer.position() % i;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i) - position);
        }
    }

    /* renamed from: d */
    public static final byte[] m24430d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[m24431e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: e */
    public static final int m24431e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get() & 255;
            if (b < 254) {
                return b;
            }
            if (b == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: h */
    public static final void m24432h(ByteArrayOutputStream byteArrayOutputStream, int i) {
        int size = byteArrayOutputStream.size() % i;
        if (size != 0) {
            for (int i2 = 0; i2 < i - size; i2++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    /* renamed from: i */
    public static final void m24433i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        m24438n(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public static final void m24434j(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f17699b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            return;
        }
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    /* renamed from: k */
    public static final void m24435k(ByteArrayOutputStream byteArrayOutputStream, double d) {
        m24437m(byteArrayOutputStream, Double.doubleToLongBits(d));
    }

    /* renamed from: l */
    public static final void m24436l(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (f17699b) {
            byteArrayOutputStream.write(i);
            byteArrayOutputStream.write(i >>> 8);
            byteArrayOutputStream.write(i >>> 16);
            byteArrayOutputStream.write(i >>> 24);
            return;
        }
        byteArrayOutputStream.write(i >>> 24);
        byteArrayOutputStream.write(i >>> 16);
        byteArrayOutputStream.write(i >>> 8);
        byteArrayOutputStream.write(i);
    }

    /* renamed from: m */
    public static final void m24437m(ByteArrayOutputStream byteArrayOutputStream, long j) {
        if (f17699b) {
            byteArrayOutputStream.write((byte) ((int) j));
            byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
            byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
            return;
        }
        byteArrayOutputStream.write((byte) ((int) (j >>> 56)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 48)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 40)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 32)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 24)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 16)));
        byteArrayOutputStream.write((byte) ((int) (j >>> 8)));
        byteArrayOutputStream.write((byte) ((int) j));
    }

    /* renamed from: n */
    public static final void m24438n(ByteArrayOutputStream byteArrayOutputStream, int i) {
        if (i < 254) {
            byteArrayOutputStream.write(i);
        } else if (i <= 65535) {
            byteArrayOutputStream.write(254);
            m24434j(byteArrayOutputStream, i);
        } else {
            byteArrayOutputStream.write(255);
            m24436l(byteArrayOutputStream, i);
        }
    }

    /* renamed from: a */
    public ByteBuffer mo46562a(Object obj) {
        if (obj == null) {
            return null;
        }
        C9032a aVar = new C9032a();
        mo46579o(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.mo46580a(), 0, aVar.size());
        return allocateDirect;
    }

    /* renamed from: b */
    public Object mo46563b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f = mo46577f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return f;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* renamed from: f */
    public final Object mo46577f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return mo46578g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: long[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo46578g(byte r5, java.nio.ByteBuffer r6) {
        /*
            r4 = this;
            r0 = 0
            r1 = 8
            switch(r5) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00bc;
                case 5: goto L_0x00a9;
                case 6: goto L_0x009d;
                case 7: goto L_0x0091;
                case 8: goto L_0x008c;
                case 9: goto L_0x0071;
                case 10: goto L_0x0056;
                case 11: goto L_0x003c;
                case 12: goto L_0x0027;
                case 13: goto L_0x000e;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Message corrupted"
            r5.<init>(r6)
            throw r5
        L_0x000e:
            int r5 = m24431e(r6)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x0017:
            if (r0 >= r5) goto L_0x00d5
            java.lang.Object r2 = r4.mo46577f(r6)
            java.lang.Object r3 = r4.mo46577f(r6)
            r1.put(r2, r3)
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0027:
            int r5 = m24431e(r6)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
        L_0x0030:
            if (r0 >= r5) goto L_0x00d5
            java.lang.Object r2 = r4.mo46577f(r6)
            r1.add(r2)
            int r0 = r0 + 1
            goto L_0x0030
        L_0x003c:
            int r5 = m24431e(r6)
            double[] r0 = new double[r5]
            m24429c(r6, r1)
            java.nio.DoubleBuffer r2 = r6.asDoubleBuffer()
            r2.get(r0)
            int r2 = r6.position()
            int r5 = r5 * r1
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x006f
        L_0x0056:
            int r5 = m24431e(r6)
            long[] r0 = new long[r5]
            m24429c(r6, r1)
            java.nio.LongBuffer r2 = r6.asLongBuffer()
            r2.get(r0)
            int r2 = r6.position()
            int r5 = r5 * r1
            int r2 = r2 + r5
            r6.position(r2)
        L_0x006f:
            r1 = r0
            goto L_0x00d5
        L_0x0071:
            int r5 = m24431e(r6)
            int[] r1 = new int[r5]
            r0 = 4
            m24429c(r6, r0)
            java.nio.IntBuffer r2 = r6.asIntBuffer()
            r2.get(r1)
            int r2 = r6.position()
            int r5 = r5 * r0
            int r2 = r2 + r5
            r6.position(r2)
            goto L_0x00d5
        L_0x008c:
            byte[] r1 = m24430d(r6)
            goto L_0x00d5
        L_0x0091:
            byte[] r5 = m24430d(r6)
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r6 = f17700c
            r1.<init>(r5, r6)
            goto L_0x00d5
        L_0x009d:
            m24429c(r6, r1)
            double r5 = r6.getDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            goto L_0x00d5
        L_0x00a9:
            byte[] r5 = m24430d(r6)
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r0 = f17700c
            r6.<init>(r5, r0)
            r5 = 16
            r1.<init>(r6, r5)
            goto L_0x00d5
        L_0x00bc:
            long r5 = r6.getLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            goto L_0x00d5
        L_0x00c5:
            int r5 = r6.getInt()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x00d5
        L_0x00ce:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L_0x00d5
        L_0x00d1:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L_0x00d5
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p570e.p571a.C9031m.mo46578g(byte, java.nio.ByteBuffer):java.lang.Object");
    }

    /* renamed from: o */
    public void mo46579o(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i = 0;
        if (obj == null || obj.equals((Object) null)) {
            byteArrayOutputStream.write(0);
        } else if (obj == Boolean.TRUE) {
            byteArrayOutputStream.write(1);
        } else if (obj == Boolean.FALSE) {
            byteArrayOutputStream.write(2);
        } else if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m24436l(byteArrayOutputStream, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                m24437m(byteArrayOutputStream, ((Long) obj).longValue());
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                m24432h(byteArrayOutputStream, 8);
                m24435k(byteArrayOutputStream, ((Number) obj).doubleValue());
            } else if (obj instanceof BigInteger) {
                byteArrayOutputStream.write(5);
                m24433i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f17700c));
            } else {
                throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
            }
        } else if (obj instanceof String) {
            byteArrayOutputStream.write(7);
            m24433i(byteArrayOutputStream, ((String) obj).getBytes(f17700c));
        } else if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            m24433i(byteArrayOutputStream, (byte[]) obj);
        } else if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            m24438n(byteArrayOutputStream, iArr.length);
            m24432h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i < length) {
                m24436l(byteArrayOutputStream, iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            m24438n(byteArrayOutputStream, jArr.length);
            m24432h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i < length2) {
                m24437m(byteArrayOutputStream, jArr[i]);
                i++;
            }
        } else if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            m24438n(byteArrayOutputStream, dArr.length);
            m24432h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i < length3) {
                m24435k(byteArrayOutputStream, dArr[i]);
                i++;
            }
        } else if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List<Object> list = (List) obj;
            m24438n(byteArrayOutputStream, list.size());
            for (Object o : list) {
                mo46579o(byteArrayOutputStream, o);
            }
        } else if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            m24438n(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                mo46579o(byteArrayOutputStream, entry.getKey());
                mo46579o(byteArrayOutputStream, entry.getValue());
            }
        } else {
            throw new IllegalArgumentException("Unsupported value: " + obj);
        }
    }
}
