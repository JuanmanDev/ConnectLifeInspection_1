package p648m.p660d.p665j;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* renamed from: m.d.j.g */
/* compiled from: HandshakedataImpl1 */
public class C9675g implements C9671c {

    /* renamed from: a */
    public byte[] f18942a;

    /* renamed from: b */
    public TreeMap<String, String> f18943b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    /* renamed from: b */
    public Iterator<String> mo50499b() {
        return Collections.unmodifiableSet(this.f18943b.keySet()).iterator();
    }

    /* renamed from: c */
    public void mo50495c(String str, String str2) {
        this.f18943b.put(str, str2);
    }

    /* renamed from: e */
    public byte[] mo50500e() {
        return this.f18942a;
    }

    /* renamed from: f */
    public boolean mo50501f(String str) {
        return this.f18943b.containsKey(str);
    }

    /* renamed from: j */
    public String mo50502j(String str) {
        String str2 = this.f18943b.get(str);
        return str2 == null ? "" : str2;
    }
}
