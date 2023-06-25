package p040c.p325e0.p326a.p332c;

import com.tencent.bugly.proguard.C8819b;
import com.tencent.bugly.proguard.C8822k;
import java.util.List;
import java.util.Map;

/* renamed from: c.e0.a.c.b */
/* compiled from: BUGLY */
public final class C4265b {

    /* renamed from: a */
    public StringBuilder f9103a;

    /* renamed from: b */
    public int f9104b = 0;

    public C4265b(StringBuilder sb, int i) {
        this.f9103a = sb;
        this.f9104b = i;
    }

    /* renamed from: a */
    public final C4265b mo25727a(byte b, String str) {
        mo25738l(str);
        StringBuilder sb = this.f9103a;
        sb.append(b);
        sb.append(10);
        return this;
    }

    /* renamed from: b */
    public final C4265b mo25728b(int i, String str) {
        mo25738l(str);
        StringBuilder sb = this.f9103a;
        sb.append(i);
        sb.append(10);
        return this;
    }

    /* renamed from: c */
    public final C4265b mo25729c(long j, String str) {
        mo25738l(str);
        StringBuilder sb = this.f9103a;
        sb.append(j);
        sb.append(10);
        return this;
    }

    /* renamed from: d */
    public final C4265b mo25730d(C8822k kVar, String str) {
        mo25738l(str);
        StringBuilder sb = this.f9103a;
        sb.append('{');
        sb.append(10);
        if (kVar == null) {
            StringBuilder sb2 = this.f9103a;
            sb2.append(9);
            sb2.append("null");
        } else {
            kVar.mo45955a(this.f9103a, this.f9104b + 1);
        }
        mo25738l((String) null);
        StringBuilder sb3 = this.f9103a;
        sb3.append('}');
        sb3.append(10);
        return this;
    }

