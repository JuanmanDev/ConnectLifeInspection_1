package p040c.p077d.p078a.p081k.p091l.p092c;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p105q.C1949i;

/* renamed from: c.d.a.k.l.c.j */
/* compiled from: DefaultImageHeaderParser */
public final class C1809j implements ImageHeaderParser {

    /* renamed from: a */
    public static final byte[] f1376a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    public static final int[] f1377b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: c.d.a.k.l.c.j$a */
    /* compiled from: DefaultImageHeaderParser */
    public static final class C1810a implements C1812c {

        /* renamed from: a */
        public final ByteBuffer f1378a;

        public C1810a(ByteBuffer byteBuffer) {
            this.f1378a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo16085a() {
            return ((mo16088d() << 8) & 65280) | (mo16088d() & 255);
        }

        /* renamed from: b */
        public int mo16086b(byte[] bArr, int i) {
            int min = Math.min(i, this.f1378a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f1378a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public short mo16087c() {
            return (short) (mo16088d() & 255);
        }

        /* renamed from: d */
        public int mo16088d() {
            if (this.f1378a.remaining() < 1) {
                return -1;
            }
            return this.f1378a.get();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f1378a.remaining(), j);
            ByteBuffer byteBuffer = this.f1378a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: c.d.a.k.l.c.j$b */
    /* compiled from: DefaultImageHeaderParser */
    public static final class C1811b {

        /* renamed from: a */
        public final ByteBuffer f1379a;

        public C1811b(byte[] bArr, int i) {
            this.f1379a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short mo16090a(int i) {
            if (mo16092c(i, 2)) {
                return this.f1379a.getShort(i);
            }
            return -1;
        }

        /* renamed from: b */
        public int mo16091b(int i) {
            if (mo16092c(i, 4)) {
                return this.f1379a.getInt(i);
            }
            return -1;
        }

        /* renamed from: c */
        public final boolean mo16092c(int i, int i2) {
            return this.f1379a.remaining() - i >= i2;
        }

        /* renamed from: d */
        public int mo16093d() {
            return this.f1379a.remaining();
        }

        /* renamed from: e */
        public void mo16094e(ByteOrder byteOrder) {
            this.f1379a.order(byteOrder);
        }
    }

    /* renamed from: c.d.a.k.l.c.j$c */
    /* compiled from: DefaultImageHeaderParser */
    public interface C1812c {
        /* renamed from: a */
        int mo16085a();

        /* renamed from: b */
        int mo16086b(byte[] bArr, int i);

        /* renamed from: c */
        short mo16087c();

        /* renamed from: d */
        int mo16088d();

        long skip(long j);
    }

    /* renamed from: c.d.a.k.l.c.j$d */
    /* compiled from: DefaultImageHeaderParser */
    public static final class C1813d implements C1812c {

        /* renamed from: a */
        public final InputStream f1380a;

        public C1813d(InputStream inputStream) {
            this.f1380a = inputStream;
        }

        /* renamed from: a */
        public int mo16085a() {
            return ((this.f1380a.read() << 8) & 65280) | (this.f1380a.read() & 255);
        }

        /* renamed from: b */
        public int mo16086b(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f1380a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: c */
        public short mo16087c() {
            return (short) (this.f1380a.read() & 255);
        }

        /* renamed from: d */
        public int mo16088d() {
            return this.f1380a.read();
        }

        public long skip(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f1380a.skip(j2);
                if (skip <= 0) {
                    if (this.f1380a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: d */
    public static int m2002d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: g */
    public static boolean m2003g(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: j */
    public static int m2004j(C1811b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo16090a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                "Unknown endianness = " + a;
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo16094e(byteOrder);
        int b = bVar.mo16091b(10) + 6;
        short a2 = bVar.mo16090a(b);
        for (int i = 0; i < a2; i++) {
            int d = m2002d(b, i);
            short a3 = bVar.mo16090a(d);
            if (a3 == 274) {
                short a4 = bVar.mo16090a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo16091b(d + 4);
                    if (b2 < 0) {
                        boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            "Got tagIndex=" + i + " tagType=" + a3 + " formatCode=" + a4 + " componentCount=" + b2;
                        }
                        int i2 = b2 + f1377b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo16093d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    "Illegal tagValueOffset=" + i3 + " tagType=" + a3;
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo16093d()) {
                                return bVar.mo16090a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    "Illegal number of bytes for TI tag data tagType=" + a3;
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            "Got byte count > 4, not orientation, continuing, formatCode=" + a4;
                        }
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    "Got invalid format code = " + a4;
                }
            }
        }
        return -1;
    }

    @NonNull
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo16077a(@NonNull ByteBuffer byteBuffer) {
        C1949i.m2563d(byteBuffer);
        return mo16081f(new C1810a(byteBuffer));
    }

    @NonNull
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo16078b(@NonNull InputStream inputStream) {
        C1949i.m2563d(inputStream);
        return mo16081f(new C1813d(inputStream));
    }

    /* renamed from: c */
    public int mo16079c(@NonNull InputStream inputStream, @NonNull C1692b bVar) {
        C1949i.m2563d(inputStream);
        C1813d dVar = new C1813d(inputStream);
        C1949i.m2563d(bVar);
        return mo16080e(dVar, bVar);
    }

    /* renamed from: e */
    public final int mo16080e(C1812c cVar, C1692b bVar) {
        int a = cVar.mo16085a();
        if (!m2003g(a)) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                "Parser doesn't handle magic number: " + a;
            }
            return -1;
        }
        int i = mo16083i(cVar);
        if (i == -1) {
            boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr = (byte[]) bVar.mo15901d(i, byte[].class);
        try {
            return mo16084k(cVar, bArr, i);
        } finally {
            bVar.put(bArr);
        }
    }

    @NonNull
    /* renamed from: f */
    public final ImageHeaderParser.ImageType mo16081f(C1812c cVar) {
        int a = cVar.mo16085a();
        if (a == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int a2 = ((a << 16) & SupportMenu.CATEGORY_MASK) | (cVar.mo16085a() & 65535);
        if (a2 == -1991225785) {
            cVar.skip(21);
            return cVar.mo16088d() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        } else if ((a2 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        } else {
            if (a2 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            cVar.skip(4);
            if ((((cVar.mo16085a() << 16) & SupportMenu.CATEGORY_MASK) | (cVar.mo16085a() & 65535)) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int a3 = ((cVar.mo16085a() << 16) & SupportMenu.CATEGORY_MASK) | (cVar.mo16085a() & 65535);
            if ((a3 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = a3 & 255;
            if (i == 88) {
                cVar.skip(4);
                return (cVar.mo16088d() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            } else if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                cVar.skip(4);
                return (cVar.mo16088d() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
        }
    }

    /* renamed from: h */
    public final boolean mo16082h(byte[] bArr, int i) {
        boolean z = bArr != null && i > f1376a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f1376a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    public final int mo16083i(C1812c cVar) {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = cVar.mo16087c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    "Unknown segmentId=" + c2;
                }
                return -1;
            }
            c = cVar.mo16087c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            a = cVar.mo16085a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = cVar.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            "Unable to skip enough data, type: " + c + ", wanted to skip: " + a + ", but actually skipped: " + skip;
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo16084k(C1812c cVar, byte[] bArr, int i) {
        int b = cVar.mo16086b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                "Unable to read exif segment data, length: " + i + ", actually read: " + b;
            }
            return -1;
        } else if (mo16082h(bArr, i)) {
            return m2004j(new C1811b(bArr, i));
        } else {
            boolean isLoggable = Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
    }
}
