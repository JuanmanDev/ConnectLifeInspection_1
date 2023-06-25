package p040c.p200q.p363c.p370n.p371h.p375k;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p040c.p200q.p363c.p370n.p371h.C6479f;
import p040c.p200q.p363c.p370n.p371h.p374j.C6513n;
import p040c.p200q.p363c.p370n.p371h.p375k.C6559g;

/* renamed from: c.q.c.n.h.k.h */
/* compiled from: QueueFileLogStore */
public class C6564h implements C6552c {

    /* renamed from: d */
    public static final Charset f12386d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f12387a;

    /* renamed from: b */
    public final int f12388b;

    /* renamed from: c */
    public C6559g f12389c;

    /* renamed from: c.q.c.n.h.k.h$a */
    /* compiled from: QueueFileLogStore */
    public class C6565a implements C6559g.C6563d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f12390a;

        /* renamed from: b */
        public final /* synthetic */ int[] f12391b;

        public C6565a(C6564h hVar, byte[] bArr, int[] iArr) {
            this.f12390a = bArr;
            this.f12391b = iArr;
        }

        /* renamed from: a */
        public void mo30869a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f12390a, this.f12391b[0], i);
                int[] iArr = this.f12391b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: c.q.c.n.h.k.h$b */
    /* compiled from: QueueFileLogStore */
    public static class C6566b {

        /* renamed from: a */
        public final byte[] f12392a;

        /* renamed from: b */
        public final int f12393b;

        public C6566b(byte[] bArr, int i) {
            this.f12392a = bArr;
            this.f12393b = i;
        }
    }

    public C6564h(File file, int i) {
        this.f12387a = file;
        this.f12388b = i;
    }

    /* renamed from: a */
    public void mo30827a() {
        C6513n.m18227e(this.f12389c, "There was a problem closing the Crashlytics log file.");
        this.f12389c = null;
    }

    /* renamed from: b */
    public String mo30828b() {
        byte[] c = mo30829c();
        if (c != null) {
            return new String(c, f12386d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo30829c() {
        C6566b g = mo30874g();
        if (g == null) {
            return null;
        }
        int i = g.f12393b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f12392a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo30830d() {
        mo30827a();
        this.f12387a.delete();
    }

    /* renamed from: e */
    public void mo30831e(long j, String str) {
        mo30875h();
        mo30873f(j, str);
    }

    /* renamed from: f */
    public final void mo30873f(long j, String str) {
        if (this.f12389c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f12388b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f12389c.mo30855e(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f12386d));
                while (!this.f12389c.mo30860m() && this.f12389c.mo30851A() > this.f12388b) {
                    this.f12389c.mo30865w();
                }
            } catch (IOException e) {
                C6479f.m18125f().mo30644e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    public final C6566b mo30874g() {
        if (!this.f12387a.exists()) {
            return null;
        }
        mo30875h();
        C6559g gVar = this.f12389c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.mo30851A()];
        try {
            this.f12389c.mo30859i(new C6565a(this, bArr, iArr));
        } catch (IOException e) {
            C6479f.m18125f().mo30644e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C6566b(bArr, iArr[0]);
    }

    /* renamed from: h */
    public final void mo30875h() {
        if (this.f12389c == null) {
            try {
                this.f12389c = new C6559g(this.f12387a);
            } catch (IOException e) {
                C6479f f = C6479f.m18125f();
                f.mo30644e("Could not open log file: " + this.f12387a, e);
            }
        }
    }
}
