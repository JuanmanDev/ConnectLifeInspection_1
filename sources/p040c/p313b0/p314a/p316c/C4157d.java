package p040c.p313b0.p314a.p316c;

import com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerTriggerResourceType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: c.b0.a.c.d */
/* compiled from: ContentBlockerTrigger */
public class C4157d {

    /* renamed from: a */
    public String f8751a;

    /* renamed from: b */
    public Pattern f8752b;

    /* renamed from: c */
    public List<ContentBlockerTriggerResourceType> f8753c = new ArrayList();

    /* renamed from: d */
    public List<String> f8754d = new ArrayList();

    /* renamed from: e */
    public List<String> f8755e = new ArrayList();

    /* renamed from: f */
    public List<String> f8756f = new ArrayList();

    /* renamed from: g */
    public List<String> f8757g = new ArrayList();

    /* renamed from: h */
    public List<String> f8758h = new ArrayList();

    public C4157d(String str, Boolean bool, List<ContentBlockerTriggerResourceType> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
        this.f8751a = str;
        this.f8752b = Pattern.compile(str);
        this.f8753c = list == null ? this.f8753c : list;
        if (bool != null) {
            bool.booleanValue();
        }
        this.f8754d = list2 == null ? this.f8754d : list2;
        this.f8755e = list3 == null ? this.f8755e : list3;
        boolean z = true;
        if (!(!this.f8754d.isEmpty() && !this.f8755e.isEmpty())) {
            list4 = list4 == null ? this.f8756f : list4;
            this.f8756f = list4;
            if (list4.size() <= 2) {
                this.f8757g = list5 == null ? this.f8757g : list5;
                this.f8758h = list6 == null ? this.f8758h : list6;
                if ((this.f8757g.isEmpty() || this.f8758h.isEmpty()) ? false : z) {
                    throw new AssertionError();
                }
                return;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static C4157d m11399a(Map<String, Object> map) {
        String str = (String) map.get("url-filter");
        Boolean bool = (Boolean) map.get("url-filter-is-case-sensitive");
        ArrayList arrayList = new ArrayList();
        for (String fromValue : (List) map.get("resource-type")) {
            arrayList.add(ContentBlockerTriggerResourceType.fromValue(fromValue));
        }
        return new C4157d(str, bool, arrayList, (List) map.get("if-domain"), (List) map.get("unless-domain"), (List) map.get("load-type"), (List) map.get("if-top-url"), (List) map.get("unless-top-url"));
    }
}
