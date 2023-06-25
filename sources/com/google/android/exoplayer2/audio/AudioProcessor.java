package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {

    /* renamed from: a */
    public static final ByteBuffer f7576a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int i, int i2, int i3) {
            super("Unhandled format: " + i + " Hz, " + i2 + " channels in encoding " + i3);
        }
    }

    /* renamed from: a */
    void mo18306a();

    /* renamed from: b */
    boolean mo18307b();

    /* renamed from: c */
    ByteBuffer mo18308c();

    /* renamed from: d */
    void mo18309d(ByteBuffer byteBuffer);

    /* renamed from: e */
    int mo18310e();

    /* renamed from: f */
    int mo18311f();

    void flush();

    /* renamed from: g */
    int mo18313g();

    /* renamed from: h */
    void mo18314h();

    /* renamed from: i */
    boolean mo18315i(int i, int i2, int i3);

    boolean isActive();
}
