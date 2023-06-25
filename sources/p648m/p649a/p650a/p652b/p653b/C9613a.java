package p648m.p649a.p650a.p652b.p653b;

import java.util.Random;

/* renamed from: m.a.a.b.b.a */
/* compiled from: B64 */
public class C9613a {
    /* renamed from: a */
    public static void m25802a(byte b, byte b2, byte b3, int i, StringBuilder sb) {
        int i2 = ((b << 16) & 16777215) | ((b2 << 8) & 65535) | (b3 & 255);
        while (true) {
            int i3 = i - 1;
            if (i > 0) {
                sb.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(i2 & 63));
                i2 >>= 6;
                i = i3;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static String m25803b(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 1; i2 <= i; i2++) {
            sb.append("./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(new Random().nextInt(64)));
        }
        return sb.toString();
    }
}
