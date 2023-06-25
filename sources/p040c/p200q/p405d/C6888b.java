package p040c.p200q.p405d;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import p040c.p200q.p405d.C6954m0;

/* renamed from: c.q.d.b */
/* compiled from: AbstractParser */
public abstract class C6888b<MessageType extends C6954m0> implements C6996w0<MessageType> {
    static {
        C6975p.m20507b();
    }

    /* renamed from: c */
    public final MessageType mo31757c(MessageType messagetype) {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw mo31758d(messagetype).asInvalidProtocolBufferException().setUnfinishedMessage(messagetype);
    }

    /* renamed from: d */
    public final UninitializedMessageException mo31758d(MessageType messagetype) {
        if (messagetype instanceof C6884a) {
            return ((C6884a) messagetype).mo31736l();
        }
        return new UninitializedMessageException((C6954m0) messagetype);
    }

    /* renamed from: e */
    public MessageType mo31756a(ByteString byteString, C6975p pVar) {
        MessageType f = mo31760f(byteString, pVar);
        mo31757c(f);
        return f;
    }

    /* renamed from: f */
    public MessageType mo31760f(ByteString byteString, C6975p pVar) {
        MessageType messagetype;
        try {
            C6937j newCodedInput = byteString.newCodedInput();
            messagetype = (C6954m0) mo32408b(newCodedInput, pVar);
            newCodedInput.mo32029a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(messagetype);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }
}
