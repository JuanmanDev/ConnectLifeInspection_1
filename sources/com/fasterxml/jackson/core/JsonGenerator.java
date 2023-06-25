package com.fasterxml.jackson.core;

import java.io.Closeable;
import java.io.Flushable;
import p040c.p142n.p143a.p144a.C2065e;
import p040c.p142n.p143a.p144a.C2066f;

public abstract class JsonGenerator implements Closeable, Flushable {

    /* renamed from: e */
    public C2065e f7196e;

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        FLUSH_PASSED_TO_STREAM(true),
        ESCAPE_NON_ASCII(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);
        
        public final boolean _defaultState;
        public final int _mask;

        /* access modifiers changed from: public */
        Feature(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
        }

        public static int collectDefaults() {
            int i = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i |= feature.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    /* renamed from: a */
    public void mo23312a(String str) {
        throw new JsonGenerationException(str);
    }

    /* renamed from: b */
    public abstract void mo16780b(char c);

    /* renamed from: c */
    public abstract void mo16781c(C2066f fVar);

    /* renamed from: d */
    public abstract void mo16782d(String str);

    /* renamed from: e */
    public abstract void mo16783e(char[] cArr, int i, int i2);
}
