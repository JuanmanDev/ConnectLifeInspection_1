package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.Protobuf;
import p040c.p200q.p363c.p385q.p388j.C6730e;

public final class MessagingClientEvent {

    /* renamed from: a */
    public final long f15464a;

    /* renamed from: b */
    public final String f15465b;

    /* renamed from: c */
    public final String f15466c;

    /* renamed from: d */
    public final MessageType f15467d;

    /* renamed from: e */
    public final SDKPlatform f15468e;

    /* renamed from: f */
    public final String f15469f;

    /* renamed from: g */
    public final String f15470g;

    /* renamed from: h */
    public final int f15471h;

    /* renamed from: i */
    public final int f15472i;

    /* renamed from: j */
    public final String f15473j;

    /* renamed from: k */
    public final long f15474k;

    /* renamed from: l */
    public final Event f15475l;

    /* renamed from: m */
    public final String f15476m;

    /* renamed from: n */
    public final long f15477n;

    /* renamed from: o */
    public final String f15478o;

    public enum Event implements C6730e {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        public final int number_;

        /* access modifiers changed from: public */
        Event(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements C6730e {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        public final int number_;

        /* access modifiers changed from: public */
        MessageType(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements C6730e {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        public final int number_;

        /* access modifiers changed from: public */
        SDKPlatform(int i) {
            this.number_ = i;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    /* renamed from: com.google.firebase.messaging.reporting.MessagingClientEvent$a */
    public static final class C8296a {

        /* renamed from: a */
        public long f15479a = 0;

        /* renamed from: b */
        public String f15480b = "";

        /* renamed from: c */
        public String f15481c = "";

        /* renamed from: d */
        public MessageType f15482d = MessageType.UNKNOWN;

        /* renamed from: e */
        public SDKPlatform f15483e = SDKPlatform.UNKNOWN_OS;

        /* renamed from: f */
        public String f15484f = "";

        /* renamed from: g */
        public String f15485g = "";

        /* renamed from: h */
        public int f15486h = 0;

        /* renamed from: i */
        public int f15487i = 0;

        /* renamed from: j */
        public String f15488j = "";

        /* renamed from: k */
        public long f15489k = 0;

        /* renamed from: l */
        public Event f15490l = Event.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f15491m = "";

        /* renamed from: n */
        public long f15492n = 0;

        /* renamed from: o */
        public String f15493o = "";

        /* renamed from: a */
        public MessagingClientEvent mo37495a() {
            return new MessagingClientEvent(this.f15479a, this.f15480b, this.f15481c, this.f15482d, this.f15483e, this.f15484f, this.f15485g, this.f15486h, this.f15487i, this.f15488j, this.f15489k, this.f15490l, this.f15491m, this.f15492n, this.f15493o);
        }

        /* renamed from: b */
        public C8296a mo37496b(String str) {
            this.f15491m = str;
            return this;
        }

        /* renamed from: c */
        public C8296a mo37497c(String str) {
            this.f15485g = str;
            return this;
        }

        /* renamed from: d */
        public C8296a mo37498d(String str) {
            this.f15493o = str;
            return this;
        }

        /* renamed from: e */
        public C8296a mo37499e(Event event) {
            this.f15490l = event;
            return this;
        }

        /* renamed from: f */
        public C8296a mo37500f(String str) {
            this.f15481c = str;
            return this;
        }

        /* renamed from: g */
        public C8296a mo37501g(String str) {
            this.f15480b = str;
            return this;
        }

        /* renamed from: h */
        public C8296a mo37502h(MessageType messageType) {
            this.f15482d = messageType;
            return this;
        }

        /* renamed from: i */
        public C8296a mo37503i(String str) {
            this.f15484f = str;
            return this;
        }

        /* renamed from: j */
        public C8296a mo37504j(long j) {
            this.f15479a = j;
            return this;
        }

        /* renamed from: k */
        public C8296a mo37505k(SDKPlatform sDKPlatform) {
            this.f15483e = sDKPlatform;
            return this;
        }

        /* renamed from: l */
        public C8296a mo37506l(String str) {
            this.f15488j = str;
            return this;
        }

        /* renamed from: m */
        public C8296a mo37507m(int i) {
            this.f15487i = i;
            return this;
        }
    }

    static {
        new C8296a().mo37495a();
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.f15464a = j;
        this.f15465b = str;
        this.f15466c = str2;
        this.f15467d = messageType;
        this.f15468e = sDKPlatform;
        this.f15469f = str3;
        this.f15470g = str4;
        this.f15471h = i;
        this.f15472i = i2;
        this.f15473j = str5;
        this.f15474k = j2;
        this.f15475l = event;
        this.f15476m = str6;
        this.f15477n = j3;
        this.f15478o = str7;
    }

    /* renamed from: p */
    public static C8296a m23049p() {
        return new C8296a();
    }

    @Protobuf(tag = 13)
    /* renamed from: a */
    public String mo37480a() {
        return this.f15476m;
    }

    @Protobuf(tag = 11)
    /* renamed from: b */
    public long mo37481b() {
        return this.f15474k;
    }

    @Protobuf(tag = 14)
    /* renamed from: c */
    public long mo37482c() {
        return this.f15477n;
    }

    @Protobuf(tag = 7)
    /* renamed from: d */
    public String mo37483d() {
        return this.f15470g;
    }

    @Protobuf(tag = 15)
    /* renamed from: e */
    public String mo37484e() {
        return this.f15478o;
    }

    @Protobuf(tag = 12)
    /* renamed from: f */
    public Event mo37485f() {
        return this.f15475l;
    }

    @Protobuf(tag = 3)
    /* renamed from: g */
    public String mo37486g() {
        return this.f15466c;
    }

    @Protobuf(tag = 2)
    /* renamed from: h */
    public String mo37487h() {
        return this.f15465b;
    }

    @Protobuf(tag = 4)
    /* renamed from: i */
    public MessageType mo37488i() {
        return this.f15467d;
    }

    @Protobuf(tag = 6)
    /* renamed from: j */
    public String mo37489j() {
        return this.f15469f;
    }

    @Protobuf(tag = 8)
    /* renamed from: k */
    public int mo37490k() {
        return this.f15471h;
    }

    @Protobuf(tag = 1)
    /* renamed from: l */
    public long mo37491l() {
        return this.f15464a;
    }

    @Protobuf(tag = 5)
    /* renamed from: m */
    public SDKPlatform mo37492m() {
        return this.f15468e;
    }

    @Protobuf(tag = 10)
    /* renamed from: n */
    public String mo37493n() {
        return this.f15473j;
    }

    @Protobuf(tag = 9)
    /* renamed from: o */
    public int mo37494o() {
        return this.f15472i;
    }
}