    /* renamed from: e */
    public final <T> C4265b mo25731e(T t, String str) {
        if (t == null) {
            this.f9103a.append("null\n");
        } else if (t instanceof Byte) {
            byte byteValue = ((Byte) t).byteValue();
            mo25738l(str);
            StringBuilder sb = this.f9103a;
            sb.append(byteValue);
            sb.append(10);
        } else if (t instanceof Boolean) {
            boolean booleanValue = ((Boolean) t).booleanValue();
            mo25738l(str);
            StringBuilder sb2 = this.f9103a;
            sb2.append(booleanValue ? 'T' : 'F');
            sb2.append(10);
        } else if (t instanceof Short) {
            short shortValue = ((Short) t).shortValue();
            mo25738l(str);
            StringBuilder sb3 = this.f9103a;
            sb3.append(shortValue);
            sb3.append(10);
        } else if (t instanceof Integer) {
            int intValue = ((Integer) t).intValue();
            mo25738l(str);
            StringBuilder sb4 = this.f9103a;
            sb4.append(intValue);
            sb4.append(10);
        } else if (t instanceof Long) {
            long longValue = ((Long) t).longValue();
            mo25738l(str);
            StringBuilder sb5 = this.f9103a;
            sb5.append(longValue);
            sb5.append(10);
        } else if (t instanceof Float) {
            float floatValue = ((Float) t).floatValue();
            mo25738l(str);
            StringBuilder sb6 = this.f9103a;
            sb6.append(floatValue);
            sb6.append(10);
        } else if (t instanceof Double) {
            double doubleValue = ((Double) t).doubleValue();
            mo25738l(str);
            StringBuilder sb7 = this.f9103a;
            sb7.append(doubleValue);
            sb7.append(10);
        } else if (t instanceof String) {
            mo25732f((String) t, str);
        } else if (t instanceof Map) {
            mo25733g((Map) t, str);
        } else if (t instanceof List) {
            List list = (List) t;
            if (list == null) {
                mo25738l(str);
                this.f9103a.append("null\t");
            } else {
                mo25737k(list.toArray(), str);
            }
        } else if (t instanceof C8822k) {
            mo25730d((C8822k) t, str);
        } else if (t instanceof byte[]) {
            mo25736j((byte[]) t, str);
        } else if (t instanceof boolean[]) {
            mo25731e((boolean[]) t, str);
        } else {
            int i = 0;
            if (t instanceof short[]) {
                short[] sArr = (short[]) t;
                mo25738l(str);
                if (sArr == null) {
                    this.f9103a.append("null\n");
                } else if (sArr.length == 0) {
                    StringBuilder sb8 = this.f9103a;
                    sb8.append(sArr.length);
                    sb8.append(", []\n");
                } else {
                    StringBuilder sb9 = this.f9103a;
                    sb9.append(sArr.length);
                    sb9.append(", [\n");
                    C4265b bVar = new C4265b(this.f9103a, this.f9104b + 1);
                    int length = sArr.length;
                    while (i < length) {
                        short s = sArr[i];
                        bVar.mo25738l((String) null);
                        StringBuilder sb10 = bVar.f9103a;
                        sb10.append(s);
                        sb10.append(10);
                        i++;
                    }
                    mo25738l((String) null);
                    StringBuilder sb11 = this.f9103a;
                    sb11.append(']');
                    sb11.append(10);
                }
            } else if (t instanceof int[]) {
                int[] iArr = (int[]) t;
                mo25738l(str);
                if (iArr == null) {
                    this.f9103a.append("null\n");
                } else if (iArr.length == 0) {
                    StringBuilder sb12 = this.f9103a;
                    sb12.append(iArr.length);
                    sb12.append(", []\n");
                } else {
                    StringBuilder sb13 = this.f9103a;
                    sb13.append(iArr.length);
                    sb13.append(", [\n");
                    C4265b bVar2 = new C4265b(this.f9103a, this.f9104b + 1);
                    int length2 = iArr.length;
                    while (i < length2) {
                        int i2 = iArr[i];
                        bVar2.mo25738l((String) null);
                        StringBuilder sb14 = bVar2.f9103a;
                        sb14.append(i2);
                        sb14.append(10);
                        i++;
                    }
                    mo25738l((String) null);
                    StringBuilder sb15 = this.f9103a;
                    sb15.append(']');
                    sb15.append(10);
                }
            } else if (t instanceof long[]) {
                long[] jArr = (long[]) t;
                mo25738l(str);
                if (jArr == null) {
                    this.f9103a.append("null\n");
                } else if (jArr.length == 0) {
                    StringBuilder sb16 = this.f9103a;
                    sb16.append(jArr.length);
                    sb16.append(", []\n");
                } else {
                    StringBuilder sb17 = this.f9103a;
                    sb17.append(jArr.length);
                    sb17.append(", [\n");
                    C4265b bVar3 = new C4265b(this.f9103a, this.f9104b + 1);
                    int length3 = jArr.length;
                    while (i < length3) {
                        long j = jArr[i];
                        bVar3.mo25738l((String) null);
                        StringBuilder sb18 = bVar3.f9103a;
                        sb18.append(j);
                        sb18.append(10);
                        i++;
                    }
                    mo25738l((String) null);
                    StringBuilder sb19 = this.f9103a;
                    sb19.append(']');
                    sb19.append(10);
                }
            } else if (t instanceof float[]) {
                float[] fArr = (float[]) t;
                mo25738l(str);
                if (fArr == null) {
                    this.f9103a.append("null\n");
                } else if (fArr.length == 0) {
                    StringBuilder sb20 = this.f9103a;
                    sb20.append(fArr.length);
                    sb20.append(", []\n");
                } else {
                    StringBuilder sb21 = this.f9103a;
                    sb21.append(fArr.length);
                    sb21.append(", [\n");
                    C4265b bVar4 = new C4265b(this.f9103a, this.f9104b + 1);
                    int length4 = fArr.length;
                    while (i < length4) {
                        float f = fArr[i];
                        bVar4.mo25738l((String) null);
                        StringBuilder sb22 = bVar4.f9103a;
                        sb22.append(f);
                        sb22.append(10);
                        i++;
                    }
                    mo25738l((String) null);
                    StringBuilder sb23 = this.f9103a;
                    sb23.append(']');
                    sb23.append(10);
                }
            } else if (t instanceof double[]) {
                double[] dArr = (double[]) t;
                mo25738l(str);
                if (dArr == null) {
                    this.f9103a.append("null\n");
                } else if (dArr.length == 0) {
                    StringBuilder sb24 = this.f9103a;
                    sb24.append(dArr.length);
                    sb24.append(", []\n");
                } else {
                    StringBuilder sb25 = this.f9103a;
                    sb25.append(dArr.length);
                    sb25.append(", [\n");
                    C4265b bVar5 = new C4265b(this.f9103a, this.f9104b + 1);
                    int length5 = dArr.length;
                    while (i < length5) {
                        double d = dArr[i];
                        bVar5.mo25738l((String) null);
                        StringBuilder sb26 = bVar5.f9103a;
                        sb26.append(d);
                        sb26.append(10);
                        i++;
                    }
                    mo25738l((String) null);
                    StringBuilder sb27 = this.f9103a;
                    sb27.append(']');
                    sb27.append(10);
                }
            } else if (t.getClass().isArray()) {
                mo25737k((Object[]) t, str);
            } else {
                throw new C8819b("write object error: unsupport type.");
            }
        }
        return this;
    }

