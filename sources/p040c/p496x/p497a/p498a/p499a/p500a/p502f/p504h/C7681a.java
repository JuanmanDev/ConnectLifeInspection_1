package p040c.p496x.p497a.p498a.p499a.p500a.p502f.p504h;

import android.text.TextUtils;
import android.util.Base64;
import com.amazon.identity.auth.map.device.token.MAPCookie;
import com.facebook.stetho.dumpapp.Framer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: c.x.a.a.a.a.f.h.a */
public class C7681a {

    /* renamed from: a */
    public static volatile PublicKey f14443a;

    /* renamed from: b */
    public static final byte[] f14444b = {105, 108, 111, 118, 101, 36, 38, 104, 97, 116, 101, 119, 111, 114, 107, 44, 53, Framer.STDOUT_FRAME_PREFIX, 56};

    /* renamed from: a */
    public static String m21745a(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            try {
                String str = m21751g(hashMap) + m21748d();
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.reset();
                return Base64.encodeToString(instance.digest(str.getBytes()), 2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Map<String, String> m21746b(Map<String, String> map, Key key, String str) {
        if (!(map == null || map.isEmpty() || key == null)) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            hashMap.remove(str);
            try {
                hashMap.put(str, m21747c(m21751g(hashMap), key));
                return hashMap;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    /* renamed from: c */
    public static String m21747c(String str, Key key) {
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, key);
            MessageDigest instance2 = MessageDigest.getInstance("MD5");
            instance2.reset();
            return Base64.encodeToString(instance.doFinal(instance2.digest(str.getBytes())), 2);
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: d */
    public static String m21748d() {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(f14444b);
            return new C7684d(instance.digest()).mo33192a("222701ff322c96519c5fe52098741caba88b81f77a7d00ab80a7ed09b9b4116b559725c3c88819d3d0d81da5502ca08b");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (NoSuchPaddingException e2) {
            e2.printStackTrace();
            return null;
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvalidAlgorithmParameterException e4) {
            e4.printStackTrace();
            return null;
        } catch (IllegalBlockSizeException e5) {
            e5.printStackTrace();
            return null;
        } catch (BadPaddingException e6) {
            e6.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static PublicKey m21749e() {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAK26F0+yIWMxpW4WW7vsrwLl8kp8isCarBGv54xOK468ZD6FbOMZAOSj8JBr0IpUzv5w+hURR6W4oINsI4o5CEMCAwEAAQ==", 0)));
    }

    /* renamed from: f */
    public static PublicKey m21750f() {
        if (f14443a == null) {
            synchronized (C7681a.class) {
                if (f14443a == null) {
                    try {
                        f14443a = m21749e();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return f14443a;
    }

    /* renamed from: g */
    public static String m21751g(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            if (!TextUtils.isEmpty(str2)) {
                stringBuffer.append(str + MAPCookie.COOKIE_NAME_VALUE_SEPERATOR + str2 + "&");
            }
        }
        if (stringBuffer.length() >= 1) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }
}
