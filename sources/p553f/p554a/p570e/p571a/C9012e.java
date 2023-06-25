package p553f.p554a.p570e.p571a;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: f.a.e.a.e */
/* compiled from: JSONMessageCodec */
public final class C9012e implements C9015h<Object> {

    /* renamed from: a */
    public static final C9012e f17685a = new C9012e();

    /* renamed from: a */
    public ByteBuffer mo46562a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a = C9014g.m24401a(obj);
        if (a instanceof String) {
            return C9034o.f17704b.mo46562a(JSONObject.quote((String) a));
        }
        return C9034o.f17704b.mo46562a(a.toString());
    }

    /* renamed from: b */
    public Object mo46563b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(C9034o.f17704b.mo46563b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (!jSONTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        } catch (JSONException e) {
            throw new IllegalArgumentException("Invalid JSON", e);
        }
    }
}
