package p040c.p200q.p201a.p264c.p294g.p333g;

import java.security.InvalidKeyException;
import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c.q.a.c.g.g.sk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C4777sk {
    /* renamed from: a */
    public static byte[] m13084a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = copyOf[31] & ByteCompanionObject.MAX_VALUE;
            copyOf[31] = (byte) b;
            copyOf[31] = (byte) (b | 64);
            int i = C4776sj.f9618b;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & ByteCompanionObject.MAX_VALUE);
                int i2 = 0;
                while (i2 < 7) {
                    if (!C4724qj.m12935b(C4776sj.f9617a[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(C4509ik.m12176a(C4776sj.f9617a[i2])));
                    }
                }
                long[] k = C4482hk.m12119k(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                int i3 = 10;
                System.arraycopy(k, 0, jArr2, 0, 10);
                int i4 = 0;
                int i5 = 32;
                while (i4 < i5) {
                    byte b2 = copyOf[(32 - i4) - 1] & 255;
                    int i6 = 0;
                    while (i6 < 8) {
                        int i7 = (b2 >> (7 - i6)) & 1;
                        C4776sj.m13083a(jArr4, jArr2, i7);
                        C4776sj.m13083a(jArr5, jArr3, i7);
                        byte[] bArr5 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b3 = b2;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i8 = i4;
                        long[] jArr12 = new long[19];
                        int i9 = i6;
                        long[] jArr13 = new long[19];
                        int i10 = i7;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        C4482hk.m12117i(jArr4, jArr4, jArr5);
                        C4482hk.m12116h(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        C4482hk.m12117i(jArr2, jArr2, jArr3);
                        C4482hk.m12116h(jArr3, copyOf4, jArr3);
                        C4482hk.m12110b(jArr13, jArr2, jArr5);
                        C4482hk.m12110b(jArr14, jArr4, jArr3);
                        C4482hk.m12113e(jArr13);
                        C4482hk.m12112d(jArr13);
                        C4482hk.m12113e(jArr14);
                        C4482hk.m12112d(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        C4482hk.m12117i(jArr13, jArr13, jArr14);
                        C4482hk.m12116h(jArr14, copyOf4, jArr14);
                        C4482hk.m12115g(jArr17, jArr13);
                        C4482hk.m12115g(jArr16, jArr14);
                        C4482hk.m12110b(jArr14, jArr16, k);
                        C4482hk.m12113e(jArr14);
                        C4482hk.m12112d(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        C4482hk.m12115g(jArr11, jArr4);
                        C4482hk.m12115g(jArr12, jArr5);
                        C4482hk.m12110b(jArr8, jArr11, jArr12);
                        C4482hk.m12113e(jArr8);
                        C4482hk.m12112d(jArr8);
                        C4482hk.m12116h(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        C4482hk.m12114f(jArr19, jArr12, 121665);
                        C4482hk.m12112d(jArr19);
                        C4482hk.m12117i(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        C4482hk.m12110b(jArr20, jArr12, jArr19);
                        C4482hk.m12113e(jArr20);
                        C4482hk.m12112d(jArr20);
                        int i11 = i10;
                        C4776sj.m13083a(jArr8, jArr6, i11);
                        C4776sj.m13083a(jArr20, jArr7, i11);
                        i6 = i9 + 1;
                        byte[] bArr6 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b2 = b3;
                        jArr = jArr10;
                        i4 = i8;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr5;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr7 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i4++;
                    byte[] bArr8 = bArr2;
                    copyOf = bArr7;
                    i5 = 32;
                    i3 = 10;
                }
                long[] jArr26 = jArr;
                int i12 = i3;
                long[] jArr27 = new long[i12];
                long[] jArr28 = new long[i12];
                long[] jArr29 = new long[i12];
                long[] jArr30 = new long[i12];
                long[] jArr31 = new long[i12];
                long[] jArr32 = new long[i12];
                long[] jArr33 = new long[i12];
                long[] jArr34 = new long[i12];
                long[] jArr35 = new long[i12];
                long[] jArr36 = new long[i12];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[i12];
                C4482hk.m12115g(jArr28, jArr5);
                C4482hk.m12115g(jArr38, jArr28);
                C4482hk.m12115g(jArr36, jArr38);
                C4482hk.m12109a(jArr29, jArr36, jArr5);
                C4482hk.m12109a(jArr30, jArr29, jArr28);
                C4482hk.m12115g(jArr36, jArr30);
                C4482hk.m12109a(jArr31, jArr36, jArr29);
                C4482hk.m12115g(jArr36, jArr31);
                C4482hk.m12115g(jArr38, jArr36);
                C4482hk.m12115g(jArr36, jArr38);
                C4482hk.m12115g(jArr38, jArr36);
                C4482hk.m12115g(jArr36, jArr38);
                C4482hk.m12109a(jArr32, jArr36, jArr31);
                C4482hk.m12115g(jArr36, jArr32);
                C4482hk.m12115g(jArr38, jArr36);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    C4482hk.m12115g(jArr36, jArr38);
                    C4482hk.m12115g(jArr38, jArr36);
                }
                C4482hk.m12109a(jArr33, jArr38, jArr32);
                C4482hk.m12115g(jArr36, jArr33);
                C4482hk.m12115g(jArr38, jArr36);
                for (int i14 = 2; i14 < 20; i14 += 2) {
                    C4482hk.m12115g(jArr36, jArr38);
                    C4482hk.m12115g(jArr38, jArr36);
                }
                C4482hk.m12109a(jArr36, jArr38, jArr33);
                C4482hk.m12115g(jArr38, jArr36);
                C4482hk.m12115g(jArr36, jArr38);
                for (int i15 = 2; i15 < 10; i15 += 2) {
                    C4482hk.m12115g(jArr38, jArr36);
                    C4482hk.m12115g(jArr36, jArr38);
                }
                C4482hk.m12109a(jArr34, jArr36, jArr32);
                C4482hk.m12115g(jArr36, jArr34);
                C4482hk.m12115g(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    C4482hk.m12115g(jArr36, jArr38);
                    C4482hk.m12115g(jArr38, jArr36);
                }
                C4482hk.m12109a(jArr35, jArr38, jArr34);
                C4482hk.m12115g(jArr38, jArr35);
                C4482hk.m12115g(jArr36, jArr38);
                for (int i17 = 2; i17 < 100; i17 += 2) {
                    C4482hk.m12115g(jArr38, jArr36);
                    C4482hk.m12115g(jArr36, jArr38);
                }
                C4482hk.m12109a(jArr38, jArr36, jArr35);
                C4482hk.m12115g(jArr36, jArr38);
                C4482hk.m12115g(jArr38, jArr36);
                for (int i18 = 2; i18 < 50; i18 += 2) {
                    C4482hk.m12115g(jArr36, jArr38);
                    C4482hk.m12115g(jArr38, jArr36);
                }
                C4482hk.m12109a(jArr36, jArr38, jArr34);
                C4482hk.m12115g(jArr38, jArr36);
                C4482hk.m12115g(jArr36, jArr38);
                C4482hk.m12115g(jArr38, jArr36);
                C4482hk.m12115g(jArr36, jArr38);
                C4482hk.m12115g(jArr38, jArr36);
                C4482hk.m12109a(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                C4482hk.m12109a(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                C4482hk.m12109a(jArr40, k, jArr39);
                C4482hk.m12117i(jArr41, k, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                C4482hk.m12117i(jArr43, jArr41, jArr45);
                C4482hk.m12109a(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                C4482hk.m12117i(jArr43, jArr43, jArr46);
                C4482hk.m12109a(jArr43, jArr43, jArr40);
                C4482hk.m12109a(jArr43, jArr43, jArr46);
                C4482hk.m12114f(jArr42, jArr43, 4);
                C4482hk.m12112d(jArr42);
                C4482hk.m12109a(jArr43, jArr40, jArr3);
                C4482hk.m12116h(jArr43, jArr43, jArr3);
                C4482hk.m12109a(jArr44, jArr41, jArr46);
                C4482hk.m12117i(jArr43, jArr43, jArr44);
                C4482hk.m12115g(jArr43, jArr43);
                if (C4724qj.m12935b(C4482hk.m12118j(jArr42), C4482hk.m12118j(jArr43))) {
                    return C4482hk.m12118j(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(C4509ik.m12176a(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    /* renamed from: b */
    public static byte[] m13085b(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return m13084a(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
