package p040c.p200q.p201a.p219b.p235h0.p237g;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.BinaryFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.juconnect.vivino.global.UrlConstKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p040c.p200q.p201a.p219b.p235h0.C2828a;
import p040c.p200q.p201a.p219b.p235h0.C2831c;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3172s;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.h0.g.b */
/* compiled from: Id3Decoder */
public final class C2837b implements C2828a {

    /* renamed from: b */
    public static final int f4414b = C3152e0.m7764D("ID3");
    @Nullable

    /* renamed from: a */
    public final C2838a f4415a;

    /* renamed from: c.q.a.b.h0.g.b$a */
    /* compiled from: Id3Decoder */
    public interface C2838a {
        /* renamed from: a */
        boolean mo18634a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: c.q.a.b.h0.g.b$b */
    /* compiled from: Id3Decoder */
    public static final class C2839b {

        /* renamed from: a */
        public final int f4416a;

        /* renamed from: b */
        public final boolean f4417b;

        /* renamed from: c */
        public final int f4418c;

        public C2839b(int i, boolean z, int i2) {
            this.f4416a = i;
            this.f4417b = z;
            this.f4418c = i2;
        }
    }

    static {
        C2836a aVar = C2836a.f4413a;
    }

    public C2837b() {
        this((C2838a) null);
    }

