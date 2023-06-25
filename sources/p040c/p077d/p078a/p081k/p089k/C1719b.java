package p040c.p077d.p078a.p081k.p089k;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.b */
/* compiled from: ByteArrayLoader */
public class C1719b<Data> implements C1756n<byte[], Data> {

    /* renamed from: a */
    public final C1722b<Data> f1270a;

    /* renamed from: c.d.a.k.k.b$a */
    /* compiled from: ByteArrayLoader */
    public static class C1720a implements C1758o<byte[], ByteBuffer> {

        /* renamed from: c.d.a.k.k.b$a$a */
        /* compiled from: ByteArrayLoader */
        public class C1721a implements C1722b<ByteBuffer> {
            public C1721a(C1720a aVar) {
            }

            /* renamed from: a */
            public Class<ByteBuffer> mo15981a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer mo15982b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @NonNull
        /* renamed from: b */
        public C1756n<byte[], ByteBuffer> mo15978b(@NonNull C1764r rVar) {
            return new C1719b(new C1721a(this));
        }
    }

    /* renamed from: c.d.a.k.k.b$b */
    /* compiled from: ByteArrayLoader */
    public interface C1722b<Data> {
        /* renamed from: a */
        Class<Data> mo15981a();

        /* renamed from: b */
        Data mo15982b(byte[] bArr);
    }

    /* renamed from: c.d.a.k.k.b$c */
    /* compiled from: ByteArrayLoader */
    public static class C1723c<Data> implements C1578d<Data> {

        /* renamed from: e */
        public final byte[] f1271e;

        /* renamed from: l */
        public final C1722b<Data> f1272l;

        public C1723c(byte[] bArr, C1722b<Data> bVar) {
            this.f1271e = bArr;
            this.f1272l = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo15624a() {
            return this.f1272l.mo15981a();
        }

        /* renamed from: b */
        public void mo15629b() {
        }

        @NonNull
        /* renamed from: c */
        public DataSource mo15630c() {
            return DataSource.LOCAL;
        }

        public void cancel() {
        }

        /* renamed from: e */
        public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super Data> aVar) {
            aVar.mo15644f(this.f1272l.mo15982b(this.f1271e));
        }
    }

    /* renamed from: c.d.a.k.k.b$d */
    /* compiled from: ByteArrayLoader */
    public static class C1724d implements C1758o<byte[], InputStream> {

        /* renamed from: c.d.a.k.k.b$d$a */
        /* compiled from: ByteArrayLoader */
        public class C1725a implements C1722b<InputStream> {
            public C1725a(C1724d dVar) {
            }

            /* renamed from: a */
            public Class<InputStream> mo15981a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream mo15982b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @NonNull
        /* renamed from: b */
        public C1756n<byte[], InputStream> mo15978b(@NonNull C1764r rVar) {
            return new C1719b(new C1725a(this));
        }
    }

    public C1719b(C1722b<Data> bVar) {
        this.f1270a = bVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<Data> mo15974b(@NonNull byte[] bArr, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(bArr), new C1723c(bArr, this.f1270a));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull byte[] bArr) {
        return true;
    }
}
