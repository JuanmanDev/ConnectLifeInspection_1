package p040c.p200q.p201a.p202a.p203h.p204f;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.Reader;

/* renamed from: c.q.a.a.h.f.m */
/* compiled from: LogResponse */
public abstract class C2394m {
    /* renamed from: a */
    public static C2394m m4203a(long j) {
        return new C2385h(j);
    }

    @NonNull
    /* renamed from: b */
    public static C2394m m4204b(@NonNull Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m4203a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C2394m a = m4203a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo17761c();
}
