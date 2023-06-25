package p040c.p077d.p078a.p081k.p089k;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p040c.p077d.p078a.p081k.C1565a;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p105q.C1937a;

/* renamed from: c.d.a.k.k.c */
/* compiled from: ByteBufferEncoder */
public class C1726c implements C1565a<ByteBuffer> {
    /* renamed from: c */
    public boolean mo15605a(@NonNull ByteBuffer byteBuffer, @NonNull File file, @NonNull C1571e eVar) {
        try {
            C1937a.m2536d(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            boolean isLoggable = Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
