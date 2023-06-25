package p040c.p077d.p078a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.MemoryCategory;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040c.p077d.p078a.p080j.C1559a;
import p040c.p077d.p078a.p081k.C1572f;
import p040c.p077d.p078a.p081k.p082i.C1591k;
import p040c.p077d.p078a.p081k.p084j.C1662k;
import p040c.p077d.p078a.p081k.p084j.p085a0.C1622h;
import p040c.p077d.p078a.p081k.p084j.p087c0.C1640a;
import p040c.p077d.p078a.p081k.p084j.p088z.C1692b;
import p040c.p077d.p078a.p081k.p084j.p088z.C1697e;
import p040c.p077d.p078a.p081k.p089k.C1715a;
import p040c.p077d.p078a.p081k.p089k.C1719b;
import p040c.p077d.p078a.p081k.p089k.C1726c;
import p040c.p077d.p078a.p081k.p089k.C1727d;
import p040c.p077d.p078a.p081k.p089k.C1730e;
import p040c.p077d.p078a.p081k.p089k.C1735f;
import p040c.p077d.p078a.p081k.p089k.C1743g;
import p040c.p077d.p078a.p081k.p089k.C1749k;
import p040c.p077d.p078a.p081k.p089k.C1768s;
import p040c.p077d.p078a.p081k.p089k.C1773t;
import p040c.p077d.p078a.p081k.p089k.C1774u;
import p040c.p077d.p078a.p081k.p089k.C1778v;
import p040c.p077d.p078a.p081k.p089k.C1781w;
import p040c.p077d.p078a.p081k.p089k.C1786x;
import p040c.p077d.p078a.p081k.p089k.p090y.C1788a;
import p040c.p077d.p078a.p081k.p089k.p090y.C1790b;
import p040c.p077d.p078a.p081k.p089k.p090y.C1792c;
import p040c.p077d.p078a.p081k.p089k.p090y.C1794d;
import p040c.p077d.p078a.p081k.p089k.p090y.C1796e;
import p040c.p077d.p078a.p081k.p091l.p092c.C1800a;
import p040c.p077d.p078a.p081k.p091l.p092c.C1801b;
import p040c.p077d.p078a.p081k.p091l.p092c.C1802c;
import p040c.p077d.p078a.p081k.p091l.p092c.C1805f;
import p040c.p077d.p078a.p081k.p091l.p092c.C1809j;
import p040c.p077d.p078a.p081k.p091l.p092c.C1814k;
import p040c.p077d.p078a.p081k.p091l.p092c.C1820n;
import p040c.p077d.p078a.p081k.p091l.p092c.C1826s;
import p040c.p077d.p078a.p081k.p091l.p092c.C1828u;
import p040c.p077d.p078a.p081k.p091l.p092c.C1832w;
import p040c.p077d.p078a.p081k.p091l.p092c.C1834x;
import p040c.p077d.p078a.p081k.p091l.p093d.C1841a;
import p040c.p077d.p078a.p081k.p091l.p094e.C1847d;
import p040c.p077d.p078a.p081k.p091l.p094e.C1848e;
import p040c.p077d.p078a.p081k.p091l.p095f.C1849a;
import p040c.p077d.p078a.p081k.p091l.p096g.C1851a;
import p040c.p077d.p078a.p081k.p091l.p096g.C1855c;
import p040c.p077d.p078a.p081k.p091l.p096g.C1863g;
import p040c.p077d.p078a.p081k.p091l.p096g.C1865i;
import p040c.p077d.p078a.p081k.p091l.p097h.C1866a;
import p040c.p077d.p078a.p081k.p091l.p097h.C1867b;
import p040c.p077d.p078a.p081k.p091l.p097h.C1868c;
import p040c.p077d.p078a.p081k.p091l.p097h.C1869d;
import p040c.p077d.p078a.p098l.C1878d;
import p040c.p077d.p078a.p098l.C1886k;
import p040c.p077d.p078a.p099m.C1894c;
import p040c.p077d.p078a.p099m.C1896e;
import p040c.p077d.p078a.p101o.C1911e;
import p040c.p077d.p078a.p101o.C1912f;
import p040c.p077d.p078a.p101o.p102j.C1922e;
import p040c.p077d.p078a.p101o.p102j.C1925h;
import p040c.p077d.p078a.p105q.C1949i;
import p040c.p077d.p078a.p105q.C1950j;

/* renamed from: c.d.a.c */
/* compiled from: Glide */
public class C1541c implements ComponentCallbacks2 {

    /* renamed from: s */
    public static volatile C1541c f761s;

    /* renamed from: t */
    public static volatile boolean f762t;

