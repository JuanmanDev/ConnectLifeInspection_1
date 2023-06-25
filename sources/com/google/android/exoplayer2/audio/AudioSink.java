package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import p040c.p200q.p201a.p219b.C3206r;
import p040c.p200q.p201a.p219b.p221c0.C2599h;
import p040c.p200q.p201a.p219b.p221c0.C2614o;

public interface AudioSink {

    public static final class ConfigurationException extends Exception {
        public ConfigurationException(Throwable th) {
            super(th);
        }

        public ConfigurationException(String str) {
            super(str);
        }
    }

    public static final class InitializationException extends Exception {
        public final int audioTrackState;

        public InitializationException(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.audioTrackState = i;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;

        public WriteException(int i) {
            super("AudioTrack write failed: " + i);
            this.errorCode = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.AudioSink$a */
    public interface C3996a {
        /* renamed from: a */
        void mo18343a(int i);

        /* renamed from: b */
        void mo18344b(int i, long j, long j2);

        /* renamed from: c */
        void mo18345c();
    }

    /* renamed from: a */
    void mo23931a();

    /* renamed from: b */
    boolean mo23932b();

    /* renamed from: f */
    C3206r mo23933f();

    /* renamed from: g */
    C3206r mo23934g(C3206r rVar);

    /* renamed from: h */
    boolean mo23935h(int i, int i2);

    /* renamed from: i */
    void mo23936i(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, int i6);

    /* renamed from: j */
    void mo23937j();

    /* renamed from: k */
    boolean mo23938k();

    /* renamed from: l */
    long mo23939l(boolean z);

    /* renamed from: m */
    void mo23940m();

    /* renamed from: n */
    void mo23941n(C2599h hVar);

    /* renamed from: o */
    void mo23942o();

    /* renamed from: p */
    void mo23943p(float f);

    void pause();

    void play();

    /* renamed from: q */
    boolean mo23946q(ByteBuffer byteBuffer, long j);

    /* renamed from: r */
    void mo23947r(int i);

    void release();

    /* renamed from: s */
    void mo23949s(C3996a aVar);

    /* renamed from: t */
    void mo23950t(C2614o oVar);
}
