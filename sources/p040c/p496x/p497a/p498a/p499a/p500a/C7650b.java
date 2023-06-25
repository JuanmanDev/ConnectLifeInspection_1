package p040c.p496x.p497a.p498a.p499a.p500a;

import android.text.TextUtils;
import java.io.File;
import p040c.p496x.p497a.p498a.p499a.p500a.p502f.C7672f;
import p040c.p496x.p497a.p498a.p499a.p500a.p507i.C7708a;

/* renamed from: c.x.a.a.a.a.b */
public class C7650b {

    /* renamed from: a */
    public long f14384a = 5000;

    /* renamed from: b */
    public long f14385b = 5000;

    /* renamed from: c */
    public long f14386c = 0;

    /* renamed from: d */
    public File f14387d;

    /* renamed from: e */
    public boolean f14388e = false;

    /* renamed from: f */
    public String f14389f = "";

    /* renamed from: g */
    public File f14390g;

    /* renamed from: h */
    public C7672f.C7673a f14391h;

    /* renamed from: i */
    public boolean f14392i = true;

    public C7650b() {
    }

    /* renamed from: a */
    public C7672f.C7673a mo33085a() {
        return this.f14391h;
    }

    /* renamed from: b */
    public File mo33086b() {
        return this.f14387d;
    }

    /* renamed from: c */
    public long mo33087c() {
        return this.f14386c;
    }

    /* renamed from: d */
    public long mo33088d() {
        return this.f14385b;
    }

    /* renamed from: e */
    public String mo33089e() {
        return this.f14389f;
    }

    /* renamed from: f */
    public File mo33090f() {
        return this.f14390g;
    }

    /* renamed from: g */
    public long mo33091g() {
        return this.f14384a;
    }

    /* renamed from: h */
    public boolean mo33092h() {
        return this.f14392i;
    }

    /* renamed from: i */
    public boolean mo33093i() {
        return this.f14388e;
    }

    /* renamed from: j */
    public C7650b mo33094j(long j) {
        this.f14385b = j;
        return this;
    }

    /* renamed from: k */
    public C7650b mo33095k(boolean z) {
        this.f14392i = z;
        return this;
    }

    /* renamed from: l */
    public C7650b mo33096l(boolean z, String str, File file) {
        if (!z) {
            this.f14389f = "";
        } else if (!TextUtils.isEmpty(str)) {
            C7708a.m21818b("HTTP1.CONFIG", "deviceId = " + str);
            this.f14389f = str;
            if (file != null) {
                file.mkdirs();
            }
        } else {
            throw new IllegalArgumentException("Http dns need a real devicdId! ");
        }
        this.f14390g = file;
        this.f14388e = z;
        return this;
    }

    /* renamed from: m */
    public C7650b mo33097m(long j) {
        this.f14384a = j;
        return this;
    }

    public C7650b(C7650b bVar) {
        this.f14384a = bVar.f14384a;
        this.f14385b = bVar.f14385b;
        this.f14386c = bVar.f14386c;
        this.f14387d = bVar.f14387d;
        this.f14388e = bVar.f14388e;
        this.f14389f = bVar.f14389f;
        this.f14390g = bVar.f14390g;
        this.f14391h = bVar.f14391h;
        this.f14392i = bVar.f14392i;
    }
}
