package p040c.p200q.p363c.p400x.p401e1;

import com.google.firebase.encoders.proto.Protobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import p040c.p200q.p363c.p400x.C6845o0;

/* renamed from: c.q.c.x.e1.a */
/* compiled from: MessagingClientEventExtension */
public final class C6820a {

    /* renamed from: a */
    public final MessagingClientEvent f13060a;

    /* renamed from: c.q.c.x.e1.a$a */
    /* compiled from: MessagingClientEventExtension */
    public static final class C6821a {

        /* renamed from: a */
        public MessagingClientEvent f13061a = null;

        /* renamed from: a */
        public C6820a mo31598a() {
            return new C6820a(this.f13061a);
        }

        /* renamed from: b */
        public C6821a mo31599b(MessagingClientEvent messagingClientEvent) {
            this.f13061a = messagingClientEvent;
            return this;
        }
    }

    static {
        new C6821a().mo31598a();
    }

    public C6820a(MessagingClientEvent messagingClientEvent) {
        this.f13060a = messagingClientEvent;
    }

    /* renamed from: b */
    public static C6821a m19350b() {
        return new C6821a();
    }

    @Protobuf(tag = 1)
    /* renamed from: a */
    public MessagingClientEvent mo31596a() {
        return this.f13060a;
    }

    /* renamed from: c */
    public byte[] mo31597c() {
        return C6845o0.m19462a(this);
    }
}
