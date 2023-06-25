package p040c.p077d.p078a.p081k.p089k;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.InputStream;
import p040c.p077d.p078a.p081k.C1571e;
import p040c.p077d.p078a.p081k.p089k.C1756n;

/* renamed from: c.d.a.k.k.u */
/* compiled from: StringLoader */
public class C1774u<Data> implements C1756n<String, Data> {

    /* renamed from: a */
    public final C1756n<Uri, Data> f1340a;

    /* renamed from: c.d.a.k.k.u$a */
    /* compiled from: StringLoader */
    public static final class C1775a implements C1758o<String, AssetFileDescriptor> {
        /* renamed from: b */
        public C1756n<String, AssetFileDescriptor> mo15978b(@NonNull C1764r rVar) {
            return new C1774u(rVar.mo16042d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: c.d.a.k.k.u$b */
    /* compiled from: StringLoader */
    public static class C1776b implements C1758o<String, ParcelFileDescriptor> {
        @NonNull
        /* renamed from: b */
        public C1756n<String, ParcelFileDescriptor> mo15978b(@NonNull C1764r rVar) {
            return new C1774u(rVar.mo16042d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: c.d.a.k.k.u$c */
    /* compiled from: StringLoader */
    public static class C1777c implements C1758o<String, InputStream> {
        @NonNull
        /* renamed from: b */
        public C1756n<String, InputStream> mo15978b(@NonNull C1764r rVar) {
            return new C1774u(rVar.mo16042d(Uri.class, InputStream.class));
        }
    }

    public C1774u(C1756n<Uri, Data> nVar) {
        this.f1340a = nVar;
    }

    @Nullable
    /* renamed from: e */
    public static Uri m1909e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return m1910f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? m1910f(str) : parse;
    }

    /* renamed from: f */
    public static Uri m1910f(String str) {
        return Uri.fromFile(new File(str));
    }

    /* renamed from: c */
    public C1756n.C1757a<Data> mo15974b(@NonNull String str, int i, int i2, @NonNull C1571e eVar) {
        Uri e = m1909e(str);
        if (e == null || !this.f1340a.mo15973a(e)) {
            return null;
        }
        return this.f1340a.mo15974b(e, i, i2, eVar);
    }

    /* renamed from: d */
    public boolean mo15973a(@NonNull String str) {
        return true;
    }
}
