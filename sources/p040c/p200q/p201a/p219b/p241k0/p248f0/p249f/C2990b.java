package p040c.p200q.p201a.p219b.p241k0.p248f0.p249f;

import android.net.Uri;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;

/* renamed from: c.q.a.b.k0.f0.f.b */
/* compiled from: SsUtil */
public final class C2990b {
    /* renamed from: a */
    public static Uri m6907a(Uri uri) {
        if (C3152e0.m7810l0(uri.getLastPathSegment()).matches("manifest(\\(.+\\))?")) {
            return uri;
        }
        return Uri.withAppendedPath(uri, "Manifest");
    }
}
