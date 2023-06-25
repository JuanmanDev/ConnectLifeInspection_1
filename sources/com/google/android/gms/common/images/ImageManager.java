package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.base.zak;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p040c.p200q.p201a.p264c.p276d.p280i.C3439a;
import p040c.p200q.p201a.p264c.p276d.p280i.C3441c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class ImageManager {

    /* renamed from: h */
    public static final Object f8223h = new Object();

    /* renamed from: i */
    public static HashSet<Uri> f8224i = new HashSet<>();

    /* renamed from: a */
    public final Context f8225a;

    /* renamed from: b */
    public final Handler f8226b;

    /* renamed from: c */
    public final ExecutorService f8227c;

    /* renamed from: d */
    public final zak f8228d;

    /* renamed from: e */
    public final Map<C3441c, ImageReceiver> f8229e;

    /* renamed from: f */
    public final Map<Uri, ImageReceiver> f8230f;

    /* renamed from: g */
    public final Map<Uri, Long> f8231g;

    @KeepName
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: e */
        public final Uri f8232e;

        /* renamed from: l */
        public final ArrayList<C3441c> f8233l;

        /* renamed from: m */
        public final /* synthetic */ ImageManager f8234m;

        public final void onReceiveResult(int i, Bundle bundle) {
            ImageManager imageManager = this.f8234m;
            imageManager.f8227c.execute(new C3439a(imageManager, this.f8232e, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }
}
