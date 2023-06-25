package p040c.p200q.p201a.p264c.p276d.p277g.p278l;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p040c.p200q.p201a.p264c.p276d.p277g.C3356i;
import p040c.p200q.p201a.p264c.p347m.C5773k;

/* renamed from: c.q.a.c.d.g.l.u */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C3417u {

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f6371a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map<C5773k<?>, Boolean> f6372b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    public final void mo20610c(BasePendingResult<? extends C3356i> basePendingResult, boolean z) {
        this.f6371a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo20456a(new C3413s(this, basePendingResult));
    }

    /* renamed from: d */
    public final <TResult> void mo20611d(C5773k<TResult> kVar, boolean z) {
        this.f6372b.put(kVar, Boolean.valueOf(z));
        kVar.mo28859a().mo28842c(new C3415t(this, kVar));
    }

    /* renamed from: e */
    public final void mo20612e(int i, @Nullable String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        mo20615h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo20613f() {
        mo20615h(false, C3375f.f6271B);
    }

    /* renamed from: g */
    public final boolean mo20614g() {
        return !this.f6371a.isEmpty() || !this.f6372b.isEmpty();
    }

    /* renamed from: h */
    public final void mo20615h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f6371a) {
            hashMap = new HashMap(this.f6371a);
        }
        synchronized (this.f6372b) {
            hashMap2 = new HashMap(this.f6372b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo24544d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C5773k) entry2.getKey()).mo28862d(new ApiException(status));
            }
        }
    }
}
