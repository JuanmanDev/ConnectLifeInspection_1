package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import kotlinx.coroutines.EventLoop_commonKt;
import okhttp3.internal.platform.android.AndroidLog;
import p040c.p200q.p201a.p219b.C3206r;
import p040c.p200q.p201a.p219b.p221c0.C2596g;
import p040c.p200q.p201a.p219b.p221c0.C2599h;
import p040c.p200q.p201a.p219b.p221c0.C2602i;
import p040c.p200q.p201a.p219b.p221c0.C2612n;
import p040c.p200q.p201a.p219b.p221c0.C2614o;
import p040c.p200q.p201a.p219b.p221c0.C2615p;
import p040c.p200q.p201a.p219b.p221c0.C2616q;
import p040c.p200q.p201a.p219b.p221c0.C2617r;
import p040c.p200q.p201a.p219b.p221c0.C2621t;
import p040c.p200q.p201a.p219b.p221c0.C2622u;
import p040c.p200q.p201a.p219b.p221c0.C2624w;
import p040c.p200q.p201a.p219b.p221c0.C2625x;
import p040c.p200q.p201a.p219b.p261o0.C3151e;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;

public final class DefaultAudioSink implements AudioSink {

    /* renamed from: a0 */
    public static boolean f7577a0 = false;

    /* renamed from: b0 */
    public static boolean f7578b0 = false;

    /* renamed from: A */
    public long f7579A;
    @Nullable

    /* renamed from: B */
    public ByteBuffer f7580B;

    /* renamed from: C */
    public int f7581C;

    /* renamed from: D */
    public int f7582D;

    /* renamed from: E */
    public long f7583E;

    /* renamed from: F */
    public long f7584F;

    /* renamed from: G */
    public int f7585G;

    /* renamed from: H */
    public long f7586H;

    /* renamed from: I */
    public long f7587I;

    /* renamed from: J */
    public int f7588J;

    /* renamed from: K */
    public int f7589K;

    /* renamed from: L */
    public long f7590L;

    /* renamed from: M */
    public float f7591M;

    /* renamed from: N */
    public AudioProcessor[] f7592N;

    /* renamed from: O */
    public ByteBuffer[] f7593O;
    @Nullable

    /* renamed from: P */
    public ByteBuffer f7594P;
    @Nullable

    /* renamed from: Q */
    public ByteBuffer f7595Q;

    /* renamed from: R */
    public byte[] f7596R;

    /* renamed from: S */
    public int f7597S;

    /* renamed from: T */
    public int f7598T;

    /* renamed from: U */
    public boolean f7599U;

    /* renamed from: V */
    public boolean f7600V;

    /* renamed from: W */
    public int f7601W;

    /* renamed from: X */
    public C2614o f7602X;

    /* renamed from: Y */
    public boolean f7603Y;

    /* renamed from: Z */
    public long f7604Z;
    @Nullable

    /* renamed from: a */
    public final C2602i f7605a;

    /* renamed from: b */
    public final C3999c f7606b;

    /* renamed from: c */
    public final boolean f7607c;

    /* renamed from: d */
    public final C2615p f7608d;

    /* renamed from: e */
    public final C2625x f7609e;

    /* renamed from: f */
    public final AudioProcessor[] f7610f;

    /* renamed from: g */
    public final AudioProcessor[] f7611g;

    /* renamed from: h */
    public final ConditionVariable f7612h;

    /* renamed from: i */
    public final C2612n f7613i;

    /* renamed from: j */
    public final ArrayDeque<C4001e> f7614j;
    @Nullable

    /* renamed from: k */
    public AudioSink.C3996a f7615k;
    @Nullable

    /* renamed from: l */
    public AudioTrack f7616l;

    /* renamed from: m */
    public AudioTrack f7617m;

    /* renamed from: n */
    public boolean f7618n;

    /* renamed from: o */
    public boolean f7619o;

    /* renamed from: p */
    public int f7620p;

    /* renamed from: q */
    public int f7621q;

