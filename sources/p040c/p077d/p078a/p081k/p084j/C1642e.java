package p040c.p077d.p078a.p081k.p084j;

import androidx.annotation.NonNull;
import java.io.File;
import p040c.p077d.p078a.p081k.C1565a;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1609a;

/* renamed from: c.d.a.k.j.e */
/* compiled from: DataCacheWriter */
public class C1642e<DataType> implements C1609a.C1611b {

    /* renamed from: a */
    public final C1565a<DataType> f1028a;

    /* renamed from: b */
    public final DataType f1029b;

    /* renamed from: c */
    public final C1571e f1030c;

    public C1642e(C1565a<DataType> aVar, DataType datatype, C1571e eVar) {
        this.f1028a = aVar;
        this.f1029b = datatype;
        this.f1030c = eVar;
    }

    /* renamed from: a */
    public boolean mo15695a(@NonNull File file) {
        return this.f1028a.mo15605a(this.f1029b, file, this.f1030c);
    }
}
