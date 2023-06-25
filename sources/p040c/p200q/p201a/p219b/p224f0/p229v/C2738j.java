package p040c.p200q.p201a.p219b.p224f0.p229v;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.UUID;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.v.j */
/* compiled from: PsshAtomUtil */
public final class C2738j {

    /* renamed from: c.q.a.b.f0.v.j$a */
    /* compiled from: PsshAtomUtil */
    public static class C2739a {

        /* renamed from: a */
        public final UUID f3915a;

        public C2739a(UUID uuid, int i, byte[] bArr) {
            this.f3915a = uuid;
        }
    }

    /* renamed from: a */
    public static byte[] m5594a(UUID uuid, @Nullable byte[] bArr) {
        return m5595b(uuid, (UUID[]) null, bArr);
    }

    /* renamed from: b */
    public static byte[] m5595b(UUID uuid, @Nullable UUID[] uuidArr, @Nullable byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(C2718c.f3708V);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    @Nullable
    /* renamed from: c */
    public static C2739a m5596c(byte[] bArr) {
        C3173t tVar = new C3173t(bArr);
        if (tVar.mo20011d() < 32) {
            return null;
        }
        tVar.mo20006L(0);
        if (tVar.mo20017j() != tVar.mo20008a() + 4 || tVar.mo20017j() != C2718c.f3708V) {
            return null;
        }
        int c = C2718c.m5467c(tVar.mo20017j());
        if (c > 1) {
            C3163m.m7880f("PsshAtomUtil", "Unsupported pssh version: " + c);
            return null;
        }
        UUID uuid = new UUID(tVar.mo20025r(), tVar.mo20025r());
        if (c == 1) {
            tVar.mo20007M(tVar.mo19997C() * 16);
        }
        int C = tVar.mo19997C();
        if (C != tVar.mo20008a()) {
            return null;
        }
        byte[] bArr2 = new byte[C];
        tVar.mo20015h(bArr2, 0, C);
        return new C2739a(uuid, c, bArr2);
    }

    @Nullable
    /* renamed from: d */
    public static UUID m5597d(byte[] bArr) {
        C2739a c = m5596c(bArr);
        if (c == null) {
            return null;
        }
        return c.f3915a;
    }
}
