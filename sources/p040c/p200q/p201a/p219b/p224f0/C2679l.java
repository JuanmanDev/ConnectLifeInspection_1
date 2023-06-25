package p040c.p200q.p201a.p219b.p224f0;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import p040c.p200q.p201a.p219b.p235h0.p237g.C2837b;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.l */
/* compiled from: Id3Peeker */
public final class C2679l {

    /* renamed from: a */
    public final C3173t f3428a = new C3173t(10);

    @Nullable
    /* renamed from: a */
    public Metadata mo18559a(C2675h hVar, @Nullable C2837b.C2838a aVar) {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                hVar.mo18531i(this.f3428a.f5877a, 0, 10);
                this.f3428a.mo20006L(0);
                if (this.f3428a.mo19996B() != C2837b.f4414b) {
                    break;
                }
                this.f3428a.mo20007M(3);
                int x = this.f3428a.mo20031x();
                int i2 = x + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f3428a.f5877a, 0, bArr, 0, 10);
                    hVar.mo18531i(bArr, 10, x);
                    metadata = new C2837b(aVar).mo18908c(bArr, i2);
                } else {
                    hVar.mo18525d(x);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        hVar.mo18527f();
        hVar.mo18525d(i);
        return metadata;
    }
}
