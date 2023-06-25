package p553f.p554a.p556d.p558b.p569i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C9016i;
import p553f.p554a.p570e.p571a.C9017j;
import p553f.p554a.p570e.p571a.C9033n;

/* renamed from: f.a.d.b.i.f */
/* compiled from: MouseCursorChannel */
public class C8980f {
    @NonNull

    /* renamed from: a */
    public final C9017j f17622a;
    @Nullable

    /* renamed from: b */
    public C8982b f17623b;
    @NonNull

    /* renamed from: c */
    public final C9017j.C9021c f17624c = new C8981a();

    /* renamed from: f.a.d.b.i.f$a */
    /* compiled from: MouseCursorChannel */
    public class C8981a implements C9017j.C9021c {
        public C8981a() {
        }

        public void onMethodCall(@NonNull C9016i iVar, @NonNull C9017j.C9022d dVar) {
            if (C8980f.this.f17623b != null) {
                String str = iVar.f17687a;
                C8896b.m24032d("MouseCursorChannel", "Received '" + str + "' message.");
                char c = 65535;
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            c = 0;
                        }
                    }
                    if (c == 0) {
                        try {
                            C8980f.this.f17623b.mo46527a((String) ((HashMap) iVar.f17688b).get("kind"));
                            dVar.success(Boolean.TRUE);
                        } catch (Exception e) {
                            dVar.error("error", "Error when setting cursors: " + e.getMessage(), (Object) null);
                        }
                    }
                } catch (Exception e2) {
                    dVar.error("error", "Unhandled error: " + e2.getMessage(), (Object) null);
                }
            }
        }
    }

    /* renamed from: f.a.d.b.i.f$b */
    /* compiled from: MouseCursorChannel */
    public interface C8982b {
        /* renamed from: a */
        void mo46527a(@NonNull String str);
    }

    public C8980f(@NonNull C8928a aVar) {
        C9017j jVar = new C9017j(aVar, "flutter/mousecursor", C9033n.f17701b);
        this.f17622a = jVar;
        jVar.mo46575e(this.f17624c);
    }

    /* renamed from: b */
    public void mo46526b(@Nullable C8982b bVar) {
        this.f17623b = bVar;
    }
}
