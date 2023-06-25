package p553f.p554a.p570e.p571a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.nio.ByteBuffer;

/* renamed from: f.a.e.a.c */
/* compiled from: BinaryMessenger */
public interface C9003c {

    /* renamed from: f.a.e.a.c$a */
    /* compiled from: BinaryMessenger */
    public interface C9004a {
        @UiThread
        /* renamed from: a */
        void mo46443a(@Nullable ByteBuffer byteBuffer, @NonNull C9005b bVar);
    }

    /* renamed from: f.a.e.a.c$b */
    /* compiled from: BinaryMessenger */
    public interface C9005b {
        @UiThread
        /* renamed from: a */
        void mo46450a(@Nullable ByteBuffer byteBuffer);
    }

    @UiThread
    /* renamed from: a */
    void mo46433a(@NonNull String str, @Nullable ByteBuffer byteBuffer, @Nullable C9005b bVar);

    @UiThread
    /* renamed from: b */
    void mo46434b(@NonNull String str, @Nullable C9004a aVar);

    @UiThread
    /* renamed from: d */
    void mo46435d(@NonNull String str, @Nullable ByteBuffer byteBuffer);
}
