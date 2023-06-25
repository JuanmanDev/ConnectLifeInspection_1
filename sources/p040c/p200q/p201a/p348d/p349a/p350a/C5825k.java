package p040c.p200q.p201a.p348d.p349a.p350a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.play.core.review.ReviewException;
import p040c.p200q.p201a.p264c.p347m.C5771j;
import p040c.p200q.p201a.p264c.p347m.C5773k;
import p040c.p200q.p201a.p264c.p347m.C5777m;
import p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5804i;
import p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5810o;
import p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5815t;
import p040c.p200q.p201a.p348d.p349a.p350a.p351c.C5817v;

@SuppressLint({"RestrictedApi"})
/* renamed from: c.q.a.d.a.a.k */
/* compiled from: com.google.android.play:review@@2.0.1 */
public final class C5825k {

    /* renamed from: c */
    public static final C5804i f11346c = new C5804i("ReviewService");
    @VisibleForTesting
    @Nullable

    /* renamed from: a */
    public C5815t f11347a;

    /* renamed from: b */
    public final String f11348b;

    public C5825k(Context context) {
        this.f11348b = context.getPackageName();
        if (C5817v.m16519a(context)) {
            Context context2 = context;
            this.f11347a = new C5815t(context2, f11346c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), C5821g.f11340a, (C5810o) null, (byte[]) null);
        }
    }

    /* renamed from: a */
    public final C5771j mo28917a() {
        f11346c.mo28898d("requestInAppReview (%s)", this.f11348b);
        if (this.f11347a == null) {
            f11346c.mo28896b("Play Store app is either not installed or not the official version", new Object[0]);
            return C5777m.m16413e(new ReviewException(-1));
        }
        C5773k kVar = new C5773k();
        this.f11347a.mo28910p(new C5822h(this, kVar, kVar), kVar);
        return kVar.mo28859a();
    }
}
