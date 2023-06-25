package p040c.p077d.p078a.p081k.p082i.p083o;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p040c.p077d.p078a.p081k.C1566b;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

/* renamed from: c.d.a.k.i.o.e */
/* compiled from: ThumbnailStreamOpener */
public class C1602e {

    /* renamed from: f */
    public static final C1596a f956f = new C1596a();

    /* renamed from: a */
    public final C1596a f957a;

    /* renamed from: b */
    public final C1601d f958b;

    /* renamed from: c */
    public final C1692b f959c;

    /* renamed from: d */
    public final ContentResolver f960d;

    /* renamed from: e */
    public final List<ImageHeaderParser> f961e;

    public C1602e(List<ImageHeaderParser> list, C1601d dVar, C1692b bVar, ContentResolver contentResolver) {
        this(list, f956f, dVar, bVar, contentResolver);
    }

    /* renamed from: a */
    public int mo15677a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f960d.openInputStream(uri);
            int a = C1566b.m1275a(this.f961e, openInputStream, this.f959c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return a;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                "Failed to open uri: " + uri;
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    @Nullable
    /* renamed from: b */
    public final String mo15678b(@NonNull Uri uri) {
        Cursor a = this.f958b.mo15676a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    return a.getString(0);
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* renamed from: c */
    public final boolean mo15679c(File file) {
        return this.f957a.mo15672a(file) && 0 < this.f957a.mo15674c(file);
    }

    /* renamed from: d */
    public InputStream mo15680d(Uri uri) {
        String b = mo15678b(uri);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        File b2 = this.f957a.mo15673b(b);
        if (!mo15679c(b2)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b2);
        try {
            return this.f960d.openInputStream(fromFile);
        } catch (NullPointerException e) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
        }
    }

    public C1602e(List<ImageHeaderParser> list, C1596a aVar, C1601d dVar, C1692b bVar, ContentResolver contentResolver) {
        this.f957a = aVar;
        this.f958b = dVar;
        this.f959c = bVar;
        this.f960d = contentResolver;
        this.f961e = list;
    }
}
