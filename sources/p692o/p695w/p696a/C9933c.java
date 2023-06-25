package p692o.p695w.p696a;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import okhttp3.ResponseBody;
import p692o.C9866f;

/* renamed from: o.w.a.c */
/* compiled from: GsonResponseBodyConverter */
public final class C9933c<T> implements C9866f<ResponseBody, T> {

    /* renamed from: a */
    public final Gson f19312a;

    /* renamed from: b */
    public final TypeAdapter<T> f19313b;

    public C9933c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.f19312a = gson;
        this.f19313b = typeAdapter;
    }

    /* renamed from: b */
    public T mo51243a(ResponseBody responseBody) {
        JsonReader newJsonReader = this.f19312a.newJsonReader(responseBody.charStream());
        try {
            T read = this.f19313b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
