package p040c.p200q.p201a.p202a.p205i;

import androidx.annotation.NonNull;
import java.util.Arrays;
import p040c.p200q.p201a.p202a.C2350b;

/* renamed from: c.q.a.a.i.i */
/* compiled from: EncodedPayload */
public final class C2526i {

    /* renamed from: a */
    public final C2350b f2968a;

    /* renamed from: b */
    public final byte[] f2969b;

    public C2526i(@NonNull C2350b bVar, @NonNull byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f2968a = bVar;
            this.f2969b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    /* renamed from: a */
    public byte[] mo17961a() {
        return this.f2969b;
    }

    /* renamed from: b */
    public C2350b mo17962b() {
        return this.f2968a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2526i)) {
            return false;
        }
        C2526i iVar = (C2526i) obj;
        if (!this.f2968a.equals(iVar.f2968a)) {
            return false;
        }
        return Arrays.equals(this.f2969b, iVar.f2969b);
    }

    public int hashCode() {
        return ((this.f2968a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f2969b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f2968a + ", bytes=[...]}";
    }
}
