package p040c.p200q.p201a.p264c.p294g.p333g;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.stetho.dumpapp.Framer;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.g.sj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4776sj {

    /* renamed from: a */
    public static final byte[][] f9617a = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, ExifInterface.MARKER_SOS, 9, -115, -21, -100, Framer.STDERR_FRAME_PREFIX, -79, -3, -122, 98, 5, 22, Framer.STDIN_REQUEST_FRAME_PREFIX, 73, -72, 0}, new byte[]{Framer.STDIN_REQUEST_FRAME_PREFIX, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, ExifInterface.MARKER_SOI, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ByteCompanionObject.MAX_VALUE}};

    /* renamed from: b */
    public static final /* synthetic */ int f9618b = 0;

    /* renamed from: a */
    public static void m13083a(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            int i5 = (((int) jArr2[i3]) ^ i4) & i2;
            jArr[i3] = (long) (i4 ^ i5);
            jArr2[i3] = (long) (((int) jArr2[i3]) ^ i5);
        }
    }
}
