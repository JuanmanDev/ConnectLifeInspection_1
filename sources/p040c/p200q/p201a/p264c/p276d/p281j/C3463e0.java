package p040c.p200q.p201a.p264c.p276d.p281j;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p040c.p200q.p201a.p264c.p276d.p277g.p278l.C3381h;

/* renamed from: c.q.a.c.d.j.e0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C3463e0 implements DialogInterface.OnClickListener {
    /* renamed from: b */
    public static C3463e0 m8841b(Activity activity, @Nullable Intent intent, int i) {
        return new C3451c0(intent, activity, i);
    }

    /* renamed from: c */
    public static C3463e0 m8842c(@NonNull C3381h hVar, @Nullable Intent intent, int i) {
        return new C3459d0(intent, hVar, 2);
    }

    /* renamed from: a */
    public abstract void mo20645a();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3 = android.os.Build.FINGERPRINT.contains("generic");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r2.dismiss();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0009 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r2, int r3) {
        /*
            r1 = this;
            r1.mo20645a()     // Catch:{ ActivityNotFoundException -> 0x0009 }
            r2.dismiss()
            return
        L_0x0007:
            r3 = move-exception
            goto L_0x0016
        L_0x0009:
            java.lang.String r3 = android.os.Build.FINGERPRINT     // Catch:{ all -> 0x0007 }
            java.lang.String r0 = "generic"
            boolean r3 = r3.contains(r0)     // Catch:{ all -> 0x0007 }
            r0 = 1
            r2.dismiss()
            return
        L_0x0016:
            r2.dismiss()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p264c.p276d.p281j.C3463e0.onClick(android.content.DialogInterface, int):void");
    }
}
