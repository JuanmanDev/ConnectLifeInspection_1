package p040c.p200q.p201a.p219b.p223e0;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* renamed from: c.q.a.b.e0.m */
/* compiled from: FrameworkMediaCrypto */
public final class C2656m implements C2652k {

    /* renamed from: a */
    public final MediaCrypto f3367a;

    /* renamed from: b */
    public final boolean f3368b;

    /* renamed from: a */
    public MediaCrypto mo18481a() {
        return this.f3367a;
    }

    /* renamed from: b */
    public boolean mo18482b(String str) {
        return !this.f3368b && this.f3367a.requiresSecureDecoderComponent(str);
    }
}
