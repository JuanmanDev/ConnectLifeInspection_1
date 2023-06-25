package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p040c.p200q.p201a.p264c.p276d.p280i.C3442d;
import p040c.p200q.p201a.p264c.p276d.p281j.C3487m;
import p040c.p200q.p201a.p264c.p276d.p281j.p282u.C3514a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class WebImage extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<WebImage> CREATOR = new C3442d();

    /* renamed from: e */
    public final int f8235e;

    /* renamed from: l */
    public final Uri f8236l;

    /* renamed from: m */
    public final int f8237m;

    /* renamed from: n */
    public final int f8238n;

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.f8235e = i;
        this.f8236l = uri;
        this.f8237m = i2;
        this.f8238n = i3;
    }

    @NonNull
    /* renamed from: P */
    public Uri mo24575P() {
        return this.f8236l;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WebImage)) {
            WebImage webImage = (WebImage) obj;
            return C3487m.m8886a(this.f8236l, webImage.f8236l) && this.f8237m == webImage.f8237m && this.f8238n == webImage.f8238n;
        }
    }

    public int getHeight() {
        return this.f8238n;
    }

    public int getWidth() {
        return this.f8237m;
    }

    public int hashCode() {
        return C3487m.m8887b(this.f8236l, Integer.valueOf(this.f8237m), Integer.valueOf(this.f8238n));
    }

    @NonNull
    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f8237m), Integer.valueOf(this.f8238n), this.f8236l.toString()});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C3514a.m8952a(parcel);
        C3514a.m8963l(parcel, 1, this.f8235e);
        C3514a.m8968q(parcel, 2, mo24575P(), i, false);
        C3514a.m8963l(parcel, 3, getWidth());
        C3514a.m8963l(parcel, 4, getHeight());
        C3514a.m8953b(parcel, a);
    }

    public WebImage(@NonNull Uri uri, int i, int i2) {
        this(1, uri, i, i2);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        } else if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WebImage(@androidx.annotation.NonNull org.json.JSONObject r5) {
        /*
            r4 = this;
            android.net.Uri r0 = android.net.Uri.EMPTY
            java.lang.String r1 = "url"
            boolean r2 = r5.has(r1)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r5.getString(r1)     // Catch:{ JSONException -> 0x0012 }
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x0012 }
        L_0x0012:
            java.lang.String r1 = "width"
            r2 = 0
            int r1 = r5.optInt(r1, r2)
            java.lang.String r3 = "height"
            int r5 = r5.optInt(r3, r2)
            r4.<init>(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.images.WebImage.<init>(org.json.JSONObject):void");
    }
}
