package p040c.p200q.p363c.p385q.p388j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import p040c.p200q.p363c.p385q.C6709c;
import p040c.p200q.p363c.p385q.C6715g;

/* renamed from: c.q.c.q.j.h */
/* compiled from: ProtobufValueEncoderContext */
public class C6735h implements C6715g {

    /* renamed from: a */
    public boolean f12888a = false;

    /* renamed from: b */
    public boolean f12889b = false;

    /* renamed from: c */
    public C6709c f12890c;

    /* renamed from: d */
    public final C6731f f12891d;

    public C6735h(C6731f fVar) {
        this.f12891d = fVar;
    }

    /* renamed from: a */
    public final void mo31404a() {
        if (!this.f12888a) {
            this.f12888a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: b */
    public void mo31405b(C6709c cVar, boolean z) {
        this.f12888a = false;
        this.f12890c = cVar;
        this.f12889b = z;
    }

    @NonNull
    /* renamed from: d */
    public C6715g mo31347d(@Nullable String str) {
        mo31404a();
        this.f12891d.mo31386g(this.f12890c, str, this.f12889b);
        return this;
    }

    @NonNull
    /* renamed from: e */
    public C6715g mo31348e(boolean z) {
        mo31404a();
        this.f12891d.mo31392m(this.f12890c, z, this.f12889b);
        return this;
    }
}
