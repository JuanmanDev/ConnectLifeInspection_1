package p040c.p200q.p201a.p219b.p250l0;

import com.google.android.exoplayer2.Format;

/* renamed from: c.q.a.b.l0.f */
/* compiled from: SubtitleDecoderFactory */
public interface C3036f {

    /* renamed from: a */
    public static final C3036f f5339a = new C3037a();

    /* renamed from: c.q.a.b.l0.f$a */
    /* compiled from: SubtitleDecoderFactory */
    public static class C3037a implements C3036f {
        /* renamed from: a */
        public boolean mo19622a(Format format) {
            String str = format.f7566q;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p040c.p200q.p201a.p219b.p250l0.C3035e mo19623b(com.google.android.exoplayer2.Format r3) {
            /*
                r2 = this;
                java.lang.String r0 = r3.f7566q
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1351681404: goto L_0x0072;
                    case -1248334819: goto L_0x0067;
                    case -1026075066: goto L_0x005d;
                    case -1004728940: goto L_0x0053;
                    case 691401887: goto L_0x0049;
                    case 822864842: goto L_0x003f;
                    case 930165504: goto L_0x0035;
                    case 1566015601: goto L_0x002b;
                    case 1566016562: goto L_0x0020;
                    case 1668750253: goto L_0x0016;
                    case 1693976202: goto L_0x000b;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x007d
            L_0x000b:
                java.lang.String r1 = "application/ttml+xml"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 3
                goto L_0x007e
            L_0x0016:
                java.lang.String r1 = "application/x-subrip"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 4
                goto L_0x007e
            L_0x0020:
                java.lang.String r1 = "application/cea-708"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 8
                goto L_0x007e
            L_0x002b:
                java.lang.String r1 = "application/cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 6
                goto L_0x007e
            L_0x0035:
                java.lang.String r1 = "application/x-mp4-cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 7
                goto L_0x007e
            L_0x003f:
                java.lang.String r1 = "text/x-ssa"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 1
                goto L_0x007e
            L_0x0049:
                java.lang.String r1 = "application/x-quicktime-tx3g"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 5
                goto L_0x007e
            L_0x0053:
                java.lang.String r1 = "text/vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 0
                goto L_0x007e
            L_0x005d:
                java.lang.String r1 = "application/x-mp4-vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 2
                goto L_0x007e
            L_0x0067:
                java.lang.String r1 = "application/pgs"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 10
                goto L_0x007e
            L_0x0072:
                java.lang.String r1 = "application/dvbsubs"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x007d
                r0 = 9
                goto L_0x007e
            L_0x007d:
                r0 = -1
            L_0x007e:
                switch(r0) {
                    case 0: goto L_0x00cd;
                    case 1: goto L_0x00c5;
                    case 2: goto L_0x00bf;
                    case 3: goto L_0x00b9;
                    case 4: goto L_0x00b3;
                    case 5: goto L_0x00ab;
                    case 6: goto L_0x00a1;
                    case 7: goto L_0x00a1;
                    case 8: goto L_0x0097;
                    case 9: goto L_0x008f;
                    case 10: goto L_0x0089;
                    default: goto L_0x0081;
                }
            L_0x0081:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r3.<init>(r0)
                throw r3
            L_0x0089:
                c.q.a.b.l0.m.a r3 = new c.q.a.b.l0.m.a
                r3.<init>()
                return r3
            L_0x008f:
                c.q.a.b.l0.l.a r0 = new c.q.a.b.l0.l.a
                java.util.List<byte[]> r3 = r3.f7568s
                r0.<init>(r3)
                return r0
            L_0x0097:
                c.q.a.b.l0.k.c r0 = new c.q.a.b.l0.k.c
                int r1 = r3.f7558K
                java.util.List<byte[]> r3 = r3.f7568s
                r0.<init>(r1, r3)
                return r0
            L_0x00a1:
                c.q.a.b.l0.k.a r0 = new c.q.a.b.l0.k.a
                java.lang.String r1 = r3.f7566q
                int r3 = r3.f7558K
                r0.<init>(r1, r3)
                return r0
            L_0x00ab:
                c.q.a.b.l0.q.a r0 = new c.q.a.b.l0.q.a
                java.util.List<byte[]> r3 = r3.f7568s
                r0.<init>(r3)
                return r0
            L_0x00b3:
                c.q.a.b.l0.o.a r3 = new c.q.a.b.l0.o.a
                r3.<init>()
                return r3
            L_0x00b9:
                c.q.a.b.l0.p.a r3 = new c.q.a.b.l0.p.a
                r3.<init>()
                return r3
            L_0x00bf:
                c.q.a.b.l0.r.b r3 = new c.q.a.b.l0.r.b
                r3.<init>()
                return r3
            L_0x00c5:
                c.q.a.b.l0.n.a r0 = new c.q.a.b.l0.n.a
                java.util.List<byte[]> r3 = r3.f7568s
                r0.<init>(r3)
                return r0
            L_0x00cd:
                c.q.a.b.l0.r.g r3 = new c.q.a.b.l0.r.g
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p250l0.C3036f.C3037a.mo19623b(com.google.android.exoplayer2.Format):c.q.a.b.l0.e");
        }
    }

    /* renamed from: a */
    boolean mo19622a(Format format);

    /* renamed from: b */
    C3035e mo19623b(Format format);
}
