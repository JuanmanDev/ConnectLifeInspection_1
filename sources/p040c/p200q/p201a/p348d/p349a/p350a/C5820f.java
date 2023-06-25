package p040c.p200q.p201a.p348d.p349a.p350a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.zzc;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;

@SuppressLint({"RestrictedApi"})
/* renamed from: c.q.a.d.a.a.f */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5820f implements C5794a {

    /* renamed from: a */
    public final C5825k f11338a;

    /* renamed from: b */
    public final Handler f11339b = new Handler(Looper.getMainLooper());

    public C5820f(C5825k kVar) {
        this.f11338a = kVar;
    }

    @NonNull
    /* renamed from: a */
    public final C5771j<Void> mo28885a(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo.mo36431b()) {
            return C5777m.m16414f(null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo36430a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        C5773k kVar = new C5773k();
        intent.putExtra("result_receiver", new zzc(this, this.f11339b, kVar));
        activity.startActivity(intent);
        return kVar.mo28859a();
    }

    @NonNull
    /* renamed from: b */
    public final C5771j<ReviewInfo> mo28886b() {
        return this.f11338a.mo28917a();
    }
}
