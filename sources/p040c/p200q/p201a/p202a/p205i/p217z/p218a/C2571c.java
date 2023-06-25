package p040c.p200q.p201a.p202a.p205i.p217z.p218a;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: c.q.a.a.i.z.a.c */
/* compiled from: LogSourceMetrics */
public final class C2571c {

    /* renamed from: a */
    public final String f3029a;

    /* renamed from: b */
    public final List<LogEventDropped> f3030b;

    /* renamed from: c.q.a.a.i.z.a.c$a */
    /* compiled from: LogSourceMetrics */
    public static final class C2572a {

        /* renamed from: a */
        public String f3031a = "";

        /* renamed from: b */
        public List<LogEventDropped> f3032b = new ArrayList();

        /* renamed from: a */
        public C2571c mo18032a() {
            return new C2571c(this.f3031a, Collections.unmodifiableList(this.f3032b));
        }

        /* renamed from: b */
        public C2572a mo18033b(List<LogEventDropped> list) {
            this.f3032b = list;
            return this;
        }

        /* renamed from: c */
        public C2572a mo18034c(String str) {
            this.f3031a = str;
            return this;
        }
    }

    static {
        new C2572a().mo18032a();
    }

    public C2571c(String str, List<LogEventDropped> list) {
        this.f3029a = str;
        this.f3030b = list;
    }

    /* renamed from: c */
    public static C2572a m4616c() {
        return new C2572a();
    }

    @Protobuf(tag = 2)
    /* renamed from: a */
    public List<LogEventDropped> mo18030a() {
        return this.f3030b;
    }

    @Protobuf(tag = 1)
    /* renamed from: b */
    public String mo18031b() {
        return this.f3029a;
    }
}
