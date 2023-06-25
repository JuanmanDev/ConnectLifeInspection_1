package p040c.p200q.p201a.p219b.p224f0.p229v;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.nio.ByteBuffer;
import p040c.p200q.p201a.p219b.p224f0.C2678k;
import p040c.p200q.p201a.p219b.p261o0.C3152e0;
import p040c.p200q.p201a.p219b.p261o0.C3163m;
import p040c.p200q.p201a.p219b.p261o0.C3173t;

/* renamed from: c.q.a.b.f0.v.h */
/* compiled from: MetadataUtil */
public final class C2735h {

    /* renamed from: A */
    public static final int f3861A = C3152e0.m7764D("sosn");

    /* renamed from: B */
    public static final int f3862B = C3152e0.m7764D("tvsh");

    /* renamed from: C */
    public static final int f3863C = C3152e0.m7764D("----");

    /* renamed from: D */
    public static final String[] f3864D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static final int f3865a = C3152e0.m7764D("nam");

    /* renamed from: b */
    public static final int f3866b = C3152e0.m7764D("trk");

    /* renamed from: c */
    public static final int f3867c = C3152e0.m7764D("cmt");

    /* renamed from: d */
    public static final int f3868d = C3152e0.m7764D("day");

    /* renamed from: e */
    public static final int f3869e = C3152e0.m7764D("ART");

    /* renamed from: f */
    public static final int f3870f = C3152e0.m7764D("too");

    /* renamed from: g */
    public static final int f3871g = C3152e0.m7764D("alb");

    /* renamed from: h */
    public static final int f3872h = C3152e0.m7764D("com");

    /* renamed from: i */
    public static final int f3873i = C3152e0.m7764D("wrt");

    /* renamed from: j */
    public static final int f3874j = C3152e0.m7764D("lyr");

    /* renamed from: k */
    public static final int f3875k = C3152e0.m7764D("gen");

    /* renamed from: l */
    public static final int f3876l = C3152e0.m7764D("covr");

    /* renamed from: m */
    public static final int f3877m = C3152e0.m7764D("gnre");

    /* renamed from: n */
    public static final int f3878n = C3152e0.m7764D("grp");

    /* renamed from: o */
    public static final int f3879o = C3152e0.m7764D("disk");

    /* renamed from: p */
    public static final int f3880p = C3152e0.m7764D("trkn");

    /* renamed from: q */
    public static final int f3881q = C3152e0.m7764D("tmpo");

    /* renamed from: r */
    public static final int f3882r = C3152e0.m7764D("cpil");

    /* renamed from: s */
    public static final int f3883s = C3152e0.m7764D("aART");

    /* renamed from: t */
    public static final int f3884t = C3152e0.m7764D("sonm");

    /* renamed from: u */
    public static final int f3885u = C3152e0.m7764D("soal");

    /* renamed from: v */
    public static final int f3886v = C3152e0.m7764D("soar");

    /* renamed from: w */
    public static final int f3887w = C3152e0.m7764D("soaa");

    /* renamed from: x */
    public static final int f3888x = C3152e0.m7764D("soco");

    /* renamed from: y */
    public static final int f3889y = C3152e0.m7764D("rtng");

    /* renamed from: z */
    public static final int f3890z = C3152e0.m7764D("pgap");