    /* renamed from: f */
    public final C4265b mo25732f(String str, String str2) {
        mo25738l(str2);
        if (str == null) {
            this.f9103a.append("null\n");
        } else {
            StringBuilder sb = this.f9103a;
            sb.append(str);
            sb.append(10);
        }
        return this;
    }

    /* renamed from: g */
    public final <K, V> C4265b mo25733g(Map<K, V> map, String str) {
        mo25738l(str);
        if (map == null) {
            this.f9103a.append("null\n");
            return this;
        } else if (map.isEmpty()) {
            StringBuilder sb = this.f9103a;
            sb.append(map.size());
            sb.append(", {}\n");
            return this;
        } else {
            StringBuilder sb2 = this.f9103a;
            sb2.append(map.size());
            sb2.append(", {\n");
            C4265b bVar = new C4265b(this.f9103a, this.f9104b + 1);
            C4265b bVar2 = new C4265b(this.f9103a, this.f9104b + 2);
            for (Map.Entry next : map.entrySet()) {
                bVar.mo25738l((String) null);
                StringBuilder sb3 = bVar.f9103a;
                sb3.append('(');
                sb3.append(10);
                bVar2.mo25731e(next.getKey(), (String) null);
                bVar2.mo25731e(next.getValue(), (String) null);
                bVar.mo25738l((String) null);
                StringBuilder sb4 = bVar.f9103a;
                sb4.append(')');
                sb4.append(10);
            }
            mo25738l((String) null);
            StringBuilder sb5 = this.f9103a;
            sb5.append('}');
            sb5.append(10);
            return this;
        }
    }

    /* renamed from: h */
    public final C4265b mo25734h(short s, String str) {
        mo25738l(str);
        StringBuilder sb = this.f9103a;
        sb.append(s);
        sb.append(10);
        return this;
    }

    /* renamed from: i */
    public final C4265b mo25735i(boolean z, String str) {
        mo25738l(str);
        StringBuilder sb = this.f9103a;
        sb.append(z ? 'T' : 'F');
        sb.append(10);
        return this;
    }

    /* renamed from: j */
    public final C4265b mo25736j(byte[] bArr, String str) {
        mo25738l(str);
        if (bArr == null) {
            this.f9103a.append("null\n");
            return this;
        } else if (bArr.length == 0) {
            StringBuilder sb = this.f9103a;
            sb.append(bArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.f9103a;
            sb2.append(bArr.length);
            sb2.append(", [\n");
            C4265b bVar = new C4265b(this.f9103a, this.f9104b + 1);
            for (byte append : bArr) {
                bVar.mo25738l((String) null);
                StringBuilder sb3 = bVar.f9103a;
                sb3.append(append);
                sb3.append(10);
            }
            mo25738l((String) null);
            StringBuilder sb4 = this.f9103a;
            sb4.append(']');
            sb4.append(10);
            return this;
        }
    }

    /* renamed from: k */
    public final <T> C4265b mo25737k(T[] tArr, String str) {
        mo25738l(str);
        if (tArr == null) {
            this.f9103a.append("null\n");
            return this;
        } else if (tArr.length == 0) {
            StringBuilder sb = this.f9103a;
            sb.append(tArr.length);
            sb.append(", []\n");
            return this;
        } else {
            StringBuilder sb2 = this.f9103a;
            sb2.append(tArr.length);
            sb2.append(", [\n");
            C4265b bVar = new C4265b(this.f9103a, this.f9104b + 1);
            for (T e : tArr) {
                bVar.mo25731e(e, (String) null);
            }
            mo25738l((String) null);
            StringBuilder sb3 = this.f9103a;
            sb3.append(']');
            sb3.append(10);
            return this;
        }
    }

    /* renamed from: l */
    public final void mo25738l(String str) {
        for (int i = 0; i < this.f9104b; i++) {
            this.f9103a.append(9);
        }
        if (str != null) {
            StringBuilder sb = this.f9103a;
            sb.append(str);
            sb.append(": ");
        }
    }
}
