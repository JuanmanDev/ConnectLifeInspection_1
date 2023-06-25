package p040c.p077d.p078a.p080j;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* renamed from: c.d.a.j.a */
/* compiled from: GifDecoder */
public interface C1559a {

    /* renamed from: c.d.a.j.a$a */
    /* compiled from: GifDecoder */
    public interface C1560a {
        @NonNull
        /* renamed from: a */
        Bitmap mo15567a(int i, int i2, @NonNull Bitmap.Config config);

        @NonNull
        /* renamed from: b */
        int[] mo15568b(int i);

        /* renamed from: c */
        void mo15569c(@NonNull Bitmap bitmap);

        /* renamed from: d */
        void mo15570d(@NonNull byte[] bArr);

        @NonNull
        /* renamed from: e */
        byte[] mo15571e(int i);

        /* renamed from: f */
        void mo15572f(@NonNull int[] iArr);
    }

    @Nullable
    /* renamed from: a */
    Bitmap mo15557a();

    /* renamed from: b */
    void mo15558b();

    /* renamed from: c */
    int mo15559c();

    void clear();

    /* renamed from: d */
    int mo15561d();

    /* renamed from: e */
    void mo15562e(@NonNull Bitmap.Config config);

    /* renamed from: f */
    void mo15563f();

    /* renamed from: g */
    int mo15564g();

    @NonNull
    ByteBuffer getData();

    /* renamed from: h */
    int mo15566h();
}
