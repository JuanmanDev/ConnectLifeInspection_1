package p040c.p077d.p078a.p081k.p089k;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p082i.p083o.C1597b;
import p040c.p077d.p078a.p081k.p089k.C1756n;
import p040c.p077d.p078a.p104p.C1936c;

/* renamed from: c.d.a.k.k.k */
/* compiled from: MediaStoreFileLoader */
public final class C1749k implements C1756n<Uri, File> {

    /* renamed from: a */
    public final Context f1298a;

    /* renamed from: c.d.a.k.k.k$a */
    /* compiled from: MediaStoreFileLoader */
    public static final class C1750a implements C1758o<Uri, File> {

        /* renamed from: a */
        public final Context f1299a;

        public C1750a(Context context) {
            this.f1299a = context;
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Uri, File> mo15978b(C1764r rVar) {
            return new C1749k(this.f1299a);
        }
    }

    /* renamed from: c.d.a.k.k.k$b */
    /* compiled from: MediaStoreFileLoader */
    public static class C1751b implements C1578d<File> {

        /* renamed from: m */
        public static final String[] f1300m = {"_data"};

        /* renamed from: e */
        public final Context f1301e;

        /* renamed from: l */
        public final Uri f1302l;

        public C1751b(Context context, Uri uri) {
            this.f1301e = context;
            this.f1302l = uri;
        }

        @NonNull
        /* renamed from: a */
        public Class<File> mo15624a() {
            return File.class;
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
        public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super File> aVar) {
            Cursor query = this.f1301e.getContentResolver().query(this.f1302l, f1300m, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.mo15643d(new FileNotFoundException("Failed to find file path for: " + this.f1302l));
                return;
            }
            aVar.mo15644f(new File(str));
        }
    }

    public C1749k(Context context) {
        this.f1298a = context;
    }

    /* renamed from: c */
    public C1756n.C1757a<File> mo15974b(@NonNull Uri uri, int i, int i2, @NonNull C1571e eVar) {
        return new C1756n.C1757a<>(new C1936c(uri), new C1751b(this.f1298a, uri));
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull Uri uri) {
        return C1597b.m1373b(uri);
    }
}
