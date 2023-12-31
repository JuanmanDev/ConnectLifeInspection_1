package kotlin.experimental;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

@Metadata(mo47990d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\f\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\b\u001a\r\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\b\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\f\u001a\u0015\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\f\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\f\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\f¨\u0006\u0007"}, mo47991d2 = {"and", "", "other", "", "inv", "or", "xor", "kotlin-stdlib"}, mo47992k = 2, mo47993mv = {1, 7, 1}, mo47995xi = 48)
/* compiled from: bitwiseOperations.kt */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte and(byte b, byte b2) {
        return (byte) (b & b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final short and(short s, short s2) {
        return (short) (s & s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte inv(byte b) {
        return (byte) (~b);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final short inv(short s) {
        return (short) (~s);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    public static final byte m25752or(byte b, byte b2) {
        return (byte) (b | b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    /* renamed from: or */
    public static final short m25753or(short s, short s2) {
        return (short) (s | s2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final byte xor(byte b, byte b2) {
        return (byte) (b ^ b2);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    public static final short xor(short s, short s2) {
        return (short) (s ^ s2);
    }
}
