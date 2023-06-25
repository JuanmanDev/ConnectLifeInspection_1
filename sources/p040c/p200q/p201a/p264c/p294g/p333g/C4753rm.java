package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p527firebaseauthapi.zzzy;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.zze;
import com.hisense.connect_life.core.global.EventBusConstKt;

/* renamed from: c.q.a.c.g.g.rm */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4753rm implements C4729qo {

    /* renamed from: a */
    public final /* synthetic */ C4729qo f9603a;

    /* renamed from: b */
    public final /* synthetic */ C4779sm f9604b;

    public C4753rm(C4779sm smVar, C4729qo qoVar) {
        this.f9604b = smVar;
        this.f9603a = qoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26081a(Object obj) {
        C4704q qVar = (C4704q) obj;
        if (!TextUtils.isEmpty(qVar.mo26545f())) {
            this.f9604b.f9620b.mo26482c(new Status(17025), PhoneAuthCredential.m22663T(qVar.mo26543d(), qVar.mo26545f()));
            return;
        }
        this.f9604b.f9621c.mo26839g(new zzzy(qVar.mo26544e(), qVar.mo26542b(), Long.valueOf(qVar.mo26541a()), "Bearer"), (String) null, EventBusConstKt.PHONE, Boolean.valueOf(qVar.mo26546g()), (zze) null, this.f9604b.f9620b, this.f9603a);
    }

    /* renamed from: c */
    public final void mo26082c(@Nullable String str) {
        this.f9603a.mo26082c(str);
    }
}
