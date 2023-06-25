package p040c.p200q.p201a.p219b.p224f0.p232y;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
import p040c.p200q.p201a.p219b.p224f0.C2676i;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.y.e0 */
/* compiled from: TsPayloadReader */
public interface C2781e0 {

    /* renamed from: c.q.a.b.f0.y.e0$a */
    /* compiled from: TsPayloadReader */
    public static final class C2782a {

        /* renamed from: a */
        public final String f4096a;

        /* renamed from: b */
        public final byte[] f4097b;

        public C2782a(String str, int i, byte[] bArr) {
            this.f4096a = str;
            this.f4097b = bArr;
        }
    }

    /* renamed from: c.q.a.b.f0.y.e0$b */
    /* compiled from: TsPayloadReader */
    public static final class C2783b {

        /* renamed from: a */
        public final int f4098a;

        /* renamed from: b */
        public final String f4099b;

        /* renamed from: c */
        public final List<C2782a> f4100c;

        /* renamed from: d */
        public final byte[] f4101d;

        public C2783b(int i, String str, List<C2782a> list, byte[] bArr) {
            List<C2782a> list2;
            this.f4098a = i;
            this.f4099b = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f4100c = list2;
            this.f4101d = bArr;
        }
    }

    /* renamed from: c.q.a.b.f0.y.e0$c */
    /* compiled from: TsPayloadReader */
    public interface C2784c {
        /* renamed from: a */
        C2781e0 mo18759a(int i, C2783b bVar);

        /* renamed from: b */
        SparseArray<C2781e0> mo18760b();
    }

    /* renamed from: c.q.a.b.f0.y.e0$d */
    /* compiled from: TsPayloadReader */
    public static final class C2785d {

        /* renamed from: a */
        public final String f4102a;

        /* renamed from: b */
        public final int f4103b;

        /* renamed from: c */
        public final int f4104c;

        /* renamed from: d */
        public int f4105d;

        /* renamed from: e */
        public String f4106e;

        public C2785d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        /* renamed from: a */
        public void mo18761a() {
            int i = this.f4105d;
            this.f4105d = i == Integer.MIN_VALUE ? this.f4103b : i + this.f4104c;
            this.f4106e = this.f4102a + this.f4105d;
        }

        /* renamed from: b */
        public String mo18762b() {
            mo18764d();
            return this.f4106e;
        }

        /* renamed from: c */
        public int mo18763c() {
            mo18764d();
            return this.f4105d;
        }

        /* renamed from: d */
        public final void mo18764d() {
            if (this.f4105d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public C2785d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f4102a = str;
            this.f4103b = i2;
            this.f4104c = i3;
            this.f4105d = Integer.MIN_VALUE;
        }
    }

    /* renamed from: a */
    void mo18756a(C3146b0 b0Var, C2676i iVar, C2785d dVar);

    /* renamed from: b */
    void mo18757b(C3173t tVar, int i);

    /* renamed from: c */
    void mo18758c();
}