    /* renamed from: e */
    public final C1697e f763e;

    /* renamed from: l */
    public final C1622h f764l;

    /* renamed from: m */
    public final C1543e f765m;

    /* renamed from: n */
    public final Registry f766n;

    /* renamed from: o */
    public final C1692b f767o;

    /* renamed from: p */
    public final C1886k f768p;

    /* renamed from: q */
    public final C1878d f769q;

    /* renamed from: r */
    public final List<C1546g> f770r = new ArrayList();

    public C1541c(@NonNull Context context, @NonNull C1662k kVar, @NonNull C1622h hVar, @NonNull C1697e eVar, @NonNull C1692b bVar, @NonNull C1886k kVar2, @NonNull C1878d dVar, int i, @NonNull C1912f fVar, @NonNull Map<Class<?>, C1549h<?, ?>> map, @NonNull List<C1911e<Object>> list, boolean z) {
        Context context2 = context;
        C1622h hVar2 = hVar;
        C1697e eVar2 = eVar;
        C1692b bVar2 = bVar;
        Class<C1559a> cls = C1559a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        MemoryCategory memoryCategory = MemoryCategory.NORMAL;
        this.f763e = eVar2;
        this.f767o = bVar2;
        this.f764l = hVar2;
        this.f768p = kVar2;
        this.f769q = dVar;
        new C1640a(hVar2, eVar2, (DecodeFormat) fVar.mo16316t().mo15616c(C1814k.f1381f));
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f766n = registry;
        registry.mo21652o(new C1809j());
        if (Build.VERSION.SDK_INT >= 27) {
            this.f766n.mo21652o(new C1820n());
        }
        List<ImageHeaderParser> g = this.f766n.mo21644g();
        C1814k kVar3 = new C1814k(g, resources.getDisplayMetrics(), eVar2, bVar2);
        C1851a aVar = new C1851a(context2, g, eVar2, bVar2);
        C1572f<ParcelFileDescriptor, Bitmap> g2 = C1834x.m2121g(eVar);
        C1805f fVar2 = new C1805f(kVar3);
        C1828u uVar = new C1828u(kVar3, bVar2);
        C1847d dVar2 = new C1847d(context2);
        C1768s.C1771c cVar = new C1768s.C1771c(resources);
        Class<byte[]> cls5 = cls4;
        C1768s.C1772d dVar3 = new C1768s.C1772d(resources);
        C1768s.C1770b bVar3 = new C1768s.C1770b(resources);
        Class<String> cls6 = cls2;
        C1768s.C1769a aVar2 = new C1768s.C1769a(resources);
        C1802c cVar2 = new C1802c(bVar2);
        C1768s.C1772d dVar4 = dVar3;
        C1866a aVar3 = new C1866a();
        C1869d dVar5 = new C1869d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry registry2 = this.f766n;
        registry2.mo21638a(ByteBuffer.class, new C1726c());
        registry2.mo21638a(InputStream.class, new C1773t(bVar2));
        registry2.mo21642e("Bitmap", ByteBuffer.class, Bitmap.class, fVar2);
        registry2.mo21642e("Bitmap", InputStream.class, Bitmap.class, uVar);
        registry2.mo21642e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, g2);
        registry2.mo21642e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C1834x.m2117c(eVar));
        registry2.mo21641d(Bitmap.class, Bitmap.class, C1778v.C1779a.m1921a());
        registry2.mo21642e("Bitmap", Bitmap.class, Bitmap.class, new C1832w());
        registry2.mo21639b(Bitmap.class, cVar2);
        registry2.mo21642e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1800a(resources, fVar2));
        registry2.mo21642e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1800a(resources, uVar));
        registry2.mo21642e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1800a(resources, g2));
        registry2.mo21639b(BitmapDrawable.class, new C1801b(eVar2, cVar2));
        registry2.mo21642e("Gif", InputStream.class, GifDrawable.class, new C1865i(g, aVar, bVar2));
        registry2.mo21642e("Gif", ByteBuffer.class, GifDrawable.class, aVar);
        registry2.mo21639b(GifDrawable.class, new C1855c());
        registry2.mo21641d(cls, cls, C1778v.C1779a.m1921a());
        registry2.mo21642e("Bitmap", cls, Bitmap.class, new C1863g(eVar2));
        registry2.mo21640c(Uri.class, Drawable.class, dVar2);
        registry2.mo21640c(Uri.class, Bitmap.class, new C1826s(dVar2, eVar2));
        registry2.mo21653p(new C1841a.C1842a());
        registry2.mo21641d(File.class, ByteBuffer.class, new C1727d.C1729b());
        registry2.mo21641d(File.class, InputStream.class, new C1735f.C1741e());
        registry2.mo21640c(File.class, File.class, new C1849a());
        registry2.mo21641d(File.class, ParcelFileDescriptor.class, new C1735f.C1737b());
        registry2.mo21641d(File.class, File.class, C1778v.C1779a.m1921a());
        registry2.mo21653p(new C1591k.C1592a(bVar2));
        C1768s.C1771c cVar3 = cVar;
        registry2.mo21641d(Integer.TYPE, InputStream.class, cVar3);
        C1768s.C1770b bVar4 = bVar3;
        registry2.mo21641d(Integer.TYPE, ParcelFileDescriptor.class, bVar4);
        Class<Integer> cls7 = cls3;
        registry2.mo21641d(cls7, InputStream.class, cVar3);
        registry2.mo21641d(cls7, ParcelFileDescriptor.class, bVar4);
        C1768s.C1772d dVar6 = dVar4;
        registry2.mo21641d(cls7, Uri.class, dVar6);
        C1768s.C1769a aVar4 = aVar2;
        registry2.mo21641d(Integer.TYPE, AssetFileDescriptor.class, aVar4);
        registry2.mo21641d(cls7, AssetFileDescriptor.class, aVar4);
        registry2.mo21641d(Integer.TYPE, Uri.class, dVar6);
        Class<String> cls8 = cls6;
        registry2.mo21641d(cls8, InputStream.class, new C1730e.C1733c());
        registry2.mo21641d(Uri.class, InputStream.class, new C1730e.C1733c());
        registry2.mo21641d(cls8, InputStream.class, new C1774u.C1777c());
        registry2.mo21641d(cls8, ParcelFileDescriptor.class, new C1774u.C1776b());
        registry2.mo21641d(cls8, AssetFileDescriptor.class, new C1774u.C1775a());
        registry2.mo21641d(Uri.class, InputStream.class, new C1790b.C1791a());
        registry2.mo21641d(Uri.class, InputStream.class, new C1715a.C1718c(context.getAssets()));
        registry2.mo21641d(Uri.class, ParcelFileDescriptor.class, new C1715a.C1717b(context.getAssets()));
        Context context3 = context;
        registry2.mo21641d(Uri.class, InputStream.class, new C1792c.C1793a(context3));
        registry2.mo21641d(Uri.class, InputStream.class, new C1794d.C1795a(context3));
        ContentResolver contentResolver2 = contentResolver;
        registry2.mo21641d(Uri.class, InputStream.class, new C1781w.C1785d(contentResolver2));
        registry2.mo21641d(Uri.class, ParcelFileDescriptor.class, new C1781w.C1783b(contentResolver2));
        registry2.mo21641d(Uri.class, AssetFileDescriptor.class, new C1781w.C1782a(contentResolver2));
        registry2.mo21641d(Uri.class, InputStream.class, new C1786x.C1787a());
        registry2.mo21641d(URL.class, InputStream.class, new C1796e.C1797a());
        registry2.mo21641d(Uri.class, File.class, new C1749k.C1750a(context3));
        registry2.mo21641d(C1743g.class, InputStream.class, new C1788a.C1789a());
        Class<byte[]> cls9 = cls5;
        registry2.mo21641d(cls9, ByteBuffer.class, new C1719b.C1720a());
        registry2.mo21641d(cls9, InputStream.class, new C1719b.C1724d());
        registry2.mo21641d(Uri.class, Uri.class, C1778v.C1779a.m1921a());
        registry2.mo21641d(Drawable.class, Drawable.class, C1778v.C1779a.m1921a());
        registry2.mo21640c(Drawable.class, Drawable.class, new C1848e());
        registry2.mo21654q(Bitmap.class, BitmapDrawable.class, new C1867b(resources));
        C1866a aVar5 = aVar3;
        registry2.mo21654q(Bitmap.class, cls9, aVar5);
        C1869d dVar7 = dVar5;
        registry2.mo21654q(Drawable.class, cls9, new C1868c(eVar2, aVar5, dVar7));
        registry2.mo21654q(GifDrawable.class, cls9, dVar7);
        this.f765m = new C1543e(context, bVar, this.f766n, new C1922e(), fVar, map, list, kVar, z, i);
    }

    /* renamed from: a */
    public static void m1092a(@NonNull Context context) {
        if (!f762t) {
            f762t = true;
            m1096n(context);
            f762t = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    @NonNull
    /* renamed from: d */
    public static C1541c m1093d(@NonNull Context context) {
        if (f761s == null) {
            synchronized (C1541c.class) {
                if (f761s == null) {
                    m1092a(context);
                }
            }
        }
        return f761s;
    }

    @Nullable
    /* renamed from: e */
    public static C1539a m1094e() {
        try {
            return (C1539a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            boolean isLoggable = Log.isLoggable("Glide", 5);
            return null;
        } catch (InstantiationException e) {
            m1098r(e);
            throw null;
        } catch (IllegalAccessException e2) {
            m1098r(e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m1098r(e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m1098r(e4);
            throw null;
        }
    }

    @NonNull
    /* renamed from: m */
    public static C1886k m1095m(@Nullable Context context) {
        C1949i.m2564e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m1093d(context).mo15456l();
    }

    /* renamed from: n */
    public static void m1096n(@NonNull Context context) {
        m1097o(context, new C1542d());
    }

    /* renamed from: o */
    public static void m1097o(@NonNull Context context, @NonNull C1542d dVar) {
        Context applicationContext = context.getApplicationContext();
        C1539a e = m1094e();
        List<C1894c> emptyList = Collections.emptyList();
        if (e == null || e.mo16237c()) {
            emptyList = new C1896e(applicationContext).mo16239a();
        }
        if (e != null && !e.mo15447d().isEmpty()) {
            Set<Class<?>> d = e.mo15447d();
            Iterator<C1894c> it = emptyList.iterator();
            while (it.hasNext()) {
                C1894c next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        "AppGlideModule excludes manifest GlideModule: " + next;
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C1894c cVar : emptyList) {
                "Discovered GlideModule from manifest: " + cVar.getClass();
            }
        }
        dVar.mo15465b(e != null ? e.mo15448e() : null);
        for (C1894c a : emptyList) {
            a.mo16236a(applicationContext, dVar);
        }
        if (e != null) {
            e.mo16236a(applicationContext, dVar);
        }
        C1541c a2 = dVar.mo15464a(applicationContext);
        for (C1894c b : emptyList) {
            b.mo16238b(applicationContext, a2, a2.f766n);
        }
        if (e != null) {
            e.mo16238b(applicationContext, a2, a2.f766n);
        }
        applicationContext.registerComponentCallbacks(a2);
        f761s = a2;
    }

    /* renamed from: r */
    public static void m1098r(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    @NonNull
    /* renamed from: u */
    public static C1546g m1099u(@NonNull Context context) {
        return m1095m(context).mo16213k(context);
    }

    @NonNull
    /* renamed from: v */
    public static C1546g m1100v(@NonNull View view) {
        return m1095m(view.getContext()).mo16214l(view);
    }

    @NonNull
    /* renamed from: w */
    public static C1546g m1101w(@NonNull FragmentActivity fragmentActivity) {
        return m1095m(fragmentActivity).mo16216n(fragmentActivity);
    }

    /* renamed from: b */
    public void mo15449b() {
        C1950j.m2565a();
        this.f764l.mo15710b();
        this.f763e.mo15921b();
        this.f767o.mo15899b();
    }

    @NonNull
    /* renamed from: f */
    public C1692b mo15450f() {
        return this.f767o;
    }

    @NonNull
    /* renamed from: g */
    public C1697e mo15451g() {
        return this.f763e;
    }

    /* renamed from: h */
    public C1878d mo15452h() {
        return this.f769q;
    }

    @NonNull
    /* renamed from: i */
    public Context mo15453i() {
        return this.f765m.getBaseContext();
    }

    @NonNull
    /* renamed from: j */
    public C1543e mo15454j() {
        return this.f765m;
    }

    @NonNull
    /* renamed from: k */
    public Registry mo15455k() {
        return this.f766n;
    }

    @NonNull
    /* renamed from: l */
    public C1886k mo15456l() {
        return this.f768p;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo15449b();
    }

    public void onTrimMemory(int i) {
        mo15462s(i);
    }

    /* renamed from: p */
    public void mo15460p(C1546g gVar) {
        synchronized (this.f770r) {
            if (!this.f770r.contains(gVar)) {
                this.f770r.add(gVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: q */
    public boolean mo15461q(@NonNull C1925h<?> hVar) {
        synchronized (this.f770r) {
            for (C1546g x : this.f770r) {
                if (x.mo15518x(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: s */
    public void mo15462s(int i) {
        C1950j.m2565a();
        this.f764l.mo15702a(i);
        this.f763e.mo15920a(i);
        this.f767o.mo15898a(i);
    }

    /* renamed from: t */
    public void mo15463t(C1546g gVar) {
        synchronized (this.f770r) {
            if (this.f770r.contains(gVar)) {
                this.f770r.remove(gVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
