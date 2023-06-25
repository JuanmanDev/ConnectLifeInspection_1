package p040c.p200q.p201a.p219b.p260n0;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import java.io.IOException;
import okhttp3.internal.p700ws.RealWebSocket;

/* renamed from: c.q.a.b.n0.q */
/* compiled from: DefaultLoadErrorHandlingPolicy */
public class C3134q implements C3135r {

    /* renamed from: a */
    public final int f5791a;

    public C3134q() {
        this(-1);
    }

    /* renamed from: a */
    public long mo19922a(int i, long j, IOException iOException, int i2) {
        if (iOException instanceof ParserException) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * 1000, 5000);
    }

    /* renamed from: b */
    public long mo19923b(int i, long j, IOException iOException, int i2) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return -9223372036854775807L;
        }
        int i3 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        if (i3 == 404 || i3 == 410) {
            return RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS;
        }
        return -9223372036854775807L;
    }

    /* renamed from: c */
    public int mo19924c(int i) {
        int i2 = this.f5791a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public C3134q(int i) {
        this.f5791a = i;
    }
}
