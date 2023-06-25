package p040c.p077d.p078a.p081k.p091l.p093d;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import p040c.p077d.p078a.p081k.p082i.C1580e;

/* renamed from: c.d.a.k.l.d.a */
/* compiled from: ByteBufferRewinder */
public class C1841a implements C1580e<ByteBuffer> {

    /* renamed from: a */
    public final ByteBuffer f1431a;

    /* renamed from: c.d.a.k.l.d.a$a */
    /* compiled from: ByteBufferRewinder */
    public static class C1842a implements C1580e.C1581a<ByteBuffer> {
        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo15647a() {
            return ByteBuffer.class;
        }

        @NonNull
        /* renamed from: c */
        public C1580e<ByteBuffer> mo15648b(ByteBuffer byteBuffer) {
            return new C1841a(byteBuffer);
        }
    }

    public C1841a(ByteBuffer byteBuffer) {
        this.f1431a = byteBuffer;
    }

    /* renamed from: b */
    public void mo15646b() {
    }

    @NonNull
    /* renamed from: c */
    public ByteBuffer mo15645a() {
        this.f1431a.position(0);
        return this.f1431a;
    }
}
