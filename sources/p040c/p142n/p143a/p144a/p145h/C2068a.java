package p040c.p142n.p143a.p144a.p145h;

import com.fasterxml.jackson.core.JsonGenerator;
import okio.Utf8;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.p148k.C2079b;
import p040c.p142n.p143a.p144a.p148k.C2082e;

/* renamed from: c.n.a.a.h.a */
/* compiled from: GeneratorBase */
public abstract class C2068a extends JsonGenerator {

    /* renamed from: l */
    public int f1919l;

    /* renamed from: m */
    public C2082e f1920m;

    public C2068a(int i, C2064d dVar) {
        this.f1919l = i;
        this.f1920m = C2082e.m2958g(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? C2079b.m2952a(this) : null);
        JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    public void close() {
    }

    /* renamed from: f */
    public final int mo16705f(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - Utf8.LOG_SURROGATE_HEADER);
        }
        mo23312a("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2));
        throw null;
    }

    /* renamed from: g */
    public final C2082e mo16706g() {
        return this.f1920m;
    }

    /* renamed from: h */
    public final boolean mo16707h(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.f1919l) != 0;
    }
}
