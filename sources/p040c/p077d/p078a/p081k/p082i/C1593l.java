package p040c.p077d.p078a.p081k.p082i;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import p040c.p077d.p078a.p081k.p082i.C1578d;

/* renamed from: c.d.a.k.i.l */
/* compiled from: LocalUriFetcher */
public abstract class C1593l<T> implements C1578d<T> {

    /* renamed from: e */
    public final Uri f945e;

    /* renamed from: l */
    public final ContentResolver f946l;

    /* renamed from: m */
    public T f947m;

    public C1593l(ContentResolver contentResolver, Uri uri) {
        this.f946l = contentResolver;
        this.f945e = uri;
    }

    /* renamed from: b */
    public void mo15629b() {
        T t = this.f947m;
        if (t != null) {
            try {
                mo15625d(t);
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

    /* renamed from: d */
    public abstract void mo15625d(T t);

    /* renamed from: e */
    public final void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super T> aVar) {
        try {
            T f = mo15626f(this.f945e, this.f946l);
            this.f947m = f;
            aVar.mo15644f(f);
        } catch (FileNotFoundException e) {
            boolean isLoggable = Log.isLoggable("LocalUriFetcher", 3);
            aVar.mo15643d(e);
        }
    }

    /* renamed from: f */
    public abstract T mo15626f(Uri uri, ContentResolver contentResolver);
}
