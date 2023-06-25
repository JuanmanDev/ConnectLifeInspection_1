package p040c.p200q.p363c.p399w;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.FirebaseMessagingService;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;

/* renamed from: c.q.c.w.b */
/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class C6796b {
    @Nullable

    /* renamed from: a */
    public String f12998a;

    public C6796b(@Nullable String str) {
        this.f12998a = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C6796b)) {
            return false;
        }
        return C3487m.m8886a(this.f12998a, ((C6796b) obj).f12998a);
    }

    public int hashCode() {
        return C3487m.m8887b(this.f12998a);
    }

    @NonNull
    public String toString() {
        C3487m.C3488a c = C3487m.m8888c(this);
        c.mo20747a(FirebaseMessagingService.EXTRA_TOKEN, this.f12998a);
        return c.toString();
    }
}
