package com.fasterxml.jackson.core.p308io;

import java.io.Serializable;
import java.util.Arrays;
import p040c.p142n.p143a.p144a.C2066f;
import p040c.p142n.p143a.p144a.p147j.C2072a;

/* renamed from: com.fasterxml.jackson.core.io.CharacterEscapes */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public static int[] standardAsciiEscapesForJSON() {
        int[] d = C2072a.m2900d();
        return Arrays.copyOf(d, d.length);
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract C2066f getEscapeSequence(int i);
}
