package p692o.p695w.p697b;

import java.io.IOException;
import okhttp3.ResponseBody;
import p692o.C9866f;

/* renamed from: o.w.b.d */
/* compiled from: ScalarResponseBodyConverters */
public final class C9937d implements C9866f<ResponseBody, Character> {

    /* renamed from: a */
    public static final C9937d f19318a = new C9937d();

    /* renamed from: b */
    public Character mo51243a(ResponseBody responseBody) {
        String string = responseBody.string();
        if (string.length() == 1) {
            return Character.valueOf(string.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
    }
}
