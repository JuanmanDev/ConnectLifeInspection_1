package p040c.p077d.p078a.p080j;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: c.d.a.j.d */
/* compiled from: GifHeaderParser */
public class C1563d {

    /* renamed from: a */
    public final byte[] f889a = new byte[256];

    /* renamed from: b */
    public ByteBuffer f890b;

    /* renamed from: c */
    public C1562c f891c;

    /* renamed from: d */
    public int f892d = 0;

    /* renamed from: a */
    public void mo15577a() {
        this.f890b = null;
        this.f891c = null;
    }

    /* renamed from: b */
    public final boolean mo15578b() {
        return this.f891c.f877b != 0;
    }

    @NonNull
    /* renamed from: c */
    public C1562c mo15579c() {
        if (this.f890b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (mo15578b()) {
            return this.f891c;
        } else {
            mo15587k();
            if (!mo15578b()) {
                mo15584h();
                C1562c cVar = this.f891c;
                if (cVar.f878c < 0) {
                    cVar.f877b = 1;
                }
            }
            return this.f891c;
        }
    }

    /* renamed from: d */
    public final int mo15580d() {
        try {
            return this.f890b.get() & 255;
        } catch (Exception unused) {
            this.f891c.f877b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    public final void mo15581e() {
        this.f891c.f879d.f865a = mo15590n();
        this.f891c.f879d.f866b = mo15590n();
        this.f891c.f879d.f867c = mo15590n();
        this.f891c.f879d.f868d = mo15590n();
        int d = mo15580d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C1561b bVar = this.f891c.f879d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f869e = z;
        if (z2) {
            this.f891c.f879d.f875k = mo15583g(pow);
        } else {
            this.f891c.f879d.f875k = null;
        }
        this.f891c.f879d.f874j = this.f890b.position();
        mo15594r();
        if (!mo15578b()) {
            C1562c cVar = this.f891c;
            cVar.f878c++;
            cVar.f880e.add(cVar.f879d);
        }
    }

    /* renamed from: f */
    public final void mo15582f() {
        int d = mo15580d();
        this.f892d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f892d) {
                try {
                    i2 = this.f892d - i;
                    this.f890b.get(this.f889a, i, i2);
                    i += i2;
                } catch (Exception unused) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f892d;
                    }
                    this.f891c.f877b = 1;
                    return;
                }
            }
        }
    }

    @Nullable
    /* renamed from: g */
    public final int[] mo15583g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f890b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            boolean isLoggable = Log.isLoggable("GifHeaderParser", 3);
            this.f891c.f877b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    public final void mo15584h() {
        mo15585i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    public final void mo15585i(int i) {
        boolean z = false;
        while (!z && !mo15578b() && this.f891c.f878c <= i) {
            int d = mo15580d();
            if (d == 33) {
                int d2 = mo15580d();
                if (d2 == 1) {
                    mo15593q();
                } else if (d2 == 249) {
                    this.f891c.f879d = new C1561b();
                    mo15586j();
                } else if (d2 == 254) {
                    mo15593q();
                } else if (d2 != 255) {
                    mo15593q();
                } else {
                    mo15582f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f889a[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        mo15589m();
                    } else {
                        mo15593q();
                    }
                }
            } else if (d == 44) {
                C1562c cVar = this.f891c;
                if (cVar.f879d == null) {
                    cVar.f879d = new C1561b();
                }
                mo15581e();
            } else if (d != 59) {
                this.f891c.f877b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    public final void mo15586j() {
        mo15580d();
        int d = mo15580d();
        C1561b bVar = this.f891c.f879d;
        int i = (d & 28) >> 2;
        bVar.f871g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f871g = 1;
        }
        C1561b bVar2 = this.f891c.f879d;
        if ((d & 1) == 0) {
            z = false;
        }
        bVar2.f870f = z;
        int n = mo15590n();
        if (n < 2) {
            n = 10;
        }
        C1561b bVar3 = this.f891c.f879d;
        bVar3.f873i = n * 10;
        bVar3.f872h = mo15580d();
        mo15580d();
    }

    /* renamed from: k */
    public final void mo15587k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) mo15580d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f891c.f877b = 1;
            return;
        }
        mo15588l();
        if (this.f891c.f883h && !mo15578b()) {
            C1562c cVar = this.f891c;
            cVar.f876a = mo15583g(cVar.f884i);
            C1562c cVar2 = this.f891c;
            cVar2.f887l = cVar2.f876a[cVar2.f885j];
        }
    }

    /* renamed from: l */
    public final void mo15588l() {
        this.f891c.f881f = mo15590n();
        this.f891c.f882g = mo15590n();
        int d = mo15580d();
        this.f891c.f883h = (d & 128) != 0;
        this.f891c.f884i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f891c.f885j = mo15580d();
        this.f891c.f886k = mo15580d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15589m() {
        /*
            r3 = this;
        L_0x0000:
            r3.mo15582f()
            byte[] r0 = r3.f889a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            c.d.a.j.c r2 = r3.f891c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f888m = r0
        L_0x001b:
            int r0 = r3.f892d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.mo15578b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p077d.p078a.p080j.C1563d.mo15589m():void");
    }

    /* renamed from: n */
    public final int mo15590n() {
        return this.f890b.getShort();
    }

    /* renamed from: o */
    public final void mo15591o() {
        this.f890b = null;
        Arrays.fill(this.f889a, (byte) 0);
        this.f891c = new C1562c();
        this.f892d = 0;
    }

    /* renamed from: p */
    public C1563d mo15592p(@NonNull ByteBuffer byteBuffer) {
        mo15591o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f890b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f890b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: q */
    public final void mo15593q() {
        int d;
        do {
            d = mo15580d();
            this.f890b.position(Math.min(this.f890b.position() + d, this.f890b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    public final void mo15594r() {
        mo15580d();
        mo15593q();
    }
}
