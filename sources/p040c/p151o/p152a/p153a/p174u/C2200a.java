package p040c.p151o.p152a.p153a.p174u;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;

/* renamed from: c.o.a.a.u.a */
/* compiled from: AccountGSONDeserializer */
public class C2200a<T> implements JsonDeserializer<T> {
    /* renamed from: a */
    public final void mo17056a(JsonElement jsonElement, JsonElement jsonElement2, String str) {
        JsonElement jsonElement3;
        JsonElement jsonElement4 = jsonElement.getAsJsonObject().get("profile");
        if (jsonElement4 != null && (jsonElement3 = jsonElement4.getAsJsonObject().get(str)) != null && jsonElement3.isJsonObject()) {
            JsonArray jsonArray = new JsonArray();
            jsonArray.add(jsonElement3);
            jsonElement2.getAsJsonObject().get("profile").getAsJsonObject().add(str, jsonArray);
        }
    }

    public T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonElement deepCopy = jsonElement.deepCopy();
        mo17056a(jsonElement, deepCopy, "certifications");
        mo17056a(jsonElement, deepCopy, "education");
        mo17056a(jsonElement, deepCopy, "favorites");
        mo17056a(jsonElement, deepCopy, "likes");
        mo17056a(jsonElement, deepCopy, "patents");
        mo17056a(jsonElement, deepCopy, "phones");
        mo17056a(jsonElement, deepCopy, "publications");
        mo17056a(jsonElement, deepCopy, "skills");
        mo17056a(jsonElement, deepCopy, "work");
        return new Gson().fromJson(deepCopy, type);
    }
}
