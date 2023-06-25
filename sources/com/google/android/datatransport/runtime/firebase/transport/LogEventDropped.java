package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;
import p040c.p200q.p363c.p385q.p388j.C6730e;

public final class LogEventDropped {

    /* renamed from: a */
    public final long f7542a;

    /* renamed from: b */
    public final Reason f7543b;

    public enum Reason implements C6730e {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        public final int number_;

        /* access modifiers changed from: public */
        Reason(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* renamed from: com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$a */
    public static final class C3991a {

        /* renamed from: a */
        public long f7544a = 0;

        /* renamed from: b */
        public Reason f7545b = Reason.REASON_UNKNOWN;

        /* renamed from: a */
        public LogEventDropped mo23895a() {
            return new LogEventDropped(this.f7544a, this.f7545b);
        }

        /* renamed from: b */
        public C3991a mo23896b(long j) {
            this.f7544a = j;
            return this;
        }

        /* renamed from: c */
        public C3991a mo23897c(Reason reason) {
            this.f7545b = reason;
            return this;
        }
    }

    static {
        new C3991a().mo23895a();
    }

    public LogEventDropped(long j, Reason reason) {
        this.f7542a = j;
        this.f7543b = reason;
    }

    /* renamed from: c */
    public static C3991a m10206c() {
        return new C3991a();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public long mo23892a() {
        return this.f7542a;
    }

    @Protobuf(tag = 3)
    /* renamed from: b */
    public Reason mo23893b() {
        return this.f7543b;
    }
}
