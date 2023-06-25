package p040c.p200q.p363c.p370n.p371h.p374j;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: c.q.c.n.h.j.m */
/* compiled from: CLSUUID */
public class C6512m {

    /* renamed from: a */
    public static final AtomicLong f12231a = new AtomicLong(0);

    /* renamed from: b */
    public static String f12232b;

    public C6512m(C6549z zVar) {
        byte[] bArr = new byte[10];
        mo30696e(bArr);
        mo30695d(bArr);
        mo30694c(bArr);
        String B = C6513n.m18221B(zVar.mo30654a());
        String v = C6513n.m18244v(bArr);
        f12232b = String.format(Locale.US, "%s%s%s%s", new Object[]{v.substring(0, 12), v.substring(12, 16), v.subSequence(16, 20), B.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    public static byte[] m18215a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    public static byte[] m18216b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    public final void mo30694c(byte[] bArr) {
        byte[] b = m18216b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: d */
    public final void mo30695d(byte[] bArr) {
        byte[] b = m18216b(f12231a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: e */
    public final void mo30696e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a = m18215a(time / 1000);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m18216b(time % 1000);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f12232b;
    }
}