    /* renamed from: r */
    public int f7622r;

    /* renamed from: s */
    public int f7623s;

    /* renamed from: t */
    public C2599h f7624t;

    /* renamed from: u */
    public boolean f7625u;

    /* renamed from: v */
    public boolean f7626v;

    /* renamed from: w */
    public int f7627w;
    @Nullable

    /* renamed from: x */
    public C3206r f7628x;

    /* renamed from: y */
    public C3206r f7629y;

    /* renamed from: z */
    public long f7630z;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public /* synthetic */ InvalidAudioTrackTimestampException(String str, C3997a aVar) {
            this(str);
        }

        public InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$a */
    public class C3997a extends Thread {

        /* renamed from: e */
        public final /* synthetic */ AudioTrack f7631e;

        public C3997a(AudioTrack audioTrack) {
            this.f7631e = audioTrack;
        }

        public void run() {
            try {
                this.f7631e.flush();
                this.f7631e.release();
            } finally {
                DefaultAudioSink.this.f7612h.open();
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$b */
    public class C3998b extends Thread {

        /* renamed from: e */
        public final /* synthetic */ AudioTrack f7633e;

        public C3998b(DefaultAudioSink defaultAudioSink, AudioTrack audioTrack) {
            this.f7633e = audioTrack;
        }

        public void run() {
            this.f7633e.release();
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$c */
    public interface C3999c {
        /* renamed from: a */
        C3206r mo23975a(C3206r rVar);

        /* renamed from: b */
        long mo23976b(long j);

        /* renamed from: c */
        long mo23977c();

        /* renamed from: d */
        AudioProcessor[] mo23978d();
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$d */
    public static class C4000d implements C3999c {

        /* renamed from: a */
        public final AudioProcessor[] f7634a;

        /* renamed from: b */
        public final C2622u f7635b = new C2622u();

        /* renamed from: c */
        public final C2624w f7636c;

        public C4000d(AudioProcessor... audioProcessorArr) {
            this.f7634a = (AudioProcessor[]) Arrays.copyOf(audioProcessorArr, audioProcessorArr.length + 2);
            C2624w wVar = new C2624w();
            this.f7636c = wVar;
            AudioProcessor[] audioProcessorArr2 = this.f7634a;
            audioProcessorArr2[audioProcessorArr.length] = this.f7635b;
            audioProcessorArr2[audioProcessorArr.length + 1] = wVar;
        }

        /* renamed from: a */
        public C3206r mo23975a(C3206r rVar) {
            this.f7635b.mo18356t(rVar.f6031c);
            return new C3206r(this.f7636c.mo18381l(rVar.f6029a), this.f7636c.mo18380k(rVar.f6030b), rVar.f6031c);
        }

        /* renamed from: b */
        public long mo23976b(long j) {
            return this.f7636c.mo18379j(j);
        }

        /* renamed from: c */
        public long mo23977c() {
            return this.f7635b.mo18349m();
        }

        /* renamed from: d */
        public AudioProcessor[] mo23978d() {
            return this.f7634a;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$e */
    public static final class C4001e {

        /* renamed from: a */
        public final C3206r f7637a;

        /* renamed from: b */
        public final long f7638b;

        /* renamed from: c */
        public final long f7639c;

        public /* synthetic */ C4001e(C3206r rVar, long j, long j2, C3997a aVar) {
            this(rVar, j, j2);
        }

        public C4001e(C3206r rVar, long j, long j2) {
            this.f7637a = rVar;
            this.f7638b = j;
            this.f7639c = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.audio.DefaultAudioSink$f */
    public final class C4002f implements C2612n.C2613a {
        public C4002f() {
        }

        /* renamed from: a */
        public void mo18300a(int i, long j) {
            if (DefaultAudioSink.this.f7615k != null) {
                DefaultAudioSink.this.f7615k.mo18344b(i, j, SystemClock.elapsedRealtime() - DefaultAudioSink.this.f7604Z);
            }
        }

        /* renamed from: b */
        public void mo18301b(long j) {
            C3163m.m7880f("AudioTrack", "Ignoring impossibly large audio latency: " + j);
        }

        /* renamed from: c */
        public void mo18302c(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.mo23956I() + ", " + DefaultAudioSink.this.mo23957J();
            if (!DefaultAudioSink.f7578b0) {
                C3163m.m7880f("AudioTrack", str);
                return;
            }
            throw new InvalidAudioTrackTimestampException(str, (C3997a) null);
        }

        /* renamed from: d */
        public void mo18303d(long j, long j2, long j3, long j4) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + DefaultAudioSink.this.mo23956I() + ", " + DefaultAudioSink.this.mo23957J();
            if (!DefaultAudioSink.f7578b0) {
                C3163m.m7880f("AudioTrack", str);
                return;
            }
            throw new InvalidAudioTrackTimestampException(str, (C3997a) null);
        }

        public /* synthetic */ C4002f(DefaultAudioSink defaultAudioSink, C3997a aVar) {
            this();
        }
    }

    public DefaultAudioSink(@Nullable C2602i iVar, AudioProcessor[] audioProcessorArr) {
        this(iVar, audioProcessorArr, false);
    }

    /* renamed from: E */
    public static int m10293E(int i, boolean z) {
        if (C3152e0.f5819a <= 28 && !z) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (C3152e0.f5819a <= 26 && "fugu".equals(C3152e0.f5820b) && !z && i == 1) {
            i = 2;
        }
        return C3152e0.m7823w(i);
    }

    /* renamed from: G */
    public static int m10294G(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C2616q.m4927e(byteBuffer);
        }
        if (i == 5) {
            return C2596g.m4815b();
        }
        if (i == 6) {
            return C2596g.m4821h(byteBuffer);
        }
        if (i == 14) {
            int a = C2596g.m4814a(byteBuffer);
            if (a == -1) {
                return 0;
            }
            return C2596g.m4822i(byteBuffer, a) * 16;
        }
        throw new IllegalStateException("Unexpected audio encoding: " + i);
    }

    /* renamed from: H */
    public static int m10295H(int i) {
        if (i == 5) {
            return 80000;
        }
        if (i == 6) {
            return 768000;
        }
        if (i == 7) {
            return 192000;
        }
        if (i == 8) {
            return 2250000;
        }
        if (i == 14) {
            return 3062500;
        }
        throw new IllegalArgumentException();
    }

    @TargetApi(21)
    /* renamed from: S */
    public static void m10296S(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    /* renamed from: T */
    public static void m10297T(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    @TargetApi(21)
    /* renamed from: W */
    public static int m10298W(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    /* renamed from: A */
    public final long mo23951A(long j) {
        return (j * ((long) this.f7621q)) / EventLoop_commonKt.MS_TO_NS;
    }

    /* renamed from: B */
    public final void mo23952B() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.f7592N;
            if (i < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i];
                audioProcessor.flush();
                this.f7593O[i] = audioProcessor.mo18308c();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: C */
    public final long mo23953C(long j) {
        return (j * EventLoop_commonKt.MS_TO_NS) / ((long) this.f7621q);
    }

    /* renamed from: D */
    public final AudioProcessor[] mo23954D() {
        return this.f7619o ? this.f7611g : this.f7610f;
    }

    /* renamed from: F */
    public final int mo23955F() {
        if (this.f7618n) {
            int minBufferSize = AudioTrack.getMinBufferSize(this.f7621q, this.f7622r, this.f7623s);
            C3151e.m7759g(minBufferSize != -2);
            return C3152e0.m7813n(minBufferSize * 4, ((int) mo23951A(250000)) * this.f7585G, (int) Math.max((long) minBufferSize, mo23951A(750000) * ((long) this.f7585G)));
        }
        int H = m10295H(this.f7623s);
        if (this.f7623s == 5) {
            H *= 2;
        }
        return (int) ((((long) H) * 250000) / EventLoop_commonKt.MS_TO_NS);
    }

    /* renamed from: I */
    public final long mo23956I() {
        return this.f7618n ? this.f7583E / ((long) this.f7582D) : this.f7584F;
    }

    /* renamed from: J */
    public final long mo23957J() {
        return this.f7618n ? this.f7586H / ((long) this.f7585G) : this.f7587I;
    }

    /* renamed from: K */
    public final void mo23958K() {
        this.f7612h.block();
        AudioTrack L = mo23959L();
        this.f7617m = L;
        int audioSessionId = L.getAudioSessionId();
        if (f7577a0 && C3152e0.f5819a < 21) {
            AudioTrack audioTrack = this.f7616l;
            if (!(audioTrack == null || audioSessionId == audioTrack.getAudioSessionId())) {
                mo23964Q();
            }
            if (this.f7616l == null) {
                this.f7616l = mo23960M(audioSessionId);
            }
        }
        if (this.f7601W != audioSessionId) {
            this.f7601W = audioSessionId;
            AudioSink.C3996a aVar = this.f7615k;
            if (aVar != null) {
                aVar.mo18343a(audioSessionId);
            }
        }
        this.f7629y = this.f7626v ? this.f7606b.mo23975a(this.f7629y) : C3206r.f6028e;
        mo23966U();
        this.f7613i.mo18298s(this.f7617m, this.f7623s, this.f7585G, this.f7627w);
        mo23965R();
        int i = this.f7602X.f3168a;
        if (i != 0) {
            this.f7617m.attachAuxEffect(i);
            this.f7617m.setAuxEffectSendLevel(this.f7602X.f3169b);
        }
    }

    /* renamed from: L */
    public final AudioTrack mo23959L() {
        AudioTrack audioTrack;
        if (C3152e0.f5819a >= 21) {
            audioTrack = mo23971y();
        } else {
            int L = C3152e0.m7772L(this.f7624t.f3112c);
            if (this.f7601W == 0) {
                audioTrack = new AudioTrack(L, this.f7621q, this.f7622r, this.f7623s, this.f7627w, 1);
            } else {
                audioTrack = new AudioTrack(L, this.f7621q, this.f7622r, this.f7623s, this.f7627w, 1, this.f7601W);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new AudioSink.InitializationException(state, this.f7621q, this.f7622r, this.f7627w);
    }

    /* renamed from: M */
    public final AudioTrack mo23960M(int i) {
        return new AudioTrack(3, AndroidLog.MAX_LOG_LENGTH, 4, 2, 2, 0, i);
    }

    /* renamed from: N */
    public final long mo23961N(long j) {
        return (j * EventLoop_commonKt.MS_TO_NS) / ((long) this.f7620p);
    }

    /* renamed from: O */
    public final boolean mo23962O() {
        return this.f7617m != null;
    }

    /* renamed from: P */
    public final void mo23963P(long j) {
        ByteBuffer byteBuffer;
        int length = this.f7592N.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f7593O[i - 1];
            } else {
                byteBuffer = this.f7594P;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f7576a;
                }
            }
            if (i == length) {
                mo23967V(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.f7592N[i];
                audioProcessor.mo18309d(byteBuffer);
                ByteBuffer c = audioProcessor.mo18308c();
                this.f7593O[i] = c;
                if (c.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: Q */
    public final void mo23964Q() {
        AudioTrack audioTrack = this.f7616l;
        if (audioTrack != null) {
            this.f7616l = null;
            new C3998b(this, audioTrack).start();
        }
    }

    /* renamed from: R */
    public final void mo23965R() {
        if (mo23962O()) {
            if (C3152e0.f5819a >= 21) {
                m10296S(this.f7617m, this.f7591M);
            } else {
                m10297T(this.f7617m, this.f7591M);
            }
        }
    }

    /* renamed from: U */
    public final void mo23966U() {
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : mo23954D()) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.f7592N = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.f7593O = new ByteBuffer[size];
        mo23952B();
    }

    /* renamed from: V */
    public final void mo23967V(ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f7595Q;
            boolean z = true;
            int i = 0;
            if (byteBuffer2 != null) {
                C3151e.m7753a(byteBuffer2 == byteBuffer);
            } else {
                this.f7595Q = byteBuffer;
                if (C3152e0.f5819a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f7596R;
                    if (bArr == null || bArr.length < remaining) {
                        this.f7596R = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f7596R, 0, remaining);
                    byteBuffer.position(position);
                    this.f7597S = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C3152e0.f5819a < 21) {
                int c = this.f7613i.mo18283c(this.f7586H);
                if (c > 0 && (i = this.f7617m.write(this.f7596R, this.f7597S, Math.min(remaining2, c))) > 0) {
                    this.f7597S += i;
                    byteBuffer.position(byteBuffer.position() + i);
                }
            } else if (this.f7603Y) {
                if (j == -9223372036854775807L) {
                    z = false;
                }
                C3151e.m7759g(z);
                i = mo23968X(this.f7617m, byteBuffer, remaining2, j);
            } else {
                i = m10298W(this.f7617m, byteBuffer, remaining2);
            }
            this.f7604Z = SystemClock.elapsedRealtime();
            if (i >= 0) {
                if (this.f7618n) {
                    this.f7586H += (long) i;
                }
                if (i == remaining2) {
                    if (!this.f7618n) {
                        this.f7587I += (long) this.f7588J;
                    }
                    this.f7595Q = null;
                    return;
                }
                return;
            }
            throw new AudioSink.WriteException(i);
        }
    }

    @TargetApi(21)
    /* renamed from: X */
    public final int mo23968X(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.f7580B == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f7580B = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f7580B.putInt(1431633921);
        }
        if (this.f7581C == 0) {
            this.f7580B.putInt(4, i);
            this.f7580B.putLong(8, j * 1000);
            this.f7580B.position(0);
            this.f7581C = i;
        }
        int remaining = this.f7580B.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f7580B, remaining, 1);
            if (write < 0) {
                this.f7581C = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int W = m10298W(audioTrack, byteBuffer, i);
        if (W < 0) {
            this.f7581C = 0;
            return W;
        }
        this.f7581C -= W;
        return W;
    }

    /* renamed from: a */
    public void mo23931a() {
        if (mo23962O()) {
            this.f7583E = 0;
            this.f7584F = 0;
            this.f7586H = 0;
            this.f7587I = 0;
            this.f7588J = 0;
            C3206r rVar = this.f7628x;
            if (rVar != null) {
                this.f7629y = rVar;
                this.f7628x = null;
            } else if (!this.f7614j.isEmpty()) {
                this.f7629y = this.f7614j.getLast().f7637a;
            }
            this.f7614j.clear();
            this.f7630z = 0;
            this.f7579A = 0;
            this.f7609e.mo18383k();
            this.f7594P = null;
            this.f7595Q = null;
            mo23952B();
            this.f7599U = false;
            this.f7598T = -1;
            this.f7580B = null;
            this.f7581C = 0;
            this.f7589K = 0;
            if (this.f7613i.mo18289i()) {
                this.f7617m.pause();
            }
            AudioTrack audioTrack = this.f7617m;
            this.f7617m = null;
            this.f7613i.mo18296q();
            this.f7612h.close();
            new C3997a(audioTrack).start();
        }
    }

    /* renamed from: b */
    public boolean mo23932b() {
        return !mo23962O() || (this.f7599U && !mo23938k());
    }

    /* renamed from: f */
    public C3206r mo23933f() {
        return this.f7629y;
    }

    /* renamed from: g */
    public C3206r mo23934g(C3206r rVar) {
        if (!mo23962O() || this.f7626v) {
            C3206r rVar2 = this.f7628x;
            if (rVar2 == null) {
                rVar2 = !this.f7614j.isEmpty() ? this.f7614j.getLast().f7637a : this.f7629y;
            }
            if (!rVar.equals(rVar2)) {
                if (mo23962O()) {
                    this.f7628x = rVar;
                } else {
                    this.f7629y = this.f7606b.mo23975a(rVar);
                }
            }
            return this.f7629y;
        }
        C3206r rVar3 = C3206r.f6028e;
        this.f7629y = rVar3;
        return rVar3;
    }

    /* renamed from: h */
    public boolean mo23935h(int i, int i2) {
        if (!C3152e0.m7777Q(i2)) {
            C2602i iVar = this.f7605a;
            if (iVar == null || !iVar.mo18236d(i2) || (i != -1 && i > this.f7605a.mo18235c())) {
                return false;
            }
            return true;
        } else if (i2 != 4 || C3152e0.f5819a >= 21) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: i */
    public void mo23936i(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, int i6) {
        this.f7620p = i3;
        this.f7618n = C3152e0.m7777Q(i);
        boolean z = true;
        int i7 = 0;
        this.f7619o = this.f7607c && mo23935h(i2, 4) && C3152e0.m7776P(i);
        if (this.f7618n) {
            this.f7582D = C3152e0.m7770J(i, i2);
        }
        boolean z2 = this.f7618n && i != 4;
        if (!z2 || this.f7619o) {
            z = false;
        }
        this.f7626v = z;
        if (C3152e0.f5819a < 21 && i2 == 8 && iArr == null) {
            int[] iArr2 = new int[6];
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = i8;
            }
            iArr = iArr2;
        }
        if (z2) {
            this.f7609e.mo18384l(i5, i6);
            this.f7608d.mo18317j(iArr);
            AudioProcessor[] D = mo23954D();
            int length = D.length;
            boolean z3 = false;
            while (i7 < length) {
                AudioProcessor audioProcessor = D[i7];
                try {
                    z3 |= audioProcessor.mo18315i(i3, i2, i);
                    if (audioProcessor.isActive()) {
                        i2 = audioProcessor.mo18310e();
                        i3 = audioProcessor.mo18311f();
                        i = audioProcessor.mo18313g();
                    }
                    i7++;
                } catch (AudioProcessor.UnhandledFormatException e) {
                    throw new AudioSink.ConfigurationException((Throwable) e);
                }
            }
            i7 = z3;
        }
        int E = m10293E(i2, this.f7618n);
        if (E == 0) {
            throw new AudioSink.ConfigurationException("Unsupported channel count: " + i2);
        } else if (i7 != 0 || !mo23962O() || this.f7623s != i || this.f7621q != i3 || this.f7622r != E) {
            mo23931a();
            this.f7625u = z2;
            this.f7621q = i3;
            this.f7622r = E;
            this.f7623s = i;
            this.f7585G = this.f7618n ? C3152e0.m7770J(i, i2) : -1;
            if (i4 == 0) {
                i4 = mo23955F();
            }
            this.f7627w = i4;
        }
    }

    /* renamed from: j */
    public void mo23937j() {
        if (!this.f7599U && mo23962O() && mo23972z()) {
            this.f7613i.mo18287g(mo23957J());
            this.f7617m.stop();
            this.f7581C = 0;
            this.f7599U = true;
        }
    }

    /* renamed from: k */
    public boolean mo23938k() {
        return mo23962O() && this.f7613i.mo18288h(mo23957J());
    }

    /* renamed from: l */
    public long mo23939l(boolean z) {
        if (!mo23962O() || this.f7589K == 0) {
            return Long.MIN_VALUE;
        }
        return this.f7590L + mo23969w(mo23970x(Math.min(this.f7613i.mo18284d(z), mo23953C(mo23957J()))));
    }

    /* renamed from: m */
    public void mo23940m() {
        if (this.f7603Y) {
            this.f7603Y = false;
            this.f7601W = 0;
            mo23931a();
        }
    }

    /* renamed from: n */
    public void mo23941n(C2599h hVar) {
        if (!this.f7624t.equals(hVar)) {
            this.f7624t = hVar;
            if (!this.f7603Y) {
                mo23931a();
                this.f7601W = 0;
            }
        }
    }

    /* renamed from: o */
    public void mo23942o() {
        if (this.f7589K == 1) {
            this.f7589K = 2;
        }
    }

    /* renamed from: p */
    public void mo23943p(float f) {
        if (this.f7591M != f) {
            this.f7591M = f;
            mo23965R();
        }
    }

    public void pause() {
        this.f7600V = false;
        if (mo23962O() && this.f7613i.mo18295p()) {
            this.f7617m.pause();
        }
    }

    public void play() {
        this.f7600V = true;
        if (mo23962O()) {
            this.f7613i.mo18299t();
            this.f7617m.play();
        }
    }

    /* renamed from: q */
    public boolean mo23946q(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f7594P;
        C3151e.m7753a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!mo23962O()) {
            mo23958K();
            if (this.f7600V) {
                play();
            }
        }
        if (!this.f7613i.mo18291k(mo23957J())) {
            return false;
        }
        if (this.f7594P == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.f7618n && this.f7588J == 0) {
                int G = m10294G(this.f7623s, byteBuffer2);
                this.f7588J = G;
                if (G == 0) {
                    return true;
                }
            }
            if (this.f7628x != null) {
                if (!mo23972z()) {
                    return false;
                }
                C3206r rVar = this.f7628x;
                this.f7628x = null;
                this.f7614j.add(new C4001e(this.f7606b.mo23975a(rVar), Math.max(0, j2), mo23953C(mo23957J()), (C3997a) null));
                mo23966U();
            }
            if (this.f7589K == 0) {
                this.f7590L = Math.max(0, j2);
                this.f7589K = 1;
            } else {
                long N = this.f7590L + mo23961N(mo23956I() - this.f7609e.mo18382j());
                if (this.f7589K == 1 && Math.abs(N - j2) > 200000) {
                    C3163m.m7877c("AudioTrack", "Discontinuity detected [expected " + N + ", got " + j2 + "]");
                    this.f7589K = 2;
                }
                if (this.f7589K == 2) {
                    long j3 = j2 - N;
                    this.f7590L += j3;
                    this.f7589K = 1;
                    AudioSink.C3996a aVar = this.f7615k;
                    if (!(aVar == null || j3 == 0)) {
                        aVar.mo18345c();
                    }
                }
            }
            if (this.f7618n) {
                this.f7583E += (long) byteBuffer.remaining();
            } else {
                this.f7584F += (long) this.f7588J;
            }
            this.f7594P = byteBuffer2;
        }
        if (this.f7625u) {
            mo23963P(j2);
        } else {
            mo23967V(this.f7594P, j2);
        }
        if (!this.f7594P.hasRemaining()) {
            this.f7594P = null;
            return true;
        } else if (!this.f7613i.mo18290j(mo23957J())) {
            return false;
        } else {
            C3163m.m7880f("AudioTrack", "Resetting stalled audio track");
            mo23931a();
            return true;
        }
    }

    /* renamed from: r */
    public void mo23947r(int i) {
        C3151e.m7759g(C3152e0.f5819a >= 21);
        if (!this.f7603Y || this.f7601W != i) {
            this.f7603Y = true;
            this.f7601W = i;
            mo23931a();
        }
    }

    public void release() {
        mo23931a();
        mo23964Q();
        for (AudioProcessor a : this.f7610f) {
            a.mo18306a();
        }
        for (AudioProcessor a2 : this.f7611g) {
            a2.mo18306a();
        }
        this.f7601W = 0;
        this.f7600V = false;
    }

    /* renamed from: s */
    public void mo23949s(AudioSink.C3996a aVar) {
        this.f7615k = aVar;
    }

    /* renamed from: t */
    public void mo23950t(C2614o oVar) {
        if (!this.f7602X.equals(oVar)) {
            int i = oVar.f3168a;
            float f = oVar.f3169b;
            AudioTrack audioTrack = this.f7617m;
            if (audioTrack != null) {
                if (this.f7602X.f3168a != i) {
                    audioTrack.attachAuxEffect(i);
                }
                if (i != 0) {
                    this.f7617m.setAuxEffectSendLevel(f);
                }
            }
            this.f7602X = oVar;
        }
    }

    /* renamed from: w */
    public final long mo23969w(long j) {
        return j + mo23953C(this.f7606b.mo23977c());
    }

    /* renamed from: x */
    public final long mo23970x(long j) {
        long j2;
        long F;
        C4001e eVar = null;
        while (!this.f7614j.isEmpty() && j >= this.f7614j.getFirst().f7639c) {
            eVar = this.f7614j.remove();
        }
        if (eVar != null) {
            this.f7629y = eVar.f7637a;
            this.f7579A = eVar.f7639c;
            this.f7630z = eVar.f7638b - this.f7590L;
        }
        if (this.f7629y.f6029a == 1.0f) {
            return (j + this.f7630z) - this.f7579A;
        }
        if (this.f7614j.isEmpty()) {
            j2 = this.f7630z;
            F = this.f7606b.mo23976b(j - this.f7579A);
        } else {
            j2 = this.f7630z;
            F = C3152e0.m7766F(j - this.f7579A, this.f7629y.f6029a);
        }
        return j2 + F;
    }

    @TargetApi(21)
    /* renamed from: y */
    public final AudioTrack mo23971y() {
        AudioAttributes audioAttributes;
        if (this.f7603Y) {
            audioAttributes = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributes = this.f7624t.mo18229a();
        }
        AudioAttributes audioAttributes2 = audioAttributes;
        AudioFormat build = new AudioFormat.Builder().setChannelMask(this.f7622r).setEncoding(this.f7623s).setSampleRate(this.f7621q).build();
        int i = this.f7601W;
        if (i == 0) {
            i = 0;
        }
        return new AudioTrack(audioAttributes2, build, this.f7627w, 1, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23972z() {
        /*
            r9 = this;
            int r0 = r9.f7598T
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f7625u
            if (r0 == 0) goto L_0x000d
            r0 = r3
            goto L_0x0010
        L_0x000d:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r9.f7592N
            int r0 = r0.length
        L_0x0010:
            r9.f7598T = r0
        L_0x0012:
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            int r4 = r9.f7598T
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.f7592N
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo18314h()
        L_0x0028:
            r9.mo23963P(r7)
            boolean r0 = r4.mo18307b()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f7598T
            int r0 = r0 + r2
            r9.f7598T = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f7595Q
            if (r0 == 0) goto L_0x0044
            r9.mo23967V(r0, r7)
            java.nio.ByteBuffer r0 = r9.f7595Q
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f7598T = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.mo23972z():boolean");
    }

    public DefaultAudioSink(@Nullable C2602i iVar, AudioProcessor[] audioProcessorArr, boolean z) {
        this(iVar, (C3999c) new C4000d(audioProcessorArr), z);
    }

    public DefaultAudioSink(@Nullable C2602i iVar, C3999c cVar, boolean z) {
        this.f7605a = iVar;
        C3151e.m7757e(cVar);
        this.f7606b = cVar;
        this.f7607c = z;
        this.f7612h = new ConditionVariable(true);
        this.f7613i = new C2612n(new C4002f(this, (C3997a) null));
        this.f7608d = new C2615p();
        this.f7609e = new C2625x();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new AudioProcessor[]{new C2621t(), this.f7608d, this.f7609e});
        Collections.addAll(arrayList, cVar.mo23978d());
        this.f7610f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[arrayList.size()]);
        this.f7611g = new AudioProcessor[]{new C2617r()};
        this.f7591M = 1.0f;
        this.f7589K = 0;
        this.f7624t = C2599h.f3109e;
        this.f7601W = 0;
        this.f7602X = new C2614o(0, 0.0f);
        this.f7629y = C3206r.f6028e;
        this.f7598T = -1;
        this.f7592N = new AudioProcessor[0];
        this.f7593O = new ByteBuffer[0];
        this.f7614j = new ArrayDeque<>();
    }
}
