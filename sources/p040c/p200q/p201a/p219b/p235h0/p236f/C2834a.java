package p040c.p200q.p201a.p219b.p235h0.p236f;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p235h0.C2828a;
import p040c.p200q.p201a.p219b.p235h0.C2831c;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.h0.f.a */
/* compiled from: EventMessageDecoder */
public final class C2834a implements C2828a {
    /* renamed from: a */
    public Metadata mo18898a(C2831c cVar) {
        ByteBuffer byteBuffer = cVar.f3307m;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C3173t tVar = new C3173t(array, limit);
        String s = tVar.mo20026s();
        C3151e.m7757e(s);
        String str = s;
        String s2 = tVar.mo20026s();
        C3151e.m7757e(s2);
        String str2 = s2;
        long A = tVar.mo19995A();
        long A2 = tVar.mo19995A();
        if (A2 != 0) {
            C3163m.m7880f("EventMessageDecoder", "Ignoring non-zero presentation_time_delta: " + A2);
        }
        return new Metadata(new EventMessage(str, str2, C3152e0.m7792c0(tVar.mo19995A(), 1000, A), tVar.mo19995A(), Arrays.copyOfRange(array, tVar.mo20010c(), limit)));
    }
}
