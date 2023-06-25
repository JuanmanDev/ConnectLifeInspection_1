package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UninitializedMessageException;
import java.io.IOException;
import p040c.p200q.p405d.C6884a;
import p040c.p200q.p405d.C6884a.C6885a;
import p040c.p200q.p405d.C6954m0;

/* renamed from: c.q.d.a */
/* compiled from: AbstractMessageLite */
public abstract class C6884a<MessageType extends C6884a<MessageType, BuilderType>, BuilderType extends C6885a<MessageType, BuilderType>> implements C6954m0 {

    /* renamed from: e */
    public int f13173e = 0;

    /* renamed from: c.q.d.a$a */
    /* compiled from: AbstractMessageLite */
    public static abstract class C6885a<MessageType extends C6884a<MessageType, BuilderType>, BuilderType extends C6885a<MessageType, BuilderType>> implements C6954m0.C6955a {
        /* renamed from: n */
        public static UninitializedMessageException m19565n(C6954m0 m0Var) {
            return new UninitializedMessageException(m0Var);
        }

        /* renamed from: B */
        public /* bridge */ /* synthetic */ C6954m0.C6955a mo31738B(C6954m0 m0Var) {
            mo31740k(m0Var);
            return this;
        }

        /* renamed from: j */
        public abstract BuilderType mo31739j(MessageType messagetype);

        /* renamed from: k */
        public BuilderType mo31740k(C6954m0 m0Var) {
            if (mo32244a().getClass().isInstance(m0Var)) {
                mo31739j((C6884a) m0Var);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }

        /* renamed from: l */
        public BuilderType mo31741l(byte[] bArr) {
            mo31742m(bArr, 0, bArr.length);
            return this;
        }

        /* renamed from: m */
        public abstract BuilderType mo31742m(byte[] bArr, int i, int i2);

        /* renamed from: u */
        public /* bridge */ /* synthetic */ C6954m0.C6955a mo31743u(byte[] bArr) {
            mo31741l(bArr);
            return this;
        }
    }

    /* renamed from: d */
    public ByteString mo31731d() {
        try {
            ByteString.C8413h newCodedBuilder = ByteString.newCodedBuilder(mo32217e());
            mo32216c(newCodedBuilder.mo37896b());
            return newCodedBuilder.mo37895a();
        } catch (IOException e) {
            throw new RuntimeException(mo31735k("ByteString"), e);
        }
    }

    /* renamed from: f */
    public byte[] mo31732f() {
        try {
            byte[] bArr = new byte[mo32217e()];
            CodedOutputStream e0 = CodedOutputStream.m23122e0(bArr);
            mo32216c(e0);
            e0.mo37928d();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(mo31735k("byte array"), e);
        }
    }

    /* renamed from: g */
    public int mo31733g() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: j */
    public int mo31734j(C6903d1 d1Var) {
        int g = mo31733g();
        if (g != -1) {
            return g;
        }
        int h = d1Var.mo31889h(this);
        mo31737m(h);
        return h;
    }

    /* renamed from: k */
    public final String mo31735k(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* renamed from: l */
    public UninitializedMessageException mo31736l() {
        return new UninitializedMessageException((C6954m0) this);
    }

    /* renamed from: m */
    public void mo31737m(int i) {
        throw new UnsupportedOperationException();
    }
}
