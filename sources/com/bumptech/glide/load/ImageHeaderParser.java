package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;

public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        public final boolean hasAlpha;

        /* access modifiers changed from: public */
        ImageType(boolean z) {
            this.hasAlpha = z;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    @NonNull
    /* renamed from: a */
    ImageType mo16077a(@NonNull ByteBuffer byteBuffer);

    @NonNull
    /* renamed from: b */
    ImageType mo16078b(@NonNull InputStream inputStream);

    /* renamed from: c */
    int mo16079c(@NonNull InputStream inputStream, @NonNull C1692b bVar);
}
