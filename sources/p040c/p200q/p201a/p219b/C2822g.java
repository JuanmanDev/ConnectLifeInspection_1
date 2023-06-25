package p040c.p200q.p201a.p219b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.util.ArrayList;
import p040c.p200q.p201a.p219b.p221c0.C2608l;
import p040c.p200q.p201a.p219b.p223e0.C2650i;
import p040c.p200q.p201a.p219b.p223e0.C2656m;
import p040c.p200q.p201a.p219b.p234g0.C2824b;
import p040c.p200q.p201a.p219b.p235h0.C2832d;
import p040c.p200q.p201a.p219b.p235h0.C2833e;
import p040c.p200q.p201a.p219b.p250l0.C3040i;
import p040c.p200q.p201a.p219b.p250l0.C3041j;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p262p0.C3192j;
import p040c.p200q.p201a.p219b.p262p0.C3201n;
import p040c.p200q.p201a.p219b.p262p0.p263o.C3204b;

/* renamed from: c.q.a.b.g */
/* compiled from: DefaultRenderersFactory */
public class C2822g implements C3215x {

    /* renamed from: a */
    public final Context f4382a;
    @Nullable

    /* renamed from: b */
    public C2650i<C2656m> f4383b;

    /* renamed from: c */
    public int f4384c = 0;

    /* renamed from: d */
    public long f4385d = 5000;

    /* renamed from: e */
    public boolean f4386e;

    /* renamed from: f */
    public C2824b f4387f = C2824b.f4396a;

    public C2822g(Context context) {
        this.f4382a = context;
    }

    /* renamed from: a */
    public C3212u[] mo18876a(Handler handler, C3201n nVar, C2608l lVar, C3040i iVar, C2832d dVar, @Nullable C2650i<C2656m> iVar2) {
        C2650i<C2656m> iVar3 = iVar2 == null ? this.f4383b : iVar2;
        ArrayList arrayList = new ArrayList();
        C2650i<C2656m> iVar4 = iVar3;
        mo18883h(this.f4382a, this.f4384c, this.f4387f, iVar4, this.f4386e, handler, nVar, this.f4385d, arrayList);
        mo18878c(this.f4382a, this.f4384c, this.f4387f, iVar4, this.f4386e, mo18877b(), handler, lVar, arrayList);
        ArrayList arrayList2 = arrayList;
        mo18882g(this.f4382a, iVar, handler.getLooper(), this.f4384c, arrayList2);
        mo18880e(this.f4382a, dVar, handler.getLooper(), this.f4384c, arrayList2);
        mo18879d(this.f4382a, this.f4384c, arrayList);
        Handler handler2 = handler;
        mo18881f(this.f4382a, handler, this.f4384c, arrayList);
        return (C3212u[]) arrayList.toArray(new C3212u[arrayList.size()]);
    }

