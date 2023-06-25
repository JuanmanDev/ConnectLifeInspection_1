package p040c.p200q.p201a.p219b.p241k0.p246e0;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p040c.p200q.p201a.p219b.p260n0.C3122h;
import p040c.p200q.p201a.p219b.p260n0.C3124i;
import p040c.p200q.p201a.p219b.p260n0.C3125j;
import p040c.p200q.p201a.p219b.p260n0.C3141v;
import p040c.p200q.p201a.p219b.p261o0.C3151e;

/* renamed from: c.q.a.b.k0.e0.c */
/* compiled from: Aes128DataSource */
public class C2942c implements C3122h {

    /* renamed from: a */
    public final C3122h f4847a;

    /* renamed from: b */
    public final byte[] f4848b;

    /* renamed from: c */
    public final byte[] f4849c;
    @Nullable

    /* renamed from: d */
    public CipherInputStream f4850d;

    public C2942c(C3122h hVar, byte[] bArr, byte[] bArr2) {
        this.f4847a = hVar;
        this.f4848b = bArr;
        this.f4849c = bArr2;
    }

    /* renamed from: b */
    public final void mo19308b(C3141v vVar) {
        this.f4847a.mo19308b(vVar);
    }

    /* renamed from: c */
    public final long mo19309c(C3125j jVar) {
        try {
            Cipher f = mo19313f();
            try {
                f.init(2, new SecretKeySpec(this.f4848b, "AES"), new IvParameterSpec(this.f4849c));
                C3124i iVar = new C3124i(this.f4847a, jVar);
                this.f4850d = new CipherInputStream(iVar, f);
                iVar.mo19886b();
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void close() {
        if (this.f4850d != null) {
            this.f4850d = null;
            this.f4847a.close();
        }
    }

    /* renamed from: d */
    public final Map<String, List<String>> mo19311d() {
        return this.f4847a.mo19311d();
    }

    @Nullable
    /* renamed from: e */
    public final Uri mo19312e() {
        return this.f4847a.mo19312e();
    }

    /* renamed from: f */
    public Cipher mo19313f() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    public final int read(byte[] bArr, int i, int i2) {
        C3151e.m7757e(this.f4850d);
        int read = this.f4850d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
