package p040c.p200q.p201a.p219b.p235h0.p238h;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import p040c.p200q.p201a.p219b.p235h0.C2828a;
import p040c.p200q.p201a.p219b.p235h0.C2831c;
import p040c.p200q.p201a.p219b.p261o0.C3146b0;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.h0.h.a */
/* compiled from: SpliceInfoDecoder */
public final class C2840a implements C2828a {

    /* renamed from: a */
    public final C3173t f4419a = new C3173t();

    /* renamed from: b */
    public final C3172s f4420b = new C3172s();

    /* renamed from: c */
    public C3146b0 f4421c;

    /* renamed from: a */
    public Metadata mo18898a(C2831c cVar) {
        C3146b0 b0Var = this.f4421c;
        if (b0Var == null || cVar.f4399p != b0Var.mo19947e()) {
            C3146b0 b0Var2 = new C3146b0(cVar.f3308n);
            this.f4421c = b0Var2;
            b0Var2.mo19943a(cVar.f3308n - cVar.f4399p);
        }
        ByteBuffer byteBuffer = cVar.f3307m;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f4419a.mo20004J(array, limit);
        this.f4420b.mo19990m(array, limit);
        this.f4420b.mo19993p(39);
        long h = (((long) this.f4420b.mo19985h(1)) << 32) | ((long) this.f4420b.mo19985h(32));
        this.f4420b.mo19993p(20);
        int h2 = this.f4420b.mo19985h(12);
        int h3 = this.f4420b.mo19985h(8);
        Metadata.Entry entry = null;
        this.f4419a.mo20007M(14);
        if (h3 == 0) {
            entry = new SpliceNullCommand();
        } else if (h3 == 255) {
            entry = PrivateCommand.m10509a(this.f4419a, h2, h);
        } else if (h3 == 4) {
            entry = SpliceScheduleCommand.m10519a(this.f4419a);
        } else if (h3 == 5) {
            entry = SpliceInsertCommand.m10512a(this.f4419a, h, this.f4421c);
        } else if (h3 == 6) {
            entry = TimeSignalCommand.m10532a(this.f4419a, h, this.f4421c);
        }
        if (entry == null) {
            return new Metadata(new Metadata.Entry[0]);
        }
        return new Metadata(entry);
    }
}
