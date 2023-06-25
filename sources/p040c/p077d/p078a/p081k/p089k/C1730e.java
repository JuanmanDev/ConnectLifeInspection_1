package p040c.p077d.p078a.p081k.p089k;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.e */
/* compiled from: DataUrlLoader */
public final class C1730e<Model, Data> implements C1756n<Model, Data> {

    /* renamed from: a */
    public final C1731a<Data> f1274a;

    /* renamed from: c.d.a.k.k.e$a */
    /* compiled from: DataUrlLoader */
    public interface C1731a<Data> {
        /* renamed from: a */
        Class<Data> mo15988a();

        /* renamed from: b */
        void mo15989b(Data data);

        /* renamed from: c */
        Data mo15990c(String str);
    }

    /* renamed from: c.d.a.k.k.e$b */
    /* compiled from: DataUrlLoader */
    public static final class C1732b<Data> implements C1578d<Data> {

        /* renamed from: e */
        public final String f1275e;

        /* renamed from: l */
        public final C1731a<Data> f1276l;

        /* renamed from: m */
        public Data f1277m;

        public C1732b(String str, C1731a<Data> aVar) {
            this.f1275e = str;
            this.f1276l = aVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo15624a() {
            return this.f1276l.mo15988a();
        }

        /* renamed from: b */
        public void mo15629b() {
            try {
                this.f1276l.mo15989b(this.f1277m);
            } catch (IOException unused) {
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
                Data c = this.f1276l.mo15990c(this.f1275e);
                this.f1277m = c;
                aVar.mo15644f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo15643d(e);
            }
        }
    }

    /* renamed from: c.d.a.k.k.e$c */
    /* compiled from: DataUrlLoader */
    public static final class C1733c<Model> implements C1758o<Model, InputStream> {

        /* renamed from: a */
        public final C1731a<InputStream> f1278a = new C1734a(this);

        /* renamed from: c.d.a.k.k.e$c$a */
        /* compiled from: DataUrlLoader */
        public class C1734a implements C1731a<InputStream> {
            public C1734a(C1733c cVar) {
            }

            /* renamed from: a */
            public Class<InputStream> mo15988a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo15989b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo15990c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Model, InputStream> mo15978b(@NonNull C1764r rVar) {
            return new C1730e(this.f1278a);
        }
    }

    public C1730e(C1731a<Data> aVar) {
        this.f1274a = aVar;
    }

    /* renamed from: a */
    public boolean mo15973a(@NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: b */
    public C1756n.C1757a<Data> mo15974b(@NonNull Model model, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(model), new C1732b(model.toString(), this.f1274a));
    }
}
