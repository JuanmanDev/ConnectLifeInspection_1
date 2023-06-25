package p040c.p200q.p201a.p219b.p235h0;

import com.google.android.exoplayer2.Format;

/* renamed from: c.q.a.b.h0.b */
/* compiled from: MetadataDecoderFactory */
public interface C2829b {

    /* renamed from: a */
    public static final C2829b f4398a = new C2830a();

    /* renamed from: c.q.a.b.h0.b$a */
    /* compiled from: MetadataDecoderFactory */
    public static class C2830a implements C2829b {
        /* renamed from: a */
        public boolean mo18899a(Format format) {
            String str = format.f7566q;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public p040c.p200q.p201a.p219b.p235h0.C2828a mo18900b(com.google.android.exoplayer2.Format r5) {
            /*
                r4 = this;
                java.lang.String r5 = r5.f7566q
                int r0 = r5.hashCode()
                r1 = -1248341703(0xffffffffb597d139, float:-1.1311269E-6)
                r2 = 2
                r3 = 1
                if (r0 == r1) goto L_0x002c
                r1 = 1154383568(0x44ce7ed0, float:1651.9629)
                if (r0 == r1) goto L_0x0022
                r1 = 1652648887(0x62816bb7, float:1.1936958E21)
                if (r0 == r1) goto L_0x0018
                goto L_0x0036
            L_0x0018:
                java.lang.String r0 = "application/x-scte35"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = r2
                goto L_0x0037
            L_0x0022:
                java.lang.String r0 = "application/x-emsg"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = r3
                goto L_0x0037
            L_0x002c:
                java.lang.String r0 = "application/id3"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0036
                r5 = 0
                goto L_0x0037
            L_0x0036:
                r5 = -1
            L_0x0037:
                if (r5 == 0) goto L_0x0051
                if (r5 == r3) goto L_0x004b
                if (r5 != r2) goto L_0x0043
                c.q.a.b.h0.h.a r5 = new c.q.a.b.h0.h.a
                r5.<init>()
                return r5
            L_0x0043:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r5.<init>(r0)
                throw r5
            L_0x004b:
                c.q.a.b.h0.f.a r5 = new c.q.a.b.h0.f.a
                r5.<init>()
                return r5
            L_0x0051:
                c.q.a.b.h0.g.b r5 = new c.q.a.b.h0.g.b
                r5.<init>()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p235h0.C2829b.C2830a.mo18900b(com.google.android.exoplayer2.Format):c.q.a.b.h0.a");
        }
    }

    /* renamed from: a */
    boolean mo18899a(Format format);

    /* renamed from: b */
    C2828a mo18900b(Format format);
}
