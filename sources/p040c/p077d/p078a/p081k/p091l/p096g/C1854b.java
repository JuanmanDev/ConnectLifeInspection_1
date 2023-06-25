package p040c.p077d.p078a.p081k.p091l.p096g;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p077d.p078a.p080j.C1559a;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;

/* renamed from: c.d.a.k.l.g.b */
/* compiled from: GifBitmapProvider */
public final class C1854b implements C1559a.C1560a {

    /* renamed from: a */
    public final C1697e f1444a;
    @Nullable

    /* renamed from: b */
    public final C1692b f1445b;

    public C1854b(C1697e eVar, @Nullable C1692b bVar) {
        this.f1444a = eVar;
        this.f1445b = bVar;
    }

    @NonNull
    /* renamed from: a */
    public Bitmap mo15567a(int i, int i2, @NonNull Bitmap.Config config) {
        return this.f1444a.mo15924e(i, i2, config);
    }

    @NonNull
    /* renamed from: b */
    public int[] mo15568b(int i) {
        C1692b bVar = this.f1445b;
        if (bVar == null) {
            return new int[i];
        }
        return (int[]) bVar.mo15901d(i, int[].class);
    }

    /* renamed from: c */
    public void mo15569c(@NonNull Bitmap bitmap) {
        this.f1444a.mo15922c(bitmap);
    }

    /* renamed from: d */
    public void mo15570d(@NonNull byte[] bArr) {
        C1692b bVar = this.f1445b;
        if (bVar != null) {
            bVar.put(bArr);
        }
    }

    @NonNull
    /* renamed from: e */
    public byte[] mo15571e(int i) {
        C1692b bVar = this.f1445b;
        if (bVar == null) {
            return new byte[i];
        }
        return (byte[]) bVar.mo15901d(i, byte[].class);
    }

    /* renamed from: f */
    public void mo15572f(@NonNull int[] iArr) {
        C1692b bVar = this.f1445b;
        if (bVar != null) {
            bVar.put(iArr);
        }
    }
}
