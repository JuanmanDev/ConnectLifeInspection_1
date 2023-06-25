package p040c.p200q.p201a.p264c.p294g.p333g;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* renamed from: c.q.a.c.g.g.q9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4714q9 {

    /* renamed from: a */
    public final SharedPreferences f9582a;

    /* renamed from: b */
    public final String f9583b = "GenericIdpKeyset";

    public C4714q9(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f9582a = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.f9582a = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    /* renamed from: a */
    public final C4773sg mo26573a() {
        return C4773sg.m13075G(mo26575c(), C4913y0.m13537a());
    }

    /* renamed from: b */
    public final C4453gi mo26574b() {
        return C4453gi.m12058J(mo26575c(), C4913y0.m13537a());
    }

    /* renamed from: c */
    public final byte[] mo26575c() {
        try {
            String string = this.f9582a.getString(this.f9583b, (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.f9583b}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i + i;
                    int digit = Character.digit(string.charAt(i2), 16);
                    int digit2 = Character.digit(string.charAt(i2 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.f9583b}));
        }
    }
}
