package p040c.p301y.p302b.p303a.p304s;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import com.juconnect.connectlife.ju_ble.model.BTBean;
import java.util.ArrayList;
import java.util.List;
import p040c.p301y.p302b.p303a.C3675n;

/* renamed from: c.y.b.a.s.g */
/* compiled from: BLEConnUtil */
public class C3695g {

    /* renamed from: e */
    public static C3695g f6674e;

    /* renamed from: a */
    public C3675n f6675a;

    /* renamed from: b */
    public C3700h f6676b;

    /* renamed from: c */
    public BluetoothAdapter f6677c = BluetoothAdapter.getDefaultAdapter();

    /* renamed from: d */
    public boolean f6678d = false;

    /* renamed from: c.y.b.a.s.g$a */
    /* compiled from: BLEConnUtil */
    public interface C3696a {
        /* renamed from: a */
        void mo21023a(int i, String str);

        void onSuccess();
    }

    /* renamed from: c.y.b.a.s.g$b */
    /* compiled from: BLEConnUtil */
    public interface C3697b {
        /* renamed from: a */
        void mo20941a();
    }

    /* renamed from: c.y.b.a.s.g$c */
    /* compiled from: BLEConnUtil */
    public interface C3698c {
        /* renamed from: a */
        void mo21025a();

        /* renamed from: b */
        void mo21026b(int i, String str);
    }

    /* renamed from: c.y.b.a.s.g$d */
    /* compiled from: BLEConnUtil */
    public interface C3699d {
        /* renamed from: a */
        void mo21027a(String str, String str2);

        /* renamed from: b */
        void mo21028b(int i, String str);
    }

    /* renamed from: b */
    public static C3695g m9278b() {
        synchronized (C3695g.class) {
            if (f6674e == null) {
                f6674e = new C3695g();
            }
        }
        return f6674e;
    }

    /* renamed from: a */
    public List<BTBean> mo21017a() {
        if (!this.f6678d) {
            return new ArrayList();
        }
        return this.f6676b.mo21033E();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public C3695g mo21018c(Context context) {
        if (this.f6678d) {
            this.f6676b.mo21029A();
            return m9278b();
        }
        if (!this.f6677c.isEnabled()) {
            this.f6677c.enable();
        }
        this.f6675a = C3675n.m9209b();
        C3700h I = C3700h.m9291G().mo21036I(context);
        this.f6676b = I;
        C3675n.f6621o = I;
        C3700h.f6684G = this.f6675a.mo20950c();
        if (!this.f6675a.isAlive()) {
            this.f6675a.start();
        }
        this.f6678d = true;
        return m9278b();
    }

    /* renamed from: d */
    public boolean mo21019d(String str) {
        this.f6676b.mo21047T(str);
        return true;
    }

    /* renamed from: e */
    public void mo21020e(C3697b bVar) {
        this.f6676b.mo21046S(bVar);
    }

    /* renamed from: f */
    public void mo21021f() {
        if (this.f6678d) {
            this.f6676b.mo21048U();
        }
    }

    /* renamed from: g */
    public void mo21022g() {
        "unInit:" + this.f6676b;
        C3700h hVar = this.f6676b;
        if (hVar != null) {
            hVar.mo21048U();
            this.f6676b.mo21030B();
            this.f6676b = null;
            this.f6675a = null;
            this.f6678d = false;
        }
    }
}
