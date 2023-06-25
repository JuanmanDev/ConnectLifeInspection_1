package p040c.p077d.p078a.p081k.p089k;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;
import p040c.p077d.p078a.p105q.C1937a;

/* renamed from: c.d.a.k.k.d */
/* compiled from: ByteBufferFileLoader */
public class C1727d implements C1756n<File, ByteBuffer> {

    /* renamed from: c.d.a.k.k.d$a */
    /* compiled from: ByteBufferFileLoader */
    public static final class C1728a implements C1578d<ByteBuffer> {

        /* renamed from: e */
        public final File f1273e;

        public C1728a(File file) {
            this.f1273e = file;
        }

        @NonNull
        /* renamed from: a */
        public Class<ByteBuffer> mo15624a() {
            return ByteBuffer.class;
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
        public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super ByteBuffer> aVar) {
            try {
                aVar.mo15644f(C1937a.m2533a(this.f1273e));
            } catch (IOException e) {
                boolean isLoggable = Log.isLoggable("ByteBufferFileLoader", 3);
                aVar.mo15643d(e);
            }
        }
    }

    /* renamed from: c.d.a.k.k.d$b */
    /* compiled from: ByteBufferFileLoader */
    public static class C1729b implements C1758o<File, ByteBuffer> {
        @NonNull
        /* renamed from: b */
        public C1756n<File, ByteBuffer> mo15978b(@NonNull C1764r rVar) {
            return new C1727d();
        }
    }

    /* renamed from: c */
    public C1756n.C1757a<ByteBuffer> mo15974b(@NonNull File file, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(file), new C1728a(file));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull File file) {
        return true;
    }
}
