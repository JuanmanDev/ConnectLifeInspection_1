package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.p527firebaseauthapi.zzvg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: c.q.a.c.g.g.r */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4730r {
    @NonNull
    /* renamed from: a */
    public static zzvg m12949a(@NonNull Exception exc, @NonNull String str, @NonNull String str2) {
        "Failed to parse " + str + " for string [" + str2 + "] with exception: " + exc.getMessage();
        return new zzvg("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }

    @NonNull
    /* renamed from: b */
    public static List m12950b(@Nullable JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }
}
