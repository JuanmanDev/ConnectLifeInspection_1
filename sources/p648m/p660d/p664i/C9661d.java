package p648m.p660d.p664i;

import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidFrameException;

/* renamed from: m.d.i.d */
/* compiled from: ControlFrame */
public abstract class C9661d extends C9664g {
    public C9661d(Opcode opcode) {
        super(opcode);
    }

    /* renamed from: h */
    public void mo50474h() {
        if (!mo50488e()) {
            throw new InvalidFrameException("Control frame can't have fin==false set");
        } else if (mo50484a()) {
            throw new InvalidFrameException("Control frame can't have rsv1==true set");
        } else if (mo50485b()) {
            throw new InvalidFrameException("Control frame can't have rsv2==true set");
        } else if (mo50487d()) {
            throw new InvalidFrameException("Control frame can't have rsv3==true set");
        }
    }
}
