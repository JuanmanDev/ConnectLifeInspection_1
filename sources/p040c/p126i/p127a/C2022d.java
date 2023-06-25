package p040c.p126i.p127a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p126i.p127a.p128e.C2023a;

/* renamed from: c.i.a.d */
/* compiled from: SqlCommand */
public class C2022d {

    /* renamed from: a */
    public final String f1752a;

    /* renamed from: b */
    public final List<Object> f1753b;

    public C2022d(String str, List<Object> list) {
        this.f1752a = str;
        this.f1753b = list == null ? new ArrayList<>() : list;
    }

    /* renamed from: a */
    public static Map<String, Object> m2730a(Map<Object, Object> map) {
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value instanceof Map) {
                obj = m2730a((Map) value);
            } else {
                obj = m2731j(value);
            }
            hashMap.put(m2731j(next.getKey()), obj);
        }
        return hashMap;
    }

    /* renamed from: j */
    public static String m2731j(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            ArrayList arrayList = new ArrayList();
            for (byte valueOf : (byte[]) obj) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            return arrayList.toString();
        } else if (obj instanceof Map) {
            return m2730a((Map) obj).toString();
        } else {
            return obj.toString();
        }
    }

    /* renamed from: k */
    public static Object m2732k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (C2023a.f1756c) {
            "arg " + obj.getClass().getCanonicalName() + " " + m2731j(obj);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i = 0; i < list.size(); i++) {
                bArr[i] = (byte) ((Integer) list.get(i)).intValue();
            }
            obj = bArr;
        }
        if (C2023a.f1756c) {
            "arg " + obj.getClass().getCanonicalName() + " " + m2731j(obj);
        }
        return obj;
    }

    /* renamed from: b */
    public String[] mo16616b() {
        return mo16617c(this.f1753b);
    }

    /* renamed from: c */
    public final String[] mo16617c(List<Object> list) {
        return (String[]) mo16623h(list).toArray(new String[0]);
    }

    /* renamed from: d */
    public List<Object> mo16618d() {
        return this.f1753b;
    }

    /* renamed from: e */
    public String mo16619e() {
        return this.f1752a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2022d)) {
            return false;
        }
        C2022d dVar = (C2022d) obj;
        String str = this.f1752a;
        if (str != null) {
            if (!str.equals(dVar.f1752a)) {
                return false;
            }
        } else if (dVar.f1752a != null) {
            return false;
        }
        if (this.f1753b.size() != dVar.f1753b.size()) {
            return false;
        }
        for (int i = 0; i < this.f1753b.size(); i++) {
            if (!(this.f1753b.get(i) instanceof byte[]) || !(dVar.f1753b.get(i) instanceof byte[])) {
                if (!this.f1753b.get(i).equals(dVar.f1753b.get(i))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) this.f1753b.get(i), (byte[]) dVar.f1753b.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public Object[] mo16621f() {
        return mo16622g(this.f1753b);
    }

    /* renamed from: g */
    public final Object[] mo16622g(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object k : list) {
                arrayList.add(m2732k(k));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    /* renamed from: h */
    public final List<String> mo16623h(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object j : list) {
                arrayList.add(m2731j(j));
            }
        }
        return arrayList;
    }

    public int hashCode() {
        String str = this.f1752a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public C2022d mo16625i() {
        if (this.f1753b.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = this.f1752a.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = this.f1752a.charAt(i3);
            if (charAt == '?') {
                int i4 = i3 + 1;
                if (i4 < length && Character.isDigit(this.f1752a.charAt(i4))) {
                    return this;
                }
                i++;
                if (i2 >= this.f1753b.size()) {
                    return this;
                }
                int i5 = i2 + 1;
                Object obj = this.f1753b.get(i2);
                if ((obj instanceof Integer) || (obj instanceof Long)) {
                    sb.append(obj.toString());
                    i2 = i5;
                } else {
                    arrayList.add(obj);
                    i2 = i5;
                }
            }
            sb.append(charAt);
        }
        if (i != this.f1753b.size()) {
            return this;
        }
        return new C2022d(sb.toString(), arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1752a);
        List<Object> list = this.f1753b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + mo16623h(this.f1753b);
        }
        sb.append(str);
        return sb.toString();
    }
}
