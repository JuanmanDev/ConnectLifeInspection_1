package p692o.p695w.p696a;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p692o.C9866f;
import p692o.C9910q;

/* renamed from: o.w.a.a */
/* compiled from: GsonConverterFactory */
public final class C9931a extends C9866f.C9867a {

    /* renamed from: a */
    public final Gson f19307a;

    public C9931a(Gson gson) {
        this.f19307a = gson;
    }

    /* renamed from: f */
    public static C9931a m26615f() {
        return m26616g(new Gson());
    }

    /* renamed from: g */
    public static C9931a m26616g(Gson gson) {
        if (gson != null) {
            return new C9931a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    /* renamed from: c */
    public C9866f<?, RequestBody> mo51241c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9910q qVar) {
        return new C9932b(this.f19307a, this.f19307a.getAdapter(TypeToken.get(type)));
    }

    /* renamed from: d */
    public C9866f<ResponseBody, ?> mo51242d(Type type, Annotation[] annotationArr, C9910q qVar) {
        return new C9933c(this.f19307a, this.f19307a.getAdapter(TypeToken.get(type)));
    }
}
