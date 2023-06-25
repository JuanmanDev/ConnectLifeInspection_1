package p648m.p660d.p664i;

import androidx.core.view.PointerIconCompat;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidDataException;
import p648m.p660d.p667l.C9683c;

/* renamed from: m.d.i.j */
/* compiled from: TextFrame */
public class C9668j extends C9662e {
    public C9668j() {
        super(Opcode.TEXT);
    }

    /* renamed from: h */
    public void mo50474h() {
        super.mo50474h();
        if (!C9683c.m26146b(mo50473f())) {
            throw new InvalidDataException((int) PointerIconCompat.TYPE_CROSSHAIR, "Received text is no valid utf8 string!");
        }
    }
}
