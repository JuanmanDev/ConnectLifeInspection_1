package p040c.p200q.p201a.p264c.p276d;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p040c.p200q.p201a.p264c.p276d.p281j.C3495o;
import p040c.p200q.p201a.p264c.p276d.p281j.C3530x1;
import p040c.p200q.p201a.p264c.p276d.p281j.C3533y1;
import p040c.p200q.p201a.p264c.p292e.C3585a;
import p040c.p200q.p201a.p264c.p292e.C3587b;

/* renamed from: c.q.a.c.d.y */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class C3583y extends C3530x1 {

    /* renamed from: e */
    public final int f6564e;

    public C3583y(byte[] bArr) {
        C3495o.m8899a(bArr.length == 25);
        this.f6564e = Arrays.hashCode(bArr);
    }

    /* renamed from: g */
    public static byte[] m9117g(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final int mo20800b() {
        return this.f6564e;
    }

    /* renamed from: c */
    public final C3585a mo20801c() {
        return C3587b.m9124k(mo20383k());
    }

    public final boolean equals(@Nullable Object obj) {
        C3585a c;
        if (obj != null && (obj instanceof C3533y1)) {
            try {
                C3533y1 y1Var = (C3533y1) obj;
                if (y1Var.mo20800b() != this.f6564e || (c = y1Var.mo20801c()) == null) {
                    return false;
                }
                return Arrays.equals(mo20383k(), (byte[]) C3587b.m9123g(c));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f6564e;
    }

    /* renamed from: k */
    public abstract byte[] mo20383k();
}
