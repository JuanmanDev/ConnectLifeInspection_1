package okio;

import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\u0015\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00020\u0003*\u00020\u00012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\rH\b¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u00020\u00118\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u0005R\u001c\u0010\u001b\u001a\u00020\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0002\u001a\u00020\u00018G@\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0007R\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u00020\b8G@\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b\u000b\u0010\nR\"\u0010'\u001a\u00020\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u0006,"}, mo47991d2 = {"Lokio/Pipe;", "Lokio/Sink;", "sink", "", "fold", "(Lokio/Sink;)V", "-deprecated_sink", "()Lokio/Sink;", "Lokio/Source;", "-deprecated_source", "()Lokio/Source;", "source", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "forward", "(Lokio/Sink;Lkotlin/Function1;)V", "Lokio/Buffer;", "buffer", "Lokio/Buffer;", "getBuffer$okio", "()Lokio/Buffer;", "foldedSink", "Lokio/Sink;", "getFoldedSink$okio", "setFoldedSink$okio", "", "maxBufferSize", "J", "getMaxBufferSize$okio", "()J", "", "sinkClosed", "Z", "getSinkClosed$okio", "()Z", "setSinkClosed$okio", "(Z)V", "Lokio/Source;", "sourceClosed", "getSourceClosed$okio", "setSourceClosed$okio", "<init>", "(J)V", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Pipe.kt */
public final class Pipe {
    @NotNull
    public final Buffer buffer = new Buffer();
    @Nullable
    public Sink foldedSink;
    public final long maxBufferSize;
    @NotNull
    public final Sink sink;
    public boolean sinkClosed;
    @NotNull
    public final Source source;
    public boolean sourceClosed;

    public Pipe(long j) {
        this.maxBufferSize = j;
        if (this.maxBufferSize >= 1) {
            this.sink = new Pipe$sink$1(this);
            this.source = new Pipe$source$1(this);
            return;
        }
        throw new IllegalArgumentException(("maxBufferSize < 1: " + this.maxBufferSize).toString());
    }

    /* access modifiers changed from: private */
    public final void forward(@NotNull Sink sink2, Function1<? super Sink, Unit> function1) {
        Timeout timeout = sink2.timeout();
        Timeout timeout2 = sink().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        timeout.timeout(Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos()), TimeUnit.NANOSECONDS);
        if (timeout.hasDeadline()) {
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                function1.invoke(sink2);
            } finally {
                InlineMarker.finallyStart(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                InlineMarker.finallyEnd(1);
            }
        } else {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                function1.invoke(sink2);
            } finally {
                InlineMarker.finallyStart(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                InlineMarker.finallyEnd(1);
            }
        }
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sink", imports = {}))
    @JvmName(name = "-deprecated_sink")
    /* renamed from: -deprecated_sink  reason: not valid java name */
    public final Sink m29002deprecated_sink() {
        return this.sink;
    }

    @NotNull
    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "source", imports = {}))
    @JvmName(name = "-deprecated_source")
    /* renamed from: -deprecated_source  reason: not valid java name */
    public final Source m29003deprecated_source() {
        return this.source;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8.write(r3, r3.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r8.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        monitor-enter(r7.buffer);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r7.sourceClosed = true;
        r1 = r7.buffer;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        if (r1 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        throw new kotlin.TypeCastException("null cannot be cast to non-null type java.lang.Object");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005a, code lost:
        r1.notifyAll();
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void fold(@org.jetbrains.annotations.NotNull okio.Sink r8) {
        /*
            r7 = this;
        L_0x0000:
            okio.Buffer r0 = r7.buffer
            monitor-enter(r0)
            okio.Sink r1 = r7.foldedSink     // Catch:{ all -> 0x0078 }
            r2 = 1
            if (r1 != 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = 0
        L_0x000b:
            if (r1 == 0) goto L_0x006c
            okio.Buffer r1 = r7.buffer     // Catch:{ all -> 0x0078 }
            boolean r1 = r1.exhausted()     // Catch:{ all -> 0x0078 }
            if (r1 == 0) goto L_0x001b
            r7.sourceClosed = r2     // Catch:{ all -> 0x0078 }
            r7.foldedSink = r8     // Catch:{ all -> 0x0078 }
            monitor-exit(r0)
            return
        L_0x001b:
            boolean r1 = r7.sinkClosed     // Catch:{ all -> 0x0078 }
            okio.Buffer r3 = new okio.Buffer     // Catch:{ all -> 0x0078 }
            r3.<init>()     // Catch:{ all -> 0x0078 }
            okio.Buffer r4 = r7.buffer     // Catch:{ all -> 0x0078 }
            okio.Buffer r5 = r7.buffer     // Catch:{ all -> 0x0078 }
            long r5 = r5.size()     // Catch:{ all -> 0x0078 }
            r3.write((okio.Buffer) r4, (long) r5)     // Catch:{ all -> 0x0078 }
            okio.Buffer r4 = r7.buffer     // Catch:{ all -> 0x0078 }
            if (r4 == 0) goto L_0x0064
            r4.notifyAll()     // Catch:{ all -> 0x0078 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0078 }
            monitor-exit(r0)
            long r4 = r3.size()     // Catch:{ all -> 0x0048 }
            r8.write(r3, r4)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0044
            r8.close()     // Catch:{ all -> 0x0048 }
            goto L_0x0000
        L_0x0044:
            r8.flush()     // Catch:{ all -> 0x0048 }
            goto L_0x0000
        L_0x0048:
            r8 = move-exception
            okio.Buffer r0 = r7.buffer
            monitor-enter(r0)
            r7.sourceClosed = r2     // Catch:{ all -> 0x0061 }
            okio.Buffer r1 = r7.buffer     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x005a
            kotlin.TypeCastException r8 = new kotlin.TypeCastException     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch:{ all -> 0x0061 }
            throw r8     // Catch:{ all -> 0x0061 }
        L_0x005a:
            r1.notifyAll()     // Catch:{ all -> 0x0061 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)
            throw r8
        L_0x0061:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x0064:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException     // Catch:{ all -> 0x0078 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            r8.<init>(r1)     // Catch:{ all -> 0x0078 }
            throw r8     // Catch:{ all -> 0x0078 }
        L_0x006c:
            java.lang.String r8 = "sink already folded"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0078 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0078 }
            r1.<init>(r8)     // Catch:{ all -> 0x0078 }
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Pipe.fold(okio.Sink):void");
    }

    @NotNull
    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    @Nullable
    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setFoldedSink$okio(@Nullable Sink sink2) {
        this.foldedSink = sink2;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.sinkClosed = z;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.sourceClosed = z;
    }

    @NotNull
    @JvmName(name = "sink")
    public final Sink sink() {
        return this.sink;
    }

    @NotNull
    @JvmName(name = "source")
    public final Source source() {
        return this.source;
    }
}
