package p692o.p695w.p696a;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import p692o.C9866f;

/* renamed from: o.w.a.b */
/* compiled from: GsonRequestBodyConverter */
public final class C9932b<T> implements C9866f<T, RequestBody> {

    /* renamed from: c */
    public static final MediaType f19308c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f19309d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final Gson f19310a;

    /* renamed from: b */
    public final TypeAdapter<T> f19311b;

    public C9932b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f19310a = gson;
        this.f19311b = typeAdapter;
    }

    /* renamed from: b */
    public RequestBody mo51243a(T t) {
        Buffer buffer = new Buffer();
        JsonWriter newJsonWriter = this.f19310a.newJsonWriter(new OutputStreamWriter(buffer.outputStream(), f19309d));
        this.f19311b.write(newJsonWriter, t);
        newJsonWriter.close();
        return RequestBody.create(f19308c, buffer.readByteString());
    }
}