    /* renamed from: a */
    public static Format m5560a(int i, Format format, @Nullable Metadata metadata, @Nullable Metadata metadata2, C2678k kVar) {
        if (i == 1) {
            if (kVar.mo18555a()) {
                format = format.mo23916d(kVar.f3426a, kVar.f3427b);
            }
            if (metadata != null) {
                return format.mo23921g(metadata);
            }
            return format;
        } else if (i != 2 || metadata2 == null) {
            return format;
        } else {
            for (int i2 = 0; i2 < metadata2.mo24053b(); i2++) {
                Metadata.Entry a = metadata2.mo24052a(i2);
                if (a instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) a;
                    if ("com.android.capture.fps".equals(mdtaMetadataEntry.f7666e) && mdtaMetadataEntry.f7669n == 23) {
                        try {
                            format = format.mo23915c(ByteBuffer.wrap(mdtaMetadataEntry.f7667l).asFloatBuffer().get()).mo23921g(new Metadata(mdtaMetadataEntry));
                        } catch (NumberFormatException unused) {
                            C3163m.m7880f("MetadataUtil", "Ignoring invalid framerate");
                        }
                    }
                }
            }
            return format;
        }
    }

    @Nullable
    /* renamed from: b */
    public static CommentFrame m5561b(int i, C3173t tVar) {
        int j = tVar.mo20017j();
        if (tVar.mo20017j() == C2718c.f3679G0) {
            tVar.mo20007M(8);
            String t = tVar.mo20027t(j - 16);
            return new CommentFrame("und", t, t);
        }
        C3163m.m7880f("MetadataUtil", "Failed to parse comment attribute: " + C2718c.m5465a(i));
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static ApicFrame m5562c(C3173t tVar) {
        int j = tVar.mo20017j();
        if (tVar.mo20017j() == C2718c.f3679G0) {
            int b = C2718c.m5466b(tVar.mo20017j());
            String str = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str == null) {
                C3163m.m7880f("MetadataUtil", "Unrecognized cover art flags: " + b);
                return null;
            }
            tVar.mo20007M(4);
            int i = j - 16;
            byte[] bArr = new byte[i];
            tVar.mo20015h(bArr, 0, i);
            return new ApicFrame(str, (String) null, 3, bArr);
        }
        C3163m.m7880f("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    @Nullable
    /* renamed from: d */
    public static Metadata.Entry m5563d(C3173t tVar) {
        int c = tVar.mo20010c() + tVar.mo20017j();
        int j = tVar.mo20017j();
        int i = (j >> 24) & 255;
        if (i == 169 || i == 253) {
            int i2 = 16777215 & j;
            if (i2 == f3867c) {
                CommentFrame b = m5561b(j, tVar);
                tVar.mo20006L(c);
                return b;
            }
            if (i2 != f3865a) {
                if (i2 != f3866b) {
                    if (i2 != f3872h) {
                        if (i2 != f3873i) {
                            if (i2 == f3868d) {
                                TextInformationFrame i3 = m5568i(j, "TDRC", tVar);
                                tVar.mo20006L(c);
                                return i3;
                            } else if (i2 == f3869e) {
                                TextInformationFrame i4 = m5568i(j, "TPE1", tVar);
                                tVar.mo20006L(c);
                                return i4;
                            } else if (i2 == f3870f) {
                                TextInformationFrame i5 = m5568i(j, "TSSE", tVar);
                                tVar.mo20006L(c);
                                return i5;
                            } else if (i2 == f3871g) {
                                TextInformationFrame i6 = m5568i(j, "TALB", tVar);
                                tVar.mo20006L(c);
                                return i6;
                            } else if (i2 == f3874j) {
                                TextInformationFrame i7 = m5568i(j, "USLT", tVar);
                                tVar.mo20006L(c);
                                return i7;
                            } else if (i2 == f3875k) {
                                TextInformationFrame i8 = m5568i(j, "TCON", tVar);
                                tVar.mo20006L(c);
                                return i8;
                            } else if (i2 == f3878n) {
                                TextInformationFrame i9 = m5568i(j, "TIT1", tVar);
                                tVar.mo20006L(c);
                                return i9;
                            }
                        }
                    }
                    TextInformationFrame i10 = m5568i(j, "TCOM", tVar);
                    tVar.mo20006L(c);
                    return i10;
                }
            }
            TextInformationFrame i11 = m5568i(j, "TIT2", tVar);
            tVar.mo20006L(c);
            return i11;
        }
        try {
            if (j == f3877m) {
                return m5567h(tVar);
            }
            if (j == f3879o) {
                TextInformationFrame e = m5564e(j, "TPOS", tVar);
                tVar.mo20006L(c);
                return e;
            } else if (j == f3880p) {
                TextInformationFrame e2 = m5564e(j, "TRCK", tVar);
                tVar.mo20006L(c);
                return e2;
            } else if (j == f3881q) {
                Id3Frame j2 = m5569j(j, "TBPM", tVar, true, false);
                tVar.mo20006L(c);
                return j2;
            } else if (j == f3882r) {
                Id3Frame j3 = m5569j(j, "TCMP", tVar, true, true);
                tVar.mo20006L(c);
                return j3;
            } else if (j == f3876l) {
                ApicFrame c2 = m5562c(tVar);
                tVar.mo20006L(c);
                return c2;
            } else if (j == f3883s) {
                TextInformationFrame i12 = m5568i(j, "TPE2", tVar);
                tVar.mo20006L(c);
                return i12;
            } else if (j == f3884t) {
                TextInformationFrame i13 = m5568i(j, "TSOT", tVar);
                tVar.mo20006L(c);
                return i13;
            } else if (j == f3885u) {
                TextInformationFrame i14 = m5568i(j, "TSO2", tVar);
                tVar.mo20006L(c);
                return i14;
            } else if (j == f3886v) {
                TextInformationFrame i15 = m5568i(j, "TSOA", tVar);
                tVar.mo20006L(c);
                return i15;
            } else if (j == f3887w) {
                TextInformationFrame i16 = m5568i(j, "TSOP", tVar);
                tVar.mo20006L(c);
                return i16;
            } else if (j == f3888x) {
                TextInformationFrame i17 = m5568i(j, "TSOC", tVar);
                tVar.mo20006L(c);
                return i17;
            } else if (j == f3889y) {
                Id3Frame j4 = m5569j(j, "ITUNESADVISORY", tVar, false, false);
                tVar.mo20006L(c);
                return j4;
            } else if (j == f3890z) {
                Id3Frame j5 = m5569j(j, "ITUNESGAPLESS", tVar, false, true);
                tVar.mo20006L(c);
                return j5;
            } else if (j == f3861A) {
                TextInformationFrame i18 = m5568i(j, "TVSHOWSORT", tVar);
                tVar.mo20006L(c);
                return i18;
            } else if (j == f3862B) {
                TextInformationFrame i19 = m5568i(j, "TVSHOW", tVar);
                tVar.mo20006L(c);
                return i19;
            } else if (j == f3863C) {
                Id3Frame f = m5565f(tVar, c);
                tVar.mo20006L(c);
                return f;
            }
        } finally {
            tVar.mo20006L(c);
        }
        C3163m.m7876b("MetadataUtil", "Skipped unknown metadata entry: " + C2718c.m5465a(j));
        tVar.mo20006L(c);
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static TextInformationFrame m5564e(int i, String str, C3173t tVar) {
        int j = tVar.mo20017j();
        if (tVar.mo20017j() == C2718c.f3679G0 && j >= 22) {
            tVar.mo20007M(10);
            int E = tVar.mo19999E();
            if (E > 0) {
                String str2 = "" + E;
                int E2 = tVar.mo19999E();
                if (E2 > 0) {
                    str2 = str2 + "/" + E2;
                }
                return new TextInformationFrame(str, (String) null, str2);
            }
        }
        C3163m.m7880f("MetadataUtil", "Failed to parse index/count attribute: " + C2718c.m5465a(i));
        return null;
    }

    @Nullable
    /* renamed from: f */
    public static Id3Frame m5565f(C3173t tVar, int i) {
        int i2 = -1;
        int i3 = -1;
        String str = null;
        String str2 = null;
        while (tVar.mo20010c() < i) {
            int c = tVar.mo20010c();
            int j = tVar.mo20017j();
            int j2 = tVar.mo20017j();
            tVar.mo20007M(4);
            if (j2 == C2718c.f3675E0) {
                str = tVar.mo20027t(j - 12);
            } else if (j2 == C2718c.f3677F0) {
                str2 = tVar.mo20027t(j - 12);
            } else {
                if (j2 == C2718c.f3679G0) {
                    i2 = c;
                    i3 = j;
                }
                tVar.mo20007M(j - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        tVar.mo20006L(i2);
        tVar.mo20007M(16);
        return new InternalFrame(str, str2, tVar.mo20027t(i3 - 16));
    }

    @Nullable
    /* renamed from: g */
    public static MdtaMetadataEntry m5566g(C3173t tVar, int i, String str) {
        while (true) {
            int c = tVar.mo20010c();
            if (c >= i) {
                return null;
            }
            int j = tVar.mo20017j();
            if (tVar.mo20017j() == C2718c.f3679G0) {
                int j2 = tVar.mo20017j();
                int j3 = tVar.mo20017j();
                int i2 = j - 16;
                byte[] bArr = new byte[i2];
                tVar.mo20015h(bArr, 0, i2);
                return new MdtaMetadataEntry(str, bArr, j3, j2);
            }
            tVar.mo20006L(c + j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    @androidx.annotation.Nullable
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame m5567h(p040c.p200q.p201a.p219b.p261o0.C3173t r3) {
        /*
            int r3 = m5570k(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = f3864D
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p040c.p200q.p201a.p219b.p261o0.C3163m.m7880f(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c.p200q.p201a.p219b.p224f0.p229v.C2735h.m5567h(c.q.a.b.o0.t):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    @Nullable
    /* renamed from: i */
    public static TextInformationFrame m5568i(int i, String str, C3173t tVar) {
        int j = tVar.mo20017j();
        if (tVar.mo20017j() == C2718c.f3679G0) {
            tVar.mo20007M(8);
            return new TextInformationFrame(str, (String) null, tVar.mo20027t(j - 16));
        }
        C3163m.m7880f("MetadataUtil", "Failed to parse text attribute: " + C2718c.m5465a(i));
        return null;
    }

    @Nullable
    /* renamed from: j */
    public static Id3Frame m5569j(int i, String str, C3173t tVar, boolean z, boolean z2) {
        int k = m5570k(tVar);
        if (z2) {
            k = Math.min(1, k);
        }
        if (k < 0) {
            C3163m.m7880f("MetadataUtil", "Failed to parse uint8 attribute: " + C2718c.m5465a(i));
            return null;
        } else if (z) {
            return new TextInformationFrame(str, (String) null, Integer.toString(k));
        } else {
            return new CommentFrame("und", str, Integer.toString(k));
        }
    }

    /* renamed from: k */
    public static int m5570k(C3173t tVar) {
        tVar.mo20007M(4);
        if (tVar.mo20017j() == C2718c.f3679G0) {
            tVar.mo20007M(8);
            return tVar.mo20032y();
        }
        C3163m.m7880f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
