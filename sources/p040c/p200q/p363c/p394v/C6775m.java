package p040c.p200q.p363c.p394v;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: c.q.c.v.m */
/* compiled from: RandomFidGenerator */
public class C6775m {

    /* renamed from: a */
    public static final byte f12944a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f12945b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m19169b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m19170c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @NonNull
    /* renamed from: a */
    public String mo31480a() {
        byte[] c = m19170c(UUID.randomUUID(), new byte[17]);
        c[16] = c[0];
        c[0] = (byte) ((f12945b & c[0]) | f12944a);
        return m19169b(c);
    }
}
