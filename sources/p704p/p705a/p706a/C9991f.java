package p704p.p705a.p706a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: p.a.a.f */
/* compiled from: Luban */
public class C9991f implements Handler.Callback {

    /* renamed from: e */
    public String f19441e;

    /* renamed from: l */
    public boolean f19442l;

    /* renamed from: m */
    public int f19443m;

    /* renamed from: n */
    public C9995h f19444n;

    /* renamed from: o */
    public C9994g f19445o;

    /* renamed from: p */
    public C9987b f19446p;

    /* renamed from: q */
    public List<C9989d> f19447q;

    /* renamed from: p.a.a.f$a */
    /* compiled from: Luban */
    public static class C9992a {

        /* renamed from: a */
        public Context f19448a;

        /* renamed from: b */
        public String f19449b;

        /* renamed from: c */
        public int f19450c = 100;

        /* renamed from: d */
        public C9995h f19451d;

        /* renamed from: e */
        public C9994g f19452e;

        /* renamed from: f */
        public C9987b f19453f;

        /* renamed from: g */
        public List<C9989d> f19454g;

        /* renamed from: p.a.a.f$a$a */
        /* compiled from: Luban */
        public class C9993a implements C9989d {

            /* renamed from: a */
            public final /* synthetic */ String f19455a;

            public C9993a(C9992a aVar, String str) {
                this.f19455a = str;
            }

            public String getPath() {
                return this.f19455a;
            }

            public InputStream open() {
                return new FileInputStream(this.f19455a);
            }
        }

        public C9992a(Context context) {
            this.f19448a = context;
            this.f19454g = new ArrayList();
        }

        /* renamed from: g */
        public final C9991f mo53726g() {
            return new C9991f(this, (C9990e) null);
        }

        /* renamed from: h */
        public List<File> mo53727h() {
            return mo53726g().mo53721c(this.f19448a);
        }

        /* renamed from: i */
        public C9992a mo53728i(String str) {
            this.f19454g.add(new C9993a(this, str));
            return this;
        }
    }

    public /* synthetic */ C9991f(C9992a aVar, C9990e eVar) {
        this(aVar);
    }

    /* renamed from: e */
    public static File m26739e(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            File file = new File(externalCacheDir, str);
            if (file.mkdirs() || (file.exists() && file.isDirectory())) {
                return file;
            }
            return null;
        }
        boolean isLoggable = Log.isLoggable("Luban", 6);
        return null;
    }

    /* renamed from: h */
    public static C9992a m26740h(Context context) {
        return new C9992a(context);
    }

    /* renamed from: b */
    public final File mo53720b(Context context, C9989d dVar) {
        File f = mo53723f(context, C9986a.SINGLE.mo53706c(dVar));
        C9995h hVar = this.f19444n;
        if (hVar != null) {
            f = mo53724g(context, hVar.mo53732a(dVar.getPath()));
        }
        C9987b bVar = this.f19446p;
        if (bVar != null) {
            if (!bVar.mo53714a(dVar.getPath()) || !C9986a.SINGLE.mo53711i(this.f19443m, dVar.getPath())) {
                return new File(dVar.getPath());
            }
            return new C9988c(dVar, f, this.f19442l).mo53715a();
        } else if (C9986a.SINGLE.mo53711i(this.f19443m, dVar.getPath())) {
            return new C9988c(dVar, f, this.f19442l).mo53715a();
        } else {
            return new File(dVar.getPath());
        }
    }

    /* renamed from: c */
    public final List<File> mo53721c(Context context) {
        ArrayList arrayList = new ArrayList();
        Iterator<C9989d> it = this.f19447q.iterator();
        while (it.hasNext()) {
            arrayList.add(mo53720b(context, it.next()));
            it.remove();
        }
        return arrayList;
    }

    /* renamed from: d */
    public final File mo53722d(Context context) {
        return m26739e(context, "luban_disk_cache");
    }

    /* renamed from: f */
    public final File mo53723f(Context context, String str) {
        if (TextUtils.isEmpty(this.f19441e)) {
            this.f19441e = mo53722d(context).getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19441e);
        sb.append("/");
        sb.append(System.currentTimeMillis());
        sb.append((int) (Math.random() * 1000.0d));
        if (TextUtils.isEmpty(str)) {
            str = ".jpg";
        }
        sb.append(str);
        return new File(sb.toString());
    }

    /* renamed from: g */
    public final File mo53724g(Context context, String str) {
        if (TextUtils.isEmpty(this.f19441e)) {
            this.f19441e = mo53722d(context).getAbsolutePath();
        }
        return new File(this.f19441e + "/" + str);
    }

    public boolean handleMessage(Message message) {
        C9994g gVar = this.f19445o;
        if (gVar == null) {
            return false;
        }
        int i = message.what;
        if (i == 0) {
            gVar.mo53729a((File) message.obj);
        } else if (i == 1) {
            gVar.onStart();
        } else if (i == 2) {
            gVar.onError((Throwable) message.obj);
        }
        return false;
    }

    public C9991f(C9992a aVar) {
        this.f19441e = aVar.f19449b;
        this.f19444n = aVar.f19451d;
        this.f19447q = aVar.f19454g;
        this.f19445o = aVar.f19452e;
        this.f19443m = aVar.f19450c;
        this.f19446p = aVar.f19453f;
        new Handler(Looper.getMainLooper(), this);
    }
}
