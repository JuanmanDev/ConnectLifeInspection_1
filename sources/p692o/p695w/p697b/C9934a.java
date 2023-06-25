package p692o.p695w.p697b;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import p692o.C9866f;

/* renamed from: o.w.b.a */
/* compiled from: ScalarRequestBodyConverter */
public final class C9934a<T> implements C9866f<T, RequestBody> {

    /* renamed from: a */
    public static final C9934a<Object> f19314a = new C9934a<>();

    /* renamed from: b */
    public static final MediaType f19315b = MediaType.get("text/plain; charset=UTF-8");

    /* renamed from: b */
    public RequestBody mo51243a(T t) {
        return RequestBody.create(f19315b, String.valueOf(t));
    }
}
