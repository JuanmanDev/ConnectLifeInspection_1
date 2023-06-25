package p040c.p200q.p201a.p264c.p294g.p333g;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: c.q.a.c.g.g.xj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4906xj {
    /* renamed from: a */
    public static int m13501a(EllipticCurve ellipticCurve) {
        return (m13502b(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    /* renamed from: b */
    public static BigInteger m13502b(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    /* renamed from: c */
    public static BigInteger m13503c(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) {
        BigInteger bigInteger2;
        BigInteger b = m13502b(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(b);
        if (b.signum() == 1) {
            BigInteger mod2 = mod.mod(b);
            if (mod2.equals(BigInteger.ZERO)) {
                bigInteger2 = BigInteger.ZERO;
            } else {
                BigInteger bigInteger3 = null;
                if (!b.testBit(0) || !b.testBit(1)) {
                    if (b.testBit(0) && !b.testBit(1)) {
                        BigInteger bigInteger4 = BigInteger.ONE;
                        BigInteger shiftRight = b.subtract(bigInteger4).shiftRight(1);
                        int i = 0;
                        while (true) {
                            BigInteger mod3 = bigInteger4.multiply(bigInteger4).subtract(mod2).mod(b);
                            if (mod3.equals(BigInteger.ZERO)) {
                                bigInteger2 = bigInteger4;
                                break;
                            }
                            BigInteger modPow = mod3.modPow(shiftRight, b);
                            if (modPow.add(BigInteger.ONE).equals(b)) {
                                BigInteger shiftRight2 = b.add(BigInteger.ONE).shiftRight(1);
                                BigInteger bigInteger5 = BigInteger.ONE;
                                BigInteger bigInteger6 = bigInteger4;
                                for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                    BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                    BigInteger mod4 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(b).multiply(mod3)).mod(b);
                                    BigInteger mod5 = multiply.add(multiply).mod(b);
                                    if (shiftRight2.testBit(bitLength)) {
                                        BigInteger mod6 = mod4.multiply(bigInteger4).add(mod5.multiply(mod3)).mod(b);
                                        bigInteger5 = bigInteger4.multiply(mod5).add(mod4).mod(b);
                                        bigInteger6 = mod6;
                                    } else {
                                        BigInteger bigInteger7 = mod5;
                                        bigInteger6 = mod4;
                                        bigInteger5 = bigInteger7;
                                    }
                                }
                                bigInteger3 = bigInteger6;
                            } else if (modPow.equals(BigInteger.ONE)) {
                                bigInteger4 = bigInteger4.add(BigInteger.ONE);
                                i++;
                                if (i == 128 && !b.isProbablePrime(80)) {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            } else {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                } else {
                    bigInteger3 = mod2.modPow(b.add(BigInteger.ONE).shiftRight(2), b);
                }
                if (bigInteger3 == null || bigInteger3.multiply(bigInteger3).mod(b).compareTo(mod2) == 0) {
                    bigInteger2 = bigInteger3;
                } else {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z != bigInteger2.testBit(0) ? b.subtract(bigInteger2).mod(b) : bigInteger2;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    /* renamed from: d */
    public static KeyPair m13504d(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C4958zj.f9785h.mo26891a("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    /* renamed from: e */
    public static void m13505e(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger b = m13502b(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(b) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(b) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(b).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(b))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    /* renamed from: f */
    public static void m13506f(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        m13507g(eCPublicKey, eCPrivateKey);
        m13505e(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    /* renamed from: g */
    public static void m13507g(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) {
        try {
            ECParameterSpec params = eCPublicKey.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: h */
    public static byte[] m13508h(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        m13507g(eCPublicKey, eCPrivateKey);
        ECPoint w = eCPublicKey.getW();
        m13505e(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) C4958zj.f9786i.mo26891a("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) C4958zj.f9784g.mo26891a("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(m13502b(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            m13503c(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e) {
            throw new GeneralSecurityException(e);
        }
    }

    /* renamed from: i */
    public static ECPrivateKey m13509i(int i, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) C4958zj.f9786i.mo26891a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), m13512l(i)));
    }

    /* renamed from: j */
    public static ECPublicKey m13510j(int i, byte[] bArr, byte[] bArr2) {
        ECParameterSpec l = m13512l(i);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, bArr), new BigInteger(1, bArr2));
        m13505e(eCPoint, l.getCurve());
        return (ECPublicKey) ((KeyFactory) C4958zj.f9786i.mo26891a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, l));
    }

    /* renamed from: k */
    public static ECPublicKey m13511k(ECParameterSpec eCParameterSpec, int i, byte[] bArr) {
        ECPoint eCPoint;
        EllipticCurve curve = eCParameterSpec.getCurve();
        int a = m13501a(curve);
        int i2 = i - 1;
        boolean z = false;
        if (i2 == 0) {
            int length = bArr.length;
            if (length != a + a + 1) {
                throw new GeneralSecurityException("invalid point size");
            } else if (bArr[0] == 4) {
                int i3 = a + 1;
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i3)), new BigInteger(1, Arrays.copyOfRange(bArr, i3, length)));
                m13505e(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point format");
            }
        } else if (i2 != 2) {
            BigInteger b = m13502b(curve);
            int length2 = bArr.length;
            if (length2 == a + 1) {
                byte b2 = bArr[0];
                if (b2 != 2) {
                    if (b2 == 3) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                }
                BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length2));
                if (bigInteger.signum() == -1 || bigInteger.compareTo(b) >= 0) {
                    throw new GeneralSecurityException("x is out of range");
                }
                eCPoint = new ECPoint(bigInteger, m13503c(bigInteger, z, curve));
            } else {
                throw new GeneralSecurityException("compressed point has wrong length");
            }
        } else {
            int length3 = bArr.length;
            if (length3 == a + a) {
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, a)), new BigInteger(1, Arrays.copyOfRange(bArr, a, length3)));
                m13505e(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        }
        return (ECPublicKey) ((KeyFactory) C4958zj.f9786i.mo26891a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
    }

    /* renamed from: l */
    public static ECParameterSpec m13512l(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return m13514n("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (i2 != 1) {
            return m13514n("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        return m13514n("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    /* renamed from: m */
    public static byte[] m13513m(int i, int i2, ECPoint eCPoint) {
        EllipticCurve curve = m13512l(i).getCurve();
        m13505e(eCPoint, curve);
        int a = m13501a(curve);
        int i3 = a + a + 1;
        byte[] bArr = new byte[i3];
        byte[] byteArray = eCPoint.getAffineX().toByteArray();
        byte[] byteArray2 = eCPoint.getAffineY().toByteArray();
        int length = byteArray2.length;
        System.arraycopy(byteArray2, 0, bArr, i3 - length, length);
        int length2 = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, (a + 1) - length2, length2);
        bArr[0] = 4;
        return bArr;
    }

    /* renamed from: n */
    public static ECParameterSpec m13514n(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }
}
