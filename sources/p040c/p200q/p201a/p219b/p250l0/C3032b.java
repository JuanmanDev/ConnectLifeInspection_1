package p040c.p200q.p201a.p219b.p250l0;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import p040c.p200q.p201a.p219b.p222d0.C2636g;

/* renamed from: c.q.a.b.l0.b */
/* compiled from: SimpleSubtitleDecoder */
public abstract class C3032b extends C2636g<C3038g, C3039h, SubtitleDecoderException> implements C3035e {
    public C3032b(String str) {
        super(new C3038g[2], new C3039h[2]);
        mo18425u(1024);
    }

    /* renamed from: A */
    public final void mo19611A(C3039h hVar) {
        super.mo18422r(hVar);
    }

    /* renamed from: a */
    public void mo19612a(long j) {
    }

    /* renamed from: v */
    public final C3038g mo18411g() {
        return new C3038g();
    }

    /* renamed from: w */
    public final C3039h mo18412h() {
        return new C3033c(this);
    }

    /* renamed from: x */
    public final SubtitleDecoderException mo18413i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    /* renamed from: y */
    public abstract C3034d mo19616y(byte[] bArr, int i, boolean z);

    /* renamed from: z */
    public final SubtitleDecoderException mo18414j(C3038g gVar, C3039h hVar, boolean z) {
        try {
            ByteBuffer byteBuffer = gVar.f3307m;
            C3039h hVar2 = hVar;
            hVar2.mo19624t(gVar.f3308n, mo19616y(byteBuffer.array(), byteBuffer.limit(), z), gVar.f5340p);
            hVar.mo18387j(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }
}
