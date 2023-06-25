package p040c.p142n.p143a.p144a.p148k;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.p308io.CharacterEscapes;
import com.fasterxml.jackson.core.p308io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import p040c.p142n.p143a.p144a.C2064d;
import p040c.p142n.p143a.p144a.C2066f;
import p040c.p142n.p143a.p144a.p145h.C2068a;
import p040c.p142n.p143a.p144a.p147j.C2072a;
import p040c.p142n.p143a.p144a.p147j.C2073b;

/* renamed from: c.n.a.a.k.c */
/* compiled from: JsonGeneratorImpl */
public abstract class C2080c extends C2068a {

    /* renamed from: o */
    public static final int[] f1982o = C2072a.m2900d();

    /* renamed from: n */
    public final C2073b f1983n;

    public C2080c(C2073b bVar, int i, C2064d dVar) {
        super(i, dVar);
        SerializedString serializedString = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        this.f1983n = bVar;
        if (mo16707h(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            mo16774j(127);
        }
    }

    /* renamed from: i */
    public JsonGenerator mo16773i(CharacterEscapes characterEscapes) {
        if (characterEscapes != null) {
            characterEscapes.getEscapeCodesForAscii();
        }
        return this;
    }

    /* renamed from: j */
    public JsonGenerator mo16774j(int i) {
        return this;
    }

    /* renamed from: m */
    public JsonGenerator mo16775m(C2066f fVar) {
        return this;
    }
}