    /* renamed from: b */
    public static byte[] m6061b(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C3152e0.f5824f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: d */
    public static ApicFrame m6062d(C3173t tVar, int i, int i2) {
        int i3;
        String str;
        int y = tVar.mo20032y();
        String t = m6078t(y);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        tVar.mo20015h(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + C3152e0.m7810l0(new String(bArr, 0, 3, "ISO-8859-1"));
            if (UrlConstKt.MULTIPART_TYPE_IMAGE.equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m6081w(bArr, 0);
            String l0 = C3152e0.m7810l0(new String(bArr, 0, i3, "ISO-8859-1"));
            if (l0.indexOf(47) == -1) {
                str = "image/" + l0;
            } else {
                str = l0;
            }
        }
        int i5 = i3 + 2;
        int v = m6080v(bArr, i5, y);
        return new ApicFrame(str, new String(bArr, i5, v - i5, t), bArr[i3 + 1] & 255, m6061b(bArr, v + m6077s(y), i4));
    }

    /* renamed from: e */
    public static BinaryFrame m6063e(C3173t tVar, int i, String str) {
        byte[] bArr = new byte[i];
        tVar.mo20015h(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    /* renamed from: f */
    public static ChapterFrame m6064f(C3173t tVar, int i, int i2, boolean z, int i3, @Nullable C2838a aVar) {
        C3173t tVar2 = tVar;
        int c = tVar.mo20010c();
        int w = m6081w(tVar2.f5877a, c);
        String str = new String(tVar2.f5877a, c, w - c, "ISO-8859-1");
        tVar.mo20006L(w + 1);
        int j = tVar.mo20017j();
        int j2 = tVar.mo20017j();
        long A = tVar.mo19995A();
        long j3 = A == 4294967295L ? -1 : A;
        long A2 = tVar.mo19995A();
        long j4 = A2 == 4294967295L ? -1 : A2;
        ArrayList arrayList = new ArrayList();
        int i4 = c + i;
        while (tVar.mo20010c() < i4) {
            Id3Frame i5 = m6067i(i2, tVar, z, i3, aVar);
            if (i5 != null) {
                arrayList.add(i5);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, j, j2, j3, j4, id3FrameArr);
    }

    /* renamed from: g */
    public static ChapterTocFrame m6065g(C3173t tVar, int i, int i2, boolean z, int i3, @Nullable C2838a aVar) {
        C3173t tVar2 = tVar;
        int c = tVar.mo20010c();
        int w = m6081w(tVar2.f5877a, c);
        String str = new String(tVar2.f5877a, c, w - c, "ISO-8859-1");
        tVar.mo20006L(w + 1);
        int y = tVar.mo20032y();
        boolean z2 = (y & 2) != 0;
        boolean z3 = (y & 1) != 0;
        int y2 = tVar.mo20032y();
        String[] strArr = new String[y2];
        for (int i4 = 0; i4 < y2; i4++) {
            int c2 = tVar.mo20010c();
            int w2 = m6081w(tVar2.f5877a, c2);
            strArr[i4] = new String(tVar2.f5877a, c2, w2 - c2, "ISO-8859-1");
            tVar.mo20006L(w2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c + i;
        while (tVar.mo20010c() < i5) {
            Id3Frame i6 = m6067i(i2, tVar, z, i3, aVar);
            if (i6 != null) {
                arrayList.add(i6);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    @Nullable
    /* renamed from: h */
    public static CommentFrame m6066h(C3173t tVar, int i) {
        if (i < 4) {
            return null;
        }
        int y = tVar.mo20032y();
        String t = m6078t(y);
        byte[] bArr = new byte[3];
        tVar.mo20015h(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        tVar.mo20015h(bArr2, 0, i2);
        int v = m6080v(bArr2, 0, y);
        String str2 = new String(bArr2, 0, v, t);
        int s = v + m6077s(y);
        return new CommentFrame(str, str2, m6072n(bArr2, s, m6080v(bArr2, s, y), t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    @androidx.annotation.Nullable
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame m6067i(int r19, p040c.p200q.p201a.p219b.p261o0.C3173t r20, boolean r21, int r22, @androidx.annotation.Nullable p040c.p200q.p201a.p219b.p235h0.p237g.C2837b.C2838a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.mo20032y()
            int r9 = r20.mo20032y()
            int r10 = r20.mo20032y()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.mo20032y()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.mo19997C()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.mo19997C()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.mo19996B()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.mo19999E()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.mo20011d()
            r7.mo20006L(r0)
            return r16
        L_0x0067:
            int r1 = r20.mo20010c()
            int r5 = r1 + r15
            int r1 = r20.mo20011d()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r4, r0)
            int r0 = r20.mo20011d()
            r7.mo20006L(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.mo18634a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.mo20006L(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = r1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = r1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = r1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = r1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = r1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = r1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = r1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = r1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.mo20007M(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.mo20007M(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = m6083y(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m6074p(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = m6079u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m6073o(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0221
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m6076r(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = m6079u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m6075q(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = m6071m(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = m6068j(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = m6062d(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = m6066h(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = m6064f(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = m6065g(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            com.google.android.exoplayer2.metadata.id3.MlltFrame r1 = m6070l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = m6079u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r1 = m6063e(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = m6079u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.mo20006L(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r12, r0)     // Catch:{ all -> 0x012e }
            r7.mo20006L(r14)
            return r16
        L_0x0221:
            r7.mo20006L(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r12, r0)
            r7.mo20006L(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p235h0.p237g.C2837b.m6067i(int, c.q.a.b.o0.t, boolean, int, c.q.a.b.h0.g.b$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: j */
    public static GeobFrame m6068j(C3173t tVar, int i) {
        int y = tVar.mo20032y();
        String t = m6078t(y);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        tVar.mo20015h(bArr, 0, i2);
        int w = m6081w(bArr, 0);
        String str = new String(bArr, 0, w, "ISO-8859-1");
        int i3 = w + 1;
        int v = m6080v(bArr, i3, y);
        String n = m6072n(bArr, i3, v, t);
        int s = v + m6077s(y);
        int v2 = m6080v(bArr, s, y);
        return new GeobFrame(str, n, m6072n(bArr, s, v2, t), m6061b(bArr, v2 + m6077s(y), i2));
    }

    @Nullable
    /* renamed from: k */
    public static C2839b m6069k(C3173t tVar) {
        if (tVar.mo20008a() < 10) {
            C3163m.m7880f("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        int B = tVar.mo19996B();
        if (B != f4414b) {
            C3163m.m7880f("Id3Decoder", "Unexpected first three bytes of ID3 tag header: " + B);
            return null;
        }
        int y = tVar.mo20032y();
        boolean z = true;
        tVar.mo20007M(1);
        int y2 = tVar.mo20032y();
        int x = tVar.mo20031x();
        if (y == 2) {
            if ((y2 & 64) != 0) {
                C3163m.m7880f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (y == 3) {
            if ((y2 & 64) != 0) {
                int j = tVar.mo20017j();
                tVar.mo20007M(j);
                x -= j + 4;
            }
        } else if (y == 4) {
            if ((y2 & 64) != 0) {
                int x2 = tVar.mo20031x();
                tVar.mo20007M(x2 - 4);
                x -= x2;
            }
            if ((y2 & 16) != 0) {
                x -= 10;
            }
        } else {
            C3163m.m7880f("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + y);
            return null;
        }
        if (y >= 4 || (y2 & 128) == 0) {
            z = false;
        }
        return new C2839b(y, z, x);
    }

    /* renamed from: l */
    public static MlltFrame m6070l(C3173t tVar, int i) {
        int E = tVar.mo19999E();
        int B = tVar.mo19996B();
        int B2 = tVar.mo19996B();
        int y = tVar.mo20032y();
        int y2 = tVar.mo20032y();
        C3172s sVar = new C3172s();
        sVar.mo19988k(tVar);
        int i2 = ((i - 10) * 8) / (y + y2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = sVar.mo19985h(y);
            int h2 = sVar.mo19985h(y2);
            iArr[i3] = h;
            iArr2[i3] = h2;
        }
        return new MlltFrame(E, B, B2, iArr, iArr2);
    }

    /* renamed from: m */
    public static PrivFrame m6071m(C3173t tVar, int i) {
        byte[] bArr = new byte[i];
        tVar.mo20015h(bArr, 0, i);
        int w = m6081w(bArr, 0);
        return new PrivFrame(new String(bArr, 0, w, "ISO-8859-1"), m6061b(bArr, w + 1, i));
    }

    /* renamed from: n */
    public static String m6072n(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    @Nullable
    /* renamed from: o */
    public static TextInformationFrame m6073o(C3173t tVar, int i, String str) {
        if (i < 1) {
            return null;
        }
        int y = tVar.mo20032y();
        String t = m6078t(y);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        tVar.mo20015h(bArr, 0, i2);
        return new TextInformationFrame(str, (String) null, new String(bArr, 0, m6080v(bArr, 0, y), t));
    }

    @Nullable
    /* renamed from: p */
    public static TextInformationFrame m6074p(C3173t tVar, int i) {
        if (i < 1) {
            return null;
        }
        int y = tVar.mo20032y();
        String t = m6078t(y);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        tVar.mo20015h(bArr, 0, i2);
        int v = m6080v(bArr, 0, y);
        String str = new String(bArr, 0, v, t);
        int s = v + m6077s(y);
        return new TextInformationFrame("TXXX", str, m6072n(bArr, s, m6080v(bArr, s, y), t));
    }

    /* renamed from: q */
    public static UrlLinkFrame m6075q(C3173t tVar, int i, String str) {
        byte[] bArr = new byte[i];
        tVar.mo20015h(bArr, 0, i);
        return new UrlLinkFrame(str, (String) null, new String(bArr, 0, m6081w(bArr, 0), "ISO-8859-1"));
    }

    @Nullable
    /* renamed from: r */
    public static UrlLinkFrame m6076r(C3173t tVar, int i) {
        if (i < 1) {
            return null;
        }
        int y = tVar.mo20032y();
        String t = m6078t(y);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        tVar.mo20015h(bArr, 0, i2);
        int v = m6080v(bArr, 0, y);
        String str = new String(bArr, 0, v, t);
        int s = v + m6077s(y);
        return new UrlLinkFrame("WXXX", str, m6072n(bArr, s, m6081w(bArr, s), "ISO-8859-1"));
    }

    /* renamed from: s */
    public static int m6077s(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: t */
    public static String m6078t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: u */
    public static String m6079u(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: v */
    public static int m6080v(byte[] bArr, int i, int i2) {
        int w = m6081w(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return w;
        }
        while (w < bArr.length - 1) {
            if (w % 2 == 0 && bArr[w + 1] == 0) {
                return w;
            }
            w = m6081w(bArr, w + 1);
        }
        return bArr.length;
    }

    /* renamed from: w */
    public static int m6081w(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: x */
    public static /* synthetic */ boolean m6082x(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    /* renamed from: y */
    public static int m6083y(C3173t tVar, int i) {
        byte[] bArr = tVar.f5877a;
        int c = tVar.mo20010c();
        while (true) {
            int i2 = c + 1;
            if (i2 >= i) {
                return i;
            }
            if ((bArr[c] & 255) == 255 && bArr[i2] == 0) {
                System.arraycopy(bArr, c + 2, bArr, i2, (i - c) - 2);
                i--;
            }
            c = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009d A[SYNTHETIC, Splitter:B:49:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0099 A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6084z(p040c.p200q.p201a.p219b.p261o0.C3173t r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.mo20010c()
        L_0x0008:
            int r3 = r18.mo20008a()     // Catch:{ all -> 0x00b4 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00b0
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.mo20017j()     // Catch:{ all -> 0x00b4 }
            long r8 = r18.mo19995A()     // Catch:{ all -> 0x00b4 }
            int r10 = r18.mo19999E()     // Catch:{ all -> 0x00b4 }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.mo19996B()     // Catch:{ all -> 0x00b4 }
            int r8 = r18.mo19996B()     // Catch:{ all -> 0x00b4 }
            long r8 = (long) r8
            r10 = r6
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.mo20006L(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004b
            r1.mo20006L(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007c
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = r4
            goto L_0x0074
        L_0x0073:
            r3 = r6
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x007a
        L_0x0078:
            r7 = r4
            goto L_0x008c
        L_0x007a:
            r7 = r6
            goto L_0x008c
        L_0x007c:
            if (r0 != r3) goto L_0x008a
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0084
            r3 = r4
            goto L_0x0085
        L_0x0084:
            r3 = r6
        L_0x0085:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x007a
            goto L_0x0078
        L_0x008a:
            r3 = r6
            r7 = r3
        L_0x008c:
            if (r3 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r4 = r6
        L_0x0090:
            if (r7 == 0) goto L_0x0094
            int r4 = r4 + 4
        L_0x0094:
            long r3 = (long) r4
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x009d
            r1.mo20006L(r2)
            return r6
        L_0x009d:
            int r3 = r18.mo20008a()     // Catch:{ all -> 0x00b4 }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00aa
            r1.mo20006L(r2)
            return r6
        L_0x00aa:
            int r3 = (int) r8
            r1.mo20007M(r3)     // Catch:{ all -> 0x00b4 }
            goto L_0x0008
        L_0x00b0:
            r1.mo20006L(r2)
            return r4
        L_0x00b4:
            r0 = move-exception
            r1.mo20006L(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p235h0.p237g.C2837b.m6084z(c.q.a.b.o0.t, int, int, boolean):boolean");
    }

    @Nullable
    /* renamed from: a */
    public Metadata mo18898a(C2831c cVar) {
        ByteBuffer byteBuffer = cVar.f3307m;
        return mo18908c(byteBuffer.array(), byteBuffer.limit());
    }

    @Nullable
    /* renamed from: c */
    public Metadata mo18908c(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        C3173t tVar = new C3173t(bArr, i);
        C2839b k = m6069k(tVar);
        if (k == null) {
            return null;
        }
        int c = tVar.mo20010c();
        int i2 = k.f4416a == 2 ? 6 : 10;
        int b = k.f4418c;
        if (k.f4417b) {
            b = m6083y(tVar, k.f4418c);
        }
        tVar.mo20005K(c + b);
        boolean z = false;
        if (!m6084z(tVar, k.f4416a, i2, false)) {
            if (k.f4416a != 4 || !m6084z(tVar, 4, i2, true)) {
                C3163m.m7880f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + k.f4416a);
                return null;
            }
            z = true;
        }
        while (tVar.mo20008a() >= i2) {
            Id3Frame i3 = m6067i(k.f4416a, tVar, z, i2, this.f4415a);
            if (i3 != null) {
                arrayList.add(i3);
            }
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    public C2837b(@Nullable C2838a aVar) {
        this.f4415a = aVar;
    }
}
