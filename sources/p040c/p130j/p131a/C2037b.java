package p040c.p130j.p131a;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: c.j.a.b */
/* compiled from: RuntimeTypeAdapterFactory */
public final class C2037b<T> implements TypeAdapterFactory {

    /* renamed from: e */
    public final Class<?> f1782e;

    /* renamed from: l */
    public final String f1783l;

    /* renamed from: m */
    public final Map<String, Class<?>> f1784m = new LinkedHashMap();

    /* renamed from: n */
    public final Map<Class<?>, String> f1785n = new LinkedHashMap();

    /* renamed from: c.j.a.b$a */
    /* compiled from: RuntimeTypeAdapterFactory */
    public class C2038a extends TypeAdapter<R> {

        /* renamed from: a */
        public final /* synthetic */ Map f1786a;

        /* renamed from: b */
        public final /* synthetic */ Map f1787b;

        public C2038a(Map map, Map map2) {
            this.f1786a = map;
            this.f1787b = map2;
        }

        public R read(JsonReader jsonReader) {
            JsonElement parse = Streams.parse(jsonReader);
            JsonElement remove = parse.getAsJsonObject().remove(C2037b.this.f1783l);
            if (remove != null) {
                String asString = remove.getAsString();
                TypeAdapter typeAdapter = (TypeAdapter) this.f1786a.get(asString);
                if (typeAdapter != null) {
                    return typeAdapter.fromJsonTree(parse);
                }
                throw new JsonParseException("cannot deserialize " + C2037b.this.f1782e + " subtype named " + asString + "; did you forget to register a subtype?");
            }
            throw new JsonParseException("cannot deserialize " + C2037b.this.f1782e + " because it does not define a field named " + C2037b.this.f1783l);
        }

        public void write(JsonWriter jsonWriter, R r) {
            Class<?> cls = r.getClass();
            String str = (String) C2037b.this.f1785n.get(cls);
            TypeAdapter typeAdapter = (TypeAdapter) this.f1787b.get(cls);
            if (typeAdapter != null) {
                JsonObject asJsonObject = typeAdapter.toJsonTree(r).getAsJsonObject();
                if (!asJsonObject.has(C2037b.this.f1783l)) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.add(C2037b.this.f1783l, new JsonPrimitive(str));
                    for (Map.Entry next : asJsonObject.entrySet()) {
                        jsonObject.add((String) next.getKey(), (JsonElement) next.getValue());
                    }
                    Streams.write(jsonObject, jsonWriter);
                    return;
                }
                throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + C2037b.this.f1783l);
            }
            throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
        }
    }

    public C2037b(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.f1782e = cls;
        this.f1783l = str;
    }

    /* renamed from: d */
    public static <T> C2037b<T> m2828d(Class<T> cls) {
        return new C2037b<>(cls, "type");
    }

    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.f1782e) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.f1784m.entrySet()) {
            TypeAdapter delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get((Class) next.getValue()));
            linkedHashMap.put(next.getKey(), delegateAdapter);
            linkedHashMap2.put(next.getValue(), delegateAdapter);
        }
        return new C2038a(linkedHashMap, linkedHashMap2).nullSafe();
    }

    /* renamed from: e */
    public C2037b<T> mo16669e(Class<? extends T> cls) {
        mo16670f(cls, cls.getSimpleName());
        return this;
    }

    /* renamed from: f */
    public C2037b<T> mo16670f(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.f1785n.containsKey(cls) || this.f1784m.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.f1784m.put(str, cls);
            this.f1785n.put(cls, str);
            return this;
        }
    }
}
