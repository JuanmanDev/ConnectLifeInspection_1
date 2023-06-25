package p040c.p077d.p078a.p081k.p089k;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p089k.C1756n;

/* renamed from: c.d.a.k.k.s */
/* compiled from: ResourceLoader */
public class C1768s<Data> implements C1756n<Integer, Data> {

    /* renamed from: a */
    public final C1756n<Uri, Data> f1333a;

    /* renamed from: b */
    public final Resources f1334b;

    /* renamed from: c.d.a.k.k.s$a */
    /* compiled from: ResourceLoader */
    public static final class C1769a implements C1758o<Integer, AssetFileDescriptor> {

        /* renamed from: a */
        public final Resources f1335a;

        public C1769a(Resources resources) {
            this.f1335a = resources;
        }

        /* renamed from: b */
        public C1756n<Integer, AssetFileDescriptor> mo15978b(C1764r rVar) {
            return new C1768s(this.f1335a, rVar.mo16042d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: c.d.a.k.k.s$b */
    /* compiled from: ResourceLoader */
    public static class C1770b implements C1758o<Integer, ParcelFileDescriptor> {

        /* renamed from: a */
        public final Resources f1336a;

        public C1770b(Resources resources) {
            this.f1336a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Integer, ParcelFileDescriptor> mo15978b(C1764r rVar) {
            return new C1768s(this.f1336a, rVar.mo16042d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: c.d.a.k.k.s$c */
    /* compiled from: ResourceLoader */
    public static class C1771c implements C1758o<Integer, InputStream> {

        /* renamed from: a */
        public final Resources f1337a;

        public C1771c(Resources resources) {
            this.f1337a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Integer, InputStream> mo15978b(C1764r rVar) {
            return new C1768s(this.f1337a, rVar.mo16042d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: c.d.a.k.k.s$d */
    /* compiled from: ResourceLoader */
    public static class C1772d implements C1758o<Integer, Uri> {

        /* renamed from: a */
        public final Resources f1338a;

        public C1772d(Resources resources) {
            this.f1338a = resources;
        }

        @NonNull
        /* renamed from: b */
        public C1756n<Integer, Uri> mo15978b(C1764r rVar) {
            return new C1768s(this.f1338a, C1778v.m1918c());
        }
    }

    public C1768s(Resources resources, C1756n<Uri, Data> nVar) {
        this.f1334b = resources;
        this.f1333a = nVar;
    }

    /* renamed from: c */
    public C1756n.C1757a<Data> mo15974b(@NonNull Integer num, int i, int i2, @NonNull C1571e eVar) {
        Uri d = mo16049d(num);
        if (d == null) {
            return null;
        }
        return this.f1333a.mo15974b(d, i, i2, eVar);
    }

    @Nullable
    /* renamed from: d */
    public final Uri mo16049d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f1334b.getResourcePackageName(num.intValue()) + '/' + this.f1334b.getResourceTypeName(num.intValue()) + '/' + this.f1334b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            "Received invalid resource id: " + num;
            return null;
        }
    }

    /* renamed from: e */
    public boolean mo15973a(@NonNull Integer num) {
        return true;
    }
}
