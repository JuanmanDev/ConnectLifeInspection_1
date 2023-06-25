package p040c.p200q.p201a.p219b.p262p0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p261o0.C3168q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.p0.i */
/* compiled from: HevcConfig */
public final class C3191i {
    @Nullable

    /* renamed from: a */
    public final List<byte[]> f5939a;

    /* renamed from: b */
    public final int f5940b;

    public C3191i(@Nullable List<byte[]> list, int i) {
        this.f5939a = list;
        this.f5940b = i;
    }

    /* renamed from: a */
    public static C3191i m8038a(C3173t tVar) {
        List list;
        try {
            tVar.mo20007M(21);
            int y = tVar.mo20032y() & 3;
            int y2 = tVar.mo20032y();
            int c = tVar.mo20010c();
            int i = 0;
            for (int i2 = 0; i2 < y2; i2++) {
                tVar.mo20007M(1);
                int E = tVar.mo19999E();
                for (int i3 = 0; i3 < E; i3++) {
                    int E2 = tVar.mo19999E();
                    i += E2 + 4;
                    tVar.mo20007M(E2);
                }
            }
            tVar.mo20006L(c);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < y2; i5++) {
                tVar.mo20007M(1);
                int E3 = tVar.mo19999E();
                for (int i6 = 0; i6 < E3; i6++) {
                    int E4 = tVar.mo19999E();
                    System.arraycopy(C3168q.f5853a, 0, bArr, i4, C3168q.f5853a.length);
                    int length = i4 + C3168q.f5853a.length;
                    System.arraycopy(tVar.f5877a, tVar.mo20010c(), bArr, length, E4);
                    i4 = length + E4;
                    tVar.mo20007M(E4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C3191i(list, y + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
