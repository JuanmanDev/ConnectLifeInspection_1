package p040c.p200q.p353b.p355b;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableTable;
import java.util.Map;
import p040c.p200q.p353b.p354a.C5850m;
import p040c.p200q.p353b.p355b.C5927d3;

/* renamed from: c.q.b.b.u2 */
/* compiled from: SingletonImmutableTable */
public class C6165u2<R, C, V> extends ImmutableTable<R, C, V> {

    /* renamed from: e */
    public final R f11752e;

    /* renamed from: l */
    public final C f11753l;

    /* renamed from: m */
    public final V f11754m;

    public C6165u2(R r, C c, V v) {
        C5850m.m16594o(r);
        this.f11752e = r;
        C5850m.m16594o(c);
        this.f11753l = c;
        C5850m.m16594o(v);
        this.f11754m = v;
    }

    public ImmutableTable.C8153b createSerializedForm() {
        return ImmutableTable.C8153b.m22344a(this, new int[]{0}, new int[]{0});
    }

    public int size() {
        return 1;
    }

    public ImmutableMap<R, V> column(C c) {
        C5850m.m16594o(c);
        if (containsColumn(c)) {
            return ImmutableMap.m22185of(this.f11752e, this.f11754m);
        }
        return ImmutableMap.m22184of();
    }

    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.m22185of(this.f11753l, ImmutableMap.m22185of(this.f11752e, this.f11754m));
    }

    public ImmutableSet<C5927d3.C5928a<R, C, V>> createCellSet() {
        return ImmutableSet.m22255of(ImmutableTable.cellOf(this.f11752e, this.f11753l, this.f11754m));
    }

    public ImmutableCollection<V> createValues() {
        return ImmutableSet.m22255of(this.f11754m);
    }

    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.m22185of(this.f11752e, ImmutableMap.m22185of(this.f11753l, this.f11754m));
    }

    public C6165u2(C5927d3.C5928a<R, C, V> aVar) {
        this(aVar.mo29198b(), aVar.mo29197a(), aVar.getValue());
    }
}
