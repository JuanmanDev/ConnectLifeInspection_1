package p040c.p077d.p078a.p081k.p082i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* renamed from: c.d.a.k.i.d */
/* compiled from: DataFetcher */
public interface C1578d<T> {

    /* renamed from: c.d.a.k.i.d$a */
    /* compiled from: DataFetcher */
    public interface C1579a<T> {
        /* renamed from: d */
        void mo15643d(@NonNull Exception exc);

        /* renamed from: f */
        void mo15644f(@Nullable T t);
    }

    @NonNull
    /* renamed from: a */
    Class<T> mo15624a();

    /* renamed from: b */
    void mo15629b();

    @NonNull
    /* renamed from: c */
    DataSource mo15630c();

    void cancel();

    /* renamed from: e */
    void mo15633e(@NonNull Priority priority, @NonNull C1579a<? super T> aVar);
}
