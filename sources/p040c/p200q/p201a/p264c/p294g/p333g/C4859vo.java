package p040c.p200q.p201a.p264c.p294g.p333g;

import android.text.TextUtils;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: c.q.a.c.g.g.vo */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4859vo {
    /* renamed from: a */
    public static C4677p m13341a(PhoneAuthCredential phoneAuthCredential) {
        if (!TextUtils.isEmpty(phoneAuthCredential.mo37372X())) {
            return C4677p.m12753b(phoneAuthCredential.mo37370V(), phoneAuthCredential.mo37372X(), phoneAuthCredential.mo37373Y());
        }
        return C4677p.m12752a(phoneAuthCredential.mo37371W(), phoneAuthCredential.mo37367R(), phoneAuthCredential.mo37373Y());
    }
}
