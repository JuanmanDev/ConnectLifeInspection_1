package p040c.p200q.p201a.p264c.p276d.p281j;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: c.q.a.c.d.j.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C3447b {
    @NonNull
    /* renamed from: a */
    public static ApiException m8741a(@NonNull Status status) {
        if (status.mo24535T()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
