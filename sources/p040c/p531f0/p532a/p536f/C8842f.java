package p040c.p531f0.p532a.p536f;

import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: c.f0.a.f.f */
/* compiled from: ImageHeaderParser */
public class C8842f {

    /* renamed from: b */
    public static final byte[] f17196b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    public static final int[] f17197c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    public final C8844b f17198a;

    /* renamed from: c.f0.a.f.f$a */
    /* compiled from: ImageHeaderParser */
    public static class C8843a {

        /* renamed from: a */
        public final ByteBuffer f17199a;

        public C8843a(byte[] bArr, int i) {
            this.f17199a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short mo46026a(int i) {
            return this.f17199a.getShort(i);
        }

        /* renamed from: b */
        public int mo46027b(int i) {
            return this.f17199a.getInt(i);
        }

        /* renamed from: c */
        public int mo46028c() {
            return this.f17199a.remaining();
        }

        /* renamed from: d */
        public void mo46029d(ByteOrder byteOrder) {
            this.f17199a.order(byteOrder);
        }
    }

    /* renamed from: c.f0.a.f.f$b */
    /* compiled from: ImageHeaderParser */
    public interface C8844b {
        /* renamed from: a */
        int mo46030a();

        /* renamed from: b */
        int mo46031b(byte[] bArr, int i);

        /* renamed from: c */
        short mo46032c();

        long skip(long j);
    }

    /* renamed from: c.f0.a.f.f$c */
    /* compiled from: ImageHeaderParser */
    public static class C8845c implements C8844b {

        /* renamed from: a */
        public final InputStream f17200a;

        public C8845c(InputStream inputStream) {
            this.f17200a = inputStream;
        }

        /* renamed from: a */
        public int mo46030a() {
            return ((this.f17200a.read() << 8) & 65280) | (this.f17200a.read() & 255);
        }

        /* renamed from: b */
        public int mo46031b(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f17200a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        /* renamed from: c */
        public short mo46032c() {
            return (short) (this.f17200a.read() & 255);
        }

        public long skip(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f17200a.skip(j2);
                if (skip <= 0) {
                    if (this.f17200a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    public C8842f(InputStream inputStream) {
        this.f17198a = new C8845c(inputStream);
    }

    /* renamed from: a */
    public static int m23805a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: b */
    public static void m23806b(ExifInterface exifInterface, int i, int i2, String str) {
        String[] strArr = {ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_DATETIME, ExifInterface.TAG_DATETIME_DIGITIZED, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_FLASH, ExifInterface.TAG_FOCAL_LENGTH, ExifInterface.TAG_GPS_ALTITUDE, ExifInterface.TAG_GPS_ALTITUDE_REF, ExifInterface.TAG_GPS_DATESTAMP, ExifInterface.TAG_GPS_LATITUDE, ExifInterface.TAG_GPS_LATITUDE_REF, ExifInterface.TAG_GPS_LONGITUDE, ExifInterface.TAG_GPS_LONGITUDE_REF, ExifInterface.TAG_GPS_PROCESSING_METHOD, ExifInterface.TAG_GPS_TIMESTAMP, ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, ExifInterface.TAG_MAKE, ExifInterface.TAG_MODEL, ExifInterface.TAG_SUBSEC_TIME, ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, ExifInterface.TAG_WHITE_BALANCE};
        try {
            ExifInterface exifInterface2 = new ExifInterface(str);
            for (int i3 = 0; i3 < 22; i3++) {
                String str2 = strArr[i3];
                String attribute = exifInterface.getAttribute(str2);
                if (!TextUtils.isEmpty(attribute)) {
                    exifInterface2.setAttribute(str2, attribute);
                }
            }
            exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i));
            exifInterface2.setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i2));
            exifInterface2.setAttribute(ExifInterface.TAG_ORIENTATION, "0");
            exifInterface2.saveAttributes();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    /* renamed from: d */
    public static boolean m23807d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: g */
    public static int m23808g(C8843a aVar) {
        ByteOrder byteOrder;
        short a = aVar.mo46026a(6);
        if (a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                "Unknown endianness = " + a;
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.mo46029d(byteOrder);
        int b = aVar.mo46027b(10) + 6;
        short a2 = aVar.mo46026a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m23805a(b, i);
            short a4 = aVar.mo46026a(a3);
            if (a4 == 274) {
                short a5 = aVar.mo46026a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = aVar.mo46027b(a3 + 4);
                    if (b2 < 0) {
                        boolean isLoggable = Log.isLoggable("ImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            "Got tagIndex=" + i + " tagType=" + a4 + " formatCode=" + a5 + " componentCount=" + b2;
                        }
                        int i2 = b2 + f17197c[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > aVar.mo46028c()) {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    "Illegal tagValueOffset=" + i3 + " tagType=" + a4;
                                }
                            } else if (i2 >= 0 && i2 + i3 <= aVar.mo46028c()) {
                                return aVar.mo46026a(i3);
                            } else {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    "Illegal number of bytes for TI tag data tagType=" + a4;
                                }
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            "Got byte count > 4, not orientation, continuing, formatCode=" + a5;
                        }
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    "Got invalid format code = " + a5;
                }
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int mo46022c() {
        int a = this.f17198a.mo46030a();
        if (!m23807d(a)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                "Parser doesn't handle magic number: " + a;
            }
            return -1;
        }
        int f = mo46024f();
        if (f != -1) {
            return mo46025h(new byte[f], f);
        }
        boolean isLoggable = Log.isLoggable("ImageHeaderParser", 3);
        return -1;
    }

    /* renamed from: e */
    public final boolean mo46023e(byte[] bArr, int i) {
        boolean z = bArr != null && i > f17196b.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f17196b;
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

    /* renamed from: f */
    public final int mo46024f() {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = this.f17198a.mo46032c();
            if (c2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    "Unknown segmentId=" + c2;
                }
                return -1;
            }
            c = this.f17198a.mo46032c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                boolean isLoggable = Log.isLoggable("ImageHeaderParser", 3);
                return -1;
            }
            a = this.f17198a.mo46030a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = this.f17198a.skip(j);
        } while (skip == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            "Unable to skip enough data, type: " + c + ", wanted to skip: " + a + ", but actually skipped: " + skip;
        }
        return -1;
    }

    /* renamed from: h */
    public final int mo46025h(byte[] bArr, int i) {
        int b = this.f17198a.mo46031b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                "Unable to read exif segment data, length: " + i + ", actually read: " + b;
            }
            return -1;
        } else if (mo46023e(bArr, i)) {
            return m23808g(new C8843a(bArr, i));
        } else {
            boolean isLoggable = Log.isLoggable("ImageHeaderParser", 3);
            return -1;
        }
    }
}
