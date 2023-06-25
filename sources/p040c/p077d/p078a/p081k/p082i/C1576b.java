package p040c.p077d.p078a.p081k.p082i;

import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import p040c.p077d.p078a.p081k.p082i.C1578d;

/* renamed from: c.d.a.k.i.b */
/* compiled from: AssetPathFetcher */
public abstract class C1576b<T> implements C1578d<T> {

    /* renamed from: e */
    public final String f921e;

    /* renamed from: l */
    public final AssetManager f922l;

    /* renamed from: m */
    public T f923m;

    public C1576b(AssetManager assetManager, String str) {
        this.f922l = assetManager;
        this.f921e = str;
    }

    /* renamed from: b */
    public void mo15629b() {
        T t = this.f923m;
        if (t != null) {
            try {
                mo15632d(t);
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
    public abstract void mo15632d(T t);

    /* renamed from: e */
    public void mo15633e(@NonNull Priority priority, @NonNull C1578d.C1579a<? super T> aVar) {
        try {
            T f = mo15634f(this.f922l, this.f921e);
            this.f923m = f;
            aVar.mo15644f(f);
        } catch (IOException e) {
            boolean isLoggable = Log.isLoggable("AssetPathFetcher", 3);
            aVar.mo15643d(e);
        }
    }

    /* renamed from: f */
    public abstract T mo15634f(AssetManager assetManager, String str);
}
