package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

@Metadata(mo47989bv = {1, 0, 3}, mo47990d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, mo47991d2 = {"okio/Pipe$sink$1", "Lokio/Sink;", "", "close", "()V", "flush", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "Lokio/Buffer;", "source", "", "byteCount", "write", "(Lokio/Buffer;J)V", "Lokio/Timeout;", "okio"}, mo47992k = 1, mo47993mv = {1, 1, 15}, mo47994pn = "", mo47995xi = 0, mo47996xs = "")
/* compiled from: Pipe.kt */
public final class Pipe$sink$1 implements Sink {
    public final /* synthetic */ Pipe this$0;
    public final Timeout timeout = new Timeout();

    public Pipe$sink$1(Pipe pipe) {
        this.this$0 = pipe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r0 = r11.this$0;
        r2 = r1.timeout();
        r0 = r0.sink().timeout();
        r3 = r2.timeoutNanos();
        r2.timeout(okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r2.timeoutNanos()), java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r2.hasDeadline() == false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        r5 = r2.deadlineNanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0085, code lost:
        if (r0.hasDeadline() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        r2.deadlineNanoTime(java.lang.Math.min(r2.deadlineNanoTime(), r0.deadlineNanoTime()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r2.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r0.hasDeadline() != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b4, code lost:
        r2.deadlineNanoTime(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        if (r0.hasDeadline() == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00be, code lost:
        r2.deadlineNanoTime(r0.deadlineNanoTime());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d8, code lost:
        r2.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e1, code lost:
        if (r0.hasDeadline() != false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        r2.clearDeadline();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e6, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r11 = this;
            okio.Pipe r0 = r11.this$0
            okio.Buffer r0 = r0.getBuffer$okio()
            monitor-enter(r0)
            okio.Pipe r1 = r11.this$0     // Catch:{ all -> 0x00f0 }
            boolean r1 = r1.getSinkClosed$okio()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return
        L_0x0011:
            okio.Pipe r1 = r11.this$0     // Catch:{ all -> 0x00f0 }
            okio.Sink r1 = r1.getFoldedSink$okio()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x001a
            goto L_0x004d
        L_0x001a:
            okio.Pipe r1 = r11.this$0     // Catch:{ all -> 0x00f0 }
            boolean r1 = r1.getSourceClosed$okio()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x003b
            okio.Pipe r1 = r11.this$0     // Catch:{ all -> 0x00f0 }
            okio.Buffer r1 = r1.getBuffer$okio()     // Catch:{ all -> 0x00f0 }
            long r1 = r1.size()     // Catch:{ all -> 0x00f0 }
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "source is closed"
            r1.<init>(r2)     // Catch:{ all -> 0x00f0 }
            throw r1     // Catch:{ all -> 0x00f0 }
        L_0x003b:
            okio.Pipe r1 = r11.this$0     // Catch:{ all -> 0x00f0 }
            r2 = 1
            r1.setSinkClosed$okio(r2)     // Catch:{ all -> 0x00f0 }
            okio.Pipe r1 = r11.this$0     // Catch:{ all -> 0x00f0 }
            okio.Buffer r1 = r1.getBuffer$okio()     // Catch:{ all -> 0x00f0 }
            if (r1 == 0) goto L_0x00e8
            r1.notifyAll()     // Catch:{ all -> 0x00f0 }
            r1 = 0
        L_0x004d:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00f0 }
            monitor-exit(r0)
            if (r1 == 0) goto L_0x00e7
            okio.Pipe r0 = r11.this$0
            okio.Timeout r2 = r1.timeout()
            okio.Sink r0 = r0.sink()
            okio.Timeout r0 = r0.timeout()
            long r3 = r2.timeoutNanos()
            okio.Timeout$Companion r5 = okio.Timeout.Companion
            long r6 = r0.timeoutNanos()
            long r8 = r2.timeoutNanos()
            long r5 = r5.minTimeout(r6, r8)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.timeout(r5, r7)
            boolean r5 = r2.hasDeadline()
            if (r5 == 0) goto L_0x00b8
            long r5 = r2.deadlineNanoTime()
            boolean r7 = r0.hasDeadline()
            if (r7 == 0) goto L_0x0096
            long r7 = r2.deadlineNanoTime()
            long r9 = r0.deadlineNanoTime()
            long r7 = java.lang.Math.min(r7, r9)
            r2.deadlineNanoTime(r7)
        L_0x0096:
            r1.close()     // Catch:{ all -> 0x00a8 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.timeout(r3, r1)
            boolean r0 = r0.hasDeadline()
            if (r0 == 0) goto L_0x00e7
            r2.deadlineNanoTime(r5)
            goto L_0x00e7
        L_0x00a8:
            r1 = move-exception
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.timeout(r3, r7)
            boolean r0 = r0.hasDeadline()
            if (r0 == 0) goto L_0x00b7
            r2.deadlineNanoTime(r5)
        L_0x00b7:
            throw r1
        L_0x00b8:
            boolean r5 = r0.hasDeadline()
            if (r5 == 0) goto L_0x00c5
            long r5 = r0.deadlineNanoTime()
            r2.deadlineNanoTime(r5)
        L_0x00c5:
            r1.close()     // Catch:{ all -> 0x00d7 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.timeout(r3, r1)
            boolean r0 = r0.hasDeadline()
            if (r0 == 0) goto L_0x00e7
            r2.clearDeadline()
            goto L_0x00e7
        L_0x00d7:
            r1 = move-exception
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2.timeout(r3, r5)
            boolean r0 = r0.hasDeadline()
            if (r0 == 0) goto L_0x00e6
            r2.clearDeadline()
        L_0x00e6:
            throw r1
        L_0x00e7:
            return
        L_0x00e8:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException     // Catch:{ all -> 0x00f0 }
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            r1.<init>(r2)     // Catch:{ all -> 0x00f0 }
            throw r1     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Pipe$sink$1.close():void");
    }

    public void flush() {
        Sink foldedSink$okio;
        synchronized (this.this$0.getBuffer$okio()) {
            if (!this.this$0.getSinkClosed$okio()) {
                foldedSink$okio = this.this$0.getFoldedSink$okio();
                if (foldedSink$okio == null) {
                    if (this.this$0.getSourceClosed$okio()) {
                        if (this.this$0.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                    }
                    foldedSink$okio = null;
                }
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        if (foldedSink$okio != null) {
            Pipe pipe = this.this$0;
            Timeout timeout2 = foldedSink$okio.timeout();
            Timeout timeout3 = pipe.sink().timeout();
            long timeoutNanos = timeout2.timeoutNanos();
            timeout2.timeout(Timeout.Companion.minTimeout(timeout3.timeoutNanos(), timeout2.timeoutNanos()), TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                long deadlineNanoTime = timeout2.deadlineNanoTime();
                if (timeout3.hasDeadline()) {
                    timeout2.deadlineNanoTime(Math.min(timeout2.deadlineNanoTime(), timeout3.deadlineNanoTime()));
                }
                try {
                    foldedSink$okio.flush();
                } finally {
                    timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout3.hasDeadline()) {
                        timeout2.deadlineNanoTime(deadlineNanoTime);
                    }
                }
            } else {
                if (timeout3.hasDeadline()) {
                    timeout2.deadlineNanoTime(timeout3.deadlineNanoTime());
                }
                try {
                    foldedSink$okio.flush();
                } finally {
                    timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout3.hasDeadline()) {
                        timeout2.clearDeadline();
                    }
                }
            }
        }
    }

    @NotNull
    public Timeout timeout() {
        return this.timeout;
    }

    public void write(@NotNull Buffer buffer, long j) {
        Sink sink;
        synchronized (this.this$0.getBuffer$okio()) {
            if (!this.this$0.getSinkClosed$okio()) {
                while (true) {
                    if (j <= 0) {
                        sink = null;
                        break;
                    }
                    sink = this.this$0.getFoldedSink$okio();
                    if (sink != null) {
                        break;
                    } else if (!this.this$0.getSourceClosed$okio()) {
                        long maxBufferSize$okio = this.this$0.getMaxBufferSize$okio() - this.this$0.getBuffer$okio().size();
                        if (maxBufferSize$okio == 0) {
                            this.timeout.waitUntilNotified(this.this$0.getBuffer$okio());
                        } else {
                            long min = Math.min(maxBufferSize$okio, j);
                            this.this$0.getBuffer$okio().write(buffer, min);
                            j -= min;
                            Buffer buffer$okio = this.this$0.getBuffer$okio();
                            if (buffer$okio != null) {
                                buffer$okio.notifyAll();
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.Object");
                            }
                        }
                    } else {
                        throw new IOException("source is closed");
                    }
                }
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }
        if (sink != null) {
            Pipe pipe = this.this$0;
            Timeout timeout2 = sink.timeout();
            Timeout timeout3 = pipe.sink().timeout();
            long timeoutNanos = timeout2.timeoutNanos();
            timeout2.timeout(Timeout.Companion.minTimeout(timeout3.timeoutNanos(), timeout2.timeoutNanos()), TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                long deadlineNanoTime = timeout2.deadlineNanoTime();
                if (timeout3.hasDeadline()) {
                    timeout2.deadlineNanoTime(Math.min(timeout2.deadlineNanoTime(), timeout3.deadlineNanoTime()));
                }
                try {
                    sink.write(buffer, j);
                } finally {
                    timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout3.hasDeadline()) {
                        timeout2.deadlineNanoTime(deadlineNanoTime);
                    }
                }
            } else {
                if (timeout3.hasDeadline()) {
                    timeout2.deadlineNanoTime(timeout3.deadlineNanoTime());
                }
                try {
                    sink.write(buffer, j);
                } finally {
                    timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout3.hasDeadline()) {
                        timeout2.clearDeadline();
                    }
                }
            }
        }
    }
}
