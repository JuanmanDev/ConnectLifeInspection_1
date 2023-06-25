package p040c.p321d0.p322a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040c.p321d0.p322a.p323e.C4247a;

/* renamed from: c.d0.a.d */
/* compiled from: SqlCommand */
public class C4246d {

    /* renamed from: a */
    public final String f9074a;

    /* renamed from: b */
    public final List<Object> f9075b;

    public C4246d(String str, List<Object> list) {
        this.f9074a = str;
        this.f9075b = list == null ? new ArrayList<>() : list;
    }

    /* renamed from: a */
    public static Map<String, Object> m11563a(Map<Object, Object> map) {
        Object obj;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            if (value instanceof Map) {
                obj = m11563a((Map) value);
            } else {
                obj = m11564j(value);
            }
            hashMap.put(m11564j(next.getKey()), obj);
        }
        return hashMap;
    }

    /* renamed from: j */
    public static String m11564j(Object obj) {
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
            return m11563a((Map) obj).toString();
        } else {
            return obj.toString();
        }
    }

    /* renamed from: k */
    public static Object m11565k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (C4247a.f9078c) {
            "arg " + obj.getClass().getCanonicalName() + " " + m11564j(obj);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            for (int i = 0; i < list.size(); i++) {
                bArr[i] = (byte) ((Integer) list.get(i)).intValue();
            }
            obj = bArr;
        }
        if (C4247a.f9078c) {
            "arg " + obj.getClass().getCanonicalName() + " " + m11564j(obj);
        }
        return obj;
    }

    /* renamed from: b */
    public String[] mo25698b() {
        return mo25699c(this.f9075b);
    }

    /* renamed from: c */
    public final String[] mo25699c(List<Object> list) {
        return (String[]) mo25705h(list).toArray(new String[0]);
    }

    /* renamed from: d */
    public List<Object> mo25700d() {
        return this.f9075b;
    }

    /* renamed from: e */
    public String mo25701e() {
        return this.f9074a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4246d)) {
            return false;
        }
        C4246d dVar = (C4246d) obj;
        String str = this.f9074a;
        if (str != null) {
            if (!str.equals(dVar.f9074a)) {
                return false;
            }
        } else if (dVar.f9074a != null) {
            return false;
        }
        if (this.f9075b.size() != dVar.f9075b.size()) {
            return false;
        }
        for (int i = 0; i < this.f9075b.size(); i++) {
            if (!(this.f9075b.get(i) instanceof byte[]) || !(dVar.f9075b.get(i) instanceof byte[])) {
                if (!this.f9075b.get(i).equals(dVar.f9075b.get(i))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) this.f9075b.get(i), (byte[]) dVar.f9075b.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public Object[] mo25703f() {
        return mo25704g(this.f9075b);
    }

    /* renamed from: g */
    public final Object[] mo25704g(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object k : list) {
                arrayList.add(m11565k(k));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    /* renamed from: h */
    public final List<String> mo25705h(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object j : list) {
                arrayList.add(m11564j(j));
            }
        }
        return arrayList;
    }

    public int hashCode() {
        String str = this.f9074a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: i */
    public C4246d mo25707i() {
        if (this.f9075b.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = this.f9074a.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = this.f9074a.charAt(i3);
            if (charAt == '?') {
                int i4 = i3 + 1;
                if (i4 < length && Character.isDigit(this.f9074a.charAt(i4))) {
                    return this;
                }
                i++;
                if (i2 >= this.f9075b.size()) {
                    return this;
                }
                int i5 = i2 + 1;
                Object obj = this.f9075b.get(i2);
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
        if (i != this.f9075b.size()) {
            return this;
        }
        return new C4246d(sb.toString(), arrayList);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9074a);
        List<Object> list = this.f9075b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + mo25705h(this.f9075b);
        }
        sb.append(str);
        return sb.toString();
    }
}
