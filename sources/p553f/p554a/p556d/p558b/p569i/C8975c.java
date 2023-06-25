package p553f.p554a.p556d.p558b.p569i;

import android.os.Build;
import android.view.InputDevice;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.juconnect.vivino.global.UrlConstKt;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p553f.p554a.C8896b;
import p553f.p554a.p570e.p571a.C8996b;
import p553f.p554a.p570e.p571a.C9003c;
import p553f.p554a.p570e.p571a.C9012e;

/* renamed from: f.a.d.b.i.c */
/* compiled from: KeyEventChannel */
public class C8975c {

    /* renamed from: a */
    public C8976a f17605a;
    @NonNull

    /* renamed from: b */
    public final C8996b<Object> f17606b;

    /* renamed from: f.a.d.b.i.c$a */
    /* compiled from: KeyEventChannel */
    public interface C8976a {
        /* renamed from: a */
        void mo46307a(long j);

        /* renamed from: b */
        void mo46308b(long j);
    }

    public C8975c(@NonNull C9003c cVar) {
        this.f17606b = new C8996b<>(cVar, "flutter/keyevent", C9012e.f17685a);
    }

    /* renamed from: a */
    public C8996b.C9002e<Object> mo46515a(long j) {
        return new C8971a(this, j);
    }

    /* renamed from: b */
    public final void mo46516b(@NonNull C8977b bVar, @NonNull Map<String, Object> map) {
        map.put("flags", Integer.valueOf(bVar.f17608b));
        map.put("plainCodePoint", Integer.valueOf(bVar.f17609c));
        map.put("codePoint", Integer.valueOf(bVar.f17610d));
        map.put("keyCode", Integer.valueOf(bVar.f17611e));
        map.put("scanCode", Integer.valueOf(bVar.f17613g));
        map.put("metaState", Integer.valueOf(bVar.f17614h));
        Character ch = bVar.f17612f;
        if (ch != null) {
            map.put("character", ch.toString());
        }
        map.put("source", Integer.valueOf(bVar.f17615i));
        map.put("vendorId", Integer.valueOf(bVar.f17616j));
        map.put("productId", Integer.valueOf(bVar.f17617k));
        map.put("deviceId", Integer.valueOf(bVar.f17607a));
        map.put("repeatCount", Integer.valueOf(bVar.f17618l));
    }

    /* renamed from: c */
    public void mo46517c(@NonNull C8977b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "keydown");
        hashMap.put("keymap", UrlConstKt.APP_PLATFORM);
        mo46516b(bVar, hashMap);
        this.f17606b.mo46554d(hashMap, mo46515a(bVar.f17619m));
    }

    /* renamed from: d */
    public void mo46518d(@NonNull C8977b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "keyup");
        hashMap.put("keymap", UrlConstKt.APP_PLATFORM);
        mo46516b(bVar, hashMap);
        this.f17606b.mo46554d(hashMap, mo46515a(bVar.f17619m));
    }

    /* renamed from: e */
    public /* synthetic */ void mo46519e(long j, Object obj) {
        C8976a aVar = this.f17605a;
        if (aVar != null) {
            if (obj == null) {
                try {
                    aVar.mo46307a(j);
                } catch (JSONException e) {
                    C8896b.m24030b("KeyEventChannel", "Unable to unpack JSON message: " + e);
                    this.f17605a.mo46307a(j);
                }
            } else if (((JSONObject) obj).getBoolean("handled")) {
                this.f17605a.mo46308b(j);
            } else {
                this.f17605a.mo46307a(j);
            }
        }
    }

    /* renamed from: f */
    public void mo46520f(C8976a aVar) {
        this.f17605a = aVar;
    }

    /* renamed from: f.a.d.b.i.c$b */
    /* compiled from: KeyEventChannel */
    public static class C8977b {

        /* renamed from: a */
        public final int f17607a;

        /* renamed from: b */
        public final int f17608b;

        /* renamed from: c */
        public final int f17609c;

        /* renamed from: d */
        public final int f17610d;

        /* renamed from: e */
        public final int f17611e;
        @Nullable

        /* renamed from: f */
        public final Character f17612f;

        /* renamed from: g */
        public final int f17613g;

        /* renamed from: h */
        public final int f17614h;

        /* renamed from: i */
        public final int f17615i;

        /* renamed from: j */
        public final int f17616j;

        /* renamed from: k */
        public final int f17617k;

        /* renamed from: l */
        public final int f17618l;

        /* renamed from: m */
        public final long f17619m;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C8977b(@androidx.annotation.NonNull android.view.KeyEvent r14, @androidx.annotation.Nullable java.lang.Character r15, long r16) {
            /*
                r13 = this;
                int r1 = r14.getDeviceId()
                int r2 = r14.getFlags()
                r0 = 0
                r3 = r14
                int r4 = r14.getUnicodeChar(r0)
                int r5 = r14.getUnicodeChar()
                int r6 = r14.getKeyCode()
                int r7 = r14.getScanCode()
                int r8 = r14.getMetaState()
                int r9 = r14.getSource()
                int r10 = r14.getRepeatCount()
                r0 = r13
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r15
                r11 = r16
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p553f.p554a.p556d.p558b.p569i.C8975c.C8977b.<init>(android.view.KeyEvent, java.lang.Character, long):void");
        }

        public C8977b(int i, int i2, int i3, int i4, int i5, @Nullable Character ch, int i6, int i7, int i8, int i9, long j) {
            this.f17607a = i;
            this.f17608b = i2;
            this.f17609c = i3;
            this.f17610d = i4;
            this.f17611e = i5;
            this.f17612f = ch;
            this.f17613g = i6;
            this.f17614h = i7;
            this.f17615i = i8;
            this.f17618l = i9;
            this.f17619m = j;
            InputDevice device = InputDevice.getDevice(i);
            if (device == null) {
                this.f17616j = 0;
                this.f17617k = 0;
            } else if (Build.VERSION.SDK_INT >= 19) {
                this.f17616j = device.getVendorId();
                this.f17617k = device.getProductId();
            } else {
                this.f17616j = 0;
                this.f17617k = 0;
            }
        }
    }
}
