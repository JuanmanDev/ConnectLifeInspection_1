package p040c.p200q.p201a.p219b.p241k0.p243c0;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.c0.j */
/* compiled from: DataChunk */
public abstract class C2882j extends C2872d {

    /* renamed from: i */
    public byte[] f4613i;

    /* renamed from: j */
    public volatile boolean f4614j;

    public C2882j(C3122h hVar, C3125j jVar, int i, Format format, int i2, Object obj, byte[] bArr) {
        super(hVar, jVar, i, format, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f4613i = bArr;
    }

    /* renamed from: a */
    public final void mo19121a() {
        this.f4614j = true;
    }

    /* renamed from: f */
    public abstract void mo19125f(byte[] bArr, int i);

    /* renamed from: g */
    public byte[] mo19126g() {
        return this.f4613i;
    }

    /* renamed from: h */
    public final void mo19127h(int i) {
        byte[] bArr = this.f4613i;
        if (bArr == null) {
            this.f4613i = new byte[16384];
        } else if (bArr.length < i + 16384) {
            this.f4613i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    public final void load() {
        try {
            this.f4560h.mo19309c(this.f4553a);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f4614j) {
                mo19127h(i2);
                i = this.f4560h.read(this.f4613i, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f4614j) {
                mo19125f(this.f4613i, i2);
            }
        } finally {
            C3152e0.m7805j(this.f4560h);
        }
    }
}
