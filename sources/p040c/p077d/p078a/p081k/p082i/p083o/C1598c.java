package p040c.p077d.p078a.p081k.p082i.p083o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p040c.p077d.p078a.C1541c;
import p040c.p077d.p078a.p081k.p082i.C1578d;
import p040c.p077d.p078a.p081k.p082i.C1585g;

/* renamed from: c.d.a.k.i.o.c */
/* compiled from: ThumbFetcher */
public class C1598c implements C1578d<InputStream> {

    /* renamed from: e */
    public final Uri f949e;

    /* renamed from: l */
    public final C1602e f950l;

    /* renamed from: m */
    public InputStream f951m;

    /* renamed from: c.d.a.k.i.o.c$a */
    /* compiled from: ThumbFetcher */
    public static class C1599a implements C1601d {

        /* renamed from: b */
        public static final String[] f952b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f953a;

        public C1599a(ContentResolver contentResolver) {
            this.f953a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo15676a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f953a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f952b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: c.d.a.k.i.o.c$b */
    /* compiled from: ThumbFetcher */
    public static class C1600b implements C1601d {

        /* renamed from: b */
        public static final String[] f954b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f955a;

        public C1600b(ContentResolver contentResolver) {
            this.f955a = contentResolver;
        }

        /* renamed from: a */
        public Cursor mo15676a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f955a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f954b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    @VisibleForTesting
    public C1598c(Uri uri, C1602e eVar) {
        this.f949e = uri;
        this.f950l = eVar;
    }

    /* renamed from: d */
    public static C1598c m1377d(Context context, Uri uri, C1601d dVar) {
        return new C1598c(uri, new C1602e(C1541c.m1093d(context).mo15455k().mo21644g(), dVar, C1541c.m1093d(context).mo15450f(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C1598c m1378f(Context context, Uri uri) {
        return m1377d(context, uri, new C1599a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C1598c m1379g(Context context, Uri uri) {
        return m1377d(context, uri, new C1600b(context.getContentResolver()));
    }

    @NonNull
    /* renamed from: a */
    public Class<InputStream> mo15624a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo15629b() {
        InputStream inputStream = this.f951m;
        if (inputStream != null) {
            try {
                inputStream.close();
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
    public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super InputStream> aVar) {
        try {
            InputStream h = mo15675h();
            this.f951m = h;
            aVar.mo15644f(h);
        } catch (FileNotFoundException e) {
            boolean isLoggable = Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.mo15643d(e);
        }
    }

    /* renamed from: h */
    public final InputStream mo15675h() {
        InputStream d = this.f950l.mo15680d(this.f949e);
        int a = d != null ? this.f950l.mo15677a(this.f949e) : -1;
        return a != -1 ? new C1585g(d, a) : d;
    }
}
