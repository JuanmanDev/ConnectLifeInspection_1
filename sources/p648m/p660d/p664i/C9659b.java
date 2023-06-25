package p648m.p660d.p664i;

import androidx.core.view.PointerIconCompat;
import java.nio.ByteBuffer;
import okhttp3.internal.p700ws.WebSocketProtocol;
import org.java_websocket.enums.Opcode;
import org.java_websocket.exceptions.InvalidDataException;
import org.java_websocket.exceptions.InvalidFrameException;
import p648m.p660d.p667l.C9682b;
import p648m.p660d.p667l.C9683c;

/* renamed from: m.d.i.b */
/* compiled from: CloseFrame */
public class C9659b extends C9661d {

    /* renamed from: h */
    public int f18930h;

    /* renamed from: i */
    public String f18931i;

    public C9659b() {
        super(Opcode.CLOSING);
        mo50480q("");
        mo50479p(1000);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9659b.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C9659b bVar = (C9659b) obj;
        if (this.f18930h != bVar.f18930h) {
            return false;
        }
        String str = this.f18931i;
        String str2 = bVar.f18931i;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public ByteBuffer mo50473f() {
        if (this.f18930h == 1005) {
            return C9682b.m26144a();
        }
        return super.mo50473f();
    }

    /* renamed from: h */
    public void mo50474h() {
        super.mo50474h();
        if (this.f18930h == 1007 && this.f18931i.isEmpty()) {
            throw new InvalidDataException((int) PointerIconCompat.TYPE_CROSSHAIR, "Received text is no valid utf8 string!");
        } else if (this.f18930h != 1005 || this.f18931i.length() <= 0) {
            int i = this.f18930h;
            if (i <= 1015 || i >= 3000) {
                int i2 = this.f18930h;
                if (i2 == 1006 || i2 == 1015 || i2 == 1005 || i2 > 4999 || i2 < 1000 || i2 == 1004) {
                    throw new InvalidFrameException("closecode must not be sent over the wire: " + this.f18930h);
                }
                return;
            }
            throw new InvalidDataException(1002, "Trying to send an illegal close code!");
        } else {
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
    }

    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.f18930h) * 31;
        String str = this.f18931i;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: j */
    public void mo50476j(ByteBuffer byteBuffer) {
        this.f18930h = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
        this.f18931i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.f18930h = 1000;
        } else if (byteBuffer.remaining() == 1) {
            this.f18930h = 1002;
        } else {
            if (byteBuffer.remaining() >= 2) {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.position(2);
                allocate.putShort(byteBuffer.getShort());
                allocate.position(0);
                this.f18930h = allocate.getInt();
            }
            byteBuffer.reset();
            try {
                mo50482s(byteBuffer, byteBuffer.position());
            } catch (InvalidDataException unused) {
                this.f18930h = PointerIconCompat.TYPE_CROSSHAIR;
                this.f18931i = null;
            }
        }
    }

    /* renamed from: n */
    public int mo50477n() {
        return this.f18930h;
    }

    /* renamed from: o */
    public String mo50478o() {
        return this.f18931i;
    }

    /* renamed from: p */
    public void mo50479p(int i) {
        this.f18930h = i;
        if (i == 1015) {
            this.f18930h = WebSocketProtocol.CLOSE_NO_STATUS_CODE;
            this.f18931i = "";
        }
        mo50481r();
    }

    /* renamed from: q */
    public void mo50480q(String str) {
        if (str == null) {
            str = "";
        }
        this.f18931i = str;
        mo50481r();
    }

    /* renamed from: r */
    public final void mo50481r() {
        byte[] f = C9683c.m26150f(this.f18931i);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.f18930h);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(f.length + 2);
        allocate2.put(allocate);
        allocate2.put(f);
        allocate2.rewind();
        super.mo50476j(allocate2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        throw new org.java_websocket.exceptions.InvalidDataException(androidx.core.view.PointerIconCompat.TYPE_CROSSHAIR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r3.position(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50482s(java.nio.ByteBuffer r3, int r4) {
        /*
            r2 = this;
            int r0 = r3.position()     // Catch:{ IllegalArgumentException -> 0x0015 }
            int r0 = r0 + 2
            r3.position(r0)     // Catch:{ IllegalArgumentException -> 0x0015 }
            java.lang.String r0 = p648m.p660d.p667l.C9683c.m26149e(r3)     // Catch:{ IllegalArgumentException -> 0x0015 }
            r2.f18931i = r0     // Catch:{ IllegalArgumentException -> 0x0015 }
            r3.position(r4)
            return
        L_0x0013:
            r0 = move-exception
            goto L_0x001d
        L_0x0015:
            org.java_websocket.exceptions.InvalidDataException r0 = new org.java_websocket.exceptions.InvalidDataException     // Catch:{ all -> 0x0013 }
            r1 = 1007(0x3ef, float:1.411E-42)
            r0.<init>(r1)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x001d:
            r3.position(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p648m.p660d.p664i.C9659b.mo50482s(java.nio.ByteBuffer, int):void");
    }

    public String toString() {
        return super.toString() + "code: " + this.f18930h;
    }
}
