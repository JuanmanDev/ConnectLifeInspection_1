package p040c.p200q.p201a.p219b.p224f0.p227t;

import p040c.p200q.p201a.p219b.p224f0.C2675h;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.t.f */
/* compiled from: Sniffer */
public final class C2706f {

    /* renamed from: a */
    public final C3173t f3625a = new C3173t(8);

    /* renamed from: b */
    public int f3626b;

    /* renamed from: a */
    public final long mo18629a(C2675h hVar) {
        int i = 0;
        hVar.mo18531i(this.f3625a.f5877a, 0, 1);
        byte b = this.f3625a.f5877a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        hVar.mo18531i(this.f3625a.f5877a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f3625a.f5877a[i] & 255) + (i4 << 8);
        }
        this.f3626b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: b */
    public boolean mo18630b(C2675h hVar) {
        long a;
        int i;
        long e = hVar.mo18526e();
        int i2 = (e > -1 ? 1 : (e == -1 ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && e <= 1024) {
            j = e;
        }
        int i3 = (int) j;
        hVar.mo18531i(this.f3625a.f5877a, 0, 4);
        long A = this.f3625a.mo19995A();
        this.f3626b = 4;
        while (A != 440786851) {
            int i4 = this.f3626b + 1;
            this.f3626b = i4;
            if (i4 == i3) {
                return false;
            }
            hVar.mo18531i(this.f3625a.f5877a, 0, 1);
            A = ((A << 8) & -256) | ((long) (this.f3625a.f5877a[0] & 255));
        }
        long a2 = mo18629a(hVar);
        long j2 = (long) this.f3626b;
        if (a2 == Long.MIN_VALUE) {
            return false;
        }
        if (i2 != 0 && j2 + a2 >= e) {
            return false;
        }
        while (true) {
            int i5 = this.f3626b;
            long j3 = j2 + a2;
            if (((long) i5) < j3) {
                if (mo18629a(hVar) != Long.MIN_VALUE && a >= 0 && a <= 2147483647L) {
                    if (i != 0) {
                        int a3 = (int) (a = mo18629a(hVar));
                        hVar.mo18525d(a3);
                        this.f3626b += a3;
                    }
                }
            } else if (((long) i5) == j3) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
