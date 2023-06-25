package com.google.android.play.core.review;

import android.app.PendingIntent;

/* compiled from: com.google.android.play:review@@2.0.1 */
public final class zza extends ReviewInfo {

    /* renamed from: e */
    public final PendingIntent f14995e;

    /* renamed from: l */
    public final boolean f14996l;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.f14995e = pendingIntent;
            this.f14996l = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    /* renamed from: a */
    public final PendingIntent mo36430a() {
        return this.f14995e;
    }

    /* renamed from: b */
    public final boolean mo36431b() {
        return this.f14996l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            return this.f14995e.equals(reviewInfo.mo36430a()) && this.f14996l == reviewInfo.mo36431b();
        }
    }

    public final int hashCode() {
        return ((this.f14995e.hashCode() ^ 1000003) * 1000003) ^ (true != this.f14996l ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f14995e.toString();
        boolean z = this.f14996l;
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + z + "}";
    }
}
