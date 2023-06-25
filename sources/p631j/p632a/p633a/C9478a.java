package p631j.p632a.p633a;

import java.util.function.Supplier;
import kotlin.sequences.Sequence;
import kotlin.streams.jdk8.StreamsKt;

/* renamed from: j.a.a.a */
/* compiled from: lambda */
public final /* synthetic */ class C9478a implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ Sequence f18777a;

    public /* synthetic */ C9478a(Sequence sequence) {
        this.f18777a = sequence;
    }

    public final Object get() {
        return StreamsKt.m28584asStream$lambda4(this.f18777a);
    }
}
