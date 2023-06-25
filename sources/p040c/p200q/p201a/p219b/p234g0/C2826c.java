package p040c.p200q.p201a.p219b.p234g0;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;

@TargetApi(16)
/* renamed from: c.q.a.b.g0.c */
/* compiled from: MediaFormatUtil */
public final class C2826c {
    /* renamed from: a */
    public static void m6028a(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m6029b(MediaFormat mediaFormat, @Nullable ColorInfo colorInfo) {
        if (colorInfo != null) {
            m6031d(mediaFormat, "color-transfer", colorInfo.f7955m);
            m6031d(mediaFormat, "color-standard", colorInfo.f7953e);
            m6031d(mediaFormat, "color-range", colorInfo.f7954l);
            m6028a(mediaFormat, "hdr-static-info", colorInfo.f7956n);
        }
    }

    /* renamed from: c */
    public static void m6030c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m6031d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m6032e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
