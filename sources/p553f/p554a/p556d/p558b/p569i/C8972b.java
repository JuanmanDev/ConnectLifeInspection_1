package p553f.p554a.p556d.p558b.p569i;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import p553f.p554a.C8896b;
import p553f.p554a.p556d.p558b.p559e.C8928a;
import p553f.p554a.p570e.p571a.C8996b;
import p553f.p554a.p570e.p571a.C9031m;
import p630io.flutter.embedding.engine.FlutterJNI;
import p630io.flutter.view.AccessibilityBridge;

/* renamed from: f.a.d.b.i.b */
/* compiled from: AccessibilityChannel */
public class C8972b {
    @NonNull

    /* renamed from: a */
    public final C8996b<Object> f17600a;
    @NonNull

    /* renamed from: b */
    public final FlutterJNI f17601b;
    @Nullable

    /* renamed from: c */
    public C8974b f17602c;

    /* renamed from: d */
    public final C8996b.C9001d<Object> f17603d = new C8973a();

    /* renamed from: f.a.d.b.i.b$a */
    /* compiled from: AccessibilityChannel */
    public class C8973a implements C8996b.C9001d<Object> {
        public C8973a() {
        }

        /* renamed from: a */
        public void mo46510a(@Nullable Object obj, @NonNull C8996b.C9002e<Object> eVar) {
            String str;
            if (C8972b.this.f17602c != null) {
                HashMap hashMap = (HashMap) obj;
                String str2 = (String) hashMap.get("type");
                HashMap hashMap2 = (HashMap) hashMap.get("data");
                C8896b.m24032d("AccessibilityChannel", "Received " + str2 + " message.");
                char c = 65535;
                switch (str2.hashCode()) {
                    case -1140076541:
                        if (str2.equals("tooltip")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -649620375:
                        if (str2.equals("announce")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 114595:
                        if (str2.equals("tap")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 114203431:
                        if (str2.equals("longPress")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    String str3 = (String) hashMap2.get("message");
                    if (str3 != null) {
                        C8972b.this.f17602c.mo46512d(str3);
                    }
                } else if (c == 1) {
                    Integer num = (Integer) hashMap.get("nodeId");
                    if (num != null) {
                        C8972b.this.f17602c.mo46511c(num.intValue());
                    }
                } else if (c == 2) {
                    Integer num2 = (Integer) hashMap.get("nodeId");
                    if (num2 != null) {
                        C8972b.this.f17602c.mo46514f(num2.intValue());
                    }
                } else if (c == 3 && (str = (String) hashMap2.get("message")) != null) {
                    C8972b.this.f17602c.mo46513e(str);
                }
                eVar.mo46503a(null);
            }
        }
    }

    /* renamed from: f.a.d.b.i.b$b */
    /* compiled from: AccessibilityChannel */
    public interface C8974b extends FlutterJNI.C9415a {
        /* renamed from: c */
        void mo46511c(int i);

        /* renamed from: d */
        void mo46512d(@NonNull String str);

        /* renamed from: e */
        void mo46513e(@NonNull String str);

        /* renamed from: f */
        void mo46514f(int i);
    }

    public C8972b(@NonNull C8928a aVar, @NonNull FlutterJNI flutterJNI) {
        C8996b<Object> bVar = new C8996b<>(aVar, "flutter/accessibility", C9031m.f17698a);
        this.f17600a = bVar;
        bVar.mo46555e(this.f17603d);
        this.f17601b = flutterJNI;
    }

    /* renamed from: b */
    public void mo46504b(int i, @NonNull AccessibilityBridge.Action action) {
        this.f17601b.dispatchSemanticsAction(i, action);
    }

    /* renamed from: c */
    public void mo46505c(int i, @NonNull AccessibilityBridge.Action action, @Nullable Object obj) {
        this.f17601b.dispatchSemanticsAction(i, action, obj);
    }

    /* renamed from: d */
    public void mo46506d() {
        this.f17601b.setSemanticsEnabled(false);
    }

    /* renamed from: e */
    public void mo46507e() {
        this.f17601b.setSemanticsEnabled(true);
    }

    /* renamed from: f */
    public void mo46508f(int i) {
        this.f17601b.setAccessibilityFeatures(i);
    }

    /* renamed from: g */
    public void mo46509g(@Nullable C8974b bVar) {
        this.f17602c = bVar;
        this.f17601b.setAccessibilityDelegate(bVar);
    }
}
