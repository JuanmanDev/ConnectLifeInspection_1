package p040c.p077d.p078a.p081k.p089k;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import net.sqlcipher.database.SQLiteDatabase;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.f */
/* compiled from: FileLoader */
public class C1735f<Data> implements C1756n<File, Data> {

    /* renamed from: a */
    public final C1740d<Data> f1279a;

    /* renamed from: c.d.a.k.k.f$a */
    /* compiled from: FileLoader */
    public static class C1736a<Data> implements C1758o<File, Data> {

        /* renamed from: a */
        public final C1740d<Data> f1280a;

        public C1736a(C1740d<Data> dVar) {
            this.f1280a = dVar;
        }

        @NonNull
        /* renamed from: b */
        public final C1756n<File, Data> mo15978b(@NonNull C1764r rVar) {
            return new C1735f(this.f1280a);
        }
    }

    /* renamed from: c.d.a.k.k.f$b */
    /* compiled from: FileLoader */
    public static class C1737b extends C1736a<ParcelFileDescriptor> {

        /* renamed from: c.d.a.k.k.f$b$a */
        /* compiled from: FileLoader */
        public class C1738a implements C1740d<ParcelFileDescriptor> {
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo15995a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void mo15996b(ParcelFileDescriptor parcelFileDescriptor) {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor mo15997c(File file) {
                return ParcelFileDescriptor.open(file, SQLiteDatabase.CREATE_IF_NECESSARY);
            }
        }

        public C1737b() {
            super(new C1738a());
        }
    }

    /* renamed from: c.d.a.k.k.f$c */
    /* compiled from: FileLoader */
    public static final class C1739c<Data> implements C1578d<Data> {

        /* renamed from: e */
        public final File f1281e;

        /* renamed from: l */
        public final C1740d<Data> f1282l;

        /* renamed from: m */
        public Data f1283m;

        public C1739c(File file, C1740d<Data> dVar) {
            this.f1281e = file;
            this.f1282l = dVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo15624a() {
            return this.f1282l.mo15995a();
        }

        /* renamed from: b */
        public void mo15629b() {
            Data data = this.f1283m;
            if (data != null) {
                try {
                    this.f1282l.mo15996b(data);
                } catch (IOException unused) {
                }
            }
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
            try {
                Data c = this.f1282l.mo15997c(this.f1281e);
                this.f1283m = c;
                aVar.mo15644f(c);
            } catch (FileNotFoundException e) {
                boolean isLoggable = Log.isLoggable("FileLoader", 3);
                aVar.mo15643d(e);
            }
        }
    }

    /* renamed from: c.d.a.k.k.f$d */
    /* compiled from: FileLoader */
    public interface C1740d<Data> {
        /* renamed from: a */
        Class<Data> mo15995a();

        /* renamed from: b */
        void mo15996b(Data data);

        /* renamed from: c */
        Data mo15997c(File file);
    }

    /* renamed from: c.d.a.k.k.f$e */
    /* compiled from: FileLoader */
    public static class C1741e extends C1736a<InputStream> {

        /* renamed from: c.d.a.k.k.f$e$a */
        /* compiled from: FileLoader */
        public class C1742a implements C1740d<InputStream> {
            /* renamed from: a */
            public Class<InputStream> mo15995a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo15996b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo15997c(File file) {
                return new FileInputStream(file);
            }
        }

        public C1741e() {
            super(new C1742a());
        }
    }

    public C1735f(C1740d<Data> dVar) {
        this.f1279a = dVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<Data> mo15974b(@NonNull File file, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(file), new C1739c(file, this.f1279a));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull File file) {
        return true;
    }
}
