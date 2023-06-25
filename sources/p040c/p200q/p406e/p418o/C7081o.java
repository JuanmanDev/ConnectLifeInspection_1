package p040c.p200q.p406e.p418o;

import com.google.zxing.ReaderException;
import p040c.p200q.p406e.C7022h;
import p040c.p200q.p406e.p410l.C7032a;

/* renamed from: c.q.e.o.o */
/* compiled from: UPCEANExtensionSupport */
public final class C7081o {

    /* renamed from: c */
    public static final int[] f13594c = {1, 1, 2};

    /* renamed from: a */
    public final C7079m f13595a = new C7079m();

    /* renamed from: b */
    public final C7080n f13596b = new C7080n();

    /* renamed from: a */
    public C7022h mo32661a(int i, C7032a aVar, int i2) {
        int[] n = C7082p.m21048n(aVar, i2, false, f13594c);
        try {
            return this.f13596b.mo32660b(i, aVar, n);
        } catch (ReaderException unused) {
            return this.f13595a.mo32658b(i, aVar, n);
        }
    }
}
