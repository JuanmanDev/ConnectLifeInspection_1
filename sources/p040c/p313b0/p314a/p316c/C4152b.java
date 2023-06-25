package p040c.p313b0.p314a.p316c;

import com.pichillilorenzo.flutter_inappwebview.ContentBlocker.ContentBlockerActionType;
import java.util.Map;

/* renamed from: c.b0.a.c.b */
/* compiled from: ContentBlockerAction */
public class C4152b {

    /* renamed from: a */
    public ContentBlockerActionType f8742a;

    /* renamed from: b */
    public String f8743b;

    public C4152b(ContentBlockerActionType contentBlockerActionType, String str) {
        this.f8742a = contentBlockerActionType;
        boolean equals = contentBlockerActionType.equals(ContentBlockerActionType.CSS_DISPLAY_NONE);
        this.f8743b = str;
    }

    /* renamed from: a */
    public static C4152b m11392a(Map<String, Object> map) {
        return new C4152b(ContentBlockerActionType.fromValue((String) map.get("type")), (String) map.get("selector"));
    }
}
