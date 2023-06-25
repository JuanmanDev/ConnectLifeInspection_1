package p040c.p313b0.p314a.p319i;

import java.util.Map;

/* renamed from: c.b0.a.i.a */
/* compiled from: ContextMenuOptions */
public class C4168a {

    /* renamed from: a */
    public Boolean f8789a = Boolean.FALSE;

    /* renamed from: a */
    public C4168a mo25521a(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                char c = 65535;
                if (str.hashCode() == -1069507968 && str.equals("hideDefaultSystemContextMenuItems")) {
                    c = 0;
                }
                if (c == 0) {
                    this.f8789a = (Boolean) value;
                }
            }
        }
        return this;
    }
}
