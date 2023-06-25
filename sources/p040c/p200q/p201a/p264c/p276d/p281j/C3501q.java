package p040c.p200q.p201a.p264c.p276d.p281j;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.R$string;

/* renamed from: c.q.a.c.d.j.q */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class C3501q {

    /* renamed from: a */
    public final Resources f6496a;

    /* renamed from: b */
    public final String f6497b;

    public C3501q(@NonNull Context context) {
        C3495o.m8908j(context);
        Resources resources = context.getResources();
        this.f6496a = resources;
        this.f6497b = resources.getResourcePackageName(R$string.common_google_play_services_unknown_issue);
    }

    @Nullable
    /* renamed from: a */
    public String mo20777a(@NonNull String str) {
        int identifier = this.f6496a.getIdentifier(str, "string", this.f6497b);
        if (identifier == 0) {
            return null;
        }
        return this.f6496a.getString(identifier);
    }
}
