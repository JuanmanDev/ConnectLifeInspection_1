package p040c.p200q.p201a.p219b.p224f0.p230w;

import androidx.core.view.DisplayCompat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;
import p040c.p200q.p201a.p219b.p224f0.p230w.C2756i;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.w.h */
/* compiled from: OpusReader */
public final class C2755h extends C2756i {

    /* renamed from: o */
    public static final int f3998o = C3152e0.m7764D("Opus");

    /* renamed from: p */
    public static final byte[] f3999p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f4000n;

    /* renamed from: n */
    public static boolean m5666n(C3173t tVar) {
        int a = tVar.mo20008a();
        byte[] bArr = f3999p;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        tVar.mo20015h(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f3999p);
    }

    /* renamed from: e */
    public long mo18704e(C3173t tVar) {
        return mo18722b(mo18719l(tVar.f5877a));
    }

    /* renamed from: h */
    public boolean mo18705h(C3173t tVar, long j, C2756i.C2758b bVar) {
        boolean z = true;
        if (!this.f4000n) {
            byte[] copyOf = Arrays.copyOf(tVar.f5877a, tVar.mo20011d());
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            mo18720m(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            mo18720m(arrayList, DisplayCompat.DISPLAY_SIZE_4K_WIDTH);
            bVar.f4014a = Format.m10238l((String) null, "audio/opus", (String) null, -1, -1, b, 48000, arrayList, (DrmInitData) null, 0, (String) null);
            this.f4000n = true;
            return true;
        }
        if (tVar.mo20017j() != f3998o) {
            z = false;
        }
        tVar.mo20006L(0);
        return z;
    }

    /* renamed from: j */
    public void mo18706j(boolean z) {
        super.mo18706j(z);
        if (z) {
            this.f4000n = false;
        }
    }

    /* renamed from: l */
    public final long mo18719l(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & Utf8.REPLACEMENT_BYTE;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return ((long) b3) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2));
    }

    /* renamed from: m */
    public final void mo18720m(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