    /* renamed from: b */
    public AudioProcessor[] mo18877b() {
        return new AudioProcessor[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063 A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x006f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18878c(android.content.Context r16, int r17, p040c.p200q.p201a.p219b.p234g0.C2824b r18, @androidx.annotation.Nullable p040c.p200q.p201a.p219b.p223e0.C2650i<p040c.p200q.p201a.p219b.p223e0.C2656m> r19, boolean r20, com.google.android.exoplayer2.audio.AudioProcessor[] r21, android.os.Handler r22, p040c.p200q.p201a.p219b.p221c0.C2608l r23, java.util.ArrayList<p040c.p200q.p201a.p219b.C3212u> r24) {
        /*
            r15 = this;
            r0 = r17
            r10 = r24
            java.lang.String r11 = "DefaultRenderersFactory"
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r12 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            java.lang.Class<c.q.a.b.c0.l> r13 = p040c.p200q.p201a.p219b.p221c0.C2608l.class
            c.q.a.b.c0.s r14 = new c.q.a.b.c0.s
            c.q.a.b.c0.i r8 = p040c.p200q.p201a.p219b.p221c0.C2602i.m4828a(r16)
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r22
            r7 = r23
            r9 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.add(r14)
            if (r0 != 0) goto L_0x0028
            return
        L_0x0028:
            int r1 = r24.size()
            r2 = 2
            if (r0 != r2) goto L_0x0031
            int r1 = r1 + -1
        L_0x0031:
            r0 = 0
            r3 = 3
            r4 = 1
            java.lang.String r5 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r6[r4] = r13     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r6[r2] = r12     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.reflect.Constructor r5 = r5.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r6[r0] = r22     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r6[r4] = r23     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            r6[r2] = r21     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            java.lang.Object r5 = r5.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            c.q.a.b.u r5 = (p040c.p200q.p201a.p219b.C3212u) r5     // Catch:{ ClassNotFoundException -> 0x006c, Exception -> 0x0063 }
            int r6 = r1 + 1
            r10.add(r1, r5)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x0063 }
            java.lang.String r1 = "Loaded LibopusAudioRenderer."
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7879e(r11, r1)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x0063 }
            goto L_0x006d
        L_0x0061:
            r1 = r6
            goto L_0x006c
        L_0x0063:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x006c:
            r6 = r1
        L_0x006d:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r5[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            r5[r4] = r13     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            r5[r2] = r12     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            r5[r0] = r22     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            r5[r4] = r23     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            r5[r2] = r21     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            java.lang.Object r1 = r1.newInstance(r5)     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            c.q.a.b.u r1 = (p040c.p200q.p201a.p219b.C3212u) r1     // Catch:{ ClassNotFoundException -> 0x00a5, Exception -> 0x009c }
            int r5 = r6 + 1
            r10.add(r6, r1)     // Catch:{ ClassNotFoundException -> 0x009a, Exception -> 0x009c }
            java.lang.String r1 = "Loaded LibflacAudioRenderer."
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7879e(r11, r1)     // Catch:{ ClassNotFoundException -> 0x009a, Exception -> 0x009c }
            goto L_0x00a6
        L_0x009a:
            r6 = r5
            goto L_0x00a5
        L_0x009c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00a5:
            r5 = r6
        L_0x00a6:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            java.lang.Class<android.os.Handler> r7 = android.os.Handler.class
            r6[r0] = r7     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            r6[r4] = r13     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            r6[r2] = r12     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            r3[r0] = r22     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            r3[r4] = r23     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            r3[r2] = r21     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            java.lang.Object r0 = r1.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            c.q.a.b.u r0 = (p040c.p200q.p201a.p219b.C3212u) r0     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            r10.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7879e(r11, r0)     // Catch:{ ClassNotFoundException -> 0x00da, Exception -> 0x00d1 }
            goto L_0x00da
        L_0x00d1:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.C2822g.mo18878c(android.content.Context, int, c.q.a.b.g0.b, c.q.a.b.e0.i, boolean, com.google.android.exoplayer2.audio.AudioProcessor[], android.os.Handler, c.q.a.b.c0.l, java.util.ArrayList):void");
    }

    /* renamed from: d */
    public void mo18879d(Context context, int i, ArrayList<C3212u> arrayList) {
        arrayList.add(new C3204b());
    }

    /* renamed from: e */
    public void mo18880e(Context context, C2832d dVar, Looper looper, int i, ArrayList<C3212u> arrayList) {
        arrayList.add(new C2833e(dVar, looper));
    }

    /* renamed from: f */
    public void mo18881f(Context context, Handler handler, int i, ArrayList<C3212u> arrayList) {
    }

    /* renamed from: g */
    public void mo18882g(Context context, C3040i iVar, Looper looper, int i, ArrayList<C3212u> arrayList) {
        arrayList.add(new C3041j(iVar, looper));
    }

    /* renamed from: h */
    public void mo18883h(Context context, int i, C2824b bVar, @Nullable C2650i<C2656m> iVar, boolean z, Handler handler, C3201n nVar, long j, ArrayList<C3212u> arrayList) {
        int i2 = i;
        ArrayList<C3212u> arrayList2 = arrayList;
        arrayList2.add(new C3192j(context, bVar, j, iVar, z, handler, nVar, 50));
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (C3212u) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, C3201n.class, Integer.TYPE}).newInstance(new Object[]{Boolean.TRUE, Long.valueOf(j), handler, nVar, 50}));
                C3163m.m7879e("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating VP9 extension", e);
            }
        }
    }
}
