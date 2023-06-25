package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import p040c.p200q.p201a.p219b.p224f0.C2686q;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

public abstract class TagPayloadReader {

    /* renamed from: a */
    public final C2686q f7665a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str);
        }
    }

    public TagPayloadReader(C2686q qVar) {
        this.f7665a = qVar;
    }

    /* renamed from: a */
    public final void mo24005a(C3173t tVar, long j) {
        if (mo18580b(tVar)) {
            mo18581c(tVar, j);
        }
    }

    /* renamed from: b */
    public abstract boolean mo18580b(C3173t tVar);

    /* renamed from: c */
    public abstract void mo18581c(C3173t tVar, long j);
}
