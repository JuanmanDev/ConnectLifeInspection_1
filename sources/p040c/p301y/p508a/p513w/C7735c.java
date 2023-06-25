package p040c.p301y.p508a.p513w;

import java.net.URI;
import p648m.p660d.p661f.C9650b;
import p648m.p660d.p665j.C9676h;

/* renamed from: c.y.a.w.c */
/* compiled from: ExampleClient */
public class C7735c extends C9650b {

    /* renamed from: F */
    public C7736a f14511F;

    /* renamed from: c.y.a.w.c$a */
    /* compiled from: ExampleClient */
    public interface C7736a {
        void onClose(int i, String str, boolean z);

        void onError(Exception exc);

        void onMessage(String str);

        void onOpen();
    }

    public C7735c(URI uri) {
        super(uri);
    }

    /* renamed from: P */
    public void mo33240P(int i, String str, boolean z) {
        C7736a aVar = this.f14511F;
        if (aVar != null) {
            aVar.onClose(i, str, z);
        }
    }

    /* renamed from: S */
    public void mo33241S(Exception exc) {
        C7736a aVar = this.f14511F;
        if (aVar != null) {
            aVar.onError(exc);
        }
    }

    /* renamed from: T */
    public void mo33242T(String str) {
        C7736a aVar = this.f14511F;
        if (aVar != null) {
            aVar.onMessage(str);
        }
    }

    /* renamed from: V */
    public void mo33243V(C9676h hVar) {
        C7736a aVar = this.f14511F;
        if (aVar != null) {
            aVar.onOpen();
        }
    }

    public void setOnStatusChangeListener(C7736a aVar) {
        this.f14511F = aVar;
    }
}
